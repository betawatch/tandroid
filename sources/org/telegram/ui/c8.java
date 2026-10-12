package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class c8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c8(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                i8 i8Var = (i8) this.b;
                l8 l8Var = i8Var.x;
                if (i8Var.n != null && l8Var.G) {
                    int i10 = -1;
                    int i11 = -1;
                    for (int i12 = 0; i12 < i8Var.d; i12++) {
                        j8 j8Var = (j8) i8Var.n.get(i12, null);
                        if (j8Var != null) {
                            if (i10 == -1) {
                                i10 = j8Var.h;
                            }
                            i11 = j8Var.h;
                        }
                    }
                    if (i10 >= 0 && i11 >= 0) {
                        l8Var.P = i10;
                        l8Var.Q = i11;
                        l8Var.t0();
                        l8Var.o0();
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.Components.sc.e();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b).getSwipeBack().b(true);
                break;
            case 2:
                if (((b91) this.b).a.getImageReceiver().getLottieAnimation() != null && !((b91) this.b).a.getImageReceiver().getLottieAnimation().k0) {
                    ((b91) this.b).a.getImageReceiver().getLottieAnimation().N(0, false, false);
                    ((b91) this.b).a.getImageReceiver().getLottieAnimation().H(false);
                    break;
                }
                break;
            default:
                ((lg1) this.b).H0(true);
                break;
        }
    }
}
