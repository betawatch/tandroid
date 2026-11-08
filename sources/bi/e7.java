package bi;

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
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.c61;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public class e7 extends FrameLayout {
    public final int[] A0;
    public final int[] B0;
    public final int[] C0;
    public final w70[] D;
    public final LinearLayout.LayoutParams[] E;
    public final zh.j0[] F;
    public final TextPaint G;
    public final c61 H;
    public final x5[] I;
    public final x5 J;
    public final FrameLayout K;
    public final org.telegram.ui.Components.l9 L;
    public final d6 M;
    public boolean N;
    public final TextView O;
    public final ImageView P;
    public final ImageView Q;
    public final ImageView R;
    public boolean S;
    public Boolean T;
    public final View.OnClickListener U;
    public final View.OnClickListener V;
    public final View.OnClickListener W;
    public final org.telegram.ui.ActionBar.f6 a;
    public g6 a0;
    public final FrameLayout b;
    public final TL_stars.starGiftAttributeBackdrop[] b0;
    public final v6 c;
    public a c0;
    public final org.telegram.ui.Components.l9[] d;
    public a d0;
    public final TL_stars.starGiftAttributeModel[] e;
    public a e0;
    public final LinearLayout[] f;
    public boolean f0;
    public boolean g0;
    public final FrameLayout.LayoutParams[] h;
    public float h0;
    public float i0;
    public float j0;
    public ValueAnimator k0;
    public final a3.f l0;
    public final Paint[] m0;
    public final zh.z0 n;
    public final RadialGradient[] n0;
    public final Matrix[] o0;
    public RadialGradient p0;
    public final Matrix q0;
    public final w70[] r;
    public final Paint r0;
    public final w70 s;
    public final TL_stars.starGiftAttributePattern[] s0;
    public final org.telegram.ui.Components.g5[] t0;
    public int u0;
    public float v0;
    public final TextView w;
    public float w0;
    public int x;
    public ValueAnimator x0;
    public final FrameLayout y;
    public final RectF y0;
    public ud z0;

    public e7(Context context, org.telegram.ui.ActionBar.f6 f6Var, Runnable runnable, View.OnClickListener onClickListener, y1 y1Var, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, View.OnClickListener onClickListener4, View.OnClickListener onClickListener5, View.OnClickListener onClickListener6) {
        super(context);
        float f10;
        float f11;
        float f12;
        this.d = new org.telegram.ui.Components.l9[5];
        this.e = new TL_stars.starGiftAttributeModel[3];
        this.f = new LinearLayout[5];
        this.h = new FrameLayout.LayoutParams[5];
        this.r = new w70[5];
        this.D = new w70[5];
        this.E = new LinearLayout.LayoutParams[5];
        this.F = new zh.j0[5];
        this.a0 = new g6(0, 0);
        this.b0 = new TL_stars.starGiftAttributeBackdrop[3];
        this.l0 = new a3.f(this, 28);
        this.m0 = new Paint[3];
        this.n0 = new RadialGradient[3];
        this.o0 = new Matrix[3];
        this.q0 = new Matrix();
        this.r0 = new Paint(1);
        int i7 = 2;
        this.s0 = new TL_stars.starGiftAttributePattern[2];
        this.t0 = new org.telegram.ui.Components.g5[2];
        int i10 = 0;
        while (true) {
            Paint[] paintArr = this.m0;
            if (i10 >= paintArr.length) {
                break;
            }
            paintArr[i10] = new Paint(1);
            i10++;
        }
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.g5[] g5VarArr = this.t0;
            f10 = 28.0f;
            if (i11 >= g5VarArr.length) {
                break;
            }
            g5VarArr[i11] = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(28.0f), this);
            i11++;
        }
        this.w0 = 1.0f;
        this.y0 = new RectF();
        this.A0 = new int[12];
        this.B0 = new int[12];
        this.C0 = new int[12];
        this.a = f6Var;
        this.U = onClickListener4;
        this.V = onClickListener5;
        this.W = onClickListener6;
        setWillNotDraw(false);
        this.b = new FrameLayout(context);
        int i12 = 0;
        while (true) {
            org.telegram.ui.Components.l9[] l9VarArr = this.d;
            float f13 = 0.0f;
            f11 = f10;
            if (i12 >= l9VarArr.length) {
                break;
            }
            l9VarArr[i12] = new b7(context, 0);
            this.d[i12].setLayerNum(6660);
            if (i12 > 0) {
                this.d[i12].getImageReceiver().s1 = 1;
            }
            this.b.addView(this.d[i12], c8.ha.e(-1, -1, qs.E1));
            org.telegram.ui.Components.l9 l9Var = this.d[i12];
            if (i12 == 0) {
                f13 = 1.0f;
            }
            l9Var.setAlpha(f13);
            i12++;
            f10 = f11;
        }
        w70 w70Var = new w70(context, null);
        this.s = w70Var;
        w70Var.setTextSize(1, 12.0f);
        w70Var.setGravity(17);
        org.telegram.ui.ActionBar.r6.V(w70Var, org.telegram.ui.ActionBar.k6.G6, f6Var);
        org.telegram.ui.ActionBar.r6.H(w70Var, org.telegram.ui.ActionBar.k6.Uc, f6Var);
        w70Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        TextView textView = new TextView(context);
        this.w = textView;
        textView.setOnClickListener(new y6(this, 0));
        c8.ka.b(textView, 0.05f, 1.25f);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        textView.setLinkTextColor(-1);
        textView.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), 0);
        TextView textView2 = new TextView(context);
        this.O = textView2;
        textView2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        textView2.setTextSize(1, 13.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setAlpha(0.0f);
        textView2.setScaleX(0.4f);
        textView2.setScaleY(0.4f);
        textView2.setVisibility(8);
        textView2.setGravity(17);
        c8.ka.a(textView2);
        c61 c61Var = new c61(2, context, this);
        this.H = c61Var;
        c61Var.setOrientation(0);
        this.I = new x5[3];
        int i13 = 0;
        while (true) {
            x5[] x5VarArr = this.I;
            if (i13 >= x5VarArr.length) {
                break;
            }
            x5VarArr[i13] = new x5(context, 1);
            if (i13 == 0) {
                this.I[i13].e(R.drawable.filled_gift_send, org.telegram.messenger.id.M0(2131750434, null), false);
                this.I[i13].setOnClickListener(onClickListener2);
            } else if (i13 == 1) {
                this.I[i13].e(R.drawable.filled_crown_on, org.telegram.messenger.id.M0(2131750426, null), false);
                this.I[i13].setOnClickListener(onClickListener3);
            } else if (i13 == i7) {
                this.I[i13].e(R.drawable.filled_share, org.telegram.messenger.id.M0(2131750439, null), false);
                this.I[i13].setOnClickListener(onClickListener4);
            }
            this.I[i13].setBackground(org.telegram.ui.ActionBar.k6.b0(0, 285212671, 16, 16));
            c8.ka.b(this.I[i13], 0.075f, 1.5f);
            c61 c61Var2 = this.H;
            x5[] x5VarArr2 = this.I;
            c61Var2.addView(x5VarArr2[i13], c8.ha.q(0, 56, 1.0f, qs.E1, 0, 0, i13 != x5VarArr2.length - 1 ? 11 : 0, 0));
            i13++;
            i7 = 2;
        }
        x5 x5Var = new x5(context, 1);
        this.J = x5Var;
        x5Var.e(R.drawable.filled_card_color, org.telegram.messenger.id.M0(2131743112, null), false);
        x5Var.setBackground(org.telegram.ui.ActionBar.k6.b0(0, 285212671, 16, 16));
        c8.ka.b(x5Var, 0.075f, 1.5f);
        x5Var.setVisibility(8);
        this.H.addView(x5Var, 1, c8.ha.q(0, 56, 1.0f, qs.E1, 0, 0, 11, 0));
        this.y = new FrameLayout(context);
        int i14 = 0;
        while (true) {
            LinearLayout[] linearLayoutArr = this.f;
            if (i14 >= linearLayoutArr.length) {
                break;
            }
            linearLayoutArr[i14] = new LinearLayout(context);
            this.f[i14].setOrientation(1);
            if (i14 == 2) {
                FrameLayout frameLayout = new FrameLayout(context);
                this.K = frameLayout;
                this.f[i14].addView(frameLayout, c8.ha.r(-1, qs.a2, qs.E1));
                org.telegram.ui.Components.l9 l9Var2 = new org.telegram.ui.Components.l9(context);
                this.L = l9Var2;
                l9Var2.setRoundRadius(org.telegram.messenger.g0.L(41.0f));
                frameLayout.addView(l9Var2, c8.ha.d(82, 82.0f, 49, 0.0f, 2.0f, 0.0f, 0.0f));
                this.r[i14] = new w70(context, null);
                this.r[i14].setTextColor(-1);
                this.r[i14].setTextSize(1, 20.0f);
                this.r[i14].setTypeface(org.telegram.messenger.g0.o());
                this.r[i14].setSingleLine();
                w70 w70Var2 = this.r[i14];
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                w70Var2.setEllipsize(truncateAt);
                this.r[i14].setGravity(17);
                frameLayout.addView(this.r[i14], c8.ha.d(-1, -2.0f, 49, 16.0f, 95.33f, 16.0f, 0.0f));
                this.D[i14] = new w70(context, null);
                this.D[i14].setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.j5, f6Var));
                this.D[i14].setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.r6.H(this.D[i14], org.telegram.ui.ActionBar.k6.Uc, f6Var);
                this.D[i14].setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                this.D[i14].setDisablePaddingsOffsetY(true);
                this.D[i14].setSingleLine();
                this.D[i14].setGravity(17);
                this.D[i14].setEllipsize(truncateAt);
                frameLayout.addView(this.D[i14], c8.ha.d(-1, -2.0f, 49, 16.0f, 122.0f, 16.0f, 0.0f));
            } else if (i14 == 4) {
                d6 d6Var = new d6(context, f6Var);
                this.M = d6Var;
                this.f[i14].addView(d6Var, c8.ha.o(-1, -2));
                View view = this.f[i14];
                FrameLayout.LayoutParams[] layoutParamsArr = this.h;
                ViewGroup.LayoutParams d = c8.ha.d(-1, -2.0f, qs.E1, 0.0f, 0.0f, 0.0f, 0.0f);
                layoutParamsArr[i14] = d;
                addView(view, d);
                i14++;
            } else {
                this.r[i14] = new w70(context, null);
                if (i14 == 3) {
                    this.r[i14].setTextColor(-1);
                } else {
                    this.r[i14].setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.j5, f6Var));
                }
                this.r[i14].setTextSize(1, 20.0f);
                this.r[i14].setTypeface(org.telegram.messenger.g0.o());
                this.r[i14].setGravity(17);
                this.f[i14].addView(this.r[i14], c8.ha.t(-1, -2, 17, 24, i14 == 3 ? 10 : 0, 24, 0));
                if (i14 == 0) {
                    this.f[i14].addView(this.s, c8.ha.t(-2, -2, 17, 0, 4, 0, 4));
                    this.f[i14].addView(this.w, c8.ha.n(19.33f, -2, 17, 0, 6, 0, 2));
                }
                if (i14 == 0) {
                    this.D[i14] = new w70(context, null);
                    if (i14 == 3) {
                        this.D[i14].setTextColor(org.telegram.ui.ActionBar.k6.r1(0.75f, -1));
                    } else {
                        this.D[i14].setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.j5, f6Var));
                    }
                    this.D[i14].setTextSize(1, 14.0f);
                    this.D[i14].setGravity(17);
                    org.telegram.ui.ActionBar.r6.H(this.D[i14], org.telegram.ui.ActionBar.k6.Uc, f6Var);
                    this.D[i14].setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    this.D[i14].setDisablePaddingsOffsetY(true);
                    this.y.addView(this.D[i14], c8.ha.e(-2, -2, 17));
                    this.y.addView(this.O, c8.ha.a(-2.0f, 20.33f, 17));
                    LinearLayout linearLayout = this.f[i14];
                    FrameLayout frameLayout2 = this.y;
                    LinearLayout.LayoutParams[] layoutParamsArr2 = this.E;
                    LinearLayout.LayoutParams t6 = c8.ha.t(-1, -2, 17, 24, 0, 24, i14 == 3 ? 6 : 0);
                    layoutParamsArr2[i14] = t6;
                    linearLayout.addView(frameLayout2, t6);
                } else {
                    this.D[i14] = new w70(context, null);
                    if (i14 == 3) {
                        this.D[i14].setTextColor(org.telegram.ui.ActionBar.k6.r1(0.75f, -1));
                    } else {
                        this.D[i14].setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.j5, f6Var));
                    }
                    this.D[i14].setTextSize(1, 14.0f);
                    this.D[i14].setGravity(17);
                    org.telegram.ui.ActionBar.r6.H(this.D[i14], org.telegram.ui.ActionBar.k6.Uc, f6Var);
                    this.D[i14].setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    this.D[i14].setDisablePaddingsOffsetY(true);
                    LinearLayout linearLayout2 = this.f[i14];
                    w70 w70Var3 = this.D[i14];
                    LinearLayout.LayoutParams[] layoutParamsArr3 = this.E;
                    LinearLayout.LayoutParams t10 = c8.ha.t(-1, -2, 17, 24, 0, 24, i14 == 3 ? 6 : 0);
                    layoutParamsArr3[i14] = t10;
                    linearLayout2.addView(w70Var3, t10);
                }
                LinearLayout.LayoutParams layoutParams = this.E[i14];
                if (i14 == 3) {
                    f12 = 6.0f;
                } else {
                    f12 = (i14 == 1 ? 7.33f : this.b0[0] == null ? 9.0f : 5.66f) - 4.0f;
                }
                layoutParams.topMargin = org.telegram.messenger.g0.L(f12);
                this.F[i14] = new zh.j0(context);
                this.F[i14].setVisibility(8);
                this.F[i14].setPadding(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(2.0f));
                if (i14 == 0) {
                    this.G = this.F[i14].getTextPaint();
                }
                this.f[i14].addView(this.F[i14], c8.ha.t(-1, -2, 17, 24, 8, 24, 0));
            }
            if (i14 == 0) {
                this.f[i14].addView(this.H, c8.ha.t(-1, -2, 7, 0, 15, 0, 0));
            }
            View view2 = this.f[i14];
            FrameLayout.LayoutParams[] layoutParamsArr4 = this.h;
            ViewGroup.LayoutParams d2 = c8.ha.d(-1, -2.0f, qs.E1, 16.0f, i14 == 2 ? 32.0f : 170.0f, 16.0f, 0.0f);
            layoutParamsArr4[i14] = d2;
            addView(view2, d2);
            i14++;
        }
        addView(this.b, c8.ha.d(qs.q2, 160.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        v6 v6Var = new v6(context);
        this.c = v6Var;
        addView(v6Var, c8.ha.d(-1, 160.0f, 55, 0.0f, 8.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.P = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(f11), 620756991));
        imageView.setImageResource(R.drawable.msg_close);
        c8.ka.a(imageView);
        addView(imageView, c8.ha.d(28, 28.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        imageView.setOnClickListener(new z6(0, runnable));
        imageView.setVisibility(8);
        ImageView imageView2 = new ImageView(context);
        this.Q = imageView2;
        imageView2.setImageResource(R.drawable.filled_forge);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.h0(553648127, 1, -1));
        c8.ka.a(imageView2);
        if (y1Var != null) {
            addView(imageView2, c8.ha.d(42, 42.0f, 53, 0.0f, 5.0f, 47.0f, 0.0f));
            imageView2.setOnClickListener(y1Var);
        }
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.R = imageView3;
        imageView3.setContentDescription(org.telegram.messenger.id.M0(2131754878, null));
        imageView3.setImageResource(R.drawable.media_more);
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(org.telegram.ui.ActionBar.k6.h0(553648127, 1, -1));
        c8.ka.a(imageView3);
        addView(imageView3, c8.ha.d(42, 42.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        imageView3.setOnClickListener(onClickListener);
        imageView3.setVisibility(8);
        zh.z0 z0Var = new zh.z0(context);
        this.n = z0Var;
        z0Var.b(org.telegram.messenger.id.M0(2131749754, null), true);
        zh.b1 b1Var = z0Var.a;
        if (b1Var.w == null) {
            ud udVar = new ud(2, 12);
            b1Var.w = udVar;
            udVar.h = 5.0f;
        }
        Path path = b1Var.f;
        float f14 = b1Var.s;
        b1Var.x = true;
        zh.b1.d(path, f14, true);
        z0Var.setScaleX(1.2f);
        z0Var.setScaleY(1.2f);
        addView(z0Var, c8.ha.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        z0Var.setVisibility(8);
    }

    public final void a() {
        ValueAnimator valueAnimator = this.x0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.x0 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.x0 = ofFloat;
        ofFloat.addUpdateListener(new a7(this, 1));
        this.x0.addListener(new c7(this, 4));
        this.x0.setDuration(320L);
        this.x0.setInterpolator(xq.g);
        this.x0.start();
    }

    public final int b(Canvas canvas, float f10, float f11, float f12, float f13) {
        int i7 = this.u0;
        RadialGradient[] radialGradientArr = this.n0;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.b0;
        Matrix[] matrixArr = this.o0;
        Paint[] paintArr = this.m0;
        int i10 = 0;
        if (i7 != 0) {
            if (this.v0 < 1.0f && stargiftattributebackdropArr[1] != null) {
                paintArr[1].setAlpha((int) (this.a0.a(1) * 255.0f));
                matrixArr[1].reset();
                matrixArr[1].postTranslate(f10, f11);
                radialGradientArr[1].setLocalMatrix(matrixArr[1]);
                canvas.drawRect(0.0f, 0.0f, f12, f13, paintArr[1]);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[1];
                i10 = i0.a.k(i0.a.o(i0.a.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216)), paintArr[1].getAlpha()), 0);
            }
            if (this.v0 <= 0.0f || stargiftattributebackdropArr[2] == null) {
                return i10;
            }
            paintArr[2].setAlpha((int) (this.a0.a(1) * 255.0f * this.v0));
            matrixArr[2].reset();
            matrixArr[2].postTranslate(f10, f11);
            radialGradientArr[2].setLocalMatrix(matrixArr[2]);
            canvas.drawRect(0.0f, 0.0f, f12, f13, paintArr[2]);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[2];
            return i0.a.k(i0.a.o(i0.a.f(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216)), paintArr[2].getAlpha()), i10);
        }
        if (this.v0 > 0.0f && stargiftattributebackdropArr[2] != null) {
            paintArr[2].setAlpha((int) (this.a0.a(1) * 255.0f));
            matrixArr[2].reset();
            matrixArr[2].postTranslate(f10, f11);
            radialGradientArr[2].setLocalMatrix(matrixArr[2]);
            canvas.drawRect(0.0f, 0.0f, f12, f13, paintArr[2]);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[2];
            i10 = i0.a.k(i0.a.o(i0.a.f(0.25f, stargiftattributebackdrop3.edge_color | (-16777216), stargiftattributebackdrop3.pattern_color | (-16777216)), paintArr[2].getAlpha()), 0);
        }
        if (this.v0 >= 1.0f || stargiftattributebackdropArr[1] == null) {
            return i10;
        }
        paintArr[1].setAlpha((int) ((1.0f - this.v0) * this.a0.a(1) * 255.0f));
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
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.b0;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[1];
        int i7 = stargiftattributebackdrop == null ? 0 : stargiftattributebackdrop.pattern_color | (-16777216);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[2];
        int f14 = i0.a.f(this.v0, i7, stargiftattributebackdrop2 != null ? stargiftattributebackdrop2.pattern_color | (-16777216) : 0);
        org.telegram.ui.Components.g5[] g5VarArr = this.t0;
        g5VarArr[1].k(Integer.valueOf(f14));
        i1.a(canvas, 0, g5VarArr[1], f12, f13, this.a0.a(1), this.w0);
        canvas.restore();
    }

    public void d(g6 g6Var) {
        View[] viewArr;
        w70[] w70VarArr;
        float a10;
        int i7;
        boolean z9;
        this.a0 = g6Var;
        int i10 = 0;
        while (true) {
            viewArr = this.f;
            if (i10 >= viewArr.length) {
                break;
            }
            float a11 = g6Var.a(i10);
            viewArr[i10].setAlpha(a11);
            viewArr[i10].setVisibility(a11 > 0.0f ? 0 : 4);
            i10++;
        }
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.b0;
        float max = Math.max(stargiftattributebackdropArr[0] != null ? g6Var.a(2) : 0.0f, stargiftattributebackdropArr[1] != null ? g6Var.a(1) : 0.0f);
        ImageView imageView = this.P;
        imageView.setAlpha(max);
        imageView.setVisibility(((stargiftattributebackdropArr[0] == null || g6Var.c != 2) && (stargiftattributebackdropArr[1] == null || g6Var.c != 1)) ? 8 : 0);
        boolean z10 = stargiftattributebackdropArr[0] != null || this.S;
        float a12 = g6Var.a(0);
        int i11 = g6Var.c;
        float V1 = org.telegram.messenger.g0.V1(false, z10, a12);
        ImageView imageView2 = this.R;
        imageView2.setAlpha(V1);
        imageView2.setVisibility((z10 && i11 == 0) ? 0 : 8);
        boolean z11 = stargiftattributebackdropArr[0] != null;
        Boolean bool = this.T;
        int i12 = -1;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        if (bool == null || bool.booleanValue() != z11) {
            this.T = Boolean.valueOf(z11);
            if (z11) {
                imageView2.clearColorFilter();
                imageView2.setBackground(org.telegram.ui.ActionBar.k6.h0(553648127, 1, -1));
            } else {
                org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.J5, f6Var, PorterDuff.Mode.SRC_IN);
                int i13 = org.telegram.ui.ActionBar.k6.i6;
                org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i13, f6Var), 1, -1);
                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i13);
                imageView2.setBackground(h02);
                org.telegram.ui.ActionBar.r6.k(imageView2, h02, null, N, f6Var);
            }
        }
        if (!this.g0) {
            float V12 = org.telegram.messenger.g0.V1(false, this.N, g6Var.a(0));
            TextView textView = this.O;
            textView.setAlpha(V12);
            textView.setScaleX(org.telegram.messenger.g0.T1(0.4f, this.N ? 1.0f : 0.4f, g6Var.a(0)));
            textView.setScaleY(org.telegram.messenger.g0.T1(0.4f, this.N ? 1.0f : 0.4f, g6Var.a(0)));
            textView.setVisibility((this.N && i11 == 0) ? 0 : 4);
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.j5, f6Var);
        int i14 = 0;
        while (true) {
            w70VarArr = this.D;
            if (i14 >= 2) {
                break;
            }
            this.r[i14].setTextColor(stargiftattributebackdropArr[Math.min(1, i14)] == null ? w02 : i12);
            w70 w70Var = w70VarArr[i14];
            if (i14 == 0 || i14 == 2) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[i14];
                i7 = stargiftattributebackdrop == null ? w02 : stargiftattributebackdrop.text_color | (-16777216);
            } else {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[1];
                int i15 = stargiftattributebackdrop2 == null ? w02 : stargiftattributebackdrop2.text_color | (-16777216);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[2];
                i7 = i0.a.f(this.v0, i15, stargiftattributebackdrop3 == null ? w02 : stargiftattributebackdrop3.text_color | (-16777216));
            }
            w70Var.setTextColor(i7);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[i14];
            FrameLayout.LayoutParams[] layoutParamsArr = this.h;
            if (stargiftattributebackdrop4 != null) {
                z9 = (org.telegram.messenger.g0.L(184.0f) == layoutParamsArr[i14].topMargin && viewArr[i14].getPaddingBottom() == org.telegram.messenger.g0.L(18.0f)) ? false : true;
                if (z9) {
                    viewArr[i14].setPadding(0, 0, 0, org.telegram.messenger.g0.L(18.0f));
                    layoutParamsArr[i14].topMargin = org.telegram.messenger.g0.L(184.0f);
                }
            } else {
                z9 = (org.telegram.messenger.g0.L(170.0f) == layoutParamsArr[i14].topMargin && viewArr[i14].getPaddingBottom() == org.telegram.messenger.g0.L(3.0f)) ? false : true;
                if (z9) {
                    viewArr[i14].setPadding(0, 0, 0, org.telegram.messenger.g0.L(3.0f));
                    layoutParamsArr[i14].topMargin = org.telegram.messenger.g0.L(170.0f);
                }
            }
            LinearLayout.LayoutParams[] layoutParamsArr2 = this.E;
            layoutParamsArr2[i14].topMargin = org.telegram.messenger.g0.L((i14 == 1 ? 7.33f : stargiftattributebackdropArr[0] == null ? 9.0f : 5.66f) - 4.0f);
            if (z9) {
                viewArr[i14].setLayoutParams(layoutParamsArr[i14]);
                if (i14 == 0) {
                    this.y.setLayoutParams(layoutParamsArr2[i14]);
                } else {
                    w70VarArr[i14].setLayoutParams(layoutParamsArr2[i14]);
                }
            }
            i14++;
            i12 = -1;
        }
        int L = org.telegram.messenger.g0.L(24.0f);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop5 = stargiftattributebackdropArr[0];
        this.w.setBackground(org.telegram.ui.ActionBar.k6.d0(L, stargiftattributebackdrop5 == null ? 553648127 : i0.a.f(0.25f, stargiftattributebackdrop5.edge_color | (-16777216), stargiftattributebackdrop5.pattern_color | (-16777216))));
        w70 w70Var2 = w70VarArr[2];
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop6 = stargiftattributebackdropArr[0];
        if (stargiftattributebackdrop6 != null) {
            w02 = stargiftattributebackdrop6.text_color | (-16777216);
        }
        w70Var2.setTextColor(w02);
        org.telegram.ui.Components.l9[] l9VarArr = this.d;
        org.telegram.ui.Components.l9 l9Var = l9VarArr[0];
        g6 g6Var2 = this.a0;
        l9Var.setAlpha(Math.max((g6Var2.b(0) && g6Var2.b(2)) ? 1.0f : Math.max(g6Var2.a(0), g6Var2.a(2)), this.a0.a(3)));
        l9VarArr[1].setAlpha((1.0f - this.v0) * g6Var.a(1));
        l9VarArr[2].setAlpha(g6Var.a(1) * this.v0);
        float T1 = org.telegram.messenger.g0.T1(1.0f, this.j0, g6Var.a(2));
        FrameLayout frameLayout = this.b;
        frameLayout.setScaleX(T1);
        frameLayout.setScaleY(org.telegram.messenger.g0.T1(1.0f, this.j0, g6Var.a(2)));
        frameLayout.setTranslationX(g6Var.a(2) * this.h0);
        frameLayout.setTranslationY((g6Var.a(2) * this.i0) + (g6Var.a(1) * org.telegram.messenger.g0.L(16.0f)));
        View view = viewArr[2];
        int i16 = g6Var.b;
        if (i16 == 2 && i11 == 2) {
            a10 = 0.0f;
        } else {
            if (i16 != 2) {
                i11 = i16;
            }
            a10 = (1.0f - g6Var.a(2)) * (-(viewArr[i11].getMeasuredHeight() - viewArr[2].getMeasuredHeight()));
        }
        view.setTranslationY(a10);
        int i17 = (this.f0 && this.a0.b(0)) ? 0 : 8;
        zh.z0 z0Var = this.n;
        z0Var.setVisibility(i17);
        z0Var.setAlpha(this.a0.a(0));
        int i18 = g6Var.a(4) <= 0.0f ? 8 : 0;
        d6 d6Var = this.M;
        d6Var.setVisibility(i18);
        d6Var.setAlpha(g6Var.a(4));
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
        int i7;
        int[] iArr3;
        e7 e7Var;
        Canvas canvas2;
        v6 v6Var;
        float realHeight = getRealHeight();
        canvas.save();
        float f14 = 0.0f;
        canvas.clipRect(0.0f, 0.0f, getWidth(), realHeight);
        float f15 = 2.0f;
        float width = getWidth() / 2.0f;
        float L = org.telegram.messenger.g0.L(80.0f) + org.telegram.messenger.g0.W1(this.a0.a(1), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(24.0f));
        g6 g6Var = this.a0;
        float max = ((g6Var.b(0) && g6Var.b(2)) || (g6Var.b(2) && g6Var.b(3)) || (g6Var.b(3) && g6Var.b(0))) ? 1.0f : Math.max(g6Var.a(0), Math.max(g6Var.a(2), g6Var.a(3)));
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr2 = this.b0;
        if (max <= 0.0f || stargiftattributebackdropArr2[0] == null) {
            stargiftattributebackdropArr = stargiftattributebackdropArr2;
        } else {
            if (this.p0 == null || this.a0.a(2) < 1.0f) {
                Paint[] paintArr = this.m0;
                paintArr[0].setAlpha((int) (max * 255.0f));
                Matrix[] matrixArr = this.o0;
                matrixArr[0].reset();
                matrixArr[0].postTranslate(width, L);
                this.n0[0].setLocalMatrix(matrixArr[0]);
                stargiftattributebackdropArr = stargiftattributebackdropArr2;
                canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, paintArr[0]);
            } else {
                stargiftattributebackdropArr = stargiftattributebackdropArr2;
            }
            if (this.p0 != null && this.a0.a(2) > 0.0f) {
                int a10 = (int) (this.a0.a(2) * 255.0f);
                Paint paint = this.r0;
                paint.setAlpha(a10);
                Matrix matrix = this.q0;
                matrix.reset();
                matrix.postTranslate(getWidth() / 2.0f, 0.4f * realHeight);
                this.p0.setLocalMatrix(matrix);
                canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, paint);
            }
        }
        if (this.a0.a(1) > 0.0f) {
            f10 = width;
            f11 = L;
            k(b(canvas, f10, f11, getWidth(), realHeight));
        } else {
            f10 = width;
            f11 = L;
        }
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[0];
        int[] iArr4 = this.C0;
        int[] iArr5 = this.B0;
        int[] iArr6 = this.A0;
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
        v6 v6Var2 = this.c;
        if (v6Var2.s == null && v6Var2.w == null && v6Var2.x == null) {
            e7Var = this;
            f13 = f10;
            f12 = f11;
            iArr = iArr5;
            iArr2 = iArr6;
            i7 = 1;
            v6Var = v6Var2;
            iArr3 = iArr4;
            canvas2 = canvas;
        } else {
            float width2 = getWidth();
            float f18 = f10;
            p6 p6Var = v6Var2.s;
            float f19 = f11;
            float f20 = v6Var2.y;
            int[] iArr7 = this.B0;
            int[] iArr8 = this.A0;
            int[] iArr9 = this.C0;
            f12 = f19;
            iArr = iArr5;
            iArr2 = iArr6;
            f13 = f18;
            i7 = 1;
            iArr3 = iArr4;
            e7Var = this;
            canvas2 = canvas;
            v6Var2.a(canvas2, p6Var, f20, width2, realHeight, iArr7, iArr8, iArr9);
            v6Var2.a(canvas2, v6Var2.w, v6Var2.D, width2, realHeight, iArr7, iArr8, iArr9);
            v6Var2.a(canvas2, v6Var2.x, v6Var2.E, width2, realHeight, iArr7, iArr8, iArr9);
            v6Var = v6Var2;
            e7Var.invalidate();
        }
        if (max > 0.0f && stargiftattributebackdropArr[0] != null) {
            int i11 = iArr3[iArr3.length / 2];
            g6 g6Var2 = e7Var.a0;
            float max2 = (g6Var2.b(0) && g6Var2.b(3)) ? 1.0f : Math.max(g6Var2.a(0), g6Var2.a(3));
            org.telegram.ui.Components.g5[] g5VarArr = e7Var.t0;
            if (max2 > f16) {
                canvas2.save();
                canvas2.translate(f13, f12);
                g5VarArr[0].k(Integer.valueOf(i11));
                i1.a(canvas, 0, g5VarArr[0], e7Var.getWidth(), realHeight, max2, 1.0f);
                realHeight = realHeight;
                canvas.restore();
            }
            if (e7Var.a0.a(2) > f16) {
                canvas.save();
                g5VarArr[0].k(Integer.valueOf(i11));
                float f21 = realHeight;
                RectF rectF = org.telegram.messenger.g0.P;
                LinearLayout[] linearLayoutArr = e7Var.f;
                float x10 = linearLayoutArr[2].getX();
                FrameLayout frameLayout = e7Var.K;
                float x11 = frameLayout.getX() + x10;
                org.telegram.ui.Components.l9 l9Var = e7Var.L;
                rectF.set(l9Var.getX() + x11, l9Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY(), l9Var.getX() + frameLayout.getX() + linearLayoutArr[2].getX() + l9Var.getWidth(), l9Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY() + l9Var.getHeight());
                i1.c(canvas, g5VarArr[0], e7Var.getWidth(), f21 * 0.7f, 1.0f, rectF, e7Var.a0.a(2));
                canvas2 = canvas;
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            int i12 = 0;
            while (true) {
                x5[] x5VarArr = e7Var.I;
                if (i12 > x5VarArr.length) {
                    break;
                }
                x5 x5Var = i12 < x5VarArr.length ? x5VarArr[i12] : e7Var.J;
                int[] iArr10 = iArr2;
                if (org.telegram.ui.ActionBar.k6.H1(x5Var.getBackground(), iArr10[Utilities.j(Math.round((((x5Var.getWidth() / f17) + x5Var.getX()) / e7Var.getWidth()) * (iArr10.length - 1)), iArr10.length - 1, 0)], false)) {
                    x5Var.invalidate();
                }
                i12++;
                iArr2 = iArr10;
            }
            int[] iArr11 = iArr;
            int[] iArr12 = iArr2;
            int i13 = iArr11[iArr11.length / 2];
            int i14 = iArr12[iArr12.length / 2];
            TextView textView = e7Var.w;
            if (textView != null && e7Var.x != i13) {
                e7Var.x = i13;
                textView.setTextColor(i13);
                org.telegram.ui.ActionBar.k6.H1(textView.getBackground(), i14, false);
            }
            if (v6Var.s != null || v6Var.w != null || v6Var.x != null) {
                e7Var.D[0].setTextColor(i13);
            }
            if (e7Var.a0.a(2) > f16) {
                if (e7Var.z0 == null) {
                    e7Var.z0 = new ud(i7, 12);
                }
                FrameLayout frameLayout2 = e7Var.b;
                float measuredWidth = (frameLayout2.getMeasuredWidth() / f17) + frameLayout2.getX();
                float scaleX = (frameLayout2.getScaleX() * frameLayout2.getMeasuredWidth()) / f17;
                float measuredHeight = (frameLayout2.getMeasuredHeight() / f17) + frameLayout2.getY();
                float scaleY = (frameLayout2.getScaleY() * frameLayout2.getMeasuredHeight()) / f17;
                float f22 = measuredHeight + scaleY;
                RectF rectF2 = e7Var.y0;
                rectF2.set(measuredWidth - scaleX, measuredHeight - scaleY, measuredWidth + scaleX, f22);
                e7Var.z0.g(rectF2);
                e7Var.z0.d();
                e7Var.z0.a(canvas2, org.telegram.ui.ActionBar.k6.r1(e7Var.a0.a(2), -1));
                e7Var.invalidate();
            }
        }
        if (e7Var.a0.a(1) > f16) {
            e7Var.c(canvas2, f13, f12, e7Var.getWidth(), e7Var.getRealHeight());
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
        RadialGradient[] radialGradientArr = this.n0;
        radialGradientArr[i7] = radialGradient;
        if (i7 == 0) {
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(168.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, tileMode);
            this.p0 = radialGradient2;
            this.r0.setShader(radialGradient2);
        }
        Matrix[] matrixArr = this.o0;
        if (matrixArr[i7] == null) {
            matrixArr[i7] = new Matrix();
        }
        this.m0[i7].setShader(radialGradientArr[i7]);
    }

    public final void f(TL_stars.StarGift starGift, boolean z9, boolean z10, boolean z11) {
        this.N = false;
        boolean z12 = z9 || z10;
        boolean z13 = starGift instanceof TL_stars.TL_starGiftUnique;
        c61 c61Var = this.H;
        w70[] w70VarArr = this.D;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.b0;
        if (z13) {
            stargiftattributebackdropArr[0] = (TL_stars.starGiftAttributeBackdrop) ea.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            g(0, (TL_stars.starGiftAttributePattern) ea.l(starGift.attributes, TL_stars.starGiftAttributePattern.class), false);
            w70VarArr[0].setTextSize(1, 13.0f);
            c61Var.setVisibility(z12 ? 0 : 8);
            x5[] x5VarArr = this.I;
            x5VarArr[2].setVisibility(0);
            if (z12) {
                x5VarArr[1].e(z11 ? R.drawable.filled_crown_off : R.drawable.filled_crown_on, org.telegram.messenger.id.M0(z11 ? 2131750423 : 2131750426, null), false);
            }
            float f10 = 1.0f;
            if (starGift.resell_amount != null) {
                this.N = true;
                boolean z14 = starGift.resale_ton_only;
                cg.b bVar = cg.b.b;
                cg.a resellAmount = starGift.getResellAmount(z14 ? bVar : cg.b.a);
                CharSequence V = org.telegram.messenger.id.V(null, null, 2131749682, dd.V0("⭐️ " + ((Object) dd.M0(resellAmount.o(), 1.0f, ',')), resellAmount.a == bVar), Float.valueOf(0.9f));
                TextView textView = this.O;
                textView.setText(V);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[0];
                textView.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(12.0f), i0.a.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216))));
                if (k7.K1(p10.s0, org.telegram.messenger.m5.o(starGift.owner_id))) {
                    textView.setOnClickListener(new y6(this, 1));
                    c8.ka.a(textView);
                } else {
                    textView.setOnClickListener(null);
                    textView.setStateListAnimator(null);
                }
            }
            if (z9) {
                x5VarArr[0].setAlpha(1.0f);
                x5VarArr[0].e(R.drawable.filled_gift_send, org.telegram.messenger.id.M0(2131750434, null), false);
            } else {
                x5VarArr[0].setAlpha(0.5f);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("L ");
                spannableStringBuilder.setSpan(new wp(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.M0(2131750434, null));
                x5VarArr[0].e(R.drawable.filled_gift_send, spannableStringBuilder, false);
            }
            x5 x5Var = x5VarArr[1];
            if (!z9 && !z10) {
                f10 = 0.5f;
            }
            x5Var.setAlpha(f10);
            if (z9) {
                ArrayList<TL_stars.StarsAmount> arrayList = starGift.resell_amount;
                View.OnClickListener onClickListener = this.V;
                if (arrayList != null) {
                    x5VarArr[2].e(R.drawable.filled_gift_sell_off, org.telegram.messenger.id.M0(2131750433, null), false);
                    x5VarArr[2].setOnClickListener(onClickListener);
                } else {
                    x5VarArr[2].e(R.drawable.filled_gift_sell_on, org.telegram.messenger.id.M0(2131750447, null), false);
                    x5VarArr[2].setOnClickListener(onClickListener);
                }
            } else {
                x5VarArr[2].e(R.drawable.filled_share, org.telegram.messenger.id.M0(2131750439, null), false);
                x5VarArr[2].setOnClickListener(this.U);
            }
            this.f0 = starGift.crafted;
            this.n.a.e(stargiftattributebackdropArr[0], false, true);
        } else {
            stargiftattributebackdropArr[0] = null;
            w70VarArr[0].setTextSize(1, 14.0f);
            this.f0 = false;
            c61Var.setVisibility(8);
        }
        e(0, stargiftattributebackdropArr[0]);
        dd.d1(this.d[0].getImageReceiver(), starGift, qs.q2);
        this.e[0] = (TL_stars.starGiftAttributeModel) ea.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
        d(this.a0);
    }

    public final void g(int i7, TL_stars.starGiftAttributePattern stargiftattributepattern, boolean z9) {
        if (stargiftattributepattern != null) {
            TL_stars.starGiftAttributePattern[] stargiftattributepatternArr = this.s0;
            if (stargiftattributepatternArr[i7] == stargiftattributepattern) {
                return;
            }
            stargiftattributepatternArr[i7] = stargiftattributepattern;
            this.t0[i7].i(stargiftattributepattern.document, z9);
        }
    }

    public int getFinalHeight() {
        int L;
        int measuredHeight;
        boolean d = this.a0.d(0);
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.b0;
        LinearLayout[] linearLayoutArr = this.f;
        if (d) {
            return linearLayoutArr[0].getMeasuredHeight() + org.telegram.messenger.g0.L(160.0f) + org.telegram.messenger.g0.L(stargiftattributebackdropArr[0] != null ? 24.0f : 10.0f);
        }
        if (this.a0.d(1)) {
            return linearLayoutArr[1].getMeasuredHeight() + org.telegram.messenger.g0.L(160.0f) + org.telegram.messenger.g0.L(stargiftattributebackdropArr[1] != null ? 24.0f : 10.0f);
        }
        if (this.a0.d(2)) {
            L = org.telegram.messenger.g0.L(64.0f);
            measuredHeight = linearLayoutArr[2].getMeasuredHeight();
        } else {
            if (!this.a0.d(3)) {
                if (!this.a0.d(4)) {
                    return 0;
                }
                d6 d6Var = this.M;
                return d6Var.getMeasuredHeight() > 0 ? d6Var.getMeasuredHeight() : org.telegram.messenger.g0.L(550.0f);
            }
            L = org.telegram.messenger.g0.L(160.0f);
            measuredHeight = linearLayoutArr[3].getMeasuredHeight();
        }
        return measuredHeight + L;
    }

    public float getRealHeight() {
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.b0;
        int L = org.telegram.messenger.g0.L(160.0f) + org.telegram.messenger.g0.L(stargiftattributebackdropArr[0] != null ? 24.0f : 10.0f);
        LinearLayout[] linearLayoutArr = this.f;
        return (this.a0.a(4) * (this.M.getMeasuredHeight() > 0 ? r1.getMeasuredHeight() : org.telegram.messenger.g0.L(550.0f))) + (this.a0.a(3) * (linearLayoutArr[3].getMeasuredHeight() + org.telegram.messenger.g0.L(160.0f) + org.telegram.messenger.g0.L(stargiftattributebackdropArr[0] != null ? 24.0f : 10.0f))) + (this.a0.a(2) * (linearLayoutArr[2].getMeasuredHeight() + org.telegram.messenger.g0.L(64.0f))) + (this.a0.a(1) * (linearLayoutArr[1].getMeasuredHeight() + org.telegram.messenger.g0.L(160.0f) + org.telegram.messenger.g0.L(stargiftattributebackdropArr[1] != null ? 24.0f : 10.0f))) + (this.a0.a(0) * (linearLayoutArr[0].getMeasuredHeight() + L)) + 0.0f;
    }

    public TL_stars.starGiftAttributeBackdrop getUpgradeBackdropAttribute() {
        float f10 = this.v0;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.b0;
        return f10 > 0.5f ? stargiftattributebackdropArr[2] : stargiftattributebackdropArr[1];
    }

    public org.telegram.ui.Components.l9 getUpgradeImageView() {
        float f10 = this.v0;
        org.telegram.ui.Components.l9[] l9VarArr = this.d;
        return f10 > 0.5f ? l9VarArr[2] : l9VarArr[1];
    }

    public TL_stars.starGiftAttributeModel getUpgradeImageViewAttribute() {
        float f10 = this.v0;
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
        return f10 > 0.5f ? stargiftattributemodelArr[2] : stargiftattributemodelArr[1];
    }

    public TL_stars.starGiftAttributePattern getUpgradePatternAttribute() {
        return this.s0[1];
    }

    public final void h(int i7, CharSequence charSequence, CharSequence charSequence2, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence3, TLObject tLObject, Spannable spannable) {
        this.r[i7].setText(charSequence);
        FrameLayout frameLayout = this.y;
        w70[] w70VarArr = this.D;
        w70 w70Var = this.s;
        TextView textView = this.w;
        if (i7 == 0 && !TextUtils.isEmpty(spannableStringBuilder)) {
            textView.setText(spannableStringBuilder);
            textView.setVisibility(0);
            w70Var.setVisibility(8);
            if (i7 == 0) {
                frameLayout.setVisibility(8);
            } else {
                w70VarArr[i7].setVisibility(8);
            }
        } else if (i7 != 0 || TextUtils.isEmpty(charSequence3)) {
            w70VarArr[i7].setText(charSequence2);
            if (i7 == 0) {
                frameLayout.setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
            } else {
                w70VarArr[i7].setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
            }
            w70Var.setVisibility(8);
            textView.setVisibility(8);
        } else {
            w70Var.setText(charSequence3);
            w70Var.setVisibility(0);
            textView.setVisibility(8);
            if (i7 == 0) {
                frameLayout.setVisibility(8);
            } else {
                w70VarArr[i7].setVisibility(8);
            }
        }
        zh.j0[] j0VarArr = this.F;
        zh.j0 j0Var = j0VarArr[i7];
        if (j0Var != null) {
            j0Var.setVisibility(TextUtils.isEmpty(spannable) ? 8 : 0);
            j0VarArr[i7].setUser(tLObject);
            j0VarArr[i7].setMessage(spannable);
        }
    }

    public final void i(int i7, String str, CharSequence charSequence, SpannableStringBuilder spannableStringBuilder) {
        h(i7, str, charSequence, null, spannableStringBuilder, null, null);
    }

    public final void j(View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, boolean z9) {
        c61 c61Var = this.H;
        c61Var.setVisibility(0);
        x5[] x5VarArr = this.I;
        x5VarArr[0].setAlpha(1.0f);
        x5VarArr[0].e(R.drawable.filled_gift_send, org.telegram.messenger.id.M0(2131750434, null), false);
        x5VarArr[0].setOnClickListener(onClickListener);
        int i7 = onClickListener2 != null ? 0 : 8;
        x5 x5Var = this.J;
        x5Var.setVisibility(i7);
        x5Var.setOnClickListener(onClickListener2);
        x5VarArr[1].e(R.drawable.filled_crown_on, org.telegram.messenger.id.M0(2131750426, null), false);
        x5VarArr[1].setOnClickListener(onClickListener3);
        ((LinearLayout.LayoutParams) x5VarArr[1].getLayoutParams()).rightMargin = 0;
        setWalletDisplayed(z9);
        x5VarArr[2].setVisibility(8);
        c61Var.requestLayout();
    }

    public final void l() {
        w70[] w70VarArr;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr;
        w70 w70Var;
        int i7;
        w70[] w70VarArr2 = this.r;
        if (w70VarArr2 == null || (w70VarArr = this.D) == null || (stargiftattributebackdropArr = this.b0) == null) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.j5, this.a);
        for (int i10 = 0; i10 < 2; i10++) {
            w70 w70Var2 = w70VarArr2[i10];
            if (w70Var2 != null && w70VarArr[i10] != null) {
                w70Var2.setTextColor(stargiftattributebackdropArr[Math.min(1, i10)] == null ? w02 : -1);
                w70 w70Var3 = w70VarArr[i10];
                if (i10 == 0 || i10 == 2) {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[i10];
                    i7 = stargiftattributebackdrop == null ? w02 : (-16777216) | stargiftattributebackdrop.text_color;
                } else {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[1];
                    int i11 = stargiftattributebackdrop2 == null ? w02 : stargiftattributebackdrop2.text_color | (-16777216);
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[2];
                    i7 = i0.a.f(this.v0, i11, stargiftattributebackdrop3 == null ? w02 : (-16777216) | stargiftattributebackdrop3.text_color);
                }
                w70Var3.setTextColor(i7);
            }
        }
        if (w70VarArr.length <= 2 || (w70Var = w70VarArr[2]) == null) {
            return;
        }
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[0];
        if (stargiftattributebackdrop4 != null) {
            w02 = stargiftattributebackdrop4.text_color | (-16777216);
        }
        w70Var.setTextColor(w02);
    }

    public final void m() {
        this.j0 = org.telegram.messenger.g0.N(33.33f) / org.telegram.messenger.g0.N(160.0f);
        float f10 = -this.b.getLeft();
        w70[] w70VarArr = this.r;
        this.h0 = ((((Math.min(w70VarArr[2].getPaint().measureText(w70VarArr[2].getText().toString()), w70VarArr[2].getWidth()) + w70VarArr[2].getWidth()) / 2.0f) + (w70VarArr[2].getX() + f10)) + org.telegram.messenger.g0.L(24.0f)) - (org.telegram.messenger.g0.L(126.67f) / 2.0f);
        this.i0 = (org.telegram.messenger.g0.L(124.0f) + (-r0.getTop())) - (org.telegram.messenger.g0.L(126.67f) / 2.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.g5[] g5VarArr = this.t0;
        g5VarArr[0].a();
        g5VarArr[1].a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.g5[] g5VarArr = this.t0;
        g5VarArr[0].b();
        g5VarArr[1].b();
        org.telegram.messenger.g0.r(this.l0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        if (this.a0.b(2)) {
            m();
            d(this.a0);
        }
    }

    public void setPreviewAttributes(r1 r1Var) {
        g6 g6Var = this.a0;
        if (g6Var != null && g6Var.c == 1 && isAttachedToWindow()) {
            org.telegram.messenger.g0.r(this.l0);
            ValueAnimator valueAnimator = this.k0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.k0 = null;
            }
            int i7 = 1 - this.u0;
            this.u0 = i7;
            org.telegram.ui.Components.l9[] l9VarArr = this.d;
            zg0 B = l9VarArr[2 - i7].getImageReceiver().B();
            zg0 B2 = l9VarArr[this.u0 + 1].getImageReceiver().B();
            if (B2 != null && B != null) {
                B2.T(false, B.t());
            }
            int i10 = this.u0 + 1;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = r1Var.a;
            this.b0[i10] = stargiftattributebackdrop;
            e(i10, stargiftattributebackdrop);
            g(1, r1Var.b, true);
            int i11 = this.u0 + 1;
            TL_stars.starGiftAttributeModel stargiftattributemodel = r1Var.c;
            TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
            stargiftattributemodelArr[i11] = stargiftattributemodel;
            dd.c1(l9VarArr[i11].getImageReceiver(), stargiftattributemodelArr[this.u0 + 1].document, qs.q2);
            a();
            float f10 = this.u0;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f10, f10);
            this.k0 = ofFloat;
            ofFloat.addUpdateListener(new a7(this, 0));
            this.k0.addListener(new c7(this, 3));
            this.k0.setDuration(320L);
            this.k0.setInterpolator(xq.h);
            this.k0.start();
        }
    }

    public void setPreviewingAttributes(ArrayList<TL_stars.StarGiftAttribute> arrayList) {
        this.c0 = new a(ea.m(arrayList, TL_stars.starGiftAttributeModel.class));
        this.d0 = new a(ea.m(arrayList, TL_stars.starGiftAttributePattern.class));
        this.e0 = new a(ea.m(arrayList, TL_stars.starGiftAttributeBackdrop.class));
        this.D[1].setTextSize(1, 14.0f);
        this.H.setVisibility(8);
        this.v0 = 0.0f;
        this.u0 = 0;
        g(1, (TL_stars.starGiftAttributePattern) this.d0.c(), true);
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) this.c0.c();
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
        stargiftattributemodelArr[1] = stargiftattributemodel;
        org.telegram.ui.Components.l9[] l9VarArr = this.d;
        dd.c1(l9VarArr[1].getImageReceiver(), stargiftattributemodelArr[1].document, qs.q2);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) this.e0.c();
        this.b0[1] = stargiftattributebackdrop;
        e(1, stargiftattributebackdrop);
        stargiftattributemodelArr[2] = (TL_stars.starGiftAttributeModel) this.c0.f;
        dd.c1(l9VarArr[2].getImageReceiver(), stargiftattributemodelArr[2].document, qs.q2);
        a3.f fVar = this.l0;
        org.telegram.messenger.g0.r(fVar);
        org.telegram.messenger.g0.i3(fVar, 2500L);
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setResellPrice(cg.a aVar) {
        boolean z9;
        boolean z10;
        boolean k10 = aVar.k();
        this.N = !k10;
        w70[] w70VarArr = this.D;
        TextView textView = this.O;
        boolean z11 = true;
        if (k10) {
            z9 = true;
            ViewPropertyAnimator duration = textView.animate().scaleX(0.4f).scaleY(0.4f).alpha(0.0f).setDuration(420L);
            xq xqVar = xq.h;
            duration.setInterpolator(xqVar).setListener(new c7(this, 2)).setListener(new c7(this, 1)).start();
            w70VarArr[0].animate().alpha(1.0f).setDuration(420L).setInterpolator(xqVar).start();
        } else {
            if (aVar.a == cg.b.b) {
                z10 = true;
            } else {
                z10 = true;
                z11 = false;
            }
            int i7 = z10;
            Object[] objArr = new Object[i7];
            objArr[0] = dd.X0(z11, "⭐️ " + ((Object) dd.M0(aVar.o(), 1.0f, ',')), 0.9f, null, 0.0f, 1.0f);
            textView.setText(org.telegram.messenger.id.V(null, null, 2131749682, objArr));
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.b0[0];
            textView.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(12.0f), i0.a.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216))));
            textView.setVisibility(0);
            this.g0 = i7;
            ViewPropertyAnimator duration2 = textView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(420L);
            xq xqVar2 = xq.h;
            duration2.setInterpolator(xqVar2).setListener(new c7(this, 0)).start();
            w70VarArr[0].animate().alpha(0.0f).setDuration(420L).setInterpolator(xqVar2).start();
            z9 = i7;
        }
        boolean z12 = this.N;
        x5[] x5VarArr = this.I;
        if (z12) {
            x5VarArr[2].e(R.drawable.filled_gift_sell_off, org.telegram.messenger.id.M0(2131750433, null), z9);
        } else {
            x5VarArr[2].e(R.drawable.filled_gift_sell_on, org.telegram.messenger.id.M0(2131750447, null), z9);
        }
        x5VarArr[2].setOnClickListener(this.V);
    }

    public void setShowOptions(boolean z9) {
        this.S = z9;
        d(this.a0);
    }

    public void setWalletCard(boolean z9) {
        this.I[1].e(z9 ? R.drawable.filled_card_remove : R.drawable.filled_card_add, org.telegram.messenger.id.M0(z9 ? 2131743105 : 2131743113, null), false);
    }

    public void setWalletDisplayed(boolean z9) {
        this.I[1].setAlpha(z9 ? 1.0f : 0.5f);
    }

    public void setWearPreview(TLObject tLObject) {
        String H;
        String str;
        String str2;
        if (tLObject instanceof TLRPC.User) {
            str2 = t10.p((TLRPC.User) tLObject);
            str = org.telegram.messenger.id.M0(2131747827, null);
        } else {
            if (!(tLObject instanceof TLRPC.Chat)) {
                return;
            }
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            String str3 = chat.title;
            if (org.telegram.messenger.t3.V(chat)) {
                int i7 = chat.participants_count;
                H = i7 > 1 ? org.telegram.messenger.id.H(',', "Subscribers", i7) : org.telegram.messenger.id.M0(2131751391, null);
            } else {
                int i10 = chat.participants_count;
                H = i10 > 1 ? org.telegram.messenger.id.H(',', "Members", i10) : org.telegram.messenger.id.M0(2131754876, null).toLowerCase();
            }
            str = H;
            str2 = str3;
        }
        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        w8Var.l(tLObject);
        this.L.e(tLObject, w8Var);
        this.r[2].setText(str2);
        this.D[2].setText(str);
        m();
        d(this.a0);
    }

    public void k(int i7) {
    }
}
