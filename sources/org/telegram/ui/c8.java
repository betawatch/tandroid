package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                if (i8Var.n != null && l8Var.D) {
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
                        l8Var.M = i10;
                        l8Var.N = i11;
                        l8Var.t0();
                        l8Var.o0();
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.Components.ic.e();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b).getSwipeBack().b(true);
                break;
            case 2:
                if (((j81) this.b).a.getImageReceiver().getLottieAnimation() != null && !((j81) this.b).a.getImageReceiver().getLottieAnimation().i0) {
                    ((j81) this.b).a.getImageReceiver().getLottieAnimation().L(0, false, false);
                    ((j81) this.b).a.getImageReceiver().getLottieAnimation().F(false);
                    break;
                }
                break;
            default:
                ((sf1) this.b).H0(true);
                break;
        }
    }
}
