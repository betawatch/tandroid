package h1;

import android.database.DataSetObserver;
import m.c3;
import m.e2;
import m2.h;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.q01;
import org.telegram.ui.sz0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class a extends DataSetObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.a) {
            case 0:
                c3 c3Var = (c3) this.b;
                c3Var.a = true;
                c3Var.notifyDataSetChanged();
                break;
            case 1:
                e2 e2Var = (e2) this.b;
                if (e2Var.L.isShowing()) {
                    e2Var.g();
                    break;
                }
                break;
            case 2:
                ((h) this.b).f();
                break;
            default:
                q01 q01Var = (q01) this.b;
                ProfileActivity profileActivity = q01Var.n;
                int realCount = profileActivity.k0.getRealCount();
                if (profileActivity.x0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.K.B) {
                    profileActivity.x0 = 1;
                }
                q01Var.a(false);
                q01Var.b(1.0f);
                if (profileActivity.n0 != null) {
                    if (!profileActivity.Q0.t()) {
                        q01Var.c();
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new sz0(q01Var, 2), 500L);
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
                c3 c3Var = (c3) this.b;
                c3Var.a = false;
                c3Var.notifyDataSetInvalidated();
                break;
            case 1:
                ((e2) this.b).dismiss();
                break;
            case 2:
                ((h) this.b).f();
                break;
            default:
                super.onInvalidated();
                break;
        }
    }
}
