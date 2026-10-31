package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                un unVar = (un) this.b;
                unVar.e9 = null;
                unVar.h9 = null;
                unVar.g9 = null;
                unVar.B0.R = true;
                unVar.o8(false, true, 0.0f);
                mk mkVar = unVar.Z;
                if (mkVar != null && mkVar.getEditField() != null) {
                    unVar.Z.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
            default:
                oj ojVar = (oj) this.b;
                ojVar.b = null;
                un unVar2 = ojVar.x;
                unVar2.e9 = null;
                unVar2.h9 = null;
                unVar2.g9 = null;
                unVar2.B0.R = true;
                if (unVar2.f9) {
                    unVar2.o8(false, true, 0.0f);
                } else {
                    unVar2.f9 = true;
                }
                mk mkVar2 = unVar2.Z;
                if (mkVar2 != null && mkVar2.getEditField() != null) {
                    unVar2.Z.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
        }
    }
}
