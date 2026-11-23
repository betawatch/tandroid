package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class vv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kw0 b;

    public /* synthetic */ vv0(kw0 kw0Var, int i7) {
        this.a = i7;
        this.b = kw0Var;
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
                kw0 kw0Var = this.b;
                kw0Var.dismiss();
                org.telegram.messenger.si.d0(kw0Var.a).k2(kw0Var.getContext(), kw0Var.N1, 1, kw0Var.G1, false, false);
                break;
            case 3:
                kw0 kw0Var2 = this.b;
                org.telegram.messenger.np.u1(kw0Var2.a).F3("stickers", kw0Var2.G1, 1, null);
                break;
            default:
                kw0 kw0Var3 = this.b;
                kw0Var3.dismiss();
                org.telegram.messenger.si.d0(kw0Var3.a).k2(kw0Var3.getContext(), kw0Var3.N1, 1, kw0Var3.G1, false, false);
                break;
        }
    }
}
