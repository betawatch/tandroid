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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class bh0 extends View {
    public int A;
    public boolean B;
    public boolean C;
    public boolean D;
    public zg0 E;
    public rh0 F;
    public boolean G;
    public RenderNode H;
    public RenderNode I;
    public final ev0[] J;
    public final d6 K;
    public final lh.g5 L;
    public boolean a;
    public final Object b;
    public final ph0[] c;
    public final ph0[] d;
    public volatile boolean e;
    public final Paint[] f;
    public kh0 h;
    public int n;
    public int r;
    public final ah0 s;
    public final ah0 v;
    public int w;
    public int x;
    public int y;

    public bh0(Context context) {
        super(context);
        int i10 = 1;
        int i11 = 0;
        this.a = Build.VERSION.SDK_INT >= 31;
        this.b = new Object();
        this.c = new ph0[3];
        this.d = new ph0[3];
        this.e = false;
        Paint[] paintArr = {new Paint(), new Paint()};
        this.f = paintArr;
        this.s = new ah0(this, i11);
        this.v = new ah0(this, i10);
        this.w = -1;
        this.B = false;
        this.C = false;
        this.D = false;
        this.J = new ev0[3];
        d6 d6Var = new d6(this, 0L, 350L, jr.f);
        this.K = d6Var;
        this.L = new lh.g5(2, this);
        d6Var.d(1.0f, true);
        boolean z10 = this.a & SharedConfig.useNewBlur;
        this.a = z10;
        if (z10) {
            setLayerType(2, null);
        } else {
            setLayerType(1, paintArr[0]);
            setLayerType(1, paintArr[1]);
        }
    }

    public static void a(bh0 bh0Var, int i10, int i11, int i12) {
        synchronized (bh0Var.b) {
            try {
                ph0[] ph0VarArr = bh0Var.c;
                ph0 ph0Var = ph0VarArr[i10];
                ph0VarArr[i10] = ph0VarArr[i11];
                ph0VarArr[i11] = ph0Var;
                ph0[] ph0VarArr2 = bh0Var.d;
                ph0 ph0Var2 = ph0VarArr2[i10];
                ph0VarArr2[i10] = ph0VarArr2[i11];
                ph0VarArr2[i11] = ph0Var2;
                if (i10 != 2) {
                    Paint[] paintArr = bh0Var.f;
                    Paint paint = paintArr[i10];
                    paintArr[i10] = paintArr[i11];
                    paintArr[i11] = paint;
                } else if (ph0Var2.f) {
                    bh0Var.b(ph0Var2.b, i11);
                }
                if (i12 != -1) {
                    bh0Var.f[i12].setShader(null);
                    ph0 ph0Var3 = bh0Var.c[i12];
                    if (ph0Var3 != null && !ph0Var3.e && !ph0Var3.d) {
                        ph0Var3.f = false;
                        ph0Var3.b.eraseColor(0);
                    }
                }
            } finally {
            }
        }
    }

    public static void g(ImageReceiver imageReceiver, Canvas canvas, float f9, float f10) {
        if (imageReceiver == null) {
            return;
        }
        int i10 = imageReceiver.getRoundRadius()[0];
        imageReceiver.setRoundRadius(0);
        canvas.save();
        canvas.translate(0.0f, f9 - f10);
        imageReceiver.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.scale(1.0f, -1.0f);
        canvas.translate(0.0f, (-f10) - f9);
        canvas.scale(1.0f, 2.0f, 0.0f, f10);
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

    public final void c(float f9, org.telegram.ui.iz0 iz0Var, float f10, float f11) {
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
            zg0 zg0Var = this.E;
            if (zg0Var != null) {
                zg0Var.i();
            }
            rh0 rh0Var = this.F;
            if (rh0Var != null) {
                rh0Var.b();
                return;
            }
            return;
        }
        float renderNodeScale = getRenderNodeScale() * f10 * 8.0f;
        this.I.setPosition(0, 0, (int) Math.ceil(f9 / renderNodeScale), (int) ((this.n + f11) / renderNodeScale));
        RecordingCanvas beginRecording = this.I.beginRecording();
        beginRecording.scale(0.125f, 0.125f);
        beginRecording.drawRenderNode(this.H);
        this.I.endRecording();
        this.I.setAlpha(this.K.d(1.0f, false));
        zg0 zg0Var2 = this.E;
        if (zg0Var2 != null) {
            if (iz0Var != null) {
                zg0Var2.w = this.I;
                zg0Var2.r = iz0Var;
                zg0Var2.s = renderNodeScale / f10;
                zg0Var2.v = -f11;
                zg0Var2.invalidate();
            } else {
                zg0Var2.w = this.I;
                zg0Var2.r = null;
                zg0Var2.s = renderNodeScale;
                zg0Var2.v = -f11;
                zg0Var2.invalidate();
            }
        }
        rh0 rh0Var2 = this.F;
        if (rh0Var2 != null) {
            if (iz0Var == null) {
                rh0Var2.E = this.I;
                rh0Var2.F = renderNodeScale;
                rh0Var2.G = (-f11) + AndroidUtilities.dp(22.0f);
                rh0Var2.invalidate();
                return;
            }
            float f12 = renderNodeScale / f10;
            rh0Var2.E = this.I;
            rh0Var2.F = f12;
            rh0Var2.G = (-f11) + AndroidUtilities.dp(22.0f);
            rh0Var2.invalidate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        if (r8.getHeight() != r2) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d() {
        org.telegram.ui.lu0 lu0Var;
        ev0[] ev0VarArr;
        kh0 kh0Var = this.h;
        boolean z10 = false;
        if (kh0Var != null && ((lu0Var = kh0Var.d1) == null || !lu0Var.n)) {
            int measuredWidth = (int) (kh0Var.getMeasuredWidth() / 6.0f);
            int i10 = (int) (this.r / 6.0f);
            if (measuredWidth > 0 && i10 > 0) {
                this.y = measuredWidth;
                this.A = i10;
                boolean z11 = this.C;
                ph0[] ph0VarArr = this.c;
                int length = (!z11 || this.D) ? ph0VarArr.length : 1;
                this.C = false;
                this.D = false;
                int i11 = 0;
                while (true) {
                    ev0VarArr = this.J;
                    if (i11 >= length) {
                        break;
                    }
                    ev0 ev0Var = ev0VarArr[i11];
                    if (ev0Var != null) {
                        ev0Var.g(null);
                    }
                    ph0 ph0Var = ph0VarArr[i11];
                    if (ph0Var != null) {
                        Bitmap bitmap = ph0Var.b;
                        if (!ph0Var.d) {
                            if (bitmap.getWidth() == measuredWidth) {
                            }
                        }
                    }
                    if (ph0Var != null) {
                        ph0Var.a();
                    }
                    ph0 ph0Var2 = new ph0();
                    Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, i10, Bitmap.Config.ARGB_8888);
                    ph0Var2.b = createBitmap;
                    ph0Var2.a = new Canvas(createBitmap);
                    ph0VarArr[i11] = ph0Var2;
                    if (ph0VarArr[i11].e) {
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
                ah0 ah0Var = this.v;
                if (length == 1) {
                    ev0 ev0Var2 = ev0VarArr[0];
                    if (ev0Var2 != null) {
                        ev0Var2.g(ah0Var);
                    }
                    return !this.C;
                }
                View E2 = this.h.E(this.w + 1);
                h(1, E2);
                if (this.x == 0) {
                    h(2, this.h.E(this.w - 1));
                }
                for (ev0 ev0Var3 : ev0VarArr) {
                    if (ev0Var3 != null) {
                        ev0Var3.g(ah0Var);
                    }
                }
                if ((E != null && ev0VarArr[0] == null) || (this.x != 0 && E2 != null && ev0VarArr[1] == null)) {
                    z10 = true;
                }
                this.B = z10;
                return true;
            }
        }
        return false;
    }

    public final void e() {
        kh0 kh0Var = this.h;
        if (kh0Var != null) {
            lh.g5 g5Var = this.L;
            ArrayList arrayList = kh0Var.g0;
            if (arrayList != null) {
                arrayList.remove(g5Var);
            }
            this.h = null;
        }
        this.e = false;
        qh0.a.cancelRunnable(this.s);
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
                    ph0 ph0Var = this.c[i10];
                    if (ph0Var != null) {
                        ph0Var.a();
                        this.c[i10] = null;
                    }
                    ph0 ph0Var2 = this.d[i10];
                    if (ph0Var2 != null) {
                        ph0Var2.a();
                        this.d[i10] = null;
                    }
                    ev0 ev0Var = this.J[i10];
                    if (ev0Var != null) {
                        ev0Var.g(null);
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

    public final void f(Canvas canvas, org.telegram.ui.iz0 iz0Var, float f9, float f10, boolean z10, float f11, float f12) {
        int i10;
        float f13;
        char c3;
        Canvas canvas2 = canvas;
        kh0 kh0Var = this.h;
        if (kh0Var == null || !kh0Var.isAttachedToWindow() || this.h.getVisibility() == 8) {
            return;
        }
        if (this.a && Build.VERSION.SDK_INT >= 31) {
            if (canvas2.isHardwareAccelerated()) {
                if (iz0Var != null || getVisibility() != 0 || getAlpha() <= 0.0f) {
                    if (iz0Var != null) {
                        float measuredWidth = f9 / this.h.getMeasuredWidth();
                        float f14 = this.r * (1.0f - f11);
                        float f15 = f14 * measuredWidth;
                        float renderNodeScale = getRenderNodeScale() * measuredWidth;
                        j();
                        this.H.setPosition(0, 0, (int) (f9 / renderNodeScale), (int) ((this.n + f14) / renderNodeScale));
                        RecordingCanvas beginRecording = this.H.beginRecording();
                        float f16 = 1.0f / renderNodeScale;
                        beginRecording.scale(f16, f16);
                        p5 p5Var = iz0Var.e;
                        g(p5Var != null ? p5Var.k : iz0Var.a, beginRecording, f15, f10);
                        if (iz0Var.T && iz0Var.R > 0.0f) {
                            g(iz0Var.Q, beginRecording, f15, f10);
                        }
                        this.H.endRecording();
                        this.H.setAlpha(f12);
                        canvas2.translate(0.0f, -f15);
                        canvas2.scale(renderNodeScale, renderNodeScale);
                        canvas2.drawRenderNode(this.H);
                        c(f9, iz0Var, measuredWidth, f14);
                        return;
                    }
                    return;
                }
                j();
                ev0[] ev0VarArr = this.J;
                ev0 ev0Var = ev0VarArr[0];
                if (ev0Var != null) {
                    ev0Var.g(null);
                }
                ev0 ev0Var2 = ev0VarArr[1];
                if (ev0Var2 != null) {
                    ev0Var2.g(null);
                }
                float renderNodeScale2 = getRenderNodeScale();
                this.H.setPosition(0, 0, (int) (f9 / renderNodeScale2), (int) ((this.r + this.n) / renderNodeScale2));
                RecordingCanvas beginRecording2 = this.H.beginRecording();
                float f17 = 1.0f / renderNodeScale2;
                beginRecording2.scale(f17, f17);
                beginRecording2.save();
                beginRecording2.translate(-this.x, 0.0f);
                i(beginRecording2, 0);
                beginRecording2.restore();
                if (this.x != 0) {
                    beginRecording2.save();
                    beginRecording2.translate((-this.x) + f9, 0.0f);
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
                c(f9, null, 1.0f, this.r);
                return;
            }
            if (iz0Var != null || AndroidUtilities.makingGlobalBlurBitmap) {
                return;
            }
            this.a = false;
            setLayerType(1, this.f[0]);
            setLayerType(1, this.f[1]);
        }
        zg0 zg0Var = this.E;
        if (zg0Var != null) {
            zg0Var.i();
        }
        rh0 rh0Var = this.F;
        if (rh0Var != null) {
            rh0Var.b();
        }
        if (this.D || this.C || this.B || (this.f[0].getShader() == null && this.f[1].getShader() == null && !this.e)) {
            boolean d = d();
            if (!this.e && d) {
                this.e = true;
                DispatchQueue dispatchQueue = qh0.a;
                dispatchQueue.cancelRunnable(this.s);
                dispatchQueue.postRunnable(this.s);
            }
        }
        if (this.f[0].getShader() == null && this.f[1].getShader() == null) {
            return;
        }
        synchronized (this.b) {
            try {
                float f18 = f9 / this.y;
                if (z10) {
                    canvas2.translate(0.0f, (-f18) * this.A);
                }
                canvas2.scale(f18, f18);
                float f19 = this.n / f18;
                if (this.f[0].getShader() != null) {
                    canvas2.save();
                    canvas2.translate((-this.x) / f18, 0.0f);
                    canvas2.save();
                    canvas2.scale(1.0f, 2.0f, 0.0f, this.A);
                    float f20 = this.A;
                    i10 = 255;
                    f13 = 2.0f;
                    c3 = 1;
                    canvas2.drawRect(0.0f, f20, this.y, f20 + f19, this.f[0]);
                    canvas.restore();
                    this.f[0].setAlpha((int) (f12 * 255.0f));
                    float f21 = this.A;
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, f21 * f11, this.y, f21, this.f[0]);
                    this.f[0].setAlpha(255);
                    canvas2.restore();
                } else {
                    i10 = 255;
                    f13 = 2.0f;
                    c3 = 1;
                }
                if (this.x != 0 && this.f[c3].getShader() != null) {
                    canvas2.save();
                    canvas2.translate(((-this.x) + f9) / f18, 0.0f);
                    canvas2.save();
                    canvas2.scale(1.0f, f13, 0.0f, this.A);
                    float f22 = this.A;
                    canvas2.drawRect(0.0f, f22, this.y, f22 + f19, this.f[c3]);
                    canvas.restore();
                    this.f[c3].setAlpha((int) (f12 * 255.0f));
                    float f23 = this.A;
                    canvas.drawRect(0.0f, f23 * f11, this.y, f23, this.f[c3]);
                    this.f[c3].setAlpha(i10);
                    canvas.restore();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(int i10, View view) {
        ph0 ph0Var = this.c[i10];
        if (view != 0 && !ph0Var.e) {
            Canvas canvas = ph0Var.a;
            canvas.save();
            canvas.scale(0.16666667f, 0.16666667f);
            canvas.translate(0.0f, this.r - view.getMeasuredHeight());
            view.draw(canvas);
            canvas.restore();
            ph0Var.f = true;
        }
        if (i10 == 0 || (this.x != 0 && i10 == 1)) {
            boolean z10 = view instanceof ev0;
            ev0[] ev0VarArr = this.J;
            if (z10) {
                ev0VarArr[i10] = (ev0) view;
            } else {
                ev0VarArr[i10] = null;
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
        boolean z10 = E instanceof ev0;
        ev0[] ev0VarArr = this.J;
        if (!z10) {
            ev0VarArr[i10] = null;
            return;
        }
        ev0 ev0Var = (ev0) E;
        ev0VarArr[i10] = ev0Var;
        ev0Var.g(this.v);
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

    public void setActionsView(zg0 zg0Var) {
        this.E = zg0Var;
    }

    @Override // android.view.View
    public void setAlpha(float f9) {
        super.setAlpha(f9);
        if (f9 == 0.0f || !this.a) {
            return;
        }
        invalidate();
    }

    public void setMusicView(rh0 rh0Var) {
        this.F = rh0Var;
    }

    public void setSize(int i10) {
        if (this.n != i10) {
            invalidate();
        }
        this.n = i10;
        this.r = (int) (AndroidUtilities.dp(64.0f) * 1.5f);
    }

    public void setView(kh0 kh0Var) {
        e();
        this.h = kh0Var;
        this.w = kh0Var.getCurrentItem();
        this.x = 0;
        kh0Var.b(this.L);
    }

    public void setSuggestionView(sh0 sh0Var) {
    }
}
