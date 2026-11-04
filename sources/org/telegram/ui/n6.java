package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class n6 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final l0 a;
    public final org.telegram.ui.Components.g6 b;
    public final org.telegram.ui.Components.g6 c;

    public n6(Context context) {
        super(context);
        l0 l0Var = new l0(3, context, this);
        this.a = l0Var;
        int i3 = org.telegram.ui.ActionBar.k6.Ci;
        l0Var.setBackground(org.telegram.ui.ActionBar.y5.f(i3, 24.0f));
        l0Var.setImportantForAccessibility(1);
        b8.pf.b(l0Var, 0.02f, 1.2f);
        if (org.telegram.messenger.bd.a0) {
            TextView textView = new TextView(context);
            textView.setText(org.telegram.messenger.bd.M0(2131752098, null));
            textView.setGravity(17);
            k2.p1.t(textView, 1, 14.0f);
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Gi, null);
            l0Var.addView(textView, b8.mf.e(-2, -1, 17));
        }
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(true, true, true);
        this.b = g6Var;
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        g6Var.n(0.25f, 300L, xqVar);
        g6Var.setCallback(l0Var);
        g6Var.w(org.telegram.messenger.g0.L(14.0f));
        g6Var.t(org.telegram.messenger.bd.M0(2131752098, null), true, true);
        g6Var.b = 5;
        g6Var.x(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.k6.Gi;
        g6Var.u(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        org.telegram.ui.Components.g6 g6Var2 = new org.telegram.ui.Components.g6(true, true, true);
        this.c = g6Var2;
        g6Var2.n(0.25f, 300L, xqVar);
        g6Var2.setCallback(l0Var);
        g6Var2.w(org.telegram.messenger.g0.L(14.0f));
        g6Var2.x(org.telegram.messenger.g0.o());
        g6Var2.u(org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.x0(null, i3, false), org.telegram.ui.ActionBar.k6.r1(0.7f, org.telegram.ui.ActionBar.k6.x0(null, i10, false))));
        g6Var2.t("", true, true);
        l0Var.setContentDescription(TextUtils.concat(g6Var.i, "\t", g6Var2.i));
        addView(l0Var, b8.mf.d(-1, 48.0f, org.telegram.messenger.hs.E1, 16.0f, 16.0f, 16.0f, 16.0f));
    }

    public final void a(long j10, boolean z10) {
        String M0 = z10 ? org.telegram.messenger.bd.M0(2131752098, null) : org.telegram.messenger.bd.M0(2131752050, null);
        org.telegram.ui.Components.g6 g6Var = this.b;
        g6Var.t(M0, true, true);
        String i02 = j10 <= 0 ? "" : org.telegram.messenger.g0.i0(j10, false, false);
        org.telegram.ui.Components.g6 g6Var2 = this.c;
        g6Var2.t(i02, true, true);
        setDisabled(j10 <= 0);
        l0 l0Var = this.a;
        l0Var.invalidate();
        l0Var.setContentDescription(TextUtils.concat(g6Var.i, "\t", g6Var2.i));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ci));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), i10);
    }

    public void setDisabled(boolean z10) {
        l0 l0Var = this.a;
        l0Var.animate().cancel();
        l0Var.animate().alpha(z10 ? 0.65f : 1.0f).start();
        l0Var.setClickable(!z10);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            org.telegram.ui.Components.g6 g6Var = this.b;
            if (g6Var != null) {
                g6Var.u(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Gi, false));
            }
            org.telegram.ui.Components.g6 g6Var2 = this.c;
            if (g6Var2 != null) {
                g6Var2.u(org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false), org.telegram.ui.ActionBar.k6.r1(0.7f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Gi, false))));
            }
            l0 l0Var = this.a;
            if (l0Var != null) {
                l0Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
