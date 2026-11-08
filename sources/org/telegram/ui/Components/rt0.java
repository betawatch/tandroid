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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public class rt0 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public static boolean e0;
    public float D;
    public int E;
    public boolean F;
    public final org.telegram.ui.ActionBar.q4 G;
    public org.telegram.ui.ActionBar.i1 H;
    public int I;
    public boolean J;
    public cu0 K;
    public bi.ec L;
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
    public qt0 n;
    public final ArrayList r;
    public boolean s;
    public y61 w;
    public float x;
    public float y;

    public rt0(Context context, org.telegram.ui.ActionBar.q4 q4Var) {
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
        this.G = q4Var;
        this.H = null;
    }

    public static boolean E() {
        return Build.VERSION.SDK_INT >= 31 && org.telegram.messenger.iz.a0;
    }

    public static void F(rt0 rt0Var, Canvas canvas) {
        if (rt0Var.L != null && org.telegram.ui.ActionBar.k6.G1 && org.telegram.messenger.sc.e(32)) {
            if (rt0Var.K == null) {
                cu0 cu0Var = new cu0(1);
                rt0Var.K = cu0Var;
                cu0Var.g = -1;
                cu0Var.c();
            }
            rt0Var.K.b(canvas, rt0Var.L);
        }
    }

    public static float getBlurRadius() {
        int o4 = org.telegram.messenger.iz.o();
        if (o4 != 1) {
            return o4 != 2 ? 3.0f : 60.0f;
        }
        return 4.0f;
    }

    public static float getRenderNodeScale() {
        int L;
        int o4 = org.telegram.messenger.iz.o();
        if (o4 == 1) {
            L = org.telegram.messenger.g0.L(12.0f);
        } else {
            if (o4 == 2) {
                return org.telegram.messenger.g0.p;
            }
            L = org.telegram.messenger.g0.L(15.0f);
        }
        return L;
    }

    public final void G() {
        if (!this.e && !this.c) {
            y61 y61Var = this.w;
            if (y61Var != null) {
                y61Var.c(false);
                this.w = null;
                this.D = 1.0f;
                this.x = 0.0f;
                this.y = 0.0f;
                return;
            }
            return;
        }
        if (this.w == null) {
            y61 y61Var2 = new y61(getContext());
            this.w = y61Var2;
            y61Var2.n = new bx(this, 21);
            if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
                y61 y61Var3 = this.w;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                y61Var3.getClass();
                this.D = y61.a(measuredWidth, measuredHeight);
            }
        }
        if (this.F) {
            return;
        }
        this.w.c(true);
    }

    public void H(Canvas canvas, float f10, Rect rect, Paint paint, boolean z9) {
        I(canvas, f10, rect, paint, z9, Color.alpha(org.telegram.ui.ActionBar.k6.w0((E() && org.telegram.messenger.iz.o() == 2) ? org.telegram.ui.ActionBar.k6.lg : org.telegram.ui.ActionBar.k6.mg, getResourceProvider())));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I(Canvas canvas, float f10, Rect rect, Paint paint, boolean z9, int i7) {
        int i10;
        boolean z10;
        float f11;
        RenderNode renderNode;
        float f12;
        boolean z11;
        Shader.TileMode tileMode;
        if (!org.telegram.messenger.iz.f()) {
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
        int i11 = !z9 ? 1 : 0;
        boolean[] zArr = this.b0;
        if (!z9 && !zArr[i11] && Math.abs(getBottomOffset() - this.U) > 0.1f) {
            zArr[i11] = true;
        }
        int L = org.telegram.messenger.g0.L(36.0f);
        if (i7 < 255 && zArr[i11]) {
            boolean[] zArr2 = this.a0;
            if (!zArr2[i11]) {
                RenderNode[] renderNodeArr = this.W;
                if (renderNodeArr[i11] == null) {
                    z10 = true;
                    f11 = 1.0f;
                    renderNodeArr[i11] = new RenderNode("blurNode" + i11);
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(2.0f);
                    RenderNode renderNode2 = this.W[i11];
                    float blurRadiusInternal = getBlurRadiusInternal();
                    float blurRadiusInternal2 = getBlurRadiusInternal();
                    tileMode = Shader.TileMode.DECAL;
                    renderNode2.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(blurRadiusInternal, blurRadiusInternal2, tileMode), RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix))));
                } else {
                    z10 = true;
                    f11 = 1.0f;
                }
                int measuredWidth = getMeasuredWidth();
                int L2 = org.telegram.messenger.g0.L(100.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m;
                int i12 = 0;
                this.W[i11].setPosition(0, 0, (int) (measuredWidth / renderNodeScale), (int) (((L * 2) + L2) / renderNodeScale));
                RecordingCanvas beginRecording = this.W[i11].beginRecording();
                e0 = z10;
                float f13 = f11 / renderNodeScale;
                beginRecording.scale(f13, f13);
                beginRecording.drawPaint(paint);
                beginRecording.translate(0.0f, L);
                if (!z9) {
                    float bottomOffset = getBottomOffset();
                    this.U = bottomOffset;
                    float f14 = bottomOffset - L2;
                    this.V = f14;
                    beginRecording.translate(0.0f, -f14);
                }
                if (N()) {
                    ArrayList arrayList = this.c0;
                    arrayList.clear();
                    ArrayList arrayList2 = this.d0;
                    arrayList.addAll(arrayList2);
                    arrayList2.clear();
                    J(beginRecording, arrayList2);
                    int size = arrayList.size();
                    z11 = false;
                    while (i12 < size) {
                        Object obj = arrayList.get(i12);
                        i12++;
                        ((ot0) obj).f(null);
                        i11 = i11;
                    }
                    i10 = i11;
                    int size2 = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        Object obj2 = arrayList2.get(i13);
                        i13++;
                        ((ot0) obj2).f(new ir0(this, 4));
                    }
                } else {
                    J(beginRecording, null);
                    i10 = i11;
                    z11 = false;
                }
                e0 = z11;
                this.W[i10].endRecording();
                zArr2[i10] = z10;
                zArr[i10] = z11;
                if (!N()) {
                    zArr[i10] = z10;
                    M();
                }
                canvas.save();
                canvas.drawRect(rect, paint);
                canvas.clipRect(rect);
                renderNode = this.W[i10];
                if (renderNode != null && i7 < 255) {
                    renderNode.setAlpha(f11 - (i7 / 255.0f));
                    if (z9) {
                        f12 = 0.0f;
                        canvas.translate(0.0f, ((-f10) + this.V) - (this.U - (getListTranslationY() + getBottomOffset())));
                    } else {
                        f12 = 0.0f;
                        canvas.translate(0.0f, (-f10) - getTranslationY());
                    }
                    canvas.translate(f12, -L);
                    canvas.scale(renderNodeScale, renderNodeScale);
                    canvas.drawRenderNode(this.W[i10]);
                }
                canvas.restore();
            }
        }
        i10 = i11;
        z10 = true;
        f11 = 1.0f;
        if (!N()) {
        }
        canvas.save();
        canvas.drawRect(rect, paint);
        canvas.clipRect(rect);
        renderNode = this.W[i10];
        if (renderNode != null) {
            renderNode.setAlpha(f11 - (i7 / 255.0f));
            if (z9) {
            }
            canvas.translate(f12, -L);
            canvas.scale(renderNodeScale, renderNodeScale);
            canvas.drawRenderNode(this.W[i10]);
        }
        canvas.restore();
    }

    public void L() {
        org.telegram.messenger.iz.f();
    }

    public final void M() {
        boolean[] zArr = this.b0;
        int i7 = 0;
        zArr[0] = true;
        zArr[1] = true;
        while (true) {
            ArrayList arrayList = this.O;
            if (i7 >= arrayList.size()) {
                return;
            }
            ((View) arrayList.get(i7)).invalidate();
            i7++;
        }
    }

    public boolean N() {
        return this instanceof org.telegram.ui.ol;
    }

    public boolean O() {
        return !(this instanceof org.telegram.ui.cb);
    }

    public boolean P() {
        return !(this instanceof org.telegram.ui.cb);
    }

    public int Q() {
        View rootView = getRootView();
        Rect rect = this.a;
        getWindowVisibleDisplayFrame(rect);
        if (rect.bottom == 0 && rect.top == 0) {
            return 0;
        }
        int max = Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? org.telegram.messenger.g0.m : 0)) - org.telegram.messenger.g0.q1(rootView)) - (rect.bottom - rect.top));
        this.f = max;
        return max;
    }

    public void R() {
        if (this.w != null) {
            this.D = y61.a(getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.n == null && this.r.isEmpty()) {
            return;
        }
        this.f = Q();
        Point point = org.telegram.messenger.g0.q;
        post(new tp0(2, this, point.x > point.y));
    }

    public final void U(Drawable drawable) {
        if (this.b == drawable) {
            return;
        }
        if (this.L == null) {
            bi.ec ecVar = new bi.ec(26, getContext(), this);
            this.L = ecVar;
            addView(ecVar, 0, c8.ha.c(-1.0f, -1));
        }
        if (drawable instanceof qa0) {
            ((qa0) drawable).q(this.L);
        }
        if (this.M) {
            Drawable drawable2 = this.b;
            if (drawable2 instanceof org.telegram.ui.dn) {
                ((org.telegram.ui.dn) drawable2).g(this.L);
            }
        }
        this.b = drawable;
        if (this.M && (drawable instanceof org.telegram.ui.dn)) {
            ((org.telegram.ui.dn) drawable).f(this.L);
        }
        if (this.M) {
            Drawable drawable3 = this.b;
            if (drawable3 instanceof qa0) {
                ((qa0) drawable3).l();
            }
        }
        if (this.M) {
            Drawable drawable4 = this.b;
            if (drawable4 instanceof qa0) {
                ((qa0) drawable4).k();
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
        return !(this instanceof zh.u3);
    }

    public void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.mg));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.lg));
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
        return getMeasuredHeight() - (this.b instanceof org.telegram.ui.dn ? this.E : 0);
    }

    public int getBackgroundTranslationY() {
        Drawable drawable = this.b;
        if (drawable instanceof qa0) {
            return this.E;
        }
        if (drawable instanceof org.telegram.ui.dn) {
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
        return org.telegram.ui.ActionBar.k6.t0();
    }

    public boolean getNewDrawableMotion() {
        return org.telegram.ui.ActionBar.k6.i0;
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
        Drawable drawable = this.b;
        if (drawable instanceof org.telegram.ui.dn) {
            ((org.telegram.ui.dn) drawable).f(this.L);
        }
        Drawable drawable2 = this.b;
        if (drawable2 instanceof qa0) {
            ((qa0) drawable2).k();
        }
        Drawable drawable3 = this.d;
        if (drawable3 instanceof org.telegram.ui.dn) {
            ((org.telegram.ui.dn) drawable3).f(this.L);
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof qa0) {
            ((qa0) drawable4).k();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = 0;
        this.M = false;
        this.P.setShader(null);
        this.Q.setShader(null);
        this.R.setShader(null);
        this.S.setShader(null);
        while (true) {
            ArrayList arrayList = this.N;
            if (i7 >= arrayList.size()) {
                arrayList.clear();
                Drawable drawable = this.b;
                if (drawable instanceof org.telegram.ui.dn) {
                    ((org.telegram.ui.dn) drawable).g(this.L);
                }
                Drawable drawable2 = this.d;
                if (drawable2 instanceof org.telegram.ui.dn) {
                    ((org.telegram.ui.dn) drawable2).g(this.L);
                }
                Drawable drawable3 = this.b;
                if (drawable3 instanceof qa0) {
                    ((qa0) drawable3).l();
                }
                Drawable drawable4 = this.d;
                if (drawable4 instanceof qa0) {
                    ((qa0) drawable4).l();
                    return;
                }
                return;
            }
            if (arrayList.get(i7) != null) {
                ((nt0) arrayList.get(i7)).getClass();
                throw null;
            }
            i7++;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        R();
    }

    public void setBackgroundTranslation(int i7) {
        if (i7 != this.E) {
            this.E = i7;
            bi.ec ecVar = this.L;
            if (ecVar != null) {
                ecVar.invalidate();
            }
        }
    }

    public void setBottomClip(int i7) {
        if (i7 != this.h) {
            this.h = i7;
            bi.ec ecVar = this.L;
            if (ecVar != null) {
                ecVar.invalidate();
            }
        }
    }

    public void setDelegate(qt0 qt0Var) {
        this.n = qt0Var;
    }

    public void setEmojiKeyboardHeight(int i7) {
        if (this.I != i7) {
            this.I = i7;
            bi.ec ecVar = this.L;
            if (ecVar != null) {
                ecVar.invalidate();
            }
        }
    }

    public void setOccupyStatusBar(boolean z9) {
        this.s = z9;
    }

    public void setSkipBackgroundDrawing(boolean z9) {
        if (this.J != z9) {
            this.J = z9;
            bi.ec ecVar = this.L;
            if (ecVar != null) {
                ecVar.invalidate();
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
