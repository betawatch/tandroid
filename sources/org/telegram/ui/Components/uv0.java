package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class uv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jw0 b;

    public /* synthetic */ uv0(jw0 jw0Var, int i7) {
        this.a = i7;
        this.b = jw0Var;
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
                jw0 jw0Var = this.b;
                jw0Var.dismiss();
                org.telegram.messenger.ri.d0(jw0Var.a).k2(jw0Var.getContext(), jw0Var.N1, 1, jw0Var.G1, false, false);
                break;
            case 3:
                jw0 jw0Var2 = this.b;
                org.telegram.messenger.mp.u1(jw0Var2.a).F3("stickers", jw0Var2.G1, 1, null);
                break;
            default:
                jw0 jw0Var3 = this.b;
                jw0Var3.dismiss();
                org.telegram.messenger.ri.d0(jw0Var3.a).k2(jw0Var3.getContext(), jw0Var3.N1, 1, jw0Var3.G1, false, false);
                break;
        }
    }
}
