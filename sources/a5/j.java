package a5;

import android.database.DataSetObserver;
import m.a3;
import m.d2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.m01;
import org.telegram.ui.my0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class j extends DataSetObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.a) {
            case 0:
                ((m) this.b).f();
                break;
            case 1:
                a3 a3Var = (a3) this.b;
                a3Var.a = true;
                a3Var.notifyDataSetChanged();
                break;
            case 2:
                d2 d2Var = (d2) this.b;
                if (d2Var.O.isShowing()) {
                    d2Var.h();
                    break;
                }
                break;
            default:
                m01 m01Var = (m01) this.b;
                ProfileActivity profileActivity = m01Var.n;
                int realCount = profileActivity.n0.getRealCount();
                if (profileActivity.A0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.M.E) {
                    profileActivity.A0 = 1;
                }
                m01Var.a(false);
                m01Var.b(1.0f);
                if (profileActivity.q0 != null) {
                    if (!profileActivity.T0.x()) {
                        m01Var.c();
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new my0(m01Var, 5), 500L);
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        switch (this.a) {
            case 0:
                ((m) this.b).f();
                break;
            case 1:
                a3 a3Var = (a3) this.b;
                a3Var.a = false;
                a3Var.notifyDataSetInvalidated();
                break;
            case 2:
                ((d2) this.b).dismiss();
                break;
            default:
                super.onInvalidated();
                break;
        }
    }
}
