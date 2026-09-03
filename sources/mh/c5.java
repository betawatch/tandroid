package mh;

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
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.ob1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public class c5 extends FrameLayout {
    public final LinearLayout.LayoutParams[] B;
    public final lh.w0[] C;
    public final TextPaint D;
    public final ob1 E;
    public final ag.l[] F;
    public final FrameLayout G;
    public final org.telegram.ui.Components.p9 H;
    public final f4 I;
    public boolean J;
    public final TextView K;
    public final ImageView L;
    public final ImageView M;
    public final ImageView N;
    public final View.OnClickListener O;
    public final View.OnClickListener P;
    public final View.OnClickListener Q;
    public c5.d R;
    public final TL_stars.starGiftAttributeBackdrop[] S;
    public com.google.android.gms.common.api.internal.r T;
    public com.google.android.gms.common.api.internal.r U;
    public com.google.android.gms.common.api.internal.r V;
    public boolean W;
    public final org.telegram.ui.ActionBar.g6 a;
    public boolean a0;
    public final FrameLayout b;
    public float b0;
    public final u4 c;
    public float c0;
    public final org.telegram.ui.Components.p9[] d;
    public float d0;
    public final TL_stars.starGiftAttributeModel[] e;
    public ValueAnimator e0;
    public final LinearLayout[] f;
    public final lh.c3 f0;
    public final Paint[] g0;
    public final FrameLayout.LayoutParams[] h;
    public final RadialGradient[] h0;
    public final Matrix[] i0;
    public RadialGradient j0;
    public final Matrix k0;
    public final Paint l0;
    public final TL_stars.starGiftAttributePattern[] m0;
    public final lh.y1 n;
    public final org.telegram.ui.Components.j5[] n0;
    public int o0;
    public float p0;
    public float q0;
    public final g90[] r;
    public ValueAnimator r0;
    public final g90 s;
    public final RectF s0;
    public wa t0;
    public final int[] u0;
    public final TextView v;
    public final int[] v0;
    public int w;
    public final int[] w0;
    public final FrameLayout x;
    public final g90[] y;

    public c5(Context context, org.telegram.ui.ActionBar.g6 g6Var, Runnable runnable, View.OnClickListener onClickListener, k1 k1Var, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, View.OnClickListener onClickListener4, View.OnClickListener onClickListener5, View.OnClickListener onClickListener6) {
        super(context);
        float f10;
        this.d = new org.telegram.ui.Components.p9[5];
        this.e = new TL_stars.starGiftAttributeModel[3];
        this.f = new LinearLayout[5];
        this.h = new FrameLayout.LayoutParams[5];
        this.r = new g90[5];
        this.y = new g90[5];
        this.B = new LinearLayout.LayoutParams[5];
        this.C = new lh.w0[5];
        this.R = new c5.d(0, 0);
        this.S = new TL_stars.starGiftAttributeBackdrop[3];
        this.f0 = new lh.c3(this, 12);
        this.g0 = new Paint[3];
        this.h0 = new RadialGradient[3];
        this.i0 = new Matrix[3];
        this.k0 = new Matrix();
        this.l0 = new Paint(1);
        this.m0 = new TL_stars.starGiftAttributePattern[2];
        this.n0 = new org.telegram.ui.Components.j5[2];
        int i10 = 0;
        while (true) {
            Paint[] paintArr = this.g0;
            if (i10 >= paintArr.length) {
                break;
            }
            paintArr[i10] = new Paint(1);
            i10++;
        }
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.j5[] j5VarArr = this.n0;
            if (i11 >= j5VarArr.length) {
                break;
            }
            j5VarArr[i11] = new org.telegram.ui.Components.j5(AndroidUtilities.dp(28.0f), this);
            i11++;
        }
        this.q0 = 1.0f;
        this.s0 = new RectF();
        this.u0 = new int[12];
        this.v0 = new int[12];
        this.w0 = new int[12];
        this.a = g6Var;
        this.O = onClickListener4;
        this.P = onClickListener5;
        this.Q = onClickListener6;
        setWillNotDraw(false);
        this.b = new FrameLayout(context);
        int i12 = 0;
        while (true) {
            org.telegram.ui.Components.p9[] p9VarArr = this.d;
            float f11 = 0.0f;
            if (i12 >= p9VarArr.length) {
                break;
            }
            p9VarArr[i12] = new z4(context, 0);
            this.d[i12].setLayerNum(6660);
            if (i12 > 0) {
                this.d[i12].getImageReceiver().setCrossfadeDuration(1);
            }
            this.b.addView(this.d[i12], k7.c6.e(-1, -1, 119));
            org.telegram.ui.Components.p9 p9Var = this.d[i12];
            if (i12 == 0) {
                f11 = 1.0f;
            }
            p9Var.setAlpha(f11);
            i12++;
        }
        g90 g90Var = new g90(context, null);
        this.s = g90Var;
        g90Var.setTextSize(1, 12.0f);
        g90Var.setGravity(17);
        g90Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var));
        g90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.gc, g6Var));
        g90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        TextView textView = new TextView(context);
        this.v = textView;
        textView.setOnClickListener(new x4(this, 0));
        k7.e6.b(textView, 0.05f, 1.25f);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        textView.setLinkTextColor(-1);
        textView.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        TextView textView2 = new TextView(context);
        this.K = textView2;
        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        textView2.setTextSize(1, 13.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setAlpha(0.0f);
        textView2.setScaleX(0.4f);
        textView2.setScaleY(0.4f);
        textView2.setVisibility(8);
        textView2.setGravity(17);
        k7.e6.a(textView2);
        ob1 ob1Var = new ob1(this, context, 3);
        this.E = ob1Var;
        ob1Var.setOrientation(0);
        this.F = new ag.l[3];
        int i13 = 0;
        while (true) {
            ag.l[] lVarArr = this.F;
            if (i13 >= lVarArr.length) {
                break;
            }
            ag.l lVar = new ag.l(context, 5);
            ImageView imageView = new ImageView(context);
            lVar.b = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            lVar.addView(imageView, k7.c6.d(24, 24.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
            TextView textView3 = new TextView(context);
            lVar.c = textView3;
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setTextSize(1, 12.0f);
            textView3.setTextColor(-1);
            textView3.setGravity(17);
            lVar.addView(textView3, k7.c6.d(-1, -2.0f, 49, 4.0f, 35.0f, 4.0f, 0.0f));
            lVarArr[i13] = lVar;
            if (i13 == 0) {
                this.F[i13].b(R.drawable.filled_gift_transfer, LocaleController.getString(R.string.Gift2ActionTransfer), false);
                this.F[i13].setOnClickListener(onClickListener2);
            } else if (i13 == 1) {
                this.F[i13].b(R.drawable.filled_crown_on, LocaleController.getString(R.string.Gift2ActionWear), false);
                this.F[i13].setOnClickListener(onClickListener3);
            } else if (i13 == 2) {
                this.F[i13].b(R.drawable.filled_share, LocaleController.getString(R.string.Gift2ActionShare), false);
                this.F[i13].setOnClickListener(onClickListener4);
            }
            this.F[i13].setBackground(org.telegram.ui.ActionBar.k6.Z(0, 285212671, 16, 16));
            k7.e6.b(this.F[i13], 0.075f, 1.5f);
            ob1 ob1Var2 = this.E;
            ag.l[] lVarArr2 = this.F;
            ob1Var2.addView(lVarArr2[i13], k7.c6.p(0, 56, 1.0f, 119, 0, 0, i13 != lVarArr2.length - 1 ? 11 : 0, 0));
            i13++;
        }
        this.x = new FrameLayout(context);
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
                this.G = frameLayout;
                this.f[i14].addView(frameLayout, k7.c6.q(-1, 144, 119));
                org.telegram.ui.Components.p9 p9Var2 = new org.telegram.ui.Components.p9(context);
                this.H = p9Var2;
                p9Var2.setRoundRadius(AndroidUtilities.dp(41.0f));
                frameLayout.addView(p9Var2, k7.c6.d(82, 82.0f, 49, 0.0f, 2.0f, 0.0f, 0.0f));
                this.r[i14] = new g90(context, null);
                this.r[i14].setTextColor(-1);
                this.r[i14].setTextSize(1, 20.0f);
                this.r[i14].setTypeface(AndroidUtilities.bold());
                this.r[i14].setSingleLine();
                g90 g90Var2 = this.r[i14];
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                g90Var2.setEllipsize(truncateAt);
                this.r[i14].setGravity(17);
                frameLayout.addView(this.r[i14], k7.c6.d(-1, -2.0f, 49, 16.0f, 95.33f, 16.0f, 0.0f));
                this.y[i14] = new g90(context, null);
                this.y[i14].setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.j5, g6Var));
                this.y[i14].setTextSize(1, 14.0f);
                this.y[i14].setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.gc, g6Var));
                this.y[i14].setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                this.y[i14].setDisablePaddingsOffsetY(true);
                this.y[i14].setSingleLine();
                this.y[i14].setGravity(17);
                this.y[i14].setEllipsize(truncateAt);
                frameLayout.addView(this.y[i14], k7.c6.d(-1, -2.0f, 49, 16.0f, 122.0f, 16.0f, 0.0f));
            } else if (i14 == 4) {
                f4 f4Var = new f4(context, g6Var);
                this.I = f4Var;
                this.f[i14].addView(f4Var, k7.c6.n(-1, -2));
                View view = this.f[i14];
                FrameLayout.LayoutParams[] layoutParamsArr = this.h;
                ViewGroup.LayoutParams d = k7.c6.d(-1, -2.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f);
                layoutParamsArr[i14] = d;
                addView(view, d);
                i14++;
            } else {
                this.r[i14] = new g90(context, null);
                this.r[i14].setTextColor(i14 == 3 ? -1 : org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.j5, g6Var));
                this.r[i14].setTextSize(1, 20.0f);
                this.r[i14].setTypeface(AndroidUtilities.bold());
                this.r[i14].setGravity(17);
                this.f[i14].addView(this.r[i14], k7.c6.t(-1, -2, 17, 24, i14 == 3 ? 10 : 0, 24, 0));
                if (i14 == 0) {
                    this.f[i14].addView(this.s, k7.c6.t(-2, -2, 17, 0, 4, 0, 4));
                    this.f[i14].addView(this.v, k7.c6.s(-2, 17, 0, 6, 0, 19.33f, 2));
                }
                if (i14 == 0) {
                    this.y[i14] = new g90(context, null);
                    this.y[i14].setTextColor(i14 == 3 ? org.telegram.ui.ActionBar.k6.l1(0.75f, -1) : org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.j5, g6Var));
                    this.y[i14].setTextSize(1, 14.0f);
                    this.y[i14].setGravity(17);
                    this.y[i14].setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.gc, g6Var));
                    this.y[i14].setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.y[i14].setDisablePaddingsOffsetY(true);
                    this.x.addView(this.y[i14], k7.c6.e(-2, -2, 17));
                    this.x.addView(this.K, k7.c6.a(-2.0f, 20.33f, 17));
                    LinearLayout linearLayout = this.f[i14];
                    FrameLayout frameLayout2 = this.x;
                    LinearLayout.LayoutParams[] layoutParamsArr2 = this.B;
                    LinearLayout.LayoutParams t6 = k7.c6.t(-1, -2, 17, 24, 0, 24, i14 == 3 ? 6 : 0);
                    layoutParamsArr2[i14] = t6;
                    linearLayout.addView(frameLayout2, t6);
                } else {
                    this.y[i14] = new g90(context, null);
                    this.y[i14].setTextColor(i14 == 3 ? org.telegram.ui.ActionBar.k6.l1(0.75f, -1) : org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.j5, g6Var));
                    this.y[i14].setTextSize(1, 14.0f);
                    this.y[i14].setGravity(17);
                    this.y[i14].setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.gc, g6Var));
                    this.y[i14].setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.y[i14].setDisablePaddingsOffsetY(true);
                    LinearLayout linearLayout2 = this.f[i14];
                    g90 g90Var3 = this.y[i14];
                    LinearLayout.LayoutParams[] layoutParamsArr3 = this.B;
                    LinearLayout.LayoutParams t9 = k7.c6.t(-1, -2, 17, 24, 0, 24, i14 == 3 ? 6 : 0);
                    layoutParamsArr3[i14] = t9;
                    linearLayout2.addView(g90Var3, t9);
                }
                LinearLayout.LayoutParams layoutParams = this.B[i14];
                if (i14 == 3) {
                    f10 = 6.0f;
                } else {
                    f10 = (i14 == 1 ? 7.33f : this.S[0] == null ? 9.0f : 5.66f) - 4.0f;
                }
                layoutParams.topMargin = AndroidUtilities.dp(f10);
                this.C[i14] = new lh.w0(context);
                this.C[i14].setVisibility(8);
                this.C[i14].setPadding(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(2.0f));
                if (i14 == 0) {
                    this.D = this.C[i14].getTextPaint();
                }
                this.f[i14].addView(this.C[i14], k7.c6.t(-1, -2, 17, 24, 8, 24, 0));
            }
            if (i14 == 0) {
                this.f[i14].addView(this.E, k7.c6.t(-1, -2, 7, 0, 15, 0, 0));
            }
            View view2 = this.f[i14];
            FrameLayout.LayoutParams[] layoutParamsArr4 = this.h;
            ViewGroup.LayoutParams d10 = k7.c6.d(-1, -2.0f, 119, 16.0f, i14 == 2 ? 32.0f : 170.0f, 16.0f, 0.0f);
            layoutParamsArr4[i14] = d10;
            addView(view2, d10);
            i14++;
        }
        addView(this.b, k7.c6.d(160, 160.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        u4 u4Var = new u4(context);
        this.c = u4Var;
        addView(u4Var, k7.c6.d(-1, 160.0f, 55, 0.0f, 8.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.L = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(28.0f), 620756991));
        imageView2.setImageResource(R.drawable.msg_close);
        k7.e6.a(imageView2);
        addView(imageView2, k7.c6.d(28, 28.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        imageView2.setOnClickListener(new jg.u(2, runnable));
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.M = imageView3;
        imageView3.setImageResource(R.drawable.filled_forge);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(org.telegram.ui.ActionBar.k6.f0(553648127, 1, -1));
        k7.e6.a(imageView3);
        if (k1Var != null) {
            addView(imageView3, k7.c6.d(42, 42.0f, 53, 0.0f, 5.0f, 47.0f, 0.0f));
            imageView3.setOnClickListener(k1Var);
        }
        imageView3.setVisibility(8);
        ImageView imageView4 = new ImageView(context);
        this.N = imageView4;
        imageView4.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        imageView4.setImageResource(R.drawable.media_more);
        imageView4.setScaleType(scaleType);
        imageView4.setBackground(org.telegram.ui.ActionBar.k6.f0(553648127, 1, -1));
        k7.e6.a(imageView4);
        addView(imageView4, k7.c6.d(42, 42.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        imageView4.setOnClickListener(onClickListener);
        imageView4.setVisibility(8);
        lh.y1 y1Var = new lh.y1(context);
        this.n = y1Var;
        y1Var.b(LocaleController.getString(R.string.GiftCrafted), true);
        lh.a2 a2Var = y1Var.a;
        if (a2Var.f == null) {
            wa waVar = new wa(2, 12);
            a2Var.f = waVar;
            waVar.h = 5.0f;
        }
        Path path = a2Var.c;
        float f12 = a2Var.e;
        a2Var.g = true;
        lh.a2.c(path, f12, true);
        y1Var.setScaleX(1.2f);
        y1Var.setScaleY(1.2f);
        addView(y1Var, k7.c6.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        y1Var.setVisibility(8);
    }

    public final void a() {
        ValueAnimator valueAnimator = this.r0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.r0 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.r0 = ofFloat;
        ofFloat.addUpdateListener(new y4(this, 1));
        this.r0.addListener(new a5(this, 4));
        this.r0.setDuration(320L);
        this.r0.setInterpolator(pr.g);
        this.r0.start();
    }

    public final int b(Canvas canvas, float f10, float f11, float f12, float f13) {
        int i10 = this.o0;
        RadialGradient[] radialGradientArr = this.h0;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.S;
        Matrix[] matrixArr = this.i0;
        Paint[] paintArr = this.g0;
        int i11 = 0;
        if (i10 != 0) {
            if (this.p0 < 1.0f && stargiftattributebackdropArr[1] != null) {
                paintArr[1].setAlpha((int) (this.R.a(1) * 255.0f));
                matrixArr[1].reset();
                matrixArr[1].postTranslate(f10, f11);
                radialGradientArr[1].setLocalMatrix(matrixArr[1]);
                canvas.drawRect(0.0f, 0.0f, f12, f13, paintArr[1]);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[1];
                i11 = i0.a.h(i0.a.k(i0.a.d(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216)), paintArr[1].getAlpha()), 0);
            }
            if (this.p0 <= 0.0f || stargiftattributebackdropArr[2] == null) {
                return i11;
            }
            paintArr[2].setAlpha((int) (this.R.a(1) * 255.0f * this.p0));
            matrixArr[2].reset();
            matrixArr[2].postTranslate(f10, f11);
            radialGradientArr[2].setLocalMatrix(matrixArr[2]);
            canvas.drawRect(0.0f, 0.0f, f12, f13, paintArr[2]);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[2];
            return i0.a.h(i0.a.k(i0.a.d(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216)), paintArr[2].getAlpha()), i11);
        }
        if (this.p0 > 0.0f && stargiftattributebackdropArr[2] != null) {
            paintArr[2].setAlpha((int) (this.R.a(1) * 255.0f));
            matrixArr[2].reset();
            matrixArr[2].postTranslate(f10, f11);
            radialGradientArr[2].setLocalMatrix(matrixArr[2]);
            canvas.drawRect(0.0f, 0.0f, f12, f13, paintArr[2]);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[2];
            i11 = i0.a.h(i0.a.k(i0.a.d(0.25f, stargiftattributebackdrop3.edge_color | (-16777216), stargiftattributebackdrop3.pattern_color | (-16777216)), paintArr[2].getAlpha()), 0);
        }
        if (this.p0 >= 1.0f || stargiftattributebackdropArr[1] == null) {
            return i11;
        }
        paintArr[1].setAlpha((int) ((1.0f - this.p0) * this.R.a(1) * 255.0f));
        matrixArr[1].reset();
        matrixArr[1].postTranslate(f10, f11);
        radialGradientArr[1].setLocalMatrix(matrixArr[1]);
        canvas.drawRect(0.0f, 0.0f, f12, f13, paintArr[1]);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[1];
        return i0.a.h(i0.a.k(i0.a.d(0.25f, stargiftattributebackdrop4.edge_color | (-16777216), stargiftattributebackdrop4.pattern_color | (-16777216)), paintArr[1].getAlpha()), i11);
    }

    public final void c(Canvas canvas, float f10, float f11, float f12, float f13) {
        canvas.save();
        canvas.translate(f10, f11);
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.S;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[1];
        int i10 = stargiftattributebackdrop == null ? 0 : stargiftattributebackdrop.pattern_color | (-16777216);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[2];
        int d = i0.a.d(this.p0, i10, stargiftattributebackdrop2 != null ? stargiftattributebackdrop2.pattern_color | (-16777216) : 0);
        org.telegram.ui.Components.j5[] j5VarArr = this.n0;
        j5VarArr[1].k(Integer.valueOf(d));
        w0.a(canvas, 0, j5VarArr[1], f12, f13, this.R.a(1), this.q0);
        canvas.restore();
    }

    public void d(c5.d dVar) {
        View[] viewArr;
        g90[] g90VarArr;
        float a2;
        int i10;
        boolean z4;
        this.R = dVar;
        int i11 = 0;
        while (true) {
            viewArr = this.f;
            if (i11 >= viewArr.length) {
                break;
            }
            float a10 = dVar.a(i11);
            viewArr[i11].setAlpha(a10);
            viewArr[i11].setVisibility(a10 > 0.0f ? 0 : 4);
            i11++;
        }
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.S;
        float max = Math.max(stargiftattributebackdropArr[0] != null ? dVar.a(2) : 0.0f, stargiftattributebackdropArr[1] != null ? dVar.a(1) : 0.0f);
        ImageView imageView = this.L;
        imageView.setAlpha(max);
        imageView.setVisibility(((stargiftattributebackdropArr[0] == null || dVar.b != 2) && (stargiftattributebackdropArr[1] == null || dVar.b != 1)) ? 8 : 0);
        boolean z10 = stargiftattributebackdropArr[0] != null;
        float a11 = dVar.a(0);
        int i12 = dVar.b;
        float lerp = AndroidUtilities.lerp(false, z10, a11);
        ImageView imageView2 = this.N;
        imageView2.setAlpha(lerp);
        imageView2.setVisibility((stargiftattributebackdropArr[0] == null || i12 != 0) ? 8 : 0);
        if (!this.a0) {
            float lerp2 = AndroidUtilities.lerp(false, this.J, dVar.a(0));
            TextView textView = this.K;
            textView.setAlpha(lerp2);
            textView.setScaleX(AndroidUtilities.lerp(0.4f, this.J ? 1.0f : 0.4f, dVar.a(0)));
            textView.setScaleY(AndroidUtilities.lerp(0.4f, this.J ? 1.0f : 0.4f, dVar.a(0)));
            textView.setVisibility((this.J && i12 == 0) ? 0 : 4);
        }
        int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.j5, this.a);
        int i13 = 0;
        while (true) {
            g90VarArr = this.y;
            if (i13 >= 2) {
                break;
            }
            this.r[i13].setTextColor(stargiftattributebackdropArr[Math.min(1, i13)] == null ? v02 : -1);
            g90 g90Var = g90VarArr[i13];
            if (i13 == 0 || i13 == 2) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[i13];
                i10 = stargiftattributebackdrop == null ? v02 : stargiftattributebackdrop.text_color | (-16777216);
            } else {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[1];
                int i14 = stargiftattributebackdrop2 == null ? v02 : stargiftattributebackdrop2.text_color | (-16777216);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[2];
                i10 = i0.a.d(this.p0, i14, stargiftattributebackdrop3 == null ? v02 : stargiftattributebackdrop3.text_color | (-16777216));
            }
            g90Var.setTextColor(i10);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[i13];
            FrameLayout.LayoutParams[] layoutParamsArr = this.h;
            if (stargiftattributebackdrop4 != null) {
                z4 = (AndroidUtilities.dp(184.0f) == layoutParamsArr[i13].topMargin && viewArr[i13].getPaddingBottom() == AndroidUtilities.dp(18.0f)) ? false : true;
                if (z4) {
                    viewArr[i13].setPadding(0, 0, 0, AndroidUtilities.dp(18.0f));
                    layoutParamsArr[i13].topMargin = AndroidUtilities.dp(184.0f);
                }
            } else {
                z4 = (AndroidUtilities.dp(170.0f) == layoutParamsArr[i13].topMargin && viewArr[i13].getPaddingBottom() == AndroidUtilities.dp(3.0f)) ? false : true;
                if (z4) {
                    viewArr[i13].setPadding(0, 0, 0, AndroidUtilities.dp(3.0f));
                    layoutParamsArr[i13].topMargin = AndroidUtilities.dp(170.0f);
                }
            }
            LinearLayout.LayoutParams[] layoutParamsArr2 = this.B;
            layoutParamsArr2[i13].topMargin = AndroidUtilities.dp((i13 == 1 ? 7.33f : stargiftattributebackdropArr[0] == null ? 9.0f : 5.66f) - 4.0f);
            if (z4) {
                viewArr[i13].setLayoutParams(layoutParamsArr[i13]);
                if (i13 == 0) {
                    this.x.setLayoutParams(layoutParamsArr2[i13]);
                } else {
                    g90VarArr[i13].setLayoutParams(layoutParamsArr2[i13]);
                }
            }
            i13++;
        }
        int dp = AndroidUtilities.dp(24.0f);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop5 = stargiftattributebackdropArr[0];
        this.v.setBackground(org.telegram.ui.ActionBar.k6.b0(dp, stargiftattributebackdrop5 == null ? 553648127 : i0.a.d(0.25f, stargiftattributebackdrop5.edge_color | (-16777216), stargiftattributebackdrop5.pattern_color | (-16777216))));
        g90 g90Var2 = g90VarArr[2];
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop6 = stargiftattributebackdropArr[0];
        if (stargiftattributebackdrop6 != null) {
            v02 = stargiftattributebackdrop6.text_color | (-16777216);
        }
        g90Var2.setTextColor(v02);
        org.telegram.ui.Components.p9[] p9VarArr = this.d;
        org.telegram.ui.Components.p9 p9Var = p9VarArr[0];
        c5.d dVar2 = this.R;
        p9Var.setAlpha(Math.max((dVar2.b(0) && dVar2.b(2)) ? 1.0f : Math.max(dVar2.a(0), dVar2.a(2)), this.R.a(3)));
        p9VarArr[1].setAlpha((1.0f - this.p0) * dVar.a(1));
        p9VarArr[2].setAlpha(dVar.a(1) * this.p0);
        float lerp3 = AndroidUtilities.lerp(1.0f, this.d0, dVar.a(2));
        FrameLayout frameLayout = this.b;
        frameLayout.setScaleX(lerp3);
        frameLayout.setScaleY(AndroidUtilities.lerp(1.0f, this.d0, dVar.a(2)));
        frameLayout.setTranslationX(dVar.a(2) * this.b0);
        frameLayout.setTranslationY((dVar.a(2) * this.c0) + (dVar.a(1) * AndroidUtilities.dp(16.0f)));
        View view = viewArr[2];
        int i15 = dVar.a;
        if (i15 == 2 && i12 == 2) {
            a2 = 0.0f;
        } else {
            if (i15 != 2) {
                i12 = i15;
            }
            a2 = (1.0f - dVar.a(2)) * (-(viewArr[i12].getMeasuredHeight() - viewArr[2].getMeasuredHeight()));
        }
        view.setTranslationY(a2);
        int i16 = (this.W && this.R.b(0)) ? 0 : 8;
        lh.y1 y1Var = this.n;
        y1Var.setVisibility(i16);
        y1Var.setAlpha(this.R.a(0));
        int i17 = dVar.a(4) <= 0.0f ? 8 : 0;
        f4 f4Var = this.I;
        f4Var.setVisibility(i17);
        f4Var.setAlpha(dVar.a(4));
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
        int[] iArr3;
        float f13;
        c5 c5Var;
        Canvas canvas2;
        u4 u4Var;
        float realHeight = getRealHeight();
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), realHeight);
        float width = getWidth() / 2.0f;
        float dp = AndroidUtilities.dp(80.0f) + AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), this.R.a(1));
        c5.d dVar = this.R;
        float max = ((dVar.b(0) && dVar.b(2)) || (dVar.b(2) && dVar.b(3)) || (dVar.b(3) && dVar.b(0))) ? 1.0f : Math.max(dVar.a(0), Math.max(dVar.a(2), dVar.a(3)));
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr2 = this.S;
        if (max <= 0.0f || stargiftattributebackdropArr2[0] == null) {
            stargiftattributebackdropArr = stargiftattributebackdropArr2;
        } else {
            if (this.j0 == null || this.R.a(2) < 1.0f) {
                Paint[] paintArr = this.g0;
                paintArr[0].setAlpha((int) (max * 255.0f));
                Matrix[] matrixArr = this.i0;
                matrixArr[0].reset();
                matrixArr[0].postTranslate(width, dp);
                this.h0[0].setLocalMatrix(matrixArr[0]);
                stargiftattributebackdropArr = stargiftattributebackdropArr2;
                canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, paintArr[0]);
            } else {
                stargiftattributebackdropArr = stargiftattributebackdropArr2;
            }
            if (this.j0 != null && this.R.a(2) > 0.0f) {
                int a2 = (int) (this.R.a(2) * 255.0f);
                Paint paint = this.l0;
                paint.setAlpha(a2);
                Matrix matrix = this.k0;
                matrix.reset();
                matrix.postTranslate(getWidth() / 2.0f, 0.4f * realHeight);
                this.j0.setLocalMatrix(matrix);
                canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, paint);
            }
        }
        if (this.R.a(1) > 0.0f) {
            f10 = width;
            f11 = dp;
            j(b(canvas, f10, f11, getWidth(), realHeight));
        } else {
            f10 = width;
            f11 = dp;
        }
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[0];
        int[] iArr4 = this.w0;
        int[] iArr5 = this.v0;
        int[] iArr6 = this.u0;
        if (stargiftattributebackdrop != null) {
            for (int i10 = 0; i10 < iArr6.length; i10++) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[0];
                iArr5[i10] = stargiftattributebackdrop2.text_color | (-16777216);
                iArr6[i10] = i0.a.d(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216));
                iArr4[i10] = stargiftattributebackdropArr[0].pattern_color | (-16777216);
            }
        }
        u4 u4Var2 = this.c;
        if (u4Var2.s == null && u4Var2.v == null && u4Var2.w == null) {
            c5Var = this;
            f13 = f10;
            f12 = f11;
            iArr3 = iArr4;
            iArr = iArr5;
            iArr2 = iArr6;
            u4Var = u4Var2;
            canvas2 = canvas;
        } else {
            float width2 = getWidth();
            float f14 = f10;
            o4 o4Var = u4Var2.s;
            float f15 = f11;
            float f16 = u4Var2.x;
            int[] iArr7 = this.v0;
            int[] iArr8 = this.u0;
            int[] iArr9 = this.w0;
            f12 = f15;
            iArr = iArr5;
            iArr2 = iArr6;
            iArr3 = iArr4;
            f13 = f14;
            c5Var = this;
            canvas2 = canvas;
            u4Var2.a(canvas2, o4Var, f16, width2, realHeight, iArr7, iArr8, iArr9);
            u4Var2.a(canvas2, u4Var2.v, u4Var2.y, width2, realHeight, iArr7, iArr8, iArr9);
            u4Var2.a(canvas2, u4Var2.w, u4Var2.B, width2, realHeight, iArr7, iArr8, iArr9);
            u4Var = u4Var2;
            c5Var.invalidate();
        }
        if (max > 0.0f && stargiftattributebackdropArr[0] != null) {
            int i11 = iArr3[iArr3.length / 2];
            c5.d dVar2 = c5Var.R;
            float max2 = (dVar2.b(0) && dVar2.b(3)) ? 1.0f : Math.max(dVar2.a(0), dVar2.a(3));
            org.telegram.ui.Components.j5[] j5VarArr = c5Var.n0;
            if (max2 > 0.0f) {
                canvas2.save();
                canvas2.translate(f13, f12);
                j5VarArr[0].k(Integer.valueOf(i11));
                w0.a(canvas, 0, j5VarArr[0], c5Var.getWidth(), realHeight, max2, 1.0f);
                realHeight = realHeight;
                canvas.restore();
            }
            if (c5Var.R.a(2) > 0.0f) {
                canvas.save();
                j5VarArr[0].k(Integer.valueOf(i11));
                float f17 = realHeight;
                RectF rectF = AndroidUtilities.rectTmp;
                LinearLayout[] linearLayoutArr = c5Var.f;
                float x10 = linearLayoutArr[2].getX();
                FrameLayout frameLayout = c5Var.G;
                float x11 = frameLayout.getX() + x10;
                org.telegram.ui.Components.p9 p9Var = c5Var.H;
                rectF.set(p9Var.getX() + x11, p9Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY(), p9Var.getX() + frameLayout.getX() + linearLayoutArr[2].getX() + p9Var.getWidth(), p9Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY() + p9Var.getHeight());
                w0.c(canvas, j5VarArr[0], c5Var.getWidth(), f17 * 0.7f, 1.0f, rectF, c5Var.R.a(2));
                canvas2 = canvas;
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            ag.l[] lVarArr = c5Var.F;
            int length = lVarArr.length;
            int i12 = 0;
            while (i12 < length) {
                ag.l lVar = lVarArr[i12];
                int[] iArr10 = iArr2;
                if (org.telegram.ui.ActionBar.k6.B1(lVar.getBackground(), iArr10[Utilities.clamp(Math.round((((lVar.getWidth() / 2.0f) + lVar.getX()) / c5Var.getWidth()) * (iArr10.length - 1)), iArr10.length - 1, 0)], false)) {
                    lVar.invalidate();
                }
                i12++;
                iArr2 = iArr10;
            }
            int[] iArr11 = iArr;
            int[] iArr12 = iArr2;
            int i13 = iArr11[iArr11.length / 2];
            int i14 = iArr12[iArr12.length / 2];
            TextView textView = c5Var.v;
            if (textView != null && c5Var.w != i13) {
                c5Var.w = i13;
                textView.setTextColor(i13);
                org.telegram.ui.ActionBar.k6.B1(textView.getBackground(), i14, false);
            }
            if (u4Var.s != null || u4Var.v != null || u4Var.w != null) {
                c5Var.y[0].setTextColor(i13);
            }
            if (c5Var.R.a(2) > 0.0f) {
                if (c5Var.t0 == null) {
                    c5Var.t0 = new wa(1, 12);
                }
                FrameLayout frameLayout2 = c5Var.b;
                float measuredWidth = (frameLayout2.getMeasuredWidth() / 2.0f) + frameLayout2.getX();
                float scaleX = (frameLayout2.getScaleX() * frameLayout2.getMeasuredWidth()) / 2.0f;
                float measuredHeight = (frameLayout2.getMeasuredHeight() / 2.0f) + frameLayout2.getY();
                float scaleY = (frameLayout2.getScaleY() * frameLayout2.getMeasuredHeight()) / 2.0f;
                float f18 = measuredHeight + scaleY;
                RectF rectF2 = c5Var.s0;
                rectF2.set(measuredWidth - scaleX, measuredHeight - scaleY, measuredWidth + scaleX, f18);
                c5Var.t0.g(rectF2);
                c5Var.t0.d();
                c5Var.t0.a(canvas2, org.telegram.ui.ActionBar.k6.l1(c5Var.R.a(2), -1));
                c5Var.invalidate();
            }
        }
        if (c5Var.R.a(1) > 0.0f) {
            c5Var.c(canvas2, f13, f12, c5Var.getWidth(), c5Var.getRealHeight());
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
        RadialGradient[] radialGradientArr = this.h0;
        radialGradientArr[i10] = radialGradient;
        if (i10 == 0) {
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(168.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, tileMode);
            this.j0 = radialGradient2;
            this.l0.setShader(radialGradient2);
        }
        Matrix[] matrixArr = this.i0;
        if (matrixArr[i10] == null) {
            matrixArr[i10] = new Matrix();
        }
        this.g0[i10].setShader(radialGradientArr[i10]);
    }

    public final void f(TL_stars.StarGift starGift, boolean z4, boolean z10, boolean z11) {
        this.J = false;
        boolean z12 = z4 || z10;
        boolean z13 = starGift instanceof TL_stars.TL_starGiftUnique;
        ob1 ob1Var = this.E;
        g90[] g90VarArr = this.y;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.S;
        if (z13) {
            stargiftattributebackdropArr[0] = (TL_stars.starGiftAttributeBackdrop) t7.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            g(0, (TL_stars.starGiftAttributePattern) t7.l(starGift.attributes, TL_stars.starGiftAttributePattern.class), false);
            g90VarArr[0].setTextSize(1, 13.0f);
            ob1Var.setVisibility(z12 ? 0 : 8);
            ag.l[] lVarArr = this.F;
            if (z12) {
                lVarArr[1].b(z11 ? R.drawable.filled_crown_off : R.drawable.filled_crown_on, LocaleController.getString(z11 ? R.string.Gift2ActionWearOff : R.string.Gift2ActionWear), false);
            }
            float f10 = 1.0f;
            if (starGift.resell_amount != null) {
                this.J = true;
                boolean z14 = starGift.resale_ton_only;
                mf.b bVar = mf.b.b;
                mf.a resellAmount = starGift.getResellAmount(z14 ? bVar : mf.b.a);
                CharSequence formatSpannable = LocaleController.formatSpannable(R.string.GiftOnSale, ja.S0("⭐️ " + ((Object) ja.J0(resellAmount.o(), 1.0f, ',')), resellAmount.a == bVar), Float.valueOf(0.9f));
                TextView textView = this.K;
                textView.setText(formatSpannable);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[0];
                textView.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(12.0f), i0.a.d(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216))));
                if (g5.N1(UserConfig.selectedAccount, DialogObject.getPeerDialogId(starGift.owner_id))) {
                    textView.setOnClickListener(new x4(this, 1));
                    k7.e6.a(textView);
                } else {
                    textView.setOnClickListener(null);
                    textView.setStateListAnimator(null);
                }
            }
            if (z4) {
                lVarArr[0].setAlpha(1.0f);
                lVarArr[0].b(R.drawable.filled_gift_transfer, LocaleController.getString(R.string.Gift2ActionTransfer), false);
            } else {
                lVarArr[0].setAlpha(0.5f);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("L ");
                spannableStringBuilder.setSpan(new oq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Gift2ActionTransfer));
                lVarArr[0].b(R.drawable.filled_gift_transfer, spannableStringBuilder, false);
            }
            ag.l lVar = lVarArr[1];
            if (!z4 && !z10) {
                f10 = 0.5f;
            }
            lVar.setAlpha(f10);
            if (z4) {
                ArrayList<TL_stars.StarsAmount> arrayList = starGift.resell_amount;
                View.OnClickListener onClickListener = this.P;
                if (arrayList != null) {
                    lVarArr[2].b(R.drawable.filled_gift_sell_off, LocaleController.getString(R.string.Gift2ActionUnlist), false);
                    lVarArr[2].setOnClickListener(onClickListener);
                } else {
                    lVarArr[2].b(R.drawable.filled_gift_sell_on, LocaleController.getString(R.string.Gift2ActionResell), false);
                    lVarArr[2].setOnClickListener(onClickListener);
                }
            } else {
                lVarArr[2].b(R.drawable.filled_share, LocaleController.getString(R.string.Gift2ActionShare), false);
                lVarArr[2].setOnClickListener(this.O);
            }
            this.W = starGift.crafted;
            this.n.a.d(stargiftattributebackdropArr[0], false, true);
        } else {
            stargiftattributebackdropArr[0] = null;
            g90VarArr[0].setTextSize(1, 14.0f);
            this.W = false;
            ob1Var.setVisibility(8);
        }
        e(0, stargiftattributebackdropArr[0]);
        ja.a1(this.d[0].getImageReceiver(), starGift, 160);
        this.e[0] = (TL_stars.starGiftAttributeModel) t7.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
        d(this.R);
    }

    public final void g(int i10, TL_stars.starGiftAttributePattern stargiftattributepattern, boolean z4) {
        if (stargiftattributepattern != null) {
            TL_stars.starGiftAttributePattern[] stargiftattributepatternArr = this.m0;
            if (stargiftattributepatternArr[i10] == stargiftattributepattern) {
                return;
            }
            stargiftattributepatternArr[i10] = stargiftattributepattern;
            this.n0[i10].i(stargiftattributepattern.document, z4);
        }
    }

    public int getFinalHeight() {
        int dp;
        int measuredHeight;
        boolean d = this.R.d(0);
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.S;
        LinearLayout[] linearLayoutArr = this.f;
        if (d) {
            return linearLayoutArr[0].getMeasuredHeight() + AndroidUtilities.dp(160.0f) + AndroidUtilities.dp(stargiftattributebackdropArr[0] != null ? 24.0f : 10.0f);
        }
        if (this.R.d(1)) {
            return linearLayoutArr[1].getMeasuredHeight() + AndroidUtilities.dp(160.0f) + AndroidUtilities.dp(stargiftattributebackdropArr[1] != null ? 24.0f : 10.0f);
        }
        if (this.R.d(2)) {
            dp = AndroidUtilities.dp(64.0f);
            measuredHeight = linearLayoutArr[2].getMeasuredHeight();
        } else {
            if (!this.R.d(3)) {
                if (!this.R.d(4)) {
                    return 0;
                }
                f4 f4Var = this.I;
                return f4Var.getMeasuredHeight() > 0 ? f4Var.getMeasuredHeight() : AndroidUtilities.dp(550.0f);
            }
            dp = AndroidUtilities.dp(160.0f);
            measuredHeight = linearLayoutArr[3].getMeasuredHeight();
        }
        return measuredHeight + dp;
    }

    public float getRealHeight() {
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.S;
        int dp = AndroidUtilities.dp(160.0f) + AndroidUtilities.dp(stargiftattributebackdropArr[0] != null ? 24.0f : 10.0f);
        LinearLayout[] linearLayoutArr = this.f;
        return (this.R.a(4) * (this.I.getMeasuredHeight() > 0 ? r1.getMeasuredHeight() : AndroidUtilities.dp(550.0f))) + (this.R.a(3) * (linearLayoutArr[3].getMeasuredHeight() + AndroidUtilities.dp(160.0f) + AndroidUtilities.dp(stargiftattributebackdropArr[0] != null ? 24.0f : 10.0f))) + (this.R.a(2) * (linearLayoutArr[2].getMeasuredHeight() + AndroidUtilities.dp(64.0f))) + (this.R.a(1) * (linearLayoutArr[1].getMeasuredHeight() + AndroidUtilities.dp(160.0f) + AndroidUtilities.dp(stargiftattributebackdropArr[1] != null ? 24.0f : 10.0f))) + (this.R.a(0) * (linearLayoutArr[0].getMeasuredHeight() + dp)) + 0.0f;
    }

    public TL_stars.starGiftAttributeBackdrop getUpgradeBackdropAttribute() {
        float f10 = this.p0;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.S;
        return f10 > 0.5f ? stargiftattributebackdropArr[2] : stargiftattributebackdropArr[1];
    }

    public org.telegram.ui.Components.p9 getUpgradeImageView() {
        float f10 = this.p0;
        org.telegram.ui.Components.p9[] p9VarArr = this.d;
        return f10 > 0.5f ? p9VarArr[2] : p9VarArr[1];
    }

    public TL_stars.starGiftAttributeModel getUpgradeImageViewAttribute() {
        float f10 = this.p0;
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
        return f10 > 0.5f ? stargiftattributemodelArr[2] : stargiftattributemodelArr[1];
    }

    public TL_stars.starGiftAttributePattern getUpgradePatternAttribute() {
        return this.m0[1];
    }

    public final void h(int i10, CharSequence charSequence, CharSequence charSequence2, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence3, TLObject tLObject, Spannable spannable) {
        this.r[i10].setText(charSequence);
        FrameLayout frameLayout = this.x;
        g90[] g90VarArr = this.y;
        g90 g90Var = this.s;
        TextView textView = this.v;
        if (i10 == 0 && !TextUtils.isEmpty(spannableStringBuilder)) {
            textView.setText(spannableStringBuilder);
            textView.setVisibility(0);
            g90Var.setVisibility(8);
            if (i10 == 0) {
                frameLayout.setVisibility(8);
            } else {
                g90VarArr[i10].setVisibility(8);
            }
        } else if (i10 != 0 || TextUtils.isEmpty(charSequence3)) {
            g90VarArr[i10].setText(charSequence2);
            if (i10 == 0) {
                frameLayout.setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
            } else {
                g90VarArr[i10].setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
            }
            g90Var.setVisibility(8);
            textView.setVisibility(8);
        } else {
            g90Var.setText(charSequence3);
            g90Var.setVisibility(0);
            textView.setVisibility(8);
            if (i10 == 0) {
                frameLayout.setVisibility(8);
            } else {
                g90VarArr[i10].setVisibility(8);
            }
        }
        lh.w0[] w0VarArr = this.C;
        lh.w0 w0Var = w0VarArr[i10];
        if (w0Var != null) {
            w0Var.setVisibility(TextUtils.isEmpty(spannable) ? 8 : 0);
            w0VarArr[i10].setUser(tLObject);
            w0VarArr[i10].setMessage(spannable);
        }
    }

    public final void i(int i10, String str, CharSequence charSequence, SpannableStringBuilder spannableStringBuilder) {
        h(i10, str, charSequence, null, spannableStringBuilder, null, null);
    }

    public final void k() {
        this.d0 = AndroidUtilities.dpf2(33.33f) / AndroidUtilities.dpf2(160.0f);
        float f10 = -this.b.getLeft();
        g90[] g90VarArr = this.r;
        this.b0 = ((((Math.min(g90VarArr[2].getPaint().measureText(g90VarArr[2].getText().toString()), g90VarArr[2].getWidth()) + g90VarArr[2].getWidth()) / 2.0f) + (g90VarArr[2].getX() + f10)) + AndroidUtilities.dp(24.0f)) - (AndroidUtilities.dp(126.67f) / 2.0f);
        this.c0 = (AndroidUtilities.dp(124.0f) + (-r0.getTop())) - (AndroidUtilities.dp(126.67f) / 2.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.j5[] j5VarArr = this.n0;
        j5VarArr[0].a();
        j5VarArr[1].a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.j5[] j5VarArr = this.n0;
        j5VarArr[0].b();
        j5VarArr[1].b();
        AndroidUtilities.cancelRunOnUIThread(this.f0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        if (this.R.b(2)) {
            k();
            d(this.R);
        }
    }

    public void setPreviewAttributes(e1 e1Var) {
        c5.d dVar = this.R;
        if (dVar != null && dVar.b == 1 && isAttachedToWindow()) {
            AndroidUtilities.cancelRunOnUIThread(this.f0);
            ValueAnimator valueAnimator = this.e0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.e0 = null;
            }
            int i10 = 1 - this.o0;
            this.o0 = i10;
            org.telegram.ui.Components.p9[] p9VarArr = this.d;
            hj0 lottieAnimation = p9VarArr[2 - i10].getImageReceiver().getLottieAnimation();
            hj0 lottieAnimation2 = p9VarArr[this.o0 + 1].getImageReceiver().getLottieAnimation();
            if (lottieAnimation2 != null && lottieAnimation != null) {
                lottieAnimation2.Q(lottieAnimation.r(), false);
            }
            int i11 = this.o0 + 1;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = e1Var.a;
            this.S[i11] = stargiftattributebackdrop;
            e(i11, stargiftattributebackdrop);
            g(1, e1Var.b, true);
            int i12 = this.o0 + 1;
            TL_stars.starGiftAttributeModel stargiftattributemodel = e1Var.c;
            TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
            stargiftattributemodelArr[i12] = stargiftattributemodel;
            ja.Z0(p9VarArr[i12].getImageReceiver(), stargiftattributemodelArr[this.o0 + 1].document, 160);
            a();
            float f10 = this.o0;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f10, f10);
            this.e0 = ofFloat;
            ofFloat.addUpdateListener(new y4(this, 0));
            this.e0.addListener(new a5(this, 3));
            this.e0.setDuration(320L);
            this.e0.setInterpolator(pr.h);
            this.e0.start();
        }
    }

    public void setPreviewingAttributes(ArrayList<TL_stars.StarGiftAttribute> arrayList) {
        this.T = new com.google.android.gms.common.api.internal.r(t7.m(arrayList, TL_stars.starGiftAttributeModel.class));
        this.U = new com.google.android.gms.common.api.internal.r(t7.m(arrayList, TL_stars.starGiftAttributePattern.class));
        this.V = new com.google.android.gms.common.api.internal.r(t7.m(arrayList, TL_stars.starGiftAttributeBackdrop.class));
        this.y[1].setTextSize(1, 14.0f);
        this.E.setVisibility(8);
        this.p0 = 0.0f;
        this.o0 = 0;
        g(1, (TL_stars.starGiftAttributePattern) this.U.c(), true);
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) this.T.c();
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
        stargiftattributemodelArr[1] = stargiftattributemodel;
        org.telegram.ui.Components.p9[] p9VarArr = this.d;
        ja.Z0(p9VarArr[1].getImageReceiver(), stargiftattributemodelArr[1].document, 160);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) this.V.c();
        this.S[1] = stargiftattributebackdrop;
        e(1, stargiftattributebackdrop);
        stargiftattributemodelArr[2] = (TL_stars.starGiftAttributeModel) this.T.f;
        ja.Z0(p9VarArr[2].getImageReceiver(), stargiftattributemodelArr[2].document, 160);
        lh.c3 c3Var = this.f0;
        AndroidUtilities.cancelRunOnUIThread(c3Var);
        AndroidUtilities.runOnUIThread(c3Var, 2500L);
        invalidate();
    }

    public void setResellPrice(mf.a aVar) {
        boolean k10 = aVar.k();
        this.J = !k10;
        g90[] g90VarArr = this.y;
        TextView textView = this.K;
        if (k10) {
            ViewPropertyAnimator duration = textView.animate().scaleX(0.4f).scaleY(0.4f).alpha(0.0f).setDuration(420L);
            pr prVar = pr.h;
            duration.setInterpolator(prVar).setListener(new a5(this, 2)).setListener(new a5(this, 1)).start();
            g90VarArr[0].animate().alpha(1.0f).setDuration(420L).setInterpolator(prVar).start();
        } else {
            textView.setText(LocaleController.formatSpannable(R.string.GiftOnSale, ja.U0(aVar.a == mf.b.b, "⭐️ " + ((Object) ja.J0(aVar.o(), 1.0f, ',')), 0.9f, null, 0.0f, 1.0f)));
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.S[0];
            textView.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(12.0f), i0.a.d(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216))));
            textView.setVisibility(0);
            this.a0 = true;
            ViewPropertyAnimator duration2 = textView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(420L);
            pr prVar2 = pr.h;
            duration2.setInterpolator(prVar2).setListener(new a5(this, 0)).start();
            g90VarArr[0].animate().alpha(0.0f).setDuration(420L).setInterpolator(prVar2).start();
        }
        boolean z4 = this.J;
        ag.l[] lVarArr = this.F;
        if (z4) {
            lVarArr[2].b(R.drawable.filled_gift_sell_off, LocaleController.getString(R.string.Gift2ActionUnlist), true);
        } else {
            lVarArr[2].b(R.drawable.filled_gift_sell_on, LocaleController.getString(R.string.Gift2ActionResell), true);
        }
        lVarArr[2].setOnClickListener(this.P);
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
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        z8Var.p(tLObject);
        this.H.e(tLObject, z8Var);
        this.r[2].setText(str2);
        this.y[2].setText(str);
        k();
        d(this.R);
    }

    public void j(int i10) {
    }
}
