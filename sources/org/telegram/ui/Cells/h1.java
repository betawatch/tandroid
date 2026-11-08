package org.telegram.ui.Cells;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class h1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q1 b;

    public /* synthetic */ h1(q1 q1Var, int i7) {
        this.a = i7;
        this.b = q1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean w22;
        switch (this.a) {
            case 0:
                l1 l1Var = this.b.Ra;
                if (l1Var != null) {
                    l1Var.u();
                    break;
                }
                break;
            default:
                q1 q1Var = this.b;
                h1 h1Var = q1Var.vb;
                ij ijVar = q1Var.P5;
                if (ijVar != null && (w22 = q1Var.w2(ijVar)) != q1Var.g3) {
                    q1Var.g3 = w22;
                    if (w22) {
                        ij ijVar2 = q1Var.P5;
                        q1Var.P5 = null;
                        q1Var.w3(ijVar2, q1Var.K, q1Var.F, q1Var.E, q1Var.G, false);
                    } else {
                        org.telegram.messenger.g0.i3(h1Var, 1000L);
                        q1Var.eb = true;
                        int L = q1Var.a7 - org.telegram.messenger.g0.L(91.0f);
                        q1Var.d3 = new StaticLayout(TextUtils.ellipsize(id.M0(2131753966, null), org.telegram.ui.ActionBar.k6.H2, L, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.k6.H2, L, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    }
                }
                if (!q1Var.g3) {
                    RectF rectF = q1Var.b4;
                    q1Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                    if (q1Var.eb) {
                        org.telegram.messenger.g0.i3(h1Var, 1000L);
                        break;
                    }
                } else {
                    q1Var.invalidate();
                    q1Var.eb = false;
                    break;
                }
                break;
        }
    }
}
