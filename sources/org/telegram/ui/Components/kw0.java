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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public class kw0 extends FrameLayout implements org.telegram.ui.ActionBar.y5 {
    public static DispatchQueue u0;
    public static boolean v0;
    public int E;
    public boolean F;
    public final org.telegram.ui.ActionBar.d5 G;
    public org.telegram.ui.ActionBar.o1 H;
    public int I;
    public boolean J;
    public vw0 K;
    public ai.ic L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public gw0 Q;
    public gw0 R;
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
    public jw0 n;
    public float n0;
    public float o0;
    public RenderNode[] p0;
    public final boolean[] q0;
    public final ArrayList r;
    public final boolean[] r0;
    public boolean s;
    public final ArrayList s0;
    public final ArrayList t0;
    public g91 v;
    public float w;
    public float x;
    public float y;

    public kw0(Context context, org.telegram.ui.ActionBar.d5 d5Var) {
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
        this.G = d5Var;
        this.H = null;
    }

    public static boolean F() {
        return Build.VERSION.SDK_INT >= 31 && SharedConfig.useNewBlur;
    }

    public static void H(kw0 kw0Var, Canvas canvas) {
        if (kw0Var.L != null && org.telegram.ui.ActionBar.h6.G1 && LiteMode.isEnabled(32)) {
            if (kw0Var.K == null) {
                vw0 vw0Var = new vw0(1);
                kw0Var.K = vw0Var;
                vw0Var.g = -1;
                vw0Var.c();
            }
            kw0Var.K.b(canvas, kw0Var.L);
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
            g91 g91Var = this.v;
            if (g91Var != null) {
                g91Var.c(false);
                this.v = null;
                this.y = 1.0f;
                this.w = 0.0f;
                this.x = 0.0f;
                return;
            }
            return;
        }
        if (this.v == null) {
            g91 g91Var2 = new g91(getContext());
            this.v = g91Var2;
            g91Var2.n = new tv(this, 22);
            if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
                g91 g91Var3 = this.v;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                g91Var3.getClass();
                this.y = g91.a(measuredWidth, measuredHeight);
            }
        }
        if (this.F) {
            return;
        }
        this.v.c(true);
    }

    public void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        K(canvas, f7, rect, paint, z10, Color.alpha(org.telegram.ui.ActionBar.h6.w0((F() && SharedConfig.getDevicePerformanceClass() == 2) ? org.telegram.ui.ActionBar.h6.xf : org.telegram.ui.ActionBar.h6.yf, getResourceProvider())));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10, int i10) {
        boolean z11;
        float f10;
        float f11;
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
                    gw0 gw0Var = this.Q;
                    matrix.preScale(gw0Var.d, gw0Var.e);
                    if (this.R != null) {
                        matrix2.setTranslate(0.0f, (f14 - r6.a) - 34.0f);
                        gw0 gw0Var2 = this.R;
                        matrix2.preScale(gw0Var2.d, gw0Var2.e);
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
                    z11 = true;
                    f11 = 1.0f;
                }
                int measuredWidth = getMeasuredWidth();
                int dp2 = AndroidUtilities.dp(100.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
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
                        ((hw0) obj).g(null);
                    }
                    int i13 = 0;
                    for (int size2 = arrayList2.size(); i13 < size2; size2 = size2) {
                        Object obj2 = arrayList2.get(i13);
                        i13++;
                        ((hw0) obj2).g(new gr0(this, 7));
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
        z11 = true;
        f10 = 255.0f;
        f11 = 1.0f;
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
        return this instanceof org.telegram.ui.jm;
    }

    public boolean P() {
        return !(this instanceof org.telegram.ui.jb);
    }

    public boolean Q() {
        return !(this instanceof org.telegram.ui.jb);
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
            this.y = g91.a(getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.n == null && this.r.isEmpty()) {
            return;
        }
        this.f = R();
        Point point = AndroidUtilities.displaySize;
        post(new b60(6, this, point.x > point.y));
    }

    public final void V(Drawable drawable) {
        if (this.b == drawable) {
            return;
        }
        if (this.L == null) {
            ai.ic icVar = new ai.ic(this, getContext(), 25);
            this.L = icVar;
            addView(icVar, 0, w7.z5.c(-1.0f, -1));
        }
        if (drawable instanceof wc0) {
            ((wc0) drawable).q(this.L);
        }
        if (this.M) {
            Drawable drawable2 = this.b;
            if (drawable2 instanceof org.telegram.ui.tn) {
                ((org.telegram.ui.tn) drawable2).g(this.L);
            }
        }
        this.b = drawable;
        if (this.M && (drawable instanceof org.telegram.ui.tn)) {
            ((org.telegram.ui.tn) drawable).f(this.L);
        }
        if (this.M) {
            Drawable drawable3 = this.b;
            if (drawable3 instanceof wc0) {
                ((wc0) drawable3).l();
            }
        }
        if (this.M) {
            Drawable drawable4 = this.b;
            if (drawable4 instanceof wc0) {
                ((wc0) drawable4).k();
            }
        }
        U(this.b);
        I();
        this.L.invalidate();
    }

    public final void W() {
        if (!this.O || this.P || !this.h0 || !SharedConfig.chatBlurEnabled() || F() || Color.alpha(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.yf, false)) == 255) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int dp = AndroidUtilities.dp(100.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
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
        gw0 gw0Var = arrayList.size() > 0 ? (gw0) i2.e.A(1, arrayList) : null;
        if (gw0Var == null) {
            gw0Var = new gw0();
            gw0Var.c = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            gw0Var.b = new iw0(gw0Var.c);
        } else {
            gw0Var.c.eraseColor(0);
        }
        float width = gw0Var.c.getWidth() / f10;
        float height = (gw0Var.c.getHeight() - 34) / f7;
        int save = gw0Var.b.save();
        gw0Var.a = getScrollOffset() % 24;
        float f11 = 10.0f * height;
        gw0Var.b.clipRect(1.0f, f11, gw0Var.c.getWidth(), gw0Var.c.getHeight() - 1);
        gw0Var.b.scale(width, height);
        gw0Var.b.translate(0.0f, f11 + gw0Var.a);
        gw0Var.d = 1.0f / width;
        gw0Var.e = 1.0f / height;
        L(gw0Var.b, null);
        try {
            gw0Var.b.restoreToCount(save);
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
        int max = (int) (((int) (Math.max(6, Math.max(dp, measuredWidth) / 180) * 2.5f)) * org.telegram.ui.n5.d);
        androidx.activity.g gVar = this.m0;
        gVar.b = max;
        gVar.d = gw0Var;
        u0.postRunnable(gVar);
    }

    public void X() {
        if (F()) {
            N();
        }
    }

    public boolean Y() {
        return !(this instanceof yh.r4);
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
        return getMeasuredHeight() - (this.b instanceof org.telegram.ui.tn ? this.E : 0);
    }

    public int getBackgroundTranslationY() {
        Drawable drawable = this.b;
        if (drawable instanceof wc0) {
            return this.E;
        }
        if (drawable instanceof org.telegram.ui.tn) {
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
        return org.telegram.ui.ActionBar.h6.t0();
    }

    public boolean getNewDrawableMotion() {
        return org.telegram.ui.ActionBar.h6.i0;
    }

    public org.telegram.ui.ActionBar.d6 getResourceProvider() {
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
        if (drawable instanceof org.telegram.ui.tn) {
            ((org.telegram.ui.tn) drawable).f(this.L);
        }
        Drawable drawable2 = this.b;
        if (drawable2 instanceof wc0) {
            ((wc0) drawable2).k();
        }
        Drawable drawable3 = this.d;
        if (drawable3 instanceof org.telegram.ui.tn) {
            ((org.telegram.ui.tn) drawable3).f(this.L);
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof wc0) {
            ((wc0) drawable4).k();
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
        gw0 gw0Var = this.Q;
        if (gw0Var != null) {
            gw0Var.c.recycle();
            this.Q = null;
        }
        int i10 = 0;
        while (true) {
            arrayList = this.S;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((gw0) arrayList.get(i10)).c.recycle();
            }
            i10++;
        }
        arrayList.clear();
        this.O = false;
        Drawable drawable = this.b;
        if (drawable instanceof org.telegram.ui.tn) {
            ((org.telegram.ui.tn) drawable).g(this.L);
        }
        Drawable drawable2 = this.d;
        if (drawable2 instanceof org.telegram.ui.tn) {
            ((org.telegram.ui.tn) drawable2).g(this.L);
        }
        Drawable drawable3 = this.b;
        if (drawable3 instanceof wc0) {
            ((wc0) drawable3).l();
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof wc0) {
            ((wc0) drawable4).l();
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
            ai.ic icVar = this.L;
            if (icVar != null) {
                icVar.invalidate();
            }
        }
    }

    public void setBottomClip(int i10) {
        if (i10 != this.h) {
            this.h = i10;
            ai.ic icVar = this.L;
            if (icVar != null) {
                icVar.invalidate();
            }
        }
    }

    public void setDelegate(jw0 jw0Var) {
        this.n = jw0Var;
    }

    public void setEmojiKeyboardHeight(int i10) {
        if (this.I != i10) {
            this.I = i10;
            ai.ic icVar = this.L;
            if (icVar != null) {
                icVar.invalidate();
            }
        }
    }

    public void setOccupyStatusBar(boolean z10) {
        this.s = z10;
    }

    public void setSkipBackgroundDrawing(boolean z10) {
        if (this.J != z10) {
            this.J = z10;
            ai.ic icVar = this.L;
            if (icVar != null) {
                icVar.invalidate();
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

    public void d() {
    }

    public void L(Canvas canvas, ArrayList arrayList) {
    }
}
