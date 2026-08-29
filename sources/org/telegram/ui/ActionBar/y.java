package org.telegram.ui.ActionBar;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ y(KeyEvent.Callback callback, int i10) {
        this.a = i10;
        this.b = callback;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                a0 a0Var = (a0) this.b;
                l lVar = a0Var.b;
                w0 w0Var = (w0) view;
                if (!w0Var.q()) {
                    if (!w0Var.C) {
                        a0Var.o(((Integer) view.getTag()).intValue());
                        break;
                    } else {
                        lVar.v(w0Var.L(true));
                        break;
                    }
                } else if (lVar.q0.a()) {
                    w0Var.M(null, null);
                    break;
                }
                break;
            case 1:
                ((g2) this.b).dismiss();
                break;
            default:
                f3 f3Var = (f3) this.b;
                f3Var.getClass();
                f3Var.dismissWithButtonClick(((Integer) view.getTag()).intValue());
                break;
        }
    }
}
