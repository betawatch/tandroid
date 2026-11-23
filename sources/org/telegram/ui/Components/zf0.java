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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class zf0 extends View {
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public boolean I;
    public RenderNode J;
    public final au0[] K;
    public final d6 L;
    public final fi.e5 M;
    public boolean a;
    public final Object b;
    public final mg0[] c;
    public final mg0[] d;
    public volatile boolean e;
    public final Paint[] f;
    public hg0 h;
    public int n;
    public int r;
    public final yf0 s;
    public final yf0 w;
    public int x;
    public int y;

    public zf0(Context context) {
        super(context);
        int i7 = 1;
        int i10 = 0;
        this.a = Build.VERSION.SDK_INT >= 31;
        this.b = new Object();
        this.c = new mg0[3];
        this.d = new mg0[3];
        this.e = false;
        Paint[] paintArr = {new Paint(), new Paint()};
        this.f = paintArr;
        this.s = new yf0(this, i10);
        this.w = new yf0(this, i7);
        this.x = -1;
        this.G = false;
        this.H = false;
        this.I = false;
        this.K = new au0[3];
        d6 d6Var = new d6(this, 0L, 350L, nr.f);
        this.L = d6Var;
        this.M = new fi.e5(2, this);
        d6Var.e(true, 1.0f);
        boolean z10 = this.a & org.telegram.messenger.cz.a0;
        this.a = z10;
        if (z10) {
            setLayerType(2, null);
        } else {
            setLayerType(1, paintArr[0]);
            setLayerType(1, paintArr[1]);
        }
    }

    public static void a(zf0 zf0Var, int i7, int i10, int i11) {
        synchronized (zf0Var.b) {
            try {
                mg0[] mg0VarArr = zf0Var.c;
                mg0 mg0Var = mg0VarArr[i7];
                mg0VarArr[i7] = mg0VarArr[i10];
                mg0VarArr[i10] = mg0Var;
                mg0[] mg0VarArr2 = zf0Var.d;
                mg0 mg0Var2 = mg0VarArr2[i7];
                mg0VarArr2[i7] = mg0VarArr2[i10];
                mg0VarArr2[i10] = mg0Var2;
                if (i7 != 2) {
                    Paint[] paintArr = zf0Var.f;
                    Paint paint = paintArr[i7];
                    paintArr[i7] = paintArr[i10];
                    paintArr[i10] = paint;
                } else if (mg0Var2.f) {
                    zf0Var.b(i10, mg0Var2.b);
                }
                if (i11 != -1) {
                    zf0Var.f[i11].setShader(null);
                    mg0 mg0Var3 = zf0Var.c[i11];
                    if (mg0Var3 != null && !mg0Var3.e && !mg0Var3.d) {
                        mg0Var3.f = false;
                        mg0Var3.b.eraseColor(0);
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
        int i7 = imageReceiver.X0[0];
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
        int o4 = org.telegram.messenger.cz.o();
        if (o4 != 1) {
            return o4 != 2 ? 8.0f : 20.0f;
        }
        return 12.0f;
    }

    private float getRenderNodeScale() {
        return org.telegram.messenger.g0.L(1.0f);
    }

    public final void b(int i7, Bitmap bitmap) {
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
        au0[] au0VarArr;
        hg0 hg0Var = this.h;
        boolean z10 = false;
        if (hg0Var != null && ((fr0Var = hg0Var.i1) == null || !fr0Var.n)) {
            int measuredWidth = (int) (hg0Var.getMeasuredWidth() / 6.0f);
            int i7 = (int) (this.r / 6.0f);
            if (measuredWidth > 0 && i7 > 0) {
                this.E = measuredWidth;
                this.F = i7;
                boolean z11 = this.H;
                mg0[] mg0VarArr = this.c;
                int length = (!z11 || this.I) ? mg0VarArr.length : 1;
                this.H = false;
                this.I = false;
                int i10 = 0;
                while (true) {
                    au0VarArr = this.K;
                    if (i10 >= length) {
                        break;
                    }
                    au0 au0Var = au0VarArr[i10];
                    if (au0Var != null) {
                        au0Var.e(null);
                    }
                    mg0 mg0Var = mg0VarArr[i10];
                    if (mg0Var != null) {
                        Bitmap bitmap = mg0Var.b;
                        if (!mg0Var.d) {
                            if (bitmap.getWidth() == measuredWidth) {
                            }
                        }
                    }
                    if (mg0Var != null) {
                        mg0Var.a();
                    }
                    mg0 mg0Var2 = new mg0();
                    Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, i7, Bitmap.Config.ARGB_8888);
                    mg0Var2.b = createBitmap;
                    mg0Var2.a = new Canvas(createBitmap);
                    mg0VarArr[i10] = mg0Var2;
                    if (mg0VarArr[i10].e) {
                        if (length == 1) {
                            this.H = true;
                        } else {
                            this.I = true;
                        }
                    }
                    i10++;
                }
                View E = this.h.E(this.x);
                g(0, E);
                yf0 yf0Var = this.w;
                if (length == 1) {
                    au0 au0Var2 = au0VarArr[0];
                    if (au0Var2 != null) {
                        au0Var2.e(yf0Var);
                    }
                    return !this.H;
                }
                View E2 = this.h.E(this.x + 1);
                g(1, E2);
                if (this.y == 0) {
                    g(2, this.h.E(this.x - 1));
                }
                for (au0 au0Var3 : au0VarArr) {
                    if (au0Var3 != null) {
                        au0Var3.e(yf0Var);
                    }
                }
                if ((E != null && au0VarArr[0] == null) || (this.y != 0 && E2 != null && au0VarArr[1] == null)) {
                    z10 = true;
                }
                this.G = z10;
                return true;
            }
        }
        return false;
    }

    public final void d() {
        RenderNode renderNode;
        hg0 hg0Var = this.h;
        if (hg0Var != null) {
            fi.e5 e5Var = this.M;
            ArrayList arrayList = hg0Var.l0;
            if (arrayList != null) {
                arrayList.remove(e5Var);
            }
            this.h = null;
        }
        this.e = false;
        ng0.a.cancelRunnable(this.s);
        if (Build.VERSION.SDK_INT >= 29 && (renderNode = this.J) != null) {
            renderNode.discardDisplayList();
            this.J = null;
        }
        synchronized (this.b) {
            for (int i7 = 0; i7 < 3; i7++) {
                try {
                    mg0 mg0Var = this.c[i7];
                    if (mg0Var != null) {
                        mg0Var.a();
                        this.c[i7] = null;
                    }
                    mg0 mg0Var2 = this.d[i7];
                    if (mg0Var2 != null) {
                        mg0Var2.a();
                        this.d[i7] = null;
                    }
                    au0 au0Var = this.K[i7];
                    if (au0Var != null) {
                        au0Var.e(null);
                        this.K[i7] = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f[0].setShader(null);
            this.f[1].setShader(null);
        }
    }

    public final void e(Canvas canvas, org.telegram.ui.wv0 wv0Var, float f10, float f11, boolean z10, float f12, float f13) {
        float f14;
        Canvas canvas2 = canvas;
        hg0 hg0Var = this.h;
        if (hg0Var == null || !hg0Var.isAttachedToWindow() || this.h.getVisibility() == 8) {
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
                        this.J.setPosition(0, 0, (int) Math.ceil(f10 / renderNodeScale), (int) Math.ceil((r6 + this.n) / renderNodeScale));
                        RecordingCanvas beginRecording = this.J.beginRecording();
                        float f16 = 1.0f / renderNodeScale;
                        beginRecording.scale(f16, f16);
                        p5 p5Var = wv0Var.e;
                        f(p5Var != null ? p5Var.k : wv0Var.a, beginRecording, f15, f11);
                        if (wv0Var.b0 && wv0Var.W > 0.0f) {
                            f(wv0Var.V, beginRecording, f15, f11);
                        }
                        this.J.endRecording();
                        this.J.setAlpha(f13);
                        canvas2.translate(0.0f, -f15);
                        canvas2.scale(renderNodeScale, renderNodeScale);
                        canvas2.drawRenderNode(this.J);
                        return;
                    }
                    return;
                }
                i();
                au0[] au0VarArr = this.K;
                au0 au0Var = au0VarArr[0];
                if (au0Var != null) {
                    au0Var.e(null);
                }
                au0 au0Var2 = au0VarArr[1];
                if (au0Var2 != null) {
                    au0Var2.e(null);
                }
                float renderNodeScale2 = getRenderNodeScale();
                this.J.setPosition(0, 0, (int) Math.ceil(f10 / renderNodeScale2), (int) Math.ceil((this.r + this.n) / renderNodeScale2));
                RecordingCanvas beginRecording2 = this.J.beginRecording();
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
                this.J.endRecording();
                this.J.setAlpha(this.L.e(false, 1.0f));
                canvas2.save();
                canvas2.scale(renderNodeScale2, renderNodeScale2);
                canvas2.drawRenderNode(this.J);
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
        if (this.I || this.H || this.G || (this.f[0].getShader() == null && this.f[1].getShader() == null && !this.e)) {
            boolean c10 = c();
            if (!this.e && c10) {
                this.e = true;
                org.telegram.messenger.r5 r5Var = ng0.a;
                r5Var.cancelRunnable(this.s);
                r5Var.postRunnable(this.s);
            }
        }
        if (this.f[0].getShader() == null && this.f[1].getShader() == null) {
            return;
        }
        synchronized (this.b) {
            try {
                float f18 = f10 / this.E;
                if (z10) {
                    canvas2.translate(0.0f, (-f18) * this.F);
                }
                canvas2.scale(f18, f18);
                float f19 = this.n / f18;
                if (this.f[0].getShader() != null) {
                    canvas2.save();
                    canvas2.translate((-this.y) / f18, 0.0f);
                    canvas2.save();
                    canvas2.scale(1.0f, 2.0f, 0.0f, this.F);
                    float f20 = this.F;
                    f14 = 2.0f;
                    canvas2.drawRect(0.0f, f20, this.E, f20 + f19, this.f[0]);
                    canvas.restore();
                    this.f[0].setAlpha((int) (f13 * 255.0f));
                    float f21 = this.F;
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, f21 * f12, this.E, f21, this.f[0]);
                    this.f[0].setAlpha(org.telegram.messenger.ls.e4);
                    canvas2.restore();
                } else {
                    f14 = 2.0f;
                }
                if (this.y != 0 && this.f[1].getShader() != null) {
                    canvas2.save();
                    canvas2.translate(((-this.y) + f10) / f18, 0.0f);
                    canvas2.save();
                    canvas2.scale(1.0f, f14, 0.0f, this.F);
                    float f22 = this.F;
                    canvas2.drawRect(0.0f, f22, this.E, f22 + f19, this.f[1]);
                    canvas.restore();
                    this.f[1].setAlpha((int) (f13 * 255.0f));
                    float f23 = this.F;
                    canvas.drawRect(0.0f, f23 * f12, this.E, f23, this.f[1]);
                    this.f[1].setAlpha(org.telegram.messenger.ls.e4);
                    canvas.restore();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(int i7, View view) {
        mg0 mg0Var = this.c[i7];
        if (view != 0 && !mg0Var.e) {
            Canvas canvas = mg0Var.a;
            canvas.save();
            canvas.scale(0.16666667f, 0.16666667f);
            canvas.translate(0.0f, this.r - view.getMeasuredHeight());
            view.draw(canvas);
            canvas.restore();
            mg0Var.f = true;
        }
        if (i7 == 0 || (this.y != 0 && i7 == 1)) {
            boolean z10 = view instanceof au0;
            au0[] au0VarArr = this.K;
            if (z10) {
                au0VarArr[i7] = (au0) view;
            } else {
                au0VarArr[i7] = null;
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
        boolean z10 = E instanceof au0;
        au0[] au0VarArr = this.K;
        if (!z10) {
            au0VarArr[i7] = null;
            return;
        }
        au0 au0Var = (au0) E;
        au0VarArr[i7] = au0Var;
        au0Var.e(this.w);
    }

    public final void i() {
        BlendMode blendMode;
        if (this.J == null) {
            float renderNodeScale = getRenderNodeScale();
            this.J = new RenderNode("profileBlurNode");
            float[] fArr = {0.0f, org.telegram.messenger.g0.N(56.0f) / this.r};
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.r / renderNodeScale, new int[]{0, -1}, fArr, tileMode);
            float blurRadius = getBlurRadius();
            RenderNode renderNode = this.J;
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

    public void setView(hg0 hg0Var) {
        d();
        this.h = hg0Var;
        this.x = hg0Var.getCurrentItem();
        this.y = 0;
        hg0Var.b(this.M);
    }
}
