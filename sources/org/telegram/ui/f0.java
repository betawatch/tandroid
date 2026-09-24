package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
                wn wnVar = (wn) this.b;
                wnVar.Q8 = null;
                wnVar.T8 = null;
                wnVar.S8 = null;
                wnVar.z0.R = true;
                wnVar.g8(false, true, 0.0f);
                jk jkVar = wnVar.Y;
                if (jkVar != null && jkVar.getEditField() != null) {
                    wnVar.Y.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
            case 2:
                lj ljVar = (lj) this.b;
                ljVar.b = null;
                wn wnVar2 = ljVar.w;
                wnVar2.Q8 = null;
                wnVar2.T8 = null;
                wnVar2.S8 = null;
                wnVar2.z0.R = true;
                if (wnVar2.R8) {
                    wnVar2.g8(false, true, 0.0f);
                } else {
                    wnVar2.R8 = true;
                }
                jk jkVar2 = wnVar2.Y;
                if (jkVar2 != null && jkVar2.getEditField() != null) {
                    wnVar2.Y.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
            default:
                ((ProfileActivity) this.b).H3(0.0f);
                break;
        }
    }
}
