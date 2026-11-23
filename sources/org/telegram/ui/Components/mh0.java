package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class mh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nh0 b;

    public /* synthetic */ mh0(nh0 nh0Var, int i7) {
        this.a = i7;
        this.b = nh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nh0 nh0Var = this.b;
                nh0Var.getClass();
                try {
                    bg.i iVar = nh0Var.C0;
                    if (iVar != null) {
                        iVar.b();
                    }
                } catch (Throwable unused) {
                }
                org.telegram.messenger.g0.g3(nh0Var.A0);
                break;
            case 1:
                nh0 nh0Var2 = this.b;
                nh0Var2.Q = null;
                nh0Var2.p();
                break;
            case 2:
                nh0.h(this.b);
                break;
            case 3:
                nh0.e(this.b);
                break;
            case 4:
                nh0.d(this.b);
                break;
            case 5:
                nh0.f(this.b);
                break;
            default:
                this.b.m();
                break;
        }
    }
}
