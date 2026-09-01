package h1;

import android.database.DataSetObserver;
import m.b3;
import m.d2;
import m2.h;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.l01;
import org.telegram.ui.xy0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
                b3 b3Var = (b3) this.b;
                b3Var.a = true;
                b3Var.notifyDataSetChanged();
                break;
            case 1:
                d2 d2Var = (d2) this.b;
                if (d2Var.L.isShowing()) {
                    d2Var.g();
                    break;
                }
                break;
            case 2:
                ((h) this.b).f();
                break;
            default:
                l01 l01Var = (l01) this.b;
                ProfileActivity profileActivity = l01Var.n;
                int realCount = profileActivity.k0.getRealCount();
                if (profileActivity.x0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.K.B) {
                    profileActivity.x0 = 1;
                }
                l01Var.a(false);
                l01Var.b(1.0f);
                if (profileActivity.n0 != null) {
                    if (!profileActivity.Q0.t()) {
                        l01Var.c();
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new xy0(l01Var, 3), 500L);
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
                b3 b3Var = (b3) this.b;
                b3Var.a = false;
                b3Var.notifyDataSetInvalidated();
                break;
            case 1:
                ((d2) this.b).dismiss();
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
