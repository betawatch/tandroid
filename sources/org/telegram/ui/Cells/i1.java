package org.telegram.ui.Cells;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class i1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r1 b;

    public /* synthetic */ i1(r1 r1Var, int i7) {
        this.a = i7;
        this.b = r1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z22;
        switch (this.a) {
            case 0:
                m1 m1Var = this.b.Sa;
                if (m1Var != null) {
                    m1Var.v();
                    break;
                }
                break;
            default:
                r1 r1Var = this.b;
                i1 i1Var = r1Var.wb;
                gj gjVar = r1Var.Q5;
                if (gjVar != null && (z22 = r1Var.z2(gjVar)) != r1Var.h3) {
                    r1Var.h3 = z22;
                    if (z22) {
                        gj gjVar2 = r1Var.Q5;
                        r1Var.Q5 = null;
                        r1Var.y3(gjVar2, r1Var.L, r1Var.G, r1Var.F, r1Var.H, false);
                    } else {
                        org.telegram.messenger.g0.h3(i1Var, 1000L);
                        r1Var.fb = true;
                        int L = r1Var.b7 - org.telegram.messenger.g0.L(91.0f);
                        r1Var.e3 = new StaticLayout(TextUtils.ellipsize(hd.N0(2131753963, null), org.telegram.ui.ActionBar.m6.H2, L, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.m6.H2, L, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    }
                }
                if (!r1Var.h3) {
                    RectF rectF = r1Var.c4;
                    r1Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                    if (r1Var.fb) {
                        org.telegram.messenger.g0.h3(i1Var, 1000L);
                        break;
                    }
                } else {
                    r1Var.invalidate();
                    r1Var.fb = false;
                    break;
                }
                break;
        }
    }
}
