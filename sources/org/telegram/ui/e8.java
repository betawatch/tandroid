package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class e8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e8(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                k8 k8Var = (k8) this.b;
                n8 n8Var = k8Var.x;
                if (k8Var.n != null && n8Var.G) {
                    int i10 = -1;
                    int i11 = -1;
                    for (int i12 = 0; i12 < k8Var.d; i12++) {
                        l8 l8Var = (l8) k8Var.n.get(i12, null);
                        if (l8Var != null) {
                            if (i10 == -1) {
                                i10 = l8Var.h;
                            }
                            i11 = l8Var.h;
                        }
                    }
                    if (i10 >= 0 && i11 >= 0) {
                        n8Var.P = i10;
                        n8Var.Q = i11;
                        n8Var.x0();
                        n8Var.q0();
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.Components.qc.e();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b).getSwipeBack().b(true);
                break;
            case 2:
                if (((o71) this.b).a.getImageReceiver().getLottieAnimation() != null && !((o71) this.b).a.getImageReceiver().getLottieAnimation().k0) {
                    ((o71) this.b).a.getImageReceiver().getLottieAnimation().N(0, false, false);
                    ((o71) this.b).a.getImageReceiver().getLottieAnimation().H(false);
                    break;
                }
                break;
            default:
                ((af1) this.b).H0(true);
                break;
        }
    }
}
