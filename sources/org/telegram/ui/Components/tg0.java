package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class tg0 extends View {
    public int A;
    public boolean B;
    public boolean C;
    public boolean D;
    public rg0 E;
    public jh0 F;
    public boolean G;
    public RenderNode H;
    public RenderNode I;
    public final wu0[] J;
    public final y5 K;
    public final jh.f5 L;
    public boolean a;
    public final Object b;
    public final hh0[] c;
    public final hh0[] d;
    public volatile boolean e;
    public final Paint[] f;
    public ch0 h;
    public int n;
    public int r;
    public final sg0 s;
    public final sg0 v;
    public int w;
    public int x;
    public int y;

    public tg0(Context context) {
        super(context);
        int i10 = 1;
        int i11 = 0;
        this.a = Build.VERSION.SDK_INT >= 31;
        this.b = new Object();
        this.c = new hh0[3];
        this.d = new hh0[3];
        this.e = false;
        Paint[] paintArr = {new Paint(), new Paint()};
        this.f = paintArr;
        this.s = new sg0(this, i11);
        this.v = new sg0(this, i10);
        this.w = -1;
        this.B = false;
        this.C = false;
        this.D = false;
        this.J = new wu0[3];
        y5 y5Var = new y5(this, 0L, 350L, er.f);
        this.K = y5Var;
        this.L = new jh.f5(2, this);
        y5Var.d(1.0f, true);
        boolean z10 = this.a & SharedConfig.useNewBlur;
        this.a = z10;
        if (z10) {
            setLayerType(2, null);
        } else {
            setLayerType(1, paintArr[0]);
            setLayerType(1, paintArr[1]);
        }
    }

    public static void a(tg0 tg0Var, int i10, int i11, int i12) {
        synchronized (tg0Var.b) {
            try {
                hh0[] hh0VarArr = tg0Var.c;
                hh0 hh0Var = hh0VarArr[i10];
                hh0VarArr[i10] = hh0VarArr[i11];
                hh0VarArr[i11] = hh0Var;
                hh0[] hh0VarArr2 = tg0Var.d;
                hh0 hh0Var2 = hh0VarArr2[i10];
                hh0VarArr2[i10] = hh0VarArr2[i11];
                hh0VarArr2[i11] = hh0Var2;
                if (i10 != 2) {
                    Paint[] paintArr = tg0Var.f;
                    Paint paint = paintArr[i10];
                    paintArr[i10] = paintArr[i11];
                    paintArr[i11] = paint;
                } else if (hh0Var2.f) {
                    tg0Var.b(hh0Var2.b, i11);
                }
                if (i12 != -1) {
                    tg0Var.f[i12].setShader(null);
                    hh0 hh0Var3 = tg0Var.c[i12];
                    if (hh0Var3 != null && !hh0Var3.e && !hh0Var3.d) {
                        hh0Var3.f = false;
                        hh0Var3.b.eraseColor(0);
                    }
                }
            } finally {
            }
        }
    }

    public static void g(ImageReceiver imageReceiver, Canvas canvas, float f10, float f11) {
        if (imageReceiver == null) {
            return;
        }
        int i10 = imageReceiver.getRoundRadius()[0];
        imageReceiver.setRoundRadius(0);
        canvas.save();
        canvas.translate(0.0f, f10 - f11);
        imageReceiver.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.scale(1.0f, -1.0f);
        canvas.translate(0.0f, (-f11) - f10);
        canvas.scale(1.0f, 2.0f, 0.0f, f11);
        imageReceiver.draw(canvas);
        canvas.restore();
        imageReceiver.setRoundRadius(i10);
    }

    private float getBlurRadius() {
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass != 1) {
            return devicePerformanceClass != 2 ? 8.0f : 20.0f;
        }
        return 12.0f;
    }

    private float getRenderNodeScale() {
        return AndroidUtilities.dp(1.0f);
    }

    public final void b(Bitmap bitmap, int i10) {
        if (i10 >= 2 || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.r / 6.0f, new int[]{0, -1}, new float[]{0.0f, AndroidUtilities.dpf2(56.0f) / this.r}, Shader.TileMode.CLAMP);
        Shader.TileMode tileMode = Shader.TileMode.MIRROR;
        this.f[i10].setShader(new ComposeShader(new BitmapShader(bitmap, tileMode, tileMode), linearGradient, PorterDuff.Mode.DST_IN));
    }

    public final void c(float f10, org.telegram.ui.iz0 iz0Var, float f11, float f12) {
        if (this.E == null && this.F == null) {
            this.G = false;
        } else {
            if (this.I == null) {
                this.I = new RenderNode("profileActionsBlurNode");
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.65f);
                AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.5f);
                this.I.setRenderEffect(RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix)));
            }
            this.G = true;
        }
        if (!this.G) {
            rg0 rg0Var = this.E;
            if (rg0Var != null) {
                rg0Var.i();
            }
            jh0 jh0Var = this.F;
            if (jh0Var != null) {
                jh0Var.b();
                return;
            }
            return;
        }
        float renderNodeScale = getRenderNodeScale() * f11 * 8.0f;
        this.I.setPosition(0, 0, (int) Math.ceil(f10 / renderNodeScale), (int) ((this.n + f12) / renderNodeScale));
        RecordingCanvas beginRecording = this.I.beginRecording();
        beginRecording.scale(0.125f, 0.125f);
        beginRecording.drawRenderNode(this.H);
        this.I.endRecording();
        this.I.setAlpha(this.K.d(1.0f, false));
        rg0 rg0Var2 = this.E;
        if (rg0Var2 != null) {
            if (iz0Var != null) {
                rg0Var2.w = this.I;
                rg0Var2.r = iz0Var;
                rg0Var2.s = renderNodeScale / f11;
                rg0Var2.v = -f12;
                rg0Var2.invalidate();
            } else {
                rg0Var2.w = this.I;
                rg0Var2.r = null;
                rg0Var2.s = renderNodeScale;
                rg0Var2.v = -f12;
                rg0Var2.invalidate();
            }
        }
        jh0 jh0Var2 = this.F;
        if (jh0Var2 != null) {
            if (iz0Var == null) {
                jh0Var2.E = this.I;
                jh0Var2.F = renderNodeScale;
                jh0Var2.G = (-f12) + AndroidUtilities.dp(22.0f);
                jh0Var2.invalidate();
                return;
            }
            float f13 = renderNodeScale / f11;
            jh0Var2.E = this.I;
            jh0Var2.F = f13;
            jh0Var2.G = (-f12) + AndroidUtilities.dp(22.0f);
            jh0Var2.invalidate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        if (r8.getHeight() != r2) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d() {
        org.telegram.ui.ou0 ou0Var;
        wu0[] wu0VarArr;
        ch0 ch0Var = this.h;
        boolean z10 = false;
        if (ch0Var != null && ((ou0Var = ch0Var.d1) == null || !ou0Var.n)) {
            int measuredWidth = (int) (ch0Var.getMeasuredWidth() / 6.0f);
            int i10 = (int) (this.r / 6.0f);
            if (measuredWidth > 0 && i10 > 0) {
                this.y = measuredWidth;
                this.A = i10;
                boolean z11 = this.C;
                hh0[] hh0VarArr = this.c;
                int length = (!z11 || this.D) ? hh0VarArr.length : 1;
                this.C = false;
                this.D = false;
                int i11 = 0;
                while (true) {
                    wu0VarArr = this.J;
                    if (i11 >= length) {
                        break;
                    }
                    wu0 wu0Var = wu0VarArr[i11];
                    if (wu0Var != null) {
                        wu0Var.g(null);
                    }
                    hh0 hh0Var = hh0VarArr[i11];
                    if (hh0Var != null) {
                        Bitmap bitmap = hh0Var.b;
                        if (!hh0Var.d) {
                            if (bitmap.getWidth() == measuredWidth) {
                            }
                        }
                    }
                    if (hh0Var != null) {
                        hh0Var.a();
                    }
                    hh0 hh0Var2 = new hh0();
                    Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, i10, Bitmap.Config.ARGB_8888);
                    hh0Var2.b = createBitmap;
                    hh0Var2.a = new Canvas(createBitmap);
                    hh0VarArr[i11] = hh0Var2;
                    if (hh0VarArr[i11].e) {
                        if (length == 1) {
                            this.C = true;
                        } else {
                            this.D = true;
                        }
                    }
                    i11++;
                }
                View E = this.h.E(this.w);
                h(0, E);
                sg0 sg0Var = this.v;
                if (length == 1) {
                    wu0 wu0Var2 = wu0VarArr[0];
                    if (wu0Var2 != null) {
                        wu0Var2.g(sg0Var);
                    }
                    return !this.C;
                }
                View E2 = this.h.E(this.w + 1);
                h(1, E2);
                if (this.x == 0) {
                    h(2, this.h.E(this.w - 1));
                }
                for (wu0 wu0Var3 : wu0VarArr) {
                    if (wu0Var3 != null) {
                        wu0Var3.g(sg0Var);
                    }
                }
                if ((E != null && wu0VarArr[0] == null) || (this.x != 0 && E2 != null && wu0VarArr[1] == null)) {
                    z10 = true;
                }
                this.B = z10;
                return true;
            }
        }
        return false;
    }

    public final void e() {
        ch0 ch0Var = this.h;
        if (ch0Var != null) {
            jh.f5 f5Var = this.L;
            ArrayList arrayList = ch0Var.g0;
            if (arrayList != null) {
                arrayList.remove(f5Var);
            }
            this.h = null;
        }
        this.e = false;
        ih0.a.cancelRunnable(this.s);
        if (Build.VERSION.SDK_INT >= 29) {
            RenderNode renderNode = this.H;
            if (renderNode != null) {
                renderNode.discardDisplayList();
                this.H = null;
            }
            RenderNode renderNode2 = this.I;
            if (renderNode2 != null) {
                renderNode2.discardDisplayList();
                this.I = null;
            }
        }
        this.E = null;
        this.F = null;
        synchronized (this.b) {
            for (int i10 = 0; i10 < 3; i10++) {
                try {
                    hh0 hh0Var = this.c[i10];
                    if (hh0Var != null) {
                        hh0Var.a();
                        this.c[i10] = null;
                    }
                    hh0 hh0Var2 = this.d[i10];
                    if (hh0Var2 != null) {
                        hh0Var2.a();
                        this.d[i10] = null;
                    }
                    wu0 wu0Var = this.J[i10];
                    if (wu0Var != null) {
                        wu0Var.g(null);
                        this.J[i10] = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f[0].setShader(null);
            this.f[1].setShader(null);
        }
    }

    public final void f(Canvas canvas, org.telegram.ui.iz0 iz0Var, float f10, float f11, boolean z10, float f12, float f13) {
        int i10;
        float f14;
        char c10;
        Canvas canvas2 = canvas;
        ch0 ch0Var = this.h;
        if (ch0Var == null || !ch0Var.isAttachedToWindow() || this.h.getVisibility() == 8) {
            return;
        }
        if (this.a && Build.VERSION.SDK_INT >= 31) {
            if (canvas2.isHardwareAccelerated()) {
                if (iz0Var != null || getVisibility() != 0 || getAlpha() <= 0.0f) {
                    if (iz0Var != null) {
                        float measuredWidth = f10 / this.h.getMeasuredWidth();
                        float f15 = this.r * (1.0f - f12);
                        float f16 = f15 * measuredWidth;
                        float renderNodeScale = getRenderNodeScale() * measuredWidth;
                        j();
                        this.H.setPosition(0, 0, (int) (f10 / renderNodeScale), (int) ((this.n + f15) / renderNodeScale));
                        RecordingCanvas beginRecording = this.H.beginRecording();
                        float f17 = 1.0f / renderNodeScale;
                        beginRecording.scale(f17, f17);
                        k5 k5Var = iz0Var.e;
                        g(k5Var != null ? k5Var.k : iz0Var.a, beginRecording, f16, f11);
                        if (iz0Var.T && iz0Var.R > 0.0f) {
                            g(iz0Var.Q, beginRecording, f16, f11);
                        }
                        this.H.endRecording();
                        this.H.setAlpha(f13);
                        canvas2.translate(0.0f, -f16);
                        canvas2.scale(renderNodeScale, renderNodeScale);
                        canvas2.drawRenderNode(this.H);
                        c(f10, iz0Var, measuredWidth, f15);
                        return;
                    }
                    return;
                }
                j();
                wu0[] wu0VarArr = this.J;
                wu0 wu0Var = wu0VarArr[0];
                if (wu0Var != null) {
                    wu0Var.g(null);
                }
                wu0 wu0Var2 = wu0VarArr[1];
                if (wu0Var2 != null) {
                    wu0Var2.g(null);
                }
                float renderNodeScale2 = getRenderNodeScale();
                this.H.setPosition(0, 0, (int) (f10 / renderNodeScale2), (int) ((this.r + this.n) / renderNodeScale2));
                RecordingCanvas beginRecording2 = this.H.beginRecording();
                float f18 = 1.0f / renderNodeScale2;
                beginRecording2.scale(f18, f18);
                beginRecording2.save();
                beginRecording2.translate(-this.x, 0.0f);
                i(beginRecording2, 0);
                beginRecording2.restore();
                if (this.x != 0) {
                    beginRecording2.save();
                    beginRecording2.translate((-this.x) + f10, 0.0f);
                    i(beginRecording2, 1);
                    beginRecording2.restore();
                }
                this.H.endRecording();
                this.H.setAlpha(this.K.d(1.0f, false));
                canvas2.save();
                canvas2.scale(renderNodeScale2, renderNodeScale2);
                canvas2.drawRenderNode(this.H);
                canvas2.restore();
                if (getVisibility() != 0 || getAlpha() <= 0.0f) {
                    return;
                }
                c(f10, null, 1.0f, this.r);
                return;
            }
            if (iz0Var != null || AndroidUtilities.makingGlobalBlurBitmap) {
                return;
            }
            this.a = false;
            setLayerType(1, this.f[0]);
            setLayerType(1, this.f[1]);
        }
        rg0 rg0Var = this.E;
        if (rg0Var != null) {
            rg0Var.i();
        }
        jh0 jh0Var = this.F;
        if (jh0Var != null) {
            jh0Var.b();
        }
        if (this.D || this.C || this.B || (this.f[0].getShader() == null && this.f[1].getShader() == null && !this.e)) {
            boolean d = d();
            if (!this.e && d) {
                this.e = true;
                DispatchQueue dispatchQueue = ih0.a;
                dispatchQueue.cancelRunnable(this.s);
                dispatchQueue.postRunnable(this.s);
            }
        }
        if (this.f[0].getShader() == null && this.f[1].getShader() == null) {
            return;
        }
        synchronized (this.b) {
            try {
                float f19 = f10 / this.y;
                if (z10) {
                    canvas2.translate(0.0f, (-f19) * this.A);
                }
                canvas2.scale(f19, f19);
                float f20 = this.n / f19;
                if (this.f[0].getShader() != null) {
                    canvas2.save();
                    canvas2.translate((-this.x) / f19, 0.0f);
                    canvas2.save();
                    canvas2.scale(1.0f, 2.0f, 0.0f, this.A);
                    float f21 = this.A;
                    i10 = 255;
                    f14 = 2.0f;
                    c10 = 1;
                    canvas2.drawRect(0.0f, f21, this.y, f21 + f20, this.f[0]);
                    canvas.restore();
                    this.f[0].setAlpha((int) (f13 * 255.0f));
                    float f22 = this.A;
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, f22 * f12, this.y, f22, this.f[0]);
                    this.f[0].setAlpha(255);
                    canvas2.restore();
                } else {
                    i10 = 255;
                    f14 = 2.0f;
                    c10 = 1;
                }
                if (this.x != 0 && this.f[c10].getShader() != null) {
                    canvas2.save();
                    canvas2.translate(((-this.x) + f10) / f19, 0.0f);
                    canvas2.save();
                    canvas2.scale(1.0f, f14, 0.0f, this.A);
                    float f23 = this.A;
                    canvas2.drawRect(0.0f, f23, this.y, f23 + f20, this.f[c10]);
                    canvas.restore();
                    this.f[c10].setAlpha((int) (f13 * 255.0f));
                    float f24 = this.A;
                    canvas.drawRect(0.0f, f24 * f12, this.y, f24, this.f[c10]);
                    this.f[c10].setAlpha(i10);
                    canvas.restore();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(int i10, View view) {
        hh0 hh0Var = this.c[i10];
        if (view != 0 && !hh0Var.e) {
            Canvas canvas = hh0Var.a;
            canvas.save();
            canvas.scale(0.16666667f, 0.16666667f);
            canvas.translate(0.0f, this.r - view.getMeasuredHeight());
            view.draw(canvas);
            canvas.restore();
            hh0Var.f = true;
        }
        if (i10 == 0 || (this.x != 0 && i10 == 1)) {
            boolean z10 = view instanceof wu0;
            wu0[] wu0VarArr = this.J;
            if (z10) {
                wu0VarArr[i10] = (wu0) view;
            } else {
                wu0VarArr[i10] = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(Canvas canvas, int i10) {
        View E = this.h.E(this.w + i10);
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
        boolean z10 = E instanceof wu0;
        wu0[] wu0VarArr = this.J;
        if (!z10) {
            wu0VarArr[i10] = null;
            return;
        }
        wu0 wu0Var = (wu0) E;
        wu0VarArr[i10] = wu0Var;
        wu0Var.g(this.v);
    }

    public final void j() {
        if (this.H == null) {
            float renderNodeScale = getRenderNodeScale();
            this.H = new RenderNode("profileBlurNode");
            float[] fArr = {0.0f, AndroidUtilities.dpf2(56.0f) / this.r};
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.r / renderNodeScale, new int[]{0, -1}, fArr, tileMode);
            float blurRadius = getBlurRadius();
            this.H.setRenderEffect(RenderEffect.createBlendModeEffect(RenderEffect.createBlurEffect(blurRadius, blurRadius, tileMode), RenderEffect.createShaderEffect(linearGradient), BlendMode.DST_IN));
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        f(canvas, null, this.h.getMeasuredWidth(), this.h.getMeasuredHeight(), false, 0.0f, 1.0f);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), this.r + this.n);
    }

    public void setActionsView(rg0 rg0Var) {
        this.E = rg0Var;
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        if (f10 == 0.0f || !this.a) {
            return;
        }
        invalidate();
    }

    public void setMusicView(jh0 jh0Var) {
        this.F = jh0Var;
    }

    public void setSize(int i10) {
        if (this.n != i10) {
            invalidate();
        }
        this.n = i10;
        this.r = (int) (AndroidUtilities.dp(64.0f) * 1.5f);
    }

    public void setView(ch0 ch0Var) {
        e();
        this.h = ch0Var;
        this.w = ch0Var.getCurrentItem();
        this.x = 0;
        ch0Var.b(this.L);
    }

    public void setSuggestionView(kh0 kh0Var) {
    }
}
