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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ei0 extends View {
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public bi0 I;
    public ui0 J;
    public boolean K;
    public RenderNode L;
    public RenderNode M;
    public final sw0[] N;
    public final h6 O;
    public final di.w5 P;
    public boolean a;
    public final Object b;
    public final si0[] c;
    public final si0[] d;
    public volatile boolean e;
    public final Paint[] f;
    public ni0 h;
    public int n;
    public int r;
    public final di0 s;
    public final di0 v;
    public int w;
    public int x;
    public int y;

    public ei0(Context context) {
        super(context);
        int i10 = 1;
        int i11 = 0;
        this.a = Build.VERSION.SDK_INT >= 31;
        this.b = new Object();
        this.c = new si0[3];
        this.d = new si0[3];
        this.e = false;
        Paint[] paintArr = {new Paint(), new Paint()};
        this.f = paintArr;
        this.s = new di0(this, i11);
        this.v = new di0(this, i10);
        this.w = -1;
        this.F = false;
        this.G = false;
        this.H = false;
        this.N = new sw0[3];
        h6 h6Var = new h6(this, 0L, 350L, ds.f);
        this.O = h6Var;
        this.P = new di.w5(2, this);
        h6Var.d(1.0f, true);
        boolean z10 = this.a & SharedConfig.useNewBlur;
        this.a = z10;
        if (z10) {
            setLayerType(2, null);
        } else {
            setLayerType(1, paintArr[0]);
            setLayerType(1, paintArr[1]);
        }
    }

    public static void a(ei0 ei0Var, int i10, int i11, int i12) {
        synchronized (ei0Var.b) {
            try {
                si0[] si0VarArr = ei0Var.c;
                si0 si0Var = si0VarArr[i10];
                si0VarArr[i10] = si0VarArr[i11];
                si0VarArr[i11] = si0Var;
                si0[] si0VarArr2 = ei0Var.d;
                si0 si0Var2 = si0VarArr2[i10];
                si0VarArr2[i10] = si0VarArr2[i11];
                si0VarArr2[i11] = si0Var2;
                if (i10 != 2) {
                    Paint[] paintArr = ei0Var.f;
                    Paint paint = paintArr[i10];
                    paintArr[i10] = paintArr[i11];
                    paintArr[i11] = paint;
                } else if (si0Var2.f) {
                    ei0Var.b(si0Var2.b, i11);
                }
                if (i12 != -1) {
                    ei0Var.f[i12].setShader(null);
                    si0 si0Var3 = ei0Var.c[i12];
                    if (si0Var3 != null && !si0Var3.e && !si0Var3.d) {
                        si0Var3.f = false;
                        si0Var3.b.eraseColor(0);
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

    public final void c(float f7, org.telegram.ui.wz0 wz0Var, float f10, float f11) {
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
            bi0 bi0Var = this.I;
            if (bi0Var != null) {
                bi0Var.i();
            }
            ui0 ui0Var = this.J;
            if (ui0Var != null) {
                ui0Var.c();
                return;
            }
            return;
        }
        float renderNodeScale = getRenderNodeScale() * f10 * 8.0f;
        this.M.setPosition(0, 0, (int) Math.ceil(f7 / renderNodeScale), (int) Math.ceil((this.n + f11) / renderNodeScale));
        RecordingCanvas beginRecording = this.M.beginRecording();
        beginRecording.scale(0.125f, 0.125f);
        beginRecording.drawRenderNode(this.L);
        this.M.endRecording();
        this.M.setAlpha(this.O.d(1.0f, false));
        bi0 bi0Var2 = this.I;
        if (bi0Var2 != null) {
            if (wz0Var != null) {
                bi0Var2.w = this.M;
                bi0Var2.r = wz0Var;
                bi0Var2.s = renderNodeScale / f10;
                bi0Var2.v = -f11;
                bi0Var2.invalidate();
            } else {
                bi0Var2.w = this.M;
                bi0Var2.r = null;
                bi0Var2.s = renderNodeScale;
                bi0Var2.v = -f11;
                bi0Var2.invalidate();
            }
        }
        ui0 ui0Var2 = this.J;
        if (ui0Var2 != null) {
            if (wz0Var != null) {
                ui0Var2.d(this.M, wz0Var, renderNodeScale / f10, (-f11) + AndroidUtilities.dp(22.0f));
            } else {
                ui0Var2.d(this.M, null, renderNodeScale, (-f11) + AndroidUtilities.dp(22.0f));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        if (r8.getHeight() != r2) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d() {
        org.telegram.ui.cv0 cv0Var;
        sw0[] sw0VarArr;
        ni0 ni0Var = this.h;
        boolean z10 = false;
        if (ni0Var != null && ((cv0Var = ni0Var.h1) == null || !cv0Var.n)) {
            int measuredWidth = (int) (ni0Var.getMeasuredWidth() / 6.0f);
            int i10 = (int) (this.r / 6.0f);
            if (measuredWidth > 0 && i10 > 0) {
                this.y = measuredWidth;
                this.E = i10;
                boolean z11 = this.G;
                si0[] si0VarArr = this.c;
                int length = (!z11 || this.H) ? si0VarArr.length : 1;
                this.G = false;
                this.H = false;
                int i11 = 0;
                while (true) {
                    sw0VarArr = this.N;
                    if (i11 >= length) {
                        break;
                    }
                    sw0 sw0Var = sw0VarArr[i11];
                    if (sw0Var != null) {
                        sw0Var.e(null);
                    }
                    si0 si0Var = si0VarArr[i11];
                    if (si0Var != null) {
                        Bitmap bitmap = si0Var.b;
                        if (!si0Var.d) {
                            if (bitmap.getWidth() == measuredWidth) {
                            }
                        }
                    }
                    if (si0Var != null) {
                        si0Var.a();
                    }
                    si0 si0Var2 = new si0();
                    Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, i10, Bitmap.Config.ARGB_8888);
                    si0Var2.b = createBitmap;
                    si0Var2.a = new Canvas(createBitmap);
                    si0VarArr[i11] = si0Var2;
                    if (si0VarArr[i11].e) {
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
                di0 di0Var = this.v;
                if (length == 1) {
                    sw0 sw0Var2 = sw0VarArr[0];
                    if (sw0Var2 != null) {
                        sw0Var2.e(di0Var);
                    }
                    return !this.G;
                }
                View E2 = this.h.E(this.w + 1);
                h(1, E2);
                if (this.x == 0) {
                    h(2, this.h.E(this.w - 1));
                }
                for (sw0 sw0Var3 : sw0VarArr) {
                    if (sw0Var3 != null) {
                        sw0Var3.e(di0Var);
                    }
                }
                if ((E != null && sw0VarArr[0] == null) || (this.x != 0 && E2 != null && sw0VarArr[1] == null)) {
                    z10 = true;
                }
                this.F = z10;
                return true;
            }
        }
        return false;
    }

    public final void e() {
        ni0 ni0Var = this.h;
        if (ni0Var != null) {
            di.w5 w5Var = this.P;
            ArrayList arrayList = ni0Var.k0;
            if (arrayList != null) {
                arrayList.remove(w5Var);
            }
            this.h = null;
        }
        this.e = false;
        ti0.a.cancelRunnable(this.s);
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
                    si0 si0Var = this.c[i10];
                    if (si0Var != null) {
                        si0Var.a();
                        this.c[i10] = null;
                    }
                    si0 si0Var2 = this.d[i10];
                    if (si0Var2 != null) {
                        si0Var2.a();
                        this.d[i10] = null;
                    }
                    sw0 sw0Var = this.N[i10];
                    if (sw0Var != null) {
                        sw0Var.e(null);
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

    public final void f(Canvas canvas, org.telegram.ui.wz0 wz0Var, float f7, float f10, boolean z10, float f11, float f12) {
        float f13;
        char c10;
        float f14;
        Canvas canvas2 = canvas;
        ni0 ni0Var = this.h;
        if (ni0Var == null || !ni0Var.isAttachedToWindow() || this.h.getVisibility() == 8) {
            return;
        }
        if (!this.a || Build.VERSION.SDK_INT < 31) {
            f13 = 1.0f;
        } else {
            if (canvas2.isHardwareAccelerated()) {
                if (wz0Var != null || getVisibility() != 0 || getAlpha() <= 0.0f) {
                    if (wz0Var != null) {
                        float measuredWidth = f7 / this.h.getMeasuredWidth();
                        float f15 = this.r * (1.0f - f11);
                        float f16 = f15 * measuredWidth;
                        float renderNodeScale = getRenderNodeScale() * measuredWidth;
                        j();
                        this.L.setPosition(0, 0, (int) Math.ceil(f7 / renderNodeScale), (int) Math.ceil((this.n + f15) / renderNodeScale));
                        RecordingCanvas beginRecording = this.L.beginRecording();
                        float f17 = 1.0f / renderNodeScale;
                        beginRecording.scale(f17, f17);
                        t5 t5Var = wz0Var.e;
                        g(t5Var != null ? t5Var.k : wz0Var.a, beginRecording, f16, f10);
                        if (wz0Var.a0 && wz0Var.V > 0.0f) {
                            g(wz0Var.U, beginRecording, f16, f10);
                        }
                        this.L.endRecording();
                        this.L.setAlpha(f12);
                        canvas2.translate(0.0f, -f16);
                        canvas2.scale(renderNodeScale, renderNodeScale);
                        canvas2.drawRenderNode(this.L);
                        c(f7, wz0Var, measuredWidth, f15);
                        return;
                    }
                    return;
                }
                j();
                sw0[] sw0VarArr = this.N;
                sw0 sw0Var = sw0VarArr[0];
                if (sw0Var != null) {
                    sw0Var.e(null);
                }
                sw0 sw0Var2 = sw0VarArr[1];
                if (sw0Var2 != null) {
                    sw0Var2.e(null);
                }
                float renderNodeScale2 = getRenderNodeScale();
                this.L.setPosition(0, 0, (int) Math.ceil(f7 / renderNodeScale2), (int) Math.ceil((this.r + this.n) / renderNodeScale2));
                RecordingCanvas beginRecording2 = this.L.beginRecording();
                float f18 = 1.0f / renderNodeScale2;
                beginRecording2.scale(f18, f18);
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
            f13 = 1.0f;
            if (wz0Var != null || AndroidUtilities.makingGlobalBlurBitmap) {
                return;
            }
            this.a = false;
            setLayerType(1, this.f[0]);
            setLayerType(1, this.f[1]);
        }
        bi0 bi0Var = this.I;
        if (bi0Var != null) {
            bi0Var.i();
        }
        ui0 ui0Var = this.J;
        if (ui0Var != null) {
            ui0Var.c();
        }
        if (this.H || this.G || this.F || (this.f[0].getShader() == null && this.f[1].getShader() == null && !this.e)) {
            boolean d = d();
            if (!this.e && d) {
                this.e = true;
                DispatchQueue dispatchQueue = ti0.a;
                dispatchQueue.cancelRunnable(this.s);
                dispatchQueue.postRunnable(this.s);
            }
        }
        if (this.f[0].getShader() == null && this.f[1].getShader() == null) {
            return;
        }
        synchronized (this.b) {
            try {
                float f19 = f7 / this.y;
                if (z10) {
                    canvas2.translate(0.0f, (-f19) * this.E);
                }
                canvas2.scale(f19, f19);
                float f20 = this.n / f19;
                if (this.f[0].getShader() != null) {
                    canvas2.save();
                    canvas2.translate((-this.x) / f19, 0.0f);
                    canvas2.save();
                    canvas2.scale(f13, 2.0f, 0.0f, this.E);
                    float f21 = this.E;
                    c10 = 1;
                    f14 = 2.0f;
                    canvas2.drawRect(0.0f, f21, this.y, f21 + f20, this.f[0]);
                    canvas.restore();
                    this.f[0].setAlpha((int) (f12 * 255.0f));
                    float f22 = this.E;
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, f22 * f11, this.y, f22, this.f[0]);
                    this.f[0].setAlpha(255);
                    canvas2.restore();
                } else {
                    c10 = 1;
                    f14 = 2.0f;
                }
                if (this.x != 0 && this.f[c10].getShader() != null) {
                    canvas2.save();
                    canvas2.translate(((-this.x) + f7) / f19, 0.0f);
                    canvas2.save();
                    canvas2.scale(1.0f, f14, 0.0f, this.E);
                    float f23 = this.E;
                    canvas2.drawRect(0.0f, f23, this.y, f23 + f20, this.f[c10]);
                    canvas.restore();
                    this.f[c10].setAlpha((int) (f12 * 255.0f));
                    float f24 = this.E;
                    canvas.drawRect(0.0f, f24 * f11, this.y, f24, this.f[c10]);
                    this.f[c10].setAlpha(255);
                    canvas.restore();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(int i10, View view) {
        si0 si0Var = this.c[i10];
        if (view != 0 && !si0Var.e) {
            Canvas canvas = si0Var.a;
            canvas.save();
            canvas.scale(0.16666667f, 0.16666667f);
            canvas.translate(0.0f, this.r - view.getMeasuredHeight());
            view.draw(canvas);
            canvas.restore();
            si0Var.f = true;
        }
        if (i10 == 0 || (this.x != 0 && i10 == 1)) {
            boolean z10 = view instanceof sw0;
            sw0[] sw0VarArr = this.N;
            if (z10) {
                sw0VarArr[i10] = (sw0) view;
            } else {
                sw0VarArr[i10] = null;
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
        boolean z10 = E instanceof sw0;
        sw0[] sw0VarArr = this.N;
        if (!z10) {
            sw0VarArr[i10] = null;
            return;
        }
        sw0 sw0Var = (sw0) E;
        sw0VarArr[i10] = sw0Var;
        sw0Var.e(this.v);
    }

    public final void j() {
        BlendMode blendMode;
        if (this.L == null) {
            float renderNodeScale = getRenderNodeScale();
            this.L = new RenderNode("profileBlurNode");
            float[] fArr = {0.0f, AndroidUtilities.dpf2(56.0f) / this.r};
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.r / renderNodeScale, new int[]{0, -1}, fArr, tileMode);
            float blurRadius = getBlurRadius();
            RenderNode renderNode = this.L;
            RenderEffect createBlurEffect = RenderEffect.createBlurEffect(blurRadius, blurRadius, tileMode);
            RenderEffect createShaderEffect = RenderEffect.createShaderEffect(linearGradient);
            blendMode = BlendMode.DST_IN;
            renderNode.setRenderEffect(RenderEffect.createBlendModeEffect(createBlurEffect, createShaderEffect, blendMode));
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

    public void setActionsView(bi0 bi0Var) {
        this.I = bi0Var;
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        super.setAlpha(f7);
        if (f7 == 0.0f || !this.a) {
            return;
        }
        invalidate();
    }

    public void setMusicView(ui0 ui0Var) {
        this.J = ui0Var;
    }

    public void setSize(int i10) {
        if (this.n != i10) {
            invalidate();
        }
        this.n = i10;
        this.r = (int) (AndroidUtilities.dp(64.0f) * 1.5f);
    }

    public void setView(ni0 ni0Var) {
        e();
        this.h = ni0Var;
        this.w = ni0Var.getCurrentItem();
        this.x = 0;
        ni0Var.b(this.P);
    }

    public void setSuggestionView(vi0 vi0Var) {
    }
}
