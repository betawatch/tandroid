package org.telegram.ui.Wallet;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class j3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                pf.d.u((Activity) this.b, "https://fragment.com/");
                break;
            case 1:
                ((y3) this.b).dismiss();
                break;
            case 2:
                ((Runnable) this.b).run();
                break;
            case 3:
                b6 b6Var = (b6) this.b;
                if (!b6Var.x && b6Var.r && !b6Var.h.b()) {
                    b6Var.h.setProgress(0.0f);
                    b6Var.h.d();
                    break;
                }
                break;
            case 4:
                ((org.telegram.ui.Cells.a2) this.b).c(!r3.b(), true);
                break;
            default:
                d8 d8Var = ((h8) this.b).b;
                d8Var.requestFocus();
                AndroidUtilities.showKeyboard(d8Var);
                break;
        }
    }
}
