package h1;

import android.database.DataSetObserver;
import m.c3;
import m.f2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.h11;
import org.telegram.ui.tz0;
import z4.g;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                f2 f2Var = (f2) this.b;
                if (f2Var.O.isShowing()) {
                    f2Var.g();
                    break;
                }
                break;
            case 2:
                h11 h11Var = (h11) this.b;
                ProfileActivity profileActivity = h11Var.n;
                int realCount = profileActivity.n0.getRealCount();
                if (profileActivity.A0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.N.E) {
                    profileActivity.A0 = 1;
                }
                h11Var.a(false);
                h11Var.b(1.0f);
                if (profileActivity.q0 != null) {
                    if (!profileActivity.T0.t()) {
                        h11Var.c();
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new tz0(h11Var, 3), 500L);
                        break;
                    }
                }
                break;
            default:
                ((g) this.b).f();
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
                ((f2) this.b).dismiss();
                break;
            case 2:
            default:
                super.onInvalidated();
                break;
            case 3:
                ((g) this.b).f();
                break;
        }
    }
}
