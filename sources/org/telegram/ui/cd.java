package org.telegram.ui;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ md b;

    public /* synthetic */ cd(md mdVar, int i10) {
        this.a = i10;
        this.b = mdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.h0(true);
                break;
            case 1:
                md mdVar = this.b;
                mdVar.k0 = true;
                mdVar.i0();
                break;
            case 2:
                md mdVar2 = this.b;
                mdVar2.y = null;
                mdVar2.E = null;
                mdVar2.m0 = null;
                mdVar2.n0 = null;
                mdVar2.p0 = null;
                mdVar2.o0 = null;
                mdVar2.q0 = 0.0d;
                mdVar2.f0(false, true);
                mdVar2.f.h(null, null, mdVar2.v, null);
                mdVar2.n.setAnimation(mdVar2.K);
                mdVar2.K.M(0);
                break;
            default:
                md mdVar3 = this.b;
                mdVar3.k0 = true;
                if (mdVar3.x.length() > 0) {
                    mdVar3.e0(mdVar3.x.getText().toString());
                }
                mdVar3.i0();
                break;
        }
    }
}
