package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class jc extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final ql0 a;
    public final ic b;
    public final org.telegram.ui.ActionBar.n5 c;
    public final TextView d;
    public final TextView e;
    public final LinearLayout f;
    public final /* synthetic */ qc h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc(qc qcVar, Activity activity) {
        super(activity);
        org.telegram.ui.ActionBar.i6 i6Var;
        int i7;
        org.telegram.ui.ActionBar.i6 i6Var2;
        this.h = qcVar;
        Context context = getContext();
        i6Var = ((org.telegram.ui.ActionBar.g2) qcVar).resourceProvider;
        ql0 ql0Var = new ql0(context, i6Var);
        this.a = ql0Var;
        ql0Var.setProgressToGradient(1.0f);
        ql0Var.G = true;
        addView(ql0Var, c8.na.e(-1, -1, org.telegram.messenger.ks.E1));
        Context context2 = getContext();
        i7 = ((org.telegram.ui.ActionBar.g2) qcVar).currentAccount;
        long j3 = qcVar.a;
        i6Var2 = ((org.telegram.ui.ActionBar.g2) qcVar).resourceProvider;
        ic icVar = new ic(this, context2, i7, j3, i6Var2);
        this.b = icVar;
        boolean z10 = qcVar.d;
        addView(icVar, c8.na.d(-1, z10 ? 230.0f : 190.0f, 80, 0.0f, 0.0f, 0.0f, z10 ? 24.0f : 0.0f));
        if (qcVar instanceof l40) {
            org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(getContext());
            this.c = n5Var;
            n5Var.setGravity(19);
            int i10 = org.telegram.ui.ActionBar.n6.A8;
            n5Var.setTextColor(qcVar.getThemedColor(i10));
            n5Var.setTypeface(org.telegram.messenger.g0.o());
            n5Var.l(org.telegram.messenger.gd.N0(2131752539, null), false);
            n5Var.setAlpha(0.0f);
            a();
            addView(n5Var, c8.na.d(-1, -2.0f, 80, 72.0f, 0.0f, 0.0f, 16.0f));
            LinearLayout linearLayout = new LinearLayout(activity);
            this.f = linearLayout;
            linearLayout.setOrientation(0);
            linearLayout.setBackground(org.telegram.ui.ActionBar.n6.i0(org.telegram.ui.ActionBar.n6.r1(0.065f, -16777216), -16777216));
            linearLayout.setGravity(17);
            linearLayout.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
            TextView textView = new TextView(activity);
            this.d = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(icVar.h.getTextColor());
            TextView textView2 = new TextView(activity);
            this.e = textView2;
            textView2.setTextSize(1, 12.0f);
            textView2.setTextColor((qcVar.d && qcVar.s == -1) ? qcVar.getThemedColor(i10) : -1);
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = qcVar.c;
            textView.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(tL_premium_boostsStatus != null ? tL_premium_boostsStatus.boosts : 0, "BoostingGroupBoostCount", new Object[0])));
            textView2.setText(org.telegram.messenger.gd.N0(2131753350, null));
            linearLayout.addView(textView);
            linearLayout.addView(textView2, c8.na.k(3.0f, 0.0f, 0.0f, 0.0f, -2, -2));
            addView(linearLayout, c8.na.e(-1, -2, 80));
        }
    }

    public final void a() {
        float f10;
        boolean z10 = getResources().getConfiguration().orientation == 2;
        int i7 = (org.telegram.messenger.g0.Q1() || !z10) ? 20 : 18;
        org.telegram.ui.ActionBar.n5 n5Var = this.c;
        n5Var.setTextSize(i7);
        if (org.telegram.messenger.g0.Q1()) {
            f10 = -2.0f;
        } else {
            f10 = z10 ? 4 : 0;
        }
        n5Var.setTranslationY(org.telegram.messenger.g0.L(f10));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        org.telegram.ui.ActionBar.n5 n5Var = this.c;
        if (n5Var != null) {
            qc qcVar = this.h;
            int i7 = -1;
            n5Var.setTextColor((!qcVar.d || qcVar.s == -1) ? qcVar.getThemedColor(org.telegram.ui.ActionBar.n6.A8) : -1);
            if (qcVar.d && qcVar.s == -1) {
                i7 = qcVar.getThemedColor(org.telegram.ui.ActionBar.n6.A8);
            }
            this.e.setTextColor(i7);
        }
    }
}
