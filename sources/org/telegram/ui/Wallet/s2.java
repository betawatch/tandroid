package org.telegram.ui.Wallet;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                qf.d.t((Activity) this.b, "https://fragment.com/");
                break;
            case 2:
                ((i4) this.b).dismiss();
                break;
            case 3:
                ((Runnable) this.b).run();
                break;
            case 4:
                l6 l6Var = (l6) this.b;
                if (!l6Var.x && l6Var.r && !l6Var.h.b()) {
                    l6Var.h.setProgress(0.0f);
                    l6Var.h.d();
                    break;
                }
                break;
            case 5:
                ((n8) this.b).b(!r3.x);
                break;
            case 6:
                ((org.telegram.ui.Cells.y1) this.b).c(!r3.b(), true);
                break;
            default:
                d9 d9Var = ((h9) this.b).c;
                d9Var.requestFocus();
                AndroidUtilities.showKeyboard(d9Var);
                break;
        }
    }
}
