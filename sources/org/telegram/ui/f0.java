package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
                l4 l4Var = (l4) this.b;
                View view = l4Var.f;
                if (view != null) {
                    l4Var.d = null;
                    view.invalidate();
                    l4Var.f = null;
                    break;
                }
                break;
            case 1:
                sn snVar = (sn) this.b;
                snVar.Q8 = null;
                snVar.T8 = null;
                snVar.S8 = null;
                snVar.z0.R = true;
                snVar.j8(false, true, 0.0f);
                hk hkVar = snVar.Y;
                if (hkVar != null && hkVar.getEditField() != null) {
                    snVar.Y.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
            case 2:
                ij ijVar = (ij) this.b;
                ijVar.b = null;
                sn snVar2 = ijVar.w;
                snVar2.Q8 = null;
                snVar2.T8 = null;
                snVar2.S8 = null;
                snVar2.z0.R = true;
                if (snVar2.R8) {
                    snVar2.j8(false, true, 0.0f);
                } else {
                    snVar2.R8 = true;
                }
                hk hkVar2 = snVar2.Y;
                if (hkVar2 != null && hkVar2.getEditField() != null) {
                    snVar2.Y.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
            default:
                ((ProfileActivity) this.b).H3(0.0f);
                break;
        }
    }
}
