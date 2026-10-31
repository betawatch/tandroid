package jg;

import android.view.View;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.er0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r0 b;

    public /* synthetic */ k(r0 r0Var, int i10) {
        this.a = i10;
        this.b = r0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                r0 r0Var = this.b;
                if (!r0Var.C0) {
                    r0Var.A0(0);
                    break;
                } else {
                    r0Var.q0(null, true);
                    break;
                }
            case 1:
                r0 r0Var2 = this.b;
                int i10 = r0Var2.P0;
                r0Var2.A0(1);
                r0Var2.postDelayed(new n(r0Var2, 1), 350L);
                e0 e0Var = new e0(r0Var2.getContext(), r0Var2.z1, false, false);
                e0Var.v1 = new s(r0Var2);
                e0Var.N0(new v(r0Var2, 0));
                e0Var.setOnDismissListener(new w(r0Var2, i10));
                e0Var.show();
                PhotoViewer photoViewer = ((er0) r0Var2).X1;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.v0();
                    photoViewer.F2.g0();
                    break;
                }
                break;
            case 2:
                r0 r0Var3 = this.b;
                j jVar = r0Var3.B0;
                if ((jVar instanceof g3) && !r0Var3.C0) {
                    g3 g3Var = (g3) jVar;
                    r0Var3.C0 = true;
                    g3Var.q();
                    View focusedView = g3Var.getFocusedView();
                    focusedView.requestFocus();
                    org.telegram.messenger.i0.J3(focusedView);
                }
                org.telegram.ui.ActionBar.k1 k1Var = r0Var3.A1;
                if (k1Var != null && k1Var.isShowing()) {
                    r0Var3.A1.d(true);
                    break;
                }
                break;
            case 3:
                r0.Z(this.b);
                break;
            default:
                r0 r0Var4 = this.b;
                r0Var4.A0(2);
                if (!(r0Var4.B0 instanceof g3)) {
                    r0Var4.h0(true);
                    break;
                }
                break;
        }
    }
}
