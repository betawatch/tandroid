package com.google.android.exoplayer2.upstream;

import android.os.SystemClock;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class s {
    public final /* synthetic */ u a;

    public final void a(int i9) {
        u uVar = this.a;
        synchronized (uVar) {
            synchronized (uVar) {
                int i10 = uVar.i;
                if (i10 == 0 || uVar.e) {
                    if (i10 == i9) {
                        return;
                    }
                    uVar.i = i9;
                    if (i9 != 1 && i9 != 0 && i9 != 8) {
                        uVar.l = uVar.a(i9);
                        uVar.d.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        uVar.c(uVar.f > 0 ? (int) (elapsedRealtime - uVar.g) : 0, uVar.h, uVar.l);
                        uVar.g = elapsedRealtime;
                        uVar.h = 0L;
                        uVar.k = 0L;
                        uVar.j = 0L;
                        w0 w0Var = uVar.c;
                        w0Var.b.clear();
                        w0Var.d = -1;
                        w0Var.e = 0;
                        w0Var.f = 0;
                    }
                }
            }
        }
    }
}
