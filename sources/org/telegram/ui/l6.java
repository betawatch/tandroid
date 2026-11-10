package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class l6 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final k0 a;
    public final org.telegram.ui.Components.h6 b;
    public final org.telegram.ui.Components.h6 c;

    public l6(Context context) {
        super(context);
        k0 k0Var = new k0(3, context, this);
        this.a = k0Var;
        int i7 = org.telegram.ui.ActionBar.m6.Ci;
        k0Var.setBackground(org.telegram.ui.ActionBar.b6.f(i7, 24.0f));
        k0Var.setImportantForAccessibility(1);
        c8.ka.b(k0Var, 0.02f, 1.2f);
        if (org.telegram.messenger.id.a0) {
            TextView textView = new TextView(context);
            textView.setText(org.telegram.messenger.id.M0(2131752098, null));
            textView.setGravity(17);
            com.google.android.recaptcha.internal.a.q(textView, 1, 14.0f);
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.Gi, null);
            k0Var.addView(textView, c8.ha.e(-2, -1, 17));
        }
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(true, true, true);
        this.b = h6Var;
        org.telegram.ui.Components.wq wqVar = org.telegram.ui.Components.wq.h;
        h6Var.n(0.25f, 300L, wqVar);
        h6Var.setCallback(k0Var);
        h6Var.w(org.telegram.messenger.g0.L(14.0f));
        h6Var.t(org.telegram.messenger.id.M0(2131752098, null), true, true);
        h6Var.b = 5;
        h6Var.x(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.m6.Gi;
        h6Var.u(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
        org.telegram.ui.Components.h6 h6Var2 = new org.telegram.ui.Components.h6(true, true, true);
        this.c = h6Var2;
        h6Var2.n(0.25f, 300L, wqVar);
        h6Var2.setCallback(k0Var);
        h6Var2.w(org.telegram.messenger.g0.L(14.0f));
        h6Var2.x(org.telegram.messenger.g0.o());
        h6Var2.u(org.telegram.ui.ActionBar.m6.w(org.telegram.ui.ActionBar.m6.x0(null, i7, false), org.telegram.ui.ActionBar.m6.r1(0.7f, org.telegram.ui.ActionBar.m6.x0(null, i10, false))));
        h6Var2.t("", true, true);
        k0Var.setContentDescription(TextUtils.concat(h6Var.i, "\t", h6Var2.i));
        addView(k0Var, c8.ha.d(-1, 48.0f, org.telegram.messenger.qs.E1, 16.0f, 16.0f, 16.0f, 16.0f));
    }

    public final void a(long j3, boolean z9) {
        String M0 = z9 ? org.telegram.messenger.id.M0(2131752098, null) : org.telegram.messenger.id.M0(2131752050, null);
        org.telegram.ui.Components.h6 h6Var = this.b;
        h6Var.t(M0, true, true);
        String i02 = j3 <= 0 ? "" : org.telegram.messenger.g0.i0(j3, false, false);
        org.telegram.ui.Components.h6 h6Var2 = this.c;
        h6Var2.t(i02, true, true);
        setDisabled(j3 <= 0);
        k0 k0Var = this.a;
        k0Var.invalidate();
        k0Var.setContentDescription(TextUtils.concat(h6Var.i, "\t", h6Var2.i));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ci));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
    }

    public void setDisabled(boolean z9) {
        k0 k0Var = this.a;
        k0Var.animate().cancel();
        k0Var.animate().alpha(z9 ? 0.65f : 1.0f).start();
        k0Var.setClickable(!z9);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            org.telegram.ui.Components.h6 h6Var = this.b;
            if (h6Var != null) {
                h6Var.u(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Gi, false));
            }
            org.telegram.ui.Components.h6 h6Var2 = this.c;
            if (h6Var2 != null) {
                h6Var2.u(org.telegram.ui.ActionBar.m6.w(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ci, false), org.telegram.ui.ActionBar.m6.r1(0.7f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Gi, false))));
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
