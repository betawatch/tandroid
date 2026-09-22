package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.r90;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.uy;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                r90 r90Var = hVar.d;
                if (r90Var != null) {
                    hVar.h.E.l(r90Var, true);
                    break;
                }
                break;
            case 1:
                l1 l1Var = ((v1) this.b).e;
                if (l1Var != null) {
                    l1Var.k();
                    break;
                }
                break;
            case 2:
                ((b2) this.b).a();
                break;
            case 3:
                AndroidUtilities.hideKeyboard(((xh.u4) this.b).b.getEditText());
                break;
            case 4:
                AndroidUtilities.hideKeyboard(((k3) this.b).b);
                break;
            case 5:
                j6 j6Var = (j6) this.b;
                if (!(j6Var.getParent() instanceof yl0)) {
                    j6Var.callOnClick();
                    break;
                } else {
                    ((yl0) j6Var.getParent()).getOnItemClickListener().d(RecyclerView.S(j6Var), j6Var);
                    break;
                }
            case 6:
                ((u7) this.b).h();
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
                ja jaVar = (ja) this.b;
                jaVar.s = -1;
                int i10 = 0;
                while (true) {
                    u1[] u1VarArr = jaVar.e;
                    if (i10 >= u1VarArr.length) {
                        break;
                    } else {
                        u1 u1Var = u1VarArr[i10];
                        if (u1Var != null) {
                            u1Var.invalidate();
                        }
                        i10++;
                    }
                }
            case 10:
                uy uyVar = (uy) this.b;
                pc.e();
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
