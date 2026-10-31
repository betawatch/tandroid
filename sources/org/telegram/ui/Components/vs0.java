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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class vs0 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.ActionBar.p6 a;
    public final org.telegram.ui.Cells.k6 b;
    public final View c;

    public vs0(int i10, Context context, boolean z10, org.telegram.ui.ActionBar.p6 p6Var, uo0 uo0Var) {
        super(context);
        this.a = p6Var;
        org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(context, p6Var);
        this.b = k6Var;
        int i11 = org.telegram.ui.ActionBar.t6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i11, p6Var), 2, -1);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i11);
        k6Var.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(k6Var, h02, null, N, p6Var);
        addView(k6Var, w7.b6.c(-2.0f, -1));
        View view = new View(context);
        this.c = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i12 = org.telegram.ui.ActionBar.t6.d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.t6.r1(0.4f, org.telegram.ui.ActionBar.t6.w0(i12, p6Var)), org.telegram.ui.ActionBar.t6.w0(i12, p6Var)}));
        addView(view, w7.b6.c(60.0f, -1));
        vh.d dVar = new vh.d(context, p6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.cd.L0(z10 ? 2131748344 : 2131748342, null));
        spannableStringBuilder.append((CharSequence) " ");
        SpannableString spannableString = new SpannableString("l");
        spannableString.setSpan(new dq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        dVar.i(spannableStringBuilder, false, true);
        addView(dVar, w7.b6.d(-1, 48.0f, 48, 14.0f, 38.0f, 14.0f, 0.0f));
        dVar.setOnClickListener(new db0(uo0Var, 14));
        p80 p80Var = new p80(context, p6Var);
        p80Var.setTextSize(1, 13.0f);
        p80Var.setTextAlignment(4);
        p80Var.setGravity(17);
        org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.G6, p6Var);
        org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.n6, p6Var);
        p80Var.setLineSpacing(org.telegram.messenger.i0.L(3.0f), 1.0f);
        SpannableStringBuilder x22 = org.telegram.messenger.i0.x2(org.telegram.messenger.cd.L0(z10 ? 2131748343 : 2131748341, null), new uo0(uo0Var, 6));
        SpannableString spannableString2 = new SpannableString("" + org.telegram.messenger.vp.r1(i10).y4);
        spannableString2.setSpan(new x41(org.telegram.messenger.i0.o()), 0, spannableString2.length(), 33);
        p80Var.setText(org.telegram.messenger.i0.J2(x22, spannableString2, "%s"));
        addView(p80Var, w7.b6.d(-1, -2.0f, 49, 24.0f, 96.0f, 24.0f, 12.0f));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d6));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(145.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        org.telegram.ui.ActionBar.p6 p6Var = this.a;
        View view = this.c;
        if (view != null) {
            try {
                if (view.getBackground() instanceof GradientDrawable) {
                    GradientDrawable gradientDrawable = (GradientDrawable) view.getBackground();
                    int i10 = org.telegram.ui.ActionBar.t6.d6;
                    gradientDrawable.setColors(new int[]{org.telegram.ui.ActionBar.t6.r1(0.4f, org.telegram.ui.ActionBar.t6.w0(i10, p6Var)), org.telegram.ui.ActionBar.t6.w0(i10, p6Var)});
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }
}
