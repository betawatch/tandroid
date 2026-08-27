package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.t80;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.gy;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                t80 t80Var = hVar.d;
                if (t80Var != null) {
                    hVar.h.A.l(t80Var, true);
                    break;
                }
                break;
            case 1:
                j1 j1Var = ((t1) this.b).e;
                if (j1Var != null) {
                    j1Var.k();
                    break;
                }
                break;
            case 2:
                ((z1) this.b).a();
                break;
            case 3:
                AndroidUtilities.hideKeyboard(((gh.h6) this.b).b.getEditText());
                break;
            case 4:
                AndroidUtilities.hideKeyboard(((g3) this.b).b);
                break;
            case 5:
                e6 e6Var = (e6) this.b;
                if (!(e6Var.getParent() instanceof zk0)) {
                    e6Var.callOnClick();
                    break;
                } else {
                    ((zk0) e6Var.getParent()).getOnItemClickListener().a(RecyclerView.R(e6Var), e6Var);
                    break;
                }
            case 6:
                ((o7) this.b).h();
                break;
            case 7:
                w9 w9Var = (w9) this.b;
                w9Var.C.invalidate();
                w9Var.U();
                break;
            case 8:
                ((g9) this.b).b.U();
                break;
            case 9:
                ba baVar = (ba) this.b;
                baVar.s = -1;
                int i10 = 0;
                while (true) {
                    s1[] s1VarArr = baVar.e;
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
                gy gyVar = (gy) this.b;
                ec.e();
                gyVar.presentFragment(new SessionsActivity(0));
                break;
            default:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.b;
                e3Var.setCanDismissWithSwipe(true);
                e3Var.setCanDismissWithTouchOutside(true);
                break;
        }
    }
}
