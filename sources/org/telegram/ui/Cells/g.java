package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.wy;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                q90 q90Var = hVar.d;
                if (q90Var != null) {
                    hVar.h.E.l(q90Var, true);
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
                AndroidUtilities.hideKeyboard(((wh.t4) this.b).b.getEditText());
                break;
            case 4:
                AndroidUtilities.hideKeyboard(((i3) this.b).b);
                break;
            case 5:
                j6 j6Var = (j6) this.b;
                if (!(j6Var.getParent() instanceof vl0)) {
                    j6Var.callOnClick();
                    break;
                } else {
                    ((vl0) j6Var.getParent()).getOnItemClickListener().d(RecyclerView.R(j6Var), j6Var);
                    break;
                }
            case 6:
                ((u7) this.b).h();
                break;
            case 7:
                fa faVar = (fa) this.b;
                faVar.C.invalidate();
                faVar.U();
                break;
            case 8:
                ((p9) this.b).b.U();
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
                wy wyVar = (wy) this.b;
                pc.e();
                wyVar.presentFragment(new SessionsActivity(0));
                break;
            default:
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.b;
                h3Var.setCanDismissWithSwipe(true);
                h3Var.setCanDismissWithTouchOutside(true);
                break;
        }
    }
}
