package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d0(Object obj, int i7) {
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
                anVar.f9 = null;
                anVar.k9 = null;
                anVar.j9 = null;
                anVar.C0.R = true;
                anVar.x8(false, true, 0.0f);
                qj qjVar = anVar.a0;
                if (qjVar != null && qjVar.getEditField() != null) {
                    anVar.a0.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
            default:
                ti tiVar = (ti) this.b;
                tiVar.b = null;
                an anVar2 = tiVar.x;
                anVar2.f9 = null;
                anVar2.k9 = null;
                anVar2.j9 = null;
                anVar2.C0.R = true;
                if (anVar2.g9) {
                    anVar2.x8(false, true, 0.0f);
                } else {
                    anVar2.g9 = true;
                }
                qj qjVar2 = anVar2.a0;
                if (qjVar2 != null && qjVar2.getEditField() != null) {
                    anVar2.a0.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
        }
    }
}
