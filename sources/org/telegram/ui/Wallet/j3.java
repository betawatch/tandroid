package org.telegram.ui.Wallet;

import android.app.Activity;
import android.view.View;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j3(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ((p3) this.b).dismiss();
                break;
            case 1:
                vf.c.v((Activity) this.b, "https://fragment.com/", false);
                break;
            case 2:
                ((w4) this.b).dismiss();
                break;
            case 3:
                ((Runnable) this.b).run();
                break;
            case 4:
                w6 w6Var = (w6) this.b;
                if (!w6Var.y && w6Var.r && !w6Var.h.b()) {
                    w6Var.h.setProgress(0.0f);
                    w6Var.h.d();
                    break;
                }
                break;
            case 5:
                ((t8) this.b).b(!r3.y);
                break;
            case 6:
                ((org.telegram.ui.Cells.c2) this.b).c(!r3.b(), true);
                break;
            default:
                i9 i9Var = ((m9) this.b).c;
                i9Var.requestFocus();
                org.telegram.messenger.g0.K3(i9Var);
                break;
        }
    }
}
