package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ch0 b;

    public /* synthetic */ bh0(ch0 ch0Var, int i3) {
        this.a = i3;
        this.b = ch0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ch0 ch0Var = this.b;
                ch0Var.getClass();
                try {
                    cg.h hVar = ch0Var.C0;
                    if (hVar != null) {
                        hVar.b();
                    }
                } catch (Throwable unused) {
                }
                org.telegram.messenger.g0.h3(ch0Var.A0);
                break;
            case 1:
                ch0 ch0Var2 = this.b;
                ch0Var2.Q = null;
                ch0Var2.p();
                break;
            case 2:
                ch0.h(this.b);
                break;
            case 3:
                ch0.e(this.b);
                break;
            case 4:
                ch0.d(this.b);
                break;
            case 5:
                ch0.f(this.b);
                break;
            default:
                this.b.m();
                break;
        }
    }
}
