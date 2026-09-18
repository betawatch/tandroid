package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.wy;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                g90 g90Var = hVar.d;
                if (g90Var != null) {
                    hVar.h.E.l(g90Var, true);
                    break;
                }
                break;
            case 1:
                k1 k1Var = ((u1) this.b).e;
                if (k1Var != null) {
                    k1Var.k();
                    break;
                }
                break;
            case 2:
                ((a2) this.b).a();
                break;
            case 3:
                AndroidUtilities.hideKeyboard(((xh.t4) this.b).b.getEditText());
                break;
            case 4:
                AndroidUtilities.hideKeyboard(((i3) this.b).b);
                break;
            case 5:
                h6 h6Var = (h6) this.b;
                if (!(h6Var.getParent() instanceof ml0)) {
                    h6Var.callOnClick();
                    break;
                } else {
                    ((ml0) h6Var.getParent()).getOnItemClickListener().d(RecyclerView.S(h6Var), h6Var);
                    break;
                }
            case 6:
                ((t7) this.b).h();
                break;
            case 7:
                da daVar = (da) this.b;
                daVar.C.invalidate();
                daVar.U();
                break;
            case 8:
                ((n9) this.b).b.U();
                break;
            case 9:
                ja jaVar = (ja) this.b;
                jaVar.s = -1;
                int i10 = 0;
                while (true) {
                    t1[] t1VarArr = jaVar.e;
                    if (i10 >= t1VarArr.length) {
                        break;
                    } else {
                        t1 t1Var = t1VarArr[i10];
                        if (t1Var != null) {
                            t1Var.invalidate();
                        }
                        i10++;
                    }
                }
            case 10:
                wy wyVar = (wy) this.b;
                oc.e();
                wyVar.presentFragment(new SessionsActivity(0));
                break;
            default:
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.b;
                g3Var.setCanDismissWithSwipe(true);
                g3Var.setCanDismissWithTouchOutside(true);
                break;
        }
    }
}
