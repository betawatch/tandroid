package org.telegram.ui.ActionBar;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                l lVar = zVar.b;
                w0 w0Var = (w0) view;
                if (!w0Var.q()) {
                    if (!w0Var.G) {
                        zVar.o(((Integer) view.getTag()).intValue());
                        break;
                    } else {
                        lVar.v(w0Var.L(true));
                        break;
                    }
                } else if (lVar.u0.a()) {
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
