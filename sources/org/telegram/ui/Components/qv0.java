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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class qv0 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public static DispatchQueue r0;
    public static boolean s0;
    public int B;
    public boolean C;
    public final org.telegram.ui.ActionBar.e5 D;
    public org.telegram.ui.ActionBar.r1 E;
    public int F;
    public boolean G;
    public bw0 H;
    public eg.h0 I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public mv0 N;
    public mv0 O;
    public final ArrayList P;
    public final ArrayList Q;
    public final Matrix R;
    public final Matrix S;
    public final Paint T;
    public final Paint U;
    public final Paint V;
    public final Paint W;
    public final Rect a;
    public Paint a0;
    public Drawable b;
    public Paint b0;
    public boolean c;
    public float c0;
    public Drawable d;
    public ValueAnimator d0;
    public boolean e;
    public boolean e0;
    public int f;
    public int f0;
    public int g0;
    public int h;
    public int h0;
    public float i0;
    public final androidx.activity.g j0;
    public float k0;
    public float l0;
    public RenderNode[] m0;
    public pv0 n;
    public final boolean[] n0;
    public final boolean[] o0;
    public final ArrayList p0;
    public final ArrayList q0;
    public final ArrayList r;
    public boolean s;
    public o81 v;
    public float w;
    public float x;
    public float y;

    public qv0(Context context, org.telegram.ui.ActionBar.e5 e5Var) {
        super(context);
        this.a = new Rect();
        this.r = new ArrayList();
        this.s = true;
        this.y = 1.0f;
        this.C = true;
        this.P = new ArrayList(10);
        this.Q = new ArrayList();
        this.R = new Matrix();
        this.S = new Matrix();
        this.T = new Paint();
        this.U = new Paint();
        this.V = new Paint();
        this.W = new Paint();
        this.i0 = 1.0f;
        this.j0 = new androidx.activity.g(this);
        this.n0 = new boolean[2];
        this.o0 = new boolean[2];
        this.p0 = new ArrayList();
        this.q0 = new ArrayList();
        setWillNotDraw(false);
        this.D = e5Var;
        this.E = null;
    }

    public static boolean F() {
        return Build.VERSION.SDK_INT >= 31 && SharedConfig.useNewBlur;
    }

    public static void H(qv0 qv0Var, Canvas canvas) {
        if (qv0Var.I != null && org.telegram.ui.ActionBar.j6.G1 && LiteMode.isEnabled(32)) {
            if (qv0Var.H == null) {
                bw0 bw0Var = new bw0(1);
                qv0Var.H = bw0Var;
                bw0Var.g = -1;
                bw0Var.c();
            }
            qv0Var.H.b(canvas, qv0Var.I);
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
            o81 o81Var = this.v;
            if (o81Var != null) {
                o81Var.c(false);
                this.v = null;
                this.y = 1.0f;
                this.w = 0.0f;
                this.x = 0.0f;
                return;
            }
            return;
        }
        if (this.v == null) {
            o81 o81Var2 = new o81(getContext());
            this.v = o81Var2;
            o81Var2.n = new ev(this, 21);
            if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
                o81 o81Var3 = this.v;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                o81Var3.getClass();
                this.y = o81.a(measuredWidth, measuredHeight);
            }
        }
        if (this.C) {
            return;
        }
        this.v.c(true);
    }

    public void J(Canvas canvas, float f10, Rect rect, Paint paint, boolean z4) {
        K(canvas, f10, rect, paint, z4, Color.alpha(org.telegram.ui.ActionBar.j6.v0((F() && SharedConfig.getDevicePerformanceClass() == 2) ? org.telegram.ui.ActionBar.j6.xf : org.telegram.ui.ActionBar.j6.yf, getResourceProvider())));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K(Canvas canvas, float f10, Rect rect, Paint paint, boolean z4, int i10) {
        float f11;
        float f12;
        boolean z10;
        RenderNode renderNode;
        float f13;
        boolean z11;
        Shader.TileMode tileMode;
        float f14 = f10;
        if (!SharedConfig.chatBlurEnabled()) {
            canvas.drawRect(rect, paint);
            return;
        }
        if (!F()) {
            if (this.N == null) {
                canvas.drawRect(rect, paint);
                return;
            }
            this.a0 = z4 ? this.T : this.V;
            this.b0 = z4 ? this.U : this.W;
            if (z4) {
                f14 += getTranslationY();
            }
            if (this.a0.getShader() != null) {
                Matrix matrix = this.R;
                matrix.reset();
                Matrix matrix2 = this.S;
                matrix2.reset();
                if (z4) {
                    float f15 = -f14;
                    matrix.setTranslate(0.0f, (f15 - this.N.a) - 34.0f);
                    mv0 mv0Var = this.N;
                    matrix.preScale(mv0Var.d, mv0Var.e);
                    if (this.O != null) {
                        matrix2.setTranslate(0.0f, (f15 - r6.a) - 34.0f);
                        mv0 mv0Var2 = this.O;
                        matrix2.preScale(mv0Var2.d, mv0Var2.e);
                    }
                } else {
                    this.N.getClass();
                    float f16 = (-f14) + 0.0f;
                    matrix.setTranslate(0.0f, ((f16 - r6.a) - 34.0f) - (0.0f - (getListTranslationY() + getBottomOffset())));
                    this.N.getClass();
                    matrix.preScale(0.0f, 0.0f);
                    if (this.O != null) {
                        matrix2.setTranslate(0.0f, ((f16 - r6.a) - 34.0f) - (0.0f - (getListTranslationY() + getBottomOffset())));
                        this.O.getClass();
                        matrix2.preScale(0.0f, 0.0f);
                    }
                }
                this.a0.getShader().setLocalMatrix(matrix);
                if (this.b0.getShader() != null) {
                    this.b0.getShader().setLocalMatrix(matrix);
                }
            }
            paint.setAlpha(255);
            if (this.c0 == 1.0f || this.b0.getShader() == null) {
                canvas.drawRect(rect, paint);
                canvas.drawRect(rect, this.a0);
            } else {
                canvas.drawRect(rect, paint);
                canvas.drawRect(rect, this.b0);
                canvas.saveLayerAlpha(rect.left, rect.top, rect.right, rect.bottom, (int) (this.c0 * 255.0f), 31);
                canvas.drawRect(rect, paint);
                canvas.drawRect(rect, this.a0);
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
        if (this.m0 == null) {
            this.m0 = new RenderNode[2];
        }
        float renderNodeScale = getRenderNodeScale();
        int i11 = !z4 ? 1 : 0;
        boolean[] zArr = this.o0;
        if (!z4 && !zArr[i11] && Math.abs(getBottomOffset() - this.k0) > 0.1f) {
            zArr[i11] = true;
        }
        int dp = AndroidUtilities.dp(36.0f);
        if (i10 < 255 && zArr[i11]) {
            boolean[] zArr2 = this.n0;
            if (!zArr2[i11]) {
                f11 = 255.0f;
                RenderNode[] renderNodeArr = this.m0;
                if (renderNodeArr[i11] == null) {
                    f12 = 1.0f;
                    z10 = true;
                    renderNodeArr[i11] = new RenderNode("blurNode" + i11);
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(2.0f);
                    RenderNode renderNode2 = this.m0[i11];
                    float blurRadiusInternal = getBlurRadiusInternal();
                    float blurRadiusInternal2 = getBlurRadiusInternal();
                    tileMode = Shader.TileMode.DECAL;
                    renderNode2.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(blurRadiusInternal, blurRadiusInternal2, tileMode), RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix))));
                } else {
                    f12 = 1.0f;
                    z10 = true;
                }
                int measuredWidth = getMeasuredWidth();
                int dp2 = AndroidUtilities.dp(100.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                int i12 = 0;
                this.m0[i11].setPosition(0, 0, (int) (measuredWidth / renderNodeScale), (int) (((dp * 2) + dp2) / renderNodeScale));
                RecordingCanvas beginRecording = this.m0[i11].beginRecording();
                s0 = z10;
                float f17 = f12 / renderNodeScale;
                beginRecording.scale(f17, f17);
                beginRecording.drawPaint(paint);
                beginRecording.translate(0.0f, dp);
                if (!z4) {
                    float bottomOffset = getBottomOffset();
                    this.k0 = bottomOffset;
                    float f18 = bottomOffset - dp2;
                    this.l0 = f18;
                    beginRecording.translate(0.0f, -f18);
                }
                if (O()) {
                    ArrayList arrayList = this.p0;
                    arrayList.clear();
                    ArrayList arrayList2 = this.q0;
                    arrayList.addAll(arrayList2);
                    arrayList2.clear();
                    L(beginRecording, arrayList2);
                    z11 = false;
                    for (int size = arrayList.size(); i12 < size; size = size) {
                        Object obj = arrayList.get(i12);
                        i12++;
                        ((nv0) obj).g(null);
                    }
                    int i13 = 0;
                    for (int size2 = arrayList2.size(); i13 < size2; size2 = size2) {
                        Object obj2 = arrayList2.get(i13);
                        i13++;
                        ((nv0) obj2).g(new nq0(this, 7));
                    }
                } else {
                    L(beginRecording, null);
                    z11 = false;
                }
                s0 = z11;
                this.m0[i11].endRecording();
                zArr2[i11] = z10;
                zArr[i11] = z11;
                if (!O()) {
                    zArr[i11] = z10;
                    N();
                }
                canvas.save();
                canvas.drawRect(rect, paint);
                canvas.clipRect(rect);
                renderNode = this.m0[i11];
                if (renderNode != null && i10 < 255) {
                    renderNode.setAlpha(f12 - (i10 / f11));
                    if (z4) {
                        f13 = 0.0f;
                        canvas.translate(0.0f, ((-f14) + this.l0) - (this.k0 - (getListTranslationY() + getBottomOffset())));
                    } else {
                        f13 = 0.0f;
                        canvas.translate(0.0f, (-f14) - getTranslationY());
                    }
                    canvas.translate(f13, -dp);
                    canvas.scale(renderNodeScale, renderNodeScale);
                    canvas.drawRenderNode(this.m0[i11]);
                }
                canvas.restore();
            }
        }
        f11 = 255.0f;
        f12 = 1.0f;
        z10 = true;
        if (!O()) {
        }
        canvas.save();
        canvas.drawRect(rect, paint);
        canvas.clipRect(rect);
        renderNode = this.m0[i11];
        if (renderNode != null) {
            renderNode.setAlpha(f12 - (i10 / f11));
            if (z4) {
            }
            canvas.translate(f13, -dp);
            canvas.scale(renderNodeScale, renderNodeScale);
            canvas.drawRenderNode(this.m0[i11]);
        }
        canvas.restore();
    }

    public void M() {
        if (SharedConfig.chatBlurEnabled()) {
            this.e0 = true;
            if (!this.L || this.M) {
                return;
            }
            invalidate();
        }
    }

    public final void N() {
        boolean[] zArr = this.o0;
        int i10 = 0;
        zArr[0] = true;
        zArr[1] = true;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((View) arrayList.get(i10)).invalidate();
            i10++;
        }
    }

    public boolean O() {
        return this instanceof org.telegram.ui.rm;
    }

    public boolean P() {
        return !(this instanceof org.telegram.ui.ib);
    }

    public boolean Q() {
        return !(this instanceof org.telegram.ui.ib);
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
            this.y = o81.a(getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.n == null && this.r.isEmpty()) {
            return;
        }
        this.f = R();
        Point point = AndroidUtilities.displaySize;
        post(new kv0(0, this, point.x > point.y));
    }

    public final void V(Drawable drawable) {
        if (this.b == drawable) {
            return;
        }
        if (this.I == null) {
            eg.h0 h0Var = new eg.h0(this, getContext(), 19);
            this.I = h0Var;
            addView(h0Var, 0, k7.b6.c(-1.0f, -1));
        }
        if (drawable instanceof ec0) {
            ((ec0) drawable).r(this.I);
        }
        if (this.J) {
            Drawable drawable2 = this.b;
            if (drawable2 instanceof org.telegram.ui.co) {
                ((org.telegram.ui.co) drawable2).g(this.I);
            }
        }
        this.b = drawable;
        if (this.J && (drawable instanceof org.telegram.ui.co)) {
            ((org.telegram.ui.co) drawable).f(this.I);
        }
        if (this.J) {
            Drawable drawable3 = this.b;
            if (drawable3 instanceof ec0) {
                ((ec0) drawable3).l();
            }
        }
        if (this.J) {
            Drawable drawable4 = this.b;
            if (drawable4 instanceof ec0) {
                ((ec0) drawable4).k();
            }
        }
        U(this.b);
        I();
        this.I.invalidate();
    }

    public final void W() {
        if (!this.L || this.M || !this.e0 || !SharedConfig.chatBlurEnabled() || F() || Color.alpha(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.yf, false)) == 255) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int dp = AndroidUtilities.dp(100.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        if (measuredWidth == 0 || dp == 0) {
            return;
        }
        this.e0 = false;
        this.M = true;
        float f10 = dp;
        int i10 = ((int) (f10 / 12.0f)) + 34;
        float f11 = measuredWidth;
        int i11 = (int) (f11 / 12.0f);
        System.currentTimeMillis();
        ArrayList arrayList = this.P;
        mv0 mv0Var = arrayList.size() > 0 ? (mv0) e2.c.g(1, arrayList) : null;
        if (mv0Var == null) {
            mv0Var = new mv0();
            mv0Var.c = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            mv0Var.b = new ov0(mv0Var.c);
        } else {
            mv0Var.c.eraseColor(0);
        }
        float width = mv0Var.c.getWidth() / f11;
        float height = (mv0Var.c.getHeight() - 34) / f10;
        int save = mv0Var.b.save();
        mv0Var.a = getScrollOffset() % 24;
        float f12 = 10.0f * height;
        mv0Var.b.clipRect(1.0f, f12, mv0Var.c.getWidth(), mv0Var.c.getHeight() - 1);
        mv0Var.b.scale(width, height);
        mv0Var.b.translate(0.0f, f12 + mv0Var.a);
        mv0Var.d = 1.0f / width;
        mv0Var.e = 1.0f / height;
        L(mv0Var.b, null);
        try {
            mv0Var.b.restoreToCount(save);
        } catch (Exception e) {
            FileLog.e(e);
        }
        System.currentTimeMillis();
        int i12 = this.h0 + 1;
        this.h0 = i12;
        if (i12 >= 20) {
            this.h0 = 0;
        }
        if (r0 == null) {
            r0 = new DispatchQueue("BlurQueue");
        }
        int max = (int) (((int) (Math.max(6, Math.max(dp, measuredWidth) / 180) * 2.5f)) * org.telegram.ui.n5.d);
        androidx.activity.g gVar = this.j0;
        gVar.b = max;
        gVar.d = mv0Var;
        r0.postRunnable(gVar);
    }

    public void X() {
        if (F()) {
            N();
        }
    }

    public boolean Y() {
        return !(this instanceof kh.x5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        boolean[] zArr = this.n0;
        zArr[0] = false;
        zArr[1] = false;
        if (this.L) {
            W();
        }
        super.dispatchDraw(canvas);
    }

    public Drawable getBackgroundImage() {
        return this.b;
    }

    public int getBackgroundSizeY() {
        return getMeasuredHeight() - (this.b instanceof org.telegram.ui.co ? this.B : 0);
    }

    public int getBackgroundTranslationY() {
        Drawable drawable = this.b;
        if (drawable instanceof ec0) {
            return this.B;
        }
        if (drawable instanceof org.telegram.ui.co) {
            return this.B;
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
        this.J = true;
        if (this.K && !this.L) {
            this.L = true;
            this.e0 = true;
        }
        Drawable drawable = this.b;
        if (drawable instanceof org.telegram.ui.co) {
            ((org.telegram.ui.co) drawable).f(this.I);
        }
        Drawable drawable2 = this.b;
        if (drawable2 instanceof ec0) {
            ((ec0) drawable2).k();
        }
        Drawable drawable3 = this.d;
        if (drawable3 instanceof org.telegram.ui.co) {
            ((org.telegram.ui.co) drawable3).f(this.I);
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof ec0) {
            ((ec0) drawable4).k();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        this.J = false;
        this.T.setShader(null);
        this.U.setShader(null);
        this.V.setShader(null);
        this.W.setShader(null);
        ValueAnimator valueAnimator = this.d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        mv0 mv0Var = this.N;
        if (mv0Var != null) {
            mv0Var.c.recycle();
            this.N = null;
        }
        int i10 = 0;
        while (true) {
            arrayList = this.P;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((mv0) arrayList.get(i10)).c.recycle();
            }
            i10++;
        }
        arrayList.clear();
        this.L = false;
        Drawable drawable = this.b;
        if (drawable instanceof org.telegram.ui.co) {
            ((org.telegram.ui.co) drawable).g(this.I);
        }
        Drawable drawable2 = this.d;
        if (drawable2 instanceof org.telegram.ui.co) {
            ((org.telegram.ui.co) drawable2).g(this.I);
        }
        Drawable drawable3 = this.b;
        if (drawable3 instanceof ec0) {
            ((ec0) drawable3).l();
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof ec0) {
            ((ec0) drawable4).l();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        S();
    }

    public void setBackgroundTranslation(int i10) {
        if (i10 != this.B) {
            this.B = i10;
            eg.h0 h0Var = this.I;
            if (h0Var != null) {
                h0Var.invalidate();
            }
        }
    }

    public void setBottomClip(int i10) {
        if (i10 != this.h) {
            this.h = i10;
            eg.h0 h0Var = this.I;
            if (h0Var != null) {
                h0Var.invalidate();
            }
        }
    }

    public void setDelegate(pv0 pv0Var) {
        this.n = pv0Var;
    }

    public void setEmojiKeyboardHeight(int i10) {
        if (this.F != i10) {
            this.F = i10;
            eg.h0 h0Var = this.I;
            if (h0Var != null) {
                h0Var.invalidate();
            }
        }
    }

    public void setOccupyStatusBar(boolean z4) {
        this.s = z4;
    }

    public void setSkipBackgroundDrawing(boolean z4) {
        if (this.G != z4) {
            this.G = z4;
            eg.h0 h0Var = this.I;
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
