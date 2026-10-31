package org.telegram.ui.Components;

import android.content.Context;
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
import java.util.HashSet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class uu0 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public static boolean e0;
    public float D;
    public int E;
    public boolean F;
    public final org.telegram.ui.ActionBar.z4 G;
    public org.telegram.ui.ActionBar.m1 H;
    public int I;
    public boolean J;
    public fv0 K;
    public bi.t0 L;
    public boolean M;
    public final ArrayList N;
    public final ArrayList O;
    public final Paint P;
    public final Paint Q;
    public final Paint R;
    public final Paint S;
    public float T;
    public float U;
    public float V;
    public RenderNode[] W;
    public final Rect a;
    public final boolean[] a0;
    public Drawable b;
    public final boolean[] b0;
    public boolean c;
    public final ArrayList c0;
    public Drawable d;
    public final ArrayList d0;
    public boolean e;
    public int f;
    public int h;
    public tu0 n;
    public final ArrayList r;
    public boolean s;
    public z71 w;
    public float x;
    public float y;

    public uu0(Context context, org.telegram.ui.ActionBar.z4 z4Var) {
        super(context);
        this.a = new Rect();
        this.r = new ArrayList();
        this.s = true;
        this.D = 1.0f;
        this.F = true;
        this.N = new ArrayList(10);
        this.O = new ArrayList();
        new Matrix();
        new Matrix();
        this.P = new Paint();
        this.Q = new Paint();
        this.R = new Paint();
        this.S = new Paint();
        this.T = 1.0f;
        this.a0 = new boolean[2];
        this.b0 = new boolean[2];
        this.c0 = new ArrayList();
        this.d0 = new ArrayList();
        setWillNotDraw(false);
        this.G = z4Var;
        this.H = null;
    }

    public static boolean E() {
        return Build.VERSION.SDK_INT >= 31 && org.telegram.messenger.tz.a0;
    }

    public static void F(uu0 uu0Var, Canvas canvas) {
        if (uu0Var.L != null && org.telegram.ui.ActionBar.t6.G1 && org.telegram.messenger.sc.e(32)) {
            if (uu0Var.K == null) {
                fv0 fv0Var = new fv0(1);
                uu0Var.K = fv0Var;
                fv0Var.g = -1;
                fv0Var.c();
            }
            uu0Var.K.b(canvas, uu0Var.L);
        }
    }

    public static float getBlurRadius() {
        int o10 = org.telegram.messenger.tz.o();
        if (o10 != 1) {
            return o10 != 2 ? 3.0f : 60.0f;
        }
        return 4.0f;
    }

    public static float getRenderNodeScale() {
        int L;
        int o10 = org.telegram.messenger.tz.o();
        if (o10 == 1) {
            L = org.telegram.messenger.i0.L(12.0f);
        } else {
            if (o10 == 2) {
                return org.telegram.messenger.i0.p;
            }
            L = org.telegram.messenger.i0.L(15.0f);
        }
        return L;
    }

    public final void G() {
        if (!this.e && !this.c) {
            z71 z71Var = this.w;
            if (z71Var != null) {
                z71Var.c(false);
                this.w = null;
                this.D = 1.0f;
                this.x = 0.0f;
                this.y = 0.0f;
                return;
            }
            return;
        }
        if (this.w == null) {
            z71 z71Var2 = new z71(getContext());
            this.w = z71Var2;
            z71Var2.n = new px(this, 21);
            if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
                z71 z71Var3 = this.w;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                z71Var3.getClass();
                this.D = z71.a(measuredWidth, measuredHeight);
            }
        }
        if (this.F) {
            return;
        }
        this.w.c(true);
    }

    public void H(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        I(canvas, f7, rect, paint, z10, Color.alpha(org.telegram.ui.ActionBar.t6.w0((E() && org.telegram.messenger.tz.o() == 2) ? org.telegram.ui.ActionBar.t6.lg : org.telegram.ui.ActionBar.t6.mg, getResourceProvider())));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10, int i10) {
        int i11;
        boolean z11;
        float f10;
        RenderNode renderNode;
        float f11;
        boolean z12;
        Shader.TileMode tileMode;
        if (!org.telegram.messenger.tz.f()) {
            canvas.drawRect(rect, paint);
            return;
        }
        if (!E()) {
            canvas.drawRect(rect, paint);
            return;
        }
        if (!canvas.isHardwareAccelerated()) {
            canvas.drawRect(rect, paint);
            return;
        }
        if (this.W == null) {
            this.W = new RenderNode[2];
        }
        float renderNodeScale = getRenderNodeScale();
        int i12 = !z10 ? 1 : 0;
        boolean[] zArr = this.b0;
        if (!z10 && !zArr[i12] && Math.abs(getBottomOffset() - this.U) > 0.1f) {
            zArr[i12] = true;
        }
        int L = org.telegram.messenger.i0.L(36.0f);
        if (i10 < 255 && zArr[i12]) {
            boolean[] zArr2 = this.a0;
            if (!zArr2[i12]) {
                RenderNode[] renderNodeArr = this.W;
                if (renderNodeArr[i12] == null) {
                    z11 = true;
                    f10 = 1.0f;
                    renderNodeArr[i12] = new RenderNode("blurNode" + i12);
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(2.0f);
                    RenderNode renderNode2 = this.W[i12];
                    float blurRadiusInternal = getBlurRadiusInternal();
                    float blurRadiusInternal2 = getBlurRadiusInternal();
                    tileMode = Shader.TileMode.DECAL;
                    renderNode2.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(blurRadiusInternal, blurRadiusInternal2, tileMode), RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix))));
                } else {
                    z11 = true;
                    f10 = 1.0f;
                }
                int measuredWidth = getMeasuredWidth();
                int L2 = org.telegram.messenger.i0.L(100.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.m;
                int i13 = 0;
                this.W[i12].setPosition(0, 0, (int) (measuredWidth / renderNodeScale), (int) (((L * 2) + L2) / renderNodeScale));
                RecordingCanvas beginRecording = this.W[i12].beginRecording();
                e0 = z11;
                float f12 = f10 / renderNodeScale;
                beginRecording.scale(f12, f12);
                beginRecording.drawPaint(paint);
                beginRecording.translate(0.0f, L);
                if (!z10) {
                    float bottomOffset = getBottomOffset();
                    this.U = bottomOffset;
                    float f13 = bottomOffset - L2;
                    this.V = f13;
                    beginRecording.translate(0.0f, -f13);
                }
                if (N()) {
                    ArrayList arrayList = this.c0;
                    arrayList.clear();
                    ArrayList arrayList2 = this.d0;
                    arrayList.addAll(arrayList2);
                    arrayList2.clear();
                    J(beginRecording, arrayList2);
                    int size = arrayList.size();
                    z12 = false;
                    while (i13 < size) {
                        Object obj = arrayList.get(i13);
                        i13++;
                        ((ru0) obj).f(null);
                        i12 = i12;
                    }
                    i11 = i12;
                    int size2 = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        Object obj2 = arrayList2.get(i14);
                        i14++;
                        ((ru0) obj2).f(new uo0(this, 9));
                    }
                } else {
                    J(beginRecording, null);
                    i11 = i12;
                    z12 = false;
                }
                e0 = z12;
                this.W[i11].endRecording();
                zArr2[i11] = z11;
                zArr[i11] = z12;
                if (!N()) {
                    zArr[i11] = z11;
                    M();
                }
                canvas.save();
                canvas.drawRect(rect, paint);
                canvas.clipRect(rect);
                renderNode = this.W[i11];
                if (renderNode != null && i10 < 255) {
                    renderNode.setAlpha(f10 - (i10 / 255.0f));
                    if (z10) {
                        f11 = 0.0f;
                        canvas.translate(0.0f, ((-f7) + this.V) - (this.U - (getListTranslationY() + getBottomOffset())));
                    } else {
                        f11 = 0.0f;
                        canvas.translate(0.0f, (-f7) - getTranslationY());
                    }
                    canvas.translate(f11, -L);
                    canvas.scale(renderNodeScale, renderNodeScale);
                    canvas.drawRenderNode(this.W[i11]);
                }
                canvas.restore();
            }
        }
        i11 = i12;
        z11 = true;
        f10 = 1.0f;
        if (!N()) {
        }
        canvas.save();
        canvas.drawRect(rect, paint);
        canvas.clipRect(rect);
        renderNode = this.W[i11];
        if (renderNode != null) {
            renderNode.setAlpha(f10 - (i10 / 255.0f));
            if (z10) {
            }
            canvas.translate(f11, -L);
            canvas.scale(renderNodeScale, renderNodeScale);
            canvas.drawRenderNode(this.W[i11]);
        }
        canvas.restore();
    }

    public void L() {
        org.telegram.messenger.tz.f();
    }

    public final void M() {
        boolean[] zArr = this.b0;
        int i10 = 0;
        zArr[0] = true;
        zArr[1] = true;
        while (true) {
            ArrayList arrayList = this.O;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((View) arrayList.get(i10)).invalidate();
            i10++;
        }
    }

    public boolean N() {
        return this instanceof org.telegram.ui.km;
    }

    public boolean O() {
        return !(this instanceof org.telegram.ui.hb);
    }

    public boolean P() {
        return !(this instanceof org.telegram.ui.hb);
    }

    public int Q() {
        View rootView = getRootView();
        Rect rect = this.a;
        getWindowVisibleDisplayFrame(rect);
        if (rect.bottom == 0 && rect.top == 0) {
            return 0;
        }
        int max = Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? org.telegram.messenger.i0.m : 0)) - org.telegram.messenger.i0.q1(rootView)) - (rect.bottom - rect.top));
        this.f = max;
        return max;
    }

    public void R() {
        if (this.w != null) {
            this.D = z71.a(getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.n == null && this.r.isEmpty()) {
            return;
        }
        this.f = Q();
        Point point = org.telegram.messenger.i0.q;
        post(new k2.v(22, this, point.x > point.y));
    }

    public final void U(Drawable drawable) {
        if (this.b == drawable) {
            return;
        }
        if (this.L == null) {
            bi.t0 t0Var = new bi.t0(this, getContext(), 21);
            this.L = t0Var;
            addView(t0Var, 0, w7.b6.c(-1.0f, -1));
        }
        if (drawable instanceof jb0) {
            ((jb0) drawable).q(this.L);
        }
        if (this.M) {
            Drawable drawable2 = this.b;
            if (drawable2 instanceof org.telegram.ui.xn) {
                ((org.telegram.ui.xn) drawable2).g(this.L);
            }
        }
        this.b = drawable;
        if (this.M && (drawable instanceof org.telegram.ui.xn)) {
            ((org.telegram.ui.xn) drawable).f(this.L);
        }
        if (this.M) {
            Drawable drawable3 = this.b;
            if (drawable3 instanceof jb0) {
                ((jb0) drawable3).l();
            }
        }
        if (this.M) {
            Drawable drawable4 = this.b;
            if (drawable4 instanceof jb0) {
                ((jb0) drawable4).k();
            }
        }
        T(this.b);
        G();
        this.L.invalidate();
    }

    public void V() {
        if (E()) {
            M();
        }
    }

    public boolean W() {
        return !(this instanceof ph.a4);
    }

    public void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.mg));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.lg));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        boolean[] zArr = this.a0;
        zArr[0] = false;
        zArr[1] = false;
        super.dispatchDraw(canvas);
    }

    public Drawable getBackgroundImage() {
        return this.b;
    }

    public int getBackgroundSizeY() {
        return getMeasuredHeight() - (this.b instanceof org.telegram.ui.xn ? this.E : 0);
    }

    public int getBackgroundTranslationY() {
        Drawable drawable = this.b;
        if (drawable instanceof jb0) {
            return this.E;
        }
        if (drawable instanceof org.telegram.ui.xn) {
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
        return org.telegram.ui.ActionBar.t6.t0();
    }

    public boolean getNewDrawableMotion() {
        return org.telegram.ui.ActionBar.t6.i0;
    }

    public org.telegram.ui.ActionBar.p6 getResourceProvider() {
        return null;
    }

    public int getScrollOffset() {
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.M = true;
        Drawable drawable = this.b;
        if (drawable instanceof org.telegram.ui.xn) {
            ((org.telegram.ui.xn) drawable).f(this.L);
        }
        Drawable drawable2 = this.b;
        if (drawable2 instanceof jb0) {
            ((jb0) drawable2).k();
        }
        Drawable drawable3 = this.d;
        if (drawable3 instanceof org.telegram.ui.xn) {
            ((org.telegram.ui.xn) drawable3).f(this.L);
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof jb0) {
            ((jb0) drawable4).k();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        this.M = false;
        this.P.setShader(null);
        this.Q.setShader(null);
        this.R.setShader(null);
        this.S.setShader(null);
        while (true) {
            ArrayList arrayList = this.N;
            if (i10 >= arrayList.size()) {
                arrayList.clear();
                Drawable drawable = this.b;
                if (drawable instanceof org.telegram.ui.xn) {
                    ((org.telegram.ui.xn) drawable).g(this.L);
                }
                Drawable drawable2 = this.d;
                if (drawable2 instanceof org.telegram.ui.xn) {
                    ((org.telegram.ui.xn) drawable2).g(this.L);
                }
                Drawable drawable3 = this.b;
                if (drawable3 instanceof jb0) {
                    ((jb0) drawable3).l();
                }
                Drawable drawable4 = this.d;
                if (drawable4 instanceof jb0) {
                    ((jb0) drawable4).l();
                    return;
                }
                return;
            }
            if (arrayList.get(i10) != null) {
                ((qu0) arrayList.get(i10)).getClass();
                throw null;
            }
            i10++;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        R();
    }

    public void setBackgroundTranslation(int i10) {
        if (i10 != this.E) {
            this.E = i10;
            bi.t0 t0Var = this.L;
            if (t0Var != null) {
                t0Var.invalidate();
            }
        }
    }

    public void setBottomClip(int i10) {
        if (i10 != this.h) {
            this.h = i10;
            bi.t0 t0Var = this.L;
            if (t0Var != null) {
                t0Var.invalidate();
            }
        }
    }

    public void setDelegate(tu0 tu0Var) {
        this.n = tu0Var;
    }

    public void setEmojiKeyboardHeight(int i10) {
        if (this.I != i10) {
            this.I = i10;
            bi.t0 t0Var = this.L;
            if (t0Var != null) {
                t0Var.invalidate();
            }
        }
    }

    public void setOccupyStatusBar(boolean z10) {
        this.s = z10;
    }

    public void setSkipBackgroundDrawing(boolean z10) {
        if (this.J != z10) {
            this.J = z10;
            bi.t0 t0Var = this.L;
            if (t0Var != null) {
                t0Var.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == getBackgroundImage() || super.verifyDrawable(drawable);
    }

    public void T(Drawable drawable) {
    }

    public void S() {
    }

    public void updateColors() {
    }

    public void J(Canvas canvas, ArrayList arrayList) {
    }
}
