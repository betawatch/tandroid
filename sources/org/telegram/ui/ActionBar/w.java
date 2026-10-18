package org.telegram.ui.ActionBar;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ w(KeyEvent.Callback callback, int i10) {
        this.a = i10;
        this.b = callback;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                y yVar = (y) this.b;
                k kVar = yVar.b;
                u0 u0Var = (u0) view;
                if (!u0Var.q()) {
                    if (!u0Var.G) {
                        yVar.o(((Integer) view.getTag()).intValue());
                        break;
                    } else {
                        kVar.w(u0Var.L(true));
                        break;
                    }
                } else if (kVar.u0.a()) {
                    u0Var.M(null, null);
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
