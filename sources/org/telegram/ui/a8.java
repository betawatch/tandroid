package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class a8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a8(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                g8 g8Var = (g8) this.b;
                j8 j8Var = g8Var.x;
                if (g8Var.n != null && j8Var.G) {
                    int i10 = -1;
                    int i11 = -1;
                    for (int i12 = 0; i12 < g8Var.d; i12++) {
                        h8 h8Var = (h8) g8Var.n.get(i12, null);
                        if (h8Var != null) {
                            if (i10 == -1) {
                                i10 = h8Var.h;
                            }
                            i11 = h8Var.h;
                        }
                    }
                    if (i10 >= 0 && i11 >= 0) {
                        j8Var.P = i10;
                        j8Var.Q = i11;
                        j8Var.t0();
                        j8Var.o0();
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.Components.oc.e();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b).getSwipeBack().b(true);
                break;
            case 2:
                if (((s81) this.b).a.getImageReceiver().getLottieAnimation() != null && !((s81) this.b).a.getImageReceiver().getLottieAnimation().k0) {
                    ((s81) this.b).a.getImageReceiver().getLottieAnimation().N(0, false, false);
                    ((s81) this.b).a.getImageReceiver().getLottieAnimation().H(false);
                    break;
                }
                break;
            default:
                ((fg1) this.b).H0(true);
                break;
        }
    }
}
