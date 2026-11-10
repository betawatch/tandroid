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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class wr0 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.h6 a;
    public final org.telegram.ui.Cells.g6 b;
    public final View c;

    public wr0(int i7, Context context, boolean z9, org.telegram.ui.ActionBar.h6 h6Var, jr0 jr0Var) {
        super(context);
        this.a = h6Var;
        org.telegram.ui.Cells.g6 g6Var = new org.telegram.ui.Cells.g6(context, h6Var);
        this.b = g6Var;
        int i10 = org.telegram.ui.ActionBar.m6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i10, h6Var), 2, -1);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i10);
        g6Var.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(g6Var, h02, null, M, h6Var);
        addView(g6Var, c8.ha.c(-2.0f, -1));
        View view = new View(context);
        this.c = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i11 = org.telegram.ui.ActionBar.m6.d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.m6.r1(0.4f, org.telegram.ui.ActionBar.m6.w0(i11, h6Var)), org.telegram.ui.ActionBar.m6.w0(i11, h6Var)}));
        addView(view, c8.ha.c(60.0f, -1));
        fi.d dVar = new fi.d(context, h6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.M0(z9 ? 2131748329 : 2131748327, null));
        spannableStringBuilder.append((CharSequence) " ");
        SpannableString spannableString = new SpannableString("l");
        spannableString.setSpan(new wp(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        dVar.i(spannableStringBuilder, false, true);
        addView(dVar, c8.ha.d(-1, 48.0f, 48, 14.0f, 38.0f, 14.0f, 0.0f));
        dVar.setOnClickListener(new la0(jr0Var, 13));
        w70 w70Var = new w70(context, h6Var);
        w70Var.setTextSize(1, 13.0f);
        w70Var.setTextAlignment(4);
        w70Var.setGravity(17);
        org.telegram.ui.ActionBar.t6.U(w70Var, org.telegram.ui.ActionBar.m6.G6, h6Var);
        org.telegram.ui.ActionBar.t6.G(w70Var, org.telegram.ui.ActionBar.m6.n6, h6Var);
        w70Var.setLineSpacing(org.telegram.messenger.g0.L(3.0f), 1.0f);
        SpannableStringBuilder x22 = org.telegram.messenger.g0.x2(org.telegram.messenger.id.M0(z9 ? 2131748328 : 2131748326, null), new jr0(jr0Var, 1));
        SpannableString spannableString2 = new SpannableString("" + org.telegram.messenger.qp.s1(i7).x4);
        spannableString2.setSpan(new u31(org.telegram.messenger.g0.o()), 0, spannableString2.length(), 33);
        w70Var.setText(org.telegram.messenger.g0.K2(x22, spannableString2, "%s"));
        addView(w70Var, c8.ha.d(-1, -2.0f, 49, 24.0f, 96.0f, 24.0f, 12.0f));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.d6));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(145.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.c6
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
