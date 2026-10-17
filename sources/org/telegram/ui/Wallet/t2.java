package org.telegram.ui.Wallet;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
                ((x2) this.b).dismiss();
                break;
            case 1:
                pf.d.t((Activity) this.b, "https://fragment.com/");
                break;
            case 2:
                ((i4) this.b).dismiss();
                break;
            case 3:
                ((Runnable) this.b).run();
                break;
            case 4:
                p6 p6Var = (p6) this.b;
                if (!p6Var.x && p6Var.r && !p6Var.h.b()) {
                    p6Var.h.setProgress(0.0f);
                    p6Var.h.d();
                    break;
                }
                break;
            case 5:
                ((q8) this.b).b(!r3.x);
                break;
            case 6:
                ((org.telegram.ui.Cells.a2) this.b).c(!r3.b(), true);
                break;
            default:
                g9 g9Var = ((k9) this.b).b;
                g9Var.requestFocus();
                AndroidUtilities.showKeyboard(g9Var);
                break;
        }
    }
}
