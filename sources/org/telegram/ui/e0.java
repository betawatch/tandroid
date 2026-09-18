package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                h4 h4Var = (h4) this.b;
                View view = h4Var.f;
                if (view != null) {
                    h4Var.d = null;
                    view.invalidate();
                    h4Var.f = null;
                    break;
                }
                break;
            case 1:
                bo boVar = (bo) this.b;
                boVar.Q8 = null;
                boVar.T8 = null;
                boVar.S8 = null;
                boVar.z0.R = true;
                boVar.g8(false, true, 0.0f);
                nk nkVar = boVar.Y;
                if (nkVar != null && nkVar.getEditField() != null) {
                    boVar.Y.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
            case 2:
                pj pjVar = (pj) this.b;
                pjVar.b = null;
                bo boVar2 = pjVar.w;
                boVar2.Q8 = null;
                boVar2.T8 = null;
                boVar2.S8 = null;
                boVar2.z0.R = true;
                if (boVar2.R8) {
                    boVar2.g8(false, true, 0.0f);
                } else {
                    boVar2.R8 = true;
                }
                nk nkVar2 = boVar2.Y;
                if (nkVar2 != null && nkVar2.getEditField() != null) {
                    boVar2.Y.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
            default:
                ((ProfileActivity) this.b).H3(0.0f);
                break;
        }
    }
}
