package hi;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class z4 extends j2 {
    public final /* synthetic */ int D1;
    public final /* synthetic */ l5 E1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(l5 l5Var, Context context, d5 d5Var, int i7) {
        super(context, d5Var, false, false);
        this.E1 = l5Var;
        this.D1 = i7;
    }

    @Override // hi.j2
    public final boolean J0(Integer num) {
        g5 g5Var = this.E1.B0;
        if (num.intValue() == 3) {
            int i7 = 0;
            for (int i10 = 0; i10 < g5Var.getChildCount(); i10++) {
                if (g5Var.getChildAt(i10) instanceof tg.q1) {
                    i7++;
                }
            }
            int i11 = mp.u1(this.a).r5;
            org.telegram.ui.ActionBar.n2 n2Var = this.c;
            if (i7 >= i11 && !j10.i(this.a).q()) {
                String G = gd.G(mp.u1(this.a).s5, "StoryPremiumWidgets2", new Object[0]);
                try {
                    n2Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                new lc(n2Var, this.J0).I(R.raw.star_premium_2, gd.M0(2131749007, null), org.telegram.messenger.g0.R2(G, org.telegram.ui.ActionBar.n6.Xc, 0, new k(this, 4), this.J0)).k(true);
                return false;
            }
            if (i7 >= mp.u1(this.a).s5) {
                try {
                    n2Var.performHapticFeedback(3);
                } catch (Exception unused2) {
                }
                new lc(n2Var, this.J0).I(R.raw.chats_infotip, gd.M0(2131748786, "LimitReached"), gd.G(mp.u1(this.a).s5, "StoryReactionsWidgetLimit2", new Object[0])).k(true);
                return false;
            }
        }
        return true;
    }

    @Override // hi.j2
    public final boolean K0(Integer num) {
        l5 l5Var = this.E1;
        g5 g5Var = l5Var.B0;
        boolean z10 = false;
        if (l5Var.H1) {
            if (num.intValue() != 2) {
                return false;
            }
        } else if (num.intValue() == 5) {
            int i7 = 0;
            while (true) {
                if (i7 >= g5Var.getChildCount()) {
                    break;
                }
                if (g5Var.getChildAt(i7) instanceof tg.n2) {
                    z10 = true;
                    break;
                }
                i7++;
            }
            return !z10;
        }
        return true;
    }

    @Override // hi.j2
    public final boolean L0(Runnable runnable) {
        ta taVar = ((v9) this.E1).k2;
        Activity activity = taVar.b;
        if (activity == null) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0) {
                return true;
            }
            activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, ks.A1);
            taVar.z2 = (ai.w0) runnable;
            return false;
        }
        if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, ks.A1);
        taVar.z2 = (ai.w0) runnable;
        return false;
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void n0() {
        this.E1.O0(this.D1);
    }
}
