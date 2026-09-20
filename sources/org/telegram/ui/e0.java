package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
                zn znVar = (zn) this.b;
                znVar.Q8 = null;
                znVar.T8 = null;
                znVar.S8 = null;
                znVar.z0.R = true;
                znVar.g8(false, true, 0.0f);
                lk lkVar = znVar.Y;
                if (lkVar != null && lkVar.getEditField() != null) {
                    znVar.Y.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
            case 2:
                nj njVar = (nj) this.b;
                njVar.b = null;
                zn znVar2 = njVar.w;
                znVar2.Q8 = null;
                znVar2.T8 = null;
                znVar2.S8 = null;
                znVar2.z0.R = true;
                if (znVar2.R8) {
                    znVar2.g8(false, true, 0.0f);
                } else {
                    znVar2.R8 = true;
                }
                lk lkVar2 = znVar2.Y;
                if (lkVar2 != null && lkVar2.getEditField() != null) {
                    znVar2.Y.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
            default:
                ((ProfileActivity) this.b).H3(0.0f);
                break;
        }
    }
}
