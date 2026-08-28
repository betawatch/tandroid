package org.telegram.ui.ActionBar;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ x(KeyEvent.Callback callback, int i9) {
        this.a = i9;
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
                    if (!w0Var.C) {
                        zVar.o(((Integer) view.getTag()).intValue());
                        break;
                    } else {
                        kVar.v(w0Var.L(true));
                        break;
                    }
                } else if (kVar.q0.a()) {
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
