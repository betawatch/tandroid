package org.telegram.ui.ActionBar;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                k kVar = a0Var.b;
                w0 w0Var = (w0) view;
                if (!w0Var.q()) {
                    if (!w0Var.G) {
                        a0Var.o(((Integer) view.getTag()).intValue());
                        break;
                    } else {
                        kVar.v(w0Var.L(true));
                        break;
                    }
                } else if (kVar.u0.a()) {
                    w0Var.M(null, null);
                    break;
                }
                break;
            case 1:
                ((g2) this.b).dismiss();
                break;
            default:
                g3 g3Var = (g3) this.b;
                g3Var.getClass();
                g3Var.dismissWithButtonClick(((Integer) view.getTag()).intValue());
                break;
        }
    }
}
