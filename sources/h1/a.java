package h1;

import android.database.DataSetObserver;
import m.d2;
import m.z2;
import org.telegram.messenger.i0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ay0;
import org.telegram.ui.wv0;
import z4.g;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                z2 z2Var = (z2) this.b;
                z2Var.a = true;
                z2Var.notifyDataSetChanged();
                break;
            case 1:
                d2 d2Var = (d2) this.b;
                if (d2Var.O.isShowing()) {
                    d2Var.h();
                    break;
                }
                break;
            case 2:
                ay0 ay0Var = (ay0) this.b;
                ProfileActivity profileActivity = ay0Var.n;
                int realCount = profileActivity.n0.getRealCount();
                if (profileActivity.A0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.M.E) {
                    profileActivity.A0 = 1;
                }
                ay0Var.a(false);
                ay0Var.b(1.0f);
                if (profileActivity.q0 != null) {
                    if (!profileActivity.S0.x()) {
                        ay0Var.c();
                        break;
                    } else {
                        i0.h3(new wv0(ay0Var, 6), 500L);
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
                z2 z2Var = (z2) this.b;
                z2Var.a = false;
                z2Var.notifyDataSetInvalidated();
                break;
            case 1:
                ((d2) this.b).dismiss();
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
