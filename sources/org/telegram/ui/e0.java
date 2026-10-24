package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class e0 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.a) {
            case 0:
                k4 k4Var = (k4) this.b;
                View view = k4Var.f;
                if (view != null) {
                    k4Var.d = null;
                    view.invalidate();
                    k4Var.f = null;
                    break;
                }
                break;
            case 1:
                sn snVar = (sn) this.b;
                snVar.c9 = null;
                snVar.f9 = null;
                snVar.e9 = null;
                snVar.z0.R = true;
                snVar.j8(false, true, 0.0f);
                gk gkVar = snVar.Y;
                if (gkVar != null && gkVar.getEditField() != null) {
                    snVar.Y.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
            case 2:
                gj gjVar = (gj) this.b;
                gjVar.b = null;
                sn snVar2 = gjVar.w;
                snVar2.c9 = null;
                snVar2.f9 = null;
                snVar2.e9 = null;
                snVar2.z0.R = true;
                if (snVar2.d9) {
                    snVar2.j8(false, true, 0.0f);
                } else {
                    snVar2.d9 = true;
                }
                gk gkVar2 = snVar2.Y;
                if (gkVar2 != null && gkVar2.getEditField() != null) {
                    snVar2.Y.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
            default:
                ((ProfileActivity) this.b).J3(0.0f);
                break;
        }
    }
}
