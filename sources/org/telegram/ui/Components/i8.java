package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w8 b;

    public /* synthetic */ i8(w8 w8Var, int i10) {
        this.a = i10;
        this.b = w8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w8 w8Var = this.b;
                if (!w8Var.R) {
                    if (w8Var.K <= 0.0f) {
                        w8Var.g0(!w8Var.a.v, true, false);
                        break;
                    } else {
                        if (w8Var.J != null) {
                            w8Var.B = 1.0f;
                            w8Var.C = true;
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
