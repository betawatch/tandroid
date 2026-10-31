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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class mg0 extends View {
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public RenderNode I;
    public final ru0[] J;
    public final t5 K;
    public final hc0 L;
    public boolean a;
    public final Object b;
    public final zg0[] c;
    public final zg0[] d;
    public volatile boolean e;
    public final Paint[] f;
    public ug0 h;
    public int n;
    public int r;
    public final lg0 s;
    public final lg0 w;
    public int x;
    public int y;

    public mg0(Context context) {
        super(context);
        int i10 = 1;
        int i11 = 0;
        this.a = Build.VERSION.SDK_INT >= 31;
        this.b = new Object();
        this.c = new zg0[3];
        this.d = new zg0[3];
        this.e = false;
        Paint[] paintArr = {new Paint(), new Paint()};
        this.f = paintArr;
        this.s = new lg0(this, i11);
        this.w = new lg0(this, i10);
        this.x = -1;
        this.F = false;
        this.G = false;
        this.H = false;
        this.J = new ru0[3];
        t5 t5Var = new t5(this, 0L, 350L, gr.f);
        this.K = t5Var;
        this.L = new hc0(i10, this);
        t5Var.e(true, 1.0f);
        boolean z10 = this.a & org.telegram.messenger.tz.a0;
        this.a = z10;
        if (z10) {
            setLayerType(2, null);
        } else {
            setLayerType(1, paintArr[0]);
            setLayerType(1, paintArr[1]);
        }
    }

    public static void a(mg0 mg0Var, int i10, int i11, int i12) {
        synchronized (mg0Var.b) {
            try {
                zg0[] zg0VarArr = mg0Var.c;
                zg0 zg0Var = zg0VarArr[i10];
                zg0VarArr[i10] = zg0VarArr[i11];
                zg0VarArr[i11] = zg0Var;
                zg0[] zg0VarArr2 = mg0Var.d;
                zg0 zg0Var2 = zg0VarArr2[i10];
                zg0VarArr2[i10] = zg0VarArr2[i11];
                zg0VarArr2[i11] = zg0Var2;
                if (i10 != 2) {
                    Paint[] paintArr = mg0Var.f;
                    Paint paint = paintArr[i10];
                    paintArr[i10] = paintArr[i11];
                    paintArr[i11] = paint;
                } else if (zg0Var2.f) {
                    mg0Var.b(zg0Var2.b, i11);
                }
                if (i12 != -1) {
                    mg0Var.f[i12].setShader(null);
                    zg0 zg0Var3 = mg0Var.c[i12];
                    if (zg0Var3 != null && !zg0Var3.e && !zg0Var3.d) {
                        zg0Var3.f = false;
                        zg0Var3.b.eraseColor(0);
                    }
                }
            } finally {
            }
        }
    }

    public static void f(ImageReceiver imageReceiver, Canvas canvas, float f7, float f10) {
        if (imageReceiver == null) {
            return;
        }
        int i10 = imageReceiver.W0[0];
        imageReceiver.J0(0);
        canvas.save();
        canvas.translate(0.0f, f7 - f10);
        imageReceiver.h(canvas, null);
        canvas.restore();
        canvas.save();
        canvas.scale(1.0f, -1.0f);
        canvas.translate(0.0f, (-f10) - f7);
        canvas.scale(1.0f, 2.0f, 0.0f, f10);
        imageReceiver.h(canvas, null);
        canvas.restore();
        imageReceiver.J0(i10);
    }

    private float getBlurRadius() {
        int o10 = org.telegram.messenger.tz.o();
        if (o10 != 1) {
            return o10 != 2 ? 8.0f : 20.0f;
        }
        return 12.0f;
    }

    private float getRenderNodeScale() {
        return org.telegram.messenger.i0.L(1.0f);
    }

    public final void b(Bitmap bitmap, int i10) {
        if (i10 >= 2 || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.r / 6.0f, new int[]{0, -1}, new float[]{0.0f, org.telegram.messenger.i0.N(56.0f) / this.r}, Shader.TileMode.CLAMP);
        Shader.TileMode tileMode = Shader.TileMode.MIRROR;
        this.f[i10].setShader(new ComposeShader(new BitmapShader(bitmap, tileMode, tileMode), linearGradient, PorterDuff.Mode.DST_IN));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        if (r8.getHeight() != r2) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c() {
        org.telegram.ui.qs0 qs0Var;
        ru0[] ru0VarArr;
        ug0 ug0Var = this.h;
        boolean z10 = false;
        if (ug0Var != null && ((qs0Var = ug0Var.h1) == null || !qs0Var.n)) {
            int measuredWidth = (int) (ug0Var.getMeasuredWidth() / 6.0f);
            int i10 = (int) (this.r / 6.0f);
            if (measuredWidth > 0 && i10 > 0) {
                this.D = measuredWidth;
                this.E = i10;
                boolean z11 = this.G;
                zg0[] zg0VarArr = this.c;
                int length = (!z11 || this.H) ? zg0VarArr.length : 1;
                this.G = false;
                this.H = false;
                int i11 = 0;
                while (true) {
                    ru0VarArr = this.J;
                    if (i11 >= length) {
                        break;
                    }
                    ru0 ru0Var = ru0VarArr[i11];
                    if (ru0Var != null) {
                        ru0Var.f(null);
                    }
                    zg0 zg0Var = zg0VarArr[i11];
                    if (zg0Var != null) {
                        Bitmap bitmap = zg0Var.b;
                        if (!zg0Var.d) {
                            if (bitmap.getWidth() == measuredWidth) {
                            }
                        }
                    }
                    if (zg0Var != null) {
                        zg0Var.a();
                    }
                    zg0 zg0Var2 = new zg0();
                    Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, i10, Bitmap.Config.ARGB_8888);
                    zg0Var2.b = createBitmap;
                    zg0Var2.a = new Canvas(createBitmap);
                    zg0VarArr[i11] = zg0Var2;
                    if (zg0VarArr[i11].e) {
                        if (length == 1) {
                            this.G = true;
                        } else {
                            this.H = true;
                        }
                    }
                    i11++;
                }
                View E = this.h.E(this.x);
                g(0, E);
                lg0 lg0Var = this.w;
                if (length == 1) {
                    ru0 ru0Var2 = ru0VarArr[0];
                    if (ru0Var2 != null) {
                        ru0Var2.f(lg0Var);
                    }
                    return !this.G;
                }
                View E2 = this.h.E(this.x + 1);
                g(1, E2);
                if (this.y == 0) {
                    g(2, this.h.E(this.x - 1));
                }
                for (ru0 ru0Var3 : ru0VarArr) {
                    if (ru0Var3 != null) {
                        ru0Var3.f(lg0Var);
                    }
                }
                if ((E != null && ru0VarArr[0] == null) || (this.y != 0 && E2 != null && ru0VarArr[1] == null)) {
                    z10 = true;
                }
                this.F = z10;
                return true;
            }
        }
        return false;
    }

    public final void d() {
        RenderNode renderNode;
        ug0 ug0Var = this.h;
        if (ug0Var != null) {
            hc0 hc0Var = this.L;
            ArrayList arrayList = ug0Var.k0;
            if (arrayList != null) {
                arrayList.remove(hc0Var);
            }
            this.h = null;
        }
        this.e = false;
        ah0.a.cancelRunnable(this.s);
        if (Build.VERSION.SDK_INT >= 29 && (renderNode = this.I) != null) {
            renderNode.discardDisplayList();
            this.I = null;
        }
        synchronized (this.b) {
            for (int i10 = 0; i10 < 3; i10++) {
                try {
                    zg0 zg0Var = this.c[i10];
                    if (zg0Var != null) {
                        zg0Var.a();
                        this.c[i10] = null;
                    }
                    zg0 zg0Var2 = this.d[i10];
                    if (zg0Var2 != null) {
                        zg0Var2.a();
                        this.d[i10] = null;
                    }
                    ru0 ru0Var = this.J[i10];
                    if (ru0Var != null) {
                        ru0Var.f(null);
                        this.J[i10] = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f[0].setShader(null);
            this.f[1].setShader(null);
        }
    }

    public final void e(Canvas canvas, org.telegram.ui.jx0 jx0Var, float f7, float f10, boolean z10, float f11, float f12) {
        float f13;
        Canvas canvas2 = canvas;
        ug0 ug0Var = this.h;
        if (ug0Var == null || !ug0Var.isAttachedToWindow() || this.h.getVisibility() == 8) {
            return;
        }
        if (this.a && Build.VERSION.SDK_INT >= 31) {
            if (canvas2.isHardwareAccelerated()) {
                if (jx0Var != null || getVisibility() != 0 || getAlpha() <= 0.0f) {
                    if (jx0Var != null) {
                        float measuredWidth = f7 / this.h.getMeasuredWidth();
                        float f14 = this.r * (1.0f - f11) * measuredWidth;
                        float renderNodeScale = getRenderNodeScale() * measuredWidth;
                        i();
                        this.I.setPosition(0, 0, (int) Math.ceil(f7 / renderNodeScale), (int) Math.ceil((r6 + this.n) / renderNodeScale));
                        RecordingCanvas beginRecording = this.I.beginRecording();
                        float f15 = 1.0f / renderNodeScale;
                        beginRecording.scale(f15, f15);
                        f5 f5Var = jx0Var.e;
                        f(f5Var != null ? f5Var.k : jx0Var.a, beginRecording, f14, f10);
                        if (jx0Var.a0 && jx0Var.V > 0.0f) {
                            f(jx0Var.U, beginRecording, f14, f10);
                        }
                        this.I.endRecording();
                        this.I.setAlpha(f12);
                        canvas2.translate(0.0f, -f14);
                        canvas2.scale(renderNodeScale, renderNodeScale);
                        canvas2.drawRenderNode(this.I);
                        return;
                    }
                    return;
                }
                i();
                ru0[] ru0VarArr = this.J;
                ru0 ru0Var = ru0VarArr[0];
                if (ru0Var != null) {
                    ru0Var.f(null);
                }
                ru0 ru0Var2 = ru0VarArr[1];
                if (ru0Var2 != null) {
                    ru0Var2.f(null);
                }
                float renderNodeScale2 = getRenderNodeScale();
                this.I.setPosition(0, 0, (int) Math.ceil(f7 / renderNodeScale2), (int) Math.ceil((this.r + this.n) / renderNodeScale2));
                RecordingCanvas beginRecording2 = this.I.beginRecording();
                float f16 = 1.0f / renderNodeScale2;
                beginRecording2.scale(f16, f16);
                beginRecording2.save();
                beginRecording2.translate(-this.y, 0.0f);
                h(beginRecording2, 0);
                beginRecording2.restore();
                if (this.y != 0) {
                    beginRecording2.save();
                    beginRecording2.translate((-this.y) + f7, 0.0f);
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
            if (jx0Var != null || org.telegram.messenger.i0.m0) {
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
                org.telegram.messenger.s5 s5Var = ah0.a;
                s5Var.cancelRunnable(this.s);
                s5Var.postRunnable(this.s);
            }
        }
        if (this.f[0].getShader() == null && this.f[1].getShader() == null) {
            return;
        }
        synchronized (this.b) {
            try {
                float f17 = f7 / this.D;
                if (z10) {
                    canvas2.translate(0.0f, (-f17) * this.E);
                }
                canvas2.scale(f17, f17);
                float f18 = this.n / f17;
                if (this.f[0].getShader() != null) {
                    canvas2.save();
                    canvas2.translate((-this.y) / f17, 0.0f);
                    canvas2.save();
                    canvas2.scale(1.0f, 2.0f, 0.0f, this.E);
                    float f19 = this.E;
                    f13 = 2.0f;
                    canvas2.drawRect(0.0f, f19, this.D, f19 + f18, this.f[0]);
                    canvas.restore();
                    this.f[0].setAlpha((int) (f12 * 255.0f));
                    float f20 = this.E;
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, f20 * f11, this.D, f20, this.f[0]);
                    this.f[0].setAlpha(org.telegram.messenger.zs.e4);
                    canvas2.restore();
                } else {
                    f13 = 2.0f;
                }
                if (this.y != 0 && this.f[1].getShader() != null) {
                    canvas2.save();
                    canvas2.translate(((-this.y) + f7) / f17, 0.0f);
                    canvas2.save();
                    canvas2.scale(1.0f, f13, 0.0f, this.E);
                    float f21 = this.E;
                    canvas2.drawRect(0.0f, f21, this.D, f21 + f18, this.f[1]);
                    canvas.restore();
                    this.f[1].setAlpha((int) (f12 * 255.0f));
                    float f22 = this.E;
                    canvas.drawRect(0.0f, f22 * f11, this.D, f22, this.f[1]);
                    this.f[1].setAlpha(org.telegram.messenger.zs.e4);
                    canvas.restore();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(int i10, View view) {
        zg0 zg0Var = this.c[i10];
        if (view != 0 && !zg0Var.e) {
            Canvas canvas = zg0Var.a;
            canvas.save();
            canvas.scale(0.16666667f, 0.16666667f);
            canvas.translate(0.0f, this.r - view.getMeasuredHeight());
            view.draw(canvas);
            canvas.restore();
            zg0Var.f = true;
        }
        if (i10 == 0 || (this.y != 0 && i10 == 1)) {
            boolean z10 = view instanceof ru0;
            ru0[] ru0VarArr = this.J;
            if (z10) {
                ru0VarArr[i10] = (ru0) view;
            } else {
                ru0VarArr[i10] = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(Canvas canvas, int i10) {
        View E = this.h.E(this.x + i10);
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
        boolean z10 = E instanceof ru0;
        ru0[] ru0VarArr = this.J;
        if (!z10) {
            ru0VarArr[i10] = null;
            return;
        }
        ru0 ru0Var = (ru0) E;
        ru0VarArr[i10] = ru0Var;
        ru0Var.f(this.w);
    }

    public final void i() {
        BlendMode blendMode;
        if (this.I == null) {
            float renderNodeScale = getRenderNodeScale();
            this.I = new RenderNode("profileBlurNode");
            float[] fArr = {0.0f, org.telegram.messenger.i0.N(56.0f) / this.r};
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
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), this.r + this.n);
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        super.setAlpha(f7);
        if (f7 == 0.0f || !this.a) {
            return;
        }
        invalidate();
    }

    public void setSize(int i10) {
        if (this.n != i10) {
            invalidate();
        }
        this.n = i10;
        this.r = (int) (org.telegram.messenger.i0.L(64.0f) * 1.5f);
    }

    public void setView(ug0 ug0Var) {
        d();
        this.h = ug0Var;
        this.x = ug0Var.getCurrentItem();
        this.y = 0;
        ug0Var.b(this.L);
    }
}
