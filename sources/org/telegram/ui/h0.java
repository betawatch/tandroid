package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                tn tnVar = (tn) this.b;
                tnVar.M8 = null;
                tnVar.P8 = null;
                tnVar.O8 = null;
                tnVar.v0.R = true;
                tnVar.g8(false, true, 0.0f);
                dk dkVar = tnVar.U;
                if (dkVar != null && dkVar.getEditField() != null) {
                    tnVar.U.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
            case 2:
                fj fjVar = (fj) this.b;
                fjVar.b = null;
                tn tnVar2 = fjVar.w;
                tnVar2.M8 = null;
                tnVar2.P8 = null;
                tnVar2.O8 = null;
                tnVar2.v0.R = true;
                if (tnVar2.N8) {
                    tnVar2.g8(false, true, 0.0f);
                } else {
                    tnVar2.N8 = true;
                }
                dk dkVar2 = tnVar2.U;
                if (dkVar2 != null && dkVar2.getEditField() != null) {
                    tnVar2.U.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
            default:
                ((ProfileActivity) this.b).H3(0.0f);
                break;
        }
    }
}
