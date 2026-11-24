// default package

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class nv7 extends px3 {
    public final /* synthetic */ int D1;
    public final /* synthetic */ xv7 E1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nv7(xv7 xv7Var, Context context, rk5 rk5Var, int i) {
        super(rk5Var, context, false, false);
        this.E1 = xv7Var;
        this.D1 = i;
    }

    @Override // px3
    public final boolean D0(Integer num) {
        tv7 tv7Var = this.E1.H0;
        if (num.intValue() == 3) {
            int i = 0;
            for (int i2 = 0; i2 < tv7Var.getChildCount(); i2++) {
                if (tv7Var.getChildAt(i2) instanceof g29) {
                    i++;
                }
            }
            int f = oc7.r1(this.a).l4.x1.f();
            dy0 dy0Var = this.c;
            if (i >= f && !z8c.h(this.a).p()) {
                String G = jb6.G(oc7.r1(this.a).l4.y1.f(), "StoryPremiumWidgets2", new Object[0]);
                try {
                    dy0Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                new c41(dy0Var, this.J0).I(R.raw.star_premium_2, jb6.M0(2131748956, null), gm.N2(G, cmb.Wc, 0, new bi3(this, (byte) 24), this.J0)).k(true);
                return false;
            }
            if (i >= oc7.r1(this.a).l4.y1.f()) {
                try {
                    dy0Var.performHapticFeedback(3);
                } catch (Exception unused2) {
                }
                new c41(dy0Var, this.J0).I(R.raw.chats_infotip, jb6.M0(2131748735, "LimitReached"), jb6.G(oc7.r1(this.a).l4.y1.f(), "StoryReactionsWidgetLimit2", new Object[0])).k(true);
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0041 A[RETURN] */
    @Override // px3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean E0(Integer num) {
        gd1 gd1Var;
        xv7 xv7Var = this.E1;
        tv7 tv7Var = xv7Var.H0;
        boolean z = false;
        if (xv7Var.N1) {
            return num.intValue() == 2;
        }
        if (num.intValue() == 5) {
            int i = 0;
            while (true) {
                if (i >= tv7Var.getChildCount()) {
                    break;
                }
                if (tv7Var.getChildAt(i) instanceof kuc) {
                    z = true;
                    break;
                }
                i++;
            }
            return !z;
        }
        if (num.intValue() != 6 || ((gd1Var = xv7Var.a2) != null && gd1Var.c())) {
        }
    }

    @Override // px3
    public final boolean F0(Runnable runnable) {
        v9b v9bVar = ((z8b) this.E1).u2;
        Activity activity = v9bVar.b;
        if (activity == null) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0) {
                return true;
            }
            activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, nm7.z1);
            v9bVar.z2 = (bm3) runnable;
            return false;
        }
        if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, nm7.z1);
        v9bVar.z2 = (bm3) runnable;
        return false;
    }

    @Override // my0
    public final void k0() {
        this.E1.R0(this.D1);
    }
}
