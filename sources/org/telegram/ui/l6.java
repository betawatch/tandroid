package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public class l6 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final k0 a;
    public final org.telegram.ui.Components.m6 b;
    public final org.telegram.ui.Components.m6 c;

    public l6(Context context) {
        super(context);
        k0 k0Var = new k0(3, context, this);
        this.a = k0Var;
        int i7 = org.telegram.ui.ActionBar.n6.Fi;
        k0Var.setBackground(org.telegram.ui.ActionBar.b6.f(i7, 24.0f));
        k0Var.setImportantForAccessibility(1);
        c8.ra.b(k0Var, 0.02f, 1.2f);
        if (org.telegram.messenger.gd.a0) {
            TextView textView = new TextView(context);
            textView.setText(org.telegram.messenger.gd.M0(2131752087, null));
            textView.setGravity(17);
            i5.c.x(textView, 1, 14.0f);
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.Ji, null);
            k0Var.addView(textView, c8.ma.e(-2, -1, 17));
        }
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(true, true, true);
        this.b = m6Var;
        org.telegram.ui.Components.lr lrVar = org.telegram.ui.Components.lr.h;
        m6Var.n(0.25f, 300L, lrVar);
        m6Var.setCallback(k0Var);
        m6Var.w(org.telegram.messenger.g0.L(14.0f));
        m6Var.t(org.telegram.messenger.gd.M0(2131752087, null), true, true);
        m6Var.b = 5;
        m6Var.x(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.n6.Ji;
        m6Var.u(org.telegram.ui.ActionBar.n6.x0(null, i10, false));
        org.telegram.ui.Components.m6 m6Var2 = new org.telegram.ui.Components.m6(true, true, true);
        this.c = m6Var2;
        m6Var2.n(0.25f, 300L, lrVar);
        m6Var2.setCallback(k0Var);
        m6Var2.w(org.telegram.messenger.g0.L(14.0f));
        m6Var2.x(org.telegram.messenger.g0.o());
        m6Var2.u(org.telegram.ui.ActionBar.n6.w(org.telegram.ui.ActionBar.n6.x0(null, i7, false), org.telegram.ui.ActionBar.n6.r1(0.7f, org.telegram.ui.ActionBar.n6.x0(null, i10, false))));
        m6Var2.t("", true, true);
        k0Var.setContentDescription(TextUtils.concat(m6Var.i, "\t", m6Var2.i));
        addView(k0Var, c8.ma.d(-1, 48.0f, org.telegram.messenger.ks.E1, 16.0f, 16.0f, 16.0f, 16.0f));
    }

    public final void a(long j3, boolean z10) {
        String M0 = z10 ? org.telegram.messenger.gd.M0(2131752087, null) : org.telegram.messenger.gd.M0(2131752039, null);
        org.telegram.ui.Components.m6 m6Var = this.b;
        m6Var.t(M0, true, true);
        String i02 = j3 <= 0 ? "" : org.telegram.messenger.g0.i0(j3, false, false);
        org.telegram.ui.Components.m6 m6Var2 = this.c;
        m6Var2.t(i02, true, true);
        setDisabled(j3 <= 0);
        k0 k0Var = this.a;
        k0Var.invalidate();
        k0Var.setContentDescription(TextUtils.concat(m6Var.i, "\t", m6Var2.i));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Fi));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
    }

    public void setDisabled(boolean z10) {
        k0 k0Var = this.a;
        k0Var.animate().cancel();
        k0Var.animate().alpha(z10 ? 0.65f : 1.0f).start();
        k0Var.setClickable(!z10);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            org.telegram.ui.Components.m6 m6Var = this.b;
            if (m6Var != null) {
                m6Var.u(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ji, false));
            }
            org.telegram.ui.Components.m6 m6Var2 = this.c;
            if (m6Var2 != null) {
                m6Var2.u(org.telegram.ui.ActionBar.n6.w(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Fi, false), org.telegram.ui.ActionBar.n6.r1(0.7f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ji, false))));
            }
            k0 k0Var = this.a;
            if (k0Var != null) {
                k0Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
