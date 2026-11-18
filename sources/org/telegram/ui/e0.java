package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                bn bnVar = (bn) this.b;
                bnVar.g9 = null;
                bnVar.l9 = null;
                bnVar.k9 = null;
                bnVar.C0.R = true;
                bnVar.x8(false, true, 0.0f);
                rj rjVar = bnVar.a0;
                if (rjVar != null && rjVar.getEditField() != null) {
                    bnVar.a0.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
            default:
                ui uiVar = (ui) this.b;
                uiVar.b = null;
                bn bnVar2 = uiVar.x;
                bnVar2.g9 = null;
                bnVar2.l9 = null;
                bnVar2.k9 = null;
                bnVar2.C0.R = true;
                if (bnVar2.h9) {
                    bnVar2.x8(false, true, 0.0f);
                } else {
                    bnVar2.h9 = true;
                }
                rj rjVar2 = bnVar2.a0;
                if (rjVar2 != null && rjVar2.getEditField() != null) {
                    bnVar2.a0.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
        }
    }
}
