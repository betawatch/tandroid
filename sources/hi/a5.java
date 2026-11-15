package hi;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.ui.Components.cc;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class a5 extends i2 {
    public final /* synthetic */ int D1;
    public final /* synthetic */ m5 E1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(m5 m5Var, Context context, e5 e5Var, int i7) {
        super(context, e5Var, false, false);
        this.E1 = m5Var;
        this.D1 = i7;
    }

    @Override // hi.i2
    public final boolean I0(Integer num) {
        h5 h5Var = this.E1.B0;
        if (num.intValue() == 3) {
            int i7 = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < h5Var.getChildCount(); i11++) {
                if (h5Var.getChildAt(i11) instanceof tg.q1) {
                    i10++;
                }
            }
            int i12 = np.s1(this.a).p5;
            org.telegram.ui.ActionBar.k2 k2Var = this.c;
            if (i10 >= i12 && !m10.i(this.a).q()) {
                String G = hd.G(np.s1(this.a).q5, "StoryPremiumWidgets2", new Object[0]);
                try {
                    k2Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                new cc(k2Var, this.J0).I(R.raw.star_premium_2, hd.M0(2131749199, null), org.telegram.messenger.g0.S2(G, org.telegram.ui.ActionBar.j6.Xc, 0, new e1(this, i7), this.J0)).k(true);
                return false;
            }
            if (i10 >= np.s1(this.a).q5) {
                try {
                    k2Var.performHapticFeedback(3);
                } catch (Exception unused2) {
                }
                new cc(k2Var, this.J0).I(R.raw.chats_infotip, hd.M0(2131748978, "LimitReached"), hd.G(np.s1(this.a).q5, "StoryReactionsWidgetLimit2", new Object[0])).k(true);
                return false;
            }
        }
        return true;
    }

    @Override // hi.i2
    public final boolean J0(Integer num) {
        m5 m5Var = this.E1;
        h5 h5Var = m5Var.B0;
        boolean z10 = false;
        if (m5Var.H1) {
            if (num.intValue() != 2) {
                return false;
            }
        } else if (num.intValue() == 5) {
            int i7 = 0;
            while (true) {
                if (i7 >= h5Var.getChildCount()) {
                    break;
                }
                if (h5Var.getChildAt(i7) instanceof tg.p2) {
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
    public final boolean K0(Runnable runnable) {
        sa saVar = ((u9) this.E1).k2;
        Activity activity = saVar.b;
        if (activity == null) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0) {
                return true;
            }
            activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, ns.A1);
            saVar.z2 = (ai.v0) runnable;
            return false;
        }
        if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, ns.A1);
        saVar.z2 = (ai.v0) runnable;
        return false;
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void n0() {
        this.E1.O0(this.D1);
    }
}
