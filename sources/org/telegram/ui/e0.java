package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                j4 j4Var = (j4) obj;
                View view = j4Var.f;
                if (view != null) {
                    j4Var.d = null;
                    view.invalidate();
                    j4Var.f = null;
                    break;
                }
                break;
            case 1:
                un unVar = (un) obj;
                unVar.c9 = null;
                unVar.f9 = null;
                unVar.e9 = null;
                unVar.z0.R = true;
                unVar.n8(false, true, 0.0f);
                hk hkVar = unVar.Y;
                if (hkVar != null && hkVar.getEditField() != null) {
                    unVar.Y.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
            case 2:
                hj hjVar = (hj) obj;
                hjVar.b = null;
                un unVar2 = hjVar.w;
                unVar2.c9 = null;
                unVar2.f9 = null;
                unVar2.e9 = null;
                unVar2.z0.R = true;
                if (unVar2.d9) {
                    unVar2.n8(false, true, 0.0f);
                } else {
                    unVar2.d9 = true;
                }
                hk hkVar2 = unVar2.Y;
                if (hkVar2 != null && hkVar2.getEditField() != null) {
                    unVar2.Y.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
            default:
                int i11 = ProfileActivity.R6;
                ((ProfileActivity) obj).Q3(0.0f);
                break;
        }
    }
}
