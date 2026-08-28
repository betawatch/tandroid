package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g0(Object obj, int i9) {
        this.a = i9;
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
                qn qnVar = (qn) this.b;
                qnVar.M8 = null;
                qnVar.P8 = null;
                qnVar.O8 = null;
                qnVar.v0.R = true;
                qnVar.g8(false, true, 0.0f);
                ak akVar = qnVar.U;
                if (akVar != null && akVar.getEditField() != null) {
                    qnVar.U.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
            case 2:
                cj cjVar = (cj) this.b;
                cjVar.b = null;
                qn qnVar2 = cjVar.w;
                qnVar2.M8 = null;
                qnVar2.P8 = null;
                qnVar2.O8 = null;
                qnVar2.v0.R = true;
                if (qnVar2.N8) {
                    qnVar2.g8(false, true, 0.0f);
                } else {
                    qnVar2.N8 = true;
                }
                ak akVar2 = qnVar2.U;
                if (akVar2 != null && akVar2.getEditField() != null) {
                    qnVar2.U.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
            default:
                ((ProfileActivity) this.b).H3(0.0f);
                break;
        }
    }
}
