package bg;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ws0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g1 b;

    public /* synthetic */ l(g1 g1Var, int i10) {
        this.a = i10;
        this.b = g1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                g1 g1Var = this.b;
                if (!g1Var.P0) {
                    g1Var.B0(0);
                    break;
                } else {
                    g1Var.r0(null, true);
                    break;
                }
            case 1:
                g1 g1Var2 = this.b;
                int i10 = g1Var2.c1;
                g1Var2.B0(1);
                g1Var2.postDelayed(new r(g1Var2, 1), 350L);
                n0 n0Var = new n0(g1Var2.getContext(), g1Var2.M1, false, false);
                n0Var.y = new x(g1Var2);
                n0Var.q0(new b0(g1Var2, 0));
                n0Var.setOnDismissListener(new c0(g1Var2, i10));
                n0Var.show();
                PhotoViewer photoViewer = ((ws0) g1Var2).k2;
                if (photoViewer.B2 != null) {
                    photoViewer.D2 = false;
                    photoViewer.u0();
                    photoViewer.B2.C();
                    break;
                }
                break;
            case 2:
                g1 g1Var3 = this.b;
                k kVar = g1Var3.O0;
                if ((kVar instanceof f4) && !g1Var3.P0) {
                    f4 f4Var = (f4) kVar;
                    g1Var3.P0 = true;
                    f4Var.q();
                    View focusedView = f4Var.getFocusedView();
                    focusedView.requestFocus();
                    AndroidUtilities.showKeyboard(focusedView);
                }
                org.telegram.ui.ActionBar.o1 o1Var = g1Var3.N1;
                if (o1Var != null && o1Var.isShowing()) {
                    g1Var3.N1.d(true);
                    break;
                }
                break;
            case 3:
                g1.b0(this.b);
                break;
            default:
                g1 g1Var4 = this.b;
                g1Var4.B0(2);
                if (!(g1Var4.O0 instanceof f4)) {
                    g1Var4.j0(true);
                    break;
                }
                break;
        }
    }
}
