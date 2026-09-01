package eg;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ht0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;

    public /* synthetic */ k(c1 c1Var, int i10) {
        this.a = i10;
        this.b = c1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                c1 c1Var = this.b;
                if (!c1Var.Q0) {
                    c1Var.B0(0);
                    break;
                } else {
                    c1Var.r0(null, true);
                    break;
                }
            case 1:
                c1 c1Var2 = this.b;
                int i10 = c1Var2.d1;
                c1Var2.B0(1);
                c1Var2.postDelayed(new p(c1Var2, 1), 350L);
                k0 k0Var = new k0(c1Var2.getContext(), c1Var2.N1, false, false);
                k0Var.y = new v(c1Var2);
                k0Var.q0(new y(c1Var2, 0));
                k0Var.setOnDismissListener(new z(c1Var2, i10));
                k0Var.show();
                PhotoViewer photoViewer = ((ht0) c1Var2).l2;
                if (photoViewer.C2 != null) {
                    photoViewer.E2 = false;
                    photoViewer.u0();
                    photoViewer.C2.B();
                    break;
                }
                break;
            case 2:
                c1 c1Var3 = this.b;
                j jVar = c1Var3.P0;
                if ((jVar instanceof z3) && !c1Var3.Q0) {
                    z3 z3Var = (z3) jVar;
                    c1Var3.Q0 = true;
                    z3Var.q();
                    View focusedView = z3Var.getFocusedView();
                    focusedView.requestFocus();
                    AndroidUtilities.showKeyboard(focusedView);
                }
                org.telegram.ui.ActionBar.p1 p1Var = c1Var3.O1;
                if (p1Var != null && p1Var.isShowing()) {
                    c1Var3.O1.d(true);
                    break;
                }
                break;
            case 3:
                c1.b0(this.b);
                break;
            default:
                c1 c1Var4 = this.b;
                c1Var4.B0(2);
                if (!(c1Var4.P0 instanceof z3)) {
                    c1Var4.j0(true);
                    break;
                }
                break;
        }
    }
}
