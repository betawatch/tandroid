package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class tv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ iw0 b;

    public /* synthetic */ tv0(iw0 iw0Var, int i7) {
        this.a = i7;
        this.b = iw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.o1.f();
                break;
            case 1:
                this.b.o1.f();
                break;
            case 2:
                iw0 iw0Var = this.b;
                iw0Var.dismiss();
                org.telegram.messenger.ri.d0(iw0Var.a).k2(iw0Var.getContext(), iw0Var.N1, 1, iw0Var.G1, false, false);
                break;
            case 3:
                iw0 iw0Var2 = this.b;
                org.telegram.messenger.mp.u1(iw0Var2.a).F3("stickers", iw0Var2.G1, 1, null);
                break;
            default:
                iw0 iw0Var3 = this.b;
                iw0Var3.dismiss();
                org.telegram.messenger.ri.d0(iw0Var3.a).k2(iw0Var3.getContext(), iw0Var3.N1, 1, iw0Var3.G1, false, false);
                break;
        }
    }
}
