package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.uy;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                i6 i6Var = (i6) this.b;
                if (!(i6Var.getParent() instanceof ll0)) {
                    i6Var.callOnClick();
                    break;
                } else {
                    ((ll0) i6Var.getParent()).getOnItemClickListener().d(RecyclerView.R(i6Var), i6Var);
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
                uy uyVar = (uy) this.b;
                oc.e();
                uyVar.presentFragment(new SessionsActivity(0));
                break;
            default:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.b;
                f3Var.setCanDismissWithSwipe(true);
                f3Var.setCanDismissWithTouchOutside(true);
                break;
        }
    }
}
