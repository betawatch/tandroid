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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public class vw0 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public static boolean k0;
    public int E;
    public boolean F;
    public final org.telegram.ui.ActionBar.j5 G;
    public org.telegram.ui.ActionBar.q1 H;
    public int I;
    public boolean J;
    public gx0 K;
    public bi.cc L;
    public boolean M;
    public final ArrayList N;
    public final ArrayList O;
    public final Matrix P;
    public final Matrix Q;
    public final Paint R;
    public final Paint S;
    public final Paint T;
    public final Paint U;
    public Paint V;
    public Paint W;
    public final Rect a;
    public int a0;
    public Drawable b;
    public int b0;
    public boolean c;
    public float c0;
    public Drawable d;
    public float d0;
    public boolean e;
    public float e0;
    public int f;
    public RenderNode[] f0;
    public final boolean[] g0;
    public int h;
    public final boolean[] h0;
    public final ArrayList i0;
    public final ArrayList j0;
    public uw0 n;
    public final ArrayList r;
    public boolean s;
    public x91 v;
    public float w;
    public float x;
    public float y;

    public vw0(Context context, org.telegram.ui.ActionBar.j5 j5Var) {
        super(context);
        this.a = new Rect();
        this.r = new ArrayList();
        this.s = true;
        this.y = 1.0f;
        this.F = true;
        this.N = new ArrayList(10);
        this.O = new ArrayList();
        this.P = new Matrix();
        this.Q = new Matrix();
        this.R = new Paint();
        this.S = new Paint();
        this.T = new Paint();
        this.U = new Paint();
        this.c0 = 1.0f;
        new m.g3(this, 29);
        this.g0 = new boolean[2];
        this.h0 = new boolean[2];
        this.i0 = new ArrayList();
        this.j0 = new ArrayList();
        setWillNotDraw(false);
        this.G = j5Var;
        this.H = null;
    }

    public static boolean E() {
        return Build.VERSION.SDK_INT >= 31 && SharedConfig.useNewBlur;
    }

    public static void F(vw0 vw0Var, Canvas canvas) {
        if (vw0Var.L != null && org.telegram.ui.ActionBar.y6.G1 && LiteMode.isEnabled(32)) {
            if (vw0Var.K == null) {
                gx0 gx0Var = new gx0(1);
                vw0Var.K = gx0Var;
                gx0Var.g = -1;
                gx0Var.c();
            }
            vw0Var.K.b(canvas, vw0Var.L);
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

    public final void G() {
        if (!this.e && !this.c) {
            x91 x91Var = this.v;
            if (x91Var != null) {
                x91Var.c(false);
                this.v = null;
                this.y = 1.0f;
                this.w = 0.0f;
                this.x = 0.0f;
                return;
            }
            return;
        }
        if (this.v == null) {
            x91 x91Var2 = new x91(getContext());
            this.v = x91Var2;
            x91Var2.n = new tv(this, 23);
            if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
                x91 x91Var3 = this.v;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                x91Var3.getClass();
                this.y = x91.a(measuredWidth, measuredHeight);
            }
        }
        if (this.F) {
            return;
        }
        this.v.c(true);
    }

    public void H(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        J(canvas, f7, rect, paint, z10, Color.alpha(org.telegram.ui.ActionBar.y6.w0((E() && SharedConfig.getDevicePerformanceClass() == 2) ? org.telegram.ui.ActionBar.y6.xf : org.telegram.ui.ActionBar.y6.yf, getResourceProvider())));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10, int i10) {
        int i11;
        boolean z11;
        float f10;
        RenderNode renderNode;
        float f11;
        boolean z12;
        Shader.TileMode tileMode;
        if (!SharedConfig.chatBlurEnabled()) {
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
        if (this.f0 == null) {
            this.f0 = new RenderNode[2];
        }
        float renderNodeScale = getRenderNodeScale();
        int i12 = !z10 ? 1 : 0;
        boolean[] zArr = this.h0;
        if (!z10 && !zArr[i12] && Math.abs(getBottomOffset() - this.d0) > 0.1f) {
            zArr[i12] = true;
        }
        int dp = AndroidUtilities.dp(36.0f);
        if (i10 < 255 && zArr[i12]) {
            boolean[] zArr2 = this.g0;
            if (!zArr2[i12]) {
                RenderNode[] renderNodeArr = this.f0;
                if (renderNodeArr[i12] == null) {
                    z11 = true;
                    f10 = 1.0f;
                    renderNodeArr[i12] = new RenderNode("blurNode" + i12);
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(2.0f);
                    RenderNode renderNode2 = this.f0[i12];
                    float blurRadiusInternal = getBlurRadiusInternal();
                    float blurRadiusInternal2 = getBlurRadiusInternal();
                    tileMode = Shader.TileMode.DECAL;
                    renderNode2.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(blurRadiusInternal, blurRadiusInternal2, tileMode), RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix))));
                } else {
                    z11 = true;
                    f10 = 1.0f;
                }
                int measuredWidth = getMeasuredWidth();
                int dp2 = AndroidUtilities.dp(100.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                int i13 = 0;
                this.f0[i12].setPosition(0, 0, (int) (measuredWidth / renderNodeScale), (int) (((dp * 2) + dp2) / renderNodeScale));
                RecordingCanvas beginRecording = this.f0[i12].beginRecording();
                k0 = z11;
                float f12 = f10 / renderNodeScale;
                beginRecording.scale(f12, f12);
                beginRecording.drawPaint(paint);
                beginRecording.translate(0.0f, dp);
                if (!z10) {
                    float bottomOffset = getBottomOffset();
                    this.d0 = bottomOffset;
                    float f13 = bottomOffset - dp2;
                    this.e0 = f13;
                    beginRecording.translate(0.0f, -f13);
                }
                if (N()) {
                    ArrayList arrayList = this.i0;
                    arrayList.clear();
                    ArrayList arrayList2 = this.j0;
                    arrayList.addAll(arrayList2);
                    arrayList2.clear();
                    K(beginRecording, arrayList2);
                    int size = arrayList.size();
                    z12 = false;
                    while (i13 < size) {
                        Object obj = arrayList.get(i13);
                        i13++;
                        ((sw0) obj).e(null);
                        i12 = i12;
                    }
                    i11 = i12;
                    int size2 = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        Object obj2 = arrayList2.get(i14);
                        i14++;
                        ((sw0) obj2).e(new mp0(this, 11));
                    }
                } else {
                    K(beginRecording, null);
                    i11 = i12;
                    z12 = false;
                }
                k0 = z12;
                this.f0[i11].endRecording();
                zArr2[i11] = z11;
                zArr[i11] = z12;
                if (!N()) {
                    zArr[i11] = z11;
                    M();
                }
                canvas.save();
                canvas.drawRect(rect, paint);
                canvas.clipRect(rect);
                renderNode = this.f0[i11];
                if (renderNode != null && i10 < 255) {
                    renderNode.setAlpha(f10 - (i10 / 255.0f));
                    if (z10) {
                        f11 = 0.0f;
                        canvas.translate(0.0f, ((-f7) + this.e0) - (this.d0 - (getListTranslationY() + getBottomOffset())));
                    } else {
                        f11 = 0.0f;
                        canvas.translate(0.0f, (-f7) - getTranslationY());
                    }
                    canvas.translate(f11, -dp);
                    canvas.scale(renderNodeScale, renderNodeScale);
                    canvas.drawRenderNode(this.f0[i11]);
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
        renderNode = this.f0[i11];
        if (renderNode != null) {
            renderNode.setAlpha(f10 - (i10 / 255.0f));
            if (z10) {
            }
            canvas.translate(f11, -dp);
            canvas.scale(renderNodeScale, renderNodeScale);
            canvas.drawRenderNode(this.f0[i11]);
        }
        canvas.restore();
    }

    public void L() {
        SharedConfig.chatBlurEnabled();
    }

    public final void M() {
        boolean[] zArr = this.h0;
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
        return this instanceof org.telegram.ui.mm;
    }

    public boolean O() {
        return !(this instanceof org.telegram.ui.kb);
    }

    public boolean P() {
        return !(this instanceof org.telegram.ui.kb);
    }

    public int Q() {
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

    public void R() {
        if (this.v != null) {
            this.y = x91.a(getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.n == null && this.r.isEmpty()) {
            return;
        }
        this.f = Q();
        Point point = AndroidUtilities.displaySize;
        post(new d60(6, this, point.x > point.y));
    }

    public final void U(Drawable drawable) {
        if (this.b == drawable) {
            return;
        }
        if (this.L == null) {
            bi.cc ccVar = new bi.cc(this, getContext(), 25);
            this.L = ccVar;
            addView(ccVar, 0, gb1.g(-1.0f, -1));
        }
        if (drawable instanceof uc0) {
            ((uc0) drawable).q(this.L);
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
            if (drawable3 instanceof uc0) {
                ((uc0) drawable3).l();
            }
        }
        if (this.M) {
            Drawable drawable4 = this.b;
            if (drawable4 instanceof uc0) {
                ((uc0) drawable4).k();
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
        return !(this instanceof zh.s4);
    }

    public void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.yf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.xf));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        boolean[] zArr = this.g0;
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
        if (drawable instanceof uc0) {
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
        return org.telegram.ui.ActionBar.y6.t0();
    }

    public boolean getNewDrawableMotion() {
        return org.telegram.ui.ActionBar.y6.i0;
    }

    public org.telegram.ui.ActionBar.u6 getResourceProvider() {
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
        if (drawable2 instanceof uc0) {
            ((uc0) drawable2).k();
        }
        Drawable drawable3 = this.d;
        if (drawable3 instanceof org.telegram.ui.xn) {
            ((org.telegram.ui.xn) drawable3).f(this.L);
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof uc0) {
            ((uc0) drawable4).k();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        this.M = false;
        this.R.setShader(null);
        this.S.setShader(null);
        this.T.setShader(null);
        this.U.setShader(null);
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
                if (drawable3 instanceof uc0) {
                    ((uc0) drawable3).l();
                }
                Drawable drawable4 = this.d;
                if (drawable4 instanceof uc0) {
                    ((uc0) drawable4).l();
                    return;
                }
                return;
            }
            if (arrayList.get(i10) != null) {
                ((rw0) arrayList.get(i10)).getClass();
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
            bi.cc ccVar = this.L;
            if (ccVar != null) {
                ccVar.invalidate();
            }
        }
    }

    public void setBottomClip(int i10) {
        if (i10 != this.h) {
            this.h = i10;
            bi.cc ccVar = this.L;
            if (ccVar != null) {
                ccVar.invalidate();
            }
        }
    }

    public void setDelegate(uw0 uw0Var) {
        this.n = uw0Var;
    }

    public void setEmojiKeyboardHeight(int i10) {
        if (this.I != i10) {
            this.I = i10;
            bi.cc ccVar = this.L;
            if (ccVar != null) {
                ccVar.invalidate();
            }
        }
    }

    public void setOccupyStatusBar(boolean z10) {
        this.s = z10;
    }

    public void setSkipBackgroundDrawing(boolean z10) {
        if (this.J != z10) {
            this.J = z10;
            bi.cc ccVar = this.L;
            if (ccVar != null) {
                ccVar.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == getBackgroundImage() || super.verifyDrawable(drawable);
    }

    public void S() {
    }

    public void updateColors() {
    }

    public void T(Drawable drawable) {
    }

    public void K(Canvas canvas, ArrayList arrayList) {
    }
}
