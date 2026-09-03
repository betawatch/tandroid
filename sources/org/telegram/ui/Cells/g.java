package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.qy;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h hVar = (h) this.b;
                j90 j90Var = hVar.d;
                if (j90Var != null) {
                    hVar.h.B.l(j90Var, true);
                    break;
                }
                break;
            case 1:
                j1 j1Var = ((t1) this.b).e;
                if (j1Var != null) {
                    j1Var.j();
                    break;
                }
                break;
            case 2:
                ((z1) this.b).a();
                break;
            case 3:
                AndroidUtilities.hideKeyboard(((kh.y5) this.b).b.getEditText());
                break;
            case 4:
                AndroidUtilities.hideKeyboard(((h3) this.b).b);
                break;
            case 5:
                g6 g6Var = (g6) this.b;
                if (!(g6Var.getParent() instanceof rl0)) {
                    g6Var.callOnClick();
                    break;
                } else {
                    ((rl0) g6Var.getParent()).getOnItemClickListener().d(RecyclerView.R(g6Var), g6Var);
                    break;
                }
            case 6:
                ((q7) this.b).h();
                break;
            case 7:
                y9 y9Var = (y9) this.b;
                y9Var.C.invalidate();
                y9Var.U();
                break;
            case 8:
                ((i9) this.b).b.U();
                break;
            case 9:
                da daVar = (da) this.b;
                daVar.s = -1;
                int i10 = 0;
                while (true) {
                    s1[] s1VarArr = daVar.e;
                    if (i10 >= s1VarArr.length) {
                        break;
                    } else {
                        s1 s1Var = s1VarArr[i10];
                        if (s1Var != null) {
                            s1Var.invalidate();
                        }
                        i10++;
                    }
                }
            case 10:
                qy qyVar = (qy) this.b;
                ic.e();
                qyVar.presentFragment(new SessionsActivity(0));
                break;
            default:
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.b;
                g3Var.setCanDismissWithSwipe(true);
                g3Var.setCanDismissWithTouchOutside(true);
                break;
        }
    }
}
