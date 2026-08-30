package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.a) {
            case 0:
                l4 l4Var = (l4) this.b;
                View view = l4Var.f;
                if (view != null) {
                    l4Var.d = null;
                    view.invalidate();
                    l4Var.f = null;
                    break;
                }
                break;
            case 1:
                xn xnVar = (xn) this.b;
                xnVar.N8 = null;
                xnVar.Q8 = null;
                xnVar.P8 = null;
                xnVar.w0.R = true;
                xnVar.g8(false, true, 0.0f);
                jk jkVar = xnVar.V;
                if (jkVar != null && jkVar.getEditField() != null) {
                    xnVar.V.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
            case 2:
                kj kjVar = (kj) this.b;
                kjVar.b = null;
                xn xnVar2 = kjVar.w;
                xnVar2.N8 = null;
                xnVar2.Q8 = null;
                xnVar2.P8 = null;
                xnVar2.w0.R = true;
                if (xnVar2.O8) {
                    xnVar2.g8(false, true, 0.0f);
                } else {
                    xnVar2.O8 = true;
                }
                jk jkVar2 = xnVar2.V;
                if (jkVar2 != null && jkVar2.getEditField() != null) {
                    xnVar2.V.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
            default:
                ((ProfileActivity) this.b).H3(0.0f);
                break;
        }
    }
}
