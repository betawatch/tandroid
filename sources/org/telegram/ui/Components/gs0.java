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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class gs0 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.i6 a;
    public final org.telegram.ui.Cells.g6 b;
    public final View c;

    public gs0(int i7, Context context, boolean z10, org.telegram.ui.ActionBar.i6 i6Var, bp0 bp0Var) {
        super(context);
        this.a = i6Var;
        org.telegram.ui.Cells.g6 g6Var = new org.telegram.ui.Cells.g6(context, i6Var);
        this.b = g6Var;
        int i10 = org.telegram.ui.ActionBar.n6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i10, i6Var), 2, -1);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i10);
        g6Var.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(g6Var, h02, null, M, i6Var);
        addView(g6Var, c8.na.c(-2.0f, -1));
        View view = new View(context);
        this.c = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i11 = org.telegram.ui.ActionBar.n6.d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.n6.r1(0.4f, org.telegram.ui.ActionBar.n6.w0(i11, i6Var)), org.telegram.ui.ActionBar.n6.w0(i11, i6Var)}));
        addView(view, c8.na.c(60.0f, -1));
        hi.e eVar = new hi.e(context, i6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.N0(z10 ? 2131748136 : 2131748134, null));
        spannableStringBuilder.append((CharSequence) " ");
        SpannableString spannableString = new SpannableString("l");
        spannableString.setSpan(new kq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        eVar.i(spannableStringBuilder, false, true);
        addView(eVar, c8.na.d(-1, 48.0f, 48, 14.0f, 38.0f, 14.0f, 0.0f));
        eVar.setOnClickListener(new g70(bp0Var, 16));
        j80 j80Var = new j80(context, i6Var);
        j80Var.setTextSize(1, 13.0f);
        j80Var.setTextAlignment(4);
        j80Var.setGravity(17);
        org.telegram.ui.ActionBar.u6.U(j80Var, org.telegram.ui.ActionBar.n6.G6, i6Var);
        org.telegram.ui.ActionBar.u6.G(j80Var, org.telegram.ui.ActionBar.n6.n6, i6Var);
        j80Var.setLineSpacing(org.telegram.messenger.g0.L(3.0f), 1.0f);
        SpannableStringBuilder x22 = org.telegram.messenger.g0.x2(org.telegram.messenger.gd.N0(z10 ? 2131748135 : 2131748133, null), new bp0(bp0Var, 4));
        SpannableString spannableString2 = new SpannableString("" + org.telegram.messenger.mp.u1(i7).A4);
        spannableString2.setSpan(new k41(org.telegram.messenger.g0.o()), 0, spannableString2.length(), 33);
        j80Var.setText(org.telegram.messenger.g0.K2(x22, spannableString2, "%s"));
        addView(j80Var, c8.na.d(-1, -2.0f, 49, 24.0f, 96.0f, 24.0f, 12.0f));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.d6));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(145.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        org.telegram.ui.ActionBar.i6 i6Var = this.a;
        View view = this.c;
        if (view != null) {
            try {
                if (view.getBackground() instanceof GradientDrawable) {
                    GradientDrawable gradientDrawable = (GradientDrawable) view.getBackground();
                    int i7 = org.telegram.ui.ActionBar.n6.d6;
                    gradientDrawable.setColors(new int[]{org.telegram.ui.ActionBar.n6.r1(0.4f, org.telegram.ui.ActionBar.n6.w0(i7, i6Var)), org.telegram.ui.ActionBar.n6.w0(i7, i6Var)});
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}
