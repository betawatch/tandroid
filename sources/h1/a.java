package h1;

import android.database.DataSetObserver;
import m.d2;
import m.z2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.i11;
import org.telegram.ui.k01;
import z4.g;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                    d2Var.g();
                    break;
                }
                break;
            case 2:
                i11 i11Var = (i11) this.b;
                ProfileActivity profileActivity = i11Var.n;
                int realCount = profileActivity.n0.getRealCount();
                if (profileActivity.A0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.N.E) {
                    profileActivity.A0 = 1;
                }
                i11Var.a(false);
                i11Var.b(1.0f);
                if (profileActivity.q0 != null) {
                    if (!profileActivity.T0.t()) {
                        i11Var.c();
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new k01(i11Var, 2), 500L);
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
