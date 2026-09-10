package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                j4 j4Var = (j4) this.b;
                View view = j4Var.f;
                if (view != null) {
                    j4Var.d = null;
                    view.invalidate();
                    j4Var.f = null;
                    break;
                }
                break;
            case 1:
                eo eoVar = (eo) this.b;
                eoVar.Q8 = null;
                eoVar.T8 = null;
                eoVar.S8 = null;
                eoVar.z0.R = true;
                eoVar.g8(false, true, 0.0f);
                ok okVar = eoVar.Y;
                if (okVar != null && okVar.getEditField() != null) {
                    eoVar.Y.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
            case 2:
                qj qjVar = (qj) this.b;
                qjVar.b = null;
                eo eoVar2 = qjVar.w;
                eoVar2.Q8 = null;
                eoVar2.T8 = null;
                eoVar2.S8 = null;
                eoVar2.z0.R = true;
                if (eoVar2.R8) {
                    eoVar2.g8(false, true, 0.0f);
                } else {
                    eoVar2.R8 = true;
                }
                ok okVar2 = eoVar2.Y;
                if (okVar2 != null && okVar2.getEditField() != null) {
                    eoVar2.Y.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
            default:
                ((ProfileActivity) this.b).H3(0.0f);
                break;
        }
    }
}
