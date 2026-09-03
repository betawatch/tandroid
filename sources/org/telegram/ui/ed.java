package org.telegram.ui;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                ndVar.g0 = true;
                ndVar.h0();
                break;
            case 1:
                nd ndVar2 = this.b;
                ndVar2.x = null;
                ndVar2.y = null;
                ndVar2.i0 = null;
                ndVar2.j0 = null;
                ndVar2.l0 = null;
                ndVar2.k0 = null;
                ndVar2.m0 = 0.0d;
                ndVar2.e0(false, true);
                ndVar2.e.h(null, null, ndVar2.s, null);
                ndVar2.h.setAnimation(ndVar2.G);
                ndVar2.G.K(0);
                break;
            case 2:
                this.b.g0(true);
                break;
            default:
                nd ndVar3 = this.b;
                ndVar3.g0 = true;
                if (ndVar3.w.length() > 0) {
                    ndVar3.d0(ndVar3.w.getText().toString());
                }
                ndVar3.h0();
                break;
        }
    }
}
