package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w8 b;

    public /* synthetic */ i8(w8 w8Var, int i9) {
        this.a = i9;
        this.b = w8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w8 w8Var = this.b;
                if (!w8Var.Q) {
                    if (w8Var.J <= 0.0f) {
                        w8Var.f0(!w8Var.a.v, true, false);
                        break;
                    } else {
                        if (w8Var.I != null) {
                            w8Var.A = 1.0f;
                            w8Var.B = true;
                        }
                        AndroidUtilities.hideKeyboard(w8Var.fragmentView);
                        break;
                    }
                }
                break;
            default:
                w8 w8Var2 = this.b;
                w8Var2.getClass();
                w8Var2.presentFragment(new PremiumPreviewFragment(0, "avatar"));
                break;
        }
    }
}
