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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class cb9 extends fy0 {
    public final LinearLayout S1;
    public final cm2 T1;
    public final l46 U1;
    public l5c V1;

    public cb9(Context context, boolean z, wjb wjbVar, x0 x0Var) {
        super(context, null, false, false, wjbVar);
        wjb wjbVar2;
        K();
        this.u1 = 0.2f;
        final byte b = 1;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        int i = bkb.Ei;
        paint.setColor(bkb.v0(i, wjbVar));
        LinearLayout linearLayout = new LinearLayout(context);
        this.S1 = linearLayout;
        final byte b2 = 0;
        linearLayout.setPadding(gl.L(6.0f) + this.u0, 0, gl.L(6.0f) + this.u0, 0);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        ry8 ry8Var = new ry8(getContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        ry8Var.setScaleType(scaleType);
        ry8Var.setImageResource(R.drawable.large_ads_info);
        ry8Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        ShapeDrawable K = bkb.K(gl.L(80.0f), bkb.v0(i, wjbVar));
        vkb M = zkb.M(i);
        ry8Var.setBackground(K);
        zkb.j(ry8Var, K, M, null, wjbVar);
        frameLayout.addView(ry8Var, nme.d(80, 80.0f, 1, 0.0f, 20.0f, 0.0f, 0.0f));
        if (x0Var != null) {
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
            imageView.setContentDescription(k96.M0(2131754838, null));
            imageView.setScaleType(scaleType);
            zkb.s(imageView, bkb.q5, null, PorterDuff.Mode.SRC_ATOP);
            int i2 = bkb.h6;
            ff0 f0 = bkb.f0(bkb.w0(null, i2, false), 1, -1);
            vkb M2 = zkb.M(i2);
            imageView.setBackground(f0);
            zkb.j(imageView, f0, null, M2, null);
            wjbVar2 = wjbVar;
            imageView.setOnClickListener(new ee((Object) this, (Object) x0Var, (Object) wjbVar, (Object) imageView, (byte) 16));
            frameLayout.addView(imageView, nme.d(24, 24.0f, 53, 12.0f, 14.0f, 14.0f, 12.0f));
        } else {
            wjbVar2 = wjbVar;
        }
        linearLayout.addView(frameLayout, nme.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 100));
        TextView textView = new TextView(context);
        textView.setText(k96.M0(2131754943, null));
        textView.setTypeface(gl.o());
        int i3 = bkb.F6;
        zkb.X(textView, i3, wjbVar2);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        TextView m = ug8.m(linearLayout, textView, nme.t(-2, -2, 1, 22, 14, 22, 0), context);
        m.setText(k96.M0(2131745851, null));
        zkb.X(m, i3, wjbVar2);
        m.setTextSize(1, 14.0f);
        m.setGravity(1);
        linearLayout.addView(m, nme.t(-2, -2, 1, 22, 8, 22, 0));
        linearLayout.addView(new ar8(this, context, R.drawable.menu_privacy, k96.M0(z ? 2131745847 : 2131745848, null), k96.M0(z ? 2131745849 : 2131745850, null)), nme.q(-1, -2, 0.0f, 0, 0, 20, 0, 0));
        linearLayout.addView(new ar8(this, context, R.drawable.menu_feature_split, k96.M0(z ? 2131745843 : 2131745844, null), k96.M0(z ? 2131745845 : 2131745846, null)), nme.q(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        String a0 = k96.a0(null, null, z ? 2131745841 : 2131745842, Integer.valueOf(na7.q1(y6c.t0).k4.T1.f()));
        int i4 = bkb.Wc;
        linearLayout.addView(new ar8(this, context, R.drawable.menu_feature_noads, k96.M0(2131745840, null), gl.N2(a0, i4, 0, new Runnable(this) { // from class: bb9
            public final /* synthetic */ cb9 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b3 = b2;
                cb9 cb9Var = this.b;
                switch (b3) {
                    case 0:
                        d S = LaunchActivity.S();
                        if (S != null) {
                            S.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.o0(3)));
                            cb9Var.dismiss();
                            break;
                        }
                        break;
                    default:
                        cb9Var.dismiss();
                        d01.t(cb9Var.getContext(), k96.M0(2131746425, null));
                        break;
                }
            }
        }, null)), nme.q(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        View view = new View(getContext());
        zkb.h(bkb.c7, wjbVar2, view);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(gl.L(24.0f), gl.L(20.0f), gl.L(24.0f), gl.L(20.0f));
        linearLayout.addView(view, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setText(k96.M0(z ? 2131745835 : 2131745836, null));
        textView2.setTypeface(gl.o());
        zkb.X(textView2, i3, wjbVar2);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        linearLayout.addView(textView2, nme.t(-2, -2, 1, 22, 0, 22, 0));
        SpannableStringBuilder S2 = gl.S2(k96.M0(z ? 2131745838 : 2131745839, null));
        SpannableStringBuilder N2 = gl.N2(k96.M0(2131745837, null), i4, 0, new Runnable(this) { // from class: bb9
            public final /* synthetic */ cb9 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b3 = b;
                cb9 cb9Var = this.b;
                switch (b3) {
                    case 0:
                        d S = LaunchActivity.S();
                        if (S != null) {
                            S.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.o0(3)));
                            cb9Var.dismiss();
                            break;
                        }
                        break;
                    default:
                        cb9Var.dismiss();
                        d01.t(cb9Var.getContext(), k96.M0(2131746425, null));
                        break;
                }
            }
        }, null);
        SpannableString spannableString = new SpannableString(">");
        cm2 cm2Var = new cm2(R.drawable.attach_arrow_right, 0);
        this.T1 = cm2Var;
        cm2Var.y = bkb.w0(null, i4, false);
        cm2Var.I = 0.7f;
        cm2Var.J = 0.7f;
        cm2Var.F = gl.L(12.0f);
        cm2Var.s = 1.0f;
        spannableString.setSpan(cm2Var, 0, spannableString.length(), 33);
        SpannableStringBuilder G2 = gl.G2(gl.G2(S2, N2, "%1$s"), spannableString, ">");
        l46 l46Var = new l46(context, null);
        this.U1 = l46Var;
        l46Var.setText(G2);
        zkb.X(l46Var, i3, wjbVar2);
        l46Var.setTextSize(1, 14.0f);
        l46Var.setGravity(1);
        l46Var.setLineSpacing(gl.L(2.0f), 1.0f);
        linearLayout.addView(l46Var, nme.t(-2, -2, 1, 26, 8, 26, 0));
        TextView textView3 = new TextView(context);
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        zkb.X(textView3, bkb.Ii, wjbVar2);
        textView3.setTypeface(gl.o());
        textView3.setTextSize(1, 14.0f);
        textView3.setText(k96.M0(2131745852, null));
        ff0 e = sjb.e(bkb.v0(i, wjbVar2), 6.0f);
        vkb M3 = zkb.M(i);
        vkb e2 = zkb.e(i);
        textView3.setBackground(e);
        zkb.j(textView3, e, M3, e2, wjbVar2);
        textView3.setOnClickListener(new ik8(this, (byte) 8));
        linearLayout.addView(textView3, nme.t(-1, 48, 0, 14, 22, 14, 14));
        this.V1.O(false);
    }

    public static cb9 Y0(Context context, d dVar, boolean z, wjb wjbVar, x0 x0Var) {
        cb9 cb9Var = new cb9(context, z, wjbVar, x0Var);
        if (dVar == null) {
            cb9Var.show();
            return cb9Var;
        }
        if (dVar.getParentActivity() != null) {
            dVar.showDialog(cb9Var);
        }
        return cb9Var;
    }

    public static void Z0(mu1 mu1Var, wjb wjbVar, Context context) {
        Y0(context, mu1Var, false, wjbVar, null);
    }

    @Override // fy0
    public final n39 G0(o39 o39Var) {
        l5c l5cVar = new l5c(o39Var, getContext(), this.a, 0, true, new tf8(this, (byte) 10), this.J0);
        this.V1 = l5cVar;
        return l5cVar;
    }

    @Override // fy0
    public final CharSequence J0() {
        return k96.M0(2131754943, null);
    }

    @Override // fx0
    public final void p0() {
        super.p0();
        try {
            cm2 cm2Var = this.T1;
            if (cm2Var != null) {
                cm2Var.y = bkb.w0(null, bkb.Wc, false);
                l46 l46Var = this.U1;
                if (l46Var != null) {
                    l46Var.invalidate();
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
