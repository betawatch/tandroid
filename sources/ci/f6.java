package ci;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import b8.pf;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.s51;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class f6 extends FrameLayout {
    public lc A0;
    public final int[] B0;
    public final int[] C0;
    public final int[] D0;
    public final s70[] E;
    public final LinearLayout.LayoutParams[] F;
    public final ai.k1[] G;
    public final TextPaint H;
    public final s51 I;
    public final ai.c0[] J;
    public final ai.c0 K;
    public final FrameLayout L;
    public final org.telegram.ui.Components.k9 M;
    public final h5 N;
    public boolean O;
    public final TextView P;
    public final ImageView Q;
    public final ImageView R;
    public final ImageView S;
    public boolean T;
    public Boolean U;
    public final View.OnClickListener V;
    public final View.OnClickListener W;
    public final org.telegram.ui.ActionBar.e6 a;
    public final View.OnClickListener a0;
    public final FrameLayout b;
    public k5 b0;
    public final x5 c;
    public final TL_stars.starGiftAttributeBackdrop[] c0;
    public final org.telegram.ui.Components.k9[] d;
    public a d0;
    public final TL_stars.starGiftAttributeModel[] e;
    public a e0;
    public final LinearLayout[] f;
    public a f0;
    public boolean g0;
    public final FrameLayout.LayoutParams[] h;
    public boolean h0;
    public float i0;
    public float j0;
    public float k0;
    public ValueAnimator l0;
    public final d1 m0;
    public final ai.r2 n;
    public final Paint[] n0;
    public final RadialGradient[] o0;
    public final Matrix[] p0;
    public RadialGradient q0;
    public final s70[] r;
    public final Matrix r0;
    public final s70 s;
    public final Paint s0;
    public final TL_stars.starGiftAttributePattern[] t0;
    public final org.telegram.ui.Components.e5[] u0;
    public int v0;
    public final TextView w;
    public float w0;
    public int x;
    public float x0;
    public final FrameLayout y;
    public ValueAnimator y0;
    public final RectF z0;

    public f6(Context context, org.telegram.ui.ActionBar.e6 e6Var, Runnable runnable, View.OnClickListener onClickListener, r1 r1Var, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, View.OnClickListener onClickListener4, View.OnClickListener onClickListener5, View.OnClickListener onClickListener6) {
        super(context);
        float f10;
        float f11;
        float f12;
        int i3;
        this.d = new org.telegram.ui.Components.k9[5];
        this.e = new TL_stars.starGiftAttributeModel[3];
        this.f = new LinearLayout[5];
        this.h = new FrameLayout.LayoutParams[5];
        this.r = new s70[5];
        this.E = new s70[5];
        this.F = new LinearLayout.LayoutParams[5];
        this.G = new ai.k1[5];
        this.b0 = new k5(0, 0);
        this.c0 = new TL_stars.starGiftAttributeBackdrop[3];
        this.m0 = new d1(this, 8);
        this.n0 = new Paint[3];
        this.o0 = new RadialGradient[3];
        this.p0 = new Matrix[3];
        this.r0 = new Matrix();
        int i10 = 1;
        this.s0 = new Paint(1);
        this.t0 = new TL_stars.starGiftAttributePattern[2];
        this.u0 = new org.telegram.ui.Components.e5[2];
        int i11 = 0;
        while (true) {
            Paint[] paintArr = this.n0;
            if (i11 >= paintArr.length) {
                break;
            }
            paintArr[i11] = new Paint(1);
            i11++;
        }
        int i12 = 0;
        while (true) {
            org.telegram.ui.Components.e5[] e5VarArr = this.u0;
            f10 = 28.0f;
            if (i12 >= e5VarArr.length) {
                break;
            }
            e5VarArr[i12] = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(28.0f), this);
            i12++;
        }
        this.x0 = 1.0f;
        this.z0 = new RectF();
        this.B0 = new int[12];
        this.C0 = new int[12];
        this.D0 = new int[12];
        this.a = e6Var;
        this.V = onClickListener4;
        this.W = onClickListener5;
        this.a0 = onClickListener6;
        setWillNotDraw(false);
        this.b = new FrameLayout(context);
        int i13 = 0;
        while (true) {
            org.telegram.ui.Components.k9[] k9VarArr = this.d;
            f11 = f10;
            float f13 = 0.0f;
            if (i13 >= k9VarArr.length) {
                break;
            }
            k9VarArr[i13] = new c6(context, 0);
            this.d[i13].setLayerNum(6660);
            if (i13 > 0) {
                this.d[i13].getImageReceiver().t1 = 1;
            }
            this.b.addView(this.d[i13], mf.e(-1, -1, hs.E1));
            org.telegram.ui.Components.k9 k9Var = this.d[i13];
            if (i13 == 0) {
                f13 = 1.0f;
            }
            k9Var.setAlpha(f13);
            i13++;
            f10 = f11;
        }
        s70 s70Var = new s70(context, null);
        this.s = s70Var;
        s70Var.setTextSize(1, 12.0f);
        s70Var.setGravity(17);
        org.telegram.ui.ActionBar.r6.V(s70Var, org.telegram.ui.ActionBar.k6.G6, e6Var);
        org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.Uc, e6Var);
        s70Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        TextView textView = new TextView(context);
        this.w = textView;
        textView.setOnClickListener(new a6(this, 0));
        pf.b(textView, 0.05f, 1.25f);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        textView.setLinkTextColor(-1);
        textView.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), 0);
        TextView textView2 = new TextView(context);
        this.P = textView2;
        textView2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        textView2.setTextSize(1, 13.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setAlpha(0.0f);
        textView2.setScaleX(0.4f);
        textView2.setScaleY(0.4f);
        textView2.setVisibility(8);
        textView2.setGravity(17);
        pf.a(textView2);
        s51 s51Var = new s51(3, context, this);
        this.I = s51Var;
        s51Var.setOrientation(0);
        this.J = new ai.c0[3];
        int i14 = 0;
        while (true) {
            ai.c0[] c0VarArr = this.J;
            if (i14 >= c0VarArr.length) {
                break;
            }
            c0VarArr[i14] = new ai.c0(context, 2);
            if (i14 == 0) {
                i3 = i10;
                this.J[i14].e(R.drawable.filled_gift_send, bd.M0(2131750441, null), false);
                this.J[i14].setOnClickListener(onClickListener2);
            } else if (i14 == i10) {
                i3 = i10;
                this.J[i14].e(R.drawable.filled_crown_on, bd.M0(2131750433, null), false);
                this.J[i14].setOnClickListener(onClickListener3);
            } else if (i14 != 2) {
                i3 = i10;
            } else {
                i3 = i10;
                this.J[i14].e(R.drawable.filled_share, bd.M0(2131750446, null), false);
                this.J[i14].setOnClickListener(onClickListener4);
            }
            this.J[i14].setBackground(org.telegram.ui.ActionBar.k6.b0(0, 285212671, 16, 16));
            pf.b(this.J[i14], 0.075f, 1.5f);
            s51 s51Var2 = this.I;
            ai.c0[] c0VarArr2 = this.J;
            s51Var2.addView(c0VarArr2[i14], mf.q(0, 56, 1.0f, hs.E1, 0, 0, i14 != c0VarArr2.length + (-1) ? 11 : 0, 0));
            i14++;
            i10 = i3;
        }
        ai.c0 c0Var = new ai.c0(context, 2);
        this.K = c0Var;
        c0Var.e(R.drawable.filled_card_color, bd.M0(2131743119, null), false);
        c0Var.setBackground(org.telegram.ui.ActionBar.k6.b0(0, 285212671, 16, 16));
        pf.b(c0Var, 0.075f, 1.5f);
        c0Var.setVisibility(8);
        this.I.addView(c0Var, i10, mf.q(0, 56, 1.0f, hs.E1, 0, 0, 11, 0));
        this.y = new FrameLayout(context);
        int i15 = 0;
        while (true) {
            LinearLayout[] linearLayoutArr = this.f;
            if (i15 >= linearLayoutArr.length) {
                break;
            }
            linearLayoutArr[i15] = new LinearLayout(context);
            this.f[i15].setOrientation(1);
            if (i15 == 2) {
                FrameLayout frameLayout = new FrameLayout(context);
                this.L = frameLayout;
                this.f[i15].addView(frameLayout, mf.r(-1, hs.a2, hs.E1));
                org.telegram.ui.Components.k9 k9Var2 = new org.telegram.ui.Components.k9(context);
                this.M = k9Var2;
                k9Var2.setRoundRadius(org.telegram.messenger.g0.L(41.0f));
                frameLayout.addView(k9Var2, mf.d(82, 82.0f, 49, 0.0f, 2.0f, 0.0f, 0.0f));
                this.r[i15] = new s70(context, null);
                this.r[i15].setTextColor(-1);
                this.r[i15].setTextSize(1, 20.0f);
                this.r[i15].setTypeface(org.telegram.messenger.g0.o());
                this.r[i15].setSingleLine();
                s70 s70Var2 = this.r[i15];
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                s70Var2.setEllipsize(truncateAt);
                this.r[i15].setGravity(17);
                frameLayout.addView(this.r[i15], mf.d(-1, -2.0f, 49, 16.0f, 95.33f, 16.0f, 0.0f));
                this.E[i15] = new s70(context, null);
                this.E[i15].setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.j5, e6Var));
                this.E[i15].setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.r6.H(this.E[i15], org.telegram.ui.ActionBar.k6.Uc, e6Var);
                this.E[i15].setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                this.E[i15].setDisablePaddingsOffsetY(true);
                this.E[i15].setSingleLine();
                this.E[i15].setGravity(17);
                this.E[i15].setEllipsize(truncateAt);
                frameLayout.addView(this.E[i15], mf.d(-1, -2.0f, 49, 16.0f, 122.0f, 16.0f, 0.0f));
            } else if (i15 == 4) {
                h5 h5Var = new h5(context, e6Var);
                this.N = h5Var;
                this.f[i15].addView(h5Var, mf.o(-1, -2));
                View view = this.f[i15];
                FrameLayout.LayoutParams[] layoutParamsArr = this.h;
                ViewGroup.LayoutParams d = mf.d(-1, -2.0f, hs.E1, 0.0f, 0.0f, 0.0f, 0.0f);
                layoutParamsArr[i15] = d;
                addView(view, d);
                i15++;
            } else {
                this.r[i15] = new s70(context, null);
                if (i15 == 3) {
                    this.r[i15].setTextColor(-1);
                } else {
                    this.r[i15].setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.j5, e6Var));
                }
                this.r[i15].setTextSize(1, 20.0f);
                this.r[i15].setTypeface(org.telegram.messenger.g0.o());
                this.r[i15].setGravity(17);
                this.f[i15].addView(this.r[i15], mf.t(-1, -2, 17, 24, i15 == 3 ? 10 : 0, 24, 0));
                if (i15 == 0) {
                    this.f[i15].addView(this.s, mf.t(-2, -2, 17, 0, 4, 0, 4));
                    this.f[i15].addView(this.w, mf.n(19.33f, -2, 17, 0, 6, 0, 2));
                }
                if (i15 == 0) {
                    this.E[i15] = new s70(context, null);
                    if (i15 == 3) {
                        this.E[i15].setTextColor(org.telegram.ui.ActionBar.k6.r1(0.75f, -1));
                    } else {
                        this.E[i15].setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.j5, e6Var));
                    }
                    this.E[i15].setTextSize(1, 14.0f);
                    this.E[i15].setGravity(17);
                    org.telegram.ui.ActionBar.r6.H(this.E[i15], org.telegram.ui.ActionBar.k6.Uc, e6Var);
                    this.E[i15].setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    this.E[i15].setDisablePaddingsOffsetY(true);
                    this.y.addView(this.E[i15], mf.e(-2, -2, 17));
                    this.y.addView(this.P, mf.a(-2.0f, 20.33f, 17));
                    LinearLayout linearLayout = this.f[i15];
                    FrameLayout frameLayout2 = this.y;
                    LinearLayout.LayoutParams[] layoutParamsArr2 = this.F;
                    LinearLayout.LayoutParams t10 = mf.t(-1, -2, 17, 24, 0, 24, i15 == 3 ? 6 : 0);
                    layoutParamsArr2[i15] = t10;
                    linearLayout.addView(frameLayout2, t10);
                } else {
                    this.E[i15] = new s70(context, null);
                    if (i15 == 3) {
                        this.E[i15].setTextColor(org.telegram.ui.ActionBar.k6.r1(0.75f, -1));
                    } else {
                        this.E[i15].setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.j5, e6Var));
                    }
                    this.E[i15].setTextSize(1, 14.0f);
                    this.E[i15].setGravity(17);
                    org.telegram.ui.ActionBar.r6.H(this.E[i15], org.telegram.ui.ActionBar.k6.Uc, e6Var);
                    this.E[i15].setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    this.E[i15].setDisablePaddingsOffsetY(true);
                    LinearLayout linearLayout2 = this.f[i15];
                    s70 s70Var3 = this.E[i15];
                    LinearLayout.LayoutParams[] layoutParamsArr3 = this.F;
                    LinearLayout.LayoutParams t11 = mf.t(-1, -2, 17, 24, 0, 24, i15 == 3 ? 6 : 0);
                    layoutParamsArr3[i15] = t11;
                    linearLayout2.addView(s70Var3, t11);
                }
                LinearLayout.LayoutParams layoutParams = this.F[i15];
                if (i15 == 3) {
                    f12 = 6.0f;
                } else {
                    f12 = (i15 == 1 ? 7.33f : this.c0[0] == null ? 9.0f : 5.66f) - 4.0f;
                }
                layoutParams.topMargin = org.telegram.messenger.g0.L(f12);
                this.G[i15] = new ai.k1(context);
                this.G[i15].setVisibility(8);
                this.G[i15].setPadding(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(2.0f));
                if (i15 == 0) {
                    this.H = this.G[i15].getTextPaint();
                }
                this.f[i15].addView(this.G[i15], mf.t(-1, -2, 17, 24, 8, 24, 0));
            }
            if (i15 == 0) {
                this.f[i15].addView(this.I, mf.t(-1, -2, 7, 0, 15, 0, 0));
            }
            View view2 = this.f[i15];
            FrameLayout.LayoutParams[] layoutParamsArr4 = this.h;
            ViewGroup.LayoutParams d10 = mf.d(-1, -2.0f, hs.E1, 16.0f, i15 == 2 ? 32.0f : 170.0f, 16.0f, 0.0f);
            layoutParamsArr4[i15] = d10;
            addView(view2, d10);
            i15++;
        }
        addView(this.b, mf.d(hs.q2, 160.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        x5 x5Var = new x5(context);
        this.c = x5Var;
        addView(x5Var, mf.d(-1, 160.0f, 55, 0.0f, 8.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.Q = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(f11), 620756991));
        imageView.setImageResource(R.drawable.msg_close);
        pf.a(imageView);
        addView(imageView, mf.d(28, 28.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        imageView.setOnClickListener(new ai.j0(1, runnable));
        imageView.setVisibility(8);
        ImageView imageView2 = new ImageView(context);
        this.R = imageView2;
        imageView2.setImageResource(R.drawable.filled_forge);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.h0(553648127, 1, -1));
        pf.a(imageView2);
        if (r1Var != null) {
            addView(imageView2, mf.d(42, 42.0f, 53, 0.0f, 5.0f, 47.0f, 0.0f));
            imageView2.setOnClickListener(r1Var);
        }
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.S = imageView3;
        imageView3.setContentDescription(bd.M0(2131754878, null));
        imageView3.setImageResource(R.drawable.media_more);
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(org.telegram.ui.ActionBar.k6.h0(553648127, 1, -1));
        pf.a(imageView3);
        addView(imageView3, mf.d(42, 42.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        imageView3.setOnClickListener(onClickListener);
        imageView3.setVisibility(8);
        ai.r2 r2Var = new ai.r2(context);
        this.n = r2Var;
        r2Var.b(bd.M0(2131749761, null), true);
        ai.t2 t2Var = r2Var.a;
        if (t2Var.w == null) {
            lc lcVar = new lc(2, 12);
            t2Var.w = lcVar;
            lcVar.h = 5.0f;
        }
        Path path = t2Var.f;
        float f14 = t2Var.s;
        t2Var.x = true;
        ai.t2.d(path, f14, true);
        r2Var.setScaleX(1.2f);
        r2Var.setScaleY(1.2f);
        addView(r2Var, mf.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        r2Var.setVisibility(8);
    }

    public final void a() {
        ValueAnimator valueAnimator = this.y0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.y0 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.y0 = ofFloat;
        ofFloat.addUpdateListener(new b6(this, 1));
        this.y0.addListener(new d6(this, 4));
        this.y0.setDuration(320L);
        this.y0.setInterpolator(xq.g);
        this.y0.start();
    }

    public final int b(Canvas canvas, float f10, float f11, float f12, float f13) {
        int i3 = this.v0;
        RadialGradient[] radialGradientArr = this.o0;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.c0;
        Matrix[] matrixArr = this.p0;
        Paint[] paintArr = this.n0;
        int i10 = 0;
        if (i3 != 0) {
            if (this.w0 < 1.0f && stargiftattributebackdropArr[1] != null) {
                paintArr[1].setAlpha((int) (this.b0.a(1) * 255.0f));
                matrixArr[1].reset();
                matrixArr[1].postTranslate(f10, f11);
                radialGradientArr[1].setLocalMatrix(matrixArr[1]);
                canvas.drawRect(0.0f, 0.0f, f12, f13, paintArr[1]);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[1];
                i10 = i0.a.k(i0.a.o(i0.a.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216)), paintArr[1].getAlpha()), 0);
            }
            if (this.w0 <= 0.0f || stargiftattributebackdropArr[2] == null) {
                return i10;
            }
            paintArr[2].setAlpha((int) (this.b0.a(1) * 255.0f * this.w0));
            matrixArr[2].reset();
            matrixArr[2].postTranslate(f10, f11);
            radialGradientArr[2].setLocalMatrix(matrixArr[2]);
            canvas.drawRect(0.0f, 0.0f, f12, f13, paintArr[2]);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[2];
            return i0.a.k(i0.a.o(i0.a.f(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216)), paintArr[2].getAlpha()), i10);
        }
        if (this.w0 > 0.0f && stargiftattributebackdropArr[2] != null) {
            paintArr[2].setAlpha((int) (this.b0.a(1) * 255.0f));
            matrixArr[2].reset();
            matrixArr[2].postTranslate(f10, f11);
            radialGradientArr[2].setLocalMatrix(matrixArr[2]);
            canvas.drawRect(0.0f, 0.0f, f12, f13, paintArr[2]);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[2];
            i10 = i0.a.k(i0.a.o(i0.a.f(0.25f, stargiftattributebackdrop3.edge_color | (-16777216), stargiftattributebackdrop3.pattern_color | (-16777216)), paintArr[2].getAlpha()), 0);
        }
        if (this.w0 >= 1.0f || stargiftattributebackdropArr[1] == null) {
            return i10;
        }
        paintArr[1].setAlpha((int) ((1.0f - this.w0) * this.b0.a(1) * 255.0f));
        matrixArr[1].reset();
        matrixArr[1].postTranslate(f10, f11);
        radialGradientArr[1].setLocalMatrix(matrixArr[1]);
        canvas.drawRect(0.0f, 0.0f, f12, f13, paintArr[1]);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[1];
        return i0.a.k(i0.a.o(i0.a.f(0.25f, stargiftattributebackdrop4.edge_color | (-16777216), stargiftattributebackdrop4.pattern_color | (-16777216)), paintArr[1].getAlpha()), i10);
    }

    public final void c(Canvas canvas, float f10, float f11, float f12, float f13) {
        canvas.save();
        canvas.translate(f10, f11);
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.c0;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[1];
        int i3 = stargiftattributebackdrop == null ? 0 : stargiftattributebackdrop.pattern_color | (-16777216);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[2];
        int f14 = i0.a.f(this.w0, i3, stargiftattributebackdrop2 != null ? stargiftattributebackdrop2.pattern_color | (-16777216) : 0);
        org.telegram.ui.Components.e5[] e5VarArr = this.u0;
        e5VarArr[1].k(Integer.valueOf(f14));
        b1.a(canvas, 0, e5VarArr[1], f12, f13, this.b0.a(1), this.x0);
        canvas.restore();
    }

    public void d(k5 k5Var) {
        View[] viewArr;
        s70[] s70VarArr;
        float a10;
        int i3;
        boolean z10;
        this.b0 = k5Var;
        int i10 = 0;
        while (true) {
            viewArr = this.f;
            if (i10 >= viewArr.length) {
                break;
            }
            float a11 = k5Var.a(i10);
            viewArr[i10].setAlpha(a11);
            viewArr[i10].setVisibility(a11 > 0.0f ? 0 : 4);
            i10++;
        }
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.c0;
        float max = Math.max(stargiftattributebackdropArr[0] != null ? k5Var.a(2) : 0.0f, stargiftattributebackdropArr[1] != null ? k5Var.a(1) : 0.0f);
        ImageView imageView = this.Q;
        imageView.setAlpha(max);
        imageView.setVisibility(((stargiftattributebackdropArr[0] == null || k5Var.c != 2) && (stargiftattributebackdropArr[1] == null || k5Var.c != 1)) ? 8 : 0);
        boolean z11 = stargiftattributebackdropArr[0] != null || this.T;
        float a12 = k5Var.a(0);
        int i11 = k5Var.c;
        float V1 = org.telegram.messenger.g0.V1(false, z11, a12);
        ImageView imageView2 = this.S;
        imageView2.setAlpha(V1);
        imageView2.setVisibility((z11 && i11 == 0) ? 0 : 8);
        boolean z12 = stargiftattributebackdropArr[0] != null;
        Boolean bool = this.U;
        int i12 = -1;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        if (bool == null || bool.booleanValue() != z12) {
            this.U = Boolean.valueOf(z12);
            if (z12) {
                imageView2.clearColorFilter();
                imageView2.setBackground(org.telegram.ui.ActionBar.k6.h0(553648127, 1, -1));
            } else {
                org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.J5, e6Var, PorterDuff.Mode.SRC_IN);
                int i13 = org.telegram.ui.ActionBar.k6.i6;
                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i13, e6Var), 1, -1);
                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i13);
                imageView2.setBackground(h02);
                org.telegram.ui.ActionBar.r6.k(imageView2, h02, null, N, e6Var);
            }
        }
        if (!this.h0) {
            float V12 = org.telegram.messenger.g0.V1(false, this.O, k5Var.a(0));
            TextView textView = this.P;
            textView.setAlpha(V12);
            textView.setScaleX(org.telegram.messenger.g0.T1(0.4f, this.O ? 1.0f : 0.4f, k5Var.a(0)));
            textView.setScaleY(org.telegram.messenger.g0.T1(0.4f, this.O ? 1.0f : 0.4f, k5Var.a(0)));
            textView.setVisibility((this.O && i11 == 0) ? 0 : 4);
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.j5, e6Var);
        int i14 = 0;
        while (true) {
            s70VarArr = this.E;
            if (i14 >= 2) {
                break;
            }
            this.r[i14].setTextColor(stargiftattributebackdropArr[Math.min(1, i14)] == null ? w02 : i12);
            s70 s70Var = s70VarArr[i14];
            if (i14 == 0 || i14 == 2) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[i14];
                i3 = stargiftattributebackdrop == null ? w02 : stargiftattributebackdrop.text_color | (-16777216);
            } else {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[1];
                int i15 = stargiftattributebackdrop2 == null ? w02 : stargiftattributebackdrop2.text_color | (-16777216);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[2];
                i3 = i0.a.f(this.w0, i15, stargiftattributebackdrop3 == null ? w02 : stargiftattributebackdrop3.text_color | (-16777216));
            }
            s70Var.setTextColor(i3);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[i14];
            FrameLayout.LayoutParams[] layoutParamsArr = this.h;
            if (stargiftattributebackdrop4 != null) {
                z10 = (org.telegram.messenger.g0.L(184.0f) == layoutParamsArr[i14].topMargin && viewArr[i14].getPaddingBottom() == org.telegram.messenger.g0.L(18.0f)) ? false : true;
                if (z10) {
                    viewArr[i14].setPadding(0, 0, 0, org.telegram.messenger.g0.L(18.0f));
                    layoutParamsArr[i14].topMargin = org.telegram.messenger.g0.L(184.0f);
                }
            } else {
                z10 = (org.telegram.messenger.g0.L(170.0f) == layoutParamsArr[i14].topMargin && viewArr[i14].getPaddingBottom() == org.telegram.messenger.g0.L(3.0f)) ? false : true;
                if (z10) {
                    viewArr[i14].setPadding(0, 0, 0, org.telegram.messenger.g0.L(3.0f));
                    layoutParamsArr[i14].topMargin = org.telegram.messenger.g0.L(170.0f);
                }
            }
            LinearLayout.LayoutParams[] layoutParamsArr2 = this.F;
            layoutParamsArr2[i14].topMargin = org.telegram.messenger.g0.L((i14 == 1 ? 7.33f : stargiftattributebackdropArr[0] == null ? 9.0f : 5.66f) - 4.0f);
            if (z10) {
                viewArr[i14].setLayoutParams(layoutParamsArr[i14]);
                if (i14 == 0) {
                    this.y.setLayoutParams(layoutParamsArr2[i14]);
                } else {
                    s70VarArr[i14].setLayoutParams(layoutParamsArr2[i14]);
                }
            }
            i14++;
            i12 = -1;
        }
        int L = org.telegram.messenger.g0.L(24.0f);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop5 = stargiftattributebackdropArr[0];
        this.w.setBackground(org.telegram.ui.ActionBar.k6.d0(L, stargiftattributebackdrop5 == null ? 553648127 : i0.a.f(0.25f, stargiftattributebackdrop5.edge_color | (-16777216), stargiftattributebackdrop5.pattern_color | (-16777216))));
        s70 s70Var2 = s70VarArr[2];
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop6 = stargiftattributebackdropArr[0];
        if (stargiftattributebackdrop6 != null) {
            w02 = stargiftattributebackdrop6.text_color | (-16777216);
        }
        s70Var2.setTextColor(w02);
        org.telegram.ui.Components.k9[] k9VarArr = this.d;
        org.telegram.ui.Components.k9 k9Var = k9VarArr[0];
        k5 k5Var2 = this.b0;
        k9Var.setAlpha(Math.max((k5Var2.b(0) && k5Var2.b(2)) ? 1.0f : Math.max(k5Var2.a(0), k5Var2.a(2)), this.b0.a(3)));
        k9VarArr[1].setAlpha((1.0f - this.w0) * k5Var.a(1));
        k9VarArr[2].setAlpha(k5Var.a(1) * this.w0);
        float T1 = org.telegram.messenger.g0.T1(1.0f, this.k0, k5Var.a(2));
        FrameLayout frameLayout = this.b;
        frameLayout.setScaleX(T1);
        frameLayout.setScaleY(org.telegram.messenger.g0.T1(1.0f, this.k0, k5Var.a(2)));
        frameLayout.setTranslationX(k5Var.a(2) * this.i0);
        frameLayout.setTranslationY((k5Var.a(2) * this.j0) + (k5Var.a(1) * org.telegram.messenger.g0.L(16.0f)));
        View view = viewArr[2];
        int i16 = k5Var.b;
        if (i16 == 2 && i11 == 2) {
            a10 = 0.0f;
        } else {
            if (i16 != 2) {
                i11 = i16;
            }
            a10 = (1.0f - k5Var.a(2)) * (-(viewArr[i11].getMeasuredHeight() - viewArr[2].getMeasuredHeight()));
        }
        view.setTranslationY(a10);
        int i17 = (this.g0 && this.b0.b(0)) ? 0 : 8;
        ai.r2 r2Var = this.n;
        r2Var.setVisibility(i17);
        r2Var.setAlpha(this.b0.a(0));
        int i18 = k5Var.a(4) <= 0.0f ? 8 : 0;
        h5 h5Var = this.N;
        h5Var.setVisibility(i18);
        h5Var.setAlpha(k5Var.a(4));
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr;
        float f10;
        float f11;
        float f12;
        int[] iArr;
        int[] iArr2;
        float f13;
        int i3;
        int[] iArr3;
        f6 f6Var;
        Canvas canvas2;
        x5 x5Var;
        float realHeight = getRealHeight();
        canvas.save();
        float f14 = 0.0f;
        canvas.clipRect(0.0f, 0.0f, getWidth(), realHeight);
        float f15 = 2.0f;
        float width = getWidth() / 2.0f;
        float L = org.telegram.messenger.g0.L(80.0f) + org.telegram.messenger.g0.W1(this.b0.a(1), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(24.0f));
        k5 k5Var = this.b0;
        float max = ((k5Var.b(0) && k5Var.b(2)) || (k5Var.b(2) && k5Var.b(3)) || (k5Var.b(3) && k5Var.b(0))) ? 1.0f : Math.max(k5Var.a(0), Math.max(k5Var.a(2), k5Var.a(3)));
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr2 = this.c0;
        if (max <= 0.0f || stargiftattributebackdropArr2[0] == null) {
            stargiftattributebackdropArr = stargiftattributebackdropArr2;
        } else {
            if (this.q0 == null || this.b0.a(2) < 1.0f) {
                Paint[] paintArr = this.n0;
                paintArr[0].setAlpha((int) (max * 255.0f));
                Matrix[] matrixArr = this.p0;
                matrixArr[0].reset();
                matrixArr[0].postTranslate(width, L);
                this.o0[0].setLocalMatrix(matrixArr[0]);
                stargiftattributebackdropArr = stargiftattributebackdropArr2;
                canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, paintArr[0]);
            } else {
                stargiftattributebackdropArr = stargiftattributebackdropArr2;
            }
            if (this.q0 != null && this.b0.a(2) > 0.0f) {
                int a10 = (int) (this.b0.a(2) * 255.0f);
                Paint paint = this.s0;
                paint.setAlpha(a10);
                Matrix matrix = this.r0;
                matrix.reset();
                matrix.postTranslate(getWidth() / 2.0f, 0.4f * realHeight);
                this.q0.setLocalMatrix(matrix);
                canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, paint);
            }
        }
        if (this.b0.a(1) > 0.0f) {
            f10 = width;
            f11 = L;
            k(b(canvas, f10, f11, getWidth(), realHeight));
        } else {
            f10 = width;
            f11 = L;
        }
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[0];
        int[] iArr4 = this.D0;
        int[] iArr5 = this.C0;
        int[] iArr6 = this.B0;
        if (stargiftattributebackdrop != null) {
            int i10 = 0;
            while (i10 < iArr6.length) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[0];
                iArr5[i10] = stargiftattributebackdrop2.text_color | (-16777216);
                iArr6[i10] = i0.a.f(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216));
                iArr4[i10] = stargiftattributebackdropArr[0].pattern_color | (-16777216);
                i10++;
                f14 = f14;
                f15 = f15;
            }
        }
        float f16 = f14;
        float f17 = f15;
        x5 x5Var2 = this.c;
        if (x5Var2.s == null && x5Var2.w == null && x5Var2.x == null) {
            f6Var = this;
            f13 = f10;
            f12 = f11;
            iArr = iArr5;
            iArr2 = iArr6;
            i3 = 1;
            x5Var = x5Var2;
            iArr3 = iArr4;
            canvas2 = canvas;
        } else {
            float width2 = getWidth();
            float f18 = f10;
            r5 r5Var = x5Var2.s;
            float f19 = f11;
            float f20 = x5Var2.y;
            int[] iArr7 = this.C0;
            int[] iArr8 = this.B0;
            int[] iArr9 = this.D0;
            f12 = f19;
            iArr = iArr5;
            iArr2 = iArr6;
            f13 = f18;
            i3 = 1;
            iArr3 = iArr4;
            f6Var = this;
            canvas2 = canvas;
            x5Var2.a(canvas2, r5Var, f20, width2, realHeight, iArr7, iArr8, iArr9);
            x5Var2.a(canvas2, x5Var2.w, x5Var2.E, width2, realHeight, iArr7, iArr8, iArr9);
            x5Var2.a(canvas2, x5Var2.x, x5Var2.F, width2, realHeight, iArr7, iArr8, iArr9);
            x5Var = x5Var2;
            f6Var.invalidate();
        }
        if (max > 0.0f && stargiftattributebackdropArr[0] != null) {
            int i11 = iArr3[iArr3.length / 2];
            k5 k5Var2 = f6Var.b0;
            float max2 = (k5Var2.b(0) && k5Var2.b(3)) ? 1.0f : Math.max(k5Var2.a(0), k5Var2.a(3));
            org.telegram.ui.Components.e5[] e5VarArr = f6Var.u0;
            if (max2 > f16) {
                canvas2.save();
                canvas2.translate(f13, f12);
                e5VarArr[0].k(Integer.valueOf(i11));
                b1.a(canvas, 0, e5VarArr[0], f6Var.getWidth(), realHeight, max2, 1.0f);
                realHeight = realHeight;
                canvas.restore();
            }
            if (f6Var.b0.a(2) > f16) {
                canvas.save();
                e5VarArr[0].k(Integer.valueOf(i11));
                float f21 = realHeight;
                RectF rectF = org.telegram.messenger.g0.P;
                LinearLayout[] linearLayoutArr = f6Var.f;
                float x10 = linearLayoutArr[2].getX();
                FrameLayout frameLayout = f6Var.L;
                float x11 = frameLayout.getX() + x10;
                org.telegram.ui.Components.k9 k9Var = f6Var.M;
                rectF.set(k9Var.getX() + x11, k9Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY(), k9Var.getX() + frameLayout.getX() + linearLayoutArr[2].getX() + k9Var.getWidth(), k9Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY() + k9Var.getHeight());
                b1.c(canvas, e5VarArr[0], f6Var.getWidth(), f21 * 0.7f, 1.0f, rectF, f6Var.b0.a(2));
                canvas2 = canvas;
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            int i12 = 0;
            while (true) {
                ai.c0[] c0VarArr = f6Var.J;
                if (i12 > c0VarArr.length) {
                    break;
                }
                ai.c0 c0Var = i12 < c0VarArr.length ? c0VarArr[i12] : f6Var.K;
                int[] iArr10 = iArr2;
                if (org.telegram.ui.ActionBar.k6.H1(c0Var.getBackground(), iArr10[Utilities.j(Math.round((((c0Var.getWidth() / f17) + c0Var.getX()) / f6Var.getWidth()) * (iArr10.length - 1)), iArr10.length - 1, 0)], false)) {
                    c0Var.invalidate();
                }
                i12++;
                iArr2 = iArr10;
            }
            int[] iArr11 = iArr;
            int[] iArr12 = iArr2;
            int i13 = iArr11[iArr11.length / 2];
            int i14 = iArr12[iArr12.length / 2];
            TextView textView = f6Var.w;
            if (textView != null && f6Var.x != i13) {
                f6Var.x = i13;
                textView.setTextColor(i13);
                org.telegram.ui.ActionBar.k6.H1(textView.getBackground(), i14, false);
            }
            if (x5Var.s != null || x5Var.w != null || x5Var.x != null) {
                f6Var.E[0].setTextColor(i13);
            }
            if (f6Var.b0.a(2) > f16) {
                if (f6Var.A0 == null) {
                    f6Var.A0 = new lc(i3, 12);
                }
                FrameLayout frameLayout2 = f6Var.b;
                float measuredWidth = (frameLayout2.getMeasuredWidth() / f17) + frameLayout2.getX();
                float scaleX = (frameLayout2.getScaleX() * frameLayout2.getMeasuredWidth()) / f17;
                float measuredHeight = (frameLayout2.getMeasuredHeight() / f17) + frameLayout2.getY();
                float scaleY = (frameLayout2.getScaleY() * frameLayout2.getMeasuredHeight()) / f17;
                float f22 = measuredHeight + scaleY;
                RectF rectF2 = f6Var.z0;
                rectF2.set(measuredWidth - scaleX, measuredHeight - scaleY, measuredWidth + scaleX, f22);
                f6Var.A0.g(rectF2);
                f6Var.A0.d();
                f6Var.A0.a(canvas2, org.telegram.ui.ActionBar.k6.r1(f6Var.b0.a(2), -1));
                f6Var.invalidate();
            }
        }
        if (f6Var.b0.a(1) > f16) {
            f6Var.c(canvas2, f13, f12, f6Var.getWidth(), f6Var.getRealHeight());
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(int i3, TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (stargiftattributebackdrop == null) {
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, tileMode);
        RadialGradient[] radialGradientArr = this.o0;
        radialGradientArr[i3] = radialGradient;
        if (i3 == 0) {
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(168.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, tileMode);
            this.q0 = radialGradient2;
            this.s0.setShader(radialGradient2);
        }
        Matrix[] matrixArr = this.p0;
        if (matrixArr[i3] == null) {
            matrixArr[i3] = new Matrix();
        }
        this.n0[i3].setShader(radialGradientArr[i3]);
    }

    public final void f(TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12) {
        this.O = false;
        boolean z13 = z10 || z11;
        boolean z14 = starGift instanceof TL_stars.TL_starGiftUnique;
        s51 s51Var = this.I;
        s70[] s70VarArr = this.E;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.c0;
        if (z14) {
            stargiftattributebackdropArr[0] = (TL_stars.starGiftAttributeBackdrop) e9.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            g(0, (TL_stars.starGiftAttributePattern) e9.l(starGift.attributes, TL_stars.starGiftAttributePattern.class), false);
            s70VarArr[0].setTextSize(1, 13.0f);
            s51Var.setVisibility(z13 ? 0 : 8);
            ai.c0[] c0VarArr = this.J;
            c0VarArr[2].setVisibility(0);
            if (z13) {
                c0VarArr[1].e(z12 ? R.drawable.filled_crown_off : R.drawable.filled_crown_on, bd.M0(z12 ? 2131750430 : 2131750433, null), false);
            }
            float f10 = 1.0f;
            if (starGift.resell_amount != null) {
                this.O = true;
                boolean z15 = starGift.resale_ton_only;
                dg.b bVar = dg.b.b;
                dg.a resellAmount = starGift.getResellAmount(z15 ? bVar : dg.b.a);
                CharSequence V = bd.V(null, null, 2131749689, wb.V0("⭐️ " + ((Object) wb.M0(resellAmount.o(), 1.0f, ',')), resellAmount.a == bVar), Float.valueOf(0.9f));
                TextView textView = this.P;
                textView.setText(V);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[0];
                textView.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(12.0f), i0.a.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216))));
                if (l6.K1(h10.t0, org.telegram.messenger.m5.o(starGift.owner_id))) {
                    textView.setOnClickListener(new a6(this, 1));
                    pf.a(textView);
                } else {
                    textView.setOnClickListener(null);
                    textView.setStateListAnimator(null);
                }
            }
            if (z10) {
                c0VarArr[0].setAlpha(1.0f);
                c0VarArr[0].e(R.drawable.filled_gift_send, bd.M0(2131750441, null), false);
            } else {
                c0VarArr[0].setAlpha(0.5f);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("L ");
                spannableStringBuilder.setSpan(new wp(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) bd.M0(2131750441, null));
                c0VarArr[0].e(R.drawable.filled_gift_send, spannableStringBuilder, false);
            }
            ai.c0 c0Var = c0VarArr[1];
            if (!z10 && !z11) {
                f10 = 0.5f;
            }
            c0Var.setAlpha(f10);
            if (z10) {
                ArrayList<TL_stars.StarsAmount> arrayList = starGift.resell_amount;
                View.OnClickListener onClickListener = this.W;
                if (arrayList != null) {
                    c0VarArr[2].e(R.drawable.filled_gift_sell_off, bd.M0(2131750440, null), false);
                    c0VarArr[2].setOnClickListener(onClickListener);
                } else {
                    c0VarArr[2].e(R.drawable.filled_gift_sell_on, bd.M0(2131750454, null), false);
                    c0VarArr[2].setOnClickListener(onClickListener);
                }
            } else {
                c0VarArr[2].e(R.drawable.filled_share, bd.M0(2131750446, null), false);
                c0VarArr[2].setOnClickListener(this.V);
            }
            this.g0 = starGift.crafted;
            this.n.a.e(stargiftattributebackdropArr[0], false, true);
        } else {
            stargiftattributebackdropArr[0] = null;
            s70VarArr[0].setTextSize(1, 14.0f);
            this.g0 = false;
            s51Var.setVisibility(8);
        }
        e(0, stargiftattributebackdropArr[0]);
        wb.d1(this.d[0].getImageReceiver(), starGift, hs.q2);
        this.e[0] = (TL_stars.starGiftAttributeModel) e9.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
        d(this.b0);
    }

    public final void g(int i3, TL_stars.starGiftAttributePattern stargiftattributepattern, boolean z10) {
        if (stargiftattributepattern != null) {
            TL_stars.starGiftAttributePattern[] stargiftattributepatternArr = this.t0;
            if (stargiftattributepatternArr[i3] == stargiftattributepattern) {
                return;
            }
            stargiftattributepatternArr[i3] = stargiftattributepattern;
            this.u0[i3].i(stargiftattributepattern.document, z10);
        }
    }

    public int getFinalHeight() {
        int L;
        int measuredHeight;
        boolean d = this.b0.d(0);
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.c0;
        LinearLayout[] linearLayoutArr = this.f;
        if (d) {
            return linearLayoutArr[0].getMeasuredHeight() + org.telegram.messenger.g0.L(160.0f) + org.telegram.messenger.g0.L(stargiftattributebackdropArr[0] != null ? 24.0f : 10.0f);
        }
        if (this.b0.d(1)) {
            return linearLayoutArr[1].getMeasuredHeight() + org.telegram.messenger.g0.L(160.0f) + org.telegram.messenger.g0.L(stargiftattributebackdropArr[1] != null ? 24.0f : 10.0f);
        }
        if (this.b0.d(2)) {
            L = org.telegram.messenger.g0.L(64.0f);
            measuredHeight = linearLayoutArr[2].getMeasuredHeight();
        } else {
            if (!this.b0.d(3)) {
                if (!this.b0.d(4)) {
                    return 0;
                }
                h5 h5Var = this.N;
                return h5Var.getMeasuredHeight() > 0 ? h5Var.getMeasuredHeight() : org.telegram.messenger.g0.L(550.0f);
            }
            L = org.telegram.messenger.g0.L(160.0f);
            measuredHeight = linearLayoutArr[3].getMeasuredHeight();
        }
        return measuredHeight + L;
    }

    public float getRealHeight() {
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.c0;
        int L = org.telegram.messenger.g0.L(160.0f) + org.telegram.messenger.g0.L(stargiftattributebackdropArr[0] != null ? 24.0f : 10.0f);
        LinearLayout[] linearLayoutArr = this.f;
        return (this.b0.a(4) * (this.N.getMeasuredHeight() > 0 ? r1.getMeasuredHeight() : org.telegram.messenger.g0.L(550.0f))) + (this.b0.a(3) * (linearLayoutArr[3].getMeasuredHeight() + org.telegram.messenger.g0.L(160.0f) + org.telegram.messenger.g0.L(stargiftattributebackdropArr[0] != null ? 24.0f : 10.0f))) + (this.b0.a(2) * (linearLayoutArr[2].getMeasuredHeight() + org.telegram.messenger.g0.L(64.0f))) + (this.b0.a(1) * (linearLayoutArr[1].getMeasuredHeight() + org.telegram.messenger.g0.L(160.0f) + org.telegram.messenger.g0.L(stargiftattributebackdropArr[1] != null ? 24.0f : 10.0f))) + (this.b0.a(0) * (linearLayoutArr[0].getMeasuredHeight() + L)) + 0.0f;
    }

    public TL_stars.starGiftAttributeBackdrop getUpgradeBackdropAttribute() {
        float f10 = this.w0;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.c0;
        return f10 > 0.5f ? stargiftattributebackdropArr[2] : stargiftattributebackdropArr[1];
    }

    public org.telegram.ui.Components.k9 getUpgradeImageView() {
        float f10 = this.w0;
        org.telegram.ui.Components.k9[] k9VarArr = this.d;
        return f10 > 0.5f ? k9VarArr[2] : k9VarArr[1];
    }

    public TL_stars.starGiftAttributeModel getUpgradeImageViewAttribute() {
        float f10 = this.w0;
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
        return f10 > 0.5f ? stargiftattributemodelArr[2] : stargiftattributemodelArr[1];
    }

    public TL_stars.starGiftAttributePattern getUpgradePatternAttribute() {
        return this.t0[1];
    }

    public final void h(int i3, CharSequence charSequence, CharSequence charSequence2, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence3, TLObject tLObject, Spannable spannable) {
        this.r[i3].setText(charSequence);
        FrameLayout frameLayout = this.y;
        s70[] s70VarArr = this.E;
        s70 s70Var = this.s;
        TextView textView = this.w;
        if (i3 == 0 && !TextUtils.isEmpty(spannableStringBuilder)) {
            textView.setText(spannableStringBuilder);
            textView.setVisibility(0);
            s70Var.setVisibility(8);
            if (i3 == 0) {
                frameLayout.setVisibility(8);
            } else {
                s70VarArr[i3].setVisibility(8);
            }
        } else if (i3 != 0 || TextUtils.isEmpty(charSequence3)) {
            s70VarArr[i3].setText(charSequence2);
            if (i3 == 0) {
                frameLayout.setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
            } else {
                s70VarArr[i3].setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
            }
            s70Var.setVisibility(8);
            textView.setVisibility(8);
        } else {
            s70Var.setText(charSequence3);
            s70Var.setVisibility(0);
            textView.setVisibility(8);
            if (i3 == 0) {
                frameLayout.setVisibility(8);
            } else {
                s70VarArr[i3].setVisibility(8);
            }
        }
        ai.k1[] k1VarArr = this.G;
        ai.k1 k1Var = k1VarArr[i3];
        if (k1Var != null) {
            k1Var.setVisibility(TextUtils.isEmpty(spannable) ? 8 : 0);
            k1VarArr[i3].setUser(tLObject);
            k1VarArr[i3].setMessage(spannable);
        }
    }

    public final void i(int i3, String str, CharSequence charSequence, SpannableStringBuilder spannableStringBuilder) {
        h(i3, str, charSequence, null, spannableStringBuilder, null, null);
    }

    public final void j(View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, boolean z10) {
        s51 s51Var = this.I;
        s51Var.setVisibility(0);
        ai.c0[] c0VarArr = this.J;
        c0VarArr[0].setAlpha(1.0f);
        c0VarArr[0].e(R.drawable.filled_gift_send, bd.M0(2131750441, null), false);
        c0VarArr[0].setOnClickListener(onClickListener);
        int i3 = onClickListener2 != null ? 0 : 8;
        ai.c0 c0Var = this.K;
        c0Var.setVisibility(i3);
        c0Var.setOnClickListener(onClickListener2);
        c0VarArr[1].e(R.drawable.filled_crown_on, bd.M0(2131750433, null), false);
        c0VarArr[1].setOnClickListener(onClickListener3);
        ((LinearLayout.LayoutParams) c0VarArr[1].getLayoutParams()).rightMargin = 0;
        setWalletDisplayed(z10);
        c0VarArr[2].setVisibility(8);
        s51Var.requestLayout();
    }

    public final void l() {
        s70[] s70VarArr;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr;
        s70 s70Var;
        int i3;
        s70[] s70VarArr2 = this.r;
        if (s70VarArr2 == null || (s70VarArr = this.E) == null || (stargiftattributebackdropArr = this.c0) == null) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.j5, this.a);
        for (int i10 = 0; i10 < 2; i10++) {
            s70 s70Var2 = s70VarArr2[i10];
            if (s70Var2 != null && s70VarArr[i10] != null) {
                s70Var2.setTextColor(stargiftattributebackdropArr[Math.min(1, i10)] == null ? w02 : -1);
                s70 s70Var3 = s70VarArr[i10];
                if (i10 == 0 || i10 == 2) {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[i10];
                    i3 = stargiftattributebackdrop == null ? w02 : (-16777216) | stargiftattributebackdrop.text_color;
                } else {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[1];
                    int i11 = stargiftattributebackdrop2 == null ? w02 : stargiftattributebackdrop2.text_color | (-16777216);
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[2];
                    i3 = i0.a.f(this.w0, i11, stargiftattributebackdrop3 == null ? w02 : (-16777216) | stargiftattributebackdrop3.text_color);
                }
                s70Var3.setTextColor(i3);
            }
        }
        if (s70VarArr.length <= 2 || (s70Var = s70VarArr[2]) == null) {
            return;
        }
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[0];
        if (stargiftattributebackdrop4 != null) {
            w02 = stargiftattributebackdrop4.text_color | (-16777216);
        }
        s70Var.setTextColor(w02);
    }

    public final void m() {
        this.k0 = org.telegram.messenger.g0.N(33.33f) / org.telegram.messenger.g0.N(160.0f);
        float f10 = -this.b.getLeft();
        s70[] s70VarArr = this.r;
        this.i0 = ((((Math.min(s70VarArr[2].getPaint().measureText(s70VarArr[2].getText().toString()), s70VarArr[2].getWidth()) + s70VarArr[2].getWidth()) / 2.0f) + (s70VarArr[2].getX() + f10)) + org.telegram.messenger.g0.L(24.0f)) - (org.telegram.messenger.g0.L(126.67f) / 2.0f);
        this.j0 = (org.telegram.messenger.g0.L(124.0f) + (-r0.getTop())) - (org.telegram.messenger.g0.L(126.67f) / 2.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.e5[] e5VarArr = this.u0;
        e5VarArr[0].a();
        e5VarArr[1].a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.e5[] e5VarArr = this.u0;
        e5VarArr[0].b();
        e5VarArr[1].b();
        org.telegram.messenger.g0.r(this.m0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        if (this.b0.b(2)) {
            m();
            d(this.b0);
        }
    }

    public void setPreviewAttributes(k1 k1Var) {
        k5 k5Var = this.b0;
        if (k5Var != null && k5Var.c == 1 && isAttachedToWindow()) {
            org.telegram.messenger.g0.r(this.m0);
            ValueAnimator valueAnimator = this.l0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.l0 = null;
            }
            int i3 = 1 - this.v0;
            this.v0 = i3;
            org.telegram.ui.Components.k9[] k9VarArr = this.d;
            ch0 B = k9VarArr[2 - i3].getImageReceiver().B();
            ch0 B2 = k9VarArr[this.v0 + 1].getImageReceiver().B();
            if (B2 != null && B != null) {
                B2.T(false, B.t());
            }
            int i10 = this.v0 + 1;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = k1Var.a;
            this.c0[i10] = stargiftattributebackdrop;
            e(i10, stargiftattributebackdrop);
            g(1, k1Var.b, true);
            int i11 = this.v0 + 1;
            TL_stars.starGiftAttributeModel stargiftattributemodel = k1Var.c;
            TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
            stargiftattributemodelArr[i11] = stargiftattributemodel;
            wb.c1(k9VarArr[i11].getImageReceiver(), stargiftattributemodelArr[this.v0 + 1].document, hs.q2);
            a();
            float f10 = this.v0;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f10, f10);
            this.l0 = ofFloat;
            ofFloat.addUpdateListener(new b6(this, 0));
            this.l0.addListener(new d6(this, 3));
            this.l0.setDuration(320L);
            this.l0.setInterpolator(xq.h);
            this.l0.start();
        }
    }

    public void setPreviewingAttributes(ArrayList<TL_stars.StarGiftAttribute> arrayList) {
        this.d0 = new a(e9.m(arrayList, TL_stars.starGiftAttributeModel.class));
        this.e0 = new a(e9.m(arrayList, TL_stars.starGiftAttributePattern.class));
        this.f0 = new a(e9.m(arrayList, TL_stars.starGiftAttributeBackdrop.class));
        this.E[1].setTextSize(1, 14.0f);
        this.I.setVisibility(8);
        this.w0 = 0.0f;
        this.v0 = 0;
        g(1, (TL_stars.starGiftAttributePattern) this.e0.c(), true);
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) this.d0.c();
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
        stargiftattributemodelArr[1] = stargiftattributemodel;
        org.telegram.ui.Components.k9[] k9VarArr = this.d;
        wb.c1(k9VarArr[1].getImageReceiver(), stargiftattributemodelArr[1].document, hs.q2);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) this.f0.c();
        this.c0[1] = stargiftattributebackdrop;
        e(1, stargiftattributebackdrop);
        stargiftattributemodelArr[2] = (TL_stars.starGiftAttributeModel) this.d0.f;
        wb.c1(k9VarArr[2].getImageReceiver(), stargiftattributemodelArr[2].document, hs.q2);
        d1 d1Var = this.m0;
        org.telegram.messenger.g0.r(d1Var);
        org.telegram.messenger.g0.i3(d1Var, 2500L);
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setResellPrice(dg.a aVar) {
        boolean z10;
        boolean z11;
        boolean k10 = aVar.k();
        this.O = !k10;
        s70[] s70VarArr = this.E;
        TextView textView = this.P;
        boolean z12 = true;
        if (k10) {
            z10 = true;
            ViewPropertyAnimator duration = textView.animate().scaleX(0.4f).scaleY(0.4f).alpha(0.0f).setDuration(420L);
            xq xqVar = xq.h;
            duration.setInterpolator(xqVar).setListener(new d6(this, 2)).setListener(new d6(this, 1)).start();
            s70VarArr[0].animate().alpha(1.0f).setDuration(420L).setInterpolator(xqVar).start();
        } else {
            if (aVar.a == dg.b.b) {
                z11 = true;
            } else {
                z11 = true;
                z12 = false;
            }
            int i3 = z11;
            Object[] objArr = new Object[i3];
            objArr[0] = wb.X0(z12, "⭐️ " + ((Object) wb.M0(aVar.o(), 1.0f, ',')), 0.9f, null, 0.0f, 1.0f);
            textView.setText(bd.V(null, null, 2131749689, objArr));
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.c0[0];
            textView.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(12.0f), i0.a.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216))));
            textView.setVisibility(0);
            this.h0 = i3;
            ViewPropertyAnimator duration2 = textView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(420L);
            xq xqVar2 = xq.h;
            duration2.setInterpolator(xqVar2).setListener(new d6(this, 0)).start();
            s70VarArr[0].animate().alpha(0.0f).setDuration(420L).setInterpolator(xqVar2).start();
            z10 = i3;
        }
        boolean z13 = this.O;
        ai.c0[] c0VarArr = this.J;
        if (z13) {
            c0VarArr[2].e(R.drawable.filled_gift_sell_off, bd.M0(2131750440, null), z10);
        } else {
            c0VarArr[2].e(R.drawable.filled_gift_sell_on, bd.M0(2131750454, null), z10);
        }
        c0VarArr[2].setOnClickListener(this.W);
    }

    public void setShowOptions(boolean z10) {
        this.T = z10;
        d(this.b0);
    }

    public void setWalletCard(boolean z10) {
        this.J[1].e(z10 ? R.drawable.filled_card_remove : R.drawable.filled_card_add, bd.M0(z10 ? 2131743112 : 2131743120, null), false);
    }

    public void setWalletDisplayed(boolean z10) {
        this.J[1].setAlpha(z10 ? 1.0f : 0.5f);
    }

    public void setWearPreview(TLObject tLObject) {
        String H;
        String str;
        String str2;
        if (tLObject instanceof TLRPC.User) {
            str2 = l10.p((TLRPC.User) tLObject);
            str = bd.M0(2131747834, null);
        } else {
            if (!(tLObject instanceof TLRPC.Chat)) {
                return;
            }
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            String str3 = chat.title;
            if (org.telegram.messenger.t3.V(chat)) {
                int i3 = chat.participants_count;
                H = i3 > 1 ? bd.H(',', "Subscribers", i3) : bd.M0(2131751391, null);
            } else {
                int i10 = chat.participants_count;
                H = i10 > 1 ? bd.H(',', "Members", i10) : bd.M0(2131754876, null).toLowerCase();
            }
            str = H;
            str2 = str3;
        }
        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        u8Var.l(tLObject);
        this.M.e(tLObject, u8Var);
        this.r[2].setText(str2);
        this.E[2].setText(str);
        m();
        d(this.b0);
    }

    public void k(int i3) {
    }
}
