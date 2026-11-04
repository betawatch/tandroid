package org.telegram.ui.Cells;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import org.telegram.messenger.bd;
import org.telegram.messenger.zi;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q1 b;

    public /* synthetic */ h1(q1 q1Var, int i3) {
        this.a = i3;
        this.b = q1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean w22;
        switch (this.a) {
            case 0:
                l1 l1Var = this.b.Ra;
                if (l1Var != null) {
                    l1Var.v();
                    break;
                }
                break;
            default:
                q1 q1Var = this.b;
                h1 h1Var = q1Var.vb;
                zi ziVar = q1Var.P5;
                if (ziVar != null && (w22 = q1Var.w2(ziVar)) != q1Var.g3) {
                    q1Var.g3 = w22;
                    if (w22) {
                        zi ziVar2 = q1Var.P5;
                        q1Var.P5 = null;
                        q1Var.u3(ziVar2, q1Var.L, q1Var.G, q1Var.F, q1Var.H, false);
                    } else {
                        org.telegram.messenger.g0.i3(h1Var, 1000L);
                        q1Var.eb = true;
                        int L = q1Var.a7 - org.telegram.messenger.g0.L(91.0f);
                        q1Var.d3 = new StaticLayout(TextUtils.ellipsize(bd.M0(2131753966, null), org.telegram.ui.ActionBar.k6.H2, L, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.k6.H2, L, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
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
