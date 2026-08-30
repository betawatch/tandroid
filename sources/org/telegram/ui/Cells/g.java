package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.oy;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                i90 i90Var = hVar.d;
                if (i90Var != null) {
                    hVar.h.B.l(i90Var, true);
                    break;
                }
                break;
            case 1:
                k1 k1Var = ((u1) this.b).e;
                if (k1Var != null) {
                    k1Var.j();
                    break;
                }
                break;
            case 2:
                ((a2) this.b).a();
                break;
            case 3:
                AndroidUtilities.hideKeyboard(((kh.z5) this.b).b.getEditText());
                break;
            case 4:
                AndroidUtilities.hideKeyboard(((i3) this.b).b);
                break;
            case 5:
                h6 h6Var = (h6) this.b;
                if (!(h6Var.getParent() instanceof sl0)) {
                    h6Var.callOnClick();
                    break;
                } else {
                    ((sl0) h6Var.getParent()).getOnItemClickListener().f(RecyclerView.R(h6Var), h6Var);
                    break;
                }
            case 6:
                ((r7) this.b).h();
                break;
            case 7:
                z9 z9Var = (z9) this.b;
                z9Var.C.invalidate();
                z9Var.U();
                break;
            case 8:
                ((j9) this.b).b.U();
                break;
            case 9:
                ea eaVar = (ea) this.b;
                eaVar.s = -1;
                int i10 = 0;
                while (true) {
                    t1[] t1VarArr = eaVar.e;
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
                oy oyVar = (oy) this.b;
                ic.e();
                oyVar.presentFragment(new SessionsActivity(0));
                break;
            default:
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.b;
                g3Var.setCanDismissWithSwipe(true);
                g3Var.setCanDismissWithTouchOutside(true);
                break;
        }
    }
}
