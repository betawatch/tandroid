package org.telegram.ui;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ed implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nd b;

    public /* synthetic */ ed(nd ndVar, int i10) {
        this.a = i10;
        this.b = ndVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nd ndVar = this.b;
                ndVar.j0 = true;
                ndVar.h0();
                break;
            case 1:
                nd ndVar2 = this.b;
                ndVar2.x = null;
                ndVar2.y = null;
                ndVar2.l0 = null;
                ndVar2.m0 = null;
                ndVar2.o0 = null;
                ndVar2.n0 = null;
                ndVar2.p0 = 0.0d;
                ndVar2.e0(false, true);
                ndVar2.e.h(null, null, ndVar2.s, null);
                ndVar2.h.setAnimation(ndVar2.J);
                ndVar2.J.M(0);
                break;
            case 2:
                this.b.g0(true);
                break;
            default:
                nd ndVar3 = this.b;
                ndVar3.j0 = true;
                if (ndVar3.w.length() > 0) {
                    ndVar3.d0(ndVar3.w.getText().toString());
                }
                ndVar3.h0();
                break;
        }
    }
}
