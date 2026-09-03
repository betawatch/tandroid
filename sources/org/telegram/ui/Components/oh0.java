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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class oh0 extends View {
    public int B;
    public boolean C;
    public boolean D;
    public boolean E;
    public lh0 F;
    public ei0 G;
    public boolean H;
    public RenderNode I;
    public RenderNode J;
    public final mv0[] K;
    public final z5 L;
    public final oh.i5 M;
    public boolean a;
    public final Object b;
    public final ci0[] c;
    public final ci0[] d;
    public volatile boolean e;
    public final Paint[] f;
    public xh0 h;
    public int n;
    public int r;
    public final nh0 s;
    public final nh0 v;
    public int w;
    public int x;
    public int y;

    public oh0(Context context) {
        super(context);
        int i10 = 1;
        int i11 = 0;
        this.a = Build.VERSION.SDK_INT >= 31;
        this.b = new Object();
        this.c = new ci0[3];
        this.d = new ci0[3];
        this.e = false;
        Paint[] paintArr = {new Paint(), new Paint()};
        this.f = paintArr;
        this.s = new nh0(this, i11);
        this.v = new nh0(this, i10);
        this.w = -1;
        this.C = false;
        this.D = false;
        this.E = false;
        this.K = new mv0[3];
        z5 z5Var = new z5(this, 0L, 350L, pr.f);
        this.L = z5Var;
        this.M = new oh.i5(2, this);
        z5Var.d(1.0f, true);
        boolean z4 = this.a & SharedConfig.useNewBlur;
        this.a = z4;
        if (z4) {
            setLayerType(2, null);
        } else {
            setLayerType(1, paintArr[0]);
            setLayerType(1, paintArr[1]);
        }
    }

    public static void a(oh0 oh0Var, int i10, int i11, int i12) {
        synchronized (oh0Var.b) {
            try {
                ci0[] ci0VarArr = oh0Var.c;
                ci0 ci0Var = ci0VarArr[i10];
                ci0VarArr[i10] = ci0VarArr[i11];
                ci0VarArr[i11] = ci0Var;
                ci0[] ci0VarArr2 = oh0Var.d;
                ci0 ci0Var2 = ci0VarArr2[i10];
                ci0VarArr2[i10] = ci0VarArr2[i11];
                ci0VarArr2[i11] = ci0Var2;
                if (i10 != 2) {
                    Paint[] paintArr = oh0Var.f;
                    Paint paint = paintArr[i10];
                    paintArr[i10] = paintArr[i11];
                    paintArr[i11] = paint;
                } else if (ci0Var2.f) {
                    oh0Var.b(ci0Var2.b, i11);
                }
                if (i12 != -1) {
                    oh0Var.f[i12].setShader(null);
                    ci0 ci0Var3 = oh0Var.c[i12];
                    if (ci0Var3 != null && !ci0Var3.e && !ci0Var3.d) {
                        ci0Var3.f = false;
                        ci0Var3.b.eraseColor(0);
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

    public final void c(float f10, org.telegram.ui.a01 a01Var, float f11, float f12) {
        if (this.F == null && this.G == null) {
            this.H = false;
        } else {
            if (this.J == null) {
                this.J = new RenderNode("profileActionsBlurNode");
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.65f);
                AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.5f);
                this.J.setRenderEffect(RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix)));
            }
            this.H = true;
        }
        if (!this.H) {
            lh0 lh0Var = this.F;
            if (lh0Var != null) {
                lh0Var.i();
            }
            ei0 ei0Var = this.G;
            if (ei0Var != null) {
                ei0Var.b();
                return;
            }
            return;
        }
        float renderNodeScale = getRenderNodeScale() * f11 * 8.0f;
        this.J.setPosition(0, 0, (int) Math.ceil(f10 / renderNodeScale), (int) ((this.n + f12) / renderNodeScale));
        RecordingCanvas beginRecording = this.J.beginRecording();
        beginRecording.scale(0.125f, 0.125f);
        beginRecording.drawRenderNode(this.I);
        this.J.endRecording();
        this.J.setAlpha(this.L.d(1.0f, false));
        lh0 lh0Var2 = this.F;
        if (lh0Var2 != null) {
            if (a01Var != null) {
                lh0Var2.w = this.J;
                lh0Var2.r = a01Var;
                lh0Var2.s = renderNodeScale / f11;
                lh0Var2.v = -f12;
                lh0Var2.invalidate();
            } else {
                lh0Var2.w = this.J;
                lh0Var2.r = null;
                lh0Var2.s = renderNodeScale;
                lh0Var2.v = -f12;
                lh0Var2.invalidate();
            }
        }
        ei0 ei0Var2 = this.G;
        if (ei0Var2 != null) {
            if (a01Var == null) {
                ei0Var2.F = this.J;
                ei0Var2.G = renderNodeScale;
                ei0Var2.H = (-f12) + AndroidUtilities.dp(22.0f);
                ei0Var2.invalidate();
                return;
            }
            float f13 = renderNodeScale / f11;
            ei0Var2.F = this.J;
            ei0Var2.G = f13;
            ei0Var2.H = (-f12) + AndroidUtilities.dp(22.0f);
            ei0Var2.invalidate();
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
        mv0[] mv0VarArr;
        xh0 xh0Var = this.h;
        boolean z4 = false;
        if (xh0Var != null && ((cv0Var = xh0Var.e1) == null || !cv0Var.n)) {
            int measuredWidth = (int) (xh0Var.getMeasuredWidth() / 6.0f);
            int i10 = (int) (this.r / 6.0f);
            if (measuredWidth > 0 && i10 > 0) {
                this.y = measuredWidth;
                this.B = i10;
                boolean z10 = this.D;
                ci0[] ci0VarArr = this.c;
                int length = (!z10 || this.E) ? ci0VarArr.length : 1;
                this.D = false;
                this.E = false;
                int i11 = 0;
                while (true) {
                    mv0VarArr = this.K;
                    if (i11 >= length) {
                        break;
                    }
                    mv0 mv0Var = mv0VarArr[i11];
                    if (mv0Var != null) {
                        mv0Var.g(null);
                    }
                    ci0 ci0Var = ci0VarArr[i11];
                    if (ci0Var != null) {
                        Bitmap bitmap = ci0Var.b;
                        if (!ci0Var.d) {
                            if (bitmap.getWidth() == measuredWidth) {
                            }
                        }
                    }
                    if (ci0Var != null) {
                        ci0Var.a();
                    }
                    ci0 ci0Var2 = new ci0();
                    Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, i10, Bitmap.Config.ARGB_8888);
                    ci0Var2.b = createBitmap;
                    ci0Var2.a = new Canvas(createBitmap);
                    ci0VarArr[i11] = ci0Var2;
                    if (ci0VarArr[i11].e) {
                        if (length == 1) {
                            this.D = true;
                        } else {
                            this.E = true;
                        }
                    }
                    i11++;
                }
                View E = this.h.E(this.w);
                h(0, E);
                nh0 nh0Var = this.v;
                if (length == 1) {
                    mv0 mv0Var2 = mv0VarArr[0];
                    if (mv0Var2 != null) {
                        mv0Var2.g(nh0Var);
                    }
                    return !this.D;
                }
                View E2 = this.h.E(this.w + 1);
                h(1, E2);
                if (this.x == 0) {
                    h(2, this.h.E(this.w - 1));
                }
                for (mv0 mv0Var3 : mv0VarArr) {
                    if (mv0Var3 != null) {
                        mv0Var3.g(nh0Var);
                    }
                }
                if ((E != null && mv0VarArr[0] == null) || (this.x != 0 && E2 != null && mv0VarArr[1] == null)) {
                    z4 = true;
                }
                this.C = z4;
                return true;
            }
        }
        return false;
    }

    public final void e() {
        xh0 xh0Var = this.h;
        if (xh0Var != null) {
            oh.i5 i5Var = this.M;
            ArrayList arrayList = xh0Var.h0;
            if (arrayList != null) {
                arrayList.remove(i5Var);
            }
            this.h = null;
        }
        this.e = false;
        di0.a.cancelRunnable(this.s);
        if (Build.VERSION.SDK_INT >= 29) {
            RenderNode renderNode = this.I;
            if (renderNode != null) {
                renderNode.discardDisplayList();
                this.I = null;
            }
            RenderNode renderNode2 = this.J;
            if (renderNode2 != null) {
                renderNode2.discardDisplayList();
                this.J = null;
            }
        }
        this.F = null;
        this.G = null;
        synchronized (this.b) {
            for (int i10 = 0; i10 < 3; i10++) {
                try {
                    ci0 ci0Var = this.c[i10];
                    if (ci0Var != null) {
                        ci0Var.a();
                        this.c[i10] = null;
                    }
                    ci0 ci0Var2 = this.d[i10];
                    if (ci0Var2 != null) {
                        ci0Var2.a();
                        this.d[i10] = null;
                    }
                    mv0 mv0Var = this.K[i10];
                    if (mv0Var != null) {
                        mv0Var.g(null);
                        this.K[i10] = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f[0].setShader(null);
            this.f[1].setShader(null);
        }
    }

    public final void f(Canvas canvas, org.telegram.ui.a01 a01Var, float f10, float f11, boolean z4, float f12, float f13) {
        int i10;
        float f14;
        char c3;
        Canvas canvas2 = canvas;
        xh0 xh0Var = this.h;
        if (xh0Var == null || !xh0Var.isAttachedToWindow() || this.h.getVisibility() == 8) {
            return;
        }
        if (this.a && Build.VERSION.SDK_INT >= 31) {
            if (canvas2.isHardwareAccelerated()) {
                if (a01Var != null || getVisibility() != 0 || getAlpha() <= 0.0f) {
                    if (a01Var != null) {
                        float measuredWidth = f10 / this.h.getMeasuredWidth();
                        float f15 = this.r * (1.0f - f12);
                        float f16 = f15 * measuredWidth;
                        float renderNodeScale = getRenderNodeScale() * measuredWidth;
                        j();
                        this.I.setPosition(0, 0, (int) (f10 / renderNodeScale), (int) ((this.n + f15) / renderNodeScale));
                        RecordingCanvas beginRecording = this.I.beginRecording();
                        float f17 = 1.0f / renderNodeScale;
                        beginRecording.scale(f17, f17);
                        l5 l5Var = a01Var.e;
                        g(l5Var != null ? l5Var.k : a01Var.a, beginRecording, f16, f11);
                        if (a01Var.U && a01Var.S > 0.0f) {
                            g(a01Var.R, beginRecording, f16, f11);
                        }
                        this.I.endRecording();
                        this.I.setAlpha(f13);
                        canvas2.translate(0.0f, -f16);
                        canvas2.scale(renderNodeScale, renderNodeScale);
                        canvas2.drawRenderNode(this.I);
                        c(f10, a01Var, measuredWidth, f15);
                        return;
                    }
                    return;
                }
                j();
                mv0[] mv0VarArr = this.K;
                mv0 mv0Var = mv0VarArr[0];
                if (mv0Var != null) {
                    mv0Var.g(null);
                }
                mv0 mv0Var2 = mv0VarArr[1];
                if (mv0Var2 != null) {
                    mv0Var2.g(null);
                }
                float renderNodeScale2 = getRenderNodeScale();
                this.I.setPosition(0, 0, (int) (f10 / renderNodeScale2), (int) ((this.r + this.n) / renderNodeScale2));
                RecordingCanvas beginRecording2 = this.I.beginRecording();
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
                this.I.endRecording();
                this.I.setAlpha(this.L.d(1.0f, false));
                canvas2.save();
                canvas2.scale(renderNodeScale2, renderNodeScale2);
                canvas2.drawRenderNode(this.I);
                canvas2.restore();
                if (getVisibility() != 0 || getAlpha() <= 0.0f) {
                    return;
                }
                c(f10, null, 1.0f, this.r);
                return;
            }
            if (a01Var != null || AndroidUtilities.makingGlobalBlurBitmap) {
                return;
            }
            this.a = false;
            setLayerType(1, this.f[0]);
            setLayerType(1, this.f[1]);
        }
        lh0 lh0Var = this.F;
        if (lh0Var != null) {
            lh0Var.i();
        }
        ei0 ei0Var = this.G;
        if (ei0Var != null) {
            ei0Var.b();
        }
        if (this.E || this.D || this.C || (this.f[0].getShader() == null && this.f[1].getShader() == null && !this.e)) {
            boolean d = d();
            if (!this.e && d) {
                this.e = true;
                DispatchQueue dispatchQueue = di0.a;
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
                if (z4) {
                    canvas2.translate(0.0f, (-f19) * this.B);
                }
                canvas2.scale(f19, f19);
                float f20 = this.n / f19;
                if (this.f[0].getShader() != null) {
                    canvas2.save();
                    canvas2.translate((-this.x) / f19, 0.0f);
                    canvas2.save();
                    canvas2.scale(1.0f, 2.0f, 0.0f, this.B);
                    float f21 = this.B;
                    i10 = 255;
                    f14 = 2.0f;
                    c3 = 1;
                    canvas2.drawRect(0.0f, f21, this.y, f21 + f20, this.f[0]);
                    canvas.restore();
                    this.f[0].setAlpha((int) (f13 * 255.0f));
                    float f22 = this.B;
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, f22 * f12, this.y, f22, this.f[0]);
                    this.f[0].setAlpha(255);
                    canvas2.restore();
                } else {
                    i10 = 255;
                    f14 = 2.0f;
                    c3 = 1;
                }
                if (this.x != 0 && this.f[c3].getShader() != null) {
                    canvas2.save();
                    canvas2.translate(((-this.x) + f10) / f19, 0.0f);
                    canvas2.save();
                    canvas2.scale(1.0f, f14, 0.0f, this.B);
                    float f23 = this.B;
                    canvas2.drawRect(0.0f, f23, this.y, f23 + f20, this.f[c3]);
                    canvas.restore();
                    this.f[c3].setAlpha((int) (f13 * 255.0f));
                    float f24 = this.B;
                    canvas.drawRect(0.0f, f24 * f12, this.y, f24, this.f[c3]);
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
        ci0 ci0Var = this.c[i10];
        if (view != 0 && !ci0Var.e) {
            Canvas canvas = ci0Var.a;
            canvas.save();
            canvas.scale(0.16666667f, 0.16666667f);
            canvas.translate(0.0f, this.r - view.getMeasuredHeight());
            view.draw(canvas);
            canvas.restore();
            ci0Var.f = true;
        }
        if (i10 == 0 || (this.x != 0 && i10 == 1)) {
            boolean z4 = view instanceof mv0;
            mv0[] mv0VarArr = this.K;
            if (z4) {
                mv0VarArr[i10] = (mv0) view;
            } else {
                mv0VarArr[i10] = null;
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
        boolean z4 = E instanceof mv0;
        mv0[] mv0VarArr = this.K;
        if (!z4) {
            mv0VarArr[i10] = null;
            return;
        }
        mv0 mv0Var = (mv0) E;
        mv0VarArr[i10] = mv0Var;
        mv0Var.g(this.v);
    }

    public final void j() {
        if (this.I == null) {
            float renderNodeScale = getRenderNodeScale();
            this.I = new RenderNode("profileBlurNode");
            float[] fArr = {0.0f, AndroidUtilities.dpf2(56.0f) / this.r};
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.r / renderNodeScale, new int[]{0, -1}, fArr, tileMode);
            float blurRadius = getBlurRadius();
            this.I.setRenderEffect(RenderEffect.createBlendModeEffect(RenderEffect.createBlurEffect(blurRadius, blurRadius, tileMode), RenderEffect.createShaderEffect(linearGradient), BlendMode.DST_IN));
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

    public void setActionsView(lh0 lh0Var) {
        this.F = lh0Var;
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        if (f10 == 0.0f || !this.a) {
            return;
        }
        invalidate();
    }

    public void setMusicView(ei0 ei0Var) {
        this.G = ei0Var;
    }

    public void setSize(int i10) {
        if (this.n != i10) {
            invalidate();
        }
        this.n = i10;
        this.r = (int) (AndroidUtilities.dp(64.0f) * 1.5f);
    }

    public void setView(xh0 xh0Var) {
        e();
        this.h = xh0Var;
        this.w = xh0Var.getCurrentItem();
        this.x = 0;
        xh0Var.b(this.M);
    }

    public void setSuggestionView(fi0 fi0Var) {
    }
}
