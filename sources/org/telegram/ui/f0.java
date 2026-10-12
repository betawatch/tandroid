package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f0(Object obj, int i10) {
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
                fo foVar = (fo) this.b;
                foVar.Q8 = null;
                foVar.T8 = null;
                foVar.S8 = null;
                foVar.z0.R = true;
                foVar.j8(false, true, 0.0f);
                sk skVar = foVar.Y;
                if (skVar != null && skVar.getEditField() != null) {
                    foVar.Y.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
            case 2:
                tj tjVar = (tj) this.b;
                tjVar.b = null;
                fo foVar2 = tjVar.w;
                foVar2.Q8 = null;
                foVar2.T8 = null;
                foVar2.S8 = null;
                foVar2.z0.R = true;
                if (foVar2.R8) {
                    foVar2.j8(false, true, 0.0f);
                } else {
                    foVar2.R8 = true;
                }
                sk skVar2 = foVar2.Y;
                if (skVar2 != null && skVar2.getEditField() != null) {
                    foVar2.Y.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
            default:
                ((ProfileActivity) this.b).H3(0.0f);
                break;
        }
    }
}
