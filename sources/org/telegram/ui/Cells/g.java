package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.p90;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.uy;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
                p90 p90Var = hVar.d;
                if (p90Var != null) {
                    hVar.h.E.l(p90Var, true);
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
                AndroidUtilities.hideKeyboard(((j3) this.b).b);
                break;
            case 5:
                i6 i6Var = (i6) this.b;
                if (!(i6Var.getParent() instanceof wl0)) {
                    i6Var.callOnClick();
                    break;
                } else {
                    ((wl0) i6Var.getParent()).getOnItemClickListener().d(RecyclerView.S(i6Var), i6Var);
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
                    u1[] u1VarArr = iaVar.e;
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
