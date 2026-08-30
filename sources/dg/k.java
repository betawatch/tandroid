package dg;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ft0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e1 b;

    public /* synthetic */ k(e1 e1Var, int i10) {
        this.a = i10;
        this.b = e1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                e1 e1Var = this.b;
                if (!e1Var.Q0) {
                    e1Var.B0(0);
                    break;
                } else {
                    e1Var.r0(null, true);
                    break;
                }
            case 1:
                e1 e1Var2 = this.b;
                int i10 = e1Var2.d1;
                e1Var2.B0(1);
                e1Var2.postDelayed(new q(e1Var2, 1), 350L);
                m0 m0Var = new m0(e1Var2.getContext(), e1Var2.N1, false, false);
                m0Var.y = new w(e1Var2);
                m0Var.q0(new a0(e1Var2, 0));
                m0Var.setOnDismissListener(new b0(e1Var2, i10));
                m0Var.show();
                PhotoViewer photoViewer = ((ft0) e1Var2).l2;
                if (photoViewer.C2 != null) {
                    photoViewer.E2 = false;
                    photoViewer.u0();
                    photoViewer.C2.B();
                    break;
                }
                break;
            case 2:
                e1 e1Var3 = this.b;
                j jVar = e1Var3.P0;
                if ((jVar instanceof b4) && !e1Var3.Q0) {
                    b4 b4Var = (b4) jVar;
                    e1Var3.Q0 = true;
                    b4Var.q();
                    View focusedView = b4Var.getFocusedView();
                    focusedView.requestFocus();
                    AndroidUtilities.showKeyboard(focusedView);
                }
                org.telegram.ui.ActionBar.p1 p1Var = e1Var3.O1;
                if (p1Var != null && p1Var.isShowing()) {
                    e1Var3.O1.d(true);
                    break;
                }
                break;
            case 3:
                e1.b0(this.b);
                break;
            default:
                e1 e1Var4 = this.b;
                e1Var4.B0(2);
                if (!(e1Var4.P0 instanceof b4)) {
                    e1Var4.j0(true);
                    break;
                }
                break;
        }
    }
}
