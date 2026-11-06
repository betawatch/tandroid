package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class kf0 extends View {
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public RenderNode I;
    public final ot0[] J;
    public final w5 K;
    public final di.n5 L;
    public boolean a;
    public final Object b;
    public final xf0[] c;
    public final xf0[] d;
    public volatile boolean e;
    public final Paint[] f;
    public sf0 h;
    public int n;
    public int r;
    public final jf0 s;
    public final jf0 w;
    public int x;
    public int y;

    public kf0(Context context) {
        super(context);
        int i7 = 1;
        int i10 = 0;
        this.a = Build.VERSION.SDK_INT >= 31;
        this.b = new Object();
        this.c = new xf0[3];
        this.d = new xf0[3];
        this.e = false;
        Paint[] paintArr = {new Paint(), new Paint()};
        this.f = paintArr;
        this.s = new jf0(this, i10);
        this.w = new jf0(this, i7);
        this.x = -1;
        this.F = false;
        this.G = false;
        this.H = false;
        this.J = new ot0[3];
        w5 w5Var = new w5(this, 0L, 350L, xq.f);
        this.K = w5Var;
        this.L = new di.n5(2, this);
        w5Var.e(true, 1.0f);
        boolean z9 = this.a & org.telegram.messenger.iz.a0;
        this.a = z9;
        if (z9) {
            setLayerType(2, null);
        } else {
            setLayerType(1, paintArr[0]);
            setLayerType(1, paintArr[1]);
        }
    }

    public static void a(kf0 kf0Var, int i7, int i10, int i11) {
        synchronized (kf0Var.b) {
            try {
                xf0[] xf0VarArr = kf0Var.c;
                xf0 xf0Var = xf0VarArr[i7];
                xf0VarArr[i7] = xf0VarArr[i10];
                xf0VarArr[i10] = xf0Var;
                xf0[] xf0VarArr2 = kf0Var.d;
                xf0 xf0Var2 = xf0VarArr2[i7];
                xf0VarArr2[i7] = xf0VarArr2[i10];
                xf0VarArr2[i10] = xf0Var2;
                if (i7 != 2) {
                    Paint[] paintArr = kf0Var.f;
                    Paint paint = paintArr[i7];
                    paintArr[i7] = paintArr[i10];
                    paintArr[i10] = paint;
                } else if (xf0Var2.f) {
                    kf0Var.b(xf0Var2.b, i10);
                }
                if (i11 != -1) {
                    kf0Var.f[i11].setShader(null);
                    xf0 xf0Var3 = kf0Var.c[i11];
                    if (xf0Var3 != null && !xf0Var3.e && !xf0Var3.d) {
                        xf0Var3.f = false;
                        xf0Var3.b.eraseColor(0);
                    }
                }
            } finally {
            }
        }
    }

    public static void f(ImageReceiver imageReceiver, Canvas canvas, float f10, float f11) {
        if (imageReceiver == null) {
            return;
        }
        int i7 = imageReceiver.W0[0];
        imageReceiver.J0(0);
        canvas.save();
        canvas.translate(0.0f, f10 - f11);
        imageReceiver.h(canvas, null);
        canvas.restore();
        canvas.save();
        canvas.scale(1.0f, -1.0f);
        canvas.translate(0.0f, (-f11) - f10);
        canvas.scale(1.0f, 2.0f, 0.0f, f11);
        imageReceiver.h(canvas, null);
        canvas.restore();
        imageReceiver.J0(i7);
    }

    private float getBlurRadius() {
        int o4 = org.telegram.messenger.iz.o();
        if (o4 != 1) {
            return o4 != 2 ? 8.0f : 20.0f;
        }
        return 12.0f;
    }

    private float getRenderNodeScale() {
        return org.telegram.messenger.g0.L(1.0f);
    }

    public final void b(Bitmap bitmap, int i7) {
        if (i7 >= 2 || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.r / 6.0f, new int[]{0, -1}, new float[]{0.0f, org.telegram.messenger.g0.N(56.0f) / this.r}, Shader.TileMode.CLAMP);
        Shader.TileMode tileMode = Shader.TileMode.MIRROR;
        this.f[i7].setShader(new ComposeShader(new BitmapShader(bitmap, tileMode, tileMode), linearGradient, PorterDuff.Mode.DST_IN));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        if (r8.getHeight() != r2) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c() {
        org.telegram.ui.fr0 fr0Var;
        ot0[] ot0VarArr;
        sf0 sf0Var = this.h;
        boolean z9 = false;
        if (sf0Var != null && ((fr0Var = sf0Var.h1) == null || !fr0Var.n)) {
            int measuredWidth = (int) (sf0Var.getMeasuredWidth() / 6.0f);
            int i7 = (int) (this.r / 6.0f);
            if (measuredWidth > 0 && i7 > 0) {
                this.D = measuredWidth;
                this.E = i7;
                boolean z10 = this.G;
                xf0[] xf0VarArr = this.c;
                int length = (!z10 || this.H) ? xf0VarArr.length : 1;
                this.G = false;
                this.H = false;
                int i10 = 0;
                while (true) {
                    ot0VarArr = this.J;
                    if (i10 >= length) {
                        break;
                    }
                    ot0 ot0Var = ot0VarArr[i10];
                    if (ot0Var != null) {
                        ot0Var.f(null);
                    }
                    xf0 xf0Var = xf0VarArr[i10];
                    if (xf0Var != null) {
                        Bitmap bitmap = xf0Var.b;
                        if (!xf0Var.d) {
                            if (bitmap.getWidth() == measuredWidth) {
                            }
                        }
                    }
                    if (xf0Var != null) {
                        xf0Var.a();
                    }
                    xf0 xf0Var2 = new xf0();
                    Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, i7, Bitmap.Config.ARGB_8888);
                    xf0Var2.b = createBitmap;
                    xf0Var2.a = new Canvas(createBitmap);
                    xf0VarArr[i10] = xf0Var2;
                    if (xf0VarArr[i10].e) {
                        if (length == 1) {
                            this.G = true;
                        } else {
                            this.H = true;
                        }
                    }
                    i10++;
                }
                View E = this.h.E(this.x);
                g(0, E);
                jf0 jf0Var = this.w;
                if (length == 1) {
                    ot0 ot0Var2 = ot0VarArr[0];
                    if (ot0Var2 != null) {
                        ot0Var2.f(jf0Var);
                    }
                    return !this.G;
                }
                View E2 = this.h.E(this.x + 1);
                g(1, E2);
                if (this.y == 0) {
                    g(2, this.h.E(this.x - 1));
                }
                for (ot0 ot0Var3 : ot0VarArr) {
                    if (ot0Var3 != null) {
                        ot0Var3.f(jf0Var);
                    }
                }
                if ((E != null && ot0VarArr[0] == null) || (this.y != 0 && E2 != null && ot0VarArr[1] == null)) {
                    z9 = true;
                }
                this.F = z9;
                return true;
            }
        }
        return false;
    }

    public final void d() {
        RenderNode renderNode;
        sf0 sf0Var = this.h;
        if (sf0Var != null) {
            di.n5 n5Var = this.L;
            ArrayList arrayList = sf0Var.k0;
            if (arrayList != null) {
                arrayList.remove(n5Var);
            }
            this.h = null;
        }
        this.e = false;
        yf0.a.cancelRunnable(this.s);
        if (Build.VERSION.SDK_INT >= 29 && (renderNode = this.I) != null) {
            renderNode.discardDisplayList();
            this.I = null;
        }
        synchronized (this.b) {
            for (int i7 = 0; i7 < 3; i7++) {
                try {
                    xf0 xf0Var = this.c[i7];
                    if (xf0Var != null) {
                        xf0Var.a();
                        this.c[i7] = null;
                    }
                    xf0 xf0Var2 = this.d[i7];
                    if (xf0Var2 != null) {
                        xf0Var2.a();
                        this.d[i7] = null;
                    }
                    ot0 ot0Var = this.J[i7];
                    if (ot0Var != null) {
                        ot0Var.f(null);
                        this.J[i7] = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f[0].setShader(null);
            this.f[1].setShader(null);
        }
    }

    public final void e(Canvas canvas, org.telegram.ui.wv0 wv0Var, float f10, float f11, boolean z9, float f12, float f13) {
        float f14;
        Canvas canvas2 = canvas;
        sf0 sf0Var = this.h;
        if (sf0Var == null || !sf0Var.isAttachedToWindow() || this.h.getVisibility() == 8) {
            return;
        }
        if (this.a && Build.VERSION.SDK_INT >= 31) {
            if (canvas2.isHardwareAccelerated()) {
                if (wv0Var != null || getVisibility() != 0 || getAlpha() <= 0.0f) {
                    if (wv0Var != null) {
                        float measuredWidth = f10 / this.h.getMeasuredWidth();
                        float f15 = this.r * (1.0f - f12) * measuredWidth;
                        float renderNodeScale = getRenderNodeScale() * measuredWidth;
                        i();
                        this.I.setPosition(0, 0, (int) Math.ceil(f10 / renderNodeScale), (int) Math.ceil((r6 + this.n) / renderNodeScale));
                        RecordingCanvas beginRecording = this.I.beginRecording();
                        float f16 = 1.0f / renderNodeScale;
                        beginRecording.scale(f16, f16);
                        i5 i5Var = wv0Var.e;
                        f(i5Var != null ? i5Var.k : wv0Var.a, beginRecording, f15, f11);
                        if (wv0Var.a0 && wv0Var.V > 0.0f) {
                            f(wv0Var.U, beginRecording, f15, f11);
                        }
                        this.I.endRecording();
                        this.I.setAlpha(f13);
                        canvas2.translate(0.0f, -f15);
                        canvas2.scale(renderNodeScale, renderNodeScale);
                        canvas2.drawRenderNode(this.I);
                        return;
                    }
                    return;
                }
                i();
                ot0[] ot0VarArr = this.J;
                ot0 ot0Var = ot0VarArr[0];
                if (ot0Var != null) {
                    ot0Var.f(null);
                }
                ot0 ot0Var2 = ot0VarArr[1];
                if (ot0Var2 != null) {
                    ot0Var2.f(null);
                }
                float renderNodeScale2 = getRenderNodeScale();
                this.I.setPosition(0, 0, (int) Math.ceil(f10 / renderNodeScale2), (int) Math.ceil((this.r + this.n) / renderNodeScale2));
                RecordingCanvas beginRecording2 = this.I.beginRecording();
                float f17 = 1.0f / renderNodeScale2;
                beginRecording2.scale(f17, f17);
                beginRecording2.save();
                beginRecording2.translate(-this.y, 0.0f);
                h(beginRecording2, 0);
                beginRecording2.restore();
                if (this.y != 0) {
                    beginRecording2.save();
                    beginRecording2.translate((-this.y) + f10, 0.0f);
                    h(beginRecording2, 1);
                    beginRecording2.restore();
                }
                this.I.endRecording();
                this.I.setAlpha(this.K.e(false, 1.0f));
                canvas2.save();
                canvas2.scale(renderNodeScale2, renderNodeScale2);
                canvas2.drawRenderNode(this.I);
                canvas2.restore();
                return;
            }
            if (wv0Var != null || org.telegram.messenger.g0.m0) {
                return;
            }
            this.a = false;
            setLayerType(1, this.f[0]);
            setLayerType(1, this.f[1]);
        }
        if (this.H || this.G || this.F || (this.f[0].getShader() == null && this.f[1].getShader() == null && !this.e)) {
            boolean c10 = c();
            if (!this.e && c10) {
                this.e = true;
                org.telegram.messenger.q5 q5Var = yf0.a;
                q5Var.cancelRunnable(this.s);
                q5Var.postRunnable(this.s);
            }
        }
        if (this.f[0].getShader() == null && this.f[1].getShader() == null) {
            return;
        }
        synchronized (this.b) {
            try {
                float f18 = f10 / this.D;
                if (z9) {
                    canvas2.translate(0.0f, (-f18) * this.E);
                }
                canvas2.scale(f18, f18);
                float f19 = this.n / f18;
                if (this.f[0].getShader() != null) {
                    canvas2.save();
                    canvas2.translate((-this.y) / f18, 0.0f);
                    canvas2.save();
                    canvas2.scale(1.0f, 2.0f, 0.0f, this.E);
                    float f20 = this.E;
                    f14 = 2.0f;
                    canvas2.drawRect(0.0f, f20, this.D, f20 + f19, this.f[0]);
                    canvas.restore();
                    this.f[0].setAlpha((int) (f13 * 255.0f));
                    float f21 = this.E;
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, f21 * f12, this.D, f21, this.f[0]);
                    this.f[0].setAlpha(org.telegram.messenger.qs.e4);
                    canvas2.restore();
                } else {
                    f14 = 2.0f;
                }
                if (this.y != 0 && this.f[1].getShader() != null) {
                    canvas2.save();
                    canvas2.translate(((-this.y) + f10) / f18, 0.0f);
                    canvas2.save();
                    canvas2.scale(1.0f, f14, 0.0f, this.E);
                    float f22 = this.E;
                    canvas2.drawRect(0.0f, f22, this.D, f22 + f19, this.f[1]);
                    canvas.restore();
                    this.f[1].setAlpha((int) (f13 * 255.0f));
                    float f23 = this.E;
                    canvas.drawRect(0.0f, f23 * f12, this.D, f23, this.f[1]);
                    this.f[1].setAlpha(org.telegram.messenger.qs.e4);
                    canvas.restore();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(int i7, View view) {
        xf0 xf0Var = this.c[i7];
        if (view != 0 && !xf0Var.e) {
            Canvas canvas = xf0Var.a;
            canvas.save();
            canvas.scale(0.16666667f, 0.16666667f);
            canvas.translate(0.0f, this.r - view.getMeasuredHeight());
            view.draw(canvas);
            canvas.restore();
            xf0Var.f = true;
        }
        if (i7 == 0 || (this.y != 0 && i7 == 1)) {
            boolean z9 = view instanceof ot0;
            ot0[] ot0VarArr = this.J;
            if (z9) {
                ot0VarArr[i7] = (ot0) view;
            } else {
                ot0VarArr[i7] = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(Canvas canvas, int i7) {
        View E = this.h.E(this.x + i7);
        if (E != 0) {
            int measuredHeight = E.getMeasuredHeight();
            canvas.save();
            canvas.translate(0.0f, this.r - measuredHeight);
            E.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(1.0f, -1.0f);
            canvas.translate(0.0f, (-measuredHeight) - this.r);
            canvas.scale(1.0f, 2.0f, 0.0f, measuredHeight);
            E.draw(canvas);
            canvas.restore();
        }
        boolean z9 = E instanceof ot0;
        ot0[] ot0VarArr = this.J;
        if (!z9) {
            ot0VarArr[i7] = null;
            return;
        }
        ot0 ot0Var = (ot0) E;
        ot0VarArr[i7] = ot0Var;
        ot0Var.f(this.w);
    }

    public final void i() {
        BlendMode blendMode;
        if (this.I == null) {
            float renderNodeScale = getRenderNodeScale();
            this.I = new RenderNode("profileBlurNode");
            float[] fArr = {0.0f, org.telegram.messenger.g0.N(56.0f) / this.r};
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.r / renderNodeScale, new int[]{0, -1}, fArr, tileMode);
            float blurRadius = getBlurRadius();
            RenderNode renderNode = this.I;
            RenderEffect createBlurEffect = RenderEffect.createBlurEffect(blurRadius, blurRadius, tileMode);
            RenderEffect createShaderEffect = RenderEffect.createShaderEffect(linearGradient);
            blendMode = BlendMode.DST_IN;
            renderNode.setRenderEffect(RenderEffect.createBlendModeEffect(createBlurEffect, createShaderEffect, blendMode));
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        e(canvas, null, this.h.getMeasuredWidth(), this.h.getMeasuredHeight(), false, 0.0f, 1.0f);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), this.r + this.n);
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        if (f10 == 0.0f || !this.a) {
            return;
        }
        invalidate();
    }

    public void setSize(int i7) {
        if (this.n != i7) {
            invalidate();
        }
        this.n = i7;
        this.r = (int) (org.telegram.messenger.g0.L(64.0f) * 1.5f);
    }

    public void setView(sf0 sf0Var) {
        d();
        this.h = sf0Var;
        this.x = sf0Var.getCurrentItem();
        this.y = 0;
        sf0Var.b(this.L);
    }
}
