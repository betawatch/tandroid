package kh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k8 b;

    public /* synthetic */ d8(k8 k8Var, int i9) {
        this.a = i9;
        this.b = k8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k8.P(this.b);
                break;
            case 1:
                this.b.W();
                break;
            default:
                k8 k8Var = this.b;
                org.telegram.ui.Cells.j3 j3Var = k8Var.U;
                if (k8Var.isShowing()) {
                    j3Var.b.requestFocus();
                    AndroidUtilities.showKeyboard(j3Var.b);
                    break;
                }
                break;
        }
    }
}
