package hh;

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
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.p80;
import org.telegram.ui.ra1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class e5 extends FrameLayout {
    public final LinearLayout.LayoutParams[] A;
    public final gh.z0[] B;
    public final TextPaint C;
    public final ra1 D;
    public final ag.y1[] E;
    public final FrameLayout F;
    public final org.telegram.ui.Components.n9 G;
    public final g4 H;
    public boolean I;
    public final TextView J;
    public final ImageView K;
    public final ImageView L;
    public final ImageView M;
    public final View.OnClickListener N;
    public final View.OnClickListener O;
    public final View.OnClickListener P;
    public j4 Q;
    public final TL_stars.starGiftAttributeBackdrop[] R;
    public com.google.android.gms.common.api.internal.r S;
    public com.google.android.gms.common.api.internal.r T;
    public com.google.android.gms.common.api.internal.r U;
    public boolean V;
    public boolean W;
    public final org.telegram.ui.ActionBar.c6 a;
    public float a0;
    public final FrameLayout b;
    public float b0;
    public final w4 c;
    public float c0;
    public final org.telegram.ui.Components.n9[] d;
    public ValueAnimator d0;
    public final TL_stars.starGiftAttributeModel[] e;
    public final f2.r e0;
    public final LinearLayout[] f;
    public final Paint[] f0;
    public final RadialGradient[] g0;
    public final FrameLayout.LayoutParams[] h;
    public final Matrix[] h0;
    public RadialGradient i0;
    public final Matrix j0;
    public final Paint k0;
    public final TL_stars.starGiftAttributePattern[] l0;
    public final org.telegram.ui.Components.i5[] m0;
    public final gh.c2 n;
    public int n0;
    public float o0;
    public float p0;
    public ValueAnimator q0;
    public final p80[] r;
    public final RectF r0;
    public final p80 s;
    public bb s0;
    public final int[] t0;
    public final int[] u0;
    public final TextView v;
    public final int[] v0;
    public int w;
    public final FrameLayout x;
    public final p80[] y;

    public e5(Context context, org.telegram.ui.ActionBar.c6 c6Var, Runnable runnable, View.OnClickListener onClickListener, n1 n1Var, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, View.OnClickListener onClickListener4, View.OnClickListener onClickListener5, View.OnClickListener onClickListener6) {
        super(context);
        float f10;
        this.d = new org.telegram.ui.Components.n9[5];
        this.e = new TL_stars.starGiftAttributeModel[3];
        this.f = new LinearLayout[5];
        this.h = new FrameLayout.LayoutParams[5];
        this.r = new p80[5];
        this.y = new p80[5];
        this.A = new LinearLayout.LayoutParams[5];
        this.B = new gh.z0[5];
        this.Q = new j4(0, 0);
        this.R = new TL_stars.starGiftAttributeBackdrop[3];
        this.e0 = new f2.r(this, 26);
        this.f0 = new Paint[3];
        this.g0 = new RadialGradient[3];
        this.h0 = new Matrix[3];
        this.j0 = new Matrix();
        this.k0 = new Paint(1);
        this.l0 = new TL_stars.starGiftAttributePattern[2];
        this.m0 = new org.telegram.ui.Components.i5[2];
        int i10 = 0;
        while (true) {
            Paint[] paintArr = this.f0;
            if (i10 >= paintArr.length) {
                break;
            }
            paintArr[i10] = new Paint(1);
            i10++;
        }
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.i5[] i5VarArr = this.m0;
            if (i11 >= i5VarArr.length) {
                break;
            }
            i5VarArr[i11] = new org.telegram.ui.Components.i5(AndroidUtilities.dp(28.0f), this);
            i11++;
        }
        this.p0 = 1.0f;
        this.r0 = new RectF();
        this.t0 = new int[12];
        this.u0 = new int[12];
        this.v0 = new int[12];
        this.a = c6Var;
        this.N = onClickListener4;
        this.O = onClickListener5;
        this.P = onClickListener6;
        setWillNotDraw(false);
        this.b = new FrameLayout(context);
        int i12 = 0;
        while (true) {
            org.telegram.ui.Components.n9[] n9VarArr = this.d;
            float f11 = 0.0f;
            if (i12 >= n9VarArr.length) {
                break;
            }
            n9VarArr[i12] = new b5(context, 0);
            this.d[i12].setLayerNum(6660);
            if (i12 > 0) {
                this.d[i12].getImageReceiver().setCrossfadeDuration(1);
            }
            this.b.addView(this.d[i12], h7.z5.e(-1, -1, 119));
            org.telegram.ui.Components.n9 n9Var = this.d[i12];
            if (i12 == 0) {
                f11 = 1.0f;
            }
            n9Var.setAlpha(f11);
            i12++;
        }
        p80 p80Var = new p80(context, null);
        this.s = p80Var;
        p80Var.setTextSize(1, 12.0f);
        p80Var.setGravity(17);
        p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var));
        p80Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        TextView textView = new TextView(context);
        this.v = textView;
        textView.setOnClickListener(new z4(this, 0));
        h7.b6.b(textView, 0.05f, 1.25f);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        textView.setLinkTextColor(-1);
        textView.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        TextView textView2 = new TextView(context);
        this.J = textView2;
        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        textView2.setTextSize(1, 13.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setAlpha(0.0f);
        textView2.setScaleX(0.4f);
        textView2.setScaleY(0.4f);
        textView2.setVisibility(8);
        textView2.setGravity(17);
        h7.b6.a(textView2);
        ra1 ra1Var = new ra1(this, context, 3);
        this.D = ra1Var;
        ra1Var.setOrientation(0);
        this.E = new ag.y1[3];
        int i13 = 0;
        while (true) {
            ag.y1[] y1VarArr = this.E;
            if (i13 >= y1VarArr.length) {
                break;
            }
            ag.y1 y1Var = new ag.y1(context, 2);
            ImageView imageView = new ImageView(context);
            y1Var.b = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            y1Var.addView(imageView, h7.z5.d(24, 24.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
            TextView textView3 = new TextView(context);
            y1Var.c = textView3;
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setTextSize(1, 12.0f);
            textView3.setTextColor(-1);
            textView3.setGravity(17);
            y1Var.addView(textView3, h7.z5.d(-1, -2.0f, 49, 4.0f, 35.0f, 4.0f, 0.0f));
            y1VarArr[i13] = y1Var;
            if (i13 == 0) {
                this.E[i13].b(R.drawable.filled_gift_transfer, LocaleController.getString(R.string.Gift2ActionTransfer), false);
                this.E[i13].setOnClickListener(onClickListener2);
            } else if (i13 == 1) {
                this.E[i13].b(R.drawable.filled_crown_on, LocaleController.getString(R.string.Gift2ActionWear), false);
                this.E[i13].setOnClickListener(onClickListener3);
            } else if (i13 == 2) {
                this.E[i13].b(R.drawable.filled_share, LocaleController.getString(R.string.Gift2ActionShare), false);
                this.E[i13].setOnClickListener(onClickListener4);
            }
            this.E[i13].setBackground(org.telegram.ui.ActionBar.g6.Z(0, 285212671, 16, 16));
            h7.b6.b(this.E[i13], 0.075f, 1.5f);
            ra1 ra1Var2 = this.D;
            ag.y1[] y1VarArr2 = this.E;
            ra1Var2.addView(y1VarArr2[i13], h7.z5.p(0, 56, 1.0f, 119, 0, 0, i13 != y1VarArr2.length - 1 ? 11 : 0, 0));
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
                this.F = frameLayout;
                this.f[i14].addView(frameLayout, h7.z5.q(-1, 144, 119));
                org.telegram.ui.Components.n9 n9Var2 = new org.telegram.ui.Components.n9(context);
                this.G = n9Var2;
                n9Var2.setRoundRadius(AndroidUtilities.dp(41.0f));
                frameLayout.addView(n9Var2, h7.z5.d(82, 82.0f, 49, 0.0f, 2.0f, 0.0f, 0.0f));
                this.r[i14] = new p80(context, null);
                this.r[i14].setTextColor(-1);
                this.r[i14].setTextSize(1, 20.0f);
                this.r[i14].setTypeface(AndroidUtilities.bold());
                this.r[i14].setSingleLine();
                p80 p80Var2 = this.r[i14];
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                p80Var2.setEllipsize(truncateAt);
                this.r[i14].setGravity(17);
                frameLayout.addView(this.r[i14], h7.z5.d(-1, -2.0f, 49, 16.0f, 95.33f, 16.0f, 0.0f));
                this.y[i14] = new p80(context, null);
                this.y[i14].setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.j5, c6Var));
                this.y[i14].setTextSize(1, 14.0f);
                this.y[i14].setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var));
                this.y[i14].setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                this.y[i14].setDisablePaddingsOffsetY(true);
                this.y[i14].setSingleLine();
                this.y[i14].setGravity(17);
                this.y[i14].setEllipsize(truncateAt);
                frameLayout.addView(this.y[i14], h7.z5.d(-1, -2.0f, 49, 16.0f, 122.0f, 16.0f, 0.0f));
            } else if (i14 == 4) {
                g4 g4Var = new g4(context, c6Var);
                this.H = g4Var;
                this.f[i14].addView(g4Var, h7.z5.n(-1, -2));
                View view = this.f[i14];
                FrameLayout.LayoutParams[] layoutParamsArr = this.h;
                ViewGroup.LayoutParams d = h7.z5.d(-1, -2.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f);
                layoutParamsArr[i14] = d;
                addView(view, d);
                i14++;
            } else {
                this.r[i14] = new p80(context, null);
                this.r[i14].setTextColor(i14 == 3 ? -1 : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.j5, c6Var));
                this.r[i14].setTextSize(1, 20.0f);
                this.r[i14].setTypeface(AndroidUtilities.bold());
                this.r[i14].setGravity(17);
                this.f[i14].addView(this.r[i14], h7.z5.t(-1, -2, 17, 24, i14 == 3 ? 10 : 0, 24, 0));
                if (i14 == 0) {
                    this.f[i14].addView(this.s, h7.z5.t(-2, -2, 17, 0, 4, 0, 4));
                    this.f[i14].addView(this.v, h7.z5.s(-2, 17, 0, 6, 0, 19.33f, 2));
                }
                if (i14 == 0) {
                    this.y[i14] = new p80(context, null);
                    this.y[i14].setTextColor(i14 == 3 ? org.telegram.ui.ActionBar.g6.l1(0.75f, -1) : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.j5, c6Var));
                    this.y[i14].setTextSize(1, 14.0f);
                    this.y[i14].setGravity(17);
                    this.y[i14].setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var));
                    this.y[i14].setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.y[i14].setDisablePaddingsOffsetY(true);
                    this.x.addView(this.y[i14], h7.z5.e(-2, -2, 17));
                    this.x.addView(this.J, h7.z5.a(-2.0f, 20.33f, 17));
                    LinearLayout linearLayout = this.f[i14];
                    FrameLayout frameLayout2 = this.x;
                    LinearLayout.LayoutParams[] layoutParamsArr2 = this.A;
                    LinearLayout.LayoutParams t10 = h7.z5.t(-1, -2, 17, 24, 0, 24, i14 == 3 ? 6 : 0);
                    layoutParamsArr2[i14] = t10;
                    linearLayout.addView(frameLayout2, t10);
                } else {
                    this.y[i14] = new p80(context, null);
                    this.y[i14].setTextColor(i14 == 3 ? org.telegram.ui.ActionBar.g6.l1(0.75f, -1) : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.j5, c6Var));
                    this.y[i14].setTextSize(1, 14.0f);
                    this.y[i14].setGravity(17);
                    this.y[i14].setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var));
                    this.y[i14].setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.y[i14].setDisablePaddingsOffsetY(true);
                    LinearLayout linearLayout2 = this.f[i14];
                    p80 p80Var3 = this.y[i14];
                    LinearLayout.LayoutParams[] layoutParamsArr3 = this.A;
                    LinearLayout.LayoutParams t11 = h7.z5.t(-1, -2, 17, 24, 0, 24, i14 == 3 ? 6 : 0);
                    layoutParamsArr3[i14] = t11;
                    linearLayout2.addView(p80Var3, t11);
                }
                LinearLayout.LayoutParams layoutParams = this.A[i14];
                if (i14 == 3) {
                    f10 = 6.0f;
                } else {
                    f10 = (i14 == 1 ? 7.33f : this.R[0] == null ? 9.0f : 5.66f) - 4.0f;
                }
                layoutParams.topMargin = AndroidUtilities.dp(f10);
                this.B[i14] = new gh.z0(context);
                this.B[i14].setVisibility(8);
                this.B[i14].setPadding(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(2.0f));
                if (i14 == 0) {
                    this.C = this.B[i14].getTextPaint();
                }
                this.f[i14].addView(this.B[i14], h7.z5.t(-1, -2, 17, 24, 8, 24, 0));
            }
            if (i14 == 0) {
                this.f[i14].addView(this.D, h7.z5.t(-1, -2, 7, 0, 15, 0, 0));
            }
            View view2 = this.f[i14];
            FrameLayout.LayoutParams[] layoutParamsArr4 = this.h;
            ViewGroup.LayoutParams d10 = h7.z5.d(-1, -2.0f, 119, 16.0f, i14 == 2 ? 32.0f : 170.0f, 16.0f, 0.0f);
            layoutParamsArr4[i14] = d10;
            addView(view2, d10);
            i14++;
        }
        addView(this.b, h7.z5.d(160, 160.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        w4 w4Var = new w4(context);
        this.c = w4Var;
        addView(w4Var, h7.z5.d(-1, 160.0f, 55, 0.0f, 8.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.K = imageView2;
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(28.0f), 620756991));
        imageView2.setImageResource(R.drawable.msg_close);
        h7.b6.a(imageView2);
        addView(imageView2, h7.z5.d(28, 28.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        imageView2.setOnClickListener(new eg.v(2, runnable));
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.L = imageView3;
        imageView3.setImageResource(R.drawable.filled_forge);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(org.telegram.ui.ActionBar.g6.f0(553648127, 1, -1));
        h7.b6.a(imageView3);
        if (n1Var != null) {
            addView(imageView3, h7.z5.d(42, 42.0f, 53, 0.0f, 5.0f, 47.0f, 0.0f));
            imageView3.setOnClickListener(n1Var);
        }
        imageView3.setVisibility(8);
        ImageView imageView4 = new ImageView(context);
        this.M = imageView4;
        imageView4.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        imageView4.setImageResource(R.drawable.media_more);
        imageView4.setScaleType(scaleType);
        imageView4.setBackground(org.telegram.ui.ActionBar.g6.f0(553648127, 1, -1));
        h7.b6.a(imageView4);
        addView(imageView4, h7.z5.d(42, 42.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        imageView4.setOnClickListener(onClickListener);
        imageView4.setVisibility(8);
        gh.c2 c2Var = new gh.c2(context);
        this.n = c2Var;
        c2Var.b(LocaleController.getString(R.string.GiftCrafted), true);
        gh.e2 e2Var = c2Var.a;
        if (e2Var.f == null) {
            bb bbVar = new bb(2, 12);
            e2Var.f = bbVar;
            bbVar.h = 5.0f;
        }
        Path path = e2Var.c;
        float f12 = e2Var.e;
        e2Var.g = true;
        gh.e2.c(path, f12, true);
        c2Var.setScaleX(1.2f);
        c2Var.setScaleY(1.2f);
        addView(c2Var, h7.z5.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        c2Var.setVisibility(8);
    }

    public final void a() {
        ValueAnimator valueAnimator = this.q0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.q0 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.q0 = ofFloat;
        ofFloat.addUpdateListener(new a5(this, 1));
        this.q0.addListener(new c5(this, 4));
        this.q0.setDuration(320L);
        this.q0.setInterpolator(er.g);
        this.q0.start();
    }

    public final int b(Canvas canvas, float f10, float f11, float f12, float f13) {
        int i10 = this.n0;
        RadialGradient[] radialGradientArr = this.g0;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.R;
        Matrix[] matrixArr = this.h0;
        Paint[] paintArr = this.f0;
        int i11 = 0;
        if (i10 != 0) {
            if (this.o0 < 1.0f && stargiftattributebackdropArr[1] != null) {
                paintArr[1].setAlpha((int) (this.Q.a(1) * 255.0f));
                matrixArr[1].reset();
                matrixArr[1].postTranslate(f10, f11);
                radialGradientArr[1].setLocalMatrix(matrixArr[1]);
                canvas.drawRect(0.0f, 0.0f, f12, f13, paintArr[1]);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[1];
                i11 = i0.b.h(i0.b.k(i0.b.d(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216)), paintArr[1].getAlpha()), 0);
            }
            if (this.o0 <= 0.0f || stargiftattributebackdropArr[2] == null) {
                return i11;
            }
            paintArr[2].setAlpha((int) (this.Q.a(1) * 255.0f * this.o0));
            matrixArr[2].reset();
            matrixArr[2].postTranslate(f10, f11);
            radialGradientArr[2].setLocalMatrix(matrixArr[2]);
            canvas.drawRect(0.0f, 0.0f, f12, f13, paintArr[2]);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[2];
            return i0.b.h(i0.b.k(i0.b.d(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216)), paintArr[2].getAlpha()), i11);
        }
        if (this.o0 > 0.0f && stargiftattributebackdropArr[2] != null) {
            paintArr[2].setAlpha((int) (this.Q.a(1) * 255.0f));
            matrixArr[2].reset();
            matrixArr[2].postTranslate(f10, f11);
            radialGradientArr[2].setLocalMatrix(matrixArr[2]);
            canvas.drawRect(0.0f, 0.0f, f12, f13, paintArr[2]);
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[2];
            i11 = i0.b.h(i0.b.k(i0.b.d(0.25f, stargiftattributebackdrop3.edge_color | (-16777216), stargiftattributebackdrop3.pattern_color | (-16777216)), paintArr[2].getAlpha()), 0);
        }
        if (this.o0 >= 1.0f || stargiftattributebackdropArr[1] == null) {
            return i11;
        }
        paintArr[1].setAlpha((int) ((1.0f - this.o0) * this.Q.a(1) * 255.0f));
        matrixArr[1].reset();
        matrixArr[1].postTranslate(f10, f11);
        radialGradientArr[1].setLocalMatrix(matrixArr[1]);
        canvas.drawRect(0.0f, 0.0f, f12, f13, paintArr[1]);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = stargiftattributebackdropArr[1];
        return i0.b.h(i0.b.k(i0.b.d(0.25f, stargiftattributebackdrop4.edge_color | (-16777216), stargiftattributebackdrop4.pattern_color | (-16777216)), paintArr[1].getAlpha()), i11);
    }

    public final void c(Canvas canvas, float f10, float f11, float f12, float f13) {
        canvas.save();
        canvas.translate(f10, f11);
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.R;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[1];
        int i10 = stargiftattributebackdrop == null ? 0 : stargiftattributebackdrop.pattern_color | (-16777216);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[2];
        int d = i0.b.d(this.o0, i10, stargiftattributebackdrop2 != null ? stargiftattributebackdrop2.pattern_color | (-16777216) : 0);
        org.telegram.ui.Components.i5[] i5VarArr = this.m0;
        i5VarArr[1].k(Integer.valueOf(d));
        y0.a(canvas, 0, i5VarArr[1], f12, f13, this.Q.a(1), this.p0);
        canvas.restore();
    }

    public void d(j4 j4Var) {
        View[] viewArr;
        p80[] p80VarArr;
        float a2;
        int i10;
        boolean z10;
        this.Q = j4Var;
        int i11 = 0;
        while (true) {
            viewArr = this.f;
            if (i11 >= viewArr.length) {
                break;
            }
            float a3 = j4Var.a(i11);
            viewArr[i11].setAlpha(a3);
            viewArr[i11].setVisibility(a3 > 0.0f ? 0 : 4);
            i11++;
        }
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.R;
        float max = Math.max(stargiftattributebackdropArr[0] != null ? j4Var.a(2) : 0.0f, stargiftattributebackdropArr[1] != null ? j4Var.a(1) : 0.0f);
        ImageView imageView = this.K;
        imageView.setAlpha(max);
        imageView.setVisibility(((stargiftattributebackdropArr[0] == null || j4Var.c != 2) && (stargiftattributebackdropArr[1] == null || j4Var.c != 1)) ? 8 : 0);
        boolean z11 = stargiftattributebackdropArr[0] != null;
        float a10 = j4Var.a(0);
        int i12 = j4Var.c;
        float lerp = AndroidUtilities.lerp(false, z11, a10);
        ImageView imageView2 = this.M;
        imageView2.setAlpha(lerp);
        imageView2.setVisibility((stargiftattributebackdropArr[0] == null || i12 != 0) ? 8 : 0);
        if (!this.W) {
            float lerp2 = AndroidUtilities.lerp(false, this.I, j4Var.a(0));
            TextView textView = this.J;
            textView.setAlpha(lerp2);
            textView.setScaleX(AndroidUtilities.lerp(0.4f, this.I ? 1.0f : 0.4f, j4Var.a(0)));
            textView.setScaleY(AndroidUtilities.lerp(0.4f, this.I ? 1.0f : 0.4f, j4Var.a(0)));
            textView.setVisibility((this.I && i12 == 0) ? 0 : 4);
        }
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.j5, this.a);
        int i13 = 0;
        while (true) {
            p80VarArr = this.y;
            if (i13 >= 2) {
                break;
            }
            this.r[i13].setTextColor(stargiftattributebackdropArr[Math.min(1, i13)] == null ? v02 : -1);
            p80 p80Var = p80VarArr[i13];
            if (i13 == 0 || i13 == 2) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[i13];
                i10 = stargiftattributebackdrop == null ? v02 : stargiftattributebackdrop.text_color | (-16777216);
            } else {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[1];
                int i14 = stargiftattributebackdrop2 == null ? v02 : stargiftattributebackdrop2.text_color | (-16777216);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = stargiftattributebackdropArr[2];
                i10 = i0.b.d(this.o0, i14, stargiftattributebackdrop3 == null ? v02 : stargiftattributebackdrop3.text_color | (-16777216));
            }
            p80Var.setTextColor(i10);
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
            LinearLayout.LayoutParams[] layoutParamsArr2 = this.A;
            layoutParamsArr2[i13].topMargin = AndroidUtilities.dp((i13 == 1 ? 7.33f : stargiftattributebackdropArr[0] == null ? 9.0f : 5.66f) - 4.0f);
            if (z10) {
                viewArr[i13].setLayoutParams(layoutParamsArr[i13]);
                if (i13 == 0) {
                    this.x.setLayoutParams(layoutParamsArr2[i13]);
                } else {
                    p80VarArr[i13].setLayoutParams(layoutParamsArr2[i13]);
                }
            }
            i13++;
        }
        int dp = AndroidUtilities.dp(24.0f);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop5 = stargiftattributebackdropArr[0];
        this.v.setBackground(org.telegram.ui.ActionBar.g6.b0(dp, stargiftattributebackdrop5 == null ? 553648127 : i0.b.d(0.25f, stargiftattributebackdrop5.edge_color | (-16777216), stargiftattributebackdrop5.pattern_color | (-16777216))));
        p80 p80Var2 = p80VarArr[2];
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop6 = stargiftattributebackdropArr[0];
        if (stargiftattributebackdrop6 != null) {
            v02 = stargiftattributebackdrop6.text_color | (-16777216);
        }
        p80Var2.setTextColor(v02);
        org.telegram.ui.Components.n9[] n9VarArr = this.d;
        org.telegram.ui.Components.n9 n9Var = n9VarArr[0];
        j4 j4Var2 = this.Q;
        n9Var.setAlpha(Math.max((j4Var2.b(0) && j4Var2.b(2)) ? 1.0f : Math.max(j4Var2.a(0), j4Var2.a(2)), this.Q.a(3)));
        n9VarArr[1].setAlpha((1.0f - this.o0) * j4Var.a(1));
        n9VarArr[2].setAlpha(j4Var.a(1) * this.o0);
        float lerp3 = AndroidUtilities.lerp(1.0f, this.c0, j4Var.a(2));
        FrameLayout frameLayout = this.b;
        frameLayout.setScaleX(lerp3);
        frameLayout.setScaleY(AndroidUtilities.lerp(1.0f, this.c0, j4Var.a(2)));
        frameLayout.setTranslationX(j4Var.a(2) * this.a0);
        frameLayout.setTranslationY((j4Var.a(2) * this.b0) + (j4Var.a(1) * AndroidUtilities.dp(16.0f)));
        View view = viewArr[2];
        int i15 = j4Var.b;
        if (i15 == 2 && i12 == 2) {
            a2 = 0.0f;
        } else {
            if (i15 != 2) {
                i12 = i15;
            }
            a2 = (1.0f - j4Var.a(2)) * (-(viewArr[i12].getMeasuredHeight() - viewArr[2].getMeasuredHeight()));
        }
        view.setTranslationY(a2);
        int i16 = (this.V && this.Q.b(0)) ? 0 : 8;
        gh.c2 c2Var = this.n;
        c2Var.setVisibility(i16);
        c2Var.setAlpha(this.Q.a(0));
        int i17 = j4Var.a(4) <= 0.0f ? 8 : 0;
        g4 g4Var = this.H;
        g4Var.setVisibility(i17);
        g4Var.setAlpha(j4Var.a(4));
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
        e5 e5Var;
        Canvas canvas2;
        w4 w4Var;
        float realHeight = getRealHeight();
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), realHeight);
        float width = getWidth() / 2.0f;
        float dp = AndroidUtilities.dp(80.0f) + AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), this.Q.a(1));
        j4 j4Var = this.Q;
        float max = ((j4Var.b(0) && j4Var.b(2)) || (j4Var.b(2) && j4Var.b(3)) || (j4Var.b(3) && j4Var.b(0))) ? 1.0f : Math.max(j4Var.a(0), Math.max(j4Var.a(2), j4Var.a(3)));
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr2 = this.R;
        if (max <= 0.0f || stargiftattributebackdropArr2[0] == null) {
            stargiftattributebackdropArr = stargiftattributebackdropArr2;
        } else {
            if (this.i0 == null || this.Q.a(2) < 1.0f) {
                Paint[] paintArr = this.f0;
                paintArr[0].setAlpha((int) (max * 255.0f));
                Matrix[] matrixArr = this.h0;
                matrixArr[0].reset();
                matrixArr[0].postTranslate(width, dp);
                this.g0[0].setLocalMatrix(matrixArr[0]);
                stargiftattributebackdropArr = stargiftattributebackdropArr2;
                canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, paintArr[0]);
            } else {
                stargiftattributebackdropArr = stargiftattributebackdropArr2;
            }
            if (this.i0 != null && this.Q.a(2) > 0.0f) {
                int a2 = (int) (this.Q.a(2) * 255.0f);
                Paint paint = this.k0;
                paint.setAlpha(a2);
                Matrix matrix = this.j0;
                matrix.reset();
                matrix.postTranslate(getWidth() / 2.0f, 0.4f * realHeight);
                this.i0.setLocalMatrix(matrix);
                canvas.drawRect(0.0f, 0.0f, getWidth(), realHeight, paint);
            }
        }
        if (this.Q.a(1) > 0.0f) {
            f10 = width;
            f11 = dp;
            j(b(canvas, f10, f11, getWidth(), realHeight));
        } else {
            f10 = width;
            f11 = dp;
        }
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[0];
        int[] iArr4 = this.v0;
        int[] iArr5 = this.u0;
        int[] iArr6 = this.t0;
        if (stargiftattributebackdrop != null) {
            for (int i10 = 0; i10 < iArr6.length; i10++) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = stargiftattributebackdropArr[0];
                iArr5[i10] = stargiftattributebackdrop2.text_color | (-16777216);
                iArr6[i10] = i0.b.d(0.25f, stargiftattributebackdrop2.edge_color | (-16777216), stargiftattributebackdrop2.pattern_color | (-16777216));
                iArr4[i10] = stargiftattributebackdropArr[0].pattern_color | (-16777216);
            }
        }
        w4 w4Var2 = this.c;
        if (w4Var2.s == null && w4Var2.v == null && w4Var2.w == null) {
            e5Var = this;
            f13 = f10;
            f12 = f11;
            iArr3 = iArr4;
            iArr = iArr5;
            iArr2 = iArr6;
            w4Var = w4Var2;
            canvas2 = canvas;
        } else {
            float width2 = getWidth();
            float f14 = f10;
            q4 q4Var = w4Var2.s;
            float f15 = f11;
            float f16 = w4Var2.x;
            int[] iArr7 = this.u0;
            int[] iArr8 = this.t0;
            int[] iArr9 = this.v0;
            f12 = f15;
            iArr = iArr5;
            iArr2 = iArr6;
            iArr3 = iArr4;
            f13 = f14;
            e5Var = this;
            canvas2 = canvas;
            w4Var2.a(canvas2, q4Var, f16, width2, realHeight, iArr7, iArr8, iArr9);
            w4Var2.a(canvas2, w4Var2.v, w4Var2.y, width2, realHeight, iArr7, iArr8, iArr9);
            w4Var2.a(canvas2, w4Var2.w, w4Var2.A, width2, realHeight, iArr7, iArr8, iArr9);
            w4Var = w4Var2;
            e5Var.invalidate();
        }
        if (max > 0.0f && stargiftattributebackdropArr[0] != null) {
            int i11 = iArr3[iArr3.length / 2];
            j4 j4Var2 = e5Var.Q;
            float max2 = (j4Var2.b(0) && j4Var2.b(3)) ? 1.0f : Math.max(j4Var2.a(0), j4Var2.a(3));
            org.telegram.ui.Components.i5[] i5VarArr = e5Var.m0;
            if (max2 > 0.0f) {
                canvas2.save();
                canvas2.translate(f13, f12);
                i5VarArr[0].k(Integer.valueOf(i11));
                y0.a(canvas, 0, i5VarArr[0], e5Var.getWidth(), realHeight, max2, 1.0f);
                realHeight = realHeight;
                canvas.restore();
            }
            if (e5Var.Q.a(2) > 0.0f) {
                canvas.save();
                i5VarArr[0].k(Integer.valueOf(i11));
                float f17 = realHeight;
                RectF rectF = AndroidUtilities.rectTmp;
                LinearLayout[] linearLayoutArr = e5Var.f;
                float x8 = linearLayoutArr[2].getX();
                FrameLayout frameLayout = e5Var.F;
                float x10 = frameLayout.getX() + x8;
                org.telegram.ui.Components.n9 n9Var = e5Var.G;
                rectF.set(n9Var.getX() + x10, n9Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY(), n9Var.getX() + frameLayout.getX() + linearLayoutArr[2].getX() + n9Var.getWidth(), n9Var.getY() + frameLayout.getY() + linearLayoutArr[2].getY() + n9Var.getHeight());
                y0.c(canvas, i5VarArr[0], e5Var.getWidth(), f17 * 0.7f, 1.0f, rectF, e5Var.Q.a(2));
                canvas2 = canvas;
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            ag.y1[] y1VarArr = e5Var.E;
            int length = y1VarArr.length;
            int i12 = 0;
            while (i12 < length) {
                ag.y1 y1Var = y1VarArr[i12];
                int[] iArr10 = iArr2;
                if (org.telegram.ui.ActionBar.g6.B1(y1Var.getBackground(), iArr10[Utilities.clamp(Math.round((((y1Var.getWidth() / 2.0f) + y1Var.getX()) / e5Var.getWidth()) * (iArr10.length - 1)), iArr10.length - 1, 0)], false)) {
                    y1Var.invalidate();
                }
                i12++;
                iArr2 = iArr10;
            }
            int[] iArr11 = iArr;
            int[] iArr12 = iArr2;
            int i13 = iArr11[iArr11.length / 2];
            int i14 = iArr12[iArr12.length / 2];
            TextView textView = e5Var.v;
            if (textView != null && e5Var.w != i13) {
                e5Var.w = i13;
                textView.setTextColor(i13);
                org.telegram.ui.ActionBar.g6.B1(textView.getBackground(), i14, false);
            }
            if (w4Var.s != null || w4Var.v != null || w4Var.w != null) {
                e5Var.y[0].setTextColor(i13);
            }
            if (e5Var.Q.a(2) > 0.0f) {
                if (e5Var.s0 == null) {
                    e5Var.s0 = new bb(1, 12);
                }
                FrameLayout frameLayout2 = e5Var.b;
                float measuredWidth = (frameLayout2.getMeasuredWidth() / 2.0f) + frameLayout2.getX();
                float scaleX = (frameLayout2.getScaleX() * frameLayout2.getMeasuredWidth()) / 2.0f;
                float measuredHeight = (frameLayout2.getMeasuredHeight() / 2.0f) + frameLayout2.getY();
                float scaleY = (frameLayout2.getScaleY() * frameLayout2.getMeasuredHeight()) / 2.0f;
                float f18 = measuredHeight + scaleY;
                RectF rectF2 = e5Var.r0;
                rectF2.set(measuredWidth - scaleX, measuredHeight - scaleY, measuredWidth + scaleX, f18);
                e5Var.s0.g(rectF2);
                e5Var.s0.d();
                e5Var.s0.a(canvas2, org.telegram.ui.ActionBar.g6.l1(e5Var.Q.a(2), -1));
                e5Var.invalidate();
            }
        }
        if (e5Var.Q.a(1) > 0.0f) {
            e5Var.c(canvas2, f13, f12, e5Var.getWidth(), e5Var.getRealHeight());
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
        RadialGradient[] radialGradientArr = this.g0;
        radialGradientArr[i10] = radialGradient;
        if (i10 == 0) {
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(168.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, tileMode);
            this.i0 = radialGradient2;
            this.k0.setShader(radialGradient2);
        }
        Matrix[] matrixArr = this.h0;
        if (matrixArr[i10] == null) {
            matrixArr[i10] = new Matrix();
        }
        this.f0[i10].setShader(radialGradientArr[i10]);
    }

    public final void f(TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12) {
        this.I = false;
        boolean z13 = z10 || z11;
        boolean z14 = starGift instanceof TL_stars.TL_starGiftUnique;
        ra1 ra1Var = this.D;
        p80[] p80VarArr = this.y;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.R;
        if (z14) {
            stargiftattributebackdropArr[0] = (TL_stars.starGiftAttributeBackdrop) u7.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            g(0, (TL_stars.starGiftAttributePattern) u7.l(starGift.attributes, TL_stars.starGiftAttributePattern.class), false);
            p80VarArr[0].setTextSize(1, 13.0f);
            ra1Var.setVisibility(z13 ? 0 : 8);
            ag.y1[] y1VarArr = this.E;
            if (z13) {
                y1VarArr[1].b(z12 ? R.drawable.filled_crown_off : R.drawable.filled_crown_on, LocaleController.getString(z12 ? R.string.Gift2ActionWearOff : R.string.Gift2ActionWear), false);
            }
            float f10 = 1.0f;
            if (starGift.resell_amount != null) {
                this.I = true;
                boolean z15 = starGift.resale_ton_only;
                hf.b bVar = hf.b.b;
                hf.a resellAmount = starGift.getResellAmount(z15 ? bVar : hf.b.a);
                CharSequence formatSpannable = LocaleController.formatSpannable(R.string.GiftOnSale, oa.S0("⭐️ " + ((Object) oa.J0(resellAmount.o(), 1.0f, ',')), resellAmount.a == bVar), Float.valueOf(0.9f));
                TextView textView = this.J;
                textView.setText(formatSpannable);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = stargiftattributebackdropArr[0];
                textView.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(12.0f), i0.b.d(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216))));
                if (i5.N1(UserConfig.selectedAccount, DialogObject.getPeerDialogId(starGift.owner_id))) {
                    textView.setOnClickListener(new z4(this, 1));
                    h7.b6.a(textView);
                } else {
                    textView.setOnClickListener(null);
                    textView.setStateListAnimator(null);
                }
            }
            if (z10) {
                y1VarArr[0].setAlpha(1.0f);
                y1VarArr[0].b(R.drawable.filled_gift_transfer, LocaleController.getString(R.string.Gift2ActionTransfer), false);
            } else {
                y1VarArr[0].setAlpha(0.5f);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("L ");
                spannableStringBuilder.setSpan(new cq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Gift2ActionTransfer));
                y1VarArr[0].b(R.drawable.filled_gift_transfer, spannableStringBuilder, false);
            }
            ag.y1 y1Var = y1VarArr[1];
            if (!z10 && !z11) {
                f10 = 0.5f;
            }
            y1Var.setAlpha(f10);
            if (z10) {
                ArrayList<TL_stars.StarsAmount> arrayList = starGift.resell_amount;
                View.OnClickListener onClickListener = this.O;
                if (arrayList != null) {
                    y1VarArr[2].b(R.drawable.filled_gift_sell_off, LocaleController.getString(R.string.Gift2ActionUnlist), false);
                    y1VarArr[2].setOnClickListener(onClickListener);
                } else {
                    y1VarArr[2].b(R.drawable.filled_gift_sell_on, LocaleController.getString(R.string.Gift2ActionResell), false);
                    y1VarArr[2].setOnClickListener(onClickListener);
                }
            } else {
                y1VarArr[2].b(R.drawable.filled_share, LocaleController.getString(R.string.Gift2ActionShare), false);
                y1VarArr[2].setOnClickListener(this.N);
            }
            this.V = starGift.crafted;
            this.n.a.d(stargiftattributebackdropArr[0], false, true);
        } else {
            stargiftattributebackdropArr[0] = null;
            p80VarArr[0].setTextSize(1, 14.0f);
            this.V = false;
            ra1Var.setVisibility(8);
        }
        e(0, stargiftattributebackdropArr[0]);
        oa.a1(this.d[0].getImageReceiver(), starGift, 160);
        this.e[0] = (TL_stars.starGiftAttributeModel) u7.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
        d(this.Q);
    }

    public final void g(int i10, TL_stars.starGiftAttributePattern stargiftattributepattern, boolean z10) {
        if (stargiftattributepattern != null) {
            TL_stars.starGiftAttributePattern[] stargiftattributepatternArr = this.l0;
            if (stargiftattributepatternArr[i10] == stargiftattributepattern) {
                return;
            }
            stargiftattributepatternArr[i10] = stargiftattributepattern;
            this.m0[i10].i(stargiftattributepattern.document, z10);
        }
    }

    public int getFinalHeight() {
        int dp;
        int measuredHeight;
        boolean d = this.Q.d(0);
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.R;
        LinearLayout[] linearLayoutArr = this.f;
        if (d) {
            return linearLayoutArr[0].getMeasuredHeight() + AndroidUtilities.dp(160.0f) + AndroidUtilities.dp(stargiftattributebackdropArr[0] != null ? 24.0f : 10.0f);
        }
        if (this.Q.d(1)) {
            return linearLayoutArr[1].getMeasuredHeight() + AndroidUtilities.dp(160.0f) + AndroidUtilities.dp(stargiftattributebackdropArr[1] != null ? 24.0f : 10.0f);
        }
        if (this.Q.d(2)) {
            dp = AndroidUtilities.dp(64.0f);
            measuredHeight = linearLayoutArr[2].getMeasuredHeight();
        } else {
            if (!this.Q.d(3)) {
                if (!this.Q.d(4)) {
                    return 0;
                }
                g4 g4Var = this.H;
                return g4Var.getMeasuredHeight() > 0 ? g4Var.getMeasuredHeight() : AndroidUtilities.dp(550.0f);
            }
            dp = AndroidUtilities.dp(160.0f);
            measuredHeight = linearLayoutArr[3].getMeasuredHeight();
        }
        return measuredHeight + dp;
    }

    public float getRealHeight() {
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.R;
        int dp = AndroidUtilities.dp(160.0f) + AndroidUtilities.dp(stargiftattributebackdropArr[0] != null ? 24.0f : 10.0f);
        LinearLayout[] linearLayoutArr = this.f;
        return (this.Q.a(4) * (this.H.getMeasuredHeight() > 0 ? r1.getMeasuredHeight() : AndroidUtilities.dp(550.0f))) + (this.Q.a(3) * (linearLayoutArr[3].getMeasuredHeight() + AndroidUtilities.dp(160.0f) + AndroidUtilities.dp(stargiftattributebackdropArr[0] != null ? 24.0f : 10.0f))) + (this.Q.a(2) * (linearLayoutArr[2].getMeasuredHeight() + AndroidUtilities.dp(64.0f))) + (this.Q.a(1) * (linearLayoutArr[1].getMeasuredHeight() + AndroidUtilities.dp(160.0f) + AndroidUtilities.dp(stargiftattributebackdropArr[1] != null ? 24.0f : 10.0f))) + (this.Q.a(0) * (linearLayoutArr[0].getMeasuredHeight() + dp)) + 0.0f;
    }

    public TL_stars.starGiftAttributeBackdrop getUpgradeBackdropAttribute() {
        float f10 = this.o0;
        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = this.R;
        return f10 > 0.5f ? stargiftattributebackdropArr[2] : stargiftattributebackdropArr[1];
    }

    public org.telegram.ui.Components.n9 getUpgradeImageView() {
        float f10 = this.o0;
        org.telegram.ui.Components.n9[] n9VarArr = this.d;
        return f10 > 0.5f ? n9VarArr[2] : n9VarArr[1];
    }

    public TL_stars.starGiftAttributeModel getUpgradeImageViewAttribute() {
        float f10 = this.o0;
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
        return f10 > 0.5f ? stargiftattributemodelArr[2] : stargiftattributemodelArr[1];
    }

    public TL_stars.starGiftAttributePattern getUpgradePatternAttribute() {
        return this.l0[1];
    }

    public final void h(int i10, CharSequence charSequence, CharSequence charSequence2, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence3, TLObject tLObject, Spannable spannable) {
        this.r[i10].setText(charSequence);
        FrameLayout frameLayout = this.x;
        p80[] p80VarArr = this.y;
        p80 p80Var = this.s;
        TextView textView = this.v;
        if (i10 == 0 && !TextUtils.isEmpty(spannableStringBuilder)) {
            textView.setText(spannableStringBuilder);
            textView.setVisibility(0);
            p80Var.setVisibility(8);
            if (i10 == 0) {
                frameLayout.setVisibility(8);
            } else {
                p80VarArr[i10].setVisibility(8);
            }
        } else if (i10 != 0 || TextUtils.isEmpty(charSequence3)) {
            p80VarArr[i10].setText(charSequence2);
            if (i10 == 0) {
                frameLayout.setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
            } else {
                p80VarArr[i10].setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
            }
            p80Var.setVisibility(8);
            textView.setVisibility(8);
        } else {
            p80Var.setText(charSequence3);
            p80Var.setVisibility(0);
            textView.setVisibility(8);
            if (i10 == 0) {
                frameLayout.setVisibility(8);
            } else {
                p80VarArr[i10].setVisibility(8);
            }
        }
        gh.z0[] z0VarArr = this.B;
        gh.z0 z0Var = z0VarArr[i10];
        if (z0Var != null) {
            z0Var.setVisibility(TextUtils.isEmpty(spannable) ? 8 : 0);
            z0VarArr[i10].setUser(tLObject);
            z0VarArr[i10].setMessage(spannable);
        }
    }

    public final void i(int i10, String str, CharSequence charSequence, SpannableStringBuilder spannableStringBuilder) {
        h(i10, str, charSequence, null, spannableStringBuilder, null, null);
    }

    public final void k() {
        this.c0 = AndroidUtilities.dpf2(33.33f) / AndroidUtilities.dpf2(160.0f);
        float f10 = -this.b.getLeft();
        p80[] p80VarArr = this.r;
        this.a0 = ((((Math.min(p80VarArr[2].getPaint().measureText(p80VarArr[2].getText().toString()), p80VarArr[2].getWidth()) + p80VarArr[2].getWidth()) / 2.0f) + (p80VarArr[2].getX() + f10)) + AndroidUtilities.dp(24.0f)) - (AndroidUtilities.dp(126.67f) / 2.0f);
        this.b0 = (AndroidUtilities.dp(124.0f) + (-r0.getTop())) - (AndroidUtilities.dp(126.67f) / 2.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.i5[] i5VarArr = this.m0;
        i5VarArr[0].a();
        i5VarArr[1].a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.i5[] i5VarArr = this.m0;
        i5VarArr[0].b();
        i5VarArr[1].b();
        AndroidUtilities.cancelRunOnUIThread(this.e0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.Q.b(2)) {
            k();
            d(this.Q);
        }
    }

    public void setPreviewAttributes(g1 g1Var) {
        j4 j4Var = this.Q;
        if (j4Var != null && j4Var.c == 1 && isAttachedToWindow()) {
            AndroidUtilities.cancelRunOnUIThread(this.e0);
            ValueAnimator valueAnimator = this.d0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.d0 = null;
            }
            int i10 = 1 - this.n0;
            this.n0 = i10;
            org.telegram.ui.Components.n9[] n9VarArr = this.d;
            oi0 lottieAnimation = n9VarArr[2 - i10].getImageReceiver().getLottieAnimation();
            oi0 lottieAnimation2 = n9VarArr[this.n0 + 1].getImageReceiver().getLottieAnimation();
            if (lottieAnimation2 != null && lottieAnimation != null) {
                lottieAnimation2.Q(lottieAnimation.r(), false);
            }
            int i11 = this.n0 + 1;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = g1Var.a;
            this.R[i11] = stargiftattributebackdrop;
            e(i11, stargiftattributebackdrop);
            g(1, g1Var.b, true);
            int i12 = this.n0 + 1;
            TL_stars.starGiftAttributeModel stargiftattributemodel = g1Var.c;
            TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
            stargiftattributemodelArr[i12] = stargiftattributemodel;
            oa.Z0(n9VarArr[i12].getImageReceiver(), stargiftattributemodelArr[this.n0 + 1].document, 160);
            a();
            float f10 = this.n0;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f10, f10);
            this.d0 = ofFloat;
            ofFloat.addUpdateListener(new a5(this, 0));
            this.d0.addListener(new c5(this, 3));
            this.d0.setDuration(320L);
            this.d0.setInterpolator(er.h);
            this.d0.start();
        }
    }

    public void setPreviewingAttributes(ArrayList<TL_stars.StarGiftAttribute> arrayList) {
        this.S = new com.google.android.gms.common.api.internal.r(u7.m(arrayList, TL_stars.starGiftAttributeModel.class));
        this.T = new com.google.android.gms.common.api.internal.r(u7.m(arrayList, TL_stars.starGiftAttributePattern.class));
        this.U = new com.google.android.gms.common.api.internal.r(u7.m(arrayList, TL_stars.starGiftAttributeBackdrop.class));
        this.y[1].setTextSize(1, 14.0f);
        this.D.setVisibility(8);
        this.o0 = 0.0f;
        this.n0 = 0;
        g(1, (TL_stars.starGiftAttributePattern) this.T.c(), true);
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) this.S.c();
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = this.e;
        stargiftattributemodelArr[1] = stargiftattributemodel;
        org.telegram.ui.Components.n9[] n9VarArr = this.d;
        oa.Z0(n9VarArr[1].getImageReceiver(), stargiftattributemodelArr[1].document, 160);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) this.U.c();
        this.R[1] = stargiftattributebackdrop;
        e(1, stargiftattributebackdrop);
        stargiftattributemodelArr[2] = (TL_stars.starGiftAttributeModel) this.S.f;
        oa.Z0(n9VarArr[2].getImageReceiver(), stargiftattributemodelArr[2].document, 160);
        f2.r rVar = this.e0;
        AndroidUtilities.cancelRunOnUIThread(rVar);
        AndroidUtilities.runOnUIThread(rVar, 2500L);
        invalidate();
    }

    public void setResellPrice(hf.a aVar) {
        boolean k10 = aVar.k();
        this.I = !k10;
        p80[] p80VarArr = this.y;
        TextView textView = this.J;
        if (k10) {
            ViewPropertyAnimator duration = textView.animate().scaleX(0.4f).scaleY(0.4f).alpha(0.0f).setDuration(420L);
            er erVar = er.h;
            duration.setInterpolator(erVar).setListener(new c5(this, 2)).setListener(new c5(this, 1)).start();
            p80VarArr[0].animate().alpha(1.0f).setDuration(420L).setInterpolator(erVar).start();
        } else {
            textView.setText(LocaleController.formatSpannable(R.string.GiftOnSale, oa.U0(aVar.a == hf.b.b, "⭐️ " + ((Object) oa.J0(aVar.o(), 1.0f, ',')), 0.9f, null, 0.0f, 1.0f)));
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.R[0];
            textView.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(12.0f), i0.b.d(0.25f, stargiftattributebackdrop.edge_color | (-16777216), stargiftattributebackdrop.pattern_color | (-16777216))));
            textView.setVisibility(0);
            this.W = true;
            ViewPropertyAnimator duration2 = textView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(420L);
            er erVar2 = er.h;
            duration2.setInterpolator(erVar2).setListener(new c5(this, 0)).start();
            p80VarArr[0].animate().alpha(0.0f).setDuration(420L).setInterpolator(erVar2).start();
        }
        boolean z10 = this.I;
        ag.y1[] y1VarArr = this.E;
        if (z10) {
            y1VarArr[2].b(R.drawable.filled_gift_sell_off, LocaleController.getString(R.string.Gift2ActionUnlist), true);
        } else {
            y1VarArr[2].b(R.drawable.filled_gift_sell_on, LocaleController.getString(R.string.Gift2ActionResell), true);
        }
        y1VarArr[2].setOnClickListener(this.O);
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
        org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        y8Var.p(tLObject);
        this.G.e(tLObject, y8Var);
        this.r[2].setText(str2);
        this.y[2].setText(str);
        k();
        d(this.Q);
    }

    public void j(int i10) {
    }
}
