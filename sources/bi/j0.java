package bi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.wr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public abstract class j0 extends FrameLayout implements v70 {
    public static final /* synthetic */ int x0 = 0;
    public final LinearGradient E;
    public final Matrix F;
    public final org.telegram.ui.Components.ia G;
    public final e0 H;
    public final org.telegram.ui.Components.d6 I;
    public final org.telegram.ui.Components.d6[] J;
    public final org.telegram.ui.Components.d6 K;
    public final float[] L;
    public final float[] M;
    public Object N;
    public Object O;
    public final RectF P;
    public final Path Q;
    public Drawable R;
    public boolean S;
    public Runnable T;
    public boolean U;
    public float V;
    public float W;
    public final FrameLayout a;
    public float a0;
    public final zh.b b;
    public float b0;
    public final h8 c;
    public float c0;
    public CameraView d;
    public float d0;
    public Object e;
    public boolean e0;
    public x f;
    public boolean f0;
    public i0 g0;
    public final ArrayList h;
    public i0 h0;
    public e0 i0;
    public i0 j0;
    public boolean k0;
    public Runnable l0;
    public Runnable m0;
    public final ArrayList n;
    public boolean n0;
    public long o0;
    public boolean p0;
    public boolean q0;
    public i0 r;
    public me r0;
    public i0 s;
    public e8 s0;
    public boolean t0;
    public long u0;
    public final Paint v;
    public boolean v0;
    public final Path w;
    public final e0 w0;
    public final float[] x;
    public final int y;

    public j0(Context context, org.telegram.ui.Components.ia iaVar, FrameLayout frameLayout, zh.b bVar) {
        super(context);
        this.c = new h8(new e0(this, 1));
        this.f = new x(".");
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        this.n = new ArrayList();
        Paint paint = new Paint(1);
        this.v = paint;
        this.w = new Path();
        this.x = new float[8];
        this.H = new e0(this, 2);
        wr wrVar = wr.h;
        this.I = new org.telegram.ui.Components.d6(this, 0L, 320L, wrVar);
        this.J = new org.telegram.ui.Components.d6[]{new org.telegram.ui.Components.d6(this, 0L, 320L, wrVar), new org.telegram.ui.Components.d6(this, 0L, 320L, wrVar), new org.telegram.ui.Components.d6(this, 0L, 320L, wrVar), new org.telegram.ui.Components.d6(this, 0L, 320L, wrVar), new org.telegram.ui.Components.d6(this, 0L, 320L, wrVar)};
        this.K = new org.telegram.ui.Components.d6(this, 0L, 320L, wrVar);
        this.L = new float[5];
        this.M = new float[5];
        this.P = new RectF();
        this.Q = new Path();
        this.S = true;
        this.q0 = true;
        this.t0 = true;
        this.w0 = new e0(this, 3);
        this.G = iaVar;
        this.a = frameLayout;
        this.b = bVar;
        setBackgroundColor(-14737633);
        i0 i0Var = new i0(this);
        i0Var.b((w) this.f.e.get(0), false);
        i0Var.m = true;
        if (this.k0) {
            i0Var.c.onAttachedToWindow();
        }
        arrayList.add(i0Var);
        this.r = i0Var;
        this.s = null;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setStrokeWidth(AndroidUtilities.dp(8.0f));
        int dp = AndroidUtilities.dp(300.0f);
        this.y = dp;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{0, -1, -1, 0}, new float[]{0.0f, 0.2f, 0.8f, 1.0f}, Shader.TileMode.CLAMP);
        this.E = linearGradient;
        this.F = new Matrix();
        paint.setShader(linearGradient);
        setWillNotDraw(false);
    }

    public static void b(j0 j0Var, RectF rectF, w wVar) {
        int measuredWidth = j0Var.getMeasuredWidth();
        int measuredHeight = j0Var.getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            Point point = AndroidUtilities.displaySize;
            int i10 = point.x;
            measuredHeight = point.y;
            measuredWidth = i10;
        }
        j0Var.k(rectF, wVar);
        float f7 = rectF.left;
        boolean z10 = f7 <= 0.0f;
        float f10 = rectF.top;
        boolean z11 = f10 <= 0.0f;
        float f11 = measuredWidth;
        boolean z12 = rectF.right >= f11;
        float f12 = measuredHeight;
        boolean z13 = rectF.bottom >= f12;
        if (z10 && z12 && !z11 && !z13) {
            rectF.offset(0.0f, f12 - f10);
            return;
        }
        if (z11 && z13 && !z10 && !z12) {
            rectF.offset(0.0f, f11 - f7);
            return;
        }
        if (z12 && !z10) {
            rectF.offset(rectF.width(), 0.0f);
        }
        if (!z13 || z11) {
            return;
        }
        rectF.offset(0.0f, rectF.height());
    }

    public static void f(Canvas canvas, Drawable drawable, RectF rectF, float f7) {
        if (drawable == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float max = Math.max(rectF.width() / intrinsicWidth, rectF.height() / intrinsicHeight);
        canvas.save();
        canvas.translate(rectF.centerX(), rectF.centerY());
        canvas.clipRect((-rectF.width()) / 2.0f, (-rectF.height()) / 2.0f, rectF.width() / 2.0f, rectF.height() / 2.0f);
        canvas.scale(max, max);
        canvas.translate((-intrinsicWidth) / 2.0f, (-intrinsicHeight) / 2.0f);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        if (f7 > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.j6.l1(drawable.getAlpha() * f7, -16777216));
        }
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.v70
    public final void a(RectF rectF) {
        i0 i0Var = this.j0;
        if (i0Var == null) {
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            return;
        }
        w wVar = i0Var.h;
        x xVar = wVar.a;
        int i10 = wVar.b;
        int i11 = wVar.c;
        float f7 = xVar.c;
        float d = this.J[i11].d(xVar.d[i11], false);
        rectF.set((getMeasuredWidth() / d) * i10, (getMeasuredHeight() / f7) * i11, (getMeasuredWidth() / d) * (i10 + 1), (getMeasuredHeight() / f7) * (i11 + 1));
    }

    @Override // org.telegram.ui.Components.v70
    public final void c(Canvas canvas, float f7) {
        i0 i0Var = this.j0;
        if (i0Var != null) {
            w wVar = i0Var.h;
            x xVar = wVar.a;
            int i10 = wVar.b;
            int i11 = wVar.c;
            float f10 = xVar.c;
            float d = this.J[i11].d(xVar.d[i11], false);
            float measuredWidth = (getMeasuredWidth() / d) * i10;
            float measuredHeight = (getMeasuredHeight() / f10) * i11;
            float measuredWidth2 = (getMeasuredWidth() / d) * (i10 + 1);
            float measuredHeight2 = (getMeasuredHeight() / f10) * (i11 + 1);
            RectF rectF = this.P;
            rectF.set(measuredWidth, measuredHeight, measuredWidth2, measuredHeight2);
            g(canvas, rectF, this.j0);
        }
    }

    public final boolean d() {
        if (this.g0 == null) {
            return false;
        }
        this.g0 = null;
        this.e0 = false;
        invalidate();
        e0 e0Var = this.i0;
        if (e0Var == null) {
            return true;
        }
        AndroidUtilities.cancelRunOnUIThread(e0Var);
        this.i0 = null;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0305  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        double d;
        float[] fArr;
        float[] fArr2;
        ArrayList arrayList;
        float f7;
        RectF rectF;
        float f10;
        int i10;
        org.telegram.ui.Components.ia iaVar;
        i0 i0Var;
        int i11;
        if (this.N == null || Build.VERSION.SDK_INT < 29 || !canvas.isHardwareAccelerated()) {
            canvas2 = canvas;
        } else {
            RenderNode c10 = org.telegram.messenger.b.c(this.N);
            c10.setPosition(0, 0, getWidth(), getHeight());
            canvas2 = c10.beginRecording();
        }
        super.dispatchDraw(canvas2);
        boolean j3 = j();
        org.telegram.ui.Components.d6 d6Var = this.I;
        org.telegram.ui.Components.d6[] d6VarArr = this.J;
        if (!j3 && !this.f0 && !this.e0) {
            float f11 = d6Var.c;
            x xVar = this.f;
            if (f11 == xVar.c && d6VarArr[0].c == xVar.d[0]) {
                h8 h8Var = this.c;
                if (!h8Var.a && ((org.telegram.ui.Components.d6) h8Var.d).c <= 0.0f) {
                    setCameraNeedsBlur(false);
                    i(canvas);
                    return;
                }
            }
        }
        if (this.n0) {
            setCameraNeedsBlur(false);
        }
        canvas2.drawColor(-14737633);
        float e = this.K.e(this.e0);
        float d10 = d6Var.d(this.f.c, false);
        int i12 = 0;
        while (true) {
            double d11 = i12;
            d = d10;
            double ceil = Math.ceil(d);
            fArr = this.M;
            fArr2 = this.L;
            if (d11 >= ceil) {
                break;
            }
            fArr2[i12] = getMeasuredWidth();
            fArr[i12] = 0.0f;
            i12++;
        }
        for (int i13 = this.f.c; i13 < d6VarArr.length; i13++) {
            d6VarArr[i13].d(1.0f, false);
        }
        int i14 = 0;
        float f12 = 0.0f;
        boolean z10 = false;
        while (true) {
            arrayList = this.h;
            int size = arrayList.size();
            f7 = 0.0f;
            rectF = this.P;
            if (i14 >= size) {
                break;
            }
            i0 i0Var2 = (i0) arrayList.get(i14);
            w wVar = i0Var2.h;
            int i15 = wVar.c;
            float f13 = e;
            int i16 = wVar.b;
            float f14 = d10;
            org.telegram.ui.Components.d6[] d6VarArr2 = d6VarArr;
            float d12 = d6VarArr[i15].d(wVar.a.d[i15], false);
            if (this.f0 || this.e0) {
                i11 = i15;
                AndroidUtilities.lerp(i0Var2.j, i0Var2.k, i0Var2.l, rectF);
            } else {
                i11 = i15;
                rectF.set((getMeasuredWidth() / d12) * i16, (getMeasuredHeight() / f14) * i15, (getMeasuredWidth() / d12) * (i16 + 1), (getMeasuredHeight() / f14) * (i11 + 1));
            }
            fArr2[i11] = Math.min(fArr2[i11], rectF.left);
            fArr[i11] = Math.max(fArr[i11], rectF.right);
            f12 = Math.max(f12, rectF.bottom);
            if (f13 <= 0.0f || i0Var2 != this.h0) {
                if (this.n0 && i0Var2.d != null) {
                    z10 = true;
                }
                g(canvas2, rectF, i0Var2);
            }
            i14++;
            e = f13;
            d10 = f14;
            d6VarArr = d6VarArr2;
        }
        float f15 = e;
        float f16 = d10;
        org.telegram.ui.Components.d6[] d6VarArr3 = d6VarArr;
        int i17 = 0;
        while (true) {
            ArrayList arrayList2 = this.n;
            if (i17 >= arrayList2.size()) {
                break;
            }
            i0 i0Var3 = (i0) arrayList2.get(i17);
            w wVar2 = i0Var3.h;
            int i18 = wVar2.c;
            int i19 = wVar2.b;
            int i20 = i17;
            float d13 = d6VarArr3[i18].d(i18 >= this.f.d.length ? 1.0f : r9[i18], false);
            rectF.set((getMeasuredWidth() / d13) * i19, (getMeasuredHeight() / f16) * i18, (getMeasuredWidth() / d13) * (i19 + 1), (i18 + 1) * (getMeasuredHeight() / f16));
            fArr2[i18] = Math.min(fArr2[i18], rectF.left);
            fArr[i18] = Math.max(fArr[i18], rectF.right);
            f12 = Math.max(f12, rectF.bottom);
            if (this.n0 && i0Var3.d != null) {
                z10 = true;
            }
            g(canvas2, rectF, i0Var3);
            i17 = i20 + 1;
        }
        if (!this.e0) {
            int i21 = 0;
            while (i21 < Math.ceil(d)) {
                if (fArr2[i21] >= f7) {
                    rectF.set(0.0f, (getMeasuredHeight() / f16) * i21, fArr2[i21], (getMeasuredHeight() / f16) * (i21 + 1));
                    g(canvas2, rectF, null);
                }
                if (fArr[i21] < getMeasuredWidth()) {
                    rectF.set(fArr[i21], (getMeasuredHeight() / f16) * i21, getMeasuredWidth(), (getMeasuredHeight() / f16) * (i21 + 1));
                    g(canvas2, rectF, null);
                }
                i21++;
                f7 = 0.0f;
            }
            if (f12 < getMeasuredHeight()) {
                f10 = 0.0f;
                rectF.set(0.0f, f12, getMeasuredWidth(), getMeasuredHeight());
                g(canvas2, rectF, null);
                if (f15 > f10 && (i0Var = this.h0) != null) {
                    w wVar3 = i0Var.h;
                    int i22 = wVar3.c;
                    int i23 = wVar3.b;
                    float d14 = d6VarArr3[i22].d(this.f.d[i22], false);
                    if (this.e0) {
                        rectF.set((getMeasuredWidth() / d14) * i23, (getMeasuredHeight() / f16) * i22, (getMeasuredWidth() / d14) * (i23 + 1), (getMeasuredHeight() / f16) * (i22 + 1));
                    } else {
                        AndroidUtilities.lerp(i0Var.j, i0Var.k, i0Var.l, rectF);
                    }
                    canvas2.save();
                    canvas2.translate(AndroidUtilities.lerp(this.a0, this.c0, i0Var.l) * f15, AndroidUtilities.lerp(this.b0, this.d0, i0Var.l) * f15);
                    g(canvas2, rectF, i0Var);
                    canvas2.restore();
                }
                for (i10 = 0; i10 < arrayList.size(); i10++) {
                    i0 i0Var4 = (i0) arrayList.get(i10);
                    w wVar4 = i0Var4.h;
                    float d15 = i0Var4.b.d(0.0f, false);
                    if (d15 > 0.0f) {
                        int i24 = wVar4.c;
                        int i25 = wVar4.c;
                        int i26 = wVar4.b;
                        float d16 = d6VarArr3[i24].d(wVar4.a.d[i24], false);
                        if (this.f0 || this.e0) {
                            AndroidUtilities.lerp(i0Var4.j, i0Var4.k, i0Var4.l, rectF);
                        } else {
                            rectF.set((getMeasuredWidth() / d16) * i26, (getMeasuredHeight() / f16) * i25, (getMeasuredWidth() / d16) * (i26 + 1), (getMeasuredHeight() / f16) * (i25 + 1));
                        }
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        rectF2.set(rectF);
                        rectF2.inset(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                        Matrix matrix = this.F;
                        matrix.reset();
                        float f17 = rectF.left;
                        int i27 = this.y;
                        int i28 = i27 * i27;
                        matrix.postTranslate(AndroidUtilities.lerp(((float) Math.sqrt(i28 + i28)) * (-1.4f), (float) Math.sqrt((rectF.height() * rectF.height()) + (rectF.width() * rectF.width())), 1.0f - d15) + f17, 0.0f);
                        matrix.postRotate(-25.0f);
                        this.E.setLocalMatrix(matrix);
                        Paint paint = this.v;
                        paint.setAlpha(255);
                        Path path = this.w;
                        path.rewind();
                        w wVar5 = i0Var4.h;
                        float dp = (wVar5.b == 0 && wVar5.c == 0) ? AndroidUtilities.dp(8.0f) : 0.0f;
                        float[] fArr3 = this.x;
                        fArr3[1] = dp;
                        fArr3[0] = dp;
                        w wVar6 = i0Var4.h;
                        float dp2 = (wVar6.b == wVar6.a.b + (-1) && wVar6.c == 0) ? AndroidUtilities.dp(8.0f) : 0.0f;
                        fArr3[2] = dp2;
                        fArr3[1] = dp2;
                        w wVar7 = i0Var4.h;
                        int i29 = wVar7.b;
                        x xVar2 = wVar7.a;
                        float dp3 = (i29 == xVar2.b + (-1) && wVar7.c == xVar2.c + (-1)) ? AndroidUtilities.dp(8.0f) : 0.0f;
                        fArr3[4] = dp3;
                        fArr3[3] = dp3;
                        w wVar8 = i0Var4.h;
                        float dp4 = (wVar8.b == 0 && wVar8.c == wVar8.a.c + (-1)) ? AndroidUtilities.dp(8.0f) : 0.0f;
                        fArr3[6] = dp4;
                        fArr3[5] = dp4;
                        path.addRoundRect(rectF2, fArr3, Path.Direction.CW);
                        canvas2.drawPath(path, paint);
                    }
                }
                if (z10 && (iaVar = this.G) != null) {
                    iaVar.d();
                }
                i(canvas);
            }
        }
        f10 = 0.0f;
        if (f15 > f10) {
            w wVar32 = i0Var.h;
            int i222 = wVar32.c;
            int i232 = wVar32.b;
            float d142 = d6VarArr3[i222].d(this.f.d[i222], false);
            if (this.e0) {
            }
            canvas2.save();
            canvas2.translate(AndroidUtilities.lerp(this.a0, this.c0, i0Var.l) * f15, AndroidUtilities.lerp(this.b0, this.d0, i0Var.l) * f15);
            g(canvas2, rectF, i0Var);
            canvas2.restore();
        }
        while (i10 < arrayList.size()) {
        }
        if (z10) {
            iaVar.d();
        }
        i(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ArrayList arrayList;
        org.telegram.ui.Components.d6[] d6VarArr;
        RectF rectF;
        i0 i0Var;
        e0 e0Var;
        if (!j() || this.n0) {
            d();
            return false;
        }
        if (motionEvent.getPointerCount() > 1) {
            d();
            return false;
        }
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        org.telegram.ui.Components.d6 d6Var = this.I;
        float f7 = d6Var.c;
        int i10 = 0;
        while (true) {
            arrayList = this.h;
            int size = arrayList.size();
            d6VarArr = this.J;
            rectF = this.P;
            if (i10 >= size) {
                i0Var = null;
                break;
            }
            i0Var = (i0) arrayList.get(i10);
            w wVar = i0Var.h;
            int i11 = wVar.c;
            int i12 = wVar.b;
            float f10 = d6VarArr[i11].c;
            rectF.set((getMeasuredWidth() / f10) * i12, (getMeasuredHeight() / f7) * i11, (getMeasuredWidth() / f10) * (i12 + 1), (getMeasuredHeight() / f7) * (i11 + 1));
            if (rectF.contains(x10, y3)) {
                break;
            }
            i10++;
        }
        if (motionEvent.getAction() == 0) {
            this.V = motionEvent.getX();
            this.W = motionEvent.getY();
            this.e0 = false;
            this.c0 = 0.0f;
            this.a0 = 0.0f;
            this.d0 = 0.0f;
            this.b0 = 0.0f;
            this.g0 = i0Var;
            if (i0Var != null) {
                e0 e0Var2 = new e0(this, 0);
                this.i0 = e0Var2;
                AndroidUtilities.runOnUIThread(e0Var2, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 2) {
            if (v7.a7.a(motionEvent.getX(), motionEvent.getY(), this.V, this.W) > AndroidUtilities.touchSlop * 1.2f && (e0Var = this.i0) != null) {
                AndroidUtilities.cancelRunOnUIThread(e0Var);
                this.i0 = null;
            }
            if (!this.e0 && getFilledProgress() >= 1.0f && this.g0 != null && i0Var != null && v7.a7.a(motionEvent.getX(), motionEvent.getY(), this.V, this.W) > AndroidUtilities.touchSlop * 1.2f) {
                this.e0 = true;
                this.h0 = this.g0;
                this.c0 = 0.0f;
                this.a0 = 0.0f;
                this.d0 = 0.0f;
                this.b0 = 0.0f;
                invalidate();
                e0 e0Var3 = this.i0;
                if (e0Var3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(e0Var3);
                    this.i0 = null;
                }
            } else if (this.e0 && this.h0 != null) {
                float x11 = motionEvent.getX();
                float y10 = motionEvent.getY();
                float f11 = d6Var.c;
                int i13 = 0;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        i13 = -1;
                        break;
                    }
                    w wVar2 = ((i0) arrayList.get(i13)).h;
                    int i14 = wVar2.c;
                    int i15 = wVar2.b;
                    float f12 = d6VarArr[i14].c;
                    rectF.set((getMeasuredWidth() / f12) * i15, (getMeasuredHeight() / f11) * i14, (getMeasuredWidth() / f12) * (i15 + 1), (getMeasuredHeight() / f11) * (i14 + 1));
                    if (rectF.contains(x11, y10)) {
                        break;
                    }
                    i13++;
                }
                int indexOf = arrayList.indexOf(this.h0);
                if (i13 >= 0 && indexOf >= 0 && i13 != indexOf) {
                    Collections.swap(arrayList, indexOf, i13);
                    o(this.f);
                    this.f0 = true;
                    invalidate();
                    float f13 = this.f.c;
                    w wVar3 = this.h0.h;
                    int i16 = wVar3.c;
                    int i17 = wVar3.b;
                    float f14 = d6VarArr[i16].c;
                    rectF.set((getMeasuredWidth() / f14) * i17, (getMeasuredHeight() / f13) * i16, (getMeasuredWidth() / f14) * (i17 + 1), (getMeasuredHeight() / f13) * (i16 + 1));
                    this.a0 = this.c0;
                    this.b0 = this.d0;
                    this.V = rectF.centerX();
                    this.W = rectF.centerY();
                }
                this.c0 = motionEvent.getX() - this.V;
                this.d0 = motionEvent.getY() - this.W;
                invalidate();
            } else if (this.g0 != i0Var) {
                this.g0 = null;
                e0 e0Var4 = this.i0;
                if (e0Var4 == null) {
                    return true;
                }
                AndroidUtilities.cancelRunOnUIThread(e0Var4);
                this.i0 = null;
                return true;
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.g0 != null) {
                this.g0 = null;
                this.e0 = false;
                invalidate();
                e0 e0Var5 = this.i0;
                if (e0Var5 == null) {
                    return true;
                }
                AndroidUtilities.cancelRunOnUIThread(e0Var5);
                this.i0 = null;
                return true;
            }
        } else if (motionEvent.getAction() == 3 && d()) {
            return true;
        }
        return this.g0 != null || super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.d && AndroidUtilities.makingGlobalBlurBitmap) {
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e() {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((i0) obj).a(null);
        }
        q();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(Canvas canvas, RectF rectF, i0 i0Var) {
        boolean z10;
        CameraView cameraView;
        ImageView imageView;
        if (AndroidUtilities.makingGlobalBlurBitmap && i0Var == this.j0) {
            return;
        }
        if (i0Var == this.h0) {
            org.telegram.ui.Components.d6 d6Var = this.K;
            if (d6Var.c > 0.0f) {
                canvas.save();
                Path path = this.Q;
                path.rewind();
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(rectF);
                rectF2.inset(AndroidUtilities.dp(10.0f) * d6Var.c, AndroidUtilities.dp(10.0f) * d6Var.c);
                float dp = AndroidUtilities.dp(12.0f) * d6Var.c;
                path.addRoundRect(rectF2, dp, dp, Path.Direction.CW);
                canvas.clipPath(path);
                z10 = true;
                if (i0Var != null) {
                    ImageReceiver imageReceiver = i0Var.c;
                    if (i0Var.n != null) {
                        TextureView textureView = i0Var.e;
                        if (textureView == null || !i0Var.f) {
                            imageReceiver.setImageCoords(rectF.left, rectF.top, rectF.width(), rectF.height());
                            if (!imageReceiver.draw(canvas)) {
                                CameraView cameraView2 = this.d;
                                if (cameraView2 == null && this.S) {
                                    f(canvas, this.R, rectF, 0.0f);
                                } else {
                                    h(0.0f, canvas, rectF, cameraView2);
                                }
                            }
                        } else {
                            h(0.0f, canvas, rectF, textureView);
                        }
                        if (z10) {
                            canvas.restore();
                            return;
                        }
                        return;
                    }
                }
                if ((i0Var == null && i0Var.m) || AndroidUtilities.makingGlobalBlurBitmap) {
                    CameraView cameraView3 = this.d;
                    if (cameraView3 == null && this.S) {
                        f(canvas, this.R, rectF, (i0Var == null || !i0Var.m) ? 0.4f : 0.0f);
                    } else {
                        h((i0Var == null || !i0Var.m) ? 0.4f : 0.0f, canvas, rectF, cameraView3);
                    }
                } else {
                    setCameraNeedsBlur(!this.n0);
                    if (this.e == null && Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
                        RenderNode c10 = org.telegram.messenger.b.c(this.e);
                        float max = Math.max(rectF.width() / c10.getWidth(), rectF.height() / c10.getHeight());
                        canvas.save();
                        canvas.translate(rectF.left, rectF.top);
                        canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                        canvas.scale(max, max);
                        canvas.drawRenderNode(c10);
                        canvas.drawColor(1677721600);
                        canvas.restore();
                    } else {
                        h(0.75f, canvas, rectF, this.d);
                    }
                    cameraView = this.d;
                    if (cameraView != null && (imageView = cameraView.blurredStubView) != null && imageView.getVisibility() == 0 && this.d.blurredStubView.getAlpha() > 0.0f) {
                        h(0.4f, canvas, rectF, this.d.blurredStubView);
                    }
                }
                if (z10) {
                }
            }
        }
        z10 = false;
        if (i0Var != null) {
        }
        if (i0Var == null) {
        }
        setCameraNeedsBlur(!this.n0);
        if (this.e == null) {
        }
        h(0.75f, canvas, rectF, this.d);
        cameraView = this.d;
        if (cameraView != null) {
            h(0.4f, canvas, rectF, this.d.blurredStubView);
        }
        if (z10) {
        }
    }

    public Object getBlurRenderNode() {
        Shader.TileMode tileMode;
        if (this.N == null && Build.VERSION.SDK_INT >= 31) {
            this.N = new RenderNode("CameraViewRenderNode");
            RenderNode renderNode = new RenderNode("CameraViewRenderNodeBlur");
            this.O = renderNode;
            float dp = AndroidUtilities.dp(32.0f);
            float dp2 = AndroidUtilities.dp(32.0f);
            tileMode = Shader.TileMode.DECAL;
            renderNode.setRenderEffect(RenderEffect.createBlurEffect(dp, dp2, tileMode));
        }
        return this.O;
    }

    public ArrayList<r9> getContent() {
        ArrayList<r9> arrayList = new ArrayList<>();
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            r9 r9Var = ((i0) obj).n;
            if (r9Var != null) {
                arrayList.add(r9Var);
            }
        }
        return arrayList;
    }

    public i0 getCurrent() {
        return this.r;
    }

    public long getDuration() {
        i0 mainPart;
        r9 r9Var;
        if (!this.n0 || (mainPart = getMainPart()) == null || (r9Var = mainPart.n) == null) {
            return 1L;
        }
        return Math.max(Math.min((long) ((r9Var.W - r9Var.V) * r9Var.h0), 59500L), 1L);
    }

    public int getFilledCount() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                return i11;
            }
            if (((i0) arrayList.get(i10)).n != null) {
                i11++;
            }
            i10++;
        }
    }

    public float getFilledProgress() {
        return getFilledCount() / getTotalCount();
    }

    public x getLayout() {
        return this.f;
    }

    public i0 getMainPart() {
        i0 i0Var = null;
        if (!this.n0) {
            return null;
        }
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = 0;
        long j3 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            i0 i0Var2 = (i0) obj;
            r9 r9Var = i0Var2.n;
            if (r9Var != null && r9Var.K) {
                long j10 = r9Var.h0;
                h0 h0Var = i0Var2.d;
                if (h0Var != null && h0Var.getDuration() > 0) {
                    j10 = i0Var2.d.getDuration();
                }
                if (j10 > j3) {
                    i0Var = i0Var2;
                    j3 = j10;
                }
            }
        }
        return i0Var;
    }

    public i0 getNext() {
        return this.s;
    }

    public ArrayList<Integer> getOrder() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.h;
            if (i10 >= arrayList2.size()) {
                return arrayList;
            }
            i10 = com.google.android.gms.internal.vision.e2.d(((i0) arrayList2.get(i10)).a, i10, 1, arrayList);
        }
    }

    public long getPosition() {
        if (!this.n0) {
            return 0L;
        }
        if (!this.q0) {
            return this.u0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.o0;
        if (j3 > getDuration()) {
            this.o0 = currentTimeMillis - (j3 % getDuration());
        }
        return j3;
    }

    public long getPositionWithOffset() {
        long j3 = 0;
        if (!this.n0) {
            return 0L;
        }
        getPosition();
        i0 mainPart = getMainPart();
        if (mainPart != null) {
            r9 r9Var = mainPart.n;
            j3 = r9Var.X + ((long) (r9Var.V * r9Var.h0));
        }
        return getPosition() + j3;
    }

    public int getTotalCount() {
        return this.h.size();
    }

    public final void h(float f7, Canvas canvas, RectF rectF, View view) {
        h8 h8Var;
        Bitmap bitmap;
        RectF rectF2 = rectF;
        if (view == null) {
            return;
        }
        float max = Math.max(rectF2.width() / view.getWidth(), rectF2.height() / view.getHeight());
        canvas.save();
        canvas.translate(rectF2.centerX(), rectF2.centerY());
        canvas.clipRect((-rectF2.width()) / 2.0f, (-rectF2.height()) / 2.0f, rectF2.width() / 2.0f, rectF2.height() / 2.0f);
        canvas.scale(max, max);
        canvas.translate((-view.getWidth()) / 2.0f, (-view.getHeight()) / 2.0f);
        if (AndroidUtilities.makingGlobalBlurBitmap) {
            TextureView textureView = view instanceof TextureView ? (TextureView) view : view instanceof CameraView ? ((CameraView) view).getTextureView() : null;
            if (textureView != null && (bitmap = textureView.getBitmap()) != null) {
                canvas.scale(view.getWidth() / bitmap.getWidth(), view.getHeight() / bitmap.getHeight());
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
        } else {
            view.draw(canvas);
        }
        if (f7 > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.j6.l1(view.getAlpha() * f7, -16777216));
        }
        canvas.restore();
        if (view != this.d || (h8Var = this.c) == null) {
            return;
        }
        Paint paint = (Paint) h8Var.i;
        org.telegram.ui.Components.d6[] d6VarArr = (org.telegram.ui.Components.d6[]) h8Var.h;
        org.telegram.ui.Components.d6[] d6VarArr2 = (org.telegram.ui.Components.d6[]) h8Var.g;
        Path path = (Path) h8Var.j;
        g8 g8Var = (g8) h8Var.c;
        if (g8Var == null || g8Var.b.length <= 0) {
            return;
        }
        float e = ((org.telegram.ui.Components.d6) h8Var.d).e(h8Var.a);
        float d = ((org.telegram.ui.Components.d6) h8Var.e).d(((g8) h8Var.c).c, false);
        float width = (rectF2.width() * d) + rectF2.left;
        float d10 = ((org.telegram.ui.Components.d6) h8Var.f).d(((g8) h8Var.c).d, false);
        float height = (rectF2.height() * d10) + rectF2.top;
        float lerp = AndroidUtilities.lerp(0.5f, 1.1f, e);
        canvas.save();
        canvas.scale(lerp, lerp, width, height);
        if (e > 0.0f) {
            path.rewind();
            int min = Math.min(4, ((g8) h8Var.c).b.length);
            int i10 = 0;
            while (i10 < min) {
                int i11 = i10 - 1;
                if (i11 < 0) {
                    i11 = min - 1;
                }
                int i12 = i10 + 1;
                int i13 = i12 >= min ? 0 : i12;
                g8 g8Var2 = (g8) h8Var.c;
                PointF[] pointFArr = g8Var2.b;
                PointF pointF = pointFArr[i11];
                int i14 = min;
                PointF pointF2 = pointFArr[i10];
                org.telegram.ui.Components.d6[] d6VarArr3 = d6VarArr;
                PointF pointF3 = pointFArr[i13];
                org.telegram.ui.Components.d6[] d6VarArr4 = d6VarArr2;
                float f10 = e;
                float width2 = (rectF2.width() * (d6VarArr4[i11].d(pointF.x - g8Var2.c, false) + d)) + rectF2.left;
                float height2 = (rectF2.height() * (d6VarArr3[i11].d(pointF.y - ((g8) h8Var.c).d, false) + d10)) + rectF2.top;
                float width3 = (rectF2.width() * (d6VarArr4[i10].d(pointF2.x - ((g8) h8Var.c).c, false) + d)) + rectF2.left;
                float height3 = (rectF2.height() * (d6VarArr3[i10].d(pointF2.y - ((g8) h8Var.c).d, false) + d10)) + rectF2.top;
                float width4 = (rectF2.width() * (d6VarArr4[i13].d(pointF3.x - ((g8) h8Var.c).c, false) + d)) + rectF2.left;
                float height4 = ((rectF.height() * (d6VarArr3[i13].d(pointF3.y - ((g8) h8Var.c).d, false) + d10)) + rectF2.top) - height3;
                path.moveTo(((width2 - width3) * 0.18f) + width3, ((height2 - height3) * 0.18f) + height3);
                path.lineTo(width3, height3);
                path.lineTo(((width4 - width3) * 0.18f) + width3, (height4 * 0.18f) + height3);
                rectF2 = rectF;
                d6VarArr2 = d6VarArr4;
                i10 = i12;
                min = i14;
                d6VarArr = d6VarArr3;
                e = f10;
            }
            paint.setAlpha((int) (e * 255.0f));
            canvas.drawPath(path, paint);
        }
        canvas.restore();
    }

    public final void i(Canvas canvas) {
        if (this.N == null || Build.VERSION.SDK_INT < 29 || !canvas.isHardwareAccelerated()) {
            return;
        }
        RenderNode c10 = org.telegram.messenger.b.c(this.N);
        c10.endRecording();
        canvas.drawRenderNode(c10);
        Object obj = this.O;
        if (obj != null) {
            RenderNode c11 = org.telegram.messenger.b.c(obj);
            c11.setPosition(0, 0, getWidth(), getHeight());
            c11.beginRecording().drawRenderNode(c10);
            c11.endRecording();
        }
    }

    public final boolean j() {
        return this.f.e.size() > 1;
    }

    public final void k(RectF rectF, w wVar) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            Point point = AndroidUtilities.displaySize;
            int i10 = point.x;
            measuredHeight = point.y;
            measuredWidth = i10;
        }
        float f7 = measuredWidth;
        x xVar = wVar.a;
        int[] iArr = xVar.d;
        int i11 = wVar.c;
        int i12 = iArr[i11];
        int i13 = wVar.b;
        float f10 = measuredHeight;
        int i14 = xVar.c;
        rectF.set((f7 / i12) * i13, (f10 / i14) * i11, (f7 / i12) * (i13 + 1), (f10 / i14) * (i11 + 1));
    }

    public final boolean l(r9 r9Var) {
        if (r9Var.K) {
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                Object obj = arrayList.get(i10);
                i10++;
                r9 r9Var2 = ((i0) obj).n;
                if (r9Var2 != null && r9Var2.K && r9Var2.P > 0.0f) {
                    r9Var.P = 0.0f;
                    break;
                }
            }
        }
        i0 i0Var = this.r;
        if (i0Var != null) {
            i0Var.a(r9Var);
        }
        q();
        requestLayout();
        return this.r == null;
    }

    public final void m(long j3, boolean z10) {
        if (this.n0) {
            long clamp = Utilities.clamp(j3, getDuration(), 0L);
            if (!this.q0) {
                this.u0 = clamp;
            }
            this.o0 = System.currentTimeMillis() - clamp;
            this.p0 = z10;
            if (this.n0) {
                e0 e0Var = this.w0;
                AndroidUtilities.cancelRunOnUIThread(e0Var);
                e0Var.run();
            }
        }
    }

    public final void n(r9 r9Var) {
        if (r9Var == null || r9Var.T == null) {
            e();
            return;
        }
        o(r9Var.S);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((i0) arrayList.get(i10)).a((r9) r9Var.T.get(i10));
            i10++;
        }
    }

    public final void o(x xVar) {
        if (xVar == null) {
            xVar = new x(".");
        }
        ArrayList arrayList = xVar.e;
        this.f = xVar;
        e0 e0Var = this.H;
        AndroidUtilities.cancelRunOnUIThread(e0Var);
        int i10 = 0;
        while (true) {
            int size = arrayList.size();
            ArrayList arrayList2 = this.h;
            if (i10 >= Math.max(size, arrayList2.size())) {
                q();
                invalidate();
                AndroidUtilities.runOnUIThread(e0Var, 360L);
                return;
            }
            w wVar = i10 < arrayList.size() ? (w) arrayList.get(i10) : null;
            i0 i0Var = i10 < arrayList2.size() ? (i0) arrayList2.get(i10) : null;
            if (i0Var == null && wVar != null) {
                i0 i0Var2 = new i0(this);
                if (this.k0) {
                    i0Var2.c.onAttachedToWindow();
                }
                i0Var2.b(wVar, true);
                arrayList2.add(i0Var2);
            } else if (wVar != null) {
                i0Var.b(wVar, true);
            } else if (i0Var != null) {
                this.n.add(i0Var);
                arrayList2.remove(i0Var);
                i0Var.b(null, true);
                i10--;
            }
            i10++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                this.k0 = true;
                return;
            } else {
                ((i0) arrayList.get(i10)).c.onAttachedToWindow();
                i10++;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                this.k0 = false;
                AndroidUtilities.cancelRunOnUIThread(this.w0);
                return;
            } else {
                ((i0) arrayList.get(i10)).c.onDetachedFromWindow();
                i10++;
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        i0 i0Var;
        r9 r9Var;
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt == this.d) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            } else {
                int i15 = 0;
                while (true) {
                    ArrayList arrayList = this.h;
                    if (i15 >= arrayList.size()) {
                        i0Var = null;
                        break;
                    } else {
                        if (childAt == ((i0) arrayList.get(i15)).e) {
                            i0Var = (i0) arrayList.get(i15);
                            break;
                        }
                        i15++;
                    }
                }
                if (i0Var == null || (r9Var = i0Var.n) == null || (i12 = r9Var.k0) <= 0 || (i13 = r9Var.l0) <= 0) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                } else {
                    if (r9Var.Q % 90 == 1) {
                        i13 = i12;
                        i12 = i13;
                    }
                    float f7 = i12;
                    float f10 = i13;
                    float min = Math.min(1.0f, Math.max(f7 / size, f10 / size2));
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (f7 * min), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (f10 * min), TLObject.FLAG_30));
                }
            }
        }
    }

    public final void p() {
        CameraView cameraView = this.d;
        boolean z10 = cameraView != null && this.U;
        if (z10 == (this.e != null)) {
            return;
        }
        if (z10) {
            this.e = cameraView.getBlurRenderNode();
        } else {
            this.e = null;
        }
    }

    public final void q() {
        ArrayList arrayList;
        this.r = null;
        this.s = null;
        int i10 = 0;
        while (true) {
            arrayList = this.h;
            if (i10 >= arrayList.size()) {
                break;
            }
            i0 i0Var = (i0) arrayList.get(i10);
            if (i0Var.n == null) {
                if (this.r != null) {
                    this.s = i0Var;
                    break;
                }
                this.r = i0Var;
            }
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            i0 i0Var2 = (i0) arrayList.get(i11);
            i0Var2.m = i0Var2 == this.r;
        }
    }

    public void setCameraNeedsBlur(boolean z10) {
        if (this.U == z10) {
            return;
        }
        this.U = z10;
        p();
    }

    public void setCameraThumb(Drawable drawable) {
        this.R = drawable;
        invalidate();
    }

    public void setCameraThumbVisible(boolean z10) {
        this.S = z10;
        invalidate();
    }

    public void setCameraView(CameraView cameraView) {
        CameraView cameraView2 = this.d;
        if (cameraView2 != cameraView && cameraView2 != null) {
            cameraView2.unlistenDraw(new e0(this, 1));
            AndroidUtilities.removeFromParent(this.d);
            this.d = null;
            p();
        }
        this.d = cameraView;
        if (cameraView != null) {
            addView(cameraView, w7.a6.e(-1, -1, 119));
        }
        CameraView cameraView3 = this.d;
        if (cameraView3 != null) {
            cameraView3.unlistenDraw(new e0(this, 1));
        }
        this.d = cameraView;
        if (cameraView != null) {
            cameraView.listenDraw(new e0(this, 1));
        }
        p();
        invalidate();
    }

    public void setCancelGestures(Runnable runnable) {
        this.l0 = runnable;
    }

    public void setMuted(boolean z10) {
        if (this.v0 == z10) {
            return;
        }
        this.v0 = z10;
    }

    public void setOnCameraThumbClick(Runnable runnable) {
        this.T = runnable;
    }

    public void setPlaying(boolean z10) {
        boolean z11 = this.t0;
        this.t0 = true;
        if (this.q0 == z10) {
            return;
        }
        this.q0 = z10;
        if (!z10) {
            this.u0 = getPosition();
        } else if (z11) {
            m(this.u0, false);
        } else {
            this.p0 = false;
        }
        if (this.n0) {
            e0 e0Var = this.w0;
            AndroidUtilities.cancelRunOnUIThread(e0Var);
            e0Var.run();
        }
    }

    public void setPreview(boolean z10) {
        if (this.n0 == z10) {
            return;
        }
        this.n0 = z10;
        ArrayList arrayList = this.h;
        int i10 = 0;
        if (z10) {
            org.telegram.ui.Components.ia iaVar = this.G;
            if (iaVar != null) {
                iaVar.d();
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((i0) arrayList.get(i11)).a = i11;
            }
        }
        this.p0 = false;
        this.u0 = 0L;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            i0 i0Var = (i0) obj;
            h0 h0Var = i0Var.d;
            if (h0Var != null) {
                h0Var.setAudioEnabled(z10, true);
                if (!z10 || this.q0) {
                    i0Var.d.play();
                } else {
                    i0Var.d.pause();
                }
            }
        }
        e0 e0Var = this.w0;
        AndroidUtilities.cancelRunOnUIThread(e0Var);
        if (z10) {
            this.o0 = System.currentTimeMillis();
            AndroidUtilities.runOnUIThread(e0Var, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
        }
    }

    public void setPreviewView(e8 e8Var) {
        this.s0 = e8Var;
    }

    public void setResetState(Runnable runnable) {
        this.m0 = runnable;
    }

    public void setTimelineView(me meVar) {
        this.r0 = meVar;
    }
}
