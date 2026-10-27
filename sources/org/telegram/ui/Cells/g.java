package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.ey;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                ea0 ea0Var = hVar.d;
                if (ea0Var != null) {
                    hVar.h.E.l(ea0Var, true);
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
                AndroidUtilities.hideKeyboard(((zh.t4) this.b).b.getEditText());
                break;
            case 4:
                AndroidUtilities.hideKeyboard(((g3) this.b).d);
                break;
            case 5:
                m6 m6Var = (m6) this.b;
                if (!(m6Var.getParent() instanceof nm0)) {
                    m6Var.callOnClick();
                    break;
                } else {
                    ((nm0) m6Var.getParent()).getOnItemClickListener().c(RecyclerView.R(m6Var), m6Var);
                    break;
                }
            case 6:
                ((w7) this.b).h();
                break;
            case 7:
                fa faVar = (fa) this.b;
                faVar.C.invalidate();
                faVar.T();
                break;
            case 8:
                ((p9) this.b).b.T();
                break;
            case 9:
                ka kaVar = (ka) this.b;
                kaVar.s = -1;
                int i10 = 0;
                while (true) {
                    s1[] s1VarArr = kaVar.e;
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
                ey eyVar = (ey) this.b;
                qc.e();
                eyVar.presentFragment(new SessionsActivity(0));
                break;
            default:
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) this.b;
                k3Var.setCanDismissWithSwipe(true);
                k3Var.setCanDismissWithTouchOutside(true);
                break;
        }
    }
}
