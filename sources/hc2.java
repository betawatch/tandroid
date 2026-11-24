// default package

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class hc2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rc2 b;

    public /* synthetic */ hc2(rc2 rc2Var, byte b) {
        this.a = b;
        this.b = rc2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2;
        switch (this.a) {
            case 0:
                mc2 mc2Var = this.b.eb;
                if (mc2Var != null) {
                    mc2Var.q();
                    break;
                }
                break;
            default:
                rc2 rc2Var = this.b;
                hc2 hc2Var = rc2Var.Ib;
                k47 k47Var = rc2Var.Q5;
                if (k47Var != null && (z2 = rc2Var.z2(k47Var)) != rc2Var.h3) {
                    rc2Var.h3 = z2;
                    if (z2) {
                        k47 k47Var2 = rc2Var.Q5;
                        rc2Var.Q5 = null;
                        rc2Var.z3(k47Var2, rc2Var.L, rc2Var.G, rc2Var.F, rc2Var.H, false);
                    } else {
                        gm.d3(hc2Var, 1000L);
                        rc2Var.rb = true;
                        int L = rc2Var.b7 - gm.L(91.0f);
                        rc2Var.e3 = new StaticLayout(TextUtils.ellipsize(jb6.M0(2131753931, null), cmb.G2, L, TextUtils.TruncateAt.END), cmb.G2, L, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    }
                }
                if (!rc2Var.h3) {
                    RectF rectF = rc2Var.c4;
                    rc2Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                    if (rc2Var.rb) {
                        gm.d3(hc2Var, 1000L);
                        break;
                    }
                } else {
                    rc2Var.invalidate();
                    rc2Var.rb = false;
                    break;
                }
                break;
        }
    }
}
