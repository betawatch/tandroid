package gi;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.fc;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class a5 extends i2 {
    public final /* synthetic */ int A1;
    public final /* synthetic */ m5 B1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(m5 m5Var, Context context, e5 e5Var, int i3) {
        super(context, e5Var, false, false);
        this.B1 = m5Var;
        this.A1 = i3;
    }

    @Override // gi.i2
    public final boolean I0(Integer num) {
        h5 h5Var = this.B1.B0;
        if (num.intValue() == 3) {
            int i3 = 0;
            for (int i10 = 0; i10 < h5Var.getChildCount(); i10++) {
                if (h5Var.getChildAt(i10) instanceof ug.q1) {
                    i3++;
                }
            }
            int i11 = hp.s1(this.a).o5;
            org.telegram.ui.ActionBar.j2 j2Var = this.c;
            if (i3 >= i11 && !h10.i(this.a).q()) {
                String G = bd.G(hp.s1(this.a).p5, "StoryPremiumWidgets2", new Object[0]);
                try {
                    j2Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                new fc(j2Var, this.J0).I(R.raw.star_premium_2, bd.M0(2131749207, null), org.telegram.messenger.g0.S2(G, org.telegram.ui.ActionBar.k6.Uc, 0, new ei.z5(this, 21), this.J0)).k(true);
                return false;
            }
            if (i3 >= hp.s1(this.a).p5) {
                try {
                    j2Var.performHapticFeedback(3);
                } catch (Exception unused2) {
                }
                new fc(j2Var, this.J0).I(R.raw.chats_infotip, bd.M0(2131748986, "LimitReached"), bd.G(hp.s1(this.a).p5, "StoryReactionsWidgetLimit2", new Object[0])).k(true);
                return false;
            }
        }
        return true;
    }

    @Override // gi.i2
    public final boolean J0(Integer num) {
        m5 m5Var = this.B1;
        h5 h5Var = m5Var.B0;
        boolean z10 = false;
        if (m5Var.H1) {
            if (num.intValue() != 2) {
                return false;
            }
        } else if (num.intValue() == 5) {
            int i3 = 0;
            while (true) {
                if (i3 >= h5Var.getChildCount()) {
                    break;
                }
                if (h5Var.getChildAt(i3) instanceof ug.m2) {
                    z10 = true;
                    break;
                }
                i3++;
            }
            return !z10;
        }
        return true;
    }

    @Override // gi.i2
    public final boolean K0(Runnable runnable) {
        va vaVar = ((x9) this.B1).k2;
        Activity activity = vaVar.b;
        if (activity == null) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0) {
                return true;
            }
            activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, hs.A1);
            vaVar.z2 = (cg.l0) runnable;
            return false;
        }
        if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, hs.A1);
        vaVar.z2 = (cg.l0) runnable;
        return false;
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void n0() {
        this.B1.O0(this.A1);
    }
}
