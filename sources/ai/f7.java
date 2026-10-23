package ai;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.vj0;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.yq;
import org.telegram.ui.qa1;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public class f7 extends FrameLayout {
    public final int[] A0;
    public final int[] B0;
    public final int[] C0;
    public final LinearLayout.LayoutParams[] E;
    public final yh.k0[] F;
    public final TextPaint G;
    public final qa1 H;
    public final ah.v[] I;
    public final ah.v J;
    public final FrameLayout K;
    public final org.telegram.ui.Components.w9 L;
    public final e6 M;
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
    public final org.telegram.ui.ActionBar.d6 a;
    public h6 a0;
    public final FrameLayout b;
    public final TL_stars.starGiftAttributeBackdrop[] b0;
    public final w6 c;
    public a c0;
    public final org.telegram.ui.Components.w9[] d;
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
    public final a3.d l0;
    public final Paint[] m0;
    public final yh.h1 n;
    public final RadialGradient[] n0;
    public final Matrix[] o0;
    public RadialGradient p0;
    public final Matrix q0;
    public final x90[] r;
    public final Paint r0;
    public final x90 s;
    public final TL_stars.starGiftAttributePattern[] s0;
    public final org.telegram.ui.Components.p5[] t0;
    public int u0;
    public final TextView v;
    public float v0;
    public int w;
    public float w0;
    public final FrameLayout x;
    public ValueAnimator x0;
    public final x90[] y;
    public final RectF y0;
    public de z0;

    public f7(Context context, org.telegram.ui.ActionBar.d6 d6Var, Runnable runnable, View.OnClickListener onClickListener, c2 c2Var, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, View.OnClickListener onClickListener4, View.OnClickListener onClickListener5, View.OnClickListener onClickListener6) {
        super(context);
        float f7;
        float f10;
        float f11;
        this.d = new org.telegram.ui.Components.w9[5];
        this.e = new TL_stars.starGiftAttributeModel[3];
        this.f = new LinearLayout[5];
        this.h = new FrameLayout.LayoutParams[5];
        this.r = new x90[5];
        this.y = new x90[5];
        this.E = new LinearLayout.LayoutParams[5];
        this.F = new yh.k0[5];
        this.a0 = new h6(0, 0);
        this.b0 = new TL_stars.starGiftAttributeBackdrop[3];
        this.l0 = new a3.d(this, 19);
        this.m0 = new Paint[3];
        this.n0 = new RadialGradient[3];
        this.o0 = new Matrix[3];
        this.q0 = new Matrix();
        this.r0 = new Paint(1);
        int i10 = 2;
        this.s0 = new TL_stars.starGiftAttributePattern[2];
        this.t0 = new org.telegram.ui.Components.p5[2];
        int i11 = 0;
        while (true) {
            Paint[] paintArr = this.m0;
            if (i11 >= paintArr.length) {
                break;
            }
            paintArr[i11] = new Paint(1);
            i11++;
        }
        int i12 = 0;
        while (true) {
            org.telegram.ui.Components.p5[] p5VarArr = this.t0;
            f7 = 28.0f;
            if (i12 >= p5VarArr.length) {
                break;
            }
            p5VarArr[i12] = new org.telegram.ui.Components.p5(AndroidUtilities.dp(28.0f), this);
            i12++;
        }
        this.w0 = 1.0f;
        this.y0 = new RectF();
        this.A0 = new int[12];
        this.B0 = new int[12];
        this.C0 = new int[12];
        this.a = d6Var;
        this.U = onClickListener4;
        this.V = onClickListener5;
        this.W = onClickListener6;
        setWillNotDraw(false);
        this.b = new FrameLayout(context);
        int i13 = 0;
        while (true) {
            org.telegram.ui.Components.w9[] w9VarArr = this.d;
            float f12 = 0.0f;
            f10 = f7;
            if (i13 >= w9VarArr.length) {
                break;
            }
            w9VarArr[i13] = new c7(context, 0);
            this.d[i13].setLayerNum(6660);
            if (i13 > 0) {
                this.d[i13].getImageReceiver().setCrossfadeDuration(1);
            }
            this.b.addView(this.d[i13], w7.z5.e(-1, -1, 119));
            org.telegram.ui.Components.w9 w9Var = this.d[i13];
            if (i13 == 0) {
                f12 = 1.0f;
            }
            w9Var.setAlpha(f12);
            i13++;
            f7 = f10;
        }
        x90 x90Var = new x90(context, null);
        this.s = x90Var;
        x90Var.setTextSize(1, 12.0f);
        x90Var.setGravity(17);
        x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        x90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.gc, d6Var));
        x90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        TextView textView = new TextView(context);
        this.v = textView;
        textView.setOnClickListener(new z6(this, 0));
        w7.b6.b(textView, 0.05f, 1.25f);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        textView.setLinkTextColor(-1);
        textView.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        TextView textView2 = new TextView(context);
        this.O = textView2;
        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        textView2.setTextSize(1, 13.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setAlpha(0.0f);
        textView2.setScaleX(0.4f);
        textView2.setScaleY(0.4f);
        textView2.setVisibility(8);
        textView2.setGravity(17);
        w7.b6.a(textView2);
        qa1 qa1Var = new qa1(this, context, 1);
        this.H = qa1Var;
        qa1Var.setOrientation(0);
        this.I = new ah.v[3];
        int i14 = 0;
        while (true) {
            ah.v[] vVarArr = this.I;
            if (i14 >= vVarArr.length) {
                break;
            }
            vVarArr[i14] = new ah.v(context, 2);
            if (i14 == 0) {
                this.I[i14].c(R.drawable.filled_gift_send, LocaleController.getString(R.string.Gift2ActionTransfer), false);
                this.I[i14].setOnClickListener(onClickListener2);
            } else if (i14 == 1) {
                this.I[i14].c(R.drawable.filled_crown_on, LocaleController.getString(R.string.Gift2ActionWear), false);
                this.I[i14].setOnClickListener(onClickListener3);
            } else if (i14 == i10) {
                this.I[i14].c(R.drawable.filled_share, LocaleController.getString(R.string.Gift2ActionShare), false);
                this.I[i14].setOnClickListener(onClickListener4);
            }
            this.I[i14].setBackground(org.telegram.ui.ActionBar.h6.a0(0, 285212671, 16, 16));
            w7.b6.b(this.I[i14], 0.075f, 1.5f);
            qa1 qa1Var2 = this.H;
            ah.v[] vVarArr2 = this.I;
            qa1Var2.addView(vVarArr2[i14], w7.z5.p(0, 56, 1.0f, 119, 0, 0, i14 != vVarArr2.length - 1 ? 11 : 0, 0));
            i14++;
            i10 = 2;
        }
        ah.v vVar = new ah.v(context, 2);
        this.J = vVar;
        vVar.c(R.drawable.filled_card_color, LocaleController.getString(R.string.WalletGiftApplyColor), false);
        vVar.setBackground(org.telegram.ui.ActionBar.h6.a0(0, 285212671, 16, 16));
        w7.b6.b(vVar, 0.075f, 1.5f);
        vVar.setVisibility(8);
        this.H.addView(vVar, 1, w7.z5.p(0, 56, 1.0f, 119, 0, 0, 11, 0));
        this.x = new FrameLayout(context);
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
                this.K = frameLayout;
                this.f[i15].addView(frameLayout, w7.z5.q(-1, 144, 119));
                org.telegram.ui.Components.w9 w9Var2 = new org.telegram.ui.Components.w9(context);
                this.L = w9Var2;
                w9Var2.setRoundRadius(AndroidUtilities.dp(41.0f));
                frameLayout.addView(w9Var2, w7.z5.d(82, 82.0f, 49, 0.0f, 2.0f, 0.0f, 0.0f));
                this.r[i15] = new x90(context, null);
                this.r[i15].setTextColor(-1);
                this.r[i15].setTextSize(1, 20.0f);
                this.r[i15].setTypeface(AndroidUtilities.bold());
                this.r[i15].setSingleLine();
                x90 x90Var2 = this.r[i15];
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                x90Var2.setEllipsize(truncateAt);
                this.r[i15].setGravity(17);
                frameLayout.addView(this.r[i15], w7.z5.d(-1, -2.0f, 49, 16.0f, 95.33f, 16.0f, 0.0f));
                this.y[i15] = new x90(context, null);
                this.y[i15].setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.j5, d6Var));
                this.y[i15].setTextSize(1, 14.0f);
                this.y[i15].setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.gc, d6Var));
                this.y[i15].setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                this.y[i15].setDisablePaddingsOffsetY(true);
                this.y[i15].setSingleLine();
                this.y[i15].setGravity(17);
                this.y[i15].setEllipsize(truncateAt);
                frameLayout.addView(this.y[i15], w7.z5.d(-1, -2.0f, 49, 16.0f, 122.0f, 16.0f, 0.0f));
            } else if (i15 == 4) {
                e6 e6Var = new e6(context, d6Var);
                this.M = e6Var;
                this.f[i15].addView(e6Var, w7.z5.n(-1, -2));
                View view = this.f[i15];
                FrameLayout.LayoutParams[] layoutParamsArr = this.h;
                ViewGroup.LayoutParams d = w7.z5.d(-1, -2.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f);
                layoutParamsArr[i15] = d;
                addView(view, d);
                i15++;
            } else {
                this.r[i15] = new x90(context, null);
                this.r[i15].setTextColor(i15 == 3 ? -1 : org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.j5, d6Var));
                this.r[i15].setTextSize(1, 20.0f);
                this.r[i15].setTypeface(AndroidUtilities.bold());
                this.r[i15].setGravity(17);
                this.f[i15].addView(this.r[i15], w7.z5.t(-1, -2, 17, 24, i15 == 3 ? 10 : 0, 24, 0));
                if (i15 == 0) {
                    this.f[i15].addView(this.s, w7.z5.t(-2, -2, 17, 0, 4, 0, 4));
                    this.f[i15].addView(this.v, w7.z5.s(-2, 17, 0, 6, 0, 19.33f, 2));
                }
                if (i15 == 0) {
                    this.y[i15] = new x90(context, null);
                    this.y[i15].setTextColor(i15 == 3 ? org.telegram.ui.ActionBar.h6.m1(0.75f, -1) : org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.j5, d6Var));
                    this.y[i15].setTextSize(1, 14.0f);
                    this.y[i15].setGravity(17);
                    this.y[i15].setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.gc, d6Var));
                    this.y[i15].setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.y[i15].setDisablePaddingsOffsetY(true);
                    this.x.addView(this.y[i15], w7.z5.e(-2, -2, 17));
                    this.x.addView(this.O, w7.z5.a(-2.0f, 20.33f, 17));
                    LinearLayout linearLayout = this.f[i15];
                    FrameLayout frameLayout2 = this.x;
                    LinearLayout.LayoutParams[] layoutParamsArr2 = this.E;
                    LinearLayout.LayoutParams t10 = w7.z5.t(-1, -2, 17, 24, 0, 24, i15 == 3 ? 6 : 0);
                    layoutParamsArr2[i15] = t10;
                    linearLayout.addView(frameLayout2, t10);
                } else {
                    this.y[i15] = new x90(context, null);
                    this.y[i15].setTextColor(i15 == 3 ? org.telegram.ui.ActionBar.h6.m1(0.75f, -1) : org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.j5, d6Var));
                    this.y[i15].setTextSize(1, 14.0f);
                    this.y[i15].setGravity(17);
                    this.y[i15].setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.gc, d6Var));
                    this.y[i15].setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.y[i15].setDisablePaddingsOffsetY(true);
                    LinearLayout linearLayout2 = this.f[i15];
                    x90 x90Var3 = this.y[i15];
                    LinearLayout.LayoutParams[] layoutParamsArr3 = this.E;
                    LinearLayout.LayoutParams t11 = w7.z5.t(-1, -2, 17, 24, 0, 24, i15 == 3 ? 6 : 0);
                    layoutParamsArr3[i15] = t11;
                    linearLayout2.addView(x90Var3, t11);
                }
                LinearLayout.LayoutParams layoutParams = this.E[i15];
                if (i15 == 3) {
                    f11 = 6.0f;
                } else {
                    f11 = (i15 == 1 ? 7.33f : this.b0[0] == null ? 9.0f : 5.66f) - 4.0f;
                }
                layoutParams.topMargin = AndroidUtilities.dp(f11);
                this.F[i15] = new yh.k0(context);
                this.F[i15].setVisibility(8);
                this.F[i15].setPadding(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(2.0f));
                if (i15 == 0) {
                    this.G = this.F[i15].getTextPaint();
                }
                this.f[i15].addView(this.F[i15], w7.z5.t(-1, -2, 17, 24, 8, 24, 0));
            }
            if (i15 == 0) {
                this.f[i15].addView(this.H, w7.z5.t(-1, -2, 7, 0, 15, 0, 0));
            }
            View view2 = this.f[i15];
            FrameLayout.LayoutParams[] layoutParamsArr4 = this.h;
            ViewGroup.LayoutParams d10 = w7.z5.d(-1, -2.0f, 119, 16.0f, i15 == 2 ? 32.0f : 170.0f, 16.0f, 0.0f);
            layoutParamsArr4[i15] = d10;
            addView(view2, d10);
            i15++;
        }
        addView(this.b, w7.z5.d(160, 160.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        w6 w6Var = new w6(context);
        this.c = w6Var;
        addView(w6Var, w7.z5.d(-1, 160.0f, 55, 0.0f, 8.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.P = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(f10), 620756991));
        imageView.setImageResource(R.drawable.msg_close);
        w7.b6.a(imageView);
        addView(imageView, w7.z5.d(28, 28.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        imageView.setOnClickListener(new a7(0, runnable));
        imageView.setVisibility(8);
        ImageView imageView2 = new ImageView(context);
        this.Q = imageView2;
        imageView2.setImageResource(R.drawable.filled_forge);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        imageView2.setBackground(org.telegram.ui.ActionBar.h6.g0(553648127, 1, -1));
        w7.b6.a(imageView2);
        if (c2Var != null) {
            addView(imageView2, w7.z5.d(42, 42.0f, 53, 0.0f, 5.0f, 47.0f, 0.0f));
            imageView2.setOnClickListener(c2Var);
        }
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.R = imageView3;
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        imageView3.setImageResource(R.drawable.media_more);
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(org.telegram.ui.ActionBar.h6.g0(553648127, 1, -1));
        w7.b6.a(imageView3);
        addView(imageView3, w7.z5.d(42, 42.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        imageView3.setOnClickListener(onClickListener);
        imageView3.setVisibility(8);
        yh.h1 h1Var = new yh.h1(context);
        this.n = h1Var;
        h1Var.b(LocaleController.getString(R.string.GiftCrafted), true);
        yh.j1 j1Var = h1Var.a;
        if (j1Var.v == null) {
            de deVar = new de(2, 12);
            j1Var.v = deVar;
            deVar.h = 5.0f;
        }
        Path path = j1Var.f;
        float f13 = j1Var.s;
        j1Var.w = true;
        yh.j1.d(path, f13, true);
        h1Var.setScaleX(1.2f);
        h1Var.setScaleY(1.2f);
        addView(h1Var, w7.z5.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        h1Var.setVisibility(8);
    }

    public final void a() {
        ValueAnimator valueAnimator = this.x0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.x0 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.x0 = ofFloat;
        ofFloat.addUpdateListener(new b7(this, 1));
        this.x0.addListener(new d7(this, 4));
        this.x0.setDuration(320L);
        this.x0.setInterpolator(bs.g);
        this.x0.start();
    }

    public final int b(Canvas canvas, float f7, float f10, float f11, float f12) {
        int i10 = this.u0;
        RadialGradient[] radialGradientArr = this.n0;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.b0;
        Matrix[] matrixArr = this.o0;
        Paint[] paintArr = this.m0;
        int i11 = 0;
        if (i10 != 0) {
            if (this.v0 < 1.0f && stargiftattributebackdropArr[1] != null) {
                paintArr[1].setAlpha((int) (this.a0.a(1) * 255.0f));
                matrixArr[1].reset();
                matrixArr[1].postTranslate(f7, f10);
                radialGradientArr[1].setLocalMatrix(matrixArr[1]);
                canvas.drawRect(0.0f, 0.0f, f11, f12, paintArr[1]);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[1];
                i11 = i0.a.k(i0.a.o(i0.a.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216)), paintArr[1].getAlpha()), 0);
            }
            if (this.v0 <= 0.0f || stargiftattributebackdropArr[2] == null) {
                return i11;
            }
            paintArr[2].setAlpha((int) (this.a0.a(1) * 255.0f * this.v0));
            matrixArr[2].reset();
            matrixArr[2].postTranslate(f7, f10);
            radialGradientArr[2].setLocalMatrix(matrixArr[2]);
            canvas.drawRect(0.0f, 0.0f, f11, f12, paintArr[2]);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[2];
            return i0.a.k(i0.a.o(i0.a.f(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216)), paintArr[2].getAlpha()), i11);
        }
        if (this.v0 > 0.0f && stargiftattributebackdropArr[2] != null) {
            paintArr[2].setAlpha((int) (this.a0.a(1) * 255.0f));
            matrixArr[2].reset();
            matrixArr[2].postTranslate(f7, f10);
            radialGradientArr[2].setLocalMatrix(matrixArr[2]);
            canvas.drawRect(0.0f, 0.0f, f11, f12, paintArr[2]);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[2];
            i11 = i0.a.k(i0.a.o(i0.a.f(0.25f, stargiftattributebackdrop3.edge_color | (-16777216), stargiftattributebackdrop3.pattern_color | (-16777216)), paintArr[2].getAlpha()), 0);
        }
        if (this.v0 >= 1.0f || stargiftattributebackdropArr[1] == null) {
            return i11;
        }
        paintArr[1].setAlpha((int) ((1.0f - this.v0) * this.a0.a(1) * 255.0f));
        matrixArr[1].reset();
        matrixArr[1].postTranslate(f7, f10);
        radialGradientArr[1].setLocalMatrix(matrixArr[1]);
        canvas.drawRect(0.0f, 0.0f, f11, f12, paintArr[1]);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[1];
        return i0.a.k(i0.a.o(i0.a.f(0.25f, stargiftattributebackdrop4.edge_color | (-16777216), stargiftattributebackdrop4.pattern_color | (-16777216)), paintArr[1].getAlpha()), i11);
    }

    public final void c(Canvas canvas, float f7, float f10, float f11, float f12) {
        canvas.save();
        canvas.translate(f7, f10);
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.b0;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[1];
        int i10 = stargiftattributebackdrop == null ? 0 : stargiftattributebackdrop.pattern_color | (-16777216);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[2];
        int f13 = i0.a.f(this.v0, i10, stargiftattributebackdrop2 != null ? stargiftattributebackdrop2.pattern_color | (-16777216) : 0);
        org.telegram.ui.Components.p5[] p5VarArr = this.t0;
        p5VarArr[1].k(Integer.valueOf(f13));
        m1.a(canvas, 0, p5VarArr[1], f11, f12, this.a0.a(1), this.w0);
        canvas.restore();
    }

    public void d(h6 h6Var) {
        View[] viewArr;
        x90[] x90VarArr;
        float a2;
        int i10;
        boolean z10;
        this.a0 = h6Var;
        int i11 = 0;
        while (true) {
            viewArr = this.f;
            if (i11 >= viewArr.length) {
                break;
            }
            float a10 = h6Var.a(i11);
            viewArr[i11].setAlpha(a10);
            viewArr[i11].setVisibility(a10 > 0.0f ? 0 : 4);
            i11++;
        }
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.b0;
        float max = Math.max(stargiftattributebackdropArr[0] != null ? h6Var.a(2) : 0.0f, stargiftattributebackdropArr[1] != null ? h6Var.a(1) : 0.0f);
        ImageView imageView = this.P;
        imageView.setAlpha(max);
        imageView.setVisibility(((stargiftattributebackdropArr[0] == null || h6Var.c != 2) && (stargiftattributebackdropArr[1] == null || h6Var.c != 1)) ? 8 : 0);
        boolean z11 = stargiftattributebackdropArr[0] != null || this.S;
        float a11 = h6Var.a(0);
        int i12 = h6Var.c;
        float lerp = AndroidUtilities.lerp(false, z11, a11);
        ImageView imageView2 = this.R;
        imageView2.setAlpha(lerp);
        imageView2.setVisibility((z11 && i12 == 0) ? 0 : 8);
        boolean z12 = stargiftattributebackdropArr[0] != null;
        Boolean bool = this.T;
        org.telegram.ui.ActionBar.d6 d6Var = this.a;
        if (bool == null || bool.booleanValue() != z12) {
            this.T = Boolean.valueOf(z12);
            if (z12) {
                imageView2.clearColorFilter();
                imageView2.setBackground(org.telegram.ui.ActionBar.h6.g0(553648127, 1, -1));
            } else {
                imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.J5, d6Var), PorterDuff.Mode.SRC_IN));
                imageView2.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.i6, d6Var), 1, -1));
            }
        }
        if (!this.g0) {
            float lerp2 = AndroidUtilities.lerp(false, this.N, h6Var.a(0));
            TextView textView = this.O;
            textView.setAlpha(lerp2);
            textView.setScaleX(AndroidUtilities.lerp(0.4f, this.N ? 1.0f : 0.4f, h6Var.a(0)));
            textView.setScaleY(AndroidUtilities.lerp(0.4f, this.N ? 1.0f : 0.4f, h6Var.a(0)));
            textView.setVisibility((this.N && i12 == 0) ? 0 : 4);
        }
        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.j5, d6Var);
        int i13 = 0;
        while (true) {
            x90VarArr = this.y;
            if (i13 >= 2) {
                break;
            }
            this.r[i13].setTextColor(stargiftattributebackdropArr[Math.min(1, i13)] == null ? w02 : -1);
            x90 x90Var = x90VarArr[i13];
            if (i13 == 0 || i13 == 2) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[i13];
                i10 = stargiftattributebackdrop == null ? w02 : stargiftattributebackdrop.text_color | (-16777216);
            } else {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[1];
                int i14 = stargiftattributebackdrop2 == null ? w02 : stargiftattributebackdrop2.text_color | (-16777216);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[2];
                i10 = i0.a.f(this.v0, i14, stargiftattributebackdrop3 == null ? w02 : stargiftattributebackdrop3.text_color | (-16777216));
            }
            x90Var.setTextColor(i10);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[i13];
            FrameLayout.LayoutParams[] layoutParamsArr = this.h;
            if (stargiftattributebackdrop4 != null) {
                z10 = (AndroidUtilities.dp(184.0f) == layoutParamsArr[i13].topMargin && viewArr[i13].getPaddingBottom() == AndroidUtilities.dp(18.0f)) ? false : true;
                if (z10) {
                    viewArr[i13].setPadding(0, 0, 0, AndroidUtilities.dp(18.0f));
                    layoutParamsArr[i13].topMargin = AndroidUtilities.dp(184.0f);
                }
            } else {
                z10 = (AndroidUtilities.dp(170.0f) == layoutParamsArr[i13].topMargin && viewArr[i13].getPaddingBottom() == AndroidUtilities.dp(3.0f)) ? false : true;
                if (z10) {
                    viewArr[i13].setPadding(0, 0, 0, AndroidUtilities.dp(3.0f));
                    layoutParamsArr[i13].topMargin = AndroidUtilities.dp(170.0f);
                }
            }
            LinearLayout.LayoutParams[] layoutParamsArr2 = this.E;
            layoutParamsArr2[i13].topMargin = AndroidUtilities.dp((i13 == 1 ? 7.33f : stargiftattributebackdropArr[0] == null ? 9.0f : 5.66f) - 4.0f);
            if (z10) {
                viewArr[i13].setLayoutParams(layoutParamsArr[i13]);
                if (i13 == 0) {
                    this.x.setLayoutParams(layoutParamsArr2[i13]);
                } else {
                    x90VarArr[i13].setLayoutParams(layoutParamsArr2[i13]);
                }
            }
            i13++;
        }
        int dp = AndroidUtilities.dp(24.0f);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop5 = stargiftattributebackdropArr[0];
        this.v.setBackground(org.telegram.ui.ActionBar.h6.c0(dp, stargiftattributebackdrop5 == null ? 553648127 : i0.a.f(0.25f, stargiftattributebackdrop5.edge_color | (-16777216), stargiftattributebackdrop5.pattern_color | (-16777216))));
        x90 x90Var2 = x90VarArr[2];
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop6 = stargiftattributebackdropArr[0];
        if (stargiftattributebackdrop6 != null) {
            w02 = stargiftattributebackdrop6.text_color | (-16777216);
        }
        x90Var2.setTextColor(w02);
        org.telegram.ui.Components.w9[] w9VarArr = this.d;
        org.telegram.ui.Components.w9 w9Var = w9VarArr[0];
        h6 h6Var2 = this.a0;
        w9Var.setAlpha(Math.max((h6Var2.b(0) && h6Var2.b(2)) ? 1.0f : Math.max(h6Var2.a(0), h6Var2.a(2)), this.a0.a(3)));
        w9VarArr[1].setAlpha((1.0f - this.v0) * h6Var.a(1));
        w9VarArr[2].setAlpha(h6Var.a(1) * this.v0);
        float lerp3 = AndroidUtilities.lerp(1.0f, this.j0, h6Var.a(2));
        FrameLayout frameLayout = this.b;
        frameLayout.setScaleX(lerp3);
        frameLayout.setScaleY(AndroidUtilities.lerp(1.0f, this.j0, h6Var.a(2)));
        frameLayout.setTranslationX(h6Var.a(2) * this.h0);
        frameLayout.setTranslationY((h6Var.a(2) * this.i0) + (h6Var.a(1) * AndroidUtilities.dp(16.0f)));
        View view = viewArr[2];
        int i15 = h6Var.b;
        if (i15 == 2 && i12 == 2) {
            a2 = 0.0f;
        } else {
            if (i15 != 2) {
                i12 = i15;
            }
            a2 = (1.0f - h6Var.a(2)) * (-(viewArr[i12].getMeasuredHeight() - viewArr[2].getMeasuredHeight()));
        }
        view.setTranslationY(a2);
        int i16 = (this.f0 && this.a0.b(0)) ? 0 : 8;
        yh.h1 h1Var = this.n;
        h1Var.setVisibility(i16);
        h1Var.setAlpha(this.a0.a(0));
        int i17 = h6Var.a(4) <= 0.0f ? 8 : 0;
        e6 e6Var = this.M;
        e6Var.setVisibility(i17);
        e6Var.setAlpha(h6Var.a(4));
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr;
        float f7;
        float f10;
        float f11;
        int[] iArr;
        int[] iArr2;
        float f12;
        int i10;
        int[] iArr3;
        f7 f7Var;
        Canvas canvas2;
        w6 w6Var;
        float realHeight = getRealHeight();
        canvas.save();
        float f13 = 0.0f;
        canvas.clipRect(0.0f, 0.0f, getWidth(), realHeight);
        float f14 = 2.0f;
        float width = getWidth() / 2.0f;
        float dp = AndroidUtilities.dp(80.0f) + AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), this.a0.a(1));
        h6 h6Var = this.a0;
        float max = ((h6Var.b(0) && h6Var.b(2)) || (h6Var.b(2) && h6Var.b(3)) || (h6Var.b(3) && h6Var.b(0))) ? 1.0f : Math.max(h6Var.a(0), Math.max(h6Var.a(2), h6Var.a(3)));
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr2 = this.b0;
        if (max <= 0.0f || stargiftattributebackdropArr2[0] == null) {
            stargiftattributebackdropArr = stargiftattributebackdropArr2;
        } else {
            if (this.p0 == null || this.a0.a(2) < 1.0f) {
                Paint[] paintArr = this.m0;
                paintArr[0].setAlpha((int) (max * 255.0f));
                Matrix[] matrixArr = this.o0;
                matrixArr[0].reset();
                matrixArr[0].postTranslate(width, dp);
                this.n0[0].setLocalMatrix(matrixArr[0]);
                stargiftattributebackdropArr = stargiftattributebackdropArr2;
                canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, paintArr[0]);
            } else {
                stargiftattributebackdropArr = stargiftattributebackdropArr2;
            }
            if (this.p0 != null && this.a0.a(2) > 0.0f) {
                int a2 = (int) (this.a0.a(2) * 255.0f);
                Paint paint = this.r0;
                paint.setAlpha(a2);
                Matrix matrix = this.q0;
                matrix.reset();
                matrix.postTranslate(getWidth() / 2.0f, 0.4f * realHeight);
                this.p0.setLocalMatrix(matrix);
                canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, paint);
            }
        }
        if (this.a0.a(1) > 0.0f) {
            f7 = width;
            f10 = dp;
            k(b(canvas, f7, f10, getWidth(), realHeight));
        } else {
            f7 = width;
            f10 = dp;
        }
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[0];
        int[] iArr4 = this.C0;
        int[] iArr5 = this.B0;
        int[] iArr6 = this.A0;
        if (stargiftattributebackdrop != null) {
            int i11 = 0;
            while (i11 < iArr6.length) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[0];
                iArr5[i11] = stargiftattributebackdrop2.text_color | (-16777216);
                iArr6[i11] = i0.a.f(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216));
                iArr4[i11] = stargiftattributebackdropArr[0].pattern_color | (-16777216);
                i11++;
                f13 = f13;
                f14 = f14;
            }
        }
        float f15 = f13;
        float f16 = f14;
        w6 w6Var2 = this.c;
        if (w6Var2.s == null && w6Var2.v == null && w6Var2.w == null) {
            f7Var = this;
            f12 = f7;
            f11 = f10;
            iArr = iArr5;
            iArr2 = iArr6;
            i10 = 1;
            w6Var = w6Var2;
            iArr3 = iArr4;
            canvas2 = canvas;
        } else {
            float width2 = getWidth();
            float f17 = f7;
            q6 q6Var = w6Var2.s;
            float f18 = f10;
            float f19 = w6Var2.x;
            int[] iArr7 = this.B0;
            int[] iArr8 = this.A0;
            int[] iArr9 = this.C0;
            f11 = f18;
            iArr = iArr5;
            iArr2 = iArr6;
            f12 = f17;
            i10 = 1;
            iArr3 = iArr4;
            f7Var = this;
            canvas2 = canvas;
            w6Var2.a(canvas2, q6Var, f19, width2, realHeight, iArr7, iArr8, iArr9);
            w6Var2.a(canvas2, w6Var2.v, w6Var2.y, width2, realHeight, iArr7, iArr8, iArr9);
            w6Var2.a(canvas2, w6Var2.w, w6Var2.E, width2, realHeight, iArr7, iArr8, iArr9);
            w6Var = w6Var2;
            f7Var.invalidate();
        }
        if (max > 0.0f && stargiftattributebackdropArr[0] != null) {
            int i12 = iArr3[iArr3.length / 2];
            h6 h6Var2 = f7Var.a0;
            float max2 = (h6Var2.b(0) && h6Var2.b(3)) ? 1.0f : Math.max(h6Var2.a(0), h6Var2.a(3));
            org.telegram.ui.Components.p5[] p5VarArr = f7Var.t0;
            if (max2 > f15) {
                canvas2.save();
                canvas2.translate(f12, f11);
                p5VarArr[0].k(Integer.valueOf(i12));
                m1.a(canvas, 0, p5VarArr[0], f7Var.getWidth(), realHeight, max2, 1.0f);
                realHeight = realHeight;
                canvas.restore();
            }
            if (f7Var.a0.a(2) > f15) {
                canvas.save();
                p5VarArr[0].k(Integer.valueOf(i12));
                float f20 = realHeight;
                RectF rectF = AndroidUtilities.rectTmp;
                LinearLayout[] linearLayoutArr = f7Var.f;
                float x10 = linearLayoutArr[2].getX();
                FrameLayout frameLayout = f7Var.K;
                float x11 = frameLayout.getX() + x10;
                org.telegram.ui.Components.w9 w9Var = f7Var.L;
                rectF.set(w9Var.getX() + x11, w9Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY(), w9Var.getX() + frameLayout.getX() + linearLayoutArr[2].getX() + w9Var.getWidth(), w9Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY() + w9Var.getHeight());
                m1.c(canvas, p5VarArr[0], f7Var.getWidth(), f20 * 0.7f, 1.0f, rectF, f7Var.a0.a(2));
                canvas2 = canvas;
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            int i13 = 0;
            while (true) {
                ah.v[] vVarArr = f7Var.I;
                if (i13 > vVarArr.length) {
                    break;
                }
                ah.v vVar = i13 < vVarArr.length ? vVarArr[i13] : f7Var.J;
                int[] iArr10 = iArr2;
                if (org.telegram.ui.ActionBar.h6.C1(vVar.getBackground(), iArr10[Utilities.clamp(Math.round((((vVar.getWidth() / f16) + vVar.getX()) / f7Var.getWidth()) * (iArr10.length - 1)), iArr10.length - 1, 0)], false)) {
                    vVar.invalidate();
                }
                i13++;
                iArr2 = iArr10;
            }
            int[] iArr11 = iArr;
            int[] iArr12 = iArr2;
            int i14 = iArr11[iArr11.length / 2];
            int i15 = iArr12[iArr12.length / 2];
            TextView textView = f7Var.v;
            if (textView != null && f7Var.w != i14) {
                f7Var.w = i14;
                textView.setTextColor(i14);
                org.telegram.ui.ActionBar.h6.C1(textView.getBackground(), i15, false);
            }
            if (w6Var.s != null || w6Var.v != null || w6Var.w != null) {
                f7Var.y[0].setTextColor(i14);
            }
            if (f7Var.a0.a(2) > f15) {
                if (f7Var.z0 == null) {
                    f7Var.z0 = new de(i10, 12);
                }
                FrameLayout frameLayout2 = f7Var.b;
                float measuredWidth = (frameLayout2.getMeasuredWidth() / f16) + frameLayout2.getX();
                float scaleX = (frameLayout2.getScaleX() * frameLayout2.getMeasuredWidth()) / f16;
                float measuredHeight = (frameLayout2.getMeasuredHeight() / f16) + frameLayout2.getY();
                float scaleY = (frameLayout2.getScaleY() * frameLayout2.getMeasuredHeight()) / f16;
                float f21 = measuredHeight + scaleY;
                RectF rectF2 = f7Var.y0;
                rectF2.set(measuredWidth - scaleX, measuredHeight - scaleY, measuredWidth + scaleX, f21);
                f7Var.z0.g(rectF2);
                f7Var.z0.d();
                f7Var.z0.a(canvas2, org.telegram.ui.ActionBar.h6.m1(f7Var.a0.a(2), -1));
                f7Var.invalidate();
            }
        }
        if (f7Var.a0.a(1) > f15) {
            f7Var.c(canvas2, f12, f11, f7Var.getWidth(), f7Var.getRealHeight());
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(int i10, TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (stargiftattributebackdrop == null) {
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, tileMode);
        RadialGradient[] radialGradientArr = this.n0;
        radialGradientArr[i10] = radialGradient;
        if (i10 == 0) {
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(168.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, tileMode);
            this.p0 = radialGradient2;
            this.r0.setShader(radialGradient2);
        }
        Matrix[] matrixArr = this.o0;
        if (matrixArr[i10] == null) {
            matrixArr[i10] = new Matrix();
        }
        this.m0[i10].setShader(radialGradientArr[i10]);
    }

    public final void f(TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12) {
        this.N = false;
        boolean z13 = z10 || z11;
        boolean z14 = starGift instanceof TL_stars.TL_starGiftUnique;
        qa1 qa1Var = this.H;
        x90[] x90VarArr = this.y;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.b0;
        if (z14) {
            stargiftattributebackdropArr[0] = (TL_stars.starGiftAttributeBackdrop) ga.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            g(0, (TL_stars.starGiftAttributePattern) ga.l(starGift.attributes, TL_stars.starGiftAttributePattern.class), false);
            x90VarArr[0].setTextSize(1, 13.0f);
            qa1Var.setVisibility(z13 ? 0 : 8);
            ah.v[] vVarArr = this.I;
            vVarArr[2].setVisibility(0);
            if (z13) {
                vVarArr[1].c(z12 ? R.drawable.filled_crown_off : R.drawable.filled_crown_on, LocaleController.getString(z12 ? R.string.Gift2ActionWearOff : R.string.Gift2ActionWear), false);
            }
            float f7 = 1.0f;
            if (starGift.resell_amount != null) {
                this.N = true;
                boolean z15 = starGift.resale_ton_only;
                ag.b bVar = ag.b.b;
                ag.a resellAmount = starGift.getResellAmount(z15 ? bVar : ag.b.a);
                CharSequence formatSpannable = LocaleController.formatSpannable(R.string.GiftOnSale, md.T0("⭐️ " + ((Object) md.K0(resellAmount.o(), 1.0f, ',')), resellAmount.a == bVar), Float.valueOf(0.9f));
                TextView textView = this.O;
                textView.setText(formatSpannable);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[0];
                textView.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(12.0f), i0.a.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216))));
                if (l7.i2(UserConfig.selectedAccount, DialogObject.getPeerDialogId(starGift.owner_id))) {
                    textView.setOnClickListener(new z6(this, 1));
                    w7.b6.a(textView);
                } else {
                    textView.setOnClickListener(null);
                    textView.setStateListAnimator(null);
                }
            }
            if (z10) {
                vVarArr[0].setAlpha(1.0f);
                vVarArr[0].c(R.drawable.filled_gift_send, LocaleController.getString(R.string.Gift2ActionTransfer), false);
            } else {
                vVarArr[0].setAlpha(0.5f);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("L ");
                spannableStringBuilder.setSpan(new yq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Gift2ActionTransfer));
                vVarArr[0].c(R.drawable.filled_gift_send, spannableStringBuilder, false);
            }
            ah.v vVar = vVarArr[1];
            if (!z10 && !z11) {
                f7 = 0.5f;
            }
            vVar.setAlpha(f7);
            if (z10) {
                ArrayList<TL_stars.StarsAmount> arrayList = starGift.resell_amount;
                View.OnClickListener onClickListener = this.V;
                if (arrayList != null) {
                    vVarArr[2].c(R.drawable.filled_gift_sell_off, LocaleController.getString(R.string.Gift2ActionUnlist), false);
                    vVarArr[2].setOnClickListener(onClickListener);
                } else {
                    vVarArr[2].c(R.drawable.filled_gift_sell_on, LocaleController.getString(R.string.Gift2ActionResell), false);
                    vVarArr[2].setOnClickListener(onClickListener);
                }
            } else {
                vVarArr[2].c(R.drawable.filled_share, LocaleController.getString(R.string.Gift2ActionShare), false);
                vVarArr[2].setOnClickListener(this.U);
            }
            this.f0 = starGift.crafted;
            this.n.a.e(stargiftattributebackdropArr[0], false, true);
        } else {
            stargiftattributebackdropArr[0] = null;
            x90VarArr[0].setTextSize(1, 14.0f);
            this.f0 = false;
            qa1Var.setVisibility(8);
        }
        e(0, stargiftattributebackdropArr[0]);
        md.b1(this.d[0].getImageReceiver(), starGift, 160);
        this.e[0] = (TL_stars.starGiftAttributeModel) ga.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
        d(this.a0);
    }

    public final void g(int i10, TL_stars.starGiftAttributePattern stargiftattributepattern, boolean z10) {
        if (stargiftattributepattern != null) {
            TL_stars.starGiftAttributePattern[] stargiftattributepatternArr = this.s0;
            if (stargiftattributepatternArr[i10] == stargiftattributepattern) {
                return;
            }
            stargiftattributepatternArr[i10] = stargiftattributepattern;
            this.t0[i10].i(stargiftattributepattern.document, z10);
        }
    }

    public int getFinalHeight() {
        int dp;
        int measuredHeight;
        boolean d = this.a0.d(0);
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.b0;
        LinearLayout[] linearLayoutArr = this.f;
        if (d) {
            return linearLayoutArr[0].getMeasuredHeight() + AndroidUtilities.dp(160.0f) + AndroidUtilities.dp(stargiftattributebackdropArr[0] != null ? 24.0f : 10.0f);
        }
        if (this.a0.d(1)) {
            return linearLayoutArr[1].getMeasuredHeight() + AndroidUtilities.dp(160.0f) + AndroidUtilities.dp(stargiftattributebackdropArr[1] != null ? 24.0f : 10.0f);
        }
        if (this.a0.d(2)) {
            dp = AndroidUtilities.dp(64.0f);
            measuredHeight = linearLayoutArr[2].getMeasuredHeight();
        } else {
            if (!this.a0.d(3)) {
                if (!this.a0.d(4)) {
                    return 0;
                }
                e6 e6Var = this.M;
                return e6Var.getMeasuredHeight() > 0 ? e6Var.getMeasuredHeight() : AndroidUtilities.dp(550.0f);
            }
            dp = AndroidUtilities.dp(160.0f);
            measuredHeight = linearLayoutArr[3].getMeasuredHeight();
        }
        return measuredHeight + dp;
    }

    public float getRealHeight() {
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.b0;
        int dp = AndroidUtilities.dp(160.0f) + AndroidUtilities.dp(stargiftattributebackdropArr[0] != null ? 24.0f : 10.0f);
        LinearLayout[] linearLayoutArr = this.f;
        return (this.a0.a(4) * (this.M.getMeasuredHeight() > 0 ? r1.getMeasuredHeight() : AndroidUtilities.dp(550.0f))) + (this.a0.a(3) * (linearLayoutArr[3].getMeasuredHeight() + AndroidUtilities.dp(160.0f) + AndroidUtilities.dp(stargiftattributebackdropArr[0] != null ? 24.0f : 10.0f))) + (this.a0.a(2) * (linearLayoutArr[2].getMeasuredHeight() + AndroidUtilities.dp(64.0f))) + (this.a0.a(1) * (linearLayoutArr[1].getMeasuredHeight() + AndroidUtilities.dp(160.0f) + AndroidUtilities.dp(stargiftattributebackdropArr[1] != null ? 24.0f : 10.0f))) + (this.a0.a(0) * (linearLayoutArr[0].getMeasuredHeight() + dp)) + 0.0f;
    }

    public TL_stars.starGiftAttributeBackdrop getUpgradeBackdropAttribute() {
        float f7 = this.v0;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.b0;
        return f7 > 0.5f ? stargiftattributebackdropArr[2] : stargiftattributebackdropArr[1];
    }

    public org.telegram.ui.Components.w9 getUpgradeImageView() {
        float f7 = this.v0;
        org.telegram.ui.Components.w9[] w9VarArr = this.d;
        return f7 > 0.5f ? w9VarArr[2] : w9VarArr[1];
    }

    public TL_stars.starGiftAttributeModel getUpgradeImageViewAttribute() {
        float f7 = this.v0;
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
        return f7 > 0.5f ? stargiftattributemodelArr[2] : stargiftattributemodelArr[1];
    }

    public TL_stars.starGiftAttributePattern getUpgradePatternAttribute() {
        return this.s0[1];
    }

    public final void h(int i10, CharSequence charSequence, CharSequence charSequence2, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence3, TLObject tLObject, Spannable spannable) {
        this.r[i10].setText(charSequence);
        FrameLayout frameLayout = this.x;
        x90[] x90VarArr = this.y;
        x90 x90Var = this.s;
        TextView textView = this.v;
        if (i10 == 0 && !TextUtils.isEmpty(spannableStringBuilder)) {
            textView.setText(spannableStringBuilder);
            textView.setVisibility(0);
            x90Var.setVisibility(8);
            if (i10 == 0) {
                frameLayout.setVisibility(8);
            } else {
                x90VarArr[i10].setVisibility(8);
            }
        } else if (i10 != 0 || TextUtils.isEmpty(charSequence3)) {
            x90VarArr[i10].setText(charSequence2);
            if (i10 == 0) {
                frameLayout.setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
            } else {
                x90VarArr[i10].setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
            }
            x90Var.setVisibility(8);
            textView.setVisibility(8);
        } else {
            x90Var.setText(charSequence3);
            x90Var.setVisibility(0);
            textView.setVisibility(8);
            if (i10 == 0) {
                frameLayout.setVisibility(8);
            } else {
                x90VarArr[i10].setVisibility(8);
            }
        }
        yh.k0[] k0VarArr = this.F;
        yh.k0 k0Var = k0VarArr[i10];
        if (k0Var != null) {
            k0Var.setVisibility(TextUtils.isEmpty(spannable) ? 8 : 0);
            k0VarArr[i10].setUser(tLObject);
            k0VarArr[i10].setMessage(spannable);
        }
    }

    public final void i(int i10, String str, CharSequence charSequence, SpannableStringBuilder spannableStringBuilder) {
        h(i10, str, charSequence, null, spannableStringBuilder, null, null);
    }

    public final void j(View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, boolean z10) {
        qa1 qa1Var = this.H;
        qa1Var.setVisibility(0);
        ah.v[] vVarArr = this.I;
        vVarArr[0].setAlpha(1.0f);
        vVarArr[0].c(R.drawable.filled_gift_send, LocaleController.getString(R.string.Gift2ActionTransfer), false);
        vVarArr[0].setOnClickListener(onClickListener);
        int i10 = onClickListener2 != null ? 0 : 8;
        ah.v vVar = this.J;
        vVar.setVisibility(i10);
        vVar.setOnClickListener(onClickListener2);
        vVarArr[1].c(R.drawable.filled_crown_on, LocaleController.getString(R.string.Gift2ActionWear), false);
        vVarArr[1].setOnClickListener(onClickListener3);
        ((LinearLayout.LayoutParams) vVarArr[1].getLayoutParams()).rightMargin = 0;
        setWalletDisplayed(z10);
        vVarArr[2].setVisibility(8);
        qa1Var.requestLayout();
    }

    public final void l() {
        this.j0 = AndroidUtilities.dpf2(33.33f) / AndroidUtilities.dpf2(160.0f);
        float f7 = -this.b.getLeft();
        x90[] x90VarArr = this.r;
        this.h0 = ((((Math.min(x90VarArr[2].getPaint().measureText(x90VarArr[2].getText().toString()), x90VarArr[2].getWidth()) + x90VarArr[2].getWidth()) / 2.0f) + (x90VarArr[2].getX() + f7)) + AndroidUtilities.dp(24.0f)) - (AndroidUtilities.dp(126.67f) / 2.0f);
        this.i0 = (AndroidUtilities.dp(124.0f) + (-r0.getTop())) - (AndroidUtilities.dp(126.67f) / 2.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.p5[] p5VarArr = this.t0;
        p5VarArr[0].a();
        p5VarArr[1].a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.p5[] p5VarArr = this.t0;
        p5VarArr[0].b();
        p5VarArr[1].b();
        AndroidUtilities.cancelRunOnUIThread(this.l0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.a0.b(2)) {
            l();
            d(this.a0);
        }
    }

    public void setPreviewAttributes(v1 v1Var) {
        h6 h6Var = this.a0;
        if (h6Var != null && h6Var.c == 1 && isAttachedToWindow()) {
            AndroidUtilities.cancelRunOnUIThread(this.l0);
            ValueAnimator valueAnimator = this.k0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.k0 = null;
            }
            int i10 = 1 - this.u0;
            this.u0 = i10;
            org.telegram.ui.Components.w9[] w9VarArr = this.d;
            vj0 lottieAnimation = w9VarArr[2 - i10].getImageReceiver().getLottieAnimation();
            vj0 lottieAnimation2 = w9VarArr[this.u0 + 1].getImageReceiver().getLottieAnimation();
            if (lottieAnimation2 != null && lottieAnimation != null) {
                lottieAnimation2.T(lottieAnimation.t(), false);
            }
            int i11 = this.u0 + 1;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = v1Var.a;
            this.b0[i11] = stargiftattributebackdrop;
            e(i11, stargiftattributebackdrop);
            g(1, v1Var.b, true);
            int i12 = this.u0 + 1;
            TL_stars.starGiftAttributeModel stargiftattributemodel = v1Var.c;
            TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
            stargiftattributemodelArr[i12] = stargiftattributemodel;
            md.a1(w9VarArr[i12].getImageReceiver(), stargiftattributemodelArr[this.u0 + 1].document, 160);
            a();
            float f7 = this.u0;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f7, f7);
            this.k0 = ofFloat;
            ofFloat.addUpdateListener(new b7(this, 0));
            this.k0.addListener(new d7(this, 3));
            this.k0.setDuration(320L);
            this.k0.setInterpolator(bs.h);
            this.k0.start();
        }
    }

    public void setPreviewingAttributes(ArrayList<TL_stars.StarGiftAttribute> arrayList) {
        this.c0 = new a(ga.m(arrayList, TL_stars.starGiftAttributeModel.class));
        this.d0 = new a(ga.m(arrayList, TL_stars.starGiftAttributePattern.class));
        this.e0 = new a(ga.m(arrayList, TL_stars.starGiftAttributeBackdrop.class));
        this.y[1].setTextSize(1, 14.0f);
        this.H.setVisibility(8);
        this.v0 = 0.0f;
        this.u0 = 0;
        g(1, (TL_stars.starGiftAttributePattern) this.d0.c(), true);
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) this.c0.c();
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
        stargiftattributemodelArr[1] = stargiftattributemodel;
        org.telegram.ui.Components.w9[] w9VarArr = this.d;
        md.a1(w9VarArr[1].getImageReceiver(), stargiftattributemodelArr[1].document, 160);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) this.e0.c();
        this.b0[1] = stargiftattributebackdrop;
        e(1, stargiftattributebackdrop);
        stargiftattributemodelArr[2] = (TL_stars.starGiftAttributeModel) this.c0.f;
        md.a1(w9VarArr[2].getImageReceiver(), stargiftattributemodelArr[2].document, 160);
        a3.d dVar = this.l0;
        AndroidUtilities.cancelRunOnUIThread(dVar);
        AndroidUtilities.runOnUIThread(dVar, 2500L);
        invalidate();
    }

    public void setResellPrice(ag.a aVar) {
        boolean k10 = aVar.k();
        this.N = !k10;
        x90[] x90VarArr = this.y;
        TextView textView = this.O;
        if (k10) {
            ViewPropertyAnimator duration = textView.animate().scaleX(0.4f).scaleY(0.4f).alpha(0.0f).setDuration(420L);
            bs bsVar = bs.h;
            duration.setInterpolator(bsVar).setListener(new d7(this, 2)).setListener(new d7(this, 1)).start();
            x90VarArr[0].animate().alpha(1.0f).setDuration(420L).setInterpolator(bsVar).start();
        } else {
            textView.setText(LocaleController.formatSpannable(R.string.GiftOnSale, md.V0(aVar.a == ag.b.b, "⭐️ " + ((Object) md.K0(aVar.o(), 1.0f, ',')), 0.9f, null, 0.0f, 1.0f)));
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.b0[0];
            textView.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(12.0f), i0.a.f(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216))));
            textView.setVisibility(0);
            this.g0 = true;
            ViewPropertyAnimator duration2 = textView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(420L);
            bs bsVar2 = bs.h;
            duration2.setInterpolator(bsVar2).setListener(new d7(this, 0)).start();
            x90VarArr[0].animate().alpha(0.0f).setDuration(420L).setInterpolator(bsVar2).start();
        }
        boolean z10 = this.N;
        ah.v[] vVarArr = this.I;
        if (z10) {
            vVarArr[2].c(R.drawable.filled_gift_sell_off, LocaleController.getString(R.string.Gift2ActionUnlist), true);
        } else {
            vVarArr[2].c(R.drawable.filled_gift_sell_on, LocaleController.getString(R.string.Gift2ActionResell), true);
        }
        vVarArr[2].setOnClickListener(this.V);
    }

    public void setShowOptions(boolean z10) {
        this.S = z10;
        d(this.a0);
    }

    public void setWalletCard(boolean z10) {
        this.I[1].c(z10 ? R.drawable.filled_card_remove : R.drawable.filled_card_add, LocaleController.getString(z10 ? R.string.WalletGiftRemoveFromCard : R.string.WalletGiftAddToCard), false);
    }

    public void setWalletDisplayed(boolean z10) {
        this.I[1].setAlpha(z10 ? 1.0f : 0.5f);
    }

    public void setWearPreview(TLObject tLObject) {
        String formatPluralStringComma;
        String str;
        String str2;
        if (tLObject instanceof TLRPC.User) {
            str2 = UserObject.getUserName((TLRPC.User) tLObject);
            str = LocaleController.getString(R.string.Online);
        } else {
            if (!(tLObject instanceof TLRPC.Chat)) {
                return;
            }
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            String str3 = chat.title;
            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                int i10 = chat.participants_count;
                formatPluralStringComma = i10 > 1 ? LocaleController.formatPluralStringComma("Subscribers", i10) : LocaleController.getString(R.string.DiscussChannel);
            } else {
                int i11 = chat.participants_count;
                formatPluralStringComma = i11 > 1 ? LocaleController.formatPluralStringComma("Members", i11) : LocaleController.getString(R.string.AccDescrGroup).toLowerCase();
            }
            str = formatPluralStringComma;
            str2 = str3;
        }
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        h9Var.p(tLObject);
        this.L.e(tLObject, h9Var);
        this.r[2].setText(str2);
        this.y[2].setText(str);
        l();
        d(this.a0);
    }

    public void k(int i10) {
    }
}
