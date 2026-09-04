package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.uy;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
                    k1Var.j();
                    break;
                }
                break;
            case 2:
                ((a2) this.b).a();
                break;
            case 3:
                AndroidUtilities.hideKeyboard(((yh.s4) this.b).b.getEditText());
                break;
            case 4:
                AndroidUtilities.hideKeyboard(((i3) this.b).b);
                break;
            case 5:
                h6 h6Var = (h6) this.b;
                if (!(h6Var.getParent() instanceof ll0)) {
                    h6Var.callOnClick();
                    break;
                } else {
                    ((ll0) h6Var.getParent()).getOnItemClickListener().a(RecyclerView.R(h6Var), h6Var);
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
                ia iaVar = (ia) this.b;
                iaVar.s = -1;
                int i10 = 0;
                while (true) {
                    t1[] t1VarArr = iaVar.e;
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
                qc.e();
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
