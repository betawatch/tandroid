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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public class aw0 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public static DispatchQueue u0;
    public static boolean v0;
    public int E;
    public boolean F;
    public final org.telegram.ui.ActionBar.f5 G;
    public org.telegram.ui.ActionBar.r1 H;
    public int I;
    public boolean J;
    public lw0 K;
    public bi.nc L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public wv0 Q;
    public wv0 R;
    public final ArrayList S;
    public final ArrayList T;
    public final Matrix U;
    public final Matrix V;
    public final Paint W;
    public final Rect a;
    public final Paint a0;
    public Drawable b;
    public final Paint b0;
    public boolean c;
    public final Paint c0;
    public Drawable d;
    public Paint d0;
    public boolean e;
    public Paint e0;
    public int f;
    public float f0;
    public ValueAnimator g0;
    public int h;
    public boolean h0;
    public int i0;
    public int j0;
    public int k0;
    public float l0;
    public final androidx.activity.g m0;
    public zv0 n;
    public float n0;
    public float o0;
    public RenderNode[] p0;
    public final boolean[] q0;
    public final ArrayList r;
    public final boolean[] r0;
    public boolean s;
    public final ArrayList s0;
    public final ArrayList t0;
    public y81 v;
    public float w;
    public float x;
    public float y;

    public aw0(Context context, org.telegram.ui.ActionBar.f5 f5Var) {
        super(context);
        this.a = new Rect();
        this.r = new ArrayList();
        this.s = true;
        this.y = 1.0f;
        this.F = true;
        this.S = new ArrayList(10);
        this.T = new ArrayList();
        this.U = new Matrix();
        this.V = new Matrix();
        this.W = new Paint();
        this.a0 = new Paint();
        this.b0 = new Paint();
        this.c0 = new Paint();
        this.l0 = 1.0f;
        this.m0 = new androidx.activity.g(this);
        this.q0 = new boolean[2];
        this.r0 = new boolean[2];
        this.s0 = new ArrayList();
        this.t0 = new ArrayList();
        setWillNotDraw(false);
        this.G = f5Var;
        this.H = null;
    }

    public static boolean F() {
        return Build.VERSION.SDK_INT >= 31 && SharedConfig.useNewBlur;
    }

    public static void G(aw0 aw0Var, Canvas canvas) {
        if (aw0Var.L != null && org.telegram.ui.ActionBar.j6.G1 && LiteMode.isEnabled(32)) {
            if (aw0Var.K == null) {
                lw0 lw0Var = new lw0(1);
                aw0Var.K = lw0Var;
                lw0Var.g = -1;
                lw0Var.c();
            }
            aw0Var.K.b(canvas, aw0Var.L);
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
            y81 y81Var = this.v;
            if (y81Var != null) {
                y81Var.c(false);
                this.v = null;
                this.y = 1.0f;
                this.w = 0.0f;
                this.x = 0.0f;
                return;
            }
            return;
        }
        if (this.v == null) {
            y81 y81Var2 = new y81(getContext());
            this.v = y81Var2;
            y81Var2.n = new pv(this, 21);
            if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
                y81 y81Var3 = this.v;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                y81Var3.getClass();
                this.y = y81.a(measuredWidth, measuredHeight);
            }
        }
        if (this.F) {
            return;
        }
        this.v.c(true);
    }

    public void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        K(canvas, f7, rect, paint, z10, Color.alpha(org.telegram.ui.ActionBar.j6.v0((F() && SharedConfig.getDevicePerformanceClass() == 2) ? org.telegram.ui.ActionBar.j6.xf : org.telegram.ui.ActionBar.j6.yf, getResourceProvider())));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10, int i10) {
        float f10;
        float f11;
        boolean z11;
        RenderNode renderNode;
        float f12;
        boolean z12;
        Shader.TileMode tileMode;
        float f13 = f7;
        if (!SharedConfig.chatBlurEnabled()) {
            canvas.drawRect(rect, paint);
            return;
        }
        if (!F()) {
            if (this.Q == null) {
                canvas.drawRect(rect, paint);
                return;
            }
            this.d0 = z10 ? this.W : this.b0;
            this.e0 = z10 ? this.a0 : this.c0;
            if (z10) {
                f13 += getTranslationY();
            }
            if (this.d0.getShader() != null) {
                Matrix matrix = this.U;
                matrix.reset();
                Matrix matrix2 = this.V;
                matrix2.reset();
                if (z10) {
                    float f14 = -f13;
                    matrix.setTranslate(0.0f, (f14 - this.Q.a) - 34.0f);
                    wv0 wv0Var = this.Q;
                    matrix.preScale(wv0Var.d, wv0Var.e);
                    if (this.R != null) {
                        matrix2.setTranslate(0.0f, (f14 - r6.a) - 34.0f);
                        wv0 wv0Var2 = this.R;
                        matrix2.preScale(wv0Var2.d, wv0Var2.e);
                    }
                } else {
                    this.Q.getClass();
                    float f15 = (-f13) + 0.0f;
                    matrix.setTranslate(0.0f, ((f15 - r6.a) - 34.0f) - (0.0f - (getListTranslationY() + getBottomOffset())));
                    this.Q.getClass();
                    matrix.preScale(0.0f, 0.0f);
                    if (this.R != null) {
                        matrix2.setTranslate(0.0f, ((f15 - r6.a) - 34.0f) - (0.0f - (getListTranslationY() + getBottomOffset())));
                        this.R.getClass();
                        matrix2.preScale(0.0f, 0.0f);
                    }
                }
                this.d0.getShader().setLocalMatrix(matrix);
                if (this.e0.getShader() != null) {
                    this.e0.getShader().setLocalMatrix(matrix);
                }
            }
            paint.setAlpha(255);
            if (this.f0 == 1.0f || this.e0.getShader() == null) {
                canvas.drawRect(rect, paint);
                canvas.drawRect(rect, this.d0);
            } else {
                canvas.drawRect(rect, paint);
                canvas.drawRect(rect, this.e0);
                canvas.saveLayerAlpha(rect.left, rect.top, rect.right, rect.bottom, (int) (this.f0 * 255.0f), 31);
                canvas.drawRect(rect, paint);
                canvas.drawRect(rect, this.d0);
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
        if (this.p0 == null) {
            this.p0 = new RenderNode[2];
        }
        float renderNodeScale = getRenderNodeScale();
        int i11 = !z10 ? 1 : 0;
        boolean[] zArr = this.r0;
        if (!z10 && !zArr[i11] && Math.abs(getBottomOffset() - this.n0) > 0.1f) {
            zArr[i11] = true;
        }
        int dp = AndroidUtilities.dp(36.0f);
        if (i10 < 255 && zArr[i11]) {
            boolean[] zArr2 = this.q0;
            if (!zArr2[i11]) {
                f10 = 255.0f;
                RenderNode[] renderNodeArr = this.p0;
                if (renderNodeArr[i11] == null) {
                    f11 = 1.0f;
                    z11 = true;
                    renderNodeArr[i11] = new RenderNode("blurNode" + i11);
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(2.0f);
                    RenderNode renderNode2 = this.p0[i11];
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
                this.p0[i11].setPosition(0, 0, (int) (measuredWidth / renderNodeScale), (int) (((dp * 2) + dp2) / renderNodeScale));
                RecordingCanvas beginRecording = this.p0[i11].beginRecording();
                v0 = z11;
                float f16 = f11 / renderNodeScale;
                beginRecording.scale(f16, f16);
                beginRecording.drawPaint(paint);
                beginRecording.translate(0.0f, dp);
                if (!z10) {
                    float bottomOffset = getBottomOffset();
                    this.n0 = bottomOffset;
                    float f17 = bottomOffset - dp2;
                    this.o0 = f17;
                    beginRecording.translate(0.0f, -f17);
                }
                if (O()) {
                    ArrayList arrayList = this.s0;
                    arrayList.clear();
                    ArrayList arrayList2 = this.t0;
                    arrayList.addAll(arrayList2);
                    arrayList2.clear();
                    L(beginRecording, arrayList2);
                    z12 = false;
                    for (int size = arrayList.size(); i12 < size; size = size) {
                        Object obj = arrayList.get(i12);
                        i12++;
                        ((xv0) obj).g(null);
                    }
                    int i13 = 0;
                    for (int size2 = arrayList2.size(); i13 < size2; size2 = size2) {
                        Object obj2 = arrayList2.get(i13);
                        i13++;
                        ((xv0) obj2).g(new uq0(this, 7));
                    }
                } else {
                    L(beginRecording, null);
                    z12 = false;
                }
                v0 = z12;
                this.p0[i11].endRecording();
                zArr2[i11] = z11;
                zArr[i11] = z12;
                if (!O()) {
                    zArr[i11] = z11;
                    N();
                }
                canvas.save();
                canvas.drawRect(rect, paint);
                canvas.clipRect(rect);
                renderNode = this.p0[i11];
                if (renderNode != null && i10 < 255) {
                    renderNode.setAlpha(f11 - (i10 / f10));
                    if (z10) {
                        f12 = 0.0f;
                        canvas.translate(0.0f, ((-f13) + this.o0) - (this.n0 - (getListTranslationY() + getBottomOffset())));
                    } else {
                        f12 = 0.0f;
                        canvas.translate(0.0f, (-f13) - getTranslationY());
                    }
                    canvas.translate(f12, -dp);
                    canvas.scale(renderNodeScale, renderNodeScale);
                    canvas.drawRenderNode(this.p0[i11]);
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
        renderNode = this.p0[i11];
        if (renderNode != null) {
            renderNode.setAlpha(f11 - (i10 / f10));
            if (z10) {
            }
            canvas.translate(f12, -dp);
            canvas.scale(renderNodeScale, renderNodeScale);
            canvas.drawRenderNode(this.p0[i11]);
        }
        canvas.restore();
    }

    public void M() {
        if (SharedConfig.chatBlurEnabled()) {
            this.h0 = true;
            if (!this.O || this.P) {
                return;
            }
            invalidate();
        }
    }

    public final void N() {
        boolean[] zArr = this.r0;
        int i10 = 0;
        zArr[0] = true;
        zArr[1] = true;
        while (true) {
            ArrayList arrayList = this.T;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((View) arrayList.get(i10)).invalidate();
            i10++;
        }
    }

    public boolean O() {
        return this instanceof org.telegram.ui.vm;
    }

    public boolean P() {
        return !(this instanceof org.telegram.ui.kb);
    }

    public boolean Q() {
        return !(this instanceof org.telegram.ui.kb);
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
            this.y = y81.a(getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.n == null && this.r.isEmpty()) {
            return;
        }
        this.f = R();
        Point point = AndroidUtilities.displaySize;
        post(new bs0(1, this, point.x > point.y));
    }

    public final void V(Drawable drawable) {
        if (this.b == drawable) {
            return;
        }
        if (this.L == null) {
            bi.nc ncVar = new bi.nc(this, getContext(), 24);
            this.L = ncVar;
            addView(ncVar, 0, w7.a6.c(-1.0f, -1));
        }
        if (drawable instanceof lc0) {
            ((lc0) drawable).r(this.L);
        }
        if (this.M) {
            Drawable drawable2 = this.b;
            if (drawable2 instanceof org.telegram.ui.ho) {
                ((org.telegram.ui.ho) drawable2).g(this.L);
            }
        }
        this.b = drawable;
        if (this.M && (drawable instanceof org.telegram.ui.ho)) {
            ((org.telegram.ui.ho) drawable).f(this.L);
        }
        if (this.M) {
            Drawable drawable3 = this.b;
            if (drawable3 instanceof lc0) {
                ((lc0) drawable3).l();
            }
        }
        if (this.M) {
            Drawable drawable4 = this.b;
            if (drawable4 instanceof lc0) {
                ((lc0) drawable4).k();
            }
        }
        U(this.b);
        I();
        this.L.invalidate();
    }

    public final void W() {
        if (!this.O || this.P || !this.h0 || !SharedConfig.chatBlurEnabled() || F() || Color.alpha(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.yf, false)) == 255) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int dp = AndroidUtilities.dp(100.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        if (measuredWidth == 0 || dp == 0) {
            return;
        }
        this.h0 = false;
        this.P = true;
        float f7 = dp;
        int i10 = ((int) (f7 / 12.0f)) + 34;
        float f10 = measuredWidth;
        int i11 = (int) (f10 / 12.0f);
        System.currentTimeMillis();
        ArrayList arrayList = this.S;
        wv0 wv0Var = arrayList.size() > 0 ? (wv0) hc.b.z(1, arrayList) : null;
        if (wv0Var == null) {
            wv0Var = new wv0();
            wv0Var.c = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            wv0Var.b = new yv0(wv0Var.c);
        } else {
            wv0Var.c.eraseColor(0);
        }
        float width = wv0Var.c.getWidth() / f10;
        float height = (wv0Var.c.getHeight() - 34) / f7;
        int save = wv0Var.b.save();
        wv0Var.a = getScrollOffset() % 24;
        float f11 = 10.0f * height;
        wv0Var.b.clipRect(1.0f, f11, wv0Var.c.getWidth(), wv0Var.c.getHeight() - 1);
        wv0Var.b.scale(width, height);
        wv0Var.b.translate(0.0f, f11 + wv0Var.a);
        wv0Var.d = 1.0f / width;
        wv0Var.e = 1.0f / height;
        L(wv0Var.b, null);
        try {
            wv0Var.b.restoreToCount(save);
        } catch (Exception e) {
            FileLog.e(e);
        }
        System.currentTimeMillis();
        int i12 = this.k0 + 1;
        this.k0 = i12;
        if (i12 >= 20) {
            this.k0 = 0;
        }
        if (u0 == null) {
            u0 = new DispatchQueue("BlurQueue");
        }
        int max = (int) (((int) (Math.max(6, Math.max(dp, measuredWidth) / 180) * 2.5f)) * org.telegram.ui.i5.d);
        androidx.activity.g gVar = this.m0;
        gVar.b = max;
        gVar.d = wv0Var;
        u0.postRunnable(gVar);
    }

    public void X() {
        if (F()) {
            N();
        }
    }

    public boolean Y() {
        return !(this instanceof wh.s4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        boolean[] zArr = this.q0;
        zArr[0] = false;
        zArr[1] = false;
        if (this.O) {
            W();
        }
        super.dispatchDraw(canvas);
    }

    public Drawable getBackgroundImage() {
        return this.b;
    }

    public int getBackgroundSizeY() {
        return getMeasuredHeight() - (this.b instanceof org.telegram.ui.ho ? this.E : 0);
    }

    public int getBackgroundTranslationY() {
        Drawable drawable = this.b;
        if (drawable instanceof lc0) {
            return this.E;
        }
        if (drawable instanceof org.telegram.ui.ho) {
            return this.E;
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
        return org.telegram.ui.ActionBar.j6.s0();
    }

    public boolean getNewDrawableMotion() {
        return org.telegram.ui.ActionBar.j6.i0;
    }

    public org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return null;
    }

    public int getScrollOffset() {
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.M = true;
        if (this.N && !this.O) {
            this.O = true;
            this.h0 = true;
        }
        Drawable drawable = this.b;
        if (drawable instanceof org.telegram.ui.ho) {
            ((org.telegram.ui.ho) drawable).f(this.L);
        }
        Drawable drawable2 = this.b;
        if (drawable2 instanceof lc0) {
            ((lc0) drawable2).k();
        }
        Drawable drawable3 = this.d;
        if (drawable3 instanceof org.telegram.ui.ho) {
            ((org.telegram.ui.ho) drawable3).f(this.L);
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof lc0) {
            ((lc0) drawable4).k();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        this.M = false;
        this.W.setShader(null);
        this.a0.setShader(null);
        this.b0.setShader(null);
        this.c0.setShader(null);
        ValueAnimator valueAnimator = this.g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        wv0 wv0Var = this.Q;
        if (wv0Var != null) {
            wv0Var.c.recycle();
            this.Q = null;
        }
        int i10 = 0;
        while (true) {
            arrayList = this.S;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((wv0) arrayList.get(i10)).c.recycle();
            }
            i10++;
        }
        arrayList.clear();
        this.O = false;
        Drawable drawable = this.b;
        if (drawable instanceof org.telegram.ui.ho) {
            ((org.telegram.ui.ho) drawable).g(this.L);
        }
        Drawable drawable2 = this.d;
        if (drawable2 instanceof org.telegram.ui.ho) {
            ((org.telegram.ui.ho) drawable2).g(this.L);
        }
        Drawable drawable3 = this.b;
        if (drawable3 instanceof lc0) {
            ((lc0) drawable3).l();
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof lc0) {
            ((lc0) drawable4).l();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        S();
    }

    public void setBackgroundTranslation(int i10) {
        if (i10 != this.E) {
            this.E = i10;
            bi.nc ncVar = this.L;
            if (ncVar != null) {
                ncVar.invalidate();
            }
        }
    }

    public void setBottomClip(int i10) {
        if (i10 != this.h) {
            this.h = i10;
            bi.nc ncVar = this.L;
            if (ncVar != null) {
                ncVar.invalidate();
            }
        }
    }

    public void setDelegate(zv0 zv0Var) {
        this.n = zv0Var;
    }

    public void setEmojiKeyboardHeight(int i10) {
        if (this.I != i10) {
            this.I = i10;
            bi.nc ncVar = this.L;
            if (ncVar != null) {
                ncVar.invalidate();
            }
        }
    }

    public void setOccupyStatusBar(boolean z10) {
        this.s = z10;
    }

    public void setSkipBackgroundDrawing(boolean z10) {
        if (this.J != z10) {
            this.J = z10;
            bi.nc ncVar = this.L;
            if (ncVar != null) {
                ncVar.invalidate();
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
