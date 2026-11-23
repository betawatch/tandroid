package hi;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class j5 extends r2 {
    public final /* synthetic */ int E1;
    public final /* synthetic */ v5 F1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(v5 v5Var, Context context, n5 n5Var, int i7) {
        super(context, n5Var, false, false);
        this.F1 = v5Var;
        this.E1 = i7;
    }

    @Override // hi.r2
    public final boolean J0(Integer num) {
        q5 q5Var = this.F1.B0;
        if (num.intValue() == 3) {
            int i7 = 0;
            for (int i10 = 0; i10 < q5Var.getChildCount(); i10++) {
                if (q5Var.getChildAt(i10) instanceof tg.v1) {
                    i7++;
                }
            }
            int i11 = mp.u1(this.a).r5;
            org.telegram.ui.ActionBar.m2 m2Var = this.c;
            if (i7 >= i11 && !i10.i(this.a).q()) {
                String G = gd.G(mp.u1(this.a).s5, "StoryPremiumWidgets2", new Object[0]);
                try {
                    m2Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                new org.telegram.ui.Components.kc(m2Var, this.J0).I(R.raw.star_premium_2, gd.N0(2131749006, null), org.telegram.messenger.g0.R2(G, org.telegram.ui.ActionBar.n6.Xc, 0, new w(this, 5), this.J0)).k(true);
                return false;
            }
            if (i7 >= mp.u1(this.a).s5) {
                try {
                    m2Var.performHapticFeedback(3);
                } catch (Exception unused2) {
                }
                new org.telegram.ui.Components.kc(m2Var, this.J0).I(R.raw.chats_infotip, gd.N0(2131748785, "LimitReached"), gd.G(mp.u1(this.a).s5, "StoryReactionsWidgetLimit2", new Object[0])).k(true);
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0043 A[RETURN] */
    @Override // hi.r2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean K0(Integer num) {
        a0 a0Var;
        v5 v5Var = this.F1;
        q5 q5Var = v5Var.B0;
        boolean z10 = false;
        if (v5Var.H1) {
            return num.intValue() == 2;
        }
        if (num.intValue() == 5) {
            int i7 = 0;
            while (true) {
                if (i7 >= q5Var.getChildCount()) {
                    break;
                }
                if (q5Var.getChildAt(i7) instanceof tg.r2) {
                    z10 = true;
                    break;
                }
                i7++;
            }
            return !z10;
        }
        if (num.intValue() != 6 || ((a0Var = v5Var.U1) != null && a0Var.c())) {
        }
    }

    @Override // hi.r2
    public final boolean L0(Runnable runnable) {
        nb nbVar = ((pa) this.F1).o2;
        Activity activity = nbVar.b;
        if (activity == null) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0) {
                return true;
            }
            activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, ks.A1);
            nbVar.z2 = (ai.u0) runnable;
            return false;
        }
        if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, ks.A1);
        nbVar.z2 = (ai.u0) runnable;
        return false;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void n0() {
        this.F1.R0(this.E1);
    }
}
