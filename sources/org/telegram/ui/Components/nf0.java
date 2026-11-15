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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class nf0 extends View {
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public boolean I;
    public RenderNode J;
    public final pt0[] K;
    public final u5 L;
    public final fi.f5 M;
    public boolean a;
    public final Object b;
    public final ag0[] c;
    public final ag0[] d;
    public volatile boolean e;
    public final Paint[] f;
    public vf0 h;
    public int n;
    public int r;
    public final mf0 s;
    public final mf0 w;
    public int x;
    public int y;

    public nf0(Context context) {
        super(context);
        int i7 = 1;
        int i10 = 0;
        this.a = Build.VERSION.SDK_INT >= 31;
        this.b = new Object();
        this.c = new ag0[3];
        this.d = new ag0[3];
        this.e = false;
        Paint[] paintArr = {new Paint(), new Paint()};
        this.f = paintArr;
        this.s = new mf0(this, i10);
        this.w = new mf0(this, i7);
        this.x = -1;
        this.G = false;
        this.H = false;
        this.I = false;
        this.K = new pt0[3];
        u5 u5Var = new u5(this, 0L, 350L, er.f);
        this.L = u5Var;
        this.M = new fi.f5(2, this);
        u5Var.e(true, 1.0f);
        boolean z10 = this.a & org.telegram.messenger.gz.a0;
        this.a = z10;
        if (z10) {
            setLayerType(2, null);
        } else {
            setLayerType(1, paintArr[0]);
            setLayerType(1, paintArr[1]);
        }
    }

    public static void a(nf0 nf0Var, int i7, int i10, int i11) {
        synchronized (nf0Var.b) {
            try {
                ag0[] ag0VarArr = nf0Var.c;
                ag0 ag0Var = ag0VarArr[i7];
                ag0VarArr[i7] = ag0VarArr[i10];
                ag0VarArr[i10] = ag0Var;
                ag0[] ag0VarArr2 = nf0Var.d;
                ag0 ag0Var2 = ag0VarArr2[i7];
                ag0VarArr2[i7] = ag0VarArr2[i10];
                ag0VarArr2[i10] = ag0Var2;
                if (i7 != 2) {
                    Paint[] paintArr = nf0Var.f;
                    Paint paint = paintArr[i7];
                    paintArr[i7] = paintArr[i10];
                    paintArr[i10] = paint;
                } else if (ag0Var2.f) {
                    nf0Var.b(i10, ag0Var2.b);
                }
                if (i11 != -1) {
                    nf0Var.f[i11].setShader(null);
                    ag0 ag0Var3 = nf0Var.c[i11];
                    if (ag0Var3 != null && !ag0Var3.e && !ag0Var3.d) {
                        ag0Var3.f = false;
                        ag0Var3.b.eraseColor(0);
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
        int o4 = org.telegram.messenger.gz.o();
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
        org.telegram.ui.dr0 dr0Var;
        pt0[] pt0VarArr;
        vf0 vf0Var = this.h;
        boolean z10 = false;
        if (vf0Var != null && ((dr0Var = vf0Var.i1) == null || !dr0Var.n)) {
            int measuredWidth = (int) (vf0Var.getMeasuredWidth() / 6.0f);
            int i7 = (int) (this.r / 6.0f);
            if (measuredWidth > 0 && i7 > 0) {
                this.E = measuredWidth;
                this.F = i7;
                boolean z11 = this.H;
                ag0[] ag0VarArr = this.c;
                int length = (!z11 || this.I) ? ag0VarArr.length : 1;
                this.H = false;
                this.I = false;
                int i10 = 0;
                while (true) {
                    pt0VarArr = this.K;
                    if (i10 >= length) {
                        break;
                    }
                    pt0 pt0Var = pt0VarArr[i10];
                    if (pt0Var != null) {
                        pt0Var.d(null);
                    }
                    ag0 ag0Var = ag0VarArr[i10];
                    if (ag0Var != null) {
                        Bitmap bitmap = ag0Var.b;
                        if (!ag0Var.d) {
                            if (bitmap.getWidth() == measuredWidth) {
                            }
                        }
                    }
                    if (ag0Var != null) {
                        ag0Var.a();
                    }
                    ag0 ag0Var2 = new ag0();
                    Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, i7, Bitmap.Config.ARGB_8888);
                    ag0Var2.b = createBitmap;
                    ag0Var2.a = new Canvas(createBitmap);
                    ag0VarArr[i10] = ag0Var2;
                    if (ag0VarArr[i10].e) {
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
                mf0 mf0Var = this.w;
                if (length == 1) {
                    pt0 pt0Var2 = pt0VarArr[0];
                    if (pt0Var2 != null) {
                        pt0Var2.d(mf0Var);
                    }
                    return !this.H;
                }
                View E2 = this.h.E(this.x + 1);
                g(1, E2);
                if (this.y == 0) {
                    g(2, this.h.E(this.x - 1));
                }
                for (pt0 pt0Var3 : pt0VarArr) {
                    if (pt0Var3 != null) {
                        pt0Var3.d(mf0Var);
                    }
                }
                if ((E != null && pt0VarArr[0] == null) || (this.y != 0 && E2 != null && pt0VarArr[1] == null)) {
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
        vf0 vf0Var = this.h;
        if (vf0Var != null) {
            fi.f5 f5Var = this.M;
            ArrayList arrayList = vf0Var.l0;
            if (arrayList != null) {
                arrayList.remove(f5Var);
            }
            this.h = null;
        }
        this.e = false;
        bg0.a.cancelRunnable(this.s);
        if (Build.VERSION.SDK_INT >= 29 && (renderNode = this.J) != null) {
            renderNode.discardDisplayList();
            this.J = null;
        }
        synchronized (this.b) {
            for (int i7 = 0; i7 < 3; i7++) {
                try {
                    ag0 ag0Var = this.c[i7];
                    if (ag0Var != null) {
                        ag0Var.a();
                        this.c[i7] = null;
                    }
                    ag0 ag0Var2 = this.d[i7];
                    if (ag0Var2 != null) {
                        ag0Var2.a();
                        this.d[i7] = null;
                    }
                    pt0 pt0Var = this.K[i7];
                    if (pt0Var != null) {
                        pt0Var.d(null);
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

    public final void e(Canvas canvas, org.telegram.ui.vv0 vv0Var, float f10, float f11, boolean z10, float f12, float f13) {
        float f14;
        Canvas canvas2 = canvas;
        vf0 vf0Var = this.h;
        if (vf0Var == null || !vf0Var.isAttachedToWindow() || this.h.getVisibility() == 8) {
            return;
        }
        if (this.a && Build.VERSION.SDK_INT >= 31) {
            if (canvas2.isHardwareAccelerated()) {
                if (vv0Var != null || getVisibility() != 0 || getAlpha() <= 0.0f) {
                    if (vv0Var != null) {
                        float measuredWidth = f10 / this.h.getMeasuredWidth();
                        float f15 = this.r * (1.0f - f12) * measuredWidth;
                        float renderNodeScale = getRenderNodeScale() * measuredWidth;
                        i();
                        this.J.setPosition(0, 0, (int) Math.ceil(f10 / renderNodeScale), (int) Math.ceil((r6 + this.n) / renderNodeScale));
                        RecordingCanvas beginRecording = this.J.beginRecording();
                        float f16 = 1.0f / renderNodeScale;
                        beginRecording.scale(f16, f16);
                        g5 g5Var = vv0Var.e;
                        f(g5Var != null ? g5Var.k : vv0Var.a, beginRecording, f15, f11);
                        if (vv0Var.b0 && vv0Var.W > 0.0f) {
                            f(vv0Var.V, beginRecording, f15, f11);
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
                pt0[] pt0VarArr = this.K;
                pt0 pt0Var = pt0VarArr[0];
                if (pt0Var != null) {
                    pt0Var.d(null);
                }
                pt0 pt0Var2 = pt0VarArr[1];
                if (pt0Var2 != null) {
                    pt0Var2.d(null);
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
            if (vv0Var != null || org.telegram.messenger.g0.m0) {
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
                org.telegram.messenger.q5 q5Var = bg0.a;
                q5Var.cancelRunnable(this.s);
                q5Var.postRunnable(this.s);
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
                    this.f[0].setAlpha(org.telegram.messenger.ns.e4);
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
                    this.f[1].setAlpha(org.telegram.messenger.ns.e4);
                    canvas.restore();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(int i7, View view) {
        ag0 ag0Var = this.c[i7];
        if (view != 0 && !ag0Var.e) {
            Canvas canvas = ag0Var.a;
            canvas.save();
            canvas.scale(0.16666667f, 0.16666667f);
            canvas.translate(0.0f, this.r - view.getMeasuredHeight());
            view.draw(canvas);
            canvas.restore();
            ag0Var.f = true;
        }
        if (i7 == 0 || (this.y != 0 && i7 == 1)) {
            boolean z10 = view instanceof pt0;
            pt0[] pt0VarArr = this.K;
            if (z10) {
                pt0VarArr[i7] = (pt0) view;
            } else {
                pt0VarArr[i7] = null;
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
        boolean z10 = E instanceof pt0;
        pt0[] pt0VarArr = this.K;
        if (!z10) {
            pt0VarArr[i7] = null;
            return;
        }
        pt0 pt0Var = (pt0) E;
        pt0VarArr[i7] = pt0Var;
        pt0Var.d(this.w);
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

    public void setView(vf0 vf0Var) {
        d();
        this.h = vf0Var;
        this.x = vf0Var.getCurrentItem();
        this.y = 0;
        vf0Var.b(this.M);
    }
}
