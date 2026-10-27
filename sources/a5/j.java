package a5;

import android.database.DataSetObserver;
import m.a3;
import m.d2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.o01;
import org.telegram.ui.oy0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class j extends DataSetObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.a) {
            case 0:
                ((m) this.b).f();
                break;
            case 1:
                a3 a3Var = (a3) this.b;
                a3Var.a = true;
                a3Var.notifyDataSetChanged();
                break;
            case 2:
                d2 d2Var = (d2) this.b;
                if (d2Var.O.isShowing()) {
                    d2Var.h();
                    break;
                }
                break;
            default:
                o01 o01Var = (o01) this.b;
                ProfileActivity profileActivity = o01Var.n;
                int realCount = profileActivity.n0.getRealCount();
                if (profileActivity.A0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.M.E) {
                    profileActivity.A0 = 1;
                }
                o01Var.a(false);
                o01Var.b(1.0f);
                if (profileActivity.q0 != null) {
                    if (!profileActivity.T0.x()) {
                        o01Var.c();
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new oy0(o01Var, 5), 500L);
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
                ((m) this.b).f();
                break;
            case 1:
                a3 a3Var = (a3) this.b;
                a3Var.a = false;
                a3Var.notifyDataSetInvalidated();
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
