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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class wr0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 a;
    public final org.telegram.ui.Cells.f6 b;
    public final View c;

    public wr0(int i7, Context context, boolean z10, org.telegram.ui.ActionBar.e6 e6Var, ro0 ro0Var) {
        super(context);
        this.a = e6Var;
        org.telegram.ui.Cells.f6 f6Var = new org.telegram.ui.Cells.f6(context, e6Var);
        this.b = f6Var;
        int i10 = org.telegram.ui.ActionBar.j6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i10, e6Var), 2, -1);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i10);
        f6Var.setBackground(h02);
        org.telegram.ui.ActionBar.q6.j(f6Var, h02, null, M, e6Var);
        addView(f6Var, c8.ja.c(-2.0f, -1));
        View view = new View(context);
        this.c = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i11 = org.telegram.ui.ActionBar.j6.d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.j6.r1(0.4f, org.telegram.ui.ActionBar.j6.w0(i11, e6Var)), org.telegram.ui.ActionBar.j6.w0(i11, e6Var)}));
        addView(view, c8.ja.c(60.0f, -1));
        hi.d dVar = new hi.d(context, e6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(z10 ? 2131748329 : 2131748327, null));
        spannableStringBuilder.append((CharSequence) " ");
        SpannableString spannableString = new SpannableString("l");
        spannableString.setSpan(new eq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        dVar.i(spannableStringBuilder, false, true);
        addView(dVar, c8.ja.d(-1, 48.0f, 48, 14.0f, 38.0f, 14.0f, 0.0f));
        dVar.setOnClickListener(new y60(ro0Var, 14));
        z70 z70Var = new z70(context, e6Var);
        z70Var.setTextSize(1, 13.0f);
        z70Var.setTextAlignment(4);
        z70Var.setGravity(17);
        org.telegram.ui.ActionBar.q6.U(z70Var, org.telegram.ui.ActionBar.j6.G6, e6Var);
        org.telegram.ui.ActionBar.q6.G(z70Var, org.telegram.ui.ActionBar.j6.n6, e6Var);
        z70Var.setLineSpacing(org.telegram.messenger.g0.L(3.0f), 1.0f);
        SpannableStringBuilder x22 = org.telegram.messenger.g0.x2(org.telegram.messenger.hd.M0(z10 ? 2131748328 : 2131748326, null), new ro0(ro0Var, 4));
        SpannableString spannableString2 = new SpannableString("" + org.telegram.messenger.np.s1(i7).y4);
        spannableString2.setSpan(new y31(org.telegram.messenger.g0.o()), 0, spannableString2.length(), 33);
        z70Var.setText(org.telegram.messenger.g0.K2(x22, spannableString2, "%s"));
        addView(z70Var, c8.ja.d(-1, -2.0f, 49, 24.0f, 96.0f, 24.0f, 12.0f));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.d6));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(145.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        View view = this.c;
        if (view != null) {
            try {
                if (view.getBackground() instanceof GradientDrawable) {
                    GradientDrawable gradientDrawable = (GradientDrawable) view.getBackground();
                    int i7 = org.telegram.ui.ActionBar.j6.d6;
                    gradientDrawable.setColors(new int[]{org.telegram.ui.ActionBar.j6.r1(0.4f, org.telegram.ui.ActionBar.j6.w0(i7, e6Var)), org.telegram.ui.ActionBar.j6.w0(i7, e6Var)});
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}
