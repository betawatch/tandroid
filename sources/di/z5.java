package di;

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
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.d61;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public class z5 extends FrameLayout {
    public float A0;
    public ValueAnimator B0;
    public final RectF C0;
    public ec D0;
    public final k80[] E;
    public final int[] E0;
    public final LinearLayout.LayoutParams[] F;
    public final int[] F0;
    public final bi.i1[] G;
    public final int[] G0;
    public final TextPaint H;
    public final d61 I;
    public final ai.k0[] J;
    public final ai.k0 K;
    public final FrameLayout L;
    public final org.telegram.ui.Components.q9 M;
    public final b5 N;
    public boolean O;
    public final TextView P;
    public final ImageView Q;
    public final ImageView R;
    public final ImageView S;
    public boolean T;
    public Boolean U;
    public final View.OnClickListener V;
    public final View.OnClickListener W;
    public final org.telegram.ui.ActionBar.i6 a;
    public final View.OnClickListener a0;
    public final FrameLayout b;
    public e5 b0;
    public final r5 c;
    public final TL_stars.starGiftAttributeBackdrop[] c0;
    public final org.telegram.ui.Components.q9[] d;
    public com.google.android.gms.common.api.internal.p d0;
    public final TL_stars.starGiftAttributeModel[] e;
    public com.google.android.gms.common.api.internal.p e0;
    public final LinearLayout[] f;
    public com.google.android.gms.common.api.internal.p f0;
    public boolean g0;
    public final FrameLayout.LayoutParams[] h;
    public CharSequence h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public float l0;
    public float m0;
    public final bi.d3 n;
    public float n0;
    public ValueAnimator o0;
    public final ca.r p0;
    public final Paint[] q0;
    public final k80[] r;
    public final RadialGradient[] r0;
    public final k80 s;
    public final Matrix[] s0;
    public RadialGradient t0;
    public final Matrix u0;
    public final Paint v0;
    public final TextView w;
    public final TL_stars.starGiftAttributePattern[] w0;
    public int x;
    public final org.telegram.ui.Components.m5[] x0;
    public final FrameLayout y;
    public int y0;
    public float z0;

    public z5(Context context, org.telegram.ui.ActionBar.i6 i6Var, Runnable runnable, View.OnClickListener onClickListener, i1 i1Var, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, View.OnClickListener onClickListener4, View.OnClickListener onClickListener5, View.OnClickListener onClickListener6) {
        super(context);
        float f10;
        float f11;
        float f12;
        this.d = new org.telegram.ui.Components.q9[5];
        this.e = new TL_stars.starGiftAttributeModel[3];
        this.f = new LinearLayout[5];
        this.h = new FrameLayout.LayoutParams[5];
        this.r = new k80[5];
        this.E = new k80[5];
        this.F = new LinearLayout.LayoutParams[5];
        this.G = new bi.i1[5];
        int i7 = 0;
        this.b0 = new e5(0, 0);
        this.c0 = new TL_stars.starGiftAttributeBackdrop[3];
        this.p0 = new ca.r(this, 23);
        this.q0 = new Paint[3];
        this.r0 = new RadialGradient[3];
        this.s0 = new Matrix[3];
        this.u0 = new Matrix();
        this.v0 = new Paint(1);
        int i10 = 2;
        this.w0 = new TL_stars.starGiftAttributePattern[2];
        this.x0 = new org.telegram.ui.Components.m5[2];
        int i11 = 0;
        while (true) {
            Paint[] paintArr = this.q0;
            if (i11 >= paintArr.length) {
                break;
            }
            paintArr[i11] = new Paint(1);
            i11++;
        }
        int i12 = 0;
        while (true) {
            org.telegram.ui.Components.m5[] m5VarArr = this.x0;
            f10 = 28.0f;
            if (i12 >= m5VarArr.length) {
                break;
            }
            m5VarArr[i12] = new org.telegram.ui.Components.m5(org.telegram.messenger.g0.L(28.0f), this);
            i12++;
        }
        this.A0 = 1.0f;
        this.C0 = new RectF();
        this.E0 = new int[12];
        this.F0 = new int[12];
        this.G0 = new int[12];
        this.a = i6Var;
        this.V = onClickListener4;
        this.W = onClickListener5;
        this.a0 = onClickListener6;
        setWillNotDraw(false);
        this.b = new FrameLayout(context);
        int i13 = 0;
        while (true) {
            org.telegram.ui.Components.q9[] q9VarArr = this.d;
            float f13 = 0.0f;
            f11 = f10;
            if (i13 >= q9VarArr.length) {
                break;
            }
            q9VarArr[i13] = new w5(context, 0);
            this.d[i13].setLayerNum(6660);
            if (i13 > 0) {
                this.d[i13].getImageReceiver().t1 = 1;
            }
            this.b.addView(this.d[i13], c8.ma.e(-1, -1, ks.E1));
            org.telegram.ui.Components.q9 q9Var = this.d[i13];
            if (i13 == 0) {
                f13 = 1.0f;
            }
            q9Var.setAlpha(f13);
            i13++;
            f10 = f11;
        }
        k80 k80Var = new k80(context, null);
        this.s = k80Var;
        k80Var.setTextSize(1, 12.0f);
        k80Var.setGravity(17);
        org.telegram.ui.ActionBar.u6.U(k80Var, org.telegram.ui.ActionBar.n6.G6, i6Var);
        org.telegram.ui.ActionBar.u6.G(k80Var, org.telegram.ui.ActionBar.n6.Xc, i6Var);
        k80Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        TextView textView = new TextView(context);
        this.w = textView;
        textView.setOnClickListener(new u5(this, 0));
        c8.ra.b(textView, 0.05f, 1.25f);
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
        c8.ra.a(textView2);
        d61 d61Var = new d61(2, context, this);
        this.I = d61Var;
        d61Var.setOrientation(0);
        this.J = new ai.k0[3];
        int i14 = 0;
        while (true) {
            ai.k0[] k0VarArr = this.J;
            if (i14 >= k0VarArr.length) {
                break;
            }
            k0VarArr[i14] = new ai.k0(context, 6);
            if (i14 == 0) {
                this.J[i14].e(R.drawable.filled_gift_send, gd.M0(2131750417, null), false);
                this.J[i14].setOnClickListener(onClickListener2);
            } else if (i14 == 1) {
                this.J[i14].e(R.drawable.filled_crown_on, gd.M0(2131750409, null), false);
                this.J[i14].setOnClickListener(onClickListener3);
            } else if (i14 == i10) {
                this.J[i14].e(R.drawable.filled_share, gd.M0(2131750422, null), false);
                this.J[i14].setOnClickListener(onClickListener4);
            }
            this.J[i14].setBackground(org.telegram.ui.ActionBar.n6.b0(0, 285212671, 16, 16));
            c8.ra.b(this.J[i14], 0.075f, 1.5f);
            d61 d61Var2 = this.I;
            ai.k0[] k0VarArr2 = this.J;
            d61Var2.addView(k0VarArr2[i14], c8.ma.q(0, 56, 1.0f, ks.E1, 0, 0, i14 != k0VarArr2.length - 1 ? 11 : 0, 0));
            i14++;
            i10 = 2;
        }
        ai.k0 k0Var = new ai.k0(context, 6);
        this.K = k0Var;
        k0Var.e(R.drawable.filled_card_color, gd.M0(2131742870, null), false);
        k0Var.setBackground(org.telegram.ui.ActionBar.n6.b0(0, 285212671, 16, 16));
        c8.ra.b(k0Var, 0.075f, 1.5f);
        k0Var.setVisibility(8);
        this.I.addView(k0Var, 1, c8.ma.q(0, 56, 1.0f, ks.E1, 0, 0, 11, 0));
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
                this.f[i15].addView(frameLayout, c8.ma.r(-1, ks.a2, ks.E1));
                org.telegram.ui.Components.q9 q9Var2 = new org.telegram.ui.Components.q9(context);
                this.M = q9Var2;
                q9Var2.setRoundRadius(org.telegram.messenger.g0.L(41.0f));
                frameLayout.addView(q9Var2, c8.ma.d(82, 82.0f, 49, 0.0f, 2.0f, 0.0f, 0.0f));
                this.r[i15] = new k80(context, null);
                this.r[i15].setTextColor(-1);
                this.r[i15].setTextSize(1, 20.0f);
                this.r[i15].setTypeface(org.telegram.messenger.g0.o());
                this.r[i15].setSingleLine();
                k80 k80Var2 = this.r[i15];
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                k80Var2.setEllipsize(truncateAt);
                this.r[i15].setGravity(17);
                frameLayout.addView(this.r[i15], c8.ma.d(-1, -2.0f, 49, 16.0f, 95.33f, 16.0f, 0.0f));
                this.E[i15] = new k80(context, null);
                this.E[i15].setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.j5, i6Var));
                this.E[i15].setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.u6.G(this.E[i15], org.telegram.ui.ActionBar.n6.Xc, i6Var);
                this.E[i15].setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                this.E[i15].setDisablePaddingsOffsetY(true);
                this.E[i15].setSingleLine();
                this.E[i15].setGravity(17);
                this.E[i15].setEllipsize(truncateAt);
                frameLayout.addView(this.E[i15], c8.ma.d(-1, -2.0f, 49, 16.0f, 122.0f, 16.0f, 0.0f));
            } else if (i15 == 4) {
                b5 b5Var = new b5(context, i6Var);
                this.N = b5Var;
                this.f[i15].addView(b5Var, c8.ma.o(-1, -2));
                View view = this.f[i15];
                FrameLayout.LayoutParams[] layoutParamsArr = this.h;
                ViewGroup.LayoutParams d = c8.ma.d(-1, -2.0f, ks.E1, 0.0f, 0.0f, 0.0f, 0.0f);
                layoutParamsArr[i15] = d;
                addView(view, d);
                i15++;
                i7 = 0;
            } else {
                this.r[i15] = new k80(context, null);
                if (i15 == 3) {
                    this.r[i15].setTextColor(-1);
                } else {
                    this.r[i15].setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.j5, i6Var));
                }
                this.r[i15].setTextSize(1, 20.0f);
                this.r[i15].setTypeface(org.telegram.messenger.g0.o());
                this.r[i15].setGravity(17);
                this.f[i15].addView(this.r[i15], c8.ma.t(-1, -2, 17, 24, i15 == 3 ? 10 : i7, 24, 0));
                if (i15 == 0) {
                    this.f[i15].addView(this.s, c8.ma.t(-2, -2, 17, 0, 4, 0, 4));
                    this.f[i15].addView(this.w, c8.ma.n(19.33f, -2, 17, 0, 6, 0, 2));
                }
                if (i15 == 0) {
                    this.E[i15] = new k80(context, null);
                    if (i15 == 3) {
                        this.E[i15].setTextColor(org.telegram.ui.ActionBar.n6.r1(0.75f, -1));
                    } else {
                        this.E[i15].setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.j5, i6Var));
                    }
                    this.E[i15].setTextSize(1, 14.0f);
                    this.E[i15].setGravity(17);
                    org.telegram.ui.ActionBar.u6.G(this.E[i15], org.telegram.ui.ActionBar.n6.Xc, i6Var);
                    this.E[i15].setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    this.E[i15].setDisablePaddingsOffsetY(true);
                    this.y.addView(this.E[i15], c8.ma.e(-2, -2, 17));
                    this.y.addView(this.P, c8.ma.d(-2, 20.33f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
                    LinearLayout linearLayout = this.f[i15];
                    FrameLayout frameLayout2 = this.y;
                    LinearLayout.LayoutParams[] layoutParamsArr2 = this.F;
                    LinearLayout.LayoutParams t6 = c8.ma.t(-1, -2, 17, 24, 0, 24, i15 == 3 ? 6 : i7);
                    layoutParamsArr2[i15] = t6;
                    linearLayout.addView(frameLayout2, t6);
                } else {
                    this.E[i15] = new k80(context, null);
                    if (i15 == 3) {
                        this.E[i15].setTextColor(org.telegram.ui.ActionBar.n6.r1(0.75f, -1));
                    } else {
                        this.E[i15].setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.j5, i6Var));
                    }
                    this.E[i15].setTextSize(1, 14.0f);
                    this.E[i15].setGravity(17);
                    org.telegram.ui.ActionBar.u6.G(this.E[i15], org.telegram.ui.ActionBar.n6.Xc, i6Var);
                    this.E[i15].setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    this.E[i15].setDisablePaddingsOffsetY(true);
                    LinearLayout linearLayout2 = this.f[i15];
                    k80 k80Var3 = this.E[i15];
                    LinearLayout.LayoutParams[] layoutParamsArr3 = this.F;
                    LinearLayout.LayoutParams t10 = c8.ma.t(-1, -2, 17, 24, 0, 24, i15 == 3 ? 6 : i7);
                    layoutParamsArr3[i15] = t10;
                    linearLayout2.addView(k80Var3, t10);
                }
                LinearLayout.LayoutParams layoutParams = this.F[i15];
                if (i15 == 3) {
                    f12 = 6.0f;
                } else {
                    f12 = (i15 == 1 ? 7.33f : this.c0[i7] == null ? 9.0f : 5.66f) - 4.0f;
                }
                layoutParams.topMargin = org.telegram.messenger.g0.L(f12);
                this.G[i15] = new bi.i1(context);
                this.G[i15].setVisibility(8);
                this.G[i15].setPadding(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(2.0f));
                if (i15 == 0) {
                    this.H = this.G[i15].getTextPaint();
                }
                this.f[i15].addView(this.G[i15], c8.ma.t(-1, -2, 17, 24, 8, 24, 0));
            }
            if (i15 == 0) {
                this.f[i15].addView(this.I, c8.ma.t(-1, -2, 7, 0, 15, 0, 0));
            }
            View view2 = this.f[i15];
            FrameLayout.LayoutParams[] layoutParamsArr4 = this.h;
            ViewGroup.LayoutParams d2 = c8.ma.d(-1, -2.0f, ks.E1, 16.0f, i15 == 2 ? 32.0f : 170.0f, 16.0f, 0.0f);
            layoutParamsArr4[i15] = d2;
            addView(view2, d2);
            i15++;
            i7 = 0;
        }
        addView(this.b, c8.ma.d(ks.q2, 160.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        r5 r5Var = new r5(context);
        this.c = r5Var;
        addView(r5Var, c8.ma.d(-1, 160.0f, 55, 0.0f, 8.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.Q = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.n6.L(org.telegram.messenger.g0.L(f11), 620756991));
        imageView.setImageResource(R.drawable.msg_close);
        c8.ra.a(imageView);
        addView(imageView, c8.ma.d(28, 28.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        imageView.setOnClickListener(new bi.d0(1, runnable));
        imageView.setVisibility(8);
        ImageView imageView2 = new ImageView(context);
        this.R = imageView2;
        imageView2.setImageResource(R.drawable.filled_forge);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        imageView2.setBackground(org.telegram.ui.ActionBar.n6.h0(553648127, 1, -1));
        c8.ra.a(imageView2);
        if (i1Var != null) {
            addView(imageView2, c8.ma.d(42, 42.0f, 53, 0.0f, 5.0f, 47.0f, 0.0f));
            imageView2.setOnClickListener(i1Var);
        }
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.S = imageView3;
        imageView3.setContentDescription(gd.M0(2131754878, null));
        imageView3.setImageResource(R.drawable.media_more);
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(org.telegram.ui.ActionBar.n6.h0(553648127, 1, -1));
        c8.ra.a(imageView3);
        addView(imageView3, c8.ma.d(42, 42.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        imageView3.setOnClickListener(onClickListener);
        imageView3.setVisibility(8);
        bi.d3 d3Var = new bi.d3(context);
        this.n = d3Var;
        d3Var.b(gd.M0(2131749737, null), true);
        bi.f3 f3Var = d3Var.a;
        if (f3Var.w == null) {
            ec ecVar = new ec(2, 12);
            f3Var.w = ecVar;
            ecVar.h = 5.0f;
        }
        Path path = f3Var.f;
        float f14 = f3Var.s;
        f3Var.x = true;
        bi.f3.d(path, f14, true);
        d3Var.setScaleX(1.2f);
        d3Var.setScaleY(1.2f);
        addView(d3Var, c8.ma.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        d3Var.setVisibility(8);
    }

    public final void a() {
        ValueAnimator valueAnimator = this.B0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.B0 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.B0 = ofFloat;
        ofFloat.addUpdateListener(new v5(this, 1));
        this.B0.addListener(new x5(this, 4));
        this.B0.setDuration(320L);
        this.B0.setInterpolator(lr.g);
        this.B0.start();
    }

    public final int b(float f10, float f11, float f12, float f13, Canvas canvas) {
        int i7 = this.y0;
        RadialGradient[] radialGradientArr = this.r0;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.c0;
        Matrix[] matrixArr = this.s0;
        Paint[] paintArr = this.q0;
        int i10 = 0;
        if (i7 != 0) {
            if (this.z0 < 1.0f && stargiftattributebackdropArr[1] != null) {
                paintArr[1].setAlpha((int) (this.b0.a(1) * 255.0f));
                matrixArr[1].reset();
                matrixArr[1].postTranslate(f10, f11);
                radialGradientArr[1].setLocalMatrix(matrixArr[1]);
                canvas.drawRect(0.0f, 0.0f, f12, f13, paintArr[1]);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[1];
                i10 = i0.a.k(i0.a.o(i0.a.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216)), paintArr[1].getAlpha()), 0);
            }
            if (this.z0 <= 0.0f || stargiftattributebackdropArr[2] == null) {
                return i10;
            }
            paintArr[2].setAlpha((int) (this.b0.a(1) * 255.0f * this.z0));
            matrixArr[2].reset();
            matrixArr[2].postTranslate(f10, f11);
            radialGradientArr[2].setLocalMatrix(matrixArr[2]);
            canvas.drawRect(0.0f, 0.0f, f12, f13, paintArr[2]);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[2];
            return i0.a.k(i0.a.o(i0.a.f(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216)), paintArr[2].getAlpha()), i10);
        }
        if (this.z0 > 0.0f && stargiftattributebackdropArr[2] != null) {
            paintArr[2].setAlpha((int) (this.b0.a(1) * 255.0f));
            matrixArr[2].reset();
            matrixArr[2].postTranslate(f10, f11);
            radialGradientArr[2].setLocalMatrix(matrixArr[2]);
            canvas.drawRect(0.0f, 0.0f, f12, f13, paintArr[2]);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[2];
            i10 = i0.a.k(i0.a.o(i0.a.f(0.25f, stargiftattributebackdrop3.edge_color | (-16777216), stargiftattributebackdrop3.pattern_color | (-16777216)), paintArr[2].getAlpha()), 0);
        }
        if (this.z0 >= 1.0f || stargiftattributebackdropArr[1] == null) {
            return i10;
        }
        paintArr[1].setAlpha((int) ((1.0f - this.z0) * this.b0.a(1) * 255.0f));
        matrixArr[1].reset();
        matrixArr[1].postTranslate(f10, f11);
        radialGradientArr[1].setLocalMatrix(matrixArr[1]);
        canvas.drawRect(0.0f, 0.0f, f12, f13, paintArr[1]);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[1];
        return i0.a.k(i0.a.o(i0.a.f(0.25f, stargiftattributebackdrop4.edge_color | (-16777216), stargiftattributebackdrop4.pattern_color | (-16777216)), paintArr[1].getAlpha()), i10);
    }

    public final void c(float f10, float f11, float f12, float f13, Canvas canvas) {
        canvas.save();
        canvas.translate(f10, f11);
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.c0;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[1];
        int i7 = stargiftattributebackdrop == null ? 0 : stargiftattributebackdrop.pattern_color | (-16777216);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[2];
        int f14 = i0.a.f(this.z0, i7, stargiftattributebackdrop2 != null ? stargiftattributebackdrop2.pattern_color | (-16777216) : 0);
        org.telegram.ui.Components.m5[] m5VarArr = this.x0;
        m5VarArr[1].k(Integer.valueOf(f14));
        v0.a(canvas, 0, m5VarArr[1], f12, f13, this.b0.a(1), this.A0);
        canvas.restore();
    }

    public void d(e5 e5Var) {
        View[] viewArr;
        k80[] k80VarArr;
        float a10;
        int i7;
        boolean z10;
        this.b0 = e5Var;
        int i10 = 0;
        while (true) {
            viewArr = this.f;
            if (i10 >= viewArr.length) {
                break;
            }
            float a11 = e5Var.a(i10);
            viewArr[i10].setAlpha(a11);
            viewArr[i10].setVisibility(a11 > 0.0f ? 0 : 4);
            i10++;
        }
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.c0;
        float max = Math.max(stargiftattributebackdropArr[0] != null ? e5Var.a(2) : 0.0f, stargiftattributebackdropArr[1] != null ? e5Var.a(1) : 0.0f);
        ImageView imageView = this.Q;
        imageView.setAlpha(max);
        imageView.setVisibility(((stargiftattributebackdropArr[0] == null || e5Var.c != 2) && (stargiftattributebackdropArr[1] == null || e5Var.c != 1)) ? 8 : 0);
        boolean z11 = stargiftattributebackdropArr[0] != null || this.T;
        float a12 = e5Var.a(0);
        int i11 = e5Var.c;
        float V1 = org.telegram.messenger.g0.V1(false, z11, a12);
        ImageView imageView2 = this.S;
        imageView2.setAlpha(V1);
        imageView2.setVisibility((z11 && i11 == 0) ? 0 : 8);
        boolean z12 = stargiftattributebackdropArr[0] != null;
        Boolean bool = this.U;
        int i12 = -1;
        org.telegram.ui.ActionBar.i6 i6Var = this.a;
        if (bool == null || bool.booleanValue() != z12) {
            this.U = Boolean.valueOf(z12);
            if (z12) {
                imageView2.clearColorFilter();
                imageView2.setBackground(org.telegram.ui.ActionBar.n6.h0(553648127, 1, -1));
            } else {
                org.telegram.ui.ActionBar.u6.s(imageView2, org.telegram.ui.ActionBar.n6.J5, i6Var, PorterDuff.Mode.SRC_IN);
                int i13 = org.telegram.ui.ActionBar.n6.i6;
                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i13, i6Var), 1, -1);
                org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i13);
                imageView2.setBackground(h02);
                org.telegram.ui.ActionBar.u6.j(imageView2, h02, null, M, i6Var);
            }
        }
        if (!this.k0) {
            float V12 = org.telegram.messenger.g0.V1(false, this.O, e5Var.a(0));
            TextView textView = this.P;
            textView.setAlpha(V12);
            textView.setScaleX(org.telegram.messenger.g0.T1(0.4f, this.O ? 1.0f : 0.4f, e5Var.a(0)));
            textView.setScaleY(org.telegram.messenger.g0.T1(0.4f, this.O ? 1.0f : 0.4f, e5Var.a(0)));
            textView.setVisibility(!this.O ? 8 : i11 == 0 ? 0 : 4);
        }
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.j5, i6Var);
        int i14 = 0;
        while (true) {
            k80VarArr = this.E;
            if (i14 >= 2) {
                break;
            }
            this.r[i14].setTextColor(stargiftattributebackdropArr[Math.min(1, i14)] == null ? w02 : i12);
            k80 k80Var = k80VarArr[i14];
            if (i14 == 0 || i14 == 2) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[i14];
                i7 = stargiftattributebackdrop == null ? w02 : stargiftattributebackdrop.text_color | (-16777216);
            } else {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[1];
                int i15 = stargiftattributebackdrop2 == null ? w02 : stargiftattributebackdrop2.text_color | (-16777216);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[2];
                i7 = i0.a.f(this.z0, i15, stargiftattributebackdrop3 == null ? w02 : stargiftattributebackdrop3.text_color | (-16777216));
            }
            k80Var.setTextColor(i7);
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
                    k80VarArr[i14].setLayoutParams(layoutParamsArr2[i14]);
                }
            }
            i14++;
            i12 = -1;
        }
        int L = org.telegram.messenger.g0.L(24.0f);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop5 = stargiftattributebackdropArr[0];
        this.w.setBackground(org.telegram.ui.ActionBar.n6.d0(L, stargiftattributebackdrop5 == null ? 553648127 : i0.a.f(0.25f, stargiftattributebackdrop5.edge_color | (-16777216), stargiftattributebackdrop5.pattern_color | (-16777216))));
        k80 k80Var2 = k80VarArr[2];
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop6 = stargiftattributebackdropArr[0];
        if (stargiftattributebackdrop6 != null) {
            w02 = stargiftattributebackdrop6.text_color | (-16777216);
        }
        k80Var2.setTextColor(w02);
        org.telegram.ui.Components.q9[] q9VarArr = this.d;
        org.telegram.ui.Components.q9 q9Var = q9VarArr[0];
        e5 e5Var2 = this.b0;
        q9Var.setAlpha(Math.max((e5Var2.b(0) && e5Var2.b(2)) ? 1.0f : Math.max(e5Var2.a(0), e5Var2.a(2)), this.b0.a(3)));
        q9VarArr[1].setAlpha((1.0f - this.z0) * e5Var.a(1));
        q9VarArr[2].setAlpha(e5Var.a(1) * this.z0);
        float T1 = org.telegram.messenger.g0.T1(1.0f, this.n0, e5Var.a(2));
        FrameLayout frameLayout = this.b;
        frameLayout.setScaleX(T1);
        frameLayout.setScaleY(org.telegram.messenger.g0.T1(1.0f, this.n0, e5Var.a(2)));
        frameLayout.setTranslationX(e5Var.a(2) * this.l0);
        frameLayout.setTranslationY((e5Var.a(2) * this.m0) + (e5Var.a(1) * org.telegram.messenger.g0.L(16.0f)));
        View view = viewArr[2];
        int i16 = e5Var.b;
        if (i16 == 2 && i11 == 2) {
            a10 = 0.0f;
        } else {
            if (i16 != 2) {
                i11 = i16;
            }
            a10 = (1.0f - e5Var.a(2)) * (-(viewArr[i11].getMeasuredHeight() - viewArr[2].getMeasuredHeight()));
        }
        view.setTranslationY(a10);
        int i17 = (this.g0 && this.b0.b(0)) ? 0 : 8;
        bi.d3 d3Var = this.n;
        d3Var.setVisibility(i17);
        d3Var.setAlpha(this.b0.a(0));
        int i18 = e5Var.a(4) <= 0.0f ? 8 : 0;
        b5 b5Var = this.N;
        b5Var.setVisibility(i18);
        b5Var.setAlpha(e5Var.a(4));
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
        z5 z5Var;
        int i7;
        int[] iArr3;
        float f13;
        Canvas canvas2;
        r5 r5Var;
        float realHeight = getRealHeight();
        canvas.save();
        float f14 = 0.0f;
        canvas.clipRect(0.0f, 0.0f, getWidth(), realHeight);
        float f15 = 2.0f;
        float width = getWidth() / 2.0f;
        float L = org.telegram.messenger.g0.L(80.0f) + org.telegram.messenger.g0.W1(this.b0.a(1), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(24.0f));
        e5 e5Var = this.b0;
        float max = ((e5Var.b(0) && e5Var.b(2)) || (e5Var.b(2) && e5Var.b(3)) || (e5Var.b(3) && e5Var.b(0))) ? 1.0f : Math.max(e5Var.a(0), Math.max(e5Var.a(2), e5Var.a(3)));
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr2 = this.c0;
        if (max <= 0.0f || stargiftattributebackdropArr2[0] == null) {
            stargiftattributebackdropArr = stargiftattributebackdropArr2;
        } else {
            if (this.t0 == null || this.b0.a(2) < 1.0f) {
                Paint[] paintArr = this.q0;
                paintArr[0].setAlpha((int) (max * 255.0f));
                Matrix[] matrixArr = this.s0;
                matrixArr[0].reset();
                matrixArr[0].postTranslate(width, L);
                this.r0[0].setLocalMatrix(matrixArr[0]);
                stargiftattributebackdropArr = stargiftattributebackdropArr2;
                canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, paintArr[0]);
            } else {
                stargiftattributebackdropArr = stargiftattributebackdropArr2;
            }
            if (this.t0 != null && this.b0.a(2) > 0.0f) {
                int a10 = (int) (this.b0.a(2) * 255.0f);
                Paint paint = this.v0;
                paint.setAlpha(a10);
                Matrix matrix = this.u0;
                matrix.reset();
                matrix.postTranslate(getWidth() / 2.0f, 0.4f * realHeight);
                this.t0.setLocalMatrix(matrix);
                canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, paint);
            }
        }
        if (this.b0.a(1) > 0.0f) {
            f10 = width;
            f11 = L;
            int b10 = b(f10, f11, getWidth(), realHeight, canvas);
            realHeight = realHeight;
            k(b10);
        } else {
            f10 = width;
            f11 = L;
        }
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[0];
        int[] iArr4 = this.G0;
        int[] iArr5 = this.F0;
        int[] iArr6 = this.E0;
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
        r5 r5Var2 = this.c;
        if (r5Var2.s == null && r5Var2.w == null && r5Var2.x == null) {
            z5Var = this;
            f13 = f10;
            f12 = f11;
            iArr = iArr5;
            iArr2 = iArr6;
            i7 = 1;
            canvas2 = canvas;
            r5Var = r5Var2;
            iArr3 = iArr4;
        } else {
            float width2 = getWidth();
            float f18 = f11;
            l5 l5Var = r5Var2.s;
            float f19 = r5Var2.y;
            int[] iArr7 = this.F0;
            int[] iArr8 = this.E0;
            int[] iArr9 = this.G0;
            f12 = f18;
            iArr = iArr5;
            iArr2 = iArr6;
            z5Var = this;
            i7 = 1;
            iArr3 = iArr4;
            f13 = f10;
            canvas2 = canvas;
            r5Var2.a(canvas2, l5Var, f19, width2, realHeight, iArr7, iArr8, iArr9);
            r5Var2.a(canvas2, r5Var2.w, r5Var2.E, width2, realHeight, iArr7, iArr8, iArr9);
            r5Var2.a(canvas2, r5Var2.x, r5Var2.F, width2, realHeight, iArr7, iArr8, iArr9);
            r5Var = r5Var2;
            z5Var.invalidate();
        }
        if (max > 0.0f && stargiftattributebackdropArr[0] != null) {
            int i11 = iArr3[iArr3.length / 2];
            e5 e5Var2 = z5Var.b0;
            float max2 = (e5Var2.b(0) && e5Var2.b(3)) ? 1.0f : Math.max(e5Var2.a(0), e5Var2.a(3));
            org.telegram.ui.Components.m5[] m5VarArr = z5Var.x0;
            if (max2 > f16) {
                canvas2.save();
                canvas2.translate(f13, f12);
                m5VarArr[0].k(Integer.valueOf(i11));
                float f20 = realHeight;
                v0.a(canvas, 0, m5VarArr[0], z5Var.getWidth(), f20, max2, 1.0f);
                realHeight = f20;
                canvas.restore();
            }
            if (z5Var.b0.a(2) > f16) {
                canvas.save();
                m5VarArr[0].k(Integer.valueOf(i11));
                float f21 = realHeight;
                RectF rectF = org.telegram.messenger.g0.P;
                LinearLayout[] linearLayoutArr = z5Var.f;
                float x10 = linearLayoutArr[2].getX();
                FrameLayout frameLayout = z5Var.L;
                float x11 = frameLayout.getX() + x10;
                org.telegram.ui.Components.q9 q9Var = z5Var.M;
                rectF.set(q9Var.getX() + x11, q9Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY(), q9Var.getX() + frameLayout.getX() + linearLayoutArr[2].getX() + q9Var.getWidth(), q9Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY() + q9Var.getHeight());
                v0.c(canvas, m5VarArr[0], z5Var.getWidth(), f21 * 0.7f, 1.0f, rectF, z5Var.b0.a(2));
                canvas2 = canvas;
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            int i12 = 0;
            while (true) {
                ai.k0[] k0VarArr = z5Var.J;
                if (i12 > k0VarArr.length) {
                    break;
                }
                ai.k0 k0Var = i12 < k0VarArr.length ? k0VarArr[i12] : z5Var.K;
                int[] iArr10 = iArr2;
                if (org.telegram.ui.ActionBar.n6.H1(k0Var.getBackground(), iArr10[Utilities.j(Math.round((((k0Var.getWidth() / f17) + k0Var.getX()) / z5Var.getWidth()) * (iArr10.length - 1)), iArr10.length - 1, 0)], false)) {
                    k0Var.invalidate();
                }
                i12++;
                iArr2 = iArr10;
            }
            int[] iArr11 = iArr;
            int[] iArr12 = iArr2;
            int i13 = iArr11[iArr11.length / 2];
            int i14 = iArr12[iArr12.length / 2];
            TextView textView = z5Var.w;
            if (textView != null && z5Var.x != i13) {
                z5Var.x = i13;
                textView.setTextColor(i13);
                org.telegram.ui.ActionBar.n6.H1(textView.getBackground(), i14, false);
            }
            if (r5Var.s != null || r5Var.w != null || r5Var.x != null) {
                z5Var.E[0].setTextColor(i13);
            }
            if (z5Var.b0.a(2) > f16) {
                if (z5Var.D0 == null) {
                    z5Var.D0 = new ec(i7, 12);
                }
                FrameLayout frameLayout2 = z5Var.b;
                float measuredWidth = (frameLayout2.getMeasuredWidth() / f17) + frameLayout2.getX();
                float scaleX = (frameLayout2.getScaleX() * frameLayout2.getMeasuredWidth()) / f17;
                float measuredHeight = (frameLayout2.getMeasuredHeight() / f17) + frameLayout2.getY();
                float scaleY = (frameLayout2.getScaleY() * frameLayout2.getMeasuredHeight()) / f17;
                float f22 = measuredHeight + scaleY;
                RectF rectF2 = z5Var.C0;
                rectF2.set(measuredWidth - scaleX, measuredHeight - scaleY, measuredWidth + scaleX, f22);
                z5Var.D0.g(rectF2);
                z5Var.D0.d();
                z5Var.D0.a(canvas2, org.telegram.ui.ActionBar.n6.r1(z5Var.b0.a(2), -1));
                z5Var.invalidate();
            }
        }
        if (z5Var.b0.a(1) > f16) {
            z5Var.c(f13, f12, z5Var.getWidth(), z5Var.getRealHeight(), canvas2);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(int i7, TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (stargiftattributebackdrop == null) {
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, tileMode);
        RadialGradient[] radialGradientArr = this.r0;
        radialGradientArr[i7] = radialGradient;
        if (i7 == 0) {
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(168.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, tileMode);
            this.t0 = radialGradient2;
            this.v0.setShader(radialGradient2);
        }
        Matrix[] matrixArr = this.s0;
        if (matrixArr[i7] == null) {
            matrixArr[i7] = new Matrix();
        }
        this.q0[i7].setShader(radialGradientArr[i7]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12) {
        int i7;
        cg.a resellAmount;
        boolean z13;
        char c10;
        boolean z14;
        this.O = false;
        boolean z15 = z10 || z11;
        boolean z16 = starGift instanceof TL_stars.TL_starGiftUnique;
        d61 d61Var = this.I;
        k80[] k80VarArr = this.E;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.c0;
        if (z16) {
            stargiftattributebackdropArr[0] = (TL_stars.starGiftAttributeBackdrop) x8.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            g(0, (TL_stars.starGiftAttributePattern) x8.l(starGift.attributes, TL_stars.starGiftAttributePattern.class), false);
            k80VarArr[0].setTextSize(1, 13.0f);
            d61Var.setVisibility(z15 ? 0 : 8);
            ai.k0[] k0VarArr = this.J;
            k0VarArr[2].setVisibility(0);
            if (z15) {
                k0VarArr[1].e(z12 ? R.drawable.filled_crown_off : R.drawable.filled_crown_on, gd.M0(z12 ? 2131750406 : 2131750409, null), false);
            }
            CharSequence charSequence = this.h0;
            float f10 = 1.0f;
            TextView textView = this.P;
            if (charSequence != null) {
                this.O = true;
                textView.setText(charSequence);
                int L = org.telegram.messenger.g0.L(12.0f);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[0];
                textView.setBackground(org.telegram.ui.ActionBar.n6.d0(L, i0.a.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216))));
                textView.setOnClickListener(null);
                textView.setStateListAnimator(null);
            } else if (starGift.resell_amount != null && !f6.P1(j10.t0, starGift)) {
                this.O = true;
                boolean m10 = bi.u4.m(starGift);
                cg.b bVar = cg.b.b;
                if (m10 && starGift.fixed_sale) {
                    resellAmount = starGift.getResellAmount(bVar);
                } else {
                    resellAmount = starGift.getResellAmount(starGift.resale_ton_only ? bVar : cg.b.a);
                }
                char c11 = 2;
                cg.b bVar2 = resellAmount.a;
                boolean z17 = false;
                textView.setText(pb.t1(gd.V(null, null, 2131749664, pb.X0(bVar2 == bVar, "⭐️ " + ((Object) pb.M0(resellAmount.q(), 1.0f, ',')), resellAmount.a == bVar ? 1.3f : 1.13f, null)), bVar2 == bVar));
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[0];
                textView.setBackground(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(12.0f), i0.a.f(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216))));
                if (f6.R1(j10.t0, org.telegram.messenger.n5.o(starGift.owner_id))) {
                    textView.setOnClickListener(new u5(this, 1));
                    c8.ra.a(textView);
                    c10 = c11;
                    z13 = z17;
                } else {
                    textView.setOnClickListener(null);
                    textView.setStateListAnimator(null);
                    c10 = c11;
                    z13 = z17;
                }
                this.j0 = z10;
                m();
                ai.k0 k0Var = k0VarArr[1];
                if (!z10 && !z11) {
                    f10 = 0.5f;
                }
                k0Var.setAlpha(f10);
                if (z10) {
                    boolean z18 = z13;
                    k0VarArr[c10].e(R.drawable.filled_share, gd.M0(2131750422, null), z18);
                    k0VarArr[c10].setOnClickListener(this.V);
                    z14 = z18;
                } else {
                    ArrayList<TL_stars.StarsAmount> arrayList = starGift.resell_amount;
                    View.OnClickListener onClickListener = this.W;
                    if (arrayList != null) {
                        boolean z19 = z13;
                        k0VarArr[c10].e(R.drawable.filled_gift_sell_off, gd.M0(2131750416, null), z19);
                        k0VarArr[c10].setOnClickListener(onClickListener);
                        z14 = z19;
                    } else {
                        boolean z20 = z13;
                        k0VarArr[c10].e(R.drawable.filled_gift_sell_on, gd.M0(2131750430, null), z20);
                        k0VarArr[c10].setOnClickListener(onClickListener);
                        z14 = z20;
                    }
                }
                this.g0 = starGift.crafted;
                this.n.a.e(stargiftattributebackdropArr[z14 ? 1 : 0], z14, true);
                i7 = z14;
            }
            z13 = false;
            c10 = 2;
            this.j0 = z10;
            m();
            ai.k0 k0Var2 = k0VarArr[1];
            if (!z10) {
                f10 = 0.5f;
            }
            k0Var2.setAlpha(f10);
            if (z10) {
            }
            this.g0 = starGift.crafted;
            this.n.a.e(stargiftattributebackdropArr[z14 ? 1 : 0], z14, true);
            i7 = z14;
        } else {
            i7 = 0;
            stargiftattributebackdropArr[0] = null;
            k80VarArr[0].setTextSize(1, 14.0f);
            this.g0 = false;
            d61Var.setVisibility(8);
        }
        e(i7, stargiftattributebackdropArr[i7]);
        pb.e1(this.d[i7].getImageReceiver(), starGift, ks.q2);
        this.e[i7] = (TL_stars.starGiftAttributeModel) x8.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
        d(this.b0);
    }

    public final void g(int i7, TL_stars.starGiftAttributePattern stargiftattributepattern, boolean z10) {
        if (stargiftattributepattern != null) {
            TL_stars.starGiftAttributePattern[] stargiftattributepatternArr = this.w0;
            if (stargiftattributepatternArr[i7] == stargiftattributepattern) {
                return;
            }
            stargiftattributepatternArr[i7] = stargiftattributepattern;
            this.x0[i7].i(stargiftattributepattern.document, z10);
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
                b5 b5Var = this.N;
                return b5Var.getMeasuredHeight() > 0 ? b5Var.getMeasuredHeight() : org.telegram.messenger.g0.L(550.0f);
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
        float f10 = this.z0;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.c0;
        return f10 > 0.5f ? stargiftattributebackdropArr[2] : stargiftattributebackdropArr[1];
    }

    public org.telegram.ui.Components.q9 getUpgradeImageView() {
        float f10 = this.z0;
        org.telegram.ui.Components.q9[] q9VarArr = this.d;
        return f10 > 0.5f ? q9VarArr[2] : q9VarArr[1];
    }

    public TL_stars.starGiftAttributeModel getUpgradeImageViewAttribute() {
        float f10 = this.z0;
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
        return f10 > 0.5f ? stargiftattributemodelArr[2] : stargiftattributemodelArr[1];
    }

    public TL_stars.starGiftAttributePattern getUpgradePatternAttribute() {
        return this.w0[1];
    }

    public final void h(int i7, CharSequence charSequence, CharSequence charSequence2, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence3, TLObject tLObject, Spannable spannable) {
        this.r[i7].setText(charSequence);
        FrameLayout frameLayout = this.y;
        k80[] k80VarArr = this.E;
        k80 k80Var = this.s;
        TextView textView = this.w;
        if (i7 == 0 && !TextUtils.isEmpty(spannableStringBuilder)) {
            textView.setText(spannableStringBuilder);
            textView.setVisibility(0);
            k80Var.setVisibility(8);
            if (i7 == 0) {
                frameLayout.setVisibility(8);
            } else {
                k80VarArr[i7].setVisibility(8);
            }
        } else if (i7 != 0 || TextUtils.isEmpty(charSequence3)) {
            k80VarArr[i7].setText(charSequence2);
            if (i7 == 0) {
                frameLayout.setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
            } else {
                k80VarArr[i7].setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
            }
            k80Var.setVisibility(8);
            textView.setVisibility(8);
        } else {
            k80Var.setText(charSequence3);
            k80Var.setVisibility(0);
            textView.setVisibility(8);
            if (i7 == 0) {
                frameLayout.setVisibility(8);
            } else {
                k80VarArr[i7].setVisibility(8);
            }
        }
        bi.i1[] i1VarArr = this.G;
        bi.i1 i1Var = i1VarArr[i7];
        if (i1Var != null) {
            i1Var.setVisibility(TextUtils.isEmpty(spannable) ? 8 : 0);
            i1VarArr[i7].setUser(tLObject);
            i1VarArr[i7].setMessage(spannable);
        }
    }

    public final void i(int i7, String str, CharSequence charSequence, SpannableStringBuilder spannableStringBuilder) {
        h(i7, str, charSequence, null, spannableStringBuilder, null, null);
    }

    public final void j(View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, boolean z10) {
        d61 d61Var = this.I;
        d61Var.setVisibility(0);
        ai.k0[] k0VarArr = this.J;
        k0VarArr[0].setAlpha(1.0f);
        k0VarArr[0].e(R.drawable.filled_gift_send, gd.M0(2131750417, null), false);
        k0VarArr[0].setOnClickListener(onClickListener);
        int i7 = onClickListener2 != null ? 0 : 8;
        ai.k0 k0Var = this.K;
        k0Var.setVisibility(i7);
        k0Var.setOnClickListener(onClickListener2);
        k0VarArr[1].e(R.drawable.filled_crown_on, gd.M0(2131750409, null), false);
        k0VarArr[1].setOnClickListener(onClickListener3);
        ((LinearLayout.LayoutParams) k0VarArr[1].getLayoutParams()).rightMargin = 0;
        setWalletDisplayed(z10);
        k0VarArr[2].setVisibility(8);
        d61Var.requestLayout();
    }

    public final void l() {
        k80[] k80VarArr;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr;
        k80 k80Var;
        int i7;
        k80[] k80VarArr2 = this.r;
        if (k80VarArr2 == null || (k80VarArr = this.E) == null || (stargiftattributebackdropArr = this.c0) == null) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.j5, this.a);
        for (int i10 = 0; i10 < 2; i10++) {
            k80 k80Var2 = k80VarArr2[i10];
            if (k80Var2 != null && k80VarArr[i10] != null) {
                k80Var2.setTextColor(stargiftattributebackdropArr[Math.min(1, i10)] == null ? w02 : -1);
                k80 k80Var3 = k80VarArr[i10];
                if (i10 == 0 || i10 == 2) {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[i10];
                    i7 = stargiftattributebackdrop == null ? w02 : (-16777216) | stargiftattributebackdrop.text_color;
                } else {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[1];
                    int i11 = stargiftattributebackdrop2 == null ? w02 : stargiftattributebackdrop2.text_color | (-16777216);
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[2];
                    i7 = i0.a.f(this.z0, i11, stargiftattributebackdrop3 == null ? w02 : (-16777216) | stargiftattributebackdrop3.text_color);
                }
                k80Var3.setTextColor(i7);
            }
        }
        if (k80VarArr.length <= 2 || (k80Var = k80VarArr[2]) == null) {
            return;
        }
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[0];
        if (stargiftattributebackdrop4 != null) {
            w02 = stargiftattributebackdrop4.text_color | (-16777216);
        }
        k80Var.setTextColor(w02);
    }

    public final void m() {
        boolean z10 = this.j0;
        ai.k0[] k0VarArr = this.J;
        if (z10 || this.i0) {
            k0VarArr[0].setAlpha(1.0f);
            k0VarArr[0].e(R.drawable.filled_gift_send, gd.M0(2131750417, null), false);
            return;
        }
        k0VarArr[0].setAlpha(0.5f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("L ");
        spannableStringBuilder.setSpan(new lq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) gd.M0(2131750417, null));
        k0VarArr[0].e(R.drawable.filled_gift_send, spannableStringBuilder, false);
    }

    public final void n() {
        this.n0 = org.telegram.messenger.g0.N(33.33f) / org.telegram.messenger.g0.N(160.0f);
        float f10 = -this.b.getLeft();
        k80[] k80VarArr = this.r;
        this.l0 = ((((Math.min(k80VarArr[2].getPaint().measureText(k80VarArr[2].getText().toString()), k80VarArr[2].getWidth()) + k80VarArr[2].getWidth()) / 2.0f) + (k80VarArr[2].getX() + f10)) + org.telegram.messenger.g0.L(24.0f)) - (org.telegram.messenger.g0.L(126.67f) / 2.0f);
        this.m0 = (org.telegram.messenger.g0.L(124.0f) + (-r0.getTop())) - (org.telegram.messenger.g0.L(126.67f) / 2.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.m5[] m5VarArr = this.x0;
        m5VarArr[0].a();
        m5VarArr[1].a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.m5[] m5VarArr = this.x0;
        m5VarArr[0].b();
        m5VarArr[1].b();
        org.telegram.messenger.g0.r(this.p0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        if (this.b0.b(2)) {
            n();
            d(this.b0);
        }
    }

    public void setInWallet(boolean z10) {
        if (this.i0 == z10) {
            return;
        }
        this.i0 = z10;
        m();
    }

    public void setPreviewAttributes(c1 c1Var) {
        e5 e5Var = this.b0;
        if (e5Var != null && e5Var.c == 1 && isAttachedToWindow()) {
            org.telegram.messenger.g0.r(this.p0);
            ValueAnimator valueAnimator = this.o0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.o0 = null;
            }
            int i7 = 1 - this.y0;
            this.y0 = i7;
            org.telegram.ui.Components.q9[] q9VarArr = this.d;
            mh0 B = q9VarArr[2 - i7].getImageReceiver().B();
            mh0 B2 = q9VarArr[this.y0 + 1].getImageReceiver().B();
            if (B2 != null && B != null) {
                B2.T(false, B.t());
            }
            int i10 = this.y0 + 1;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = c1Var.a;
            this.c0[i10] = stargiftattributebackdrop;
            e(i10, stargiftattributebackdrop);
            g(1, c1Var.b, true);
            int i11 = this.y0 + 1;
            TL_stars.starGiftAttributeModel stargiftattributemodel = c1Var.c;
            TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
            stargiftattributemodelArr[i11] = stargiftattributemodel;
            pb.d1(q9VarArr[i11].getImageReceiver(), stargiftattributemodelArr[this.y0 + 1].document, ks.q2);
            a();
            float f10 = this.y0;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f10, f10);
            this.o0 = ofFloat;
            ofFloat.addUpdateListener(new v5(this, 0));
            this.o0.addListener(new x5(this, 3));
            this.o0.setDuration(320L);
            this.o0.setInterpolator(lr.h);
            this.o0.start();
        }
    }

    public void setPreviewingAttributes(ArrayList<TL_stars.StarGiftAttribute> arrayList) {
        this.d0 = new com.google.android.gms.common.api.internal.p(x8.m(arrayList, TL_stars.starGiftAttributeModel.class));
        this.e0 = new com.google.android.gms.common.api.internal.p(x8.m(arrayList, TL_stars.starGiftAttributePattern.class));
        this.f0 = new com.google.android.gms.common.api.internal.p(x8.m(arrayList, TL_stars.starGiftAttributeBackdrop.class));
        this.E[1].setTextSize(1, 14.0f);
        this.I.setVisibility(8);
        this.z0 = 0.0f;
        this.y0 = 0;
        g(1, (TL_stars.starGiftAttributePattern) this.e0.c(), true);
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) this.d0.c();
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
        stargiftattributemodelArr[1] = stargiftattributemodel;
        org.telegram.ui.Components.q9[] q9VarArr = this.d;
        pb.d1(q9VarArr[1].getImageReceiver(), stargiftattributemodelArr[1].document, ks.q2);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) this.f0.c();
        this.c0[1] = stargiftattributebackdrop;
        e(1, stargiftattributebackdrop);
        stargiftattributemodelArr[2] = (TL_stars.starGiftAttributeModel) this.d0.f;
        pb.d1(q9VarArr[2].getImageReceiver(), stargiftattributemodelArr[2].document, ks.q2);
        ca.r rVar = this.p0;
        org.telegram.messenger.g0.r(rVar);
        org.telegram.messenger.g0.h3(rVar, 2500L);
        invalidate();
    }

    public void setResellPrice(cg.a aVar) {
        char c10;
        boolean l10 = aVar.l();
        cg.b bVar = aVar.a;
        this.O = !l10;
        k80[] k80VarArr = this.E;
        TextView textView = this.P;
        if (l10) {
            ViewPropertyAnimator duration = textView.animate().scaleX(0.4f).scaleY(0.4f).alpha(0.0f).setDuration(420L);
            lr lrVar = lr.h;
            duration.setInterpolator(lrVar).setListener(new x5(this, 2)).setListener(new x5(this, 1)).start();
            k80VarArr[0].animate().alpha(1.0f).setDuration(420L).setInterpolator(lrVar).start();
        } else {
            cg.b bVar2 = cg.b.b;
            textView.setText(pb.t1(gd.V(null, null, 2131749664, pb.X0(bVar == bVar2, "⭐️ " + ((Object) pb.M0(aVar.q(), 1.0f, ',')), bVar == bVar2 ? 1.3f : 0.9f, null)), bVar == bVar2));
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.c0[0];
            textView.setBackground(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(12.0f), i0.a.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216))));
            textView.setVisibility(0);
            this.k0 = true;
            ViewPropertyAnimator duration2 = textView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(420L);
            lr lrVar2 = lr.h;
            duration2.setInterpolator(lrVar2).setListener(new x5(this, 0)).start();
            k80VarArr[0].animate().alpha(0.0f).setDuration(420L).setInterpolator(lrVar2).start();
        }
        boolean z10 = this.O;
        ai.k0[] k0VarArr = this.J;
        if (z10) {
            c10 = 2;
            k0VarArr[2].e(R.drawable.filled_gift_sell_off, gd.M0(2131750416, null), true);
        } else {
            c10 = 2;
            k0VarArr[2].e(R.drawable.filled_gift_sell_on, gd.M0(2131750430, null), true);
        }
        k0VarArr[c10].setOnClickListener(this.W);
    }

    public void setShowOptions(boolean z10) {
        this.T = z10;
        d(this.b0);
    }

    public void setStatusPill(CharSequence charSequence) {
        this.h0 = charSequence;
    }

    public void setWalletCard(boolean z10) {
        this.J[1].e(z10 ? R.drawable.filled_card_remove : R.drawable.filled_card_add, gd.M0(z10 ? 2131742863 : 2131742871, null), false);
    }

    public void setWalletDisplayed(boolean z10) {
        this.J[1].setAlpha(z10 ? 1.0f : 0.5f);
    }

    public void setWearPreview(TLObject tLObject) {
        String H;
        String str;
        String str2;
        if (tLObject instanceof TLRPC.User) {
            str2 = o10.q((TLRPC.User) tLObject);
            str = gd.M0(2131747633, null);
        } else {
            if (!(tLObject instanceof TLRPC.Chat)) {
                return;
            }
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            String str3 = chat.title;
            if (org.telegram.messenger.v3.V(chat)) {
                int i7 = chat.participants_count;
                H = i7 > 1 ? gd.H(',', "Subscribers", i7) : gd.M0(2131751379, null);
            } else {
                int i10 = chat.participants_count;
                H = i10 > 1 ? gd.H(',', "Members", i10) : gd.M0(2131754876, null).toLowerCase();
            }
            str = H;
            str2 = str3;
        }
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
        b9Var.l(tLObject);
        this.M.f(tLObject, b9Var);
        this.r[2].setText(str2);
        this.E[2].setText(str);
        n();
        d(this.b0);
    }

    public void k(int i7) {
    }
}
