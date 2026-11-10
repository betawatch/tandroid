package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class kc extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final rl0 a;
    public final jc b;
    public final org.telegram.ui.ActionBar.m5 c;
    public final TextView d;
    public final TextView e;
    public final LinearLayout f;
    public final /* synthetic */ rc h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc(rc rcVar, Activity activity) {
        super(activity);
        org.telegram.ui.ActionBar.h6 h6Var;
        int i7;
        org.telegram.ui.ActionBar.h6 h6Var2;
        this.h = rcVar;
        Context context = getContext();
        h6Var = ((org.telegram.ui.ActionBar.f2) rcVar).resourceProvider;
        rl0 rl0Var = new rl0(context, h6Var);
        this.a = rl0Var;
        rl0Var.setProgressToGradient(1.0f);
        rl0Var.F = true;
        addView(rl0Var, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        Context context2 = getContext();
        i7 = ((org.telegram.ui.ActionBar.f2) rcVar).currentAccount;
        long j3 = rcVar.a;
        h6Var2 = ((org.telegram.ui.ActionBar.f2) rcVar).resourceProvider;
        jc jcVar = new jc(this, context2, i7, j3, h6Var2);
        this.b = jcVar;
        boolean z9 = rcVar.d;
        addView(jcVar, c8.ha.d(-1, z9 ? 230.0f : 190.0f, 80, 0.0f, 0.0f, 0.0f, z9 ? 24.0f : 0.0f));
        if (rcVar instanceof m40) {
            org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(getContext());
            this.c = m5Var;
            m5Var.setGravity(19);
            int i10 = org.telegram.ui.ActionBar.m6.A8;
            m5Var.setTextColor(rcVar.getThemedColor(i10));
            m5Var.setTypeface(org.telegram.messenger.g0.o());
            m5Var.l(org.telegram.messenger.id.M0(2131752551, null), false);
            m5Var.setAlpha(0.0f);
            a();
            addView(m5Var, c8.ha.d(-1, -2.0f, 80, 72.0f, 0.0f, 0.0f, 16.0f));
            LinearLayout linearLayout = new LinearLayout(activity);
            this.f = linearLayout;
            linearLayout.setOrientation(0);
            linearLayout.setBackground(org.telegram.ui.ActionBar.m6.i0(org.telegram.ui.ActionBar.m6.r1(0.065f, -16777216), -16777216));
            linearLayout.setGravity(17);
            linearLayout.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
            TextView textView = new TextView(activity);
            this.d = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(jcVar.h.getTextColor());
            TextView textView2 = new TextView(activity);
            this.e = textView2;
            textView2.setTextSize(1, 12.0f);
            textView2.setTextColor((rcVar.d && rcVar.s == -1) ? rcVar.getThemedColor(i10) : -1);
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = rcVar.c;
            textView.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(tL_premium_boostsStatus != null ? tL_premium_boostsStatus.boosts : 0, "BoostingGroupBoostCount", new Object[0])));
            textView2.setText(org.telegram.messenger.id.M0(2131753353, null));
            linearLayout.addView(textView);
            linearLayout.addView(textView2, c8.ha.k(3.0f, 0.0f, 0.0f, 0.0f, -2, -2));
            addView(linearLayout, c8.ha.e(-1, -2, 80));
        }
    }

    public final void a() {
        float f10;
        boolean z9 = getResources().getConfiguration().orientation == 2;
        int i7 = (org.telegram.messenger.g0.Q1() || !z9) ? 20 : 18;
        org.telegram.ui.ActionBar.m5 m5Var = this.c;
        m5Var.setTextSize(i7);
        if (org.telegram.messenger.g0.Q1()) {
            f10 = -2.0f;
        } else {
            f10 = z9 ? 4 : 0;
        }
        m5Var.setTranslationY(org.telegram.messenger.g0.L(f10));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        org.telegram.ui.ActionBar.m5 m5Var = this.c;
        if (m5Var != null) {
            rc rcVar = this.h;
            int i7 = -1;
            m5Var.setTextColor((!rcVar.d || rcVar.s == -1) ? rcVar.getThemedColor(org.telegram.ui.ActionBar.m6.A8) : -1);
            if (rcVar.d && rcVar.s == -1) {
                i7 = rcVar.getThemedColor(org.telegram.ui.ActionBar.m6.A8);
            }
            this.e.setTextColor(i7);
        }
    }
}
