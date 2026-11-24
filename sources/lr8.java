// default package

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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class lr8 extends View {
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public boolean I;
    public RenderNode J;
    public final bla[] K;
    public final ln L;
    public final lw M;
    public boolean a;
    public final Object b;
    public final kt8[] c;
    public final kt8[] d;
    public volatile boolean e;
    public final Paint[] f;
    public tr8 h;
    public int n;
    public int r;
    public final kr8 s;
    public final kr8 w;
    public int x;
    public int y;

    public lr8(Context context) {
        super(context);
        byte b = 1;
        byte b2 = 0;
        this.a = Build.VERSION.SDK_INT >= 31;
        this.b = new Object();
        this.c = new kt8[3];
        this.d = new kt8[3];
        this.e = false;
        Paint[] paintArr = {new Paint(), new Paint()};
        this.f = paintArr;
        this.s = new kr8(this, b2);
        this.w = new kr8(this, b);
        this.x = -1;
        this.G = false;
        this.H = false;
        this.I = false;
        this.K = new bla[3];
        ln lnVar = new ln(this, 0L, 350L, d53.f);
        this.L = lnVar;
        this.M = new lw(this, (byte) 3);
        lnVar.e(true, 1.0f);
        boolean z = this.a & gda.X;
        this.a = z;
        if (z) {
            setLayerType(2, null);
        } else {
            setLayerType(1, paintArr[0]);
            setLayerType(1, paintArr[1]);
        }
    }

    public static void e(ImageReceiver imageReceiver, Canvas canvas, float f, float f2) {
        if (imageReceiver == null) {
            return;
        }
        int i = imageReceiver.X0[0];
        imageReceiver.q0(0);
        canvas.save();
        canvas.translate(0.0f, f - f2);
        imageReceiver.h(canvas, null);
        canvas.restore();
        canvas.save();
        canvas.scale(1.0f, -1.0f);
        canvas.translate(0.0f, (-f2) - f);
        canvas.scale(1.0f, 2.0f, 0.0f, f2);
        imageReceiver.h(canvas, null);
        canvas.restore();
        imageReceiver.q0(i);
    }

    private float getBlurRadius() {
        int o = gda.o();
        if (o != 1) {
            return o != 2 ? 8.0f : 20.0f;
        }
        return 12.0f;
    }

    private float getRenderNodeScale() {
        return gm.L(1.0f);
    }

    public final void a(int i, Bitmap bitmap) {
        if (i >= 2 || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.r / 6.0f, new int[]{0, -1}, new float[]{0.0f, gm.N(56.0f) / this.r}, Shader.TileMode.CLAMP);
        Shader.TileMode tileMode = Shader.TileMode.MIRROR;
        this.f[i].setShader(new ComposeShader(new BitmapShader(bitmap, tileMode, tileMode), linearGradient, PorterDuff.Mode.DST_IN));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        if (r8.getHeight() == r2) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b() {
        pc8 pc8Var;
        bla[] blaVarArr;
        tr8 tr8Var = this.h;
        boolean z = false;
        if (tr8Var != null && ((pc8Var = tr8Var.i1) == null || !pc8Var.n)) {
            int measuredWidth = (int) (tr8Var.getMeasuredWidth() / 6.0f);
            int i = (int) (this.r / 6.0f);
            if (measuredWidth > 0 && i > 0) {
                this.E = measuredWidth;
                this.F = i;
                boolean z2 = this.H;
                kt8[] kt8VarArr = this.c;
                int length = (!z2 || this.I) ? kt8VarArr.length : 1;
                this.H = false;
                this.I = false;
                int i2 = 0;
                while (true) {
                    blaVarArr = this.K;
                    if (i2 >= length) {
                        break;
                    }
                    bla blaVar = blaVarArr[i2];
                    if (blaVar != null) {
                        blaVar.d(null);
                    }
                    kt8 kt8Var = kt8VarArr[i2];
                    if (kt8Var != null) {
                        Bitmap bitmap = kt8Var.b;
                        if (!kt8Var.d) {
                            if (bitmap.getWidth() == measuredWidth) {
                            }
                        }
                    }
                    if (kt8Var != null) {
                        kt8Var.a();
                    }
                    kt8 kt8Var2 = new kt8();
                    Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, i, Bitmap.Config.ARGB_8888);
                    kt8Var2.b = createBitmap;
                    kt8Var2.a = new Canvas(createBitmap);
                    kt8VarArr[i2] = kt8Var2;
                    if (kt8VarArr[i2].e) {
                        if (length == 1) {
                            this.H = true;
                        } else {
                            this.I = true;
                        }
                    }
                    i2++;
                }
                View E = this.h.E(this.x);
                f(0, E);
                kr8 kr8Var = this.w;
                if (length == 1) {
                    bla blaVar2 = blaVarArr[0];
                    if (blaVar2 != null) {
                        blaVar2.d(kr8Var);
                    }
                    return !this.H;
                }
                View E2 = this.h.E(this.x + 1);
                f(1, E2);
                if (this.y == 0) {
                    f(2, this.h.E(this.x - 1));
                }
                for (bla blaVar3 : blaVarArr) {
                    if (blaVar3 != null) {
                        blaVar3.d(kr8Var);
                    }
                }
                if ((E != null && blaVarArr[0] == null) || (this.y != 0 && E2 != null && blaVarArr[1] == null)) {
                    z = true;
                }
                this.G = z;
                return true;
            }
        }
        return false;
    }

    public final void c() {
        RenderNode renderNode;
        tr8 tr8Var = this.h;
        if (tr8Var != null) {
            lw lwVar = this.M;
            ArrayList arrayList = tr8Var.l0;
            if (arrayList != null) {
                arrayList.remove(lwVar);
            }
            this.h = null;
        }
        this.e = false;
        lt8.a.cancelRunnable(this.s);
        if (Build.VERSION.SDK_INT >= 29 && (renderNode = this.J) != null) {
            renderNode.discardDisplayList();
            this.J = null;
        }
        synchronized (this.b) {
            for (int i = 0; i < 3; i++) {
                kt8 kt8Var = this.c[i];
                if (kt8Var != null) {
                    kt8Var.a();
                    this.c[i] = null;
                }
                kt8 kt8Var2 = this.d[i];
                if (kt8Var2 != null) {
                    kt8Var2.a();
                    this.d[i] = null;
                }
                bla blaVar = this.K[i];
                if (blaVar != null) {
                    blaVar.d(null);
                    this.K[i] = null;
                }
            }
            this.f[0].setShader(null);
            this.f[1].setShader(null);
        }
    }

    public final void d(Canvas canvas, xp8 xp8Var, float f, float f2, boolean z, float f3, float f4) {
        float f5;
        Canvas canvas2 = canvas;
        tr8 tr8Var = this.h;
        if (tr8Var == null || !tr8Var.isAttachedToWindow() || this.h.getVisibility() == 8) {
            return;
        }
        if (this.a && Build.VERSION.SDK_INT >= 31) {
            if (canvas2.isHardwareAccelerated()) {
                if (xp8Var != null || getVisibility() != 0 || getAlpha() <= 0.0f) {
                    if (xp8Var != null) {
                        float measuredWidth = f / this.h.getMeasuredWidth();
                        float f6 = this.r * (1.0f - f3) * measuredWidth;
                        float renderNodeScale = getRenderNodeScale() * measuredWidth;
                        h();
                        this.J.setPosition(0, 0, (int) Math.ceil(f / renderNodeScale), (int) Math.ceil((r6 + this.n) / renderNodeScale));
                        RecordingCanvas beginRecording = this.J.beginRecording();
                        float f7 = 1.0f / renderNodeScale;
                        beginRecording.scale(f7, f7);
                        vm vmVar = xp8Var.e;
                        e(vmVar != null ? vmVar.k : xp8Var.a, beginRecording, f6, f2);
                        if (xp8Var.b0 && xp8Var.W > 0.0f) {
                            e(xp8Var.V, beginRecording, f6, f2);
                        }
                        this.J.endRecording();
                        this.J.setAlpha(f4);
                        canvas2.translate(0.0f, -f6);
                        canvas2.scale(renderNodeScale, renderNodeScale);
                        canvas2.drawRenderNode(this.J);
                        return;
                    }
                    return;
                }
                h();
                bla[] blaVarArr = this.K;
                bla blaVar = blaVarArr[0];
                if (blaVar != null) {
                    blaVar.d(null);
                }
                bla blaVar2 = blaVarArr[1];
                if (blaVar2 != null) {
                    blaVar2.d(null);
                }
                float renderNodeScale2 = getRenderNodeScale();
                this.J.setPosition(0, 0, (int) Math.ceil(f / renderNodeScale2), (int) Math.ceil((this.r + this.n) / renderNodeScale2));
                RecordingCanvas beginRecording2 = this.J.beginRecording();
                float f8 = 1.0f / renderNodeScale2;
                beginRecording2.scale(f8, f8);
                beginRecording2.save();
                beginRecording2.translate(-this.y, 0.0f);
                g(beginRecording2, 0);
                beginRecording2.restore();
                if (this.y != 0) {
                    beginRecording2.save();
                    beginRecording2.translate((-this.y) + f, 0.0f);
                    g(beginRecording2, 1);
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
            if (xp8Var != null || gm.m0) {
                return;
            }
            this.a = false;
            setLayerType(1, this.f[0]);
            setLayerType(1, this.f[1]);
        }
        if (this.I || this.H || this.G || (this.f[0].getShader() == null && this.f[1].getShader() == null && !this.e)) {
            boolean b = b();
            if (!this.e && b) {
                this.e = true;
                np3 np3Var = lt8.a;
                np3Var.cancelRunnable(this.s);
                np3Var.postRunnable(this.s);
            }
        }
        if (this.f[0].getShader() == null && this.f[1].getShader() == null) {
            return;
        }
        synchronized (this.b) {
            float f9 = f / this.E;
            if (z) {
                canvas2.translate(0.0f, (-f9) * this.F);
            }
            canvas2.scale(f9, f9);
            float f10 = this.n / f9;
            if (this.f[0].getShader() != null) {
                canvas2.save();
                canvas2.translate((-this.y) / f9, 0.0f);
                canvas2.save();
                canvas2.scale(1.0f, 2.0f, 0.0f, this.F);
                float f11 = this.F;
                f5 = 2.0f;
                canvas2.drawRect(0.0f, f11, this.E, f11 + f10, this.f[0]);
                canvas.restore();
                this.f[0].setAlpha((int) (f4 * 255.0f));
                float f12 = this.F;
                canvas2 = canvas;
                canvas2.drawRect(0.0f, f12 * f3, this.E, f12, this.f[0]);
                this.f[0].setAlpha(nm7.d4);
                canvas2.restore();
            } else {
                f5 = 2.0f;
            }
            if (this.y != 0 && this.f[1].getShader() != null) {
                canvas2.save();
                canvas2.translate(((-this.y) + f) / f9, 0.0f);
                canvas2.save();
                canvas2.scale(1.0f, f5, 0.0f, this.F);
                float f13 = this.F;
                canvas2.drawRect(0.0f, f13, this.E, f13 + f10, this.f[1]);
                canvas.restore();
                this.f[1].setAlpha((int) (f4 * 255.0f));
                float f14 = this.F;
                canvas.drawRect(0.0f, f14 * f3, this.E, f14, this.f[1]);
                this.f[1].setAlpha(nm7.d4);
                canvas.restore();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(int i, View view) {
        kt8 kt8Var = this.c[i];
        if (view != 0 && !kt8Var.e) {
            Canvas canvas = kt8Var.a;
            canvas.save();
            canvas.scale(0.16666667f, 0.16666667f);
            canvas.translate(0.0f, this.r - view.getMeasuredHeight());
            view.draw(canvas);
            canvas.restore();
            kt8Var.f = true;
        }
        if (i == 0 || (this.y != 0 && i == 1)) {
            boolean z = view instanceof bla;
            bla[] blaVarArr = this.K;
            if (z) {
                blaVarArr[i] = (bla) view;
            } else {
                blaVarArr[i] = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(Canvas canvas, int i) {
        View E = this.h.E(this.x + i);
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
        boolean z = E instanceof bla;
        bla[] blaVarArr = this.K;
        if (!z) {
            blaVarArr[i] = null;
            return;
        }
        bla blaVar = (bla) E;
        blaVarArr[i] = blaVar;
        blaVar.d(this.w);
    }

    public final void h() {
        BlendMode blendMode;
        if (this.J == null) {
            float renderNodeScale = getRenderNodeScale();
            this.J = new RenderNode("profileBlurNode");
            float[] fArr = {0.0f, gm.N(56.0f) / this.r};
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

    public final void i(int i, int i2, int i3) {
        synchronized (this.b) {
            kt8[] kt8VarArr = this.c;
            kt8 kt8Var = kt8VarArr[i];
            kt8VarArr[i] = kt8VarArr[i2];
            kt8VarArr[i2] = kt8Var;
            kt8[] kt8VarArr2 = this.d;
            kt8 kt8Var2 = kt8VarArr2[i];
            kt8VarArr2[i] = kt8VarArr2[i2];
            kt8VarArr2[i2] = kt8Var2;
            if (i != 2) {
                Paint[] paintArr = this.f;
                Paint paint = paintArr[i];
                paintArr[i] = paintArr[i2];
                paintArr[i2] = paint;
            } else if (kt8Var2.f) {
                a(i2, kt8Var2.b);
            }
            if (i3 != -1) {
                this.f[i3].setShader(null);
                kt8 kt8Var3 = this.c[i3];
                if (kt8Var3 != null && !kt8Var3.e && !kt8Var3.d) {
                    kt8Var3.f = false;
                    kt8Var3.b.eraseColor(0);
                }
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        d(canvas, null, this.h.getMeasuredWidth(), this.h.getMeasuredHeight(), false, 0.0f, 1.0f);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), this.r + this.n);
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        super.setAlpha(f);
        if (f == 0.0f || !this.a) {
            return;
        }
        invalidate();
    }

    public void setSize(int i) {
        if (this.n != i) {
            invalidate();
        }
        this.n = i;
        this.r = (int) (gm.L(64.0f) * 1.5f);
    }

    public void setView(tr8 tr8Var) {
        c();
        this.h = tr8Var;
        this.x = tr8Var.getCurrentItem();
        this.y = 0;
        tr8Var.b(this.M);
    }
}
