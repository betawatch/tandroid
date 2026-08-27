package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                m4 m4Var = (m4) this.b;
                View view = m4Var.f;
                if (view != null) {
                    m4Var.d = null;
                    view.invalidate();
                    m4Var.f = null;
                    break;
                }
                break;
            case 1:
                rn rnVar = (rn) this.b;
                rnVar.M8 = null;
                rnVar.P8 = null;
                rnVar.O8 = null;
                rnVar.v0.R = true;
                rnVar.g8(false, true, 0.0f);
                ck ckVar = rnVar.U;
                if (ckVar != null && ckVar.getEditField() != null) {
                    rnVar.U.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
            case 2:
                ej ejVar = (ej) this.b;
                ejVar.b = null;
                rn rnVar2 = ejVar.w;
                rnVar2.M8 = null;
                rnVar2.P8 = null;
                rnVar2.O8 = null;
                rnVar2.v0.R = true;
                if (rnVar2.N8) {
                    rnVar2.g8(false, true, 0.0f);
                } else {
                    rnVar2.N8 = true;
                }
                ck ckVar2 = rnVar2.U;
                if (ckVar2 != null && ckVar2.getEditField() != null) {
                    rnVar2.U.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
            default:
                ((ProfileActivity) this.b).H3(0.0f);
                break;
        }
    }
}
