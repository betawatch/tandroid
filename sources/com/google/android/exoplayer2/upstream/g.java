package com.google.android.exoplayer2.upstream;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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

    public final void bytesTransferred(int i10) {
        q qVar = this.dataSpec;
        int i11 = f5.d0.a;
        for (int i12 = 0; i12 < this.listenerCount; i12++) {
            y0 y0Var = this.listeners.get(i12);
            boolean z10 = this.isNetwork;
            u uVar = (u) y0Var;
            synchronized (uVar) {
                q8.l0 l0Var = u.n;
                if (z10 && (qVar == null || (qVar.h & 8) != 8)) {
                    uVar.h += i10;
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
        int i10 = f5.d0.a;
        for (int i11 = 0; i11 < this.listenerCount; i11++) {
            y0 y0Var = this.listeners.get(i11);
            boolean z10 = this.isNetwork;
            u uVar = (u) y0Var;
            synchronized (uVar) {
                try {
                    q8.l0 l0Var = u.n;
                    if (z10 && (qVar == null || (qVar.h & 8) != 8)) {
                        f5.a.i(uVar.f > 0);
                        uVar.d.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        int i12 = (int) (elapsedRealtime - uVar.g);
                        uVar.j += i12;
                        long j10 = uVar.k;
                        long j11 = uVar.h;
                        uVar.k = j10 + j11;
                        if (i12 > 0) {
                            uVar.c.a((j11 * 8000.0f) / i12, (int) Math.sqrt(j11));
                            if (uVar.j < 2000) {
                                if (uVar.k >= 524288) {
                                }
                                uVar.c(i12, uVar.h, uVar.l);
                                uVar.g = elapsedRealtime;
                                uVar.h = 0L;
                            }
                            uVar.l = (long) uVar.c.b();
                            FileLog.d("debug_loading: bandwidth meter (onTransferEnd), bitrate estimate = " + uVar.l);
                            uVar.c(i12, uVar.h, uVar.l);
                            uVar.g = elapsedRealtime;
                            uVar.h = 0L;
                        }
                        uVar.f--;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.dataSpec = null;
    }

    public final void transferInitializing(q qVar) {
        for (int i10 = 0; i10 < this.listenerCount; i10++) {
            this.listeners.get(i10).getClass();
        }
    }

    public final void transferStarted(q qVar) {
        this.dataSpec = qVar;
        for (int i10 = 0; i10 < this.listenerCount; i10++) {
            y0 y0Var = this.listeners.get(i10);
            boolean z10 = this.isNetwork;
            u uVar = (u) y0Var;
            synchronized (uVar) {
                try {
                    q8.l0 l0Var = u.n;
                    if (z10 && (qVar == null || (qVar.h & 8) != 8)) {
                        if (uVar.f == 0) {
                            uVar.d.getClass();
                            uVar.g = SystemClock.elapsedRealtime();
                        }
                        uVar.f++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
