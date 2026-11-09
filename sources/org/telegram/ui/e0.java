package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class e0 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.a) {
            case 0:
                g4 g4Var = (g4) this.b;
                View view = g4Var.f;
                if (view != null) {
                    g4Var.d = null;
                    view.invalidate();
                    g4Var.f = null;
                    break;
                }
                break;
            case 1:
                cn cnVar = (cn) this.b;
                cnVar.e9 = null;
                cnVar.j9 = null;
                cnVar.i9 = null;
                cnVar.B0.R = true;
                cnVar.w8(false, true, 0.0f);
                sj sjVar = cnVar.Z;
                if (sjVar != null && sjVar.getEditField() != null) {
                    cnVar.Z.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
            default:
                vi viVar = (vi) this.b;
                viVar.b = null;
                cn cnVar2 = viVar.x;
                cnVar2.e9 = null;
                cnVar2.j9 = null;
                cnVar2.i9 = null;
                cnVar2.B0.R = true;
                if (cnVar2.f9) {
                    cnVar2.w8(false, true, 0.0f);
                } else {
                    cnVar2.f9 = true;
                }
                sj sjVar2 = cnVar2.Z;
                if (sjVar2 != null && sjVar2.getEditField() != null) {
                    cnVar2.Z.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
        }
    }
}
