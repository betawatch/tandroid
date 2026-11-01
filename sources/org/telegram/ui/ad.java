package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ad implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kd b;

    public /* synthetic */ ad(kd kdVar, int i10) {
        this.a = i10;
        this.b = kdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.m0(true);
                break;
            case 1:
                kd kdVar = this.b;
                kdVar.k0 = true;
                kdVar.n0();
                break;
            case 2:
                kd kdVar2 = this.b;
                kdVar2.D = null;
                kdVar2.E = null;
                kdVar2.m0 = null;
                kdVar2.n0 = null;
                kdVar2.p0 = null;
                kdVar2.o0 = null;
                kdVar2.q0 = 0.0d;
                kdVar2.k0(false, true);
                kdVar2.f.j(null, null, kdVar2.w, null);
                kdVar2.n.setAnimation(kdVar2.K);
                kdVar2.K.M(0);
                break;
            default:
                kd kdVar3 = this.b;
                kdVar3.k0 = true;
                if (kdVar3.y.length() > 0) {
                    kdVar3.j0(kdVar3.y.getText().toString());
                }
                kdVar3.n0();
                break;
        }
    }
}
