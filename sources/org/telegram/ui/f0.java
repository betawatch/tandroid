package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
                yn ynVar = (yn) this.b;
                ynVar.O8 = null;
                ynVar.R8 = null;
                ynVar.Q8 = null;
                ynVar.x0.R = true;
                ynVar.g8(false, true, 0.0f);
                jk jkVar = ynVar.W;
                if (jkVar != null && jkVar.getEditField() != null) {
                    ynVar.W.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
            case 2:
                mj mjVar = (mj) this.b;
                mjVar.b = null;
                yn ynVar2 = mjVar.w;
                ynVar2.O8 = null;
                ynVar2.R8 = null;
                ynVar2.Q8 = null;
                ynVar2.x0.R = true;
                if (ynVar2.P8) {
                    ynVar2.g8(false, true, 0.0f);
                } else {
                    ynVar2.P8 = true;
                }
                jk jkVar2 = ynVar2.W;
                if (jkVar2 != null && jkVar2.getEditField() != null) {
                    ynVar2.W.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
            default:
                ((ProfileActivity) this.b).H3(0.0f);
                break;
        }
    }
}
