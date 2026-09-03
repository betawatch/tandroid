package org.telegram.ui.ActionBar;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ x(KeyEvent.Callback callback, int i10) {
        this.a = i10;
        this.b = callback;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                z zVar = (z) this.b;
                k kVar = zVar.b;
                w0 w0Var = (w0) view;
                if (!w0Var.q()) {
                    if (!w0Var.D) {
                        zVar.o(((Integer) view.getTag()).intValue());
                        break;
                    } else {
                        kVar.v(w0Var.L(true));
                        break;
                    }
                } else if (kVar.r0.a()) {
                    w0Var.M(null, null);
                    break;
                }
                break;
            case 1:
                ((h2) this.b).dismiss();
                break;
            default:
                g3 g3Var = (g3) this.b;
                g3Var.getClass();
                g3Var.dismissWithButtonClick(((Integer) view.getTag()).intValue());
                break;
        }
    }
}
