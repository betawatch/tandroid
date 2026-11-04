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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ur0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 a;
    public final org.telegram.ui.Cells.f6 b;
    public final View c;

    public ur0(int i3, Context context, boolean z10, org.telegram.ui.ActionBar.e6 e6Var, sp0 sp0Var) {
        super(context);
        this.a = e6Var;
        org.telegram.ui.Cells.f6 f6Var = new org.telegram.ui.Cells.f6(context, e6Var);
        this.b = f6Var;
        int i10 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i10, e6Var), 2, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        f6Var.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(f6Var, h02, null, N, e6Var);
        addView(f6Var, b8.mf.c(-2.0f, -1));
        View view = new View(context);
        this.c = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i11 = org.telegram.ui.ActionBar.k6.d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.k6.r1(0.4f, org.telegram.ui.ActionBar.k6.w0(i11, e6Var)), org.telegram.ui.ActionBar.k6.w0(i11, e6Var)}));
        addView(view, b8.mf.c(60.0f, -1));
        gi.d dVar = new gi.d(context, e6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0(z10 ? 2131748337 : 2131748335, null));
        spannableStringBuilder.append((CharSequence) " ");
        SpannableString spannableString = new SpannableString("l");
        spannableString.setSpan(new wp(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        dVar.i(spannableStringBuilder, false, true);
        addView(dVar, b8.mf.d(-1, 48.0f, 48, 14.0f, 38.0f, 14.0f, 0.0f));
        dVar.setOnClickListener(new ga0(sp0Var, 14));
        s70 s70Var = new s70(context, e6Var);
        s70Var.setTextSize(1, 13.0f);
        s70Var.setTextAlignment(4);
        s70Var.setGravity(17);
        org.telegram.ui.ActionBar.r6.V(s70Var, org.telegram.ui.ActionBar.k6.G6, e6Var);
        org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.n6, e6Var);
        s70Var.setLineSpacing(org.telegram.messenger.g0.L(3.0f), 1.0f);
        SpannableStringBuilder x22 = org.telegram.messenger.g0.x2(org.telegram.messenger.bd.M0(z10 ? 2131748336 : 2131748334, null), new sp0(sp0Var, 3));
        SpannableString spannableString2 = new SpannableString("" + org.telegram.messenger.hp.s1(i3).x4);
        spannableString2.setSpan(new o31(org.telegram.messenger.g0.o()), 0, spannableString2.length(), 33);
        s70Var.setText(org.telegram.messenger.g0.K2(x22, spannableString2, "%s"));
        addView(s70Var, b8.mf.d(-1, -2.0f, 49, 24.0f, 96.0f, 24.0f, 12.0f));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d6));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(145.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        View view = this.c;
        if (view != null) {
            try {
                if (view.getBackground() instanceof GradientDrawable) {
                    GradientDrawable gradientDrawable = (GradientDrawable) view.getBackground();
                    int i3 = org.telegram.ui.ActionBar.k6.d6;
                    gradientDrawable.setColors(new int[]{org.telegram.ui.ActionBar.k6.r1(0.4f, org.telegram.ui.ActionBar.k6.w0(i3, e6Var)), org.telegram.ui.ActionBar.k6.w0(i3, e6Var)});
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}
