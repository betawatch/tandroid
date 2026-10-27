package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                wn wnVar = (wn) obj;
                wnVar.g9 = null;
                wnVar.j9 = null;
                wnVar.i9 = null;
                wnVar.z0.R = true;
                wnVar.p8(false, true, 0.0f);
                jk jkVar = wnVar.Y;
                if (jkVar != null && jkVar.getEditField() != null) {
                    wnVar.Y.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
            case 2:
                kj kjVar = (kj) obj;
                kjVar.b = null;
                wn wnVar2 = kjVar.w;
                wnVar2.g9 = null;
                wnVar2.j9 = null;
                wnVar2.i9 = null;
                wnVar2.z0.R = true;
                if (wnVar2.h9) {
                    wnVar2.p8(false, true, 0.0f);
                } else {
                    wnVar2.h9 = true;
                }
                jk jkVar2 = wnVar2.Y;
                if (jkVar2 != null && jkVar2.getEditField() != null) {
                    wnVar2.Y.getEditField().setAllowDrawCursor(true);
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
