package org.telegram.ui.Wallet;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s2(Object obj, int i10) {
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
                m6 m6Var = (m6) this.b;
                if (!m6Var.x && m6Var.r && !m6Var.h.b()) {
                    m6Var.h.setProgress(0.0f);
                    m6Var.h.d();
                    break;
                }
                break;
            case 5:
                ((o8) this.b).b(!r3.x);
                break;
            case 6:
                ((org.telegram.ui.Cells.z1) this.b).c(!r3.b(), true);
                break;
            default:
                e9 e9Var = ((i9) this.b).c;
                e9Var.requestFocus();
                AndroidUtilities.showKeyboard(e9Var);
                break;
        }
    }
}
