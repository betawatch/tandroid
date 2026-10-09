package org.telegram.ui.Wallet;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                of.f.u((Activity) this.b, "https://fragment.com/");
                break;
            case 1:
                ((y3) this.b).dismiss();
                break;
            case 2:
                ((Runnable) this.b).run();
                break;
            case 3:
                c6 c6Var = (c6) this.b;
                if (!c6Var.x && c6Var.r && !c6Var.h.b()) {
                    c6Var.h.setProgress(0.0f);
                    c6Var.h.d();
                    break;
                }
                break;
            case 4:
                ((org.telegram.ui.Cells.a2) this.b).c(!r3.b(), true);
                break;
            default:
                e8 e8Var = ((i8) this.b).b;
                e8Var.requestFocus();
                AndroidUtilities.showKeyboard(e8Var);
                break;
        }
    }
}
