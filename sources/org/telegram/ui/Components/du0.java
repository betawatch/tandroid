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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public class du0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public static boolean f0;
    public float E;
    public int F;
    public boolean G;
    public final org.telegram.ui.ActionBar.r4 H;
    public org.telegram.ui.ActionBar.i1 I;
    public int J;
    public boolean K;
    public ou0 L;
    public bi.m3 M;
    public boolean N;
    public final ArrayList O;
    public final ArrayList P;
    public final Paint Q;
    public final Paint R;
    public final Paint S;
    public final Paint T;
    public float U;
    public float V;
    public float W;
    public final Rect a;
    public RenderNode[] a0;
    public Drawable b;
    public final boolean[] b0;
    public boolean c;
    public final boolean[] c0;
    public Drawable d;
    public final ArrayList d0;
    public boolean e;
    public final ArrayList e0;
    public int f;
    public int h;
    public cu0 n;
    public final ArrayList r;
    public boolean s;
    public m71 w;
    public float x;
    public float y;

    public du0(Context context, org.telegram.ui.ActionBar.r4 r4Var) {
        super(context);
        this.a = new Rect();
        this.r = new ArrayList();
        this.s = true;
        this.E = 1.0f;
        this.G = true;
        this.O = new ArrayList(10);
        this.P = new ArrayList();
        new Matrix();
        new Matrix();
        this.Q = new Paint();
        this.R = new Paint();
        this.S = new Paint();
        this.T = new Paint();
        this.U = 1.0f;
        this.b0 = new boolean[2];
        this.c0 = new boolean[2];
        this.d0 = new ArrayList();
        this.e0 = new ArrayList();
        setWillNotDraw(false);
        this.H = r4Var;
        this.I = null;
    }

    public static boolean E() {
        return Build.VERSION.SDK_INT >= 31 && org.telegram.messenger.cz.a0;
    }

    public static void F(du0 du0Var, Canvas canvas) {
        if (du0Var.M != null && org.telegram.ui.ActionBar.m6.G1 && org.telegram.messenger.qc.e(32)) {
            if (du0Var.L == null) {
                ou0 ou0Var = new ou0(1);
                du0Var.L = ou0Var;
                ou0Var.g = -1;
                ou0Var.c();
            }
            du0Var.L.b(canvas, du0Var.M);
        }
    }

    public static float getBlurRadius() {
        int o4 = org.telegram.messenger.cz.o();
        if (o4 != 1) {
            return o4 != 2 ? 3.0f : 60.0f;
        }
        return 4.0f;
    }

    public static float getRenderNodeScale() {
        int L;
        int o4 = org.telegram.messenger.cz.o();
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
            m71 m71Var = this.w;
            if (m71Var != null) {
                m71Var.c(false);
                this.w = null;
                this.E = 1.0f;
                this.x = 0.0f;
                this.y = 0.0f;
                return;
            }
            return;
        }
        if (this.w == null) {
            m71 m71Var2 = new m71(getContext());
            this.w = m71Var2;
            m71Var2.n = new ky(this, 20);
            if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
                m71 m71Var3 = this.w;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                m71Var3.getClass();
                this.E = m71.a(measuredWidth, measuredHeight);
            }
        }
        if (this.G) {
            return;
        }
        this.w.c(true);
    }

    public void H(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10) {
        I(canvas, f10, rect, paint, z10, Color.alpha(org.telegram.ui.ActionBar.m6.w0((E() && org.telegram.messenger.cz.o() == 2) ? org.telegram.ui.ActionBar.m6.og : org.telegram.ui.ActionBar.m6.pg, getResourceProvider())));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10, int i7) {
        int i10;
        boolean z11;
        float f11;
        RenderNode renderNode;
        float f12;
        boolean z12;
        Shader.TileMode tileMode;
        if (!org.telegram.messenger.cz.f()) {
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
        if (this.a0 == null) {
            this.a0 = new RenderNode[2];
        }
        float renderNodeScale = getRenderNodeScale();
        int i11 = !z10 ? 1 : 0;
        boolean[] zArr = this.c0;
        if (!z10 && !zArr[i11] && Math.abs(getBottomOffset() - this.V) > 0.1f) {
            zArr[i11] = true;
        }
        int L = org.telegram.messenger.g0.L(36.0f);
        if (i7 < 255 && zArr[i11]) {
            boolean[] zArr2 = this.b0;
            if (!zArr2[i11]) {
                RenderNode[] renderNodeArr = this.a0;
                if (renderNodeArr[i11] == null) {
                    z11 = true;
                    f11 = 1.0f;
                    renderNodeArr[i11] = new RenderNode("blurNode" + i11);
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(2.0f);
                    RenderNode renderNode2 = this.a0[i11];
                    float blurRadiusInternal = getBlurRadiusInternal();
                    float blurRadiusInternal2 = getBlurRadiusInternal();
                    tileMode = Shader.TileMode.DECAL;
                    renderNode2.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(blurRadiusInternal, blurRadiusInternal2, tileMode), RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix))));
                } else {
                    z11 = true;
                    f11 = 1.0f;
                }
                int measuredWidth = getMeasuredWidth();
                int L2 = org.telegram.messenger.g0.L(100.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m;
                int i12 = 0;
                this.a0[i11].setPosition(0, 0, (int) (measuredWidth / renderNodeScale), (int) (((L * 2) + L2) / renderNodeScale));
                RecordingCanvas beginRecording = this.a0[i11].beginRecording();
                f0 = z11;
                float f13 = f11 / renderNodeScale;
                beginRecording.scale(f13, f13);
                beginRecording.drawPaint(paint);
                beginRecording.translate(0.0f, L);
                if (!z10) {
                    float bottomOffset = getBottomOffset();
                    this.V = bottomOffset;
                    float f14 = bottomOffset - L2;
                    this.W = f14;
                    beginRecording.translate(0.0f, -f14);
                }
                if (N()) {
                    ArrayList arrayList = this.d0;
                    arrayList.clear();
                    ArrayList arrayList2 = this.e0;
                    arrayList.addAll(arrayList2);
                    arrayList2.clear();
                    J(beginRecording, arrayList2);
                    int size = arrayList.size();
                    z12 = false;
                    while (i12 < size) {
                        Object obj = arrayList.get(i12);
                        i12++;
                        ((au0) obj).e(null);
                        i11 = i11;
                    }
                    i10 = i11;
                    int size2 = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        Object obj2 = arrayList2.get(i13);
                        i13++;
                        ((au0) obj2).e(new cp0(this, 7));
                    }
                } else {
                    J(beginRecording, null);
                    i10 = i11;
                    z12 = false;
                }
                f0 = z12;
                this.a0[i10].endRecording();
                zArr2[i10] = z11;
                zArr[i10] = z12;
                if (!N()) {
                    zArr[i10] = z11;
                    M();
                }
                canvas.save();
                canvas.drawRect(rect, paint);
                canvas.clipRect(rect);
                renderNode = this.a0[i10];
                if (renderNode != null && i7 < 255) {
                    renderNode.setAlpha(f11 - (i7 / 255.0f));
                    if (z10) {
                        f12 = 0.0f;
                        canvas.translate(0.0f, ((-f10) + this.W) - (this.V - (getListTranslationY() + getBottomOffset())));
                    } else {
                        f12 = 0.0f;
                        canvas.translate(0.0f, (-f10) - getTranslationY());
                    }
                    canvas.translate(f12, -L);
                    canvas.scale(renderNodeScale, renderNodeScale);
                    canvas.drawRenderNode(this.a0[i10]);
                }
                canvas.restore();
            }
        }
        i10 = i11;
        z11 = true;
        f11 = 1.0f;
        if (!N()) {
        }
        canvas.save();
        canvas.drawRect(rect, paint);
        canvas.clipRect(rect);
        renderNode = this.a0[i10];
        if (renderNode != null) {
            renderNode.setAlpha(f11 - (i7 / 255.0f));
            if (z10) {
            }
            canvas.translate(f12, -L);
            canvas.scale(renderNodeScale, renderNodeScale);
            canvas.drawRenderNode(this.a0[i10]);
        }
        canvas.restore();
    }

    public void K() {
        org.telegram.messenger.cz.f();
    }

    public final void M() {
        boolean[] zArr = this.c0;
        int i7 = 0;
        zArr[0] = true;
        zArr[1] = true;
        while (true) {
            ArrayList arrayList = this.P;
            if (i7 >= arrayList.size()) {
                return;
            }
            ((View) arrayList.get(i7)).invalidate();
            i7++;
        }
    }

    public boolean N() {
        return this instanceof org.telegram.ui.pl;
    }

    public boolean O() {
        return !(this instanceof org.telegram.ui.bb);
    }

    public boolean P() {
        return !(this instanceof org.telegram.ui.bb);
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
            this.E = m71.a(getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.n == null && this.r.isEmpty()) {
            return;
        }
        this.f = Q();
        Point point = org.telegram.messenger.g0.q;
        post(new rp0(3, this, point.x > point.y));
    }

    public final void U(Drawable drawable) {
        if (this.b == drawable) {
            return;
        }
        if (this.M == null) {
            bi.m3 m3Var = new bi.m3(27, getContext(), this);
            this.M = m3Var;
            addView(m3Var, 0, c8.ma.c(-1.0f, -1));
        }
        if (drawable instanceof cb0) {
            ((cb0) drawable).q(this.M);
        }
        if (this.N) {
            Drawable drawable2 = this.b;
            if (drawable2 instanceof org.telegram.ui.en) {
                ((org.telegram.ui.en) drawable2).g(this.M);
            }
        }
        this.b = drawable;
        if (this.N && (drawable instanceof org.telegram.ui.en)) {
            ((org.telegram.ui.en) drawable).f(this.M);
        }
        if (this.N) {
            Drawable drawable3 = this.b;
            if (drawable3 instanceof cb0) {
                ((cb0) drawable3).l();
            }
        }
        if (this.N) {
            Drawable drawable4 = this.b;
            if (drawable4 instanceof cb0) {
                ((cb0) drawable4).k();
            }
        }
        T(this.b);
        G();
        this.M.invalidate();
    }

    public void V() {
        if (E()) {
            M();
        }
    }

    public boolean W() {
        return !(this instanceof bi.v8);
    }

    public void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.pg));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.og));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        boolean[] zArr = this.b0;
        zArr[0] = false;
        zArr[1] = false;
        super.dispatchDraw(canvas);
    }

    public Drawable getBackgroundImage() {
        return this.b;
    }

    public int getBackgroundSizeY() {
        return getMeasuredHeight() - (this.b instanceof org.telegram.ui.en ? this.F : 0);
    }

    public int getBackgroundTranslationY() {
        Drawable drawable = this.b;
        if (drawable instanceof cb0) {
            return this.F;
        }
        if (drawable instanceof org.telegram.ui.en) {
            return this.F;
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
        return org.telegram.ui.ActionBar.m6.t0();
    }

    public boolean getNewDrawableMotion() {
        return org.telegram.ui.ActionBar.m6.i0;
    }

    public org.telegram.ui.ActionBar.h6 getResourceProvider() {
        return null;
    }

    public int getScrollOffset() {
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.N = true;
        Drawable drawable = this.b;
        if (drawable instanceof org.telegram.ui.en) {
            ((org.telegram.ui.en) drawable).f(this.M);
        }
        Drawable drawable2 = this.b;
        if (drawable2 instanceof cb0) {
            ((cb0) drawable2).k();
        }
        Drawable drawable3 = this.d;
        if (drawable3 instanceof org.telegram.ui.en) {
            ((org.telegram.ui.en) drawable3).f(this.M);
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof cb0) {
            ((cb0) drawable4).k();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = 0;
        this.N = false;
        this.Q.setShader(null);
        this.R.setShader(null);
        this.S.setShader(null);
        this.T.setShader(null);
        while (true) {
            ArrayList arrayList = this.O;
            if (i7 >= arrayList.size()) {
                arrayList.clear();
                Drawable drawable = this.b;
                if (drawable instanceof org.telegram.ui.en) {
                    ((org.telegram.ui.en) drawable).g(this.M);
                }
                Drawable drawable2 = this.d;
                if (drawable2 instanceof org.telegram.ui.en) {
                    ((org.telegram.ui.en) drawable2).g(this.M);
                }
                Drawable drawable3 = this.b;
                if (drawable3 instanceof cb0) {
                    ((cb0) drawable3).l();
                }
                Drawable drawable4 = this.d;
                if (drawable4 instanceof cb0) {
                    ((cb0) drawable4).l();
                    return;
                }
                return;
            }
            if (arrayList.get(i7) != null) {
                ((zt0) arrayList.get(i7)).getClass();
                throw null;
            }
            i7++;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        R();
    }

    public void setBackgroundTranslation(int i7) {
        if (i7 != this.F) {
            this.F = i7;
            bi.m3 m3Var = this.M;
            if (m3Var != null) {
                m3Var.invalidate();
            }
        }
    }

    public void setBottomClip(int i7) {
        if (i7 != this.h) {
            this.h = i7;
            bi.m3 m3Var = this.M;
            if (m3Var != null) {
                m3Var.invalidate();
            }
        }
    }

    public void setDelegate(cu0 cu0Var) {
        this.n = cu0Var;
    }

    public void setEmojiKeyboardHeight(int i7) {
        if (this.J != i7) {
            this.J = i7;
            bi.m3 m3Var = this.M;
            if (m3Var != null) {
                m3Var.invalidate();
            }
        }
    }

    public void setOccupyStatusBar(boolean z10) {
        this.s = z10;
    }

    public void setSkipBackgroundDrawing(boolean z10) {
        if (this.K != z10) {
            this.K = z10;
            bi.m3 m3Var = this.M;
            if (m3Var != null) {
                m3Var.invalidate();
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
