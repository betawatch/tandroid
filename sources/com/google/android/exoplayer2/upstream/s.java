package com.google.android.exoplayer2.upstream;

import android.os.SystemClock;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class s {
    public final /* synthetic */ u a;

    public final void a(int i10) {
        u uVar = this.a;
        synchronized (uVar) {
            int i11 = uVar.i;
            if (i11 == 0 || uVar.e) {
                if (i11 == i10) {
                    return;
                }
                uVar.i = i10;
                if (i10 != 1 && i10 != 0 && i10 != 8) {
                    uVar.l = uVar.a(i10);
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
