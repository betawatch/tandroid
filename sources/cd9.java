// default package

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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class cd9 extends mz0 {
    public final LinearLayout S1;
    public final pn2 T1;
    public final l66 U1;
    public l7c V1;

    public cd9(Context context, boolean z, ylb ylbVar, x0 x0Var) {
        super(context, null, false, false, ylbVar);
        ylb ylbVar2;
        J();
        this.u1 = 0.2f;
        final byte b = 1;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        int i = cmb.Ei;
        paint.setColor(cmb.v0(i, ylbVar));
        LinearLayout linearLayout = new LinearLayout(context);
        this.S1 = linearLayout;
        final byte b2 = 0;
        linearLayout.setPadding(gm.L(6.0f) + this.u0, 0, gm.L(6.0f) + this.u0, 0);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        s09 s09Var = new s09(getContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        s09Var.setScaleType(scaleType);
        s09Var.setImageResource(R.drawable.large_ads_info);
        s09Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        ShapeDrawable K = cmb.K(gm.L(80.0f), cmb.v0(i, ylbVar));
        wmb M = anb.M(i);
        s09Var.setBackground(K);
        anb.j(s09Var, K, M, null, ylbVar);
        frameLayout.addView(s09Var, qoe.d(80, 80.0f, 1, 0.0f, 20.0f, 0.0f, 0.0f));
        if (x0Var != null) {
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
            imageView.setContentDescription(jb6.M0(2131754838, null));
            imageView.setScaleType(scaleType);
            anb.s(imageView, cmb.q5, null, PorterDuff.Mode.SRC_ATOP);
            int i2 = cmb.h6;
            fg0 f0 = cmb.f0(cmb.w0(null, i2, false), 1, -1);
            wmb M2 = anb.M(i2);
            imageView.setBackground(f0);
            anb.j(imageView, f0, null, M2, null);
            ylbVar2 = ylbVar;
            imageView.setOnClickListener(new ef((Object) this, (Object) x0Var, (Object) ylbVar, (Object) imageView, (byte) 16));
            frameLayout.addView(imageView, qoe.d(24, 24.0f, 53, 12.0f, 14.0f, 14.0f, 12.0f));
        } else {
            ylbVar2 = ylbVar;
        }
        linearLayout.addView(frameLayout, qoe.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 100));
        TextView textView = new TextView(context);
        textView.setText(jb6.M0(2131754943, null));
        textView.setTypeface(gm.o());
        int i3 = cmb.F6;
        anb.X(textView, i3, ylbVar2);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        TextView m = wi8.m(linearLayout, textView, qoe.t(-2, -2, 1, 22, 14, 22, 0), context);
        m.setText(jb6.M0(2131745777, null));
        anb.X(m, i3, ylbVar2);
        m.setTextSize(1, 14.0f);
        m.setGravity(1);
        linearLayout.addView(m, qoe.t(-2, -2, 1, 22, 8, 22, 0));
        linearLayout.addView(new ct8(this, context, R.drawable.menu_privacy, jb6.M0(z ? 2131745773 : 2131745774, null), jb6.M0(z ? 2131745775 : 2131745776, null)), qoe.q(-1, -2, 0.0f, 0, 0, 20, 0, 0));
        linearLayout.addView(new ct8(this, context, R.drawable.menu_feature_split, jb6.M0(z ? 2131745769 : 2131745770, null), jb6.M0(z ? 2131745771 : 2131745772, null)), qoe.q(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        String a0 = jb6.a0(null, null, z ? 2131745767 : 2131745768, Integer.valueOf(oc7.r1(z8c.t0).l4.T1.f()));
        int i4 = cmb.Wc;
        linearLayout.addView(new ct8(this, context, R.drawable.menu_feature_noads, jb6.M0(2131745766, null), gm.N2(a0, i4, 0, new Runnable(this) { // from class: bd9
            public final /* synthetic */ cd9 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b3 = b2;
                cd9 cd9Var = this.b;
                switch (b3) {
                    case 0:
                        d S = LaunchActivity.S();
                        if (S != null) {
                            S.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.p0(3)));
                            cd9Var.dismiss();
                            break;
                        }
                        break;
                    default:
                        cd9Var.dismiss();
                        l11.u(cd9Var.getContext(), jb6.M0(2131746351, null));
                        break;
                }
            }
        }, null)), qoe.q(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        View view = new View(getContext());
        anb.h(cmb.c7, ylbVar2, view);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(gm.L(24.0f), gm.L(20.0f), gm.L(24.0f), gm.L(20.0f));
        linearLayout.addView(view, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setText(jb6.M0(z ? 2131745761 : 2131745762, null));
        textView2.setTypeface(gm.o());
        anb.X(textView2, i3, ylbVar2);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        linearLayout.addView(textView2, qoe.t(-2, -2, 1, 22, 0, 22, 0));
        SpannableStringBuilder S2 = gm.S2(jb6.M0(z ? 2131745764 : 2131745765, null));
        SpannableStringBuilder N2 = gm.N2(jb6.M0(2131745763, null), i4, 0, new Runnable(this) { // from class: bd9
            public final /* synthetic */ cd9 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b3 = b;
                cd9 cd9Var = this.b;
                switch (b3) {
                    case 0:
                        d S = LaunchActivity.S();
                        if (S != null) {
                            S.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.p0(3)));
                            cd9Var.dismiss();
                            break;
                        }
                        break;
                    default:
                        cd9Var.dismiss();
                        l11.u(cd9Var.getContext(), jb6.M0(2131746351, null));
                        break;
                }
            }
        }, null);
        SpannableString spannableString = new SpannableString(">");
        pn2 pn2Var = new pn2(R.drawable.attach_arrow_right, 0);
        this.T1 = pn2Var;
        pn2Var.y = cmb.w0(null, i4, false);
        pn2Var.I = 0.7f;
        pn2Var.J = 0.7f;
        pn2Var.F = gm.L(12.0f);
        pn2Var.s = 1.0f;
        spannableString.setSpan(pn2Var, 0, spannableString.length(), 33);
        SpannableStringBuilder G2 = gm.G2(gm.G2(S2, N2, "%1$s"), spannableString, ">");
        l66 l66Var = new l66(context, null);
        this.U1 = l66Var;
        l66Var.setText(G2);
        anb.X(l66Var, i3, ylbVar2);
        l66Var.setTextSize(1, 14.0f);
        l66Var.setGravity(1);
        l66Var.setLineSpacing(gm.L(2.0f), 1.0f);
        linearLayout.addView(l66Var, qoe.t(-2, -2, 1, 26, 8, 26, 0));
        TextView textView3 = new TextView(context);
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        anb.X(textView3, cmb.Ii, ylbVar2);
        textView3.setTypeface(gm.o());
        textView3.setTextSize(1, 14.0f);
        textView3.setText(jb6.M0(2131745778, null));
        fg0 e = ulb.e(cmb.v0(i, ylbVar2), 6.0f);
        wmb M3 = anb.M(i);
        wmb e2 = anb.e(i);
        textView3.setBackground(e);
        anb.j(textView3, e, M3, e2, ylbVar2);
        textView3.setOnClickListener(new wk8(this, (byte) 11));
        linearLayout.addView(textView3, qoe.t(-1, 48, 0, 14, 22, 14, 14));
        this.V1.O(false);
    }

    public static cd9 Y0(Context context, d dVar, boolean z, ylb ylbVar, x0 x0Var) {
        cd9 cd9Var = new cd9(context, z, ylbVar, x0Var);
        if (dVar == null) {
            cd9Var.show();
            return cd9Var;
        }
        if (dVar.getParentActivity() != null) {
            dVar.showDialog(cd9Var);
        }
        return cd9Var;
    }

    public static void Z0(yv1 yv1Var, ylb ylbVar, Context context) {
        Y0(context, yv1Var, false, ylbVar, null);
    }

    @Override // mz0
    public final q59 G0(r59 r59Var) {
        l7c l7cVar = new l7c(r59Var, getContext(), this.a, 0, true, new vh8(this, (byte) 10), this.J0);
        this.V1 = l7cVar;
        return l7cVar;
    }

    @Override // mz0
    public final CharSequence J0() {
        return jb6.M0(2131754943, null);
    }

    @Override // my0
    public final void p0() {
        super.p0();
        try {
            pn2 pn2Var = this.T1;
            if (pn2Var != null) {
                pn2Var.y = cmb.w0(null, cmb.Wc, false);
                l66 l66Var = this.U1;
                if (l66Var != null) {
                    l66Var.invalidate();
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
