package org.telegram.ui.Wallet;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ((y2) this.b).dismiss();
                break;
            case 1:
                pf.d.t((Activity) this.b, "https://fragment.com/");
                break;
            case 2:
                ((j4) this.b).dismiss();
                break;
            case 3:
                ((Runnable) this.b).run();
                break;
            case 4:
                s6 s6Var = (s6) this.b;
                if (!s6Var.x && s6Var.r && !s6Var.h.b()) {
                    s6Var.h.setProgress(0.0f);
                    s6Var.h.d();
                    break;
                }
                break;
            case 5:
                ((t8) this.b).b(!r3.x);
                break;
            case 6:
                ((org.telegram.ui.Cells.a2) this.b).c(!r3.b(), true);
                break;
            default:
                j9 j9Var = ((n9) this.b).b;
                j9Var.requestFocus();
                AndroidUtilities.showKeyboard(j9Var);
                break;
        }
    }
}
