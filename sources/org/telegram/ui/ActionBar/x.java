package org.telegram.ui.ActionBar;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                if (!w0Var.s()) {
                    if (!w0Var.u()) {
                        zVar.n(((Integer) view.getTag()).intValue());
                        break;
                    } else {
                        kVar.t(w0Var.T(true));
                        break;
                    }
                } else if (kVar.u0.a()) {
                    w0Var.U(null, null);
                    break;
                }
                break;
            case 1:
                ((i2) this.b).dismiss();
                break;
            case 2:
                k3 k3Var = (k3) this.b;
                k3Var.getClass();
                k3Var.dismissWithButtonClick(((Integer) view.getTag()).intValue());
                break;
            default:
                u5 u5Var = (u5) this.b;
                if (!u5Var.x.f) {
                    if (!u5Var.w.f) {
                        if (u5Var.c == t5.b) {
                            AndroidUtilities.shakeViewSpring(u5Var, 4.0f);
                            break;
                        }
                    } else {
                        r5 r5Var = u5Var.a;
                        int i10 = u5Var.b;
                        j jVar = r5Var.T;
                        if (jVar != null) {
                            jVar.b(i10);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
