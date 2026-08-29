package nh;

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
import org.telegram.ui.Components.i70;
import org.telegram.ui.Components.jr;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public abstract class e0 extends FrameLayout implements i70 {
    public static final /* synthetic */ int t0 = 0;
    public final LinearGradient A;
    public final Matrix B;
    public final org.telegram.ui.Components.ga C;
    public final a0 D;
    public final org.telegram.ui.Components.d6 E;
    public final org.telegram.ui.Components.d6[] F;
    public final org.telegram.ui.Components.d6 G;
    public final float[] H;
    public final float[] I;
    public Object J;
    public Object K;
    public final RectF L;
    public final Path M;
    public Drawable N;
    public boolean O;
    public Runnable P;
    public boolean Q;
    public float R;
    public float S;
    public float T;
    public float U;
    public float V;
    public float W;
    public final FrameLayout a;
    public boolean a0;
    public final lh.b b;
    public boolean b0;
    public final i6 c;
    public d0 c0;
    public CameraView d;
    public d0 d0;
    public Object e;
    public a0 e0;
    public t f;
    public d0 f0;
    public boolean g0;
    public final ArrayList h;
    public Runnable h0;
    public Runnable i0;
    public boolean j0;
    public long k0;
    public boolean l0;
    public boolean m0;
    public final ArrayList n;
    public qb n0;
    public f6 o0;
    public boolean p0;
    public long q0;
    public d0 r;
    public boolean r0;
    public d0 s;
    public final a0 s0;
    public final Paint v;
    public final Path w;
    public final float[] x;
    public final int y;

    public e0(Context context, org.telegram.ui.Components.ga gaVar, FrameLayout frameLayout, lh.b bVar) {
        super(context);
        this.c = new i6(new a0(this, 1));
        this.f = new t(".");
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        this.n = new ArrayList();
        Paint paint = new Paint(1);
        this.v = paint;
        this.w = new Path();
        this.x = new float[8];
        this.D = new a0(this, 2);
        jr jrVar = jr.h;
        this.E = new org.telegram.ui.Components.d6(this, 0L, 320L, jrVar);
        this.F = new org.telegram.ui.Components.d6[]{new org.telegram.ui.Components.d6(this, 0L, 320L, jrVar), new org.telegram.ui.Components.d6(this, 0L, 320L, jrVar), new org.telegram.ui.Components.d6(this, 0L, 320L, jrVar), new org.telegram.ui.Components.d6(this, 0L, 320L, jrVar), new org.telegram.ui.Components.d6(this, 0L, 320L, jrVar)};
        this.G = new org.telegram.ui.Components.d6(this, 0L, 320L, jrVar);
        this.H = new float[5];
        this.I = new float[5];
        this.L = new RectF();
        this.M = new Path();
        this.O = true;
        this.m0 = true;
        this.p0 = true;
        this.s0 = new a0(this, 3);
        this.C = gaVar;
        this.a = frameLayout;
        this.b = bVar;
        setBackgroundColor(-14737633);
        d0 d0Var = new d0(this);
        d0Var.b((s) this.f.e.get(0), false);
        d0Var.m = true;
        if (this.g0) {
            d0Var.c.onAttachedToWindow();
        }
        arrayList.add(d0Var);
        this.r = d0Var;
        this.s = null;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setStrokeWidth(AndroidUtilities.dp(8.0f));
        int dp = AndroidUtilities.dp(300.0f);
        this.y = dp;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{0, -1, -1, 0}, new float[]{0.0f, 0.2f, 0.8f, 1.0f}, Shader.TileMode.CLAMP);
        this.A = linearGradient;
        this.B = new Matrix();
        paint.setShader(linearGradient);
        setWillNotDraw(false);
    }

    public static void c(e0 e0Var, RectF rectF, s sVar) {
        int measuredWidth = e0Var.getMeasuredWidth();
        int measuredHeight = e0Var.getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            Point point = AndroidUtilities.displaySize;
            int i10 = point.x;
            measuredHeight = point.y;
            measuredWidth = i10;
        }
        e0Var.k(rectF, sVar);
        float f9 = rectF.left;
        boolean z10 = f9 <= 0.0f;
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
            rectF.offset(0.0f, f11 - f9);
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

    public static void f(Canvas canvas, Drawable drawable, RectF rectF, float f9) {
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
        if (f9 > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.g6.l1(drawable.getAlpha() * f9, -16777216));
        }
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.i70
    public final void a(RectF rectF) {
        d0 d0Var = this.f0;
        if (d0Var == null) {
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            return;
        }
        s sVar = d0Var.h;
        t tVar = sVar.a;
        int i10 = sVar.b;
        int i11 = sVar.c;
        float f9 = tVar.c;
        float d = this.F[i11].d(tVar.d[i11], false);
        rectF.set((getMeasuredWidth() / d) * i10, (getMeasuredHeight() / f9) * i11, (getMeasuredWidth() / d) * (i10 + 1), (getMeasuredHeight() / f9) * (i11 + 1));
    }

    @Override // org.telegram.ui.Components.i70
    public final void b(Canvas canvas, float f9) {
        d0 d0Var = this.f0;
        if (d0Var != null) {
            s sVar = d0Var.h;
            t tVar = sVar.a;
            int i10 = sVar.b;
            int i11 = sVar.c;
            float f10 = tVar.c;
            float d = this.F[i11].d(tVar.d[i11], false);
            float measuredWidth = (getMeasuredWidth() / d) * i10;
            float measuredHeight = (getMeasuredHeight() / f10) * i11;
            float measuredWidth2 = (getMeasuredWidth() / d) * (i10 + 1);
            float measuredHeight2 = (getMeasuredHeight() / f10) * (i11 + 1);
            RectF rectF = this.L;
            rectF.set(measuredWidth, measuredHeight, measuredWidth2, measuredHeight2);
            g(canvas, rectF, this.f0);
        }
    }

    public final boolean d() {
        if (this.c0 == null) {
            return false;
        }
        this.c0 = null;
        this.a0 = false;
        invalidate();
        a0 a0Var = this.e0;
        if (a0Var == null) {
            return true;
        }
        AndroidUtilities.cancelRunOnUIThread(a0Var);
        this.e0 = null;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0303  */
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
        float f9;
        RectF rectF;
        float f10;
        int i10;
        org.telegram.ui.Components.ga gaVar;
        d0 d0Var;
        int i11;
        if (this.J == null || Build.VERSION.SDK_INT < 29 || !canvas.isHardwareAccelerated()) {
            canvas2 = canvas;
        } else {
            RenderNode c3 = org.telegram.messenger.b.c(this.J);
            c3.setPosition(0, 0, getWidth(), getHeight());
            canvas2 = c3.beginRecording();
        }
        super.dispatchDraw(canvas2);
        boolean j10 = j();
        org.telegram.ui.Components.d6 d6Var = this.E;
        org.telegram.ui.Components.d6[] d6VarArr = this.F;
        if (!j10 && !this.b0 && !this.a0) {
            float f11 = d6Var.c;
            t tVar = this.f;
            if (f11 == tVar.c && d6VarArr[0].c == tVar.d[0]) {
                i6 i6Var = this.c;
                if (!i6Var.b && i6Var.d.c <= 0.0f) {
                    setCameraNeedsBlur(false);
                    i(canvas);
                    return;
                }
            }
        }
        if (this.j0) {
            setCameraNeedsBlur(false);
        }
        canvas2.drawColor(-14737633);
        float e10 = this.G.e(this.a0);
        float d10 = d6Var.d(this.f.c, false);
        int i12 = 0;
        while (true) {
            double d11 = i12;
            d = d10;
            double ceil = Math.ceil(d);
            fArr = this.I;
            fArr2 = this.H;
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
            f9 = 0.0f;
            rectF = this.L;
            if (i14 >= size) {
                break;
            }
            d0 d0Var2 = (d0) arrayList.get(i14);
            s sVar = d0Var2.h;
            int i15 = sVar.c;
            float f13 = e10;
            int i16 = sVar.b;
            float f14 = d10;
            org.telegram.ui.Components.d6[] d6VarArr2 = d6VarArr;
            float d12 = d6VarArr[i15].d(sVar.a.d[i15], false);
            if (this.b0 || this.a0) {
                i11 = i15;
                AndroidUtilities.lerp(d0Var2.j, d0Var2.k, d0Var2.l, rectF);
            } else {
                i11 = i15;
                rectF.set((getMeasuredWidth() / d12) * i16, (getMeasuredHeight() / f14) * i15, (getMeasuredWidth() / d12) * (i16 + 1), (getMeasuredHeight() / f14) * (i11 + 1));
            }
            fArr2[i11] = Math.min(fArr2[i11], rectF.left);
            fArr[i11] = Math.max(fArr[i11], rectF.right);
            f12 = Math.max(f12, rectF.bottom);
            if (f13 <= 0.0f || d0Var2 != this.d0) {
                if (this.j0 && d0Var2.d != null) {
                    z10 = true;
                }
                g(canvas2, rectF, d0Var2);
            }
            i14++;
            e10 = f13;
            d10 = f14;
            d6VarArr = d6VarArr2;
        }
        float f15 = e10;
        float f16 = d10;
        org.telegram.ui.Components.d6[] d6VarArr3 = d6VarArr;
        int i17 = 0;
        while (true) {
            ArrayList arrayList2 = this.n;
            if (i17 >= arrayList2.size()) {
                break;
            }
            d0 d0Var3 = (d0) arrayList2.get(i17);
            s sVar2 = d0Var3.h;
            int i18 = sVar2.c;
            int i19 = sVar2.b;
            int i20 = i17;
            float d13 = d6VarArr3[i18].d(i18 >= this.f.d.length ? 1.0f : r9[i18], false);
            rectF.set((getMeasuredWidth() / d13) * i19, (getMeasuredHeight() / f16) * i18, (getMeasuredWidth() / d13) * (i19 + 1), (i18 + 1) * (getMeasuredHeight() / f16));
            fArr2[i18] = Math.min(fArr2[i18], rectF.left);
            fArr[i18] = Math.max(fArr[i18], rectF.right);
            f12 = Math.max(f12, rectF.bottom);
            if (this.j0 && d0Var3.d != null) {
                z10 = true;
            }
            g(canvas2, rectF, d0Var3);
            i17 = i20 + 1;
        }
        if (!this.a0) {
            int i21 = 0;
            while (i21 < Math.ceil(d)) {
                if (fArr2[i21] >= f9) {
                    rectF.set(0.0f, (getMeasuredHeight() / f16) * i21, fArr2[i21], (getMeasuredHeight() / f16) * (i21 + 1));
                    g(canvas2, rectF, null);
                }
                if (fArr[i21] < getMeasuredWidth()) {
                    rectF.set(fArr[i21], (getMeasuredHeight() / f16) * i21, getMeasuredWidth(), (getMeasuredHeight() / f16) * (i21 + 1));
                    g(canvas2, rectF, null);
                }
                i21++;
                f9 = 0.0f;
            }
            if (f12 < getMeasuredHeight()) {
                f10 = 0.0f;
                rectF.set(0.0f, f12, getMeasuredWidth(), getMeasuredHeight());
                g(canvas2, rectF, null);
                if (f15 > f10 && (d0Var = this.d0) != null) {
                    s sVar3 = d0Var.h;
                    int i22 = sVar3.c;
                    int i23 = sVar3.b;
                    float d14 = d6VarArr3[i22].d(this.f.d[i22], false);
                    if (this.a0) {
                        rectF.set((getMeasuredWidth() / d14) * i23, (getMeasuredHeight() / f16) * i22, (getMeasuredWidth() / d14) * (i23 + 1), (getMeasuredHeight() / f16) * (i22 + 1));
                    } else {
                        AndroidUtilities.lerp(d0Var.j, d0Var.k, d0Var.l, rectF);
                    }
                    canvas2.save();
                    canvas2.translate(AndroidUtilities.lerp(this.T, this.V, d0Var.l) * f15, AndroidUtilities.lerp(this.U, this.W, d0Var.l) * f15);
                    g(canvas2, rectF, d0Var);
                    canvas2.restore();
                }
                for (i10 = 0; i10 < arrayList.size(); i10++) {
                    d0 d0Var4 = (d0) arrayList.get(i10);
                    s sVar4 = d0Var4.h;
                    float d15 = d0Var4.b.d(0.0f, false);
                    if (d15 > 0.0f) {
                        int i24 = sVar4.c;
                        int i25 = sVar4.c;
                        int i26 = sVar4.b;
                        float d16 = d6VarArr3[i24].d(sVar4.a.d[i24], false);
                        if (this.b0 || this.a0) {
                            AndroidUtilities.lerp(d0Var4.j, d0Var4.k, d0Var4.l, rectF);
                        } else {
                            rectF.set((getMeasuredWidth() / d16) * i26, (getMeasuredHeight() / f16) * i25, (getMeasuredWidth() / d16) * (i26 + 1), (getMeasuredHeight() / f16) * (i25 + 1));
                        }
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        rectF2.set(rectF);
                        rectF2.inset(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                        Matrix matrix = this.B;
                        matrix.reset();
                        float f17 = rectF.left;
                        int i27 = this.y;
                        int i28 = i27 * i27;
                        matrix.postTranslate(AndroidUtilities.lerp(((float) Math.sqrt(i28 + i28)) * (-1.4f), (float) Math.sqrt((rectF.height() * rectF.height()) + (rectF.width() * rectF.width())), 1.0f - d15) + f17, 0.0f);
                        matrix.postRotate(-25.0f);
                        this.A.setLocalMatrix(matrix);
                        Paint paint = this.v;
                        paint.setAlpha(255);
                        Path path = this.w;
                        path.rewind();
                        s sVar5 = d0Var4.h;
                        float dp = (sVar5.b == 0 && sVar5.c == 0) ? AndroidUtilities.dp(8.0f) : 0.0f;
                        float[] fArr3 = this.x;
                        fArr3[1] = dp;
                        fArr3[0] = dp;
                        s sVar6 = d0Var4.h;
                        float dp2 = (sVar6.b == sVar6.a.b + (-1) && sVar6.c == 0) ? AndroidUtilities.dp(8.0f) : 0.0f;
                        fArr3[2] = dp2;
                        fArr3[1] = dp2;
                        s sVar7 = d0Var4.h;
                        int i29 = sVar7.b;
                        t tVar2 = sVar7.a;
                        float dp3 = (i29 == tVar2.b + (-1) && sVar7.c == tVar2.c + (-1)) ? AndroidUtilities.dp(8.0f) : 0.0f;
                        fArr3[4] = dp3;
                        fArr3[3] = dp3;
                        s sVar8 = d0Var4.h;
                        float dp4 = (sVar8.b == 0 && sVar8.c == sVar8.a.c + (-1)) ? AndroidUtilities.dp(8.0f) : 0.0f;
                        fArr3[6] = dp4;
                        fArr3[5] = dp4;
                        path.addRoundRect(rectF2, fArr3, Path.Direction.CW);
                        canvas2.drawPath(path, paint);
                    }
                }
                if (z10 && (gaVar = this.C) != null) {
                    gaVar.d();
                }
                i(canvas);
            }
        }
        f10 = 0.0f;
        if (f15 > f10) {
            s sVar32 = d0Var.h;
            int i222 = sVar32.c;
            int i232 = sVar32.b;
            float d142 = d6VarArr3[i222].d(this.f.d[i222], false);
            if (this.a0) {
            }
            canvas2.save();
            canvas2.translate(AndroidUtilities.lerp(this.T, this.V, d0Var.l) * f15, AndroidUtilities.lerp(this.U, this.W, d0Var.l) * f15);
            g(canvas2, rectF, d0Var);
            canvas2.restore();
        }
        while (i10 < arrayList.size()) {
        }
        if (z10) {
            gaVar.d();
        }
        i(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ArrayList arrayList;
        org.telegram.ui.Components.d6[] d6VarArr;
        RectF rectF;
        d0 d0Var;
        a0 a0Var;
        if (!j() || this.j0) {
            d();
            return false;
        }
        if (motionEvent.getPointerCount() > 1) {
            d();
            return false;
        }
        float x4 = motionEvent.getX();
        float y8 = motionEvent.getY();
        org.telegram.ui.Components.d6 d6Var = this.E;
        float f9 = d6Var.c;
        int i10 = 0;
        while (true) {
            arrayList = this.h;
            int size = arrayList.size();
            d6VarArr = this.F;
            rectF = this.L;
            if (i10 >= size) {
                d0Var = null;
                break;
            }
            d0Var = (d0) arrayList.get(i10);
            s sVar = d0Var.h;
            int i11 = sVar.c;
            int i12 = sVar.b;
            float f10 = d6VarArr[i11].c;
            rectF.set((getMeasuredWidth() / f10) * i12, (getMeasuredHeight() / f9) * i11, (getMeasuredWidth() / f10) * (i12 + 1), (getMeasuredHeight() / f9) * (i11 + 1));
            if (rectF.contains(x4, y8)) {
                break;
            }
            i10++;
        }
        if (motionEvent.getAction() == 0) {
            this.R = motionEvent.getX();
            this.S = motionEvent.getY();
            this.a0 = false;
            this.V = 0.0f;
            this.T = 0.0f;
            this.W = 0.0f;
            this.U = 0.0f;
            this.c0 = d0Var;
            if (d0Var != null) {
                a0 a0Var2 = new a0(this, 0);
                this.e0 = a0Var2;
                AndroidUtilities.runOnUIThread(a0Var2, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 2) {
            if (i7.z5.a(motionEvent.getX(), motionEvent.getY(), this.R, this.S) > AndroidUtilities.touchSlop * 1.2f && (a0Var = this.e0) != null) {
                AndroidUtilities.cancelRunOnUIThread(a0Var);
                this.e0 = null;
            }
            if (!this.a0 && getFilledProgress() >= 1.0f && this.c0 != null && d0Var != null && i7.z5.a(motionEvent.getX(), motionEvent.getY(), this.R, this.S) > AndroidUtilities.touchSlop * 1.2f) {
                this.a0 = true;
                this.d0 = this.c0;
                this.V = 0.0f;
                this.T = 0.0f;
                this.W = 0.0f;
                this.U = 0.0f;
                invalidate();
                a0 a0Var3 = this.e0;
                if (a0Var3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(a0Var3);
                    this.e0 = null;
                }
            } else if (this.a0 && this.d0 != null) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                float f11 = d6Var.c;
                int i13 = 0;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        i13 = -1;
                        break;
                    }
                    s sVar2 = ((d0) arrayList.get(i13)).h;
                    int i14 = sVar2.c;
                    int i15 = sVar2.b;
                    float f12 = d6VarArr[i14].c;
                    rectF.set((getMeasuredWidth() / f12) * i15, (getMeasuredHeight() / f11) * i14, (getMeasuredWidth() / f12) * (i15 + 1), (getMeasuredHeight() / f11) * (i14 + 1));
                    if (rectF.contains(x10, y10)) {
                        break;
                    }
                    i13++;
                }
                int indexOf = arrayList.indexOf(this.d0);
                if (i13 >= 0 && indexOf >= 0 && i13 != indexOf) {
                    Collections.swap(arrayList, indexOf, i13);
                    o(this.f);
                    this.b0 = true;
                    invalidate();
                    float f13 = this.f.c;
                    s sVar3 = this.d0.h;
                    int i16 = sVar3.c;
                    int i17 = sVar3.b;
                    float f14 = d6VarArr[i16].c;
                    rectF.set((getMeasuredWidth() / f14) * i17, (getMeasuredHeight() / f13) * i16, (getMeasuredWidth() / f14) * (i17 + 1), (getMeasuredHeight() / f13) * (i16 + 1));
                    this.T = this.V;
                    this.U = this.W;
                    this.R = rectF.centerX();
                    this.S = rectF.centerY();
                }
                this.V = motionEvent.getX() - this.R;
                this.W = motionEvent.getY() - this.S;
                invalidate();
            } else if (this.c0 != d0Var) {
                this.c0 = null;
                a0 a0Var4 = this.e0;
                if (a0Var4 == null) {
                    return true;
                }
                AndroidUtilities.cancelRunOnUIThread(a0Var4);
                this.e0 = null;
                return true;
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.c0 != null) {
                this.c0 = null;
                this.a0 = false;
                invalidate();
                a0 a0Var5 = this.e0;
                if (a0Var5 == null) {
                    return true;
                }
                AndroidUtilities.cancelRunOnUIThread(a0Var5);
                this.e0 = null;
                return true;
            }
        } else if (motionEvent.getAction() == 3 && d()) {
            return true;
        }
        return this.c0 != null || super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.d && AndroidUtilities.makingGlobalBlurBitmap) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e() {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((d0) obj).a(null);
        }
        q();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(Canvas canvas, RectF rectF, d0 d0Var) {
        boolean z10;
        CameraView cameraView;
        ImageView imageView;
        if (AndroidUtilities.makingGlobalBlurBitmap && d0Var == this.f0) {
            return;
        }
        if (d0Var == this.d0) {
            org.telegram.ui.Components.d6 d6Var = this.G;
            if (d6Var.c > 0.0f) {
                canvas.save();
                Path path = this.M;
                path.rewind();
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(rectF);
                rectF2.inset(AndroidUtilities.dp(10.0f) * d6Var.c, AndroidUtilities.dp(10.0f) * d6Var.c);
                float dp = AndroidUtilities.dp(12.0f) * d6Var.c;
                path.addRoundRect(rectF2, dp, dp, Path.Direction.CW);
                canvas.clipPath(path);
                z10 = true;
                if (d0Var != null) {
                    ImageReceiver imageReceiver = d0Var.c;
                    if (d0Var.n != null) {
                        TextureView textureView = d0Var.e;
                        if (textureView == null || !d0Var.f) {
                            imageReceiver.setImageCoords(rectF.left, rectF.top, rectF.width(), rectF.height());
                            if (!imageReceiver.draw(canvas)) {
                                CameraView cameraView2 = this.d;
                                if (cameraView2 == null && this.O) {
                                    f(canvas, this.N, rectF, 0.0f);
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
                if ((d0Var == null && d0Var.m) || AndroidUtilities.makingGlobalBlurBitmap) {
                    CameraView cameraView3 = this.d;
                    if (cameraView3 == null && this.O) {
                        f(canvas, this.N, rectF, (d0Var == null || !d0Var.m) ? 0.4f : 0.0f);
                    } else {
                        h((d0Var == null || !d0Var.m) ? 0.4f : 0.0f, canvas, rectF, cameraView3);
                    }
                } else {
                    setCameraNeedsBlur(!this.j0);
                    if (this.e == null && Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
                        RenderNode c3 = org.telegram.messenger.b.c(this.e);
                        float max = Math.max(rectF.width() / c3.getWidth(), rectF.height() / c3.getHeight());
                        canvas.save();
                        canvas.translate(rectF.left, rectF.top);
                        canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                        canvas.scale(max, max);
                        canvas.drawRenderNode(c3);
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
        if (d0Var != null) {
        }
        if (d0Var == null) {
        }
        setCameraNeedsBlur(!this.j0);
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
        if (this.J == null && Build.VERSION.SDK_INT >= 31) {
            this.J = new RenderNode("CameraViewRenderNode");
            RenderNode renderNode = new RenderNode("CameraViewRenderNodeBlur");
            this.K = renderNode;
            float dp = AndroidUtilities.dp(32.0f);
            float dp2 = AndroidUtilities.dp(32.0f);
            tileMode = Shader.TileMode.DECAL;
            renderNode.setRenderEffect(RenderEffect.createBlurEffect(dp, dp2, tileMode));
        }
        return this.K;
    }

    public ArrayList<o7> getContent() {
        ArrayList<o7> arrayList = new ArrayList<>();
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            o7 o7Var = ((d0) obj).n;
            if (o7Var != null) {
                arrayList.add(o7Var);
            }
        }
        return arrayList;
    }

    public d0 getCurrent() {
        return this.r;
    }

    public long getDuration() {
        d0 mainPart;
        o7 o7Var;
        if (!this.j0 || (mainPart = getMainPart()) == null || (o7Var = mainPart.n) == null) {
            return 1L;
        }
        return Math.max(Math.min((long) ((o7Var.W - o7Var.V) * o7Var.h0), 59500L), 1L);
    }

    public int getFilledCount() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                return i11;
            }
            if (((d0) arrayList.get(i10)).n != null) {
                i11++;
            }
            i10++;
        }
    }

    public float getFilledProgress() {
        return getFilledCount() / getTotalCount();
    }

    public t getLayout() {
        return this.f;
    }

    public d0 getMainPart() {
        d0 d0Var = null;
        if (!this.j0) {
            return null;
        }
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = 0;
        long j10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            d0 d0Var2 = (d0) obj;
            o7 o7Var = d0Var2.n;
            if (o7Var != null && o7Var.K) {
                long j11 = o7Var.h0;
                cg.v2 v2Var = d0Var2.d;
                if (v2Var != null && v2Var.getDuration() > 0) {
                    j11 = d0Var2.d.getDuration();
                }
                if (j11 > j10) {
                    d0Var = d0Var2;
                    j10 = j11;
                }
            }
        }
        return d0Var;
    }

    public d0 getNext() {
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
            i10 = th.d(((d0) arrayList2.get(i10)).a, i10, 1, arrayList);
        }
    }

    public long getPosition() {
        if (!this.j0) {
            return 0L;
        }
        if (!this.m0) {
            return this.q0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.k0;
        if (j10 > getDuration()) {
            this.k0 = currentTimeMillis - (j10 % getDuration());
        }
        return j10;
    }

    public long getPositionWithOffset() {
        long j10 = 0;
        if (!this.j0) {
            return 0L;
        }
        getPosition();
        d0 mainPart = getMainPart();
        if (mainPart != null) {
            o7 o7Var = mainPart.n;
            j10 = o7Var.X + ((long) (o7Var.V * o7Var.h0));
        }
        return getPosition() + j10;
    }

    public int getTotalCount() {
        return this.h.size();
    }

    public final void h(float f9, Canvas canvas, RectF rectF, View view) {
        i6 i6Var;
        Bitmap bitmap;
        if (view == null) {
            return;
        }
        float max = Math.max(rectF.width() / view.getWidth(), rectF.height() / view.getHeight());
        canvas.save();
        canvas.translate(rectF.centerX(), rectF.centerY());
        canvas.clipRect((-rectF.width()) / 2.0f, (-rectF.height()) / 2.0f, rectF.width() / 2.0f, rectF.height() / 2.0f);
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
        if (f9 > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.g6.l1(view.getAlpha() * f9, -16777216));
        }
        canvas.restore();
        if (view != this.d || (i6Var = this.c) == null) {
            return;
        }
        Paint paint = i6Var.i;
        org.telegram.ui.Components.d6[] d6VarArr = i6Var.h;
        org.telegram.ui.Components.d6[] d6VarArr2 = i6Var.g;
        Path path = i6Var.j;
        h6 h6Var = i6Var.c;
        if (h6Var == null || h6Var.b.length <= 0) {
            return;
        }
        float e10 = i6Var.d.e(i6Var.b);
        float d = i6Var.e.d(i6Var.c.c, false);
        float width = (rectF.width() * d) + rectF.left;
        float d10 = i6Var.f.d(i6Var.c.d, false);
        float height = (rectF.height() * d10) + rectF.top;
        float lerp = AndroidUtilities.lerp(0.5f, 1.1f, e10);
        canvas.save();
        canvas.scale(lerp, lerp, width, height);
        if (e10 > 0.0f) {
            path.rewind();
            int min = Math.min(4, i6Var.c.b.length);
            int i10 = 0;
            while (i10 < min) {
                int i11 = i10 - 1;
                if (i11 < 0) {
                    i11 = min - 1;
                }
                int i12 = i10 + 1;
                int i13 = i12 >= min ? 0 : i12;
                h6 h6Var2 = i6Var.c;
                PointF[] pointFArr = h6Var2.b;
                PointF pointF = pointFArr[i11];
                int i14 = min;
                PointF pointF2 = pointFArr[i10];
                org.telegram.ui.Components.d6[] d6VarArr3 = d6VarArr;
                PointF pointF3 = pointFArr[i13];
                org.telegram.ui.Components.d6[] d6VarArr4 = d6VarArr2;
                float f10 = e10;
                float width2 = (rectF.width() * (d6VarArr4[i11].d(pointF.x - h6Var2.c, false) + d)) + rectF.left;
                float height2 = (rectF.height() * (d6VarArr3[i11].d(pointF.y - i6Var.c.d, false) + d10)) + rectF.top;
                float width3 = (rectF.width() * (d6VarArr4[i10].d(pointF2.x - i6Var.c.c, false) + d)) + rectF.left;
                float height3 = (rectF.height() * (d6VarArr3[i10].d(pointF2.y - i6Var.c.d, false) + d10)) + rectF.top;
                float width4 = (rectF.width() * (d6VarArr4[i13].d(pointF3.x - i6Var.c.c, false) + d)) + rectF.left;
                float height4 = ((rectF.height() * (d6VarArr3[i13].d(pointF3.y - i6Var.c.d, false) + d10)) + rectF.top) - height3;
                path.moveTo(((width2 - width3) * 0.18f) + width3, ((height2 - height3) * 0.18f) + height3);
                path.lineTo(width3, height3);
                path.lineTo(((width4 - width3) * 0.18f) + width3, (height4 * 0.18f) + height3);
                d6VarArr2 = d6VarArr4;
                i10 = i12;
                min = i14;
                d6VarArr = d6VarArr3;
                e10 = f10;
            }
            paint.setAlpha((int) (e10 * 255.0f));
            canvas.drawPath(path, paint);
        }
        canvas.restore();
    }

    public final void i(Canvas canvas) {
        if (this.J == null || Build.VERSION.SDK_INT < 29 || !canvas.isHardwareAccelerated()) {
            return;
        }
        RenderNode c3 = org.telegram.messenger.b.c(this.J);
        c3.endRecording();
        canvas.drawRenderNode(c3);
        Object obj = this.K;
        if (obj != null) {
            RenderNode c6 = org.telegram.messenger.b.c(obj);
            c6.setPosition(0, 0, getWidth(), getHeight());
            c6.beginRecording().drawRenderNode(c3);
            c6.endRecording();
        }
    }

    public final boolean j() {
        return this.f.e.size() > 1;
    }

    public final void k(RectF rectF, s sVar) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            Point point = AndroidUtilities.displaySize;
            int i10 = point.x;
            measuredHeight = point.y;
            measuredWidth = i10;
        }
        float f9 = measuredWidth;
        t tVar = sVar.a;
        int[] iArr = tVar.d;
        int i11 = sVar.c;
        int i12 = iArr[i11];
        int i13 = sVar.b;
        float f10 = measuredHeight;
        int i14 = tVar.c;
        rectF.set((f9 / i12) * i13, (f10 / i14) * i11, (f9 / i12) * (i13 + 1), (f10 / i14) * (i11 + 1));
    }

    public final boolean l(o7 o7Var) {
        if (o7Var.K) {
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                Object obj = arrayList.get(i10);
                i10++;
                o7 o7Var2 = ((d0) obj).n;
                if (o7Var2 != null && o7Var2.K && o7Var2.P > 0.0f) {
                    o7Var.P = 0.0f;
                    break;
                }
            }
        }
        d0 d0Var = this.r;
        if (d0Var != null) {
            d0Var.a(o7Var);
        }
        q();
        requestLayout();
        return this.r == null;
    }

    public final void m(long j10, boolean z10) {
        if (this.j0) {
            long clamp = Utilities.clamp(j10, getDuration(), 0L);
            if (!this.m0) {
                this.q0 = clamp;
            }
            this.k0 = System.currentTimeMillis() - clamp;
            this.l0 = z10;
            if (this.j0) {
                a0 a0Var = this.s0;
                AndroidUtilities.cancelRunOnUIThread(a0Var);
                a0Var.run();
            }
        }
    }

    public final void n(o7 o7Var) {
        if (o7Var == null || o7Var.T == null) {
            e();
            return;
        }
        o(o7Var.S);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((d0) arrayList.get(i10)).a((o7) o7Var.T.get(i10));
            i10++;
        }
    }

    public final void o(t tVar) {
        if (tVar == null) {
            tVar = new t(".");
        }
        ArrayList arrayList = tVar.e;
        this.f = tVar;
        a0 a0Var = this.D;
        AndroidUtilities.cancelRunOnUIThread(a0Var);
        int i10 = 0;
        while (true) {
            int size = arrayList.size();
            ArrayList arrayList2 = this.h;
            if (i10 >= Math.max(size, arrayList2.size())) {
                q();
                invalidate();
                AndroidUtilities.runOnUIThread(a0Var, 360L);
                return;
            }
            s sVar = i10 < arrayList.size() ? (s) arrayList.get(i10) : null;
            d0 d0Var = i10 < arrayList2.size() ? (d0) arrayList2.get(i10) : null;
            if (d0Var == null && sVar != null) {
                d0 d0Var2 = new d0(this);
                if (this.g0) {
                    d0Var2.c.onAttachedToWindow();
                }
                d0Var2.b(sVar, true);
                arrayList2.add(d0Var2);
            } else if (sVar != null) {
                d0Var.b(sVar, true);
            } else if (d0Var != null) {
                this.n.add(d0Var);
                arrayList2.remove(d0Var);
                d0Var.b(null, true);
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
                this.g0 = true;
                return;
            } else {
                ((d0) arrayList.get(i10)).c.onAttachedToWindow();
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
                this.g0 = false;
                AndroidUtilities.cancelRunOnUIThread(this.s0);
                return;
            } else {
                ((d0) arrayList.get(i10)).c.onDetachedFromWindow();
                i10++;
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        d0 d0Var;
        o7 o7Var;
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
                        d0Var = null;
                        break;
                    } else {
                        if (childAt == ((d0) arrayList.get(i15)).e) {
                            d0Var = (d0) arrayList.get(i15);
                            break;
                        }
                        i15++;
                    }
                }
                if (d0Var == null || (o7Var = d0Var.n) == null || (i12 = o7Var.k0) <= 0 || (i13 = o7Var.l0) <= 0) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                } else {
                    if (o7Var.Q % 90 == 1) {
                        i13 = i12;
                        i12 = i13;
                    }
                    float f9 = i12;
                    float f10 = i13;
                    float min = Math.min(1.0f, Math.max(f9 / size, f10 / size2));
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (f9 * min), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (f10 * min), TLObject.FLAG_30));
                }
            }
        }
    }

    public final void p() {
        CameraView cameraView = this.d;
        boolean z10 = cameraView != null && this.Q;
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
            d0 d0Var = (d0) arrayList.get(i10);
            if (d0Var.n == null) {
                if (this.r != null) {
                    this.s = d0Var;
                    break;
                }
                this.r = d0Var;
            }
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            d0 d0Var2 = (d0) arrayList.get(i11);
            d0Var2.m = d0Var2 == this.r;
        }
    }

    public void setCameraNeedsBlur(boolean z10) {
        if (this.Q == z10) {
            return;
        }
        this.Q = z10;
        p();
    }

    public void setCameraThumb(Drawable drawable) {
        this.N = drawable;
        invalidate();
    }

    public void setCameraThumbVisible(boolean z10) {
        this.O = z10;
        invalidate();
    }

    public void setCameraView(CameraView cameraView) {
        CameraView cameraView2 = this.d;
        if (cameraView2 != cameraView && cameraView2 != null) {
            cameraView2.unlistenDraw(new a0(this, 1));
            AndroidUtilities.removeFromParent(this.d);
            this.d = null;
            p();
        }
        this.d = cameraView;
        if (cameraView != null) {
            addView(cameraView, i7.f6.e(-1, -1, 119));
        }
        CameraView cameraView3 = this.d;
        if (cameraView3 != null) {
            cameraView3.unlistenDraw(new a0(this, 1));
        }
        this.d = cameraView;
        if (cameraView != null) {
            cameraView.listenDraw(new a0(this, 1));
        }
        p();
        invalidate();
    }

    public void setCancelGestures(Runnable runnable) {
        this.h0 = runnable;
    }

    public void setMuted(boolean z10) {
        if (this.r0 == z10) {
            return;
        }
        this.r0 = z10;
    }

    public void setOnCameraThumbClick(Runnable runnable) {
        this.P = runnable;
    }

    public void setPlaying(boolean z10) {
        boolean z11 = this.p0;
        this.p0 = true;
        if (this.m0 == z10) {
            return;
        }
        this.m0 = z10;
        if (!z10) {
            this.q0 = getPosition();
        } else if (z11) {
            m(this.q0, false);
        } else {
            this.l0 = false;
        }
        if (this.j0) {
            a0 a0Var = this.s0;
            AndroidUtilities.cancelRunOnUIThread(a0Var);
            a0Var.run();
        }
    }

    public void setPreview(boolean z10) {
        if (this.j0 == z10) {
            return;
        }
        this.j0 = z10;
        ArrayList arrayList = this.h;
        int i10 = 0;
        if (z10) {
            org.telegram.ui.Components.ga gaVar = this.C;
            if (gaVar != null) {
                gaVar.d();
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((d0) arrayList.get(i11)).a = i11;
            }
        }
        this.l0 = false;
        this.q0 = 0L;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            d0 d0Var = (d0) obj;
            cg.v2 v2Var = d0Var.d;
            if (v2Var != null) {
                v2Var.setAudioEnabled(z10, true);
                if (!z10 || this.m0) {
                    d0Var.d.play();
                } else {
                    d0Var.d.pause();
                }
            }
        }
        a0 a0Var = this.s0;
        AndroidUtilities.cancelRunOnUIThread(a0Var);
        if (z10) {
            this.k0 = System.currentTimeMillis();
            AndroidUtilities.runOnUIThread(a0Var, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
        }
    }

    public void setPreviewView(f6 f6Var) {
        this.o0 = f6Var;
    }

    public void setResetState(Runnable runnable) {
        this.i0 = runnable;
    }

    public void setTimelineView(qb qbVar) {
        this.n0 = qbVar;
    }
}
