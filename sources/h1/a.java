package h1;

import android.database.DataSetObserver;
import m.c3;
import m.e2;
import m2.h;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.j01;
import org.telegram.ui.vy0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                j01 j01Var = (j01) this.b;
                ProfileActivity profileActivity = j01Var.n;
                int realCount = profileActivity.k0.getRealCount();
                if (profileActivity.x0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.K.B) {
                    profileActivity.x0 = 1;
                }
                j01Var.a(false);
                j01Var.b(1.0f);
                if (profileActivity.n0 != null) {
                    if (!profileActivity.Q0.t()) {
                        j01Var.c();
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new vy0(j01Var, 3), 500L);
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
