package org.telegram.ui.ActionBar;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
                        kVar.v(u0Var.L(true));
                        break;
                    }
                } else if (kVar.u0.a()) {
                    u0Var.M(null, null);
                    break;
                }
                break;
            case 1:
                ((g2) this.b).dismiss();
                break;
            default:
                h3 h3Var = (h3) this.b;
                h3Var.getClass();
                h3Var.dismissWithButtonClick(((Integer) view.getTag()).intValue());
                break;
        }
    }
}
