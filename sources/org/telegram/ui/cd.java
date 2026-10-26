package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nd b;

    public /* synthetic */ cd(nd ndVar, int i10) {
        this.a = i10;
        this.b = ndVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.i0(true);
                break;
            case 1:
                nd ndVar = this.b;
                ndVar.k0 = true;
                ndVar.j0();
                break;
            case 2:
                nd ndVar2 = this.b;
                ndVar2.y = null;
                ndVar2.E = null;
                ndVar2.m0 = null;
                ndVar2.n0 = null;
                ndVar2.p0 = null;
                ndVar2.o0 = null;
                ndVar2.q0 = 0.0d;
                ndVar2.g0(false, true);
                ndVar2.f.h(null, null, ndVar2.v, null);
                ndVar2.n.setAnimation(ndVar2.K);
                ndVar2.K.M(0);
                break;
            default:
                nd ndVar3 = this.b;
                ndVar3.k0 = true;
                if (ndVar3.x.length() > 0) {
                    ndVar3.f0(ndVar3.x.getText().toString());
                }
                ndVar3.j0();
                break;
        }
    }
}
