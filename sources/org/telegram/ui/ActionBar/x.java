package org.telegram.ui.ActionBar;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
                v0 v0Var = (v0) view;
                if (!v0Var.q()) {
                    if (!v0Var.G) {
                        zVar.o(((Integer) view.getTag()).intValue());
                        break;
                    } else {
                        kVar.v(v0Var.L(true));
                        break;
                    }
                } else if (kVar.u0.a()) {
                    v0Var.M(null, null);
                    break;
                }
                break;
            case 1:
                ((f2) this.b).dismiss();
                break;
            default:
                f3 f3Var = (f3) this.b;
                f3Var.getClass();
                f3Var.dismissWithButtonClick(((Integer) view.getTag()).intValue());
                break;
        }
    }
}
