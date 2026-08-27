package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v8 b;

    public /* synthetic */ h8(v8 v8Var, int i10) {
        this.a = i10;
        this.b = v8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v8 v8Var = this.b;
                if (!v8Var.Q) {
                    if (v8Var.J <= 0.0f) {
                        v8Var.g0(!v8Var.a.v, true, false);
                        break;
                    } else {
                        if (v8Var.I != null) {
                            v8Var.A = 1.0f;
                            v8Var.B = true;
                        }
                        AndroidUtilities.hideKeyboard(v8Var.fragmentView);
                        break;
                    }
                }
                break;
            default:
                v8 v8Var2 = this.b;
                v8Var2.getClass();
                v8Var2.presentFragment(new PremiumPreviewFragment(0, "avatar"));
                break;
        }
    }
}
