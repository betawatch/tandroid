package org.telegram.ui.ActionBar;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a2 b;

    public /* synthetic */ p1(a2 a2Var, int i10) {
        this.a = i10;
        this.b = a2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            default:
                a2 a2Var = this.b;
                if (!a2Var.isShowing()) {
                    try {
                        a2Var.show();
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
        }
    }
}
