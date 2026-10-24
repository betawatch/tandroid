package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class b8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b8(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                h8 h8Var = (h8) this.b;
                k8 k8Var = h8Var.x;
                if (h8Var.n != null && k8Var.G) {
                    int i10 = -1;
                    int i11 = -1;
                    for (int i12 = 0; i12 < h8Var.d; i12++) {
                        i8 i8Var = (i8) h8Var.n.get(i12, null);
                        if (i8Var != null) {
                            if (i10 == -1) {
                                i10 = i8Var.h;
                            }
                            i11 = i8Var.h;
                        }
                    }
                    if (i10 >= 0 && i11 >= 0) {
                        k8Var.P = i10;
                        k8Var.Q = i11;
                        k8Var.u0();
                        k8Var.o0();
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.Components.qc.e();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b).getSwipeBack().b(true);
                break;
            case 2:
                if (((m71) this.b).a.getImageReceiver().getLottieAnimation() != null && !((m71) this.b).a.getImageReceiver().getLottieAnimation().k0) {
                    ((m71) this.b).a.getImageReceiver().getLottieAnimation().N(0, false, false);
                    ((m71) this.b).a.getImageReceiver().getLottieAnimation().H(false);
                    break;
                }
                break;
            default:
                ((ye1) this.b).G0(true);
                break;
        }
    }
}
