package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class hs0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.h6 a;
    public final org.telegram.ui.Cells.h6 b;
    public final View c;

    public hs0(int i7, Context context, boolean z10, org.telegram.ui.ActionBar.h6 h6Var, cp0 cp0Var) {
        super(context);
        this.a = h6Var;
        org.telegram.ui.Cells.h6 h6Var2 = new org.telegram.ui.Cells.h6(context, h6Var);
        this.b = h6Var2;
        int i10 = org.telegram.ui.ActionBar.m6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i10, h6Var), 2, -1);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i10);
        h6Var2.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(h6Var2, h02, null, M, h6Var);
        addView(h6Var2, c8.ma.c(-2.0f, -1));
        View view = new View(context);
        this.c = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i11 = org.telegram.ui.ActionBar.m6.d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.m6.r1(0.4f, org.telegram.ui.ActionBar.m6.w0(i11, h6Var)), org.telegram.ui.ActionBar.m6.w0(i11, h6Var)}));
        addView(view, c8.ma.c(60.0f, -1));
        hi.e eVar = new hi.e(context, h6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.N0(z10 ? 2131748136 : 2131748134, null));
        spannableStringBuilder.append((CharSequence) " ");
        SpannableString spannableString = new SpannableString("l");
        spannableString.setSpan(new nq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        eVar.i(spannableStringBuilder, false, true);
        addView(eVar, c8.ma.d(-1, 48.0f, 48, 14.0f, 38.0f, 14.0f, 0.0f));
        eVar.setOnClickListener(new j70(cp0Var, 16));
        m80 m80Var = new m80(context, h6Var);
        m80Var.setTextSize(1, 13.0f);
        m80Var.setTextAlignment(4);
        m80Var.setGravity(17);
        org.telegram.ui.ActionBar.t6.U(m80Var, org.telegram.ui.ActionBar.m6.G6, h6Var);
        org.telegram.ui.ActionBar.t6.G(m80Var, org.telegram.ui.ActionBar.m6.n6, h6Var);
        m80Var.setLineSpacing(org.telegram.messenger.g0.L(3.0f), 1.0f);
        SpannableStringBuilder x22 = org.telegram.messenger.g0.x2(org.telegram.messenger.hd.N0(z10 ? 2131748135 : 2131748133, null), new cp0(cp0Var, 4));
        SpannableString spannableString2 = new SpannableString("" + org.telegram.messenger.np.u1(i7).A4);
        spannableString2.setSpan(new l41(org.telegram.messenger.g0.o()), 0, spannableString2.length(), 33);
        m80Var.setText(org.telegram.messenger.g0.K2(x22, spannableString2, "%s"));
        addView(m80Var, c8.ma.d(-1, -2.0f, 49, 24.0f, 96.0f, 24.0f, 12.0f));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.d6));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(145.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        org.telegram.ui.ActionBar.h6 h6Var = this.a;
        View view = this.c;
        if (view != null) {
            try {
                if (view.getBackground() instanceof GradientDrawable) {
                    GradientDrawable gradientDrawable = (GradientDrawable) view.getBackground();
                    int i7 = org.telegram.ui.ActionBar.m6.d6;
                    gradientDrawable.setColors(new int[]{org.telegram.ui.ActionBar.m6.r1(0.4f, org.telegram.ui.ActionBar.m6.w0(i7, h6Var)), org.telegram.ui.ActionBar.m6.w0(i7, h6Var)});
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}
