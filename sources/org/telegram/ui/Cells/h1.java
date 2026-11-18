package org.telegram.ui.Cells;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
        boolean z22;
        switch (this.a) {
            case 0:
                l1 l1Var = this.b.Sa;
                if (l1Var != null) {
                    l1Var.v();
                    break;
                }
                break;
            default:
                q1 q1Var = this.b;
                h1 h1Var = q1Var.wb;
                fj fjVar = q1Var.Q5;
                if (fjVar != null && (z22 = q1Var.z2(fjVar)) != q1Var.h3) {
                    q1Var.h3 = z22;
                    if (z22) {
                        fj fjVar2 = q1Var.Q5;
                        q1Var.Q5 = null;
                        q1Var.y3(fjVar2, q1Var.L, q1Var.G, q1Var.F, q1Var.H, false);
                    } else {
                        org.telegram.messenger.g0.h3(h1Var, 1000L);
                        q1Var.fb = true;
                        int L = q1Var.b7 - org.telegram.messenger.g0.L(91.0f);
                        q1Var.e3 = new StaticLayout(TextUtils.ellipsize(gd.M0(2131753964, null), org.telegram.ui.ActionBar.n6.H2, L, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.n6.H2, L, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    }
                }
                if (!q1Var.h3) {
                    RectF rectF = q1Var.c4;
                    q1Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                    if (q1Var.fb) {
                        org.telegram.messenger.g0.h3(h1Var, 1000L);
                        break;
                    }
                } else {
                    q1Var.invalidate();
                    q1Var.fb = false;
                    break;
                }
                break;
        }
    }
}
