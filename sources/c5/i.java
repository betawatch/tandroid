package c5;

import android.database.DataSetObserver;
import m.d2;
import m.y2;
import org.telegram.messenger.g0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ow0;
import org.telegram.ui.ru0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class i extends DataSetObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i(Object obj, int i7) {
        this.a = i7;
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
                ow0 ow0Var = (ow0) this.b;
                ProfileActivity profileActivity = ow0Var.n;
                int realCount = profileActivity.o0.getRealCount();
                if (profileActivity.B0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.N.F) {
                    profileActivity.B0 = 1;
                }
                ow0Var.a(false);
                ow0Var.b(1.0f);
                if (profileActivity.r0 != null) {
                    if (!profileActivity.T0.y()) {
                        ow0Var.c();
                        break;
                    } else {
                        g0.h3(new ru0(ow0Var, 4), 500L);
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
