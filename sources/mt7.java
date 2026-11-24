// default package

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class mt7 extends ew3 {
    public final /* synthetic */ int D1;
    public final /* synthetic */ wt7 E1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mt7(wt7 wt7Var, Context context, si5 si5Var, int i) {
        super(si5Var, context, false, false);
        this.E1 = wt7Var;
        this.D1 = i;
    }

    @Override // ew3
    public final boolean D0(Integer num) {
        st7 st7Var = this.E1.H0;
        if (num.intValue() == 3) {
            int i = 0;
            for (int i2 = 0; i2 < st7Var.getChildCount(); i2++) {
                if (st7Var.getChildAt(i2) instanceof e09) {
                    i++;
                }
            }
            int f = na7.q1(this.a).k4.x1.f();
            ww0 ww0Var = this.c;
            if (i >= f && !y6c.h(this.a).p()) {
                String G = k96.G(na7.q1(this.a).k4.y1.f(), "StoryPremiumWidgets2", new Object[0]);
                try {
                    ww0Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                new u21(ww0Var, this.J0).I(R.raw.star_premium_2, k96.M0(2131749007, null), gl.N2(G, bkb.Wc, 0, new li3(this, (byte) 19), this.J0)).k(true);
                return false;
            }
            if (i >= na7.q1(this.a).k4.y1.f()) {
                try {
                    ww0Var.performHapticFeedback(3);
                } catch (Exception unused2) {
                }
                new u21(ww0Var, this.J0).I(R.raw.chats_infotip, k96.M0(2131748786, "LimitReached"), k96.G(na7.q1(this.a).k4.y1.f(), "StoryReactionsWidgetLimit2", new Object[0])).k(true);
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0041 A[RETURN] */
    @Override // ew3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean E0(Integer num) {
        yb1 yb1Var;
        wt7 wt7Var = this.E1;
        st7 st7Var = wt7Var.H0;
        boolean z = false;
        if (wt7Var.N1) {
            return num.intValue() == 2;
        }
        if (num.intValue() == 5) {
            int i = 0;
            while (true) {
                if (i >= st7Var.getChildCount()) {
                    break;
                }
                if (st7Var.getChildAt(i) instanceof hsc) {
                    z = true;
                    break;
                }
                i++;
            }
            return !z;
        }
        if (num.intValue() != 6 || ((yb1Var = wt7Var.a2) != null && yb1Var.c())) {
        }
    }

    @Override // ew3
    public final boolean F0(Runnable runnable) {
        t7b t7bVar = ((x6b) this.E1).u2;
        Activity activity = t7bVar.b;
        if (activity == null) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0) {
                return true;
            }
            activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, kk7.z1);
            t7bVar.z2 = (sm3) runnable;
            return false;
        }
        if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, kk7.z1);
        t7bVar.z2 = (sm3) runnable;
        return false;
    }

    @Override // fx0
    public final void k0() {
        this.E1.R0(this.D1);
    }
}
