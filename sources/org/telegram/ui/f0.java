package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                xn xnVar = (xn) this.b;
                xnVar.Q8 = null;
                xnVar.T8 = null;
                xnVar.S8 = null;
                xnVar.z0.R = true;
                xnVar.g8(false, true, 0.0f);
                jk jkVar = xnVar.Y;
                if (jkVar != null && jkVar.getEditField() != null) {
                    xnVar.Y.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
            case 2:
                lj ljVar = (lj) this.b;
                ljVar.b = null;
                xn xnVar2 = ljVar.w;
                xnVar2.Q8 = null;
                xnVar2.T8 = null;
                xnVar2.S8 = null;
                xnVar2.z0.R = true;
                if (xnVar2.R8) {
                    xnVar2.g8(false, true, 0.0f);
                } else {
                    xnVar2.R8 = true;
                }
                jk jkVar2 = xnVar2.Y;
                if (jkVar2 != null && jkVar2.getEditField() != null) {
                    xnVar2.Y.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
            default:
                ((ProfileActivity) this.b).H3(0.0f);
                break;
        }
    }
}
