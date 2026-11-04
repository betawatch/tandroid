package b5;

import android.database.DataSetObserver;
import m.d2;
import m.y2;
import org.telegram.messenger.g0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ew0;
import org.telegram.ui.pu0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class i extends DataSetObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.a) {
            case 0:
                ((l) this.b).f();
                break;
            case 1:
                y2 y2Var = (y2) this.b;
                y2Var.a = true;
                y2Var.notifyDataSetChanged();
                break;
            case 2:
                d2 d2Var = (d2) this.b;
                if (d2Var.P.isShowing()) {
                    d2Var.g();
                    break;
                }
                break;
            default:
                ew0 ew0Var = (ew0) this.b;
                ProfileActivity profileActivity = ew0Var.n;
                int realCount = profileActivity.o0.getRealCount();
                if (profileActivity.B0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.N.F) {
                    profileActivity.B0 = 1;
                }
                ew0Var.a(false);
                ew0Var.b(1.0f);
                if (profileActivity.r0 != null) {
                    if (!profileActivity.T0.x()) {
                        ew0Var.c();
                        break;
                    } else {
                        g0.i3(new pu0(ew0Var, 3), 500L);
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
                ((l) this.b).f();
                break;
            case 1:
                y2 y2Var = (y2) this.b;
                y2Var.a = false;
                y2Var.notifyDataSetInvalidated();
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
