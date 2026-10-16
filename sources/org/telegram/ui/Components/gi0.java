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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class gi0 extends View {
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public ei0 I;
    public wi0 J;
    public boolean K;
    public RenderNode L;
    public RenderNode M;
    public final lw0[] N;
    public final g6 O;
    public final bi.z6 P;
    public boolean a;
    public final Object b;
    public final ui0[] c;
    public final ui0[] d;
    public volatile boolean e;
    public final Paint[] f;
    public pi0 h;
    public int n;
    public int r;
    public final fi0 s;
    public final fi0 v;
    public int w;
    public int x;
    public int y;

    public gi0(Context context) {
        super(context);
        int i10 = 1;
        int i11 = 0;
        this.a = Build.VERSION.SDK_INT >= 31;
        this.b = new Object();
        this.c = new ui0[3];
        this.d = new ui0[3];
        this.e = false;
        Paint[] paintArr = {new Paint(), new Paint()};
        this.f = paintArr;
        this.s = new fi0(this, i11);
        this.v = new fi0(this, i10);
        this.w = -1;
        this.F = false;
        this.G = false;
        this.H = false;
        this.N = new lw0[3];
        g6 g6Var = new g6(this, 0L, 350L, es.f);
        this.O = g6Var;
        this.P = new bi.z6(this, 3);
        g6Var.d(1.0f, true);
        boolean z10 = this.a & SharedConfig.useNewBlur;
        this.a = z10;
        if (z10) {
            setLayerType(2, null);
        } else {
            setLayerType(1, paintArr[0]);
            setLayerType(1, paintArr[1]);
        }
    }

    public static void a(gi0 gi0Var, int i10, int i11, int i12) {
        synchronized (gi0Var.b) {
            try {
                ui0[] ui0VarArr = gi0Var.c;
                ui0 ui0Var = ui0VarArr[i10];
                ui0VarArr[i10] = ui0VarArr[i11];
                ui0VarArr[i11] = ui0Var;
                ui0[] ui0VarArr2 = gi0Var.d;
                ui0 ui0Var2 = ui0VarArr2[i10];
                ui0VarArr2[i10] = ui0VarArr2[i11];
                ui0VarArr2[i11] = ui0Var2;
                if (i10 != 2) {
                    Paint[] paintArr = gi0Var.f;
                    Paint paint = paintArr[i10];
                    paintArr[i10] = paintArr[i11];
                    paintArr[i11] = paint;
                } else if (ui0Var2.f) {
                    gi0Var.b(ui0Var2.b, i11);
                }
                if (i12 != -1) {
                    gi0Var.f[i12].setShader(null);
                    ui0 ui0Var3 = gi0Var.c[i12];
                    if (ui0Var3 != null && !ui0Var3.e && !ui0Var3.d) {
                        ui0Var3.f = false;
                        ui0Var3.b.eraseColor(0);
                    }
                }
            } finally {
            }
        }
    }

    public static void g(ImageReceiver imageReceiver, Canvas canvas, float f7, float f10) {
        if (imageReceiver == null) {
            return;
        }
        int i10 = imageReceiver.getRoundRadius()[0];
        imageReceiver.setRoundRadius(0);
        canvas.save();
        canvas.translate(0.0f, f7 - f10);
        imageReceiver.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.scale(1.0f, -1.0f);
        canvas.translate(0.0f, (-f10) - f7);
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

    public final void c(float f7, org.telegram.ui.r01 r01Var, float f10, float f11) {
        if (this.I == null && this.J == null) {
            this.K = false;
        } else {
            if (this.M == null) {
                this.M = new RenderNode("profileActionsBlurNode");
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.65f);
                AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.5f);
                this.M.setRenderEffect(RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix)));
            }
            this.K = true;
        }
        if (!this.K) {
            ei0 ei0Var = this.I;
            if (ei0Var != null) {
                ei0Var.i();
            }
            wi0 wi0Var = this.J;
            if (wi0Var != null) {
                wi0Var.b();
                return;
            }
            return;
        }
        float renderNodeScale = getRenderNodeScale() * f10 * 8.0f;
        this.M.setPosition(0, 0, (int) Math.ceil(f7 / renderNodeScale), (int) ((this.n + f11) / renderNodeScale));
        RecordingCanvas beginRecording = this.M.beginRecording();
        beginRecording.scale(0.125f, 0.125f);
        beginRecording.drawRenderNode(this.L);
        this.M.endRecording();
        this.M.setAlpha(this.O.d(1.0f, false));
        ei0 ei0Var2 = this.I;
        if (ei0Var2 != null) {
            if (r01Var != null) {
                ei0Var2.w = this.M;
                ei0Var2.r = r01Var;
                ei0Var2.s = renderNodeScale / f10;
                ei0Var2.v = -f11;
                ei0Var2.invalidate();
            } else {
                ei0Var2.w = this.M;
                ei0Var2.r = null;
                ei0Var2.s = renderNodeScale;
                ei0Var2.v = -f11;
                ei0Var2.invalidate();
            }
        }
        wi0 wi0Var2 = this.J;
        if (wi0Var2 != null) {
            if (r01Var == null) {
                wi0Var2.I = this.M;
                wi0Var2.J = renderNodeScale;
                wi0Var2.K = (-f11) + AndroidUtilities.dp(22.0f);
                wi0Var2.invalidate();
                return;
            }
            float f12 = renderNodeScale / f10;
            wi0Var2.I = this.M;
            wi0Var2.J = f12;
            wi0Var2.K = (-f11) + AndroidUtilities.dp(22.0f);
            wi0Var2.invalidate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        if (r8.getHeight() != r2) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d() {
        org.telegram.ui.vv0 vv0Var;
        lw0[] lw0VarArr;
        pi0 pi0Var = this.h;
        boolean z10 = false;
        if (pi0Var != null && ((vv0Var = pi0Var.h1) == null || !vv0Var.n)) {
            int measuredWidth = (int) (pi0Var.getMeasuredWidth() / 6.0f);
            int i10 = (int) (this.r / 6.0f);
            if (measuredWidth > 0 && i10 > 0) {
                this.y = measuredWidth;
                this.E = i10;
                boolean z11 = this.G;
                ui0[] ui0VarArr = this.c;
                int length = (!z11 || this.H) ? ui0VarArr.length : 1;
                this.G = false;
                this.H = false;
                int i11 = 0;
                while (true) {
                    lw0VarArr = this.N;
                    if (i11 >= length) {
                        break;
                    }
                    lw0 lw0Var = lw0VarArr[i11];
                    if (lw0Var != null) {
                        lw0Var.g(null);
                    }
                    ui0 ui0Var = ui0VarArr[i11];
                    if (ui0Var != null) {
                        Bitmap bitmap = ui0Var.b;
                        if (!ui0Var.d) {
                            if (bitmap.getWidth() == measuredWidth) {
                            }
                        }
                    }
                    if (ui0Var != null) {
                        ui0Var.a();
                    }
                    ui0 ui0Var2 = new ui0();
                    Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, i10, Bitmap.Config.ARGB_8888);
                    ui0Var2.b = createBitmap;
                    ui0Var2.a = new Canvas(createBitmap);
                    ui0VarArr[i11] = ui0Var2;
                    if (ui0VarArr[i11].e) {
                        if (length == 1) {
                            this.G = true;
                        } else {
                            this.H = true;
                        }
                    }
                    i11++;
                }
                View E = this.h.E(this.w);
                h(0, E);
                fi0 fi0Var = this.v;
                if (length == 1) {
                    lw0 lw0Var2 = lw0VarArr[0];
                    if (lw0Var2 != null) {
                        lw0Var2.g(fi0Var);
                    }
                    return !this.G;
                }
                View E2 = this.h.E(this.w + 1);
                h(1, E2);
                if (this.x == 0) {
                    h(2, this.h.E(this.w - 1));
                }
                for (lw0 lw0Var3 : lw0VarArr) {
                    if (lw0Var3 != null) {
                        lw0Var3.g(fi0Var);
                    }
                }
                if ((E != null && lw0VarArr[0] == null) || (this.x != 0 && E2 != null && lw0VarArr[1] == null)) {
                    z10 = true;
                }
                this.F = z10;
                return true;
            }
        }
        return false;
    }

    public final void e() {
        pi0 pi0Var = this.h;
        if (pi0Var != null) {
            bi.z6 z6Var = this.P;
            ArrayList arrayList = pi0Var.k0;
            if (arrayList != null) {
                arrayList.remove(z6Var);
            }
            this.h = null;
        }
        this.e = false;
        vi0.a.cancelRunnable(this.s);
        if (Build.VERSION.SDK_INT >= 29) {
            RenderNode renderNode = this.L;
            if (renderNode != null) {
                renderNode.discardDisplayList();
                this.L = null;
            }
            RenderNode renderNode2 = this.M;
            if (renderNode2 != null) {
                renderNode2.discardDisplayList();
                this.M = null;
            }
        }
        this.I = null;
        this.J = null;
        synchronized (this.b) {
            for (int i10 = 0; i10 < 3; i10++) {
                try {
                    ui0 ui0Var = this.c[i10];
                    if (ui0Var != null) {
                        ui0Var.a();
                        this.c[i10] = null;
                    }
                    ui0 ui0Var2 = this.d[i10];
                    if (ui0Var2 != null) {
                        ui0Var2.a();
                        this.d[i10] = null;
                    }
                    lw0 lw0Var = this.N[i10];
                    if (lw0Var != null) {
                        lw0Var.g(null);
                        this.N[i10] = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f[0].setShader(null);
            this.f[1].setShader(null);
        }
    }

    public final void f(Canvas canvas, org.telegram.ui.r01 r01Var, float f7, float f10, boolean z10, float f11, float f12) {
        float f13;
        char c10;
        int i10;
        Canvas canvas2 = canvas;
        pi0 pi0Var = this.h;
        if (pi0Var == null || !pi0Var.isAttachedToWindow() || this.h.getVisibility() == 8) {
            return;
        }
        if (this.a && Build.VERSION.SDK_INT >= 31) {
            if (canvas2.isHardwareAccelerated()) {
                if (r01Var != null || getVisibility() != 0 || getAlpha() <= 0.0f) {
                    if (r01Var != null) {
                        float measuredWidth = f7 / this.h.getMeasuredWidth();
                        float f14 = this.r * (1.0f - f11);
                        float f15 = f14 * measuredWidth;
                        float renderNodeScale = getRenderNodeScale() * measuredWidth;
                        j();
                        this.L.setPosition(0, 0, (int) (f7 / renderNodeScale), (int) ((this.n + f14) / renderNodeScale));
                        RecordingCanvas beginRecording = this.L.beginRecording();
                        float f16 = 1.0f / renderNodeScale;
                        beginRecording.scale(f16, f16);
                        s5 s5Var = r01Var.e;
                        g(s5Var != null ? s5Var.k : r01Var.a, beginRecording, f15, f10);
                        if (r01Var.a0 && r01Var.V > 0.0f) {
                            g(r01Var.U, beginRecording, f15, f10);
                        }
                        this.L.endRecording();
                        this.L.setAlpha(f12);
                        canvas2.translate(0.0f, -f15);
                        canvas2.scale(renderNodeScale, renderNodeScale);
                        canvas2.drawRenderNode(this.L);
                        c(f7, r01Var, measuredWidth, f14);
                        return;
                    }
                    return;
                }
                j();
                lw0[] lw0VarArr = this.N;
                lw0 lw0Var = lw0VarArr[0];
                if (lw0Var != null) {
                    lw0Var.g(null);
                }
                lw0 lw0Var2 = lw0VarArr[1];
                if (lw0Var2 != null) {
                    lw0Var2.g(null);
                }
                float renderNodeScale2 = getRenderNodeScale();
                this.L.setPosition(0, 0, (int) (f7 / renderNodeScale2), (int) ((this.r + this.n) / renderNodeScale2));
                RecordingCanvas beginRecording2 = this.L.beginRecording();
                float f17 = 1.0f / renderNodeScale2;
                beginRecording2.scale(f17, f17);
                beginRecording2.save();
                beginRecording2.translate(-this.x, 0.0f);
                i(beginRecording2, 0);
                beginRecording2.restore();
                if (this.x != 0) {
                    beginRecording2.save();
                    beginRecording2.translate((-this.x) + f7, 0.0f);
                    i(beginRecording2, 1);
                    beginRecording2.restore();
                }
                this.L.endRecording();
                this.L.setAlpha(this.O.d(1.0f, false));
                canvas2.save();
                canvas2.scale(renderNodeScale2, renderNodeScale2);
                canvas2.drawRenderNode(this.L);
                canvas2.restore();
                if (getVisibility() != 0 || getAlpha() <= 0.0f) {
                    return;
                }
                c(f7, null, 1.0f, this.r);
                return;
            }
            if (r01Var != null || AndroidUtilities.makingGlobalBlurBitmap) {
                return;
            }
            this.a = false;
            setLayerType(1, this.f[0]);
            setLayerType(1, this.f[1]);
        }
        ei0 ei0Var = this.I;
        if (ei0Var != null) {
            ei0Var.i();
        }
        wi0 wi0Var = this.J;
        if (wi0Var != null) {
            wi0Var.b();
        }
        if (this.H || this.G || this.F || (this.f[0].getShader() == null && this.f[1].getShader() == null && !this.e)) {
            boolean d = d();
            if (!this.e && d) {
                this.e = true;
                DispatchQueue dispatchQueue = vi0.a;
                dispatchQueue.cancelRunnable(this.s);
                dispatchQueue.postRunnable(this.s);
            }
        }
        if (this.f[0].getShader() == null && this.f[1].getShader() == null) {
            return;
        }
        synchronized (this.b) {
            try {
                float f18 = f7 / this.y;
                if (z10) {
                    canvas2.translate(0.0f, (-f18) * this.E);
                }
                canvas2.scale(f18, f18);
                float f19 = this.n / f18;
                if (this.f[0].getShader() != null) {
                    canvas2.save();
                    canvas2.translate((-this.x) / f18, 0.0f);
                    canvas2.save();
                    canvas2.scale(1.0f, 2.0f, 0.0f, this.E);
                    float f20 = this.E;
                    f13 = 2.0f;
                    c10 = 1;
                    i10 = 255;
                    canvas2.drawRect(0.0f, f20, this.y, f20 + f19, this.f[0]);
                    canvas.restore();
                    this.f[0].setAlpha((int) (f12 * 255.0f));
                    float f21 = this.E;
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, f21 * f11, this.y, f21, this.f[0]);
                    this.f[0].setAlpha(255);
                    canvas2.restore();
                } else {
                    f13 = 2.0f;
                    c10 = 1;
                    i10 = 255;
                }
                if (this.x != 0 && this.f[c10].getShader() != null) {
                    canvas2.save();
                    canvas2.translate(((-this.x) + f7) / f18, 0.0f);
                    canvas2.save();
                    canvas2.scale(1.0f, f13, 0.0f, this.E);
                    float f22 = this.E;
                    canvas2.drawRect(0.0f, f22, this.y, f22 + f19, this.f[c10]);
                    canvas.restore();
                    this.f[c10].setAlpha((int) (f12 * 255.0f));
                    float f23 = this.E;
                    canvas.drawRect(0.0f, f23 * f11, this.y, f23, this.f[c10]);
                    this.f[c10].setAlpha(i10);
                    canvas.restore();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(int i10, View view) {
        ui0 ui0Var = this.c[i10];
        if (view != 0 && !ui0Var.e) {
            Canvas canvas = ui0Var.a;
            canvas.save();
            canvas.scale(0.16666667f, 0.16666667f);
            canvas.translate(0.0f, this.r - view.getMeasuredHeight());
            view.draw(canvas);
            canvas.restore();
            ui0Var.f = true;
        }
        if (i10 == 0 || (this.x != 0 && i10 == 1)) {
            boolean z10 = view instanceof lw0;
            lw0[] lw0VarArr = this.N;
            if (z10) {
                lw0VarArr[i10] = (lw0) view;
            } else {
                lw0VarArr[i10] = null;
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
        boolean z10 = E instanceof lw0;
        lw0[] lw0VarArr = this.N;
        if (!z10) {
            lw0VarArr[i10] = null;
            return;
        }
        lw0 lw0Var = (lw0) E;
        lw0VarArr[i10] = lw0Var;
        lw0Var.g(this.v);
    }

    public final void j() {
        if (this.L == null) {
            float renderNodeScale = getRenderNodeScale();
            this.L = new RenderNode("profileBlurNode");
            float[] fArr = {0.0f, AndroidUtilities.dpf2(56.0f) / this.r};
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.r / renderNodeScale, new int[]{0, -1}, fArr, tileMode);
            float blurRadius = getBlurRadius();
            this.L.setRenderEffect(RenderEffect.createBlendModeEffect(RenderEffect.createBlurEffect(blurRadius, blurRadius, tileMode), RenderEffect.createShaderEffect(linearGradient), BlendMode.DST_IN));
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

    public void setActionsView(ei0 ei0Var) {
        this.I = ei0Var;
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        super.setAlpha(f7);
        if (f7 == 0.0f || !this.a) {
            return;
        }
        invalidate();
    }

    public void setMusicView(wi0 wi0Var) {
        this.J = wi0Var;
    }

    public void setSize(int i10) {
        if (this.n != i10) {
            invalidate();
        }
        this.n = i10;
        this.r = (int) (AndroidUtilities.dp(64.0f) * 1.5f);
    }

    public void setView(pi0 pi0Var) {
        e();
        this.h = pi0Var;
        this.w = pi0Var.getCurrentItem();
        this.x = 0;
        pi0Var.b(this.P);
    }

    public void setSuggestionView(xi0 xi0Var) {
    }
}
