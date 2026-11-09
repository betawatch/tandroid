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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class xr0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 a;
    public final org.telegram.ui.Cells.g6 b;
    public final View c;

    public xr0(int i7, Context context, boolean z9, org.telegram.ui.ActionBar.g6 g6Var, kr0 kr0Var) {
        super(context);
        this.a = g6Var;
        org.telegram.ui.Cells.g6 g6Var2 = new org.telegram.ui.Cells.g6(context, g6Var);
        this.b = g6Var2;
        int i10 = org.telegram.ui.ActionBar.l6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.w0(i10, g6Var), 2, -1);
        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i10);
        g6Var2.setBackground(h02);
        org.telegram.ui.ActionBar.s6.j(g6Var2, h02, null, M, g6Var);
        addView(g6Var2, c8.ha.c(-2.0f, -1));
        View view = new View(context);
        this.c = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i11 = org.telegram.ui.ActionBar.l6.d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.l6.r1(0.4f, org.telegram.ui.ActionBar.l6.w0(i11, g6Var)), org.telegram.ui.ActionBar.l6.w0(i11, g6Var)}));
        addView(view, c8.ha.c(60.0f, -1));
        fi.d dVar = new fi.d(context, g6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.M0(z9 ? 2131748329 : 2131748327, null));
        spannableStringBuilder.append((CharSequence) " ");
        SpannableString spannableString = new SpannableString("l");
        spannableString.setSpan(new wp(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        dVar.i(spannableStringBuilder, false, true);
        addView(dVar, c8.ha.d(-1, 48.0f, 48, 14.0f, 38.0f, 14.0f, 0.0f));
        dVar.setOnClickListener(new ma0(kr0Var, 13));
        x70 x70Var = new x70(context, g6Var);
        x70Var.setTextSize(1, 13.0f);
        x70Var.setTextAlignment(4);
        x70Var.setGravity(17);
        org.telegram.ui.ActionBar.s6.U(x70Var, org.telegram.ui.ActionBar.l6.G6, g6Var);
        org.telegram.ui.ActionBar.s6.G(x70Var, org.telegram.ui.ActionBar.l6.n6, g6Var);
        x70Var.setLineSpacing(org.telegram.messenger.g0.L(3.0f), 1.0f);
        SpannableStringBuilder x22 = org.telegram.messenger.g0.x2(org.telegram.messenger.id.M0(z9 ? 2131748328 : 2131748326, null), new kr0(kr0Var, 1));
        SpannableString spannableString2 = new SpannableString("" + org.telegram.messenger.qp.s1(i7).x4);
        spannableString2.setSpan(new v31(org.telegram.messenger.g0.o()), 0, spannableString2.length(), 33);
        x70Var.setText(org.telegram.messenger.g0.K2(x22, spannableString2, "%s"));
        addView(x70Var, c8.ha.d(-1, -2.0f, 49, 24.0f, 96.0f, 24.0f, 12.0f));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.d6));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(145.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        org.telegram.ui.ActionBar.g6 g6Var = this.a;
        View view = this.c;
        if (view != null) {
            try {
                if (view.getBackground() instanceof GradientDrawable) {
                    GradientDrawable gradientDrawable = (GradientDrawable) view.getBackground();
                    int i7 = org.telegram.ui.ActionBar.l6.d6;
                    gradientDrawable.setColors(new int[]{org.telegram.ui.ActionBar.l6.r1(0.4f, org.telegram.ui.ActionBar.l6.w0(i7, g6Var)), org.telegram.ui.ActionBar.l6.w0(i7, g6Var)});
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}
