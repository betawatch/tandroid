package c5;

import android.database.DataSetObserver;
import m.e2;
import m.z2;
import org.telegram.messenger.g0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.mw0;
import org.telegram.ui.ru0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class h extends DataSetObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.a) {
            case 0:
                ((k) this.b).f();
                break;
            case 1:
                z2 z2Var = (z2) this.b;
                z2Var.a = true;
                z2Var.notifyDataSetChanged();
                break;
            case 2:
                e2 e2Var = (e2) this.b;
                if (e2Var.O.isShowing()) {
                    e2Var.g();
                    break;
                }
                break;
            default:
                mw0 mw0Var = (mw0) this.b;
                ProfileActivity profileActivity = mw0Var.n;
                int realCount = profileActivity.n0.getRealCount();
                if (profileActivity.A0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.M.E) {
                    profileActivity.A0 = 1;
                }
                mw0Var.a(false);
                mw0Var.b(1.0f);
                if (profileActivity.q0 != null) {
                    if (!profileActivity.S0.x()) {
                        mw0Var.c();
                        break;
                    } else {
                        g0.i3(new ru0(mw0Var, 4), 500L);
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
                ((k) this.b).f();
                break;
            case 1:
                z2 z2Var = (z2) this.b;
                z2Var.a = false;
                z2Var.notifyDataSetInvalidated();
                break;
            case 2:
                ((e2) this.b).dismiss();
                break;
            default:
                super.onInvalidated();
                break;
        }
    }
}
