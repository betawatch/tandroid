package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dh1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ eh1 b;

    public /* synthetic */ dh1(eh1 eh1Var, int i10) {
        this.a = i10;
        this.b = eh1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.a61 a61Var = this.b.a;
                if (a61Var != null) {
                    a61Var.V2.N(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.a61 a61Var2 = this.b.a;
                if (a61Var2 != null) {
                    a61Var2.V2.N(true);
                    break;
                }
                break;
        }
    }
}
