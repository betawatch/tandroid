package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
                an anVar = (an) this.b;
                anVar.e9 = null;
                anVar.h9 = null;
                anVar.g9 = null;
                anVar.B0.R = true;
                anVar.v8(false, true, 0.0f);
                qj qjVar = anVar.Z;
                if (qjVar != null && qjVar.getEditField() != null) {
                    anVar.Z.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
            default:
                ti tiVar = (ti) this.b;
                tiVar.b = null;
                an anVar2 = tiVar.x;
                anVar2.e9 = null;
                anVar2.h9 = null;
                anVar2.g9 = null;
                anVar2.B0.R = true;
                if (anVar2.f9) {
                    anVar2.v8(false, true, 0.0f);
                } else {
                    anVar2.f9 = true;
                }
                qj qjVar2 = anVar2.Z;
                if (qjVar2 != null && qjVar2.getEditField() != null) {
                    anVar2.Z.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
        }
    }
}
