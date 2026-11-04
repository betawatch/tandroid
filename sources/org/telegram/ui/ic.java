package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ic extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final jl0 a;
    public final hc b;
    public final org.telegram.ui.ActionBar.k5 c;
    public final TextView d;
    public final TextView e;
    public final LinearLayout f;
    public final /* synthetic */ pc h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic(pc pcVar, Activity activity) {
        super(activity);
        org.telegram.ui.ActionBar.e6 e6Var;
        int i3;
        org.telegram.ui.ActionBar.e6 e6Var2;
        this.h = pcVar;
        Context context = getContext();
        e6Var = ((org.telegram.ui.ActionBar.d2) pcVar).resourceProvider;
        jl0 jl0Var = new jl0(context, e6Var);
        this.a = jl0Var;
        jl0Var.setProgressToGradient(1.0f);
        jl0Var.G = true;
        addView(jl0Var, b8.mf.e(-1, -1, org.telegram.messenger.hs.E1));
        Context context2 = getContext();
        i3 = ((org.telegram.ui.ActionBar.d2) pcVar).currentAccount;
        long j10 = pcVar.a;
        e6Var2 = ((org.telegram.ui.ActionBar.d2) pcVar).resourceProvider;
        hc hcVar = new hc(this, context2, i3, j10, e6Var2);
        this.b = hcVar;
        boolean z10 = pcVar.d;
        addView(hcVar, b8.mf.d(-1, z10 ? 230.0f : 190.0f, 80, 0.0f, 0.0f, 0.0f, z10 ? 24.0f : 0.0f));
        if (pcVar instanceof e40) {
            org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(getContext());
            this.c = k5Var;
            k5Var.setGravity(19);
            int i10 = org.telegram.ui.ActionBar.k6.A8;
            k5Var.setTextColor(pcVar.getThemedColor(i10));
            k5Var.setTypeface(org.telegram.messenger.g0.o());
            k5Var.l(org.telegram.messenger.bd.M0(2131752551, null), false);
            k5Var.setAlpha(0.0f);
            a();
            addView(k5Var, b8.mf.d(-1, -2.0f, 80, 72.0f, 0.0f, 0.0f, 16.0f));
            LinearLayout linearLayout = new LinearLayout(activity);
            this.f = linearLayout;
            linearLayout.setOrientation(0);
            linearLayout.setBackground(org.telegram.ui.ActionBar.k6.i0(org.telegram.ui.ActionBar.k6.r1(0.065f, -16777216), -16777216));
            linearLayout.setGravity(17);
            linearLayout.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
            TextView textView = new TextView(activity);
            this.d = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(hcVar.h.getTextColor());
            TextView textView2 = new TextView(activity);
            this.e = textView2;
            textView2.setTextSize(1, 12.0f);
            textView2.setTextColor((pcVar.d && pcVar.s == -1) ? pcVar.getThemedColor(i10) : -1);
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = pcVar.c;
            textView.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.G(tL_premium_boostsStatus != null ? tL_premium_boostsStatus.boosts : 0, "BoostingGroupBoostCount", new Object[0])));
            textView2.setText(org.telegram.messenger.bd.M0(2131753353, null));
            linearLayout.addView(textView);
            linearLayout.addView(textView2, b8.mf.k(3.0f, 0.0f, 0.0f, 0.0f, -2, -2));
            addView(linearLayout, b8.mf.e(-1, -2, 80));
        }
    }

    public final void a() {
        float f10;
        boolean z10 = getResources().getConfiguration().orientation == 2;
        int i3 = (org.telegram.messenger.g0.Q1() || !z10) ? 20 : 18;
        org.telegram.ui.ActionBar.k5 k5Var = this.c;
        k5Var.setTextSize(i3);
        if (org.telegram.messenger.g0.Q1()) {
            f10 = -2.0f;
        } else {
            f10 = z10 ? 4 : 0;
        }
        k5Var.setTranslationY(org.telegram.messenger.g0.L(f10));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        org.telegram.ui.ActionBar.k5 k5Var = this.c;
        if (k5Var != null) {
            pc pcVar = this.h;
            int i3 = -1;
            k5Var.setTextColor((!pcVar.d || pcVar.s == -1) ? pcVar.getThemedColor(org.telegram.ui.ActionBar.k6.A8) : -1);
            if (pcVar.d && pcVar.s == -1) {
                i3 = pcVar.getThemedColor(org.telegram.ui.ActionBar.k6.A8);
            }
            this.e.setTextColor(i3);
        }
    }
}
