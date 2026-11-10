package fi;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.gc;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class c5 extends k2 {
    public final /* synthetic */ int C1;
    public final /* synthetic */ o5 D1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(o5 o5Var, Context context, g5 g5Var, int i7) {
        super(context, g5Var, false, false);
        this.D1 = o5Var;
        this.C1 = i7;
    }

    @Override // fi.k2
    public final boolean I0(Integer num) {
        j5 j5Var = this.D1.A0;
        if (num.intValue() == 3) {
            int i7 = 0;
            for (int i10 = 0; i10 < j5Var.getChildCount(); i10++) {
                if (j5Var.getChildAt(i10) instanceof tg.q1) {
                    i7++;
                }
            }
            int i11 = qp.s1(this.a).o5;
            org.telegram.ui.ActionBar.m2 m2Var = this.c;
            if (i7 >= i11 && !p10.i(this.a).q()) {
                String G = id.G(qp.s1(this.a).p5, "StoryPremiumWidgets2", new Object[0]);
                try {
                    m2Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                new gc(m2Var, this.I0).I(R.raw.star_premium_2, id.M0(2131749199, null), org.telegram.messenger.g0.S2(G, org.telegram.ui.ActionBar.m6.Uc, 0, new di.f8(this, 16), this.I0)).k(true);
                return false;
            }
            if (i7 >= qp.s1(this.a).p5) {
                try {
                    m2Var.performHapticFeedback(3);
                } catch (Exception unused2) {
                }
                new gc(m2Var, this.I0).I(R.raw.chats_infotip, id.M0(2131748978, "LimitReached"), id.G(qp.s1(this.a).p5, "StoryReactionsWidgetLimit2", new Object[0])).k(true);
                return false;
            }
        }
        return true;
    }

    @Override // fi.k2
    public final boolean J0(Integer num) {
        o5 o5Var = this.D1;
        j5 j5Var = o5Var.A0;
        boolean z9 = false;
        if (o5Var.G1) {
            if (num.intValue() != 2) {
                return false;
            }
        } else if (num.intValue() == 5) {
            int i7 = 0;
            while (true) {
                if (i7 >= j5Var.getChildCount()) {
                    break;
                }
                if (j5Var.getChildAt(i7) instanceof tg.l2) {
                    z9 = true;
                    break;
                }
                i7++;
            }
            return !z9;
        }
        return true;
    }

    @Override // fi.k2
    public final boolean K0(Runnable runnable) {
        va vaVar = ((x9) this.D1).j2;
        Activity activity = vaVar.b;
        if (activity == null) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0) {
                return true;
            }
            activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, qs.A1);
            vaVar.y2 = (bg.m0) runnable;
            return false;
        }
        if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, qs.A1);
        vaVar.y2 = (bg.m0) runnable;
        return false;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void n0() {
        this.D1.O0(this.C1);
    }
}
