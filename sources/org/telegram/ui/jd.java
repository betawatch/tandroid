package org.telegram.ui;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class jd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sd b;

    public /* synthetic */ jd(sd sdVar, int i10) {
        this.a = i10;
        this.b = sdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sd sdVar = this.b;
                sdVar.j0 = true;
                sdVar.h0();
                break;
            case 1:
                sd sdVar2 = this.b;
                sdVar2.x = null;
                sdVar2.y = null;
                sdVar2.l0 = null;
                sdVar2.m0 = null;
                sdVar2.o0 = null;
                sdVar2.n0 = null;
                sdVar2.p0 = 0.0d;
                sdVar2.e0(false, true);
                sdVar2.e.h(null, null, sdVar2.s, null);
                sdVar2.h.setAnimation(sdVar2.J);
                sdVar2.J.M(0);
                break;
            case 2:
                this.b.g0(true);
                break;
            default:
                sd sdVar3 = this.b;
                sdVar3.j0 = true;
                if (sdVar3.w.length() > 0) {
                    sdVar3.d0(sdVar3.w.getText().toString());
                }
                sdVar3.h0();
                break;
        }
    }
}
