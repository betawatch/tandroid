package com.google.android.exoplayer2.upstream;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class g implements m {
    private q dataSpec;
    protected boolean isNetwork;
    private int listenerCount;
    private final ArrayList<y0> listeners = new ArrayList<>(1);

    public g(boolean z10) {
        this.isNetwork = z10;
    }

    @Override // com.google.android.exoplayer2.upstream.m
    public final void addTransferListener(y0 y0Var) {
        y0Var.getClass();
        if (this.listeners.contains(y0Var)) {
            return;
        }
        this.listeners.add(y0Var);
        this.listenerCount++;
    }

    public final void bytesTransferred(int i9) {
        q qVar = this.dataSpec;
        int i10 = d5.f0.a;
        for (int i11 = 0; i11 < this.listenerCount; i11++) {
            y0 y0Var = this.listeners.get(i11);
            boolean z10 = this.isNetwork;
            u uVar = (u) y0Var;
            synchronized (uVar) {
                o8.l0 l0Var = u.n;
                if (z10 && (qVar == null || (qVar.h & 8) != 8)) {
                    uVar.h += i9;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.m
    public Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    public final void transferEnded() {
        q qVar = this.dataSpec;
        int i9 = d5.f0.a;
        for (int i10 = 0; i10 < this.listenerCount; i10++) {
            y0 y0Var = this.listeners.get(i10);
            boolean z10 = this.isNetwork;
            u uVar = (u) y0Var;
            synchronized (uVar) {
                try {
                    o8.l0 l0Var = u.n;
                    if (z10 && (qVar == null || (qVar.h & 8) != 8)) {
                        d5.a.i(uVar.f > 0);
                        uVar.d.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        int i11 = (int) (elapsedRealtime - uVar.g);
                        uVar.j += i11;
                        long j10 = uVar.k;
                        long j11 = uVar.h;
                        uVar.k = j10 + j11;
                        if (i11 > 0) {
                            uVar.c.a((j11 * 8000.0f) / i11, (int) Math.sqrt(j11));
                            if (uVar.j < 2000) {
                                if (uVar.k >= 524288) {
                                }
                                uVar.c(i11, uVar.h, uVar.l);
                                uVar.g = elapsedRealtime;
                                uVar.h = 0L;
                            }
                            uVar.l = (long) uVar.c.b();
                            FileLog.d("debug_loading: bandwidth meter (onTransferEnd), bitrate estimate = " + uVar.l);
                            uVar.c(i11, uVar.h, uVar.l);
                            uVar.g = elapsedRealtime;
                            uVar.h = 0L;
                        }
                        uVar.f--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.dataSpec = null;
    }

    public final void transferInitializing(q qVar) {
        for (int i9 = 0; i9 < this.listenerCount; i9++) {
            this.listeners.get(i9).getClass();
        }
    }

    public final void transferStarted(q qVar) {
        this.dataSpec = qVar;
        for (int i9 = 0; i9 < this.listenerCount; i9++) {
            y0 y0Var = this.listeners.get(i9);
            boolean z10 = this.isNetwork;
            u uVar = (u) y0Var;
            synchronized (uVar) {
                try {
                    o8.l0 l0Var = u.n;
                    if (z10 && (qVar == null || (qVar.h & 8) != 8)) {
                        if (uVar.f == 0) {
                            uVar.d.getClass();
                            uVar.g = SystemClock.elapsedRealtime();
                        }
                        uVar.f++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
