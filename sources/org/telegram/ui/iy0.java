package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class iy0 extends org.telegram.ui.Components.ma {
    public final LinearLayout Q1;
    public final org.telegram.ui.Components.wp R1;
    public final org.telegram.ui.Components.s70 S1;
    public org.telegram.ui.Components.f41 T1;

    public iy0(Context context, boolean z10, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.messenger.u10 u10Var) {
        super(context, null, false, false, e6Var);
        org.telegram.ui.ActionBar.e6 e6Var2;
        N();
        this.s1 = 0.2f;
        final int i3 = 1;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        int i10 = org.telegram.ui.ActionBar.k6.Ci;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.Q1 = linearLayout;
        final int i11 = 0;
        linearLayout.setPadding(org.telegram.messenger.g0.L(6.0f) + this.u0, 0, org.telegram.messenger.g0.L(6.0f) + this.u0, 0);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.fh0 fh0Var = new org.telegram.ui.Components.fh0(getContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        fh0Var.setScaleType(scaleType);
        fh0Var.setImageResource(R.drawable.large_ads_info);
        fh0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        ShapeDrawable L = org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(80.0f), org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        fh0Var.setBackground(L);
        org.telegram.ui.ActionBar.r6.k(fh0Var, L, N, null, e6Var);
        frameLayout.addView(fh0Var, b8.mf.d(80, 80.0f, 1, 0.0f, 20.0f, 0.0f, 0.0f));
        if (u10Var != null) {
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
            imageView.setContentDescription(org.telegram.messenger.bd.M0(2131754839, null));
            imageView.setScaleType(scaleType);
            org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.r5, null, PorterDuff.Mode.SRC_ATOP);
            int i12 = org.telegram.ui.ActionBar.k6.i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i12, false), 1, -1);
            org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i12);
            imageView.setBackground(h02);
            org.telegram.ui.ActionBar.r6.k(imageView, h02, null, N2, null);
            e6Var2 = e6Var;
            imageView.setOnClickListener(new ai.r4(this, u10Var, e6Var, imageView, 16));
            frameLayout.addView(imageView, b8.mf.d(24, 24.0f, 53, 12.0f, 14.0f, 14.0f, 12.0f));
        } else {
            e6Var2 = e6Var;
        }
        linearLayout.addView(frameLayout, b8.mf.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 100));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.bd.M0(2131754943, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i13 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(textView, i13, e6Var2);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, b8.mf.t(-2, -2, 1, 22, 14, 22, 0), context);
        f10.setText(org.telegram.messenger.bd.M0(2131746054, null));
        org.telegram.ui.ActionBar.r6.V(f10, i13, e6Var2);
        f10.setTextSize(1, 14.0f);
        f10.setGravity(1);
        linearLayout.addView(f10, b8.mf.t(-2, -2, 1, 22, 8, 22, 0));
        linearLayout.addView(new yg0(this, context, R.drawable.menu_privacy, org.telegram.messenger.bd.M0(z10 ? 2131746050 : 2131746051, null), org.telegram.messenger.bd.M0(z10 ? 2131746052 : 2131746053, null)), b8.mf.q(-1, -2, 0.0f, 0, 0, 20, 0, 0));
        linearLayout.addView(new yg0(this, context, R.drawable.menu_feature_split, org.telegram.messenger.bd.M0(z10 ? 2131746046 : 2131746047, null), org.telegram.messenger.bd.M0(z10 ? 2131746048 : 2131746049, null)), b8.mf.q(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        String a02 = org.telegram.messenger.bd.a0(null, null, z10 ? 2131746044 : 2131746045, Integer.valueOf(org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).z4));
        int i14 = org.telegram.ui.ActionBar.k6.Uc;
        linearLayout.addView(new yg0(this, context, R.drawable.menu_feature_noads, org.telegram.messenger.bd.M0(2131746043, null), org.telegram.messenger.g0.S2(a02, i14, 0, new Runnable(this) { // from class: org.telegram.ui.hy0
            public final /* synthetic */ iy0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i15 = i11;
                iy0 iy0Var = this.b;
                switch (i15) {
                    case 0:
                        iy0Var.getClass();
                        org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                        if (T != null) {
                            T.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.q0(3)));
                            iy0Var.dismiss();
                            break;
                        }
                        break;
                    default:
                        iy0Var.dismiss();
                        sf.c.t(iy0Var.getContext(), org.telegram.messenger.bd.M0(2131746626, null));
                        break;
                }
            }
        }, null)), b8.mf.q(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        View view = new View(getContext());
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d7, view, e6Var2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(20.0f));
        linearLayout.addView(view, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setText(org.telegram.messenger.bd.M0(z10 ? 2131746038 : 2131746039, null));
        textView2.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.r6.V(textView2, i13, e6Var2);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        linearLayout.addView(textView2, b8.mf.t(-2, -2, 1, 22, 0, 22, 0));
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(z10 ? 2131746041 : 2131746042, null));
        SpannableStringBuilder S2 = org.telegram.messenger.g0.S2(org.telegram.messenger.bd.M0(2131746040, null), i14, 0, new Runnable(this) { // from class: org.telegram.ui.hy0
            public final /* synthetic */ iy0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i15 = i3;
                iy0 iy0Var = this.b;
                switch (i15) {
                    case 0:
                        iy0Var.getClass();
                        org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                        if (T != null) {
                            T.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.q0(3)));
                            iy0Var.dismiss();
                            break;
                        }
                        break;
                    default:
                        iy0Var.dismiss();
                        sf.c.t(iy0Var.getContext(), org.telegram.messenger.bd.M0(2131746626, null));
                        break;
                }
            }
        }, null);
        SpannableString spannableString = new SpannableString(">");
        org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(R.drawable.attach_arrow_right, 0);
        this.R1 = wpVar;
        wpVar.y = org.telegram.ui.ActionBar.k6.x0(null, i14, false);
        wpVar.I = 0.7f;
        wpVar.J = 0.7f;
        wpVar.F = org.telegram.messenger.g0.L(12.0f);
        wpVar.s = 1.0f;
        spannableString.setSpan(wpVar, 0, spannableString.length(), 33);
        SpannableStringBuilder K2 = org.telegram.messenger.g0.K2(org.telegram.messenger.g0.K2(X2, S2, "%1$s"), spannableString, ">");
        org.telegram.ui.Components.s70 s70Var = new org.telegram.ui.Components.s70(context, null);
        this.S1 = s70Var;
        s70Var.setText(K2);
        org.telegram.ui.ActionBar.r6.V(s70Var, i13, e6Var2);
        s70Var.setTextSize(1, 14.0f);
        s70Var.setGravity(1);
        s70Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        linearLayout.addView(s70Var, b8.mf.t(-2, -2, 1, 26, 8, 26, 0));
        TextView textView3 = new TextView(context);
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.Gi, e6Var2);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextSize(1, 14.0f);
        textView3.setText(org.telegram.messenger.bd.M0(2131746055, null));
        org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.y5.e(org.telegram.ui.ActionBar.k6.w0(i10, e6Var2), 6.0f);
        org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i10);
        org.telegram.ui.ActionBar.n6 f11 = org.telegram.ui.ActionBar.r6.f(i10);
        textView3.setBackground(e10);
        org.telegram.ui.ActionBar.r6.k(textView3, e10, N3, f11, e6Var2);
        textView3.setOnClickListener(new cy0(this, i3));
        linearLayout.addView(textView3, b8.mf.t(-1, 48, 0, 14, 22, 14, 14));
        this.T1.O(false);
    }

    public static iy0 d1(Context context, org.telegram.ui.ActionBar.d2 d2Var, boolean z10, org.telegram.ui.ActionBar.e6 e6Var, mi.f fVar) {
        iy0 iy0Var = new iy0(context, z10, e6Var, fVar);
        if (d2Var == null) {
            iy0Var.show();
            return iy0Var;
        }
        if (d2Var.getParentActivity() != null) {
            d2Var.showDialog(iy0Var);
        }
        return iy0Var;
    }

    public static void e1(Context context, org.telegram.ui.ActionBar.e6 e6Var, wm wmVar) {
        d1(context, wmVar, false, e6Var, null);
    }

    @Override // org.telegram.ui.Components.ma
    public final org.telegram.ui.Components.sj0 L0(org.telegram.ui.Components.tj0 tj0Var) {
        org.telegram.ui.Components.f41 f41Var = new org.telegram.ui.Components.f41(tj0Var, getContext(), this.a, 0, true, new c5(this, 20), this.J0);
        this.T1 = f41Var;
        return f41Var;
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        return org.telegram.messenger.bd.M0(2131754943, null);
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void s0() {
        super.s0();
        try {
            org.telegram.ui.Components.wp wpVar = this.R1;
            if (wpVar != null) {
                wpVar.y = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Uc, false);
                org.telegram.ui.Components.s70 s70Var = this.S1;
                if (s70Var != null) {
                    s70Var.invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
