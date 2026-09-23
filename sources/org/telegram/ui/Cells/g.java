package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.ry;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                h90 h90Var = hVar.d;
                if (h90Var != null) {
                    hVar.h.E.l(h90Var, true);
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
                AndroidUtilities.hideKeyboard(((xh.u4) this.b).b.getEditText());
                break;
            case 4:
                AndroidUtilities.hideKeyboard(((i3) this.b).b);
                break;
            case 5:
                i6 i6Var = (i6) this.b;
                if (!(i6Var.getParent() instanceof ml0)) {
                    i6Var.callOnClick();
                    break;
                } else {
                    ((ml0) i6Var.getParent()).getOnItemClickListener().d(RecyclerView.R(i6Var), i6Var);
                    break;
                }
            case 6:
                ((t7) this.b).h();
                break;
            case 7:
                ea eaVar = (ea) this.b;
                eaVar.C.invalidate();
                eaVar.U();
                break;
            case 8:
                ((o9) this.b).b.U();
                break;
            case 9:
                ka kaVar = (ka) this.b;
                kaVar.s = -1;
                int i10 = 0;
                while (true) {
                    t1[] t1VarArr = kaVar.e;
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
                ry ryVar = (ry) this.b;
                qc.e();
                ryVar.presentFragment(new SessionsActivity(0));
                break;
            default:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.b;
                f3Var.setCanDismissWithSwipe(true);
                f3Var.setCanDismissWithTouchOutside(true);
                break;
        }
    }
}
