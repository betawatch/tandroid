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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class kp8 extends View {
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public boolean I;
    public RenderNode J;
    public final zia[] K;
    public final lm L;
    public final lv M;
    public boolean a;
    public final Object b;
    public final hr8[] c;
    public final hr8[] d;
    public volatile boolean e;
    public final Paint[] f;
    public sp8 h;
    public int n;
    public int r;
    public final jp8 s;
    public final jp8 w;
    public int x;
    public int y;

    public kp8(Context context) {
        super(context);
        byte b = 1;
        byte b2 = 0;
        this.a = Build.VERSION.SDK_INT >= 31;
        this.b = new Object();
        this.c = new hr8[3];
        this.d = new hr8[3];
        this.e = false;
        Paint[] paintArr = {new Paint(), new Paint()};
        this.f = paintArr;
        this.s = new jp8(this, b2);
        this.w = new jp8(this, b);
        this.x = -1;
        this.G = false;
        this.H = false;
        this.I = false;
        this.K = new zia[3];
        lm lmVar = new lm(this, 0L, 350L, s33.f);
        this.L = lmVar;
        this.M = new lv(this, (byte) 3);
        lmVar.e(true, 1.0f);
        boolean z = this.a & gba.X;
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
        int o = gba.o();
        if (o != 1) {
            return o != 2 ? 8.0f : 20.0f;
        }
        return 12.0f;
    }

    private float getRenderNodeScale() {
        return gl.L(1.0f);
    }

    public final void a(int i, Bitmap bitmap) {
        if (i >= 2 || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.r / 6.0f, new int[]{0, -1}, new float[]{0.0f, gl.N(56.0f) / this.r}, Shader.TileMode.CLAMP);
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
        ma8 ma8Var;
        zia[] ziaVarArr;
        sp8 sp8Var = this.h;
        boolean z = false;
        if (sp8Var != null && ((ma8Var = sp8Var.i1) == null || !ma8Var.n)) {
            int measuredWidth = (int) (sp8Var.getMeasuredWidth() / 6.0f);
            int i = (int) (this.r / 6.0f);
            if (measuredWidth > 0 && i > 0) {
                this.E = measuredWidth;
                this.F = i;
                boolean z2 = this.H;
                hr8[] hr8VarArr = this.c;
                int length = (!z2 || this.I) ? hr8VarArr.length : 1;
                this.H = false;
                this.I = false;
                int i2 = 0;
                while (true) {
                    ziaVarArr = this.K;
                    if (i2 >= length) {
                        break;
                    }
                    zia ziaVar = ziaVarArr[i2];
                    if (ziaVar != null) {
                        ziaVar.d(null);
                    }
                    hr8 hr8Var = hr8VarArr[i2];
                    if (hr8Var != null) {
                        Bitmap bitmap = hr8Var.b;
                        if (!hr8Var.d) {
                            if (bitmap.getWidth() == measuredWidth) {
                            }
                        }
                    }
                    if (hr8Var != null) {
                        hr8Var.a();
                    }
                    hr8 hr8Var2 = new hr8();
                    Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, i, Bitmap.Config.ARGB_8888);
                    hr8Var2.b = createBitmap;
                    hr8Var2.a = new Canvas(createBitmap);
                    hr8VarArr[i2] = hr8Var2;
                    if (hr8VarArr[i2].e) {
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
                jp8 jp8Var = this.w;
                if (length == 1) {
                    zia ziaVar2 = ziaVarArr[0];
                    if (ziaVar2 != null) {
                        ziaVar2.d(jp8Var);
                    }
                    return !this.H;
                }
                View E2 = this.h.E(this.x + 1);
                f(1, E2);
                if (this.y == 0) {
                    f(2, this.h.E(this.x - 1));
                }
                for (zia ziaVar3 : ziaVarArr) {
                    if (ziaVar3 != null) {
                        ziaVar3.d(jp8Var);
                    }
                }
                if ((E != null && ziaVarArr[0] == null) || (this.y != 0 && E2 != null && ziaVarArr[1] == null)) {
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
        sp8 sp8Var = this.h;
        if (sp8Var != null) {
            lv lvVar = this.M;
            ArrayList arrayList = sp8Var.l0;
            if (arrayList != null) {
                arrayList.remove(lvVar);
            }
            this.h = null;
        }
        this.e = false;
        ir8.a.cancelRunnable(this.s);
        if (Build.VERSION.SDK_INT >= 29 && (renderNode = this.J) != null) {
            renderNode.discardDisplayList();
            this.J = null;
        }
        synchronized (this.b) {
            for (int i = 0; i < 3; i++) {
                hr8 hr8Var = this.c[i];
                if (hr8Var != null) {
                    hr8Var.a();
                    this.c[i] = null;
                }
                hr8 hr8Var2 = this.d[i];
                if (hr8Var2 != null) {
                    hr8Var2.a();
                    this.d[i] = null;
                }
                zia ziaVar = this.K[i];
                if (ziaVar != null) {
                    ziaVar.d(null);
                    this.K[i] = null;
                }
            }
            this.f[0].setShader(null);
            this.f[1].setShader(null);
        }
    }

    public final void d(Canvas canvas, wn8 wn8Var, float f, float f2, boolean z, float f3, float f4) {
        float f5;
        Canvas canvas2 = canvas;
        sp8 sp8Var = this.h;
        if (sp8Var == null || !sp8Var.isAttachedToWindow() || this.h.getVisibility() == 8) {
            return;
        }
        if (this.a && Build.VERSION.SDK_INT >= 31) {
            if (canvas2.isHardwareAccelerated()) {
                if (wn8Var != null || getVisibility() != 0 || getAlpha() <= 0.0f) {
                    if (wn8Var != null) {
                        float measuredWidth = f / this.h.getMeasuredWidth();
                        float f6 = this.r * (1.0f - f3) * measuredWidth;
                        float renderNodeScale = getRenderNodeScale() * measuredWidth;
                        h();
                        this.J.setPosition(0, 0, (int) Math.ceil(f / renderNodeScale), (int) Math.ceil((r6 + this.n) / renderNodeScale));
                        RecordingCanvas beginRecording = this.J.beginRecording();
                        float f7 = 1.0f / renderNodeScale;
                        beginRecording.scale(f7, f7);
                        vl vlVar = wn8Var.e;
                        e(vlVar != null ? vlVar.k : wn8Var.a, beginRecording, f6, f2);
                        if (wn8Var.b0 && wn8Var.W > 0.0f) {
                            e(wn8Var.V, beginRecording, f6, f2);
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
                zia[] ziaVarArr = this.K;
                zia ziaVar = ziaVarArr[0];
                if (ziaVar != null) {
                    ziaVar.d(null);
                }
                zia ziaVar2 = ziaVarArr[1];
                if (ziaVar2 != null) {
                    ziaVar2.d(null);
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
            if (wn8Var != null || gl.m0) {
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
                do3 do3Var = ir8.a;
                do3Var.cancelRunnable(this.s);
                do3Var.postRunnable(this.s);
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
                this.f[0].setAlpha(kk7.d4);
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
                this.f[1].setAlpha(kk7.d4);
                canvas.restore();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(int i, View view) {
        hr8 hr8Var = this.c[i];
        if (view != 0 && !hr8Var.e) {
            Canvas canvas = hr8Var.a;
            canvas.save();
            canvas.scale(0.16666667f, 0.16666667f);
            canvas.translate(0.0f, this.r - view.getMeasuredHeight());
            view.draw(canvas);
            canvas.restore();
            hr8Var.f = true;
        }
        if (i == 0 || (this.y != 0 && i == 1)) {
            boolean z = view instanceof zia;
            zia[] ziaVarArr = this.K;
            if (z) {
                ziaVarArr[i] = (zia) view;
            } else {
                ziaVarArr[i] = null;
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
        boolean z = E instanceof zia;
        zia[] ziaVarArr = this.K;
        if (!z) {
            ziaVarArr[i] = null;
            return;
        }
        zia ziaVar = (zia) E;
        ziaVarArr[i] = ziaVar;
        ziaVar.d(this.w);
    }

    public final void h() {
        BlendMode blendMode;
        if (this.J == null) {
            float renderNodeScale = getRenderNodeScale();
            this.J = new RenderNode("profileBlurNode");
            float[] fArr = {0.0f, gl.N(56.0f) / this.r};
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
            hr8[] hr8VarArr = this.c;
            hr8 hr8Var = hr8VarArr[i];
            hr8VarArr[i] = hr8VarArr[i2];
            hr8VarArr[i2] = hr8Var;
            hr8[] hr8VarArr2 = this.d;
            hr8 hr8Var2 = hr8VarArr2[i];
            hr8VarArr2[i] = hr8VarArr2[i2];
            hr8VarArr2[i2] = hr8Var2;
            if (i != 2) {
                Paint[] paintArr = this.f;
                Paint paint = paintArr[i];
                paintArr[i] = paintArr[i2];
                paintArr[i2] = paint;
            } else if (hr8Var2.f) {
                a(i2, hr8Var2.b);
            }
            if (i3 != -1) {
                this.f[i3].setShader(null);
                hr8 hr8Var3 = this.c[i3];
                if (hr8Var3 != null && !hr8Var3.e && !hr8Var3.d) {
                    hr8Var3.f = false;
                    hr8Var3.b.eraseColor(0);
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
        this.r = (int) (gl.L(64.0f) * 1.5f);
    }

    public void setView(sp8 sp8Var) {
        c();
        this.h = sp8Var;
        this.x = sp8Var.getCurrentItem();
        this.y = 0;
        sp8Var.b(this.M);
    }
}
