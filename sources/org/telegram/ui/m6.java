package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class m6 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final l0 a;
    public final org.telegram.ui.Components.e6 b;
    public final org.telegram.ui.Components.e6 c;

    public m6(Context context) {
        super(context);
        l0 l0Var = new l0(this, context, 3);
        this.a = l0Var;
        int i10 = org.telegram.ui.ActionBar.t6.Ci;
        l0Var.setBackground(org.telegram.ui.ActionBar.j6.f(i10, 24.0f));
        l0Var.setImportantForAccessibility(1);
        w7.e6.b(l0Var, 0.02f, 1.2f);
        if (org.telegram.messenger.cd.X) {
            TextView textView = new TextView(context);
            textView.setText(org.telegram.messenger.cd.L0(2131752098, null));
            textView.setGravity(17);
            sc.e.t(textView, 1, 14.0f);
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.Gi, null);
            l0Var.addView(textView, w7.b6.e(-2, -1, 17));
        }
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(true, true, true);
        this.b = e6Var;
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        e6Var.n(0.25f, 300L, grVar);
        e6Var.setCallback(l0Var);
        e6Var.w(org.telegram.messenger.i0.L(14.0f));
        e6Var.t(org.telegram.messenger.cd.L0(2131752098, null), true, true);
        e6Var.b = 5;
        e6Var.x(org.telegram.messenger.i0.o());
        int i11 = org.telegram.ui.ActionBar.t6.Gi;
        e6Var.u(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
        org.telegram.ui.Components.e6 e6Var2 = new org.telegram.ui.Components.e6(true, true, true);
        this.c = e6Var2;
        e6Var2.n(0.25f, 300L, grVar);
        e6Var2.setCallback(l0Var);
        e6Var2.w(org.telegram.messenger.i0.L(14.0f));
        e6Var2.x(org.telegram.messenger.i0.o());
        e6Var2.u(org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.x0(null, i10, false), org.telegram.ui.ActionBar.t6.r1(0.7f, org.telegram.ui.ActionBar.t6.x0(null, i11, false))));
        e6Var2.t("", true, true);
        l0Var.setContentDescription(TextUtils.concat(e6Var.i, "\t", e6Var2.i));
        addView(l0Var, w7.b6.d(-1, 48.0f, org.telegram.messenger.zs.E1, 16.0f, 16.0f, 16.0f, 16.0f));
    }

    public final void a(long j10, boolean z10) {
        String L0 = z10 ? org.telegram.messenger.cd.L0(2131752098, null) : org.telegram.messenger.cd.L0(2131752050, null);
        org.telegram.ui.Components.e6 e6Var = this.b;
        e6Var.t(L0, true, true);
        String i02 = j10 <= 0 ? "" : org.telegram.messenger.i0.i0(j10, false, false);
        org.telegram.ui.Components.e6 e6Var2 = this.c;
        e6Var2.t(i02, true, true);
        setDisabled(j10 <= 0);
        l0 l0Var = this.a;
        l0Var.invalidate();
        l0Var.setContentDescription(TextUtils.concat(e6Var.i, "\t", e6Var2.i));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ci));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }

    public void setDisabled(boolean z10) {
        l0 l0Var = this.a;
        l0Var.animate().cancel();
        l0Var.animate().alpha(z10 ? 0.65f : 1.0f).start();
        l0Var.setClickable(!z10);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            org.telegram.ui.Components.e6 e6Var = this.b;
            if (e6Var != null) {
                e6Var.u(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Gi, false));
            }
            org.telegram.ui.Components.e6 e6Var2 = this.c;
            if (e6Var2 != null) {
                e6Var2.u(org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false), org.telegram.ui.ActionBar.t6.r1(0.7f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Gi, false))));
            }
            l0 l0Var = this.a;
            if (l0Var != null) {
                l0Var.invalidate();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
