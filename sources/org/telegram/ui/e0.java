package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
                i4 i4Var = (i4) this.b;
                View view = i4Var.f;
                if (view != null) {
                    i4Var.d = null;
                    view.invalidate();
                    i4Var.f = null;
                    break;
                }
                break;
            case 1:
                co coVar = (co) this.b;
                coVar.Q8 = null;
                coVar.T8 = null;
                coVar.S8 = null;
                coVar.z0.R = true;
                coVar.g8(false, true, 0.0f);
                mk mkVar = coVar.Y;
                if (mkVar != null && mkVar.getEditField() != null) {
                    coVar.Y.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
            case 2:
                oj ojVar = (oj) this.b;
                ojVar.b = null;
                co coVar2 = ojVar.w;
                coVar2.Q8 = null;
                coVar2.T8 = null;
                coVar2.S8 = null;
                coVar2.z0.R = true;
                if (coVar2.R8) {
                    coVar2.g8(false, true, 0.0f);
                } else {
                    coVar2.R8 = true;
                }
                mk mkVar2 = coVar2.Y;
                if (mkVar2 != null && mkVar2.getEditField() != null) {
                    coVar2.Y.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
            default:
                ((ProfileActivity) this.b).H3(0.0f);
                break;
        }
    }
}
