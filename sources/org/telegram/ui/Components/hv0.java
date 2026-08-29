package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class hv0 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public static DispatchQueue q0;
    public static boolean r0;
    public int A;
    public boolean B;
    public final org.telegram.ui.ActionBar.b5 C;
    public org.telegram.ui.ActionBar.q1 D;
    public int E;
    public boolean F;
    public sv0 G;
    public cg.h0 H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public dv0 M;
    public dv0 N;
    public final ArrayList O;
    public final ArrayList P;
    public final Matrix Q;
    public final Matrix R;
    public final Paint S;
    public final Paint T;
    public final Paint U;
    public final Paint V;
    public Paint W;
    public final Rect a;
    public Paint a0;
    public Drawable b;
    public float b0;
    public boolean c;
    public ValueAnimator c0;
    public Drawable d;
    public boolean d0;
    public boolean e;
    public int e0;
    public int f;
    public int f0;
    public int g0;
    public int h;
    public float h0;
    public final androidx.activity.g i0;
    public float j0;
    public float k0;
    public RenderNode[] l0;
    public final boolean[] m0;
    public gv0 n;
    public final boolean[] n0;
    public final ArrayList o0;
    public final ArrayList p0;
    public final ArrayList r;
    public boolean s;
    public c81 v;
    public float w;
    public float x;
    public float y;

    public hv0(Context context, org.telegram.ui.ActionBar.b5 b5Var) {
        super(context);
        this.a = new Rect();
        this.r = new ArrayList();
        this.s = true;
        this.y = 1.0f;
        this.B = true;
        this.O = new ArrayList(10);
        this.P = new ArrayList();
        this.Q = new Matrix();
        this.R = new Matrix();
        this.S = new Paint();
        this.T = new Paint();
        this.U = new Paint();
        this.V = new Paint();
        this.h0 = 1.0f;
        this.i0 = new androidx.activity.g(this);
        this.m0 = new boolean[2];
        this.n0 = new boolean[2];
        this.o0 = new ArrayList();
        this.p0 = new ArrayList();
        setWillNotDraw(false);
        this.C = b5Var;
        this.D = null;
    }

    public static boolean F() {
        return Build.VERSION.SDK_INT >= 31 && SharedConfig.useNewBlur;
    }

    public static void H(hv0 hv0Var, Canvas canvas) {
        if (hv0Var.H != null && org.telegram.ui.ActionBar.g6.G1 && LiteMode.isEnabled(32)) {
            if (hv0Var.G == null) {
                sv0 sv0Var = new sv0(1);
                hv0Var.G = sv0Var;
                sv0Var.g = -1;
                sv0Var.c();
            }
            hv0Var.G.b(canvas, hv0Var.H);
        }
    }

    public static float getBlurRadius() {
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass != 1) {
            return devicePerformanceClass != 2 ? 3.0f : 60.0f;
        }
        return 4.0f;
    }

    public static float getRenderNodeScale() {
        int dp;
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass == 1) {
            dp = AndroidUtilities.dp(12.0f);
        } else {
            if (devicePerformanceClass == 2) {
                return AndroidUtilities.density;
            }
            dp = AndroidUtilities.dp(15.0f);
        }
        return dp;
    }

    public final void I() {
        if (!this.e && !this.c) {
            c81 c81Var = this.v;
            if (c81Var != null) {
                c81Var.c(false);
                this.v = null;
                this.y = 1.0f;
                this.w = 0.0f;
                this.x = 0.0f;
                return;
            }
            return;
        }
        if (this.v == null) {
            c81 c81Var2 = new c81(getContext());
            this.v = c81Var2;
            c81Var2.n = new cv(this, 21);
            if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
                c81 c81Var3 = this.v;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                c81Var3.getClass();
                this.y = c81.a(measuredWidth, measuredHeight);
            }
        }
        if (this.B) {
            return;
        }
        this.v.c(true);
    }

    public void J(Canvas canvas, float f9, Rect rect, Paint paint, boolean z10) {
        K(canvas, f9, rect, paint, z10, Color.alpha(org.telegram.ui.ActionBar.g6.v0((F() && SharedConfig.getDevicePerformanceClass() == 2) ? org.telegram.ui.ActionBar.g6.xf : org.telegram.ui.ActionBar.g6.yf, getResourceProvider())));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K(Canvas canvas, float f9, Rect rect, Paint paint, boolean z10, int i10) {
        float f10;
        float f11;
        boolean z11;
        RenderNode renderNode;
        float f12;
        boolean z12;
        Shader.TileMode tileMode;
        float f13 = f9;
        if (!SharedConfig.chatBlurEnabled()) {
            canvas.drawRect(rect, paint);
            return;
        }
        if (!F()) {
            if (this.M == null) {
                canvas.drawRect(rect, paint);
                return;
            }
            this.W = z10 ? this.S : this.U;
            this.a0 = z10 ? this.T : this.V;
            if (z10) {
                f13 += getTranslationY();
            }
            if (this.W.getShader() != null) {
                Matrix matrix = this.Q;
                matrix.reset();
                Matrix matrix2 = this.R;
                matrix2.reset();
                if (z10) {
                    float f14 = -f13;
                    matrix.setTranslate(0.0f, (f14 - this.M.a) - 34.0f);
                    dv0 dv0Var = this.M;
                    matrix.preScale(dv0Var.d, dv0Var.e);
                    if (this.N != null) {
                        matrix2.setTranslate(0.0f, (f14 - r6.a) - 34.0f);
                        dv0 dv0Var2 = this.N;
                        matrix2.preScale(dv0Var2.d, dv0Var2.e);
                    }
                } else {
                    this.M.getClass();
                    float f15 = (-f13) + 0.0f;
                    matrix.setTranslate(0.0f, ((f15 - r6.a) - 34.0f) - (0.0f - (getListTranslationY() + getBottomOffset())));
                    this.M.getClass();
                    matrix.preScale(0.0f, 0.0f);
                    if (this.N != null) {
                        matrix2.setTranslate(0.0f, ((f15 - r6.a) - 34.0f) - (0.0f - (getListTranslationY() + getBottomOffset())));
                        this.N.getClass();
                        matrix2.preScale(0.0f, 0.0f);
                    }
                }
                this.W.getShader().setLocalMatrix(matrix);
                if (this.a0.getShader() != null) {
                    this.a0.getShader().setLocalMatrix(matrix);
                }
            }
            paint.setAlpha(255);
            if (this.b0 == 1.0f || this.a0.getShader() == null) {
                canvas.drawRect(rect, paint);
                canvas.drawRect(rect, this.W);
            } else {
                canvas.drawRect(rect, paint);
                canvas.drawRect(rect, this.a0);
                canvas.saveLayerAlpha(rect.left, rect.top, rect.right, rect.bottom, (int) (this.b0 * 255.0f), 31);
                canvas.drawRect(rect, paint);
                canvas.drawRect(rect, this.W);
                canvas.restore();
            }
            paint.setAlpha(i10);
            canvas.drawRect(rect, paint);
            return;
        }
        if (!canvas.isHardwareAccelerated()) {
            canvas.drawRect(rect, paint);
            return;
        }
        if (this.l0 == null) {
            this.l0 = new RenderNode[2];
        }
        float renderNodeScale = getRenderNodeScale();
        int i11 = !z10 ? 1 : 0;
        boolean[] zArr = this.n0;
        if (!z10 && !zArr[i11] && Math.abs(getBottomOffset() - this.j0) > 0.1f) {
            zArr[i11] = true;
        }
        int dp = AndroidUtilities.dp(36.0f);
        if (i10 < 255 && zArr[i11]) {
            boolean[] zArr2 = this.m0;
            if (!zArr2[i11]) {
                f10 = 255.0f;
                RenderNode[] renderNodeArr = this.l0;
                if (renderNodeArr[i11] == null) {
                    f11 = 1.0f;
                    z11 = true;
                    renderNodeArr[i11] = new RenderNode("blurNode" + i11);
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(2.0f);
                    RenderNode renderNode2 = this.l0[i11];
                    float blurRadiusInternal = getBlurRadiusInternal();
                    float blurRadiusInternal2 = getBlurRadiusInternal();
                    tileMode = Shader.TileMode.DECAL;
                    renderNode2.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(blurRadiusInternal, blurRadiusInternal2, tileMode), RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix))));
                } else {
                    f11 = 1.0f;
                    z11 = true;
                }
                int measuredWidth = getMeasuredWidth();
                int dp2 = AndroidUtilities.dp(100.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                int i12 = 0;
                this.l0[i11].setPosition(0, 0, (int) (measuredWidth / renderNodeScale), (int) (((dp * 2) + dp2) / renderNodeScale));
                RecordingCanvas beginRecording = this.l0[i11].beginRecording();
                r0 = z11;
                float f16 = f11 / renderNodeScale;
                beginRecording.scale(f16, f16);
                beginRecording.drawPaint(paint);
                beginRecording.translate(0.0f, dp);
                if (!z10) {
                    float bottomOffset = getBottomOffset();
                    this.j0 = bottomOffset;
                    float f17 = bottomOffset - dp2;
                    this.k0 = f17;
                    beginRecording.translate(0.0f, -f17);
                }
                if (O()) {
                    ArrayList arrayList = this.o0;
                    arrayList.clear();
                    ArrayList arrayList2 = this.p0;
                    arrayList.addAll(arrayList2);
                    arrayList2.clear();
                    L(beginRecording, arrayList2);
                    z12 = false;
                    for (int size = arrayList.size(); i12 < size; size = size) {
                        Object obj = arrayList.get(i12);
                        i12++;
                        ((ev0) obj).g(null);
                    }
                    int i13 = 0;
                    for (int size2 = arrayList2.size(); i13 < size2; size2 = size2) {
                        Object obj2 = arrayList2.get(i13);
                        i13++;
                        ((ev0) obj2).g(new fq0(this, 7));
                    }
                } else {
                    L(beginRecording, null);
                    z12 = false;
                }
                r0 = z12;
                this.l0[i11].endRecording();
                zArr2[i11] = z11;
                zArr[i11] = z12;
                if (!O()) {
                    zArr[i11] = z11;
                    N();
                }
                canvas.save();
                canvas.drawRect(rect, paint);
                canvas.clipRect(rect);
                renderNode = this.l0[i11];
                if (renderNode != null && i10 < 255) {
                    renderNode.setAlpha(f11 - (i10 / f10));
                    if (z10) {
                        f12 = 0.0f;
                        canvas.translate(0.0f, ((-f13) + this.k0) - (this.j0 - (getListTranslationY() + getBottomOffset())));
                    } else {
                        f12 = 0.0f;
                        canvas.translate(0.0f, (-f13) - getTranslationY());
                    }
                    canvas.translate(f12, -dp);
                    canvas.scale(renderNodeScale, renderNodeScale);
                    canvas.drawRenderNode(this.l0[i11]);
                }
                canvas.restore();
            }
        }
        f10 = 255.0f;
        f11 = 1.0f;
        z11 = true;
        if (!O()) {
        }
        canvas.save();
        canvas.drawRect(rect, paint);
        canvas.clipRect(rect);
        renderNode = this.l0[i11];
        if (renderNode != null) {
            renderNode.setAlpha(f11 - (i10 / f10));
            if (z10) {
            }
            canvas.translate(f12, -dp);
            canvas.scale(renderNodeScale, renderNodeScale);
            canvas.drawRenderNode(this.l0[i11]);
        }
        canvas.restore();
    }

    public void M() {
        if (SharedConfig.chatBlurEnabled()) {
            this.d0 = true;
            if (!this.K || this.L) {
                return;
            }
            invalidate();
        }
    }

    public final void N() {
        boolean[] zArr = this.n0;
        int i10 = 0;
        zArr[0] = true;
        zArr[1] = true;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((View) arrayList.get(i10)).invalidate();
            i10++;
        }
    }

    public boolean O() {
        return this instanceof org.telegram.ui.km;
    }

    public boolean P() {
        return !(this instanceof org.telegram.ui.cb);
    }

    public boolean Q() {
        return !(this instanceof org.telegram.ui.cb);
    }

    public int R() {
        View rootView = getRootView();
        Rect rect = this.a;
        getWindowVisibleDisplayFrame(rect);
        if (rect.bottom == 0 && rect.top == 0) {
            return 0;
        }
        int max = Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top));
        this.f = max;
        return max;
    }

    public void S() {
        if (this.v != null) {
            this.y = c81.a(getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.n == null && this.r.isEmpty()) {
            return;
        }
        this.f = R();
        Point point = AndroidUtilities.displaySize;
        post(new p90(5, this, point.x > point.y));
    }

    public final void V(Drawable drawable) {
        if (this.b == drawable) {
            return;
        }
        if (this.H == null) {
            cg.h0 h0Var = new cg.h0(this, getContext(), 21);
            this.H = h0Var;
            addView(h0Var, 0, i7.f6.c(-1.0f, -1));
        }
        if (drawable instanceof yb0) {
            ((yb0) drawable).r(this.H);
        }
        if (this.I) {
            Drawable drawable2 = this.b;
            if (drawable2 instanceof org.telegram.ui.wn) {
                ((org.telegram.ui.wn) drawable2).g(this.H);
            }
        }
        this.b = drawable;
        if (this.I && (drawable instanceof org.telegram.ui.wn)) {
            ((org.telegram.ui.wn) drawable).f(this.H);
        }
        if (this.I) {
            Drawable drawable3 = this.b;
            if (drawable3 instanceof yb0) {
                ((yb0) drawable3).l();
            }
        }
        if (this.I) {
            Drawable drawable4 = this.b;
            if (drawable4 instanceof yb0) {
                ((yb0) drawable4).k();
            }
        }
        U(this.b);
        I();
        this.H.invalidate();
    }

    public final void W() {
        if (!this.K || this.L || !this.d0 || !SharedConfig.chatBlurEnabled() || F() || Color.alpha(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.yf, false)) == 255) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int dp = AndroidUtilities.dp(100.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        if (measuredWidth == 0 || dp == 0) {
            return;
        }
        this.d0 = false;
        this.L = true;
        float f9 = dp;
        int i10 = ((int) (f9 / 12.0f)) + 34;
        float f10 = measuredWidth;
        int i11 = (int) (f10 / 12.0f);
        System.currentTimeMillis();
        ArrayList arrayList = this.O;
        dv0 dv0Var = arrayList.size() > 0 ? (dv0) com.google.android.recaptcha.internal.a.j(1, arrayList) : null;
        if (dv0Var == null) {
            dv0Var = new dv0();
            dv0Var.c = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            dv0Var.b = new fv0(dv0Var.c);
        } else {
            dv0Var.c.eraseColor(0);
        }
        float width = dv0Var.c.getWidth() / f10;
        float height = (dv0Var.c.getHeight() - 34) / f9;
        int save = dv0Var.b.save();
        dv0Var.a = getScrollOffset() % 24;
        float f11 = 10.0f * height;
        dv0Var.b.clipRect(1.0f, f11, dv0Var.c.getWidth(), dv0Var.c.getHeight() - 1);
        dv0Var.b.scale(width, height);
        dv0Var.b.translate(0.0f, f11 + dv0Var.a);
        dv0Var.d = 1.0f / width;
        dv0Var.e = 1.0f / height;
        L(dv0Var.b, null);
        try {
            dv0Var.b.restoreToCount(save);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        System.currentTimeMillis();
        int i12 = this.g0 + 1;
        this.g0 = i12;
        if (i12 >= 20) {
            this.g0 = 0;
        }
        if (q0 == null) {
            q0 = new DispatchQueue("BlurQueue");
        }
        int max = (int) (((int) (Math.max(6, Math.max(dp, measuredWidth) / 180) * 2.5f)) * org.telegram.ui.j5.d);
        androidx.activity.g gVar = this.i0;
        gVar.b = max;
        gVar.d = dv0Var;
        q0.postRunnable(gVar);
    }

    public void X() {
        if (F()) {
            N();
        }
    }

    public boolean Y() {
        return !(this instanceof ih.y5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        boolean[] zArr = this.m0;
        zArr[0] = false;
        zArr[1] = false;
        if (this.K) {
            W();
        }
        super.dispatchDraw(canvas);
    }

    public Drawable getBackgroundImage() {
        return this.b;
    }

    public int getBackgroundSizeY() {
        return getMeasuredHeight() - (this.b instanceof org.telegram.ui.wn ? this.A : 0);
    }

    public int getBackgroundTranslationY() {
        Drawable drawable = this.b;
        if (drawable instanceof yb0) {
            return this.A;
        }
        if (drawable instanceof org.telegram.ui.wn) {
            return this.A;
        }
        return 0;
    }

    public float getBlurRadiusInternal() {
        return getBlurRadius();
    }

    public float getBottomOffset() {
        return getMeasuredHeight();
    }

    public int getBottomPadding() {
        return 0;
    }

    public float getBottomTranslation() {
        return 0.0f;
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public int getHeightWithKeyboard() {
        return getMeasuredHeight() + this.f;
    }

    public int getKeyboardHeight() {
        return this.f;
    }

    public float getListTranslationY() {
        return 0.0f;
    }

    public Drawable getNewDrawable() {
        return org.telegram.ui.ActionBar.g6.s0();
    }

    public boolean getNewDrawableMotion() {
        return org.telegram.ui.ActionBar.g6.i0;
    }

    public org.telegram.ui.ActionBar.c6 getResourceProvider() {
        return null;
    }

    public int getScrollOffset() {
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I = true;
        if (this.J && !this.K) {
            this.K = true;
            this.d0 = true;
        }
        Drawable drawable = this.b;
        if (drawable instanceof org.telegram.ui.wn) {
            ((org.telegram.ui.wn) drawable).f(this.H);
        }
        Drawable drawable2 = this.b;
        if (drawable2 instanceof yb0) {
            ((yb0) drawable2).k();
        }
        Drawable drawable3 = this.d;
        if (drawable3 instanceof org.telegram.ui.wn) {
            ((org.telegram.ui.wn) drawable3).f(this.H);
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof yb0) {
            ((yb0) drawable4).k();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        this.I = false;
        this.S.setShader(null);
        this.T.setShader(null);
        this.U.setShader(null);
        this.V.setShader(null);
        ValueAnimator valueAnimator = this.c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        dv0 dv0Var = this.M;
        if (dv0Var != null) {
            dv0Var.c.recycle();
            this.M = null;
        }
        int i10 = 0;
        while (true) {
            arrayList = this.O;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((dv0) arrayList.get(i10)).c.recycle();
            }
            i10++;
        }
        arrayList.clear();
        this.K = false;
        Drawable drawable = this.b;
        if (drawable instanceof org.telegram.ui.wn) {
            ((org.telegram.ui.wn) drawable).g(this.H);
        }
        Drawable drawable2 = this.d;
        if (drawable2 instanceof org.telegram.ui.wn) {
            ((org.telegram.ui.wn) drawable2).g(this.H);
        }
        Drawable drawable3 = this.b;
        if (drawable3 instanceof yb0) {
            ((yb0) drawable3).l();
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof yb0) {
            ((yb0) drawable4).l();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        S();
    }

    public void setBackgroundTranslation(int i10) {
        if (i10 != this.A) {
            this.A = i10;
            cg.h0 h0Var = this.H;
            if (h0Var != null) {
                h0Var.invalidate();
            }
        }
    }

    public void setBottomClip(int i10) {
        if (i10 != this.h) {
            this.h = i10;
            cg.h0 h0Var = this.H;
            if (h0Var != null) {
                h0Var.invalidate();
            }
        }
    }

    public void setDelegate(gv0 gv0Var) {
        this.n = gv0Var;
    }

    public void setEmojiKeyboardHeight(int i10) {
        if (this.E != i10) {
            this.E = i10;
            cg.h0 h0Var = this.H;
            if (h0Var != null) {
                h0Var.invalidate();
            }
        }
    }

    public void setOccupyStatusBar(boolean z10) {
        this.s = z10;
    }

    public void setSkipBackgroundDrawing(boolean z10) {
        if (this.F != z10) {
            this.F = z10;
            cg.h0 h0Var = this.H;
            if (h0Var != null) {
                h0Var.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == getBackgroundImage() || super.verifyDrawable(drawable);
    }

    public void T() {
    }

    public void U(Drawable drawable) {
    }

    public void e() {
    }

    public void L(Canvas canvas, ArrayList arrayList) {
    }
}
