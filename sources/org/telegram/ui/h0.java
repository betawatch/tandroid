package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h0 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.a) {
            case 0:
                n4 n4Var = (n4) this.b;
                View view = n4Var.f;
                if (view != null) {
                    n4Var.d = null;
                    view.invalidate();
                    n4Var.f = null;
                    break;
                }
                break;
            case 1:
                zn znVar = (zn) this.b;
                znVar.N8 = null;
                znVar.Q8 = null;
                znVar.P8 = null;
                znVar.w0.R = true;
                znVar.g8(false, true, 0.0f);
                lk lkVar = znVar.V;
                if (lkVar != null && lkVar.getEditField() != null) {
                    znVar.V.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
            case 2:
                mj mjVar = (mj) this.b;
                mjVar.b = null;
                zn znVar2 = mjVar.w;
                znVar2.N8 = null;
                znVar2.Q8 = null;
                znVar2.P8 = null;
                znVar2.w0.R = true;
                if (znVar2.O8) {
                    znVar2.g8(false, true, 0.0f);
                } else {
                    znVar2.O8 = true;
                }
                lk lkVar2 = znVar2.V;
                if (lkVar2 != null && lkVar2.getEditField() != null) {
                    znVar2.V.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
            default:
                ((ProfileActivity) this.b).H3(0.0f);
                break;
        }
    }
}
