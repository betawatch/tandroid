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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class vr0 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 a;
    public final org.telegram.ui.Cells.g6 b;
    public final View c;

    public vr0(int i7, Context context, boolean z9, org.telegram.ui.ActionBar.f6 f6Var, ir0 ir0Var) {
        super(context);
        this.a = f6Var;
        org.telegram.ui.Cells.g6 g6Var = new org.telegram.ui.Cells.g6(context, f6Var);
        this.b = g6Var;
        int i10 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i10, f6Var), 2, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        g6Var.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(g6Var, h02, null, N, f6Var);
        addView(g6Var, c8.ha.c(-2.0f, -1));
        View view = new View(context);
        this.c = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i11 = org.telegram.ui.ActionBar.k6.d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.k6.r1(0.4f, org.telegram.ui.ActionBar.k6.w0(i11, f6Var)), org.telegram.ui.ActionBar.k6.w0(i11, f6Var)}));
        addView(view, c8.ha.c(60.0f, -1));
        fi.d dVar = new fi.d(context, f6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(z9 ? 2131748328 : 2131748326, null));
        spannableStringBuilder.append((CharSequence) " ");
        SpannableString spannableString = new SpannableString("l");
        spannableString.setSpan(new wp(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        dVar.i(spannableStringBuilder, false, true);
        addView(dVar, c8.ha.d(-1, 48.0f, 48, 14.0f, 38.0f, 14.0f, 0.0f));
        dVar.setOnClickListener(new la0(ir0Var, 13));
        w70 w70Var = new w70(context, f6Var);
        w70Var.setTextSize(1, 13.0f);
        w70Var.setTextAlignment(4);
        w70Var.setGravity(17);
        org.telegram.ui.ActionBar.r6.V(w70Var, org.telegram.ui.ActionBar.k6.G6, f6Var);
        org.telegram.ui.ActionBar.r6.H(w70Var, org.telegram.ui.ActionBar.k6.n6, f6Var);
        w70Var.setLineSpacing(org.telegram.messenger.g0.L(3.0f), 1.0f);
        SpannableStringBuilder x22 = org.telegram.messenger.g0.x2(org.telegram.messenger.hd.M0(z9 ? 2131748327 : 2131748325, null), new ir0(ir0Var, 1));
        SpannableString spannableString2 = new SpannableString("" + org.telegram.messenger.qp.s1(i7).x4);
        spannableString2.setSpan(new o31(org.telegram.messenger.g0.o()), 0, spannableString2.length(), 33);
        w70Var.setText(org.telegram.messenger.g0.K2(x22, spannableString2, "%s"));
        addView(w70Var, c8.ha.d(-1, -2.0f, 49, 24.0f, 96.0f, 24.0f, 12.0f));
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d6));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(145.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        View view = this.c;
        if (view != null) {
            try {
                if (view.getBackground() instanceof GradientDrawable) {
                    GradientDrawable gradientDrawable = (GradientDrawable) view.getBackground();
                    int i7 = org.telegram.ui.ActionBar.k6.d6;
                    gradientDrawable.setColors(new int[]{org.telegram.ui.ActionBar.k6.r1(0.4f, org.telegram.ui.ActionBar.k6.w0(i7, f6Var)), org.telegram.ui.ActionBar.k6.w0(i7, f6Var)});
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}
