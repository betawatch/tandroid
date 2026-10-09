package ci;

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
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.o80;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public abstract class e0 extends FrameLayout implements o80 {
    public static final /* synthetic */ int x0 = 0;
    public final LinearGradient E;
    public final Matrix F;
    public final org.telegram.ui.Components.ma G;
    public final a0 H;
    public final org.telegram.ui.Components.g6 I;
    public final org.telegram.ui.Components.g6[] J;
    public final org.telegram.ui.Components.g6 K;
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
    public final ai.d b;
    public float b0;
    public final e7 c;
    public float c0;
    public CameraView d;
    public float d0;
    public Object e;
    public boolean e0;
    public t f;
    public boolean f0;
    public d0 g0;
    public final ArrayList h;
    public d0 h0;
    public a0 i0;
    public d0 j0;
    public boolean k0;
    public Runnable l0;
    public Runnable m0;
    public final ArrayList n;
    public boolean n0;
    public long o0;
    public boolean p0;
    public boolean q0;
    public d0 r;
    public wc r0;
    public d0 s;
    public b7 s0;
    public boolean t0;
    public long u0;
    public final Paint v;
    public boolean v0;
    public final Path w;
    public final a0 w0;
    public final float[] x;
    public final int y;

    public e0(Context context, org.telegram.ui.Components.ma maVar, FrameLayout frameLayout, ai.d dVar) {
        super(context);
        this.c = new e7(new a0(this, 1));
        this.f = new t(".");
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        this.n = new ArrayList();
        Paint paint = new Paint(1);
        this.v = paint;
        this.w = new Path();
        this.x = new float[8];
        this.H = new a0(this, 2);
        hs hsVar = hs.h;
        this.I = new org.telegram.ui.Components.g6(this, 0L, 320L, hsVar);
        this.J = new org.telegram.ui.Components.g6[]{new org.telegram.ui.Components.g6(this, 0L, 320L, hsVar), new org.telegram.ui.Components.g6(this, 0L, 320L, hsVar), new org.telegram.ui.Components.g6(this, 0L, 320L, hsVar), new org.telegram.ui.Components.g6(this, 0L, 320L, hsVar), new org.telegram.ui.Components.g6(this, 0L, 320L, hsVar)};
        this.K = new org.telegram.ui.Components.g6(this, 0L, 320L, hsVar);
        this.L = new float[5];
        this.M = new float[5];
        this.P = new RectF();
        this.Q = new Path();
        this.S = true;
        this.q0 = true;
        this.t0 = true;
        this.w0 = new a0(this, 3);
        this.G = maVar;
        this.a = frameLayout;
        this.b = dVar;
        setBackgroundColor(-14737633);
        d0 d0Var = new d0(this);
        d0Var.b((s) this.f.e.get(0), false);
        d0Var.m = true;
        if (this.k0) {
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
        this.E = linearGradient;
        this.F = new Matrix();
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
            canvas.drawColor(org.telegram.ui.ActionBar.i6.m1(drawable.getAlpha() * f7, -16777216));
        }
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.o80
    public final void a(RectF rectF) {
        d0 d0Var = this.j0;
        if (d0Var == null) {
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            return;
        }
        s sVar = d0Var.h;
        t tVar = sVar.a;
        int i10 = sVar.b;
        int i11 = sVar.c;
        float f7 = tVar.c;
        float d = this.J[i11].d(tVar.d[i11], false);
        rectF.set((getMeasuredWidth() / d) * i10, (getMeasuredHeight() / f7) * i11, (getMeasuredWidth() / d) * (i10 + 1), (getMeasuredHeight() / f7) * (i11 + 1));
    }

    @Override // org.telegram.ui.Components.o80
    public final void b(Canvas canvas, float f7) {
        d0 d0Var = this.j0;
        if (d0Var != null) {
            s sVar = d0Var.h;
            t tVar = sVar.a;
            int i10 = sVar.b;
            int i11 = sVar.c;
            float f10 = tVar.c;
            float d = this.J[i11].d(tVar.d[i11], false);
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
        a0 a0Var = this.i0;
        if (a0Var == null) {
            return true;
        }
        AndroidUtilities.cancelRunOnUIThread(a0Var);
        this.i0 = null;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        double d;
        float[] fArr;
        float[] fArr2;
        float f7;
        ArrayList arrayList;
        float f10;
        float f11;
        RectF rectF;
        float f12;
        org.telegram.ui.Components.ma maVar;
        d0 d0Var;
        int i10;
        if (this.N == null || Build.VERSION.SDK_INT < 29 || !canvas.isHardwareAccelerated()) {
            canvas2 = canvas;
        } else {
            RenderNode c10 = org.telegram.messenger.b.c(this.N);
            c10.setPosition(0, 0, getWidth(), getHeight());
            canvas2 = c10.beginRecording();
        }
        super.dispatchDraw(canvas2);
        boolean j3 = j();
        org.telegram.ui.Components.g6 g6Var = this.I;
        org.telegram.ui.Components.g6[] g6VarArr = this.J;
        float f13 = 0.0f;
        if (!j3 && !this.f0 && !this.e0) {
            float f14 = g6Var.c;
            t tVar = this.f;
            if (f14 == tVar.c && g6VarArr[0].c == tVar.d[0]) {
                e7 e7Var = this.c;
                if (!e7Var.a && ((org.telegram.ui.Components.g6) e7Var.d).c <= 0.0f) {
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
        float e7 = this.K.e(this.e0);
        float d10 = g6Var.d(this.f.c, false);
        int i11 = 0;
        while (true) {
            double d11 = i11;
            d = d10;
            double ceil = Math.ceil(d);
            fArr = this.M;
            fArr2 = this.L;
            if (d11 >= ceil) {
                break;
            }
            fArr2[i11] = getMeasuredWidth();
            fArr[i11] = 0.0f;
            i11++;
        }
        int i12 = this.f.c;
        while (true) {
            f7 = 1.0f;
            if (i12 >= g6VarArr.length) {
                break;
            }
            g6VarArr[i12].d(1.0f, false);
            i12++;
        }
        int i13 = 0;
        boolean z10 = false;
        float f15 = 0.0f;
        while (true) {
            arrayList = this.h;
            f10 = f7;
            int size = arrayList.size();
            f11 = f13;
            rectF = this.P;
            if (i13 >= size) {
                break;
            }
            d0 d0Var2 = (d0) arrayList.get(i13);
            s sVar = d0Var2.h;
            int i14 = sVar.c;
            float f16 = e7;
            int i15 = sVar.b;
            float f17 = d10;
            org.telegram.ui.Components.g6[] g6VarArr2 = g6VarArr;
            float d12 = g6VarArr[i14].d(sVar.a.d[i14], false);
            if (this.f0 || this.e0) {
                i10 = i14;
                AndroidUtilities.lerp(d0Var2.j, d0Var2.k, d0Var2.l, rectF);
            } else {
                i10 = i14;
                rectF.set((getMeasuredWidth() / d12) * i15, (getMeasuredHeight() / f17) * i14, (getMeasuredWidth() / d12) * (i15 + 1), (getMeasuredHeight() / f17) * (i10 + 1));
            }
            fArr2[i10] = Math.min(fArr2[i10], rectF.left);
            fArr[i10] = Math.max(fArr[i10], rectF.right);
            f15 = Math.max(f15, rectF.bottom);
            if (f16 <= f11 || d0Var2 != this.h0) {
                if (this.n0 && d0Var2.d != null) {
                    z10 = true;
                }
                g(canvas2, rectF, d0Var2);
            }
            i13++;
            f7 = f10;
            f13 = f11;
            e7 = f16;
            d10 = f17;
            g6VarArr = g6VarArr2;
        }
        float f18 = e7;
        float f19 = d10;
        org.telegram.ui.Components.g6[] g6VarArr3 = g6VarArr;
        int i16 = 0;
        while (true) {
            ArrayList arrayList2 = this.n;
            if (i16 >= arrayList2.size()) {
                break;
            }
            d0 d0Var3 = (d0) arrayList2.get(i16);
            s sVar2 = d0Var3.h;
            int i17 = sVar2.c;
            int i18 = sVar2.b;
            int i19 = i16;
            float d13 = g6VarArr3[i17].d(i17 >= this.f.d.length ? f10 : r13[i17], false);
            rectF.set((getMeasuredWidth() / d13) * i18, (getMeasuredHeight() / f19) * i17, (getMeasuredWidth() / d13) * (i18 + 1), (i17 + 1) * (getMeasuredHeight() / f19));
            fArr2[i17] = Math.min(fArr2[i17], rectF.left);
            fArr[i17] = Math.max(fArr[i17], rectF.right);
            f15 = Math.max(f15, rectF.bottom);
            if (this.n0 && d0Var3.d != null) {
                z10 = true;
            }
            g(canvas2, rectF, d0Var3);
            i16 = i19 + 1;
        }
        if (this.e0) {
            f12 = f11;
        } else {
            int i20 = 0;
            while (i20 < Math.ceil(d)) {
                if (fArr2[i20] >= f11) {
                    rectF.set(f11, (getMeasuredHeight() / f19) * i20, fArr2[i20], (getMeasuredHeight() / f19) * (i20 + 1));
                    g(canvas2, rectF, null);
                }
                if (fArr[i20] < getMeasuredWidth()) {
                    rectF.set(fArr[i20], (getMeasuredHeight() / f19) * i20, getMeasuredWidth(), (getMeasuredHeight() / f19) * (i20 + 1));
                    g(canvas2, rectF, null);
                }
                i20++;
                f11 = 0.0f;
            }
            if (f15 < getMeasuredHeight()) {
                f12 = 0.0f;
                rectF.set(0.0f, f15, getMeasuredWidth(), getMeasuredHeight());
                g(canvas2, rectF, null);
            } else {
                f12 = 0.0f;
            }
        }
        if (f18 > f12 && (d0Var = this.h0) != null) {
            s sVar3 = d0Var.h;
            int i21 = sVar3.c;
            int i22 = sVar3.b;
            float d14 = g6VarArr3[i21].d(this.f.d[i21], false);
            if (this.e0) {
                AndroidUtilities.lerp(d0Var.j, d0Var.k, d0Var.l, rectF);
            } else {
                rectF.set((getMeasuredWidth() / d14) * i22, (getMeasuredHeight() / f19) * i21, (getMeasuredWidth() / d14) * (i22 + 1), (getMeasuredHeight() / f19) * (i21 + 1));
            }
            canvas2.save();
            canvas2.translate(AndroidUtilities.lerp(this.a0, this.c0, d0Var.l) * f18, AndroidUtilities.lerp(this.b0, this.d0, d0Var.l) * f18);
            g(canvas2, rectF, d0Var);
            canvas2.restore();
        }
        for (int i23 = 0; i23 < arrayList.size(); i23++) {
            d0 d0Var4 = (d0) arrayList.get(i23);
            s sVar4 = d0Var4.h;
            float d15 = d0Var4.b.d(0.0f, false);
            if (d15 > 0.0f) {
                int i24 = sVar4.c;
                int i25 = sVar4.c;
                int i26 = sVar4.b;
                float d16 = g6VarArr3[i24].d(sVar4.a.d[i24], false);
                if (this.f0 || this.e0) {
                    AndroidUtilities.lerp(d0Var4.j, d0Var4.k, d0Var4.l, rectF);
                } else {
                    rectF.set((getMeasuredWidth() / d16) * i26, (getMeasuredHeight() / f19) * i25, (getMeasuredWidth() / d16) * (i26 + 1), (getMeasuredHeight() / f19) * (i25 + 1));
                }
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(rectF);
                rectF2.inset(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                Matrix matrix = this.F;
                matrix.reset();
                float f20 = rectF.left;
                int i27 = this.y;
                int i28 = i27 * i27;
                matrix.postTranslate(AndroidUtilities.lerp(((float) Math.sqrt(i28 + i28)) * (-1.4f), (float) Math.sqrt((rectF.height() * rectF.height()) + (rectF.width() * rectF.width())), f10 - d15) + f20, 0.0f);
                matrix.postRotate(-25.0f);
                this.E.setLocalMatrix(matrix);
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
        if (z10 && (maVar = this.G) != null) {
            maVar.d();
        }
        i(canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0244, code lost:
    
        if (d() != false) goto L67;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ArrayList arrayList;
        org.telegram.ui.Components.g6[] g6VarArr;
        RectF rectF;
        boolean z10;
        d0 d0Var;
        a0 a0Var;
        if (!j() || this.n0) {
            d();
            return false;
        }
        boolean z11 = true;
        if (motionEvent.getPointerCount() > 1) {
            d();
            return false;
        }
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        org.telegram.ui.Components.g6 g6Var = this.I;
        float f7 = g6Var.c;
        int i10 = 0;
        while (true) {
            arrayList = this.h;
            int size = arrayList.size();
            g6VarArr = this.J;
            rectF = this.P;
            if (i10 >= size) {
                z10 = z11;
                d0Var = null;
                break;
            }
            d0Var = (d0) arrayList.get(i10);
            s sVar = d0Var.h;
            int i11 = sVar.c;
            int i12 = sVar.b;
            float f10 = g6VarArr[i11].c;
            z10 = z11;
            rectF.set((getMeasuredWidth() / f10) * i12, (getMeasuredHeight() / f7) * i11, (getMeasuredWidth() / f10) * (i12 + 1), (getMeasuredHeight() / f7) * (i11 + 1));
            if (rectF.contains(x10, y3)) {
                break;
            }
            i10++;
            z11 = z10;
        }
        if (motionEvent.getAction() == 0) {
            this.V = motionEvent.getX();
            this.W = motionEvent.getY();
            this.e0 = false;
            this.c0 = 0.0f;
            this.a0 = 0.0f;
            this.d0 = 0.0f;
            this.b0 = 0.0f;
            this.g0 = d0Var;
            if (d0Var != null) {
                a0 a0Var2 = new a0(this, 0);
                this.i0 = a0Var2;
                AndroidUtilities.runOnUIThread(a0Var2, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 2) {
            if (v7.z6.a(motionEvent.getX(), motionEvent.getY(), this.V, this.W) > AndroidUtilities.touchSlop * 1.2f && (a0Var = this.i0) != null) {
                AndroidUtilities.cancelRunOnUIThread(a0Var);
                this.i0 = null;
            }
            if (!this.e0 && getFilledProgress() >= 1.0f && this.g0 != null && d0Var != null && v7.z6.a(motionEvent.getX(), motionEvent.getY(), this.V, this.W) > AndroidUtilities.touchSlop * 1.2f) {
                this.e0 = z10;
                this.h0 = this.g0;
                this.c0 = 0.0f;
                this.a0 = 0.0f;
                this.d0 = 0.0f;
                this.b0 = 0.0f;
                invalidate();
                a0 a0Var3 = this.i0;
                if (a0Var3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(a0Var3);
                    this.i0 = null;
                }
            } else if (this.e0 && this.h0 != null) {
                float x11 = motionEvent.getX();
                float y10 = motionEvent.getY();
                float f11 = g6Var.c;
                int i13 = 0;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        i13 = -1;
                        break;
                    }
                    s sVar2 = ((d0) arrayList.get(i13)).h;
                    int i14 = sVar2.c;
                    int i15 = sVar2.b;
                    float f12 = g6VarArr[i14].c;
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
                    s sVar3 = this.h0.h;
                    int i16 = sVar3.c;
                    int i17 = sVar3.b;
                    float f14 = g6VarArr[i16].c;
                    rectF.set((getMeasuredWidth() / f14) * i17, (getMeasuredHeight() / f13) * i16, (getMeasuredWidth() / f14) * (i17 + 1), (getMeasuredHeight() / f13) * (i16 + 1));
                    this.a0 = this.c0;
                    this.b0 = this.d0;
                    this.V = rectF.centerX();
                    this.W = rectF.centerY();
                }
                this.c0 = motionEvent.getX() - this.V;
                this.d0 = motionEvent.getY() - this.W;
                invalidate();
            } else if (this.g0 != d0Var) {
                this.g0 = null;
                a0 a0Var4 = this.i0;
                if (a0Var4 != null) {
                    AndroidUtilities.cancelRunOnUIThread(a0Var4);
                    this.i0 = null;
                    return true;
                }
            }
        } else {
            boolean z12 = z10;
            if (motionEvent.getAction() == z12) {
                if (this.g0 != null) {
                    this.g0 = null;
                    this.e0 = false;
                    invalidate();
                    a0 a0Var5 = this.i0;
                    if (a0Var5 == null) {
                        return z12;
                    }
                    AndroidUtilities.cancelRunOnUIThread(a0Var5);
                    this.i0 = null;
                    return z12;
                }
            } else if (motionEvent.getAction() == 3) {
            }
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
            ((d0) obj).a(null);
        }
        q();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(Canvas canvas, RectF rectF, d0 d0Var) {
        boolean z10;
        CameraView cameraView;
        ImageView imageView;
        if (AndroidUtilities.makingGlobalBlurBitmap && d0Var == this.j0) {
            return;
        }
        if (d0Var == this.h0) {
            org.telegram.ui.Components.g6 g6Var = this.K;
            if (g6Var.c > 0.0f) {
                canvas.save();
                Path path = this.Q;
                path.rewind();
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(rectF);
                rectF2.inset(AndroidUtilities.dp(10.0f) * g6Var.c, AndroidUtilities.dp(10.0f) * g6Var.c);
                float dp = AndroidUtilities.dp(12.0f) * g6Var.c;
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
                if ((d0Var == null && d0Var.m) || AndroidUtilities.makingGlobalBlurBitmap) {
                    CameraView cameraView3 = this.d;
                    if (cameraView3 == null && this.S) {
                        f(canvas, this.R, rectF, (d0Var == null || !d0Var.m) ? 0.4f : 0.0f);
                    } else {
                        h((d0Var == null || !d0Var.m) ? 0.4f : 0.0f, canvas, rectF, cameraView3);
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
        if (d0Var != null) {
        }
        if (d0Var == null) {
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

    public ArrayList<l8> getContent() {
        ArrayList<l8> arrayList = new ArrayList<>();
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            l8 l8Var = ((d0) obj).n;
            if (l8Var != null) {
                arrayList.add(l8Var);
            }
        }
        return arrayList;
    }

    public d0 getCurrent() {
        return this.r;
    }

    public long getDuration() {
        d0 mainPart;
        l8 l8Var;
        if (!this.n0 || (mainPart = getMainPart()) == null || (l8Var = mainPart.n) == null) {
            return 1L;
        }
        return Math.max(Math.min((long) ((l8Var.W - l8Var.V) * l8Var.h0), 59500L), 1L);
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
            d0 d0Var2 = (d0) obj;
            l8 l8Var = d0Var2.n;
            if (l8Var != null && l8Var.K) {
                long j10 = l8Var.h0;
                c0 c0Var = d0Var2.d;
                if (c0Var != null && c0Var.getDuration() > 0) {
                    j10 = d0Var2.d.getDuration();
                }
                if (j10 > j3) {
                    d0Var = d0Var2;
                    j3 = j10;
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
            i10 = com.google.android.gms.internal.vision.e2.e(((d0) arrayList2.get(i10)).a, i10, 1, arrayList);
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
        d0 mainPart = getMainPart();
        if (mainPart != null) {
            l8 l8Var = mainPart.n;
            j3 = l8Var.X + ((long) (l8Var.V * l8Var.h0));
        }
        return getPosition() + j3;
    }

    public int getTotalCount() {
        return this.h.size();
    }

    public final void h(float f7, Canvas canvas, RectF rectF, View view) {
        e7 e7Var;
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
            canvas.drawColor(org.telegram.ui.ActionBar.i6.m1(view.getAlpha() * f7, -16777216));
        }
        canvas.restore();
        if (view != this.d || (e7Var = this.c) == null) {
            return;
        }
        Paint paint = (Paint) e7Var.i;
        org.telegram.ui.Components.g6[] g6VarArr = (org.telegram.ui.Components.g6[]) e7Var.h;
        org.telegram.ui.Components.g6[] g6VarArr2 = (org.telegram.ui.Components.g6[]) e7Var.g;
        Path path = (Path) e7Var.j;
        d7 d7Var = (d7) e7Var.c;
        if (d7Var == null || d7Var.b.length <= 0) {
            return;
        }
        float e7 = ((org.telegram.ui.Components.g6) e7Var.d).e(e7Var.a);
        int i10 = 0;
        float d = ((org.telegram.ui.Components.g6) e7Var.e).d(((d7) e7Var.c).c, false);
        float width = (rectF2.width() * d) + rectF2.left;
        float d10 = ((org.telegram.ui.Components.g6) e7Var.f).d(((d7) e7Var.c).d, false);
        float height = (rectF2.height() * d10) + rectF2.top;
        float lerp = AndroidUtilities.lerp(0.5f, 1.1f, e7);
        canvas.save();
        canvas.scale(lerp, lerp, width, height);
        if (e7 > 0.0f) {
            path.rewind();
            int min = Math.min(4, ((d7) e7Var.c).b.length);
            int i11 = 0;
            while (i11 < min) {
                int i12 = i11 - 1;
                if (i12 < 0) {
                    i12 = min - 1;
                }
                int i13 = i11 + 1;
                int i14 = i13 >= min ? i10 : i13;
                d7 d7Var2 = (d7) e7Var.c;
                PointF[] pointFArr = d7Var2.b;
                PointF pointF = pointFArr[i12];
                int i15 = min;
                PointF pointF2 = pointFArr[i11];
                org.telegram.ui.Components.g6[] g6VarArr3 = g6VarArr;
                PointF pointF3 = pointFArr[i14];
                org.telegram.ui.Components.g6[] g6VarArr4 = g6VarArr2;
                float f10 = e7;
                float width2 = (rectF2.width() * (g6VarArr4[i12].d(pointF.x - d7Var2.c, false) + d)) + rectF2.left;
                float height2 = (rectF2.height() * (g6VarArr3[i12].d(pointF.y - ((d7) e7Var.c).d, false) + d10)) + rectF2.top;
                float width3 = (rectF2.width() * (g6VarArr4[i11].d(pointF2.x - ((d7) e7Var.c).c, false) + d)) + rectF2.left;
                float height3 = (rectF2.height() * (g6VarArr3[i11].d(pointF2.y - ((d7) e7Var.c).d, false) + d10)) + rectF2.top;
                float width4 = (rectF2.width() * (g6VarArr4[i14].d(pointF3.x - ((d7) e7Var.c).c, false) + d)) + rectF2.left;
                float height4 = ((rectF.height() * (g6VarArr3[i14].d(pointF3.y - ((d7) e7Var.c).d, false) + d10)) + rectF2.top) - height3;
                path.moveTo(((width2 - width3) * 0.18f) + width3, ((height2 - height3) * 0.18f) + height3);
                path.lineTo(width3, height3);
                path.lineTo(((width4 - width3) * 0.18f) + width3, (height4 * 0.18f) + height3);
                g6VarArr2 = g6VarArr4;
                i10 = 0;
                i11 = i13;
                min = i15;
                g6VarArr = g6VarArr3;
                e7 = f10;
                rectF2 = rectF;
            }
            paint.setAlpha((int) (e7 * 255.0f));
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

    public final void k(RectF rectF, s sVar) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            Point point = AndroidUtilities.displaySize;
            int i10 = point.x;
            measuredHeight = point.y;
            measuredWidth = i10;
        }
        float f7 = measuredWidth;
        t tVar = sVar.a;
        int[] iArr = tVar.d;
        int i11 = sVar.c;
        int i12 = iArr[i11];
        int i13 = sVar.b;
        float f10 = measuredHeight;
        int i14 = tVar.c;
        rectF.set((f7 / i12) * i13, (f10 / i14) * i11, (f7 / i12) * (i13 + 1), (f10 / i14) * (i11 + 1));
    }

    public final boolean l(l8 l8Var) {
        if (l8Var.K) {
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                Object obj = arrayList.get(i10);
                i10++;
                l8 l8Var2 = ((d0) obj).n;
                if (l8Var2 != null && l8Var2.K && l8Var2.P > 0.0f) {
                    l8Var.P = 0.0f;
                    break;
                }
            }
        }
        d0 d0Var = this.r;
        if (d0Var != null) {
            d0Var.a(l8Var);
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
                a0 a0Var = this.w0;
                AndroidUtilities.cancelRunOnUIThread(a0Var);
                a0Var.run();
            }
        }
    }

    public final void n(l8 l8Var) {
        if (l8Var == null || l8Var.T == null) {
            e();
            return;
        }
        o(l8Var.S);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((d0) arrayList.get(i10)).a((l8) l8Var.T.get(i10));
            i10++;
        }
    }

    public final void o(t tVar) {
        if (tVar == null) {
            tVar = new t(".");
        }
        ArrayList arrayList = tVar.e;
        this.f = tVar;
        a0 a0Var = this.H;
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
                if (this.k0) {
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
                this.k0 = true;
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
                this.k0 = false;
                AndroidUtilities.cancelRunOnUIThread(this.w0);
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
        l8 l8Var;
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
                if (d0Var == null || (l8Var = d0Var.n) == null || (i12 = l8Var.k0) <= 0 || (i13 = l8Var.l0) <= 0) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                } else {
                    if (l8Var.Q % 90 == 1) {
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
            cameraView2.unlistenDraw(new a0(this, 1));
            AndroidUtilities.removeFromParent(this.d);
            this.d = null;
            p();
        }
        this.d = cameraView;
        if (cameraView != null) {
            addView(cameraView, w7.x5.e(-1, -1, 119));
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
            a0 a0Var = this.w0;
            AndroidUtilities.cancelRunOnUIThread(a0Var);
            a0Var.run();
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
            org.telegram.ui.Components.ma maVar = this.G;
            if (maVar != null) {
                maVar.d();
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((d0) arrayList.get(i11)).a = i11;
            }
        }
        this.p0 = false;
        this.u0 = 0L;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            d0 d0Var = (d0) obj;
            c0 c0Var = d0Var.d;
            if (c0Var != null) {
                c0Var.setAudioEnabled(z10, true);
                if (!z10 || this.q0) {
                    d0Var.d.play();
                } else {
                    d0Var.d.pause();
                }
            }
        }
        a0 a0Var = this.w0;
        AndroidUtilities.cancelRunOnUIThread(a0Var);
        if (z10) {
            this.o0 = System.currentTimeMillis();
            AndroidUtilities.runOnUIThread(a0Var, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
        }
    }

    public void setPreviewView(b7 b7Var) {
        this.s0 = b7Var;
    }

    public void setResetState(Runnable runnable) {
        this.m0 = runnable;
    }

    public void setTimelineView(wc wcVar) {
        this.r0 = wcVar;
    }
}
