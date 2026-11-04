package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f0(Object obj, int i3) {
        this.a = i3;
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
                wm wmVar = (wm) this.b;
                wmVar.f9 = null;
                wmVar.i9 = null;
                wmVar.h9 = null;
                wmVar.C0.R = true;
                wmVar.v8(false, true, 0.0f);
                mj mjVar = wmVar.a0;
                if (mjVar != null && mjVar.getEditField() != null) {
                    wmVar.a0.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
            default:
                pi piVar = (pi) this.b;
                piVar.b = null;
                wm wmVar2 = piVar.x;
                wmVar2.f9 = null;
                wmVar2.i9 = null;
                wmVar2.h9 = null;
                wmVar2.C0.R = true;
                if (wmVar2.g9) {
                    wmVar2.v8(false, true, 0.0f);
                } else {
                    wmVar2.g9 = true;
                }
                mj mjVar2 = wmVar2.a0;
                if (mjVar2 != null && mjVar2.getEditField() != null) {
                    wmVar2.a0.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
        }
    }
}
