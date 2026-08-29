package h1;

import android.database.DataSetObserver;
import m.c3;
import m.e2;
import m2.g;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ky0;
import org.telegram.ui.yz0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                if (e2Var.K.isShowing()) {
                    e2Var.h();
                    break;
                }
                break;
            case 2:
                ((g) this.b).f();
                break;
            default:
                yz0 yz0Var = (yz0) this.b;
                ProfileActivity profileActivity = yz0Var.n;
                int realCount = profileActivity.j0.getRealCount();
                if (profileActivity.w0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.J.A) {
                    profileActivity.w0 = 1;
                }
                yz0Var.a(false);
                yz0Var.b(1.0f);
                if (profileActivity.m0 != null) {
                    if (!profileActivity.P0.t()) {
                        yz0Var.c();
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new ky0(yz0Var, 3), 500L);
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
                ((g) this.b).f();
                break;
            default:
                super.onInvalidated();
                break;
        }
    }
}
