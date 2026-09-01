package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.py;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
                k90 k90Var = hVar.d;
                if (k90Var != null) {
                    hVar.h.B.l(k90Var, true);
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
                AndroidUtilities.hideKeyboard(((lh.z5) this.b).b.getEditText());
                break;
            case 4:
                AndroidUtilities.hideKeyboard(((i3) this.b).b);
                break;
            case 5:
                h6 h6Var = (h6) this.b;
                if (!(h6Var.getParent() instanceof tl0)) {
                    h6Var.callOnClick();
                    break;
                } else {
                    ((tl0) h6Var.getParent()).getOnItemClickListener().f(RecyclerView.R(h6Var), h6Var);
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
                py pyVar = (py) this.b;
                ic.e();
                pyVar.presentFragment(new SessionsActivity(0));
                break;
            default:
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.b;
                h3Var.setCanDismissWithSwipe(true);
                h3Var.setCanDismissWithTouchOutside(true);
                break;
        }
    }
}
