package org.telegram.ui.ActionBar;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                h3 h3Var = (h3) this.b;
                h3Var.getClass();
                h3Var.dismissWithButtonClick(((Integer) view.getTag()).intValue());
                break;
        }
    }
}
