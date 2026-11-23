package hi;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class y4 extends i2 {
    public final /* synthetic */ int D1;
    public final /* synthetic */ k5 E1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(k5 k5Var, Context context, c5 c5Var, int i7) {
        super(context, c5Var, false, false);
        this.E1 = k5Var;
        this.D1 = i7;
    }

    @Override // hi.i2
    public final boolean J0(Integer num) {
        f5 f5Var = this.E1.B0;
        if (num.intValue() == 3) {
            int i7 = 0;
            for (int i10 = 0; i10 < f5Var.getChildCount(); i10++) {
                if (f5Var.getChildAt(i10) instanceof tg.s1) {
                    i7++;
                }
            }
            int i11 = np.u1(this.a).r5;
            org.telegram.ui.ActionBar.m2 m2Var = this.c;
            if (i7 >= i11 && !k10.i(this.a).q()) {
                String G = hd.G(np.u1(this.a).s5, "StoryPremiumWidgets2", new Object[0]);
                try {
                    m2Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                new lc(m2Var, this.J0).I(R.raw.star_premium_2, hd.N0(2131749006, null), org.telegram.messenger.g0.R2(G, org.telegram.ui.ActionBar.m6.Xc, 0, new l(this, 4), this.J0)).k(true);
                return false;
            }
            if (i7 >= np.u1(this.a).s5) {
                try {
                    m2Var.performHapticFeedback(3);
                } catch (Exception unused2) {
                }
                new lc(m2Var, this.J0).I(R.raw.chats_infotip, hd.N0(2131748785, "LimitReached"), hd.G(np.u1(this.a).s5, "StoryReactionsWidgetLimit2", new Object[0])).k(true);
                return false;
            }
        }
        return true;
    }

    @Override // hi.i2
    public final boolean K0(Integer num) {
        k5 k5Var = this.E1;
        f5 f5Var = k5Var.B0;
        boolean z10 = false;
        if (k5Var.H1) {
            if (num.intValue() != 2) {
                return false;
            }
        } else if (num.intValue() == 5) {
            int i7 = 0;
            while (true) {
                if (i7 >= f5Var.getChildCount()) {
                    break;
                }
                if (f5Var.getChildAt(i7) instanceof tg.o2) {
                    z10 = true;
                    break;
                }
                i7++;
            }
            return !z10;
        }
        return true;
    }

    @Override // hi.i2
    public final boolean L0(Runnable runnable) {
        sa saVar = ((u9) this.E1).k2;
        Activity activity = saVar.b;
        if (activity == null) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0) {
                return true;
            }
            activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, ls.A1);
            saVar.z2 = (ai.c1) runnable;
            return false;
        }
        if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, ls.A1);
        saVar.z2 = (ai.c1) runnable;
        return false;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void n0() {
        this.E1.O0(this.D1);
    }
}
