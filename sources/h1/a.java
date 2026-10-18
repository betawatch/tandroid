package h1;

import android.database.DataSetObserver;
import m.b3;
import m.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.g01;
import org.telegram.ui.sy0;
import z4.g;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
                e2 e2Var = (e2) this.b;
                if (e2Var.O.isShowing()) {
                    e2Var.g();
                    break;
                }
                break;
            case 2:
                g01 g01Var = (g01) this.b;
                ProfileActivity profileActivity = g01Var.n;
                int realCount = profileActivity.o0.getRealCount();
                if (profileActivity.B0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.N.E) {
                    profileActivity.B0 = 1;
                }
                g01Var.a(false);
                g01Var.b(1.0f);
                if (profileActivity.r0 != null) {
                    if (!profileActivity.U0.t()) {
                        g01Var.c();
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new sy0(g01Var, 3), 500L);
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
                b3 b3Var = (b3) this.b;
                b3Var.a = false;
                b3Var.notifyDataSetInvalidated();
                break;
            case 1:
                ((e2) this.b).dismiss();
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
