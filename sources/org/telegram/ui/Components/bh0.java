package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class bh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ch0 b;

    public /* synthetic */ bh0(ch0 ch0Var, int i7) {
        this.a = i7;
        this.b = ch0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ch0 ch0Var = this.b;
                ch0Var.getClass();
                try {
                    bg.i iVar = ch0Var.C0;
                    if (iVar != null) {
                        iVar.b();
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
