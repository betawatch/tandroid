package c5;

import android.database.DataSetObserver;
import m.e2;
import m.z2;
import org.telegram.messenger.g0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.pw0;
import org.telegram.ui.uu0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                pw0 pw0Var = (pw0) this.b;
                ProfileActivity profileActivity = pw0Var.n;
                int realCount = profileActivity.n0.getRealCount();
                if (profileActivity.A0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.M.E) {
                    profileActivity.A0 = 1;
                }
                pw0Var.a(false);
                pw0Var.b(1.0f);
                if (profileActivity.q0 != null) {
                    if (!profileActivity.S0.x()) {
                        pw0Var.c();
                        break;
                    } else {
                        g0.i3(new uu0(pw0Var, 4), 500L);
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
