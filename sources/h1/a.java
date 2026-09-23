package h1;

import android.database.DataSetObserver;
import m.d2;
import m.z2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.v01;
import org.telegram.ui.xz0;
import z4.g;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                v01 v01Var = (v01) this.b;
                ProfileActivity profileActivity = v01Var.n;
                int realCount = profileActivity.n0.getRealCount();
                if (profileActivity.A0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.N.E) {
                    profileActivity.A0 = 1;
                }
                v01Var.a(false);
                v01Var.b(1.0f);
                if (profileActivity.q0 != null) {
                    if (!profileActivity.T0.t()) {
                        v01Var.c();
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new xz0(v01Var, 2), 500L);
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
