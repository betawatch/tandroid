package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
                qnVar.Q8 = null;
                qnVar.T8 = null;
                qnVar.S8 = null;
                qnVar.z0.R = true;
                qnVar.j8(false, true, 0.0f);
                fk fkVar = qnVar.Y;
                if (fkVar != null && fkVar.getEditField() != null) {
                    qnVar.Y.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
            case 2:
                gj gjVar = (gj) this.b;
                gjVar.b = null;
                qn qnVar2 = gjVar.w;
                qnVar2.Q8 = null;
                qnVar2.T8 = null;
                qnVar2.S8 = null;
                qnVar2.z0.R = true;
                if (qnVar2.R8) {
                    qnVar2.j8(false, true, 0.0f);
                } else {
                    qnVar2.R8 = true;
                }
                fk fkVar2 = qnVar2.Y;
                if (fkVar2 != null && fkVar2.getEditField() != null) {
                    qnVar2.Y.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
            default:
                ((ProfileActivity) this.b).H3(0.0f);
                break;
        }
    }
}
