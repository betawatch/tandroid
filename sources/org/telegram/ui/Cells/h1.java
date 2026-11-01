package org.telegram.ui.Cells;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import org.telegram.messenger.dd;
import org.telegram.messenger.kj;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class h1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q1 b;

    public /* synthetic */ h1(q1 q1Var, int i10) {
        this.a = i10;
        this.b = q1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean u22;
        switch (this.a) {
            case 0:
                l1 l1Var = this.b.Qa;
                if (l1Var != null) {
                    l1Var.s();
                    break;
                }
                break;
            default:
                q1 q1Var = this.b;
                h1 h1Var = q1Var.ub;
                kj kjVar = q1Var.O5;
                if (kjVar != null && (u22 = q1Var.u2(kjVar)) != q1Var.f3) {
                    q1Var.f3 = u22;
                    if (u22) {
                        kj kjVar2 = q1Var.O5;
                        q1Var.O5 = null;
                        q1Var.s3(kjVar2, q1Var.K, q1Var.F, q1Var.E, q1Var.G, false);
                    } else {
                        org.telegram.messenger.i0.h3(h1Var, 1000L);
                        q1Var.db = true;
                        int L = q1Var.Z6 - org.telegram.messenger.i0.L(91.0f);
                        q1Var.c3 = new StaticLayout(TextUtils.ellipsize(dd.L0(2131753966, null), org.telegram.ui.ActionBar.t6.H2, L, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.t6.H2, L, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    }
                }
                if (!q1Var.f3) {
                    RectF rectF = q1Var.a4;
                    q1Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                    if (q1Var.db) {
                        org.telegram.messenger.i0.h3(h1Var, 1000L);
                        break;
                    }
                } else {
                    q1Var.invalidate();
                    q1Var.db = false;
                    break;
                }
                break;
        }
    }
}
