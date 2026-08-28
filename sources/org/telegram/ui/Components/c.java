package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;

    public /* synthetic */ c(e0 e0Var, int i9) {
        this.a = i9;
        this.b = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e0 e0Var = this.b;
                if (!e0Var.G0) {
                    e0Var.z0.setVisibility(8);
                    break;
                }
                break;
            case 1:
                e0 e0Var2 = this.b;
                if (e0Var2.G0) {
                    e0Var2.y0.setVisibility(8);
                    break;
                }
                break;
            case 2:
                AndroidUtilities.showKeyboard(this.b.w0.b);
                break;
            case 3:
                e0 e0Var3 = this.b;
                e0Var3.k0(0, 0, false);
                e0Var3.dismiss();
                break;
            default:
                e0.P(this.b);
                break;
        }
    }
}
