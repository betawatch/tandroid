package org.telegram.ui.Wallet;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
                ((z2) this.b).dismiss();
                break;
            case 1:
                pf.d.t((Activity) this.b, "https://fragment.com/");
                break;
            case 2:
                ((l4) this.b).dismiss();
                break;
            case 3:
                ((Runnable) this.b).run();
                break;
            case 4:
                m6 m6Var = (m6) this.b;
                if (!m6Var.x && m6Var.r && !m6Var.h.b()) {
                    m6Var.h.setProgress(0.0f);
                    m6Var.h.d();
                    break;
                }
                break;
            case 5:
                ((n8) this.b).b(!r3.x);
                break;
            case 6:
                ((org.telegram.ui.Cells.a2) this.b).c(!r3.b(), true);
                break;
            default:
                d9 d9Var = ((h9) this.b).b;
                d9Var.requestFocus();
                AndroidUtilities.showKeyboard(d9Var);
                break;
        }
    }
}
