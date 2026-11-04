package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class p9 extends u4.n0 implements fh.a {
    public final Rect E;
    public final RectF F;
    public Bitmap G;
    public float[] H;
    public int I;
    public int J;
    public float K;
    public boolean L;
    public rj0 M;
    public float[] N;
    public int[] O;
    public short[] P;
    public int Q;
    public int R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public float[] W;
    public float[] X;
    public short[] Y;
    public int Z;
    public final tj0 a;
    public int a0;
    public final org.telegram.messenger.v10 b;
    public boolean b0;
    public final org.telegram.messenger.v10 c;
    public float[] c0;
    public final org.telegram.messenger.s10 d;
    public int d0;
    public final int e;
    public float[] e0;
    public final float f;
    public int f0;
    public final boolean h;
    public final Paint n = new Paint(3);
    public final Paint r = new Paint(3);
    public final Paint s = new Paint();
    public final Paint w = new Paint();
    public final Paint x;
    public final RectF y;

    public p9(tj0 tj0Var, org.telegram.messenger.v10 v10Var, org.telegram.messenger.v10 v10Var2, int i3, float f10, zw zwVar, boolean z10, boolean z11, rj0 rj0Var) {
        Paint paint = new Paint();
        this.x = paint;
        this.y = new RectF();
        this.E = new Rect();
        this.F = new RectF();
        this.H = new float[32];
        this.K = -1.0f;
        this.N = new float[128];
        this.O = new int[64];
        this.P = new short[96];
        this.W = new float[128];
        this.X = new float[128];
        this.Y = new short[96];
        this.c0 = new float[48];
        this.e0 = new float[32];
        this.a = tj0Var;
        this.b = v10Var;
        this.c = v10Var2;
        this.e = i3;
        this.f = f10;
        this.d = zwVar;
        this.h = z10;
        this.L = z11;
        this.M = rj0Var;
        paint.setColor(-1);
    }

    @Override // fh.a
    public final void b(eh.a aVar, RectF rectF) {
        aVar.a = true;
    }

    @Override // fh.a
    public final void d(Canvas canvas, RectF rectF) {
        canvas.save();
        try {
            canvas.clipRect(rectF);
            this.V = true;
            p(canvas);
        } finally {
            this.V = false;
            canvas.restore();
        }
    }

    @Override // u4.n0
    public final void e(Rect rect, View view, RecyclerView recyclerView, u4.a1 a1Var) {
        int b10;
        if (u(view)) {
            int i3 = this.e;
            rect.right = i3;
            rect.left = i3;
            u4.d1 T = recyclerView.T(view);
            u4.h0 adapter = recyclerView.getAdapter();
            if (T == null || adapter == null || (b10 = T.b()) == -1) {
                return;
            }
            if (b10 == 0) {
                rect.top = this.h ? i3 : org.telegram.messenger.g0.L(4.0f);
            }
            if (b10 == adapter.b() - 1) {
                rect.bottom = i3;
            }
        }
    }

    @Override // u4.n0
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        tj0 tj0Var = this.a;
        if (recyclerView != tj0Var) {
            return;
        }
        int sectionsBackgroundColorForDecoration = tj0Var.getSectionsBackgroundColorForDecoration();
        Paint paint = this.s;
        if (paint.getColor() != sectionsBackgroundColorForDecoration) {
            paint.setColor(sectionsBackgroundColorForDecoration);
            this.G = null;
            this.K = -1.0f;
        }
        if (!this.L) {
            p(canvas);
            return;
        }
        int ordinal = this.M.ordinal();
        if (ordinal == 0) {
            canvas.drawRect(0.0f, 0.0f, tj0Var.getWidth(), tj0Var.getHeight(), paint);
            p(canvas);
            return;
        }
        if (ordinal == 1) {
            int r5 = r(1.0f);
            Paint paint2 = this.w;
            paint2.setColor(r5);
            canvas.drawRect(0.0f, 0.0f, tj0Var.getWidth(), tj0Var.getHeight(), paint2);
            m(canvas, 0.0f);
            this.U = true;
            p(canvas);
            this.U = false;
            return;
        }
        if (ordinal != 3) {
            m(canvas, 1.0f);
            p(canvas);
            return;
        }
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = true;
        m(canvas, 0.0f);
        p(canvas);
        this.T = false;
        int i3 = this.Q;
        if (i3 == 0) {
            return;
        }
        canvas.drawVertices(Canvas.VertexMode.TRIANGLES, i3, this.N, 0, null, 0, this.O, 0, this.P, 0, this.S, this.x);
    }

    @Override // u4.n0
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        int i3;
        p9 p9Var = this;
        tj0 tj0Var = p9Var.a;
        if (recyclerView == tj0Var) {
            float f10 = p9Var.f;
            if (f10 <= 0.0f) {
                return;
            }
            int sectionsBackgroundColorForDecoration = tj0Var.getSectionsBackgroundColorForDecoration();
            Paint paint = p9Var.s;
            if (paint.getColor() != sectionsBackgroundColorForDecoration) {
                paint.setColor(sectionsBackgroundColorForDecoration);
                p9Var.G = null;
                p9Var.K = -1.0f;
            }
            int max = Math.max(1, (int) Math.ceil(f10));
            Bitmap bitmap = p9Var.G;
            Paint paint2 = p9Var.r;
            if (bitmap == null || p9Var.J != max || p9Var.K != f10) {
                p9Var.J = max;
                p9Var.K = f10;
                int i10 = max * 2;
                p9Var.G = Bitmap.createBitmap(i10, i10, Bitmap.Config.ARGB_8888);
                Canvas canvas3 = new Canvas(p9Var.G);
                canvas3.drawColor(paint.getColor());
                Paint paint3 = new Paint(1);
                paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                float f11 = max;
                canvas3.drawCircle(f11, f11, f10, paint3);
                Bitmap bitmap2 = p9Var.G;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint2.setShader(new BitmapShader(bitmap2, tileMode, tileMode));
            }
            boolean z10 = p9Var.L && p9Var.M == rj0.b;
            p9Var.b0 = z10;
            if (z10) {
                p9Var.Z = 0;
                p9Var.a0 = 0;
            }
            if (tj0Var.b0()) {
                int paddingLeft = tj0Var.getPaddingLeft();
                int i11 = p9Var.e;
                float f12 = paddingLeft + i11;
                float width = (tj0Var.getWidth() - tj0Var.getPaddingRight()) - i11;
                float f13 = f10 * 0.2f;
                for (int i12 = 0; i12 < p9Var.f0; i12 += 4) {
                    float[] fArr = p9Var.e0;
                    float f14 = fArr[i12];
                    float f15 = fArr[i12 + 1];
                    float f16 = fArr[i12 + 2];
                    float f17 = fArr[i12 + 3];
                    if (f13 > 0.0f && i12 > 0) {
                        f16 = Math.min(f16, Math.max(0.0f, Math.min(1.0f, (f14 - fArr[i12 - 3]) / f13)));
                    }
                    if (f13 > 0.0f && (i3 = i12 + 4) < p9Var.f0) {
                        f17 = Math.min(f17, Math.max(0.0f, Math.min(1.0f, (p9Var.e0[i3] - f15) / f13)));
                    }
                    int i13 = 0;
                    while (true) {
                        if (i13 >= tj0Var.getChildCount()) {
                            canvas2 = canvas;
                            p9Var.q(canvas2, f12, width, f14, f16);
                            p9Var = this;
                            break;
                        } else {
                            View childAt = tj0Var.getChildAt(i13);
                            if (tj0.a1(childAt) && Math.abs(tj0.v1(childAt) - f14) < 1.0f) {
                                canvas2 = canvas;
                                break;
                            }
                            i13++;
                        }
                    }
                    p9Var.k(canvas2, f12, width, f15, f17);
                }
            } else {
                int i14 = 0;
                while (i14 < tj0Var.getChildCount()) {
                    View childAt2 = tj0Var.getChildAt(i14);
                    u4.d1 T = tj0Var.T(childAt2);
                    int R = RecyclerView.R(childAt2);
                    if (childAt2 != tj0Var.getEmptyView() && childAt2.getVisibility() == 0 && childAt2.getAlpha() > 0.0f && R != -1 && ((T == null || !T.j()) && p9Var.u(childAt2) && !tj0Var.h1(R))) {
                        float x10 = childAt2.getX();
                        float width2 = x10 + childAt2.getWidth();
                        if (!p9Var.v(R - 1) && !tj0.a1(childAt2)) {
                            p9Var.q(canvas, x10, width2, tj0.v1(childAt2), 1.0f);
                        }
                        if (!p9Var.v(R + 1)) {
                            p9Var.k(canvas, x10, width2, tj0.G0(childAt2), 1.0f);
                        }
                    }
                    i14++;
                    p9Var = this;
                }
            }
            if (tj0Var.L2 != null) {
                for (int i15 = 0; i15 < tj0Var.L2.size(); i15++) {
                    long longValue = ((Long) tj0Var.L2.get(i15)).longValue();
                    Typeface typeface = org.telegram.messenger.g0.a;
                    View T0 = tj0Var.T0((int) (longValue >> 32));
                    View T02 = tj0Var.T0((int) longValue);
                    if (T0 != null && !tj0.a1(T0)) {
                        q(canvas, T0.getX(), T0.getWidth() + T0.getX(), tj0.v1(T0), 1.0f);
                    }
                    if (T02 != null) {
                        k(canvas, T02.getX(), T02.getX() + T02.getWidth(), tj0.G0(T02), 1.0f);
                    }
                }
            }
            if (this.b0) {
                this.b0 = false;
                int i16 = this.Z;
                if (i16 == 0) {
                    return;
                }
                canvas.drawVertices(Canvas.VertexMode.TRIANGLES, i16, this.W, 0, this.X, 0, null, 0, this.Y, 0, this.a0, paint2);
            }
        }
    }

    public final void h(float f10, float f11) {
        if (f11 <= f10) {
            return;
        }
        int i3 = this.I;
        int i10 = i3 + 2;
        float[] fArr = this.H;
        if (i10 > fArr.length) {
            float[] fArr2 = new float[fArr.length * 2];
            System.arraycopy(fArr, 0, fArr2, 0, i3);
            this.H = fArr2;
        }
        float[] fArr3 = this.H;
        int i11 = this.I;
        int i12 = i11 + 1;
        this.I = i12;
        fArr3[i11] = f10;
        this.I = i11 + 2;
        fArr3[i12] = f11;
    }

    public final void i(float f10, float f11, float f12, float f13, int i3) {
        if (f12 <= f10 || f13 <= f11) {
            return;
        }
        int i10 = this.Q;
        int i11 = i10 + 8;
        float[] fArr = this.N;
        if (i11 > fArr.length) {
            float[] fArr2 = new float[fArr.length * 2];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.N = fArr2;
        }
        int i12 = this.R;
        int i13 = i12 + 4;
        int[] iArr = this.O;
        if (i13 > iArr.length) {
            int[] iArr2 = new int[iArr.length * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i12);
            this.O = iArr2;
        }
        int i14 = this.S;
        int i15 = i14 + 6;
        short[] sArr = this.P;
        if (i15 > sArr.length) {
            short[] sArr2 = new short[sArr.length * 2];
            System.arraycopy(sArr, 0, sArr2, 0, i14);
            this.P = sArr2;
        }
        int i16 = this.R;
        float[] fArr3 = this.N;
        int i17 = this.Q;
        int i18 = i17 + 1;
        this.Q = i18;
        fArr3[i17] = f10;
        int i19 = i17 + 2;
        this.Q = i19;
        fArr3[i18] = f11;
        int i20 = i17 + 3;
        this.Q = i20;
        fArr3[i19] = f12;
        int i21 = i17 + 4;
        this.Q = i21;
        fArr3[i20] = f11;
        int i22 = i17 + 5;
        this.Q = i22;
        fArr3[i21] = f10;
        int i23 = i17 + 6;
        this.Q = i23;
        fArr3[i22] = f13;
        int i24 = i17 + 7;
        this.Q = i24;
        fArr3[i23] = f12;
        this.Q = i17 + 8;
        fArr3[i24] = f13;
        int[] iArr3 = this.O;
        int i25 = i16 + 1;
        this.R = i25;
        iArr3[i16] = i3;
        int i26 = i16 + 2;
        this.R = i26;
        iArr3[i25] = i3;
        int i27 = i16 + 3;
        this.R = i27;
        iArr3[i26] = i3;
        this.R = i16 + 4;
        iArr3[i27] = i3;
        short[] sArr3 = this.P;
        int i28 = this.S;
        int i29 = i28 + 1;
        this.S = i29;
        sArr3[i28] = (short) i16;
        int i30 = i28 + 2;
        this.S = i30;
        short s6 = (short) (i16 + 1);
        sArr3[i29] = s6;
        int i31 = i28 + 3;
        this.S = i31;
        short s10 = (short) (i16 + 2);
        sArr3[i30] = s10;
        int i32 = i28 + 4;
        this.S = i32;
        sArr3[i31] = s10;
        int i33 = i28 + 5;
        this.S = i33;
        sArr3[i32] = s6;
        this.S = i28 + 6;
        sArr3[i33] = (short) (i16 + 3);
    }

    public final void j(Canvas canvas, float f10, float f11, float f12, float f13) {
        if (f12 <= f10 || f13 <= f11) {
            return;
        }
        boolean z10 = this.T;
        Paint paint = this.s;
        if (z10) {
            i(f10, f11, f12, f13, paint.getColor());
        } else {
            canvas.drawRect(f10, f11, f12, f13, paint);
        }
    }

    public final void k(Canvas canvas, float f10, float f11, float f12, float f13) {
        if (f13 <= 0.0f) {
            return;
        }
        float min = Math.min(1.0f, f13) * this.J;
        float f14 = f12 - min;
        l(canvas, 2, f10, f14, f10 + min, f12);
        l(canvas, 3, f11 - min, f14, f11, f12);
    }

    public final void l(Canvas canvas, int i3, float f10, float f11, float f12, float f13) {
        int i10 = (i3 & 1) == 0 ? 0 : this.J;
        int i11 = i3 < 2 ? 0 : this.J;
        if (!this.b0) {
            int i12 = this.J;
            Rect rect = this.E;
            rect.set(i10, i11, i10 + i12, i12 + i11);
            RectF rectF = this.F;
            rectF.set(f10, f11, f12, f13);
            canvas.drawBitmap(this.G, rect, rectF, this.n);
            return;
        }
        float f14 = i10;
        float f15 = i11;
        int i13 = this.J;
        float f16 = i10 + i13;
        float f17 = i11 + i13;
        int i14 = this.Z;
        int i15 = i14 + 8;
        float[] fArr = this.W;
        if (i15 > fArr.length) {
            int length = fArr.length * 2;
            float[] fArr2 = new float[length];
            float[] fArr3 = new float[length];
            System.arraycopy(fArr, 0, fArr2, 0, i14);
            System.arraycopy(this.X, 0, fArr3, 0, this.Z);
            this.W = fArr2;
            this.X = fArr3;
        }
        int i16 = this.a0;
        int i17 = i16 + 6;
        short[] sArr = this.Y;
        if (i17 > sArr.length) {
            short[] sArr2 = new short[sArr.length * 2];
            System.arraycopy(sArr, 0, sArr2, 0, i16);
            this.Y = sArr2;
        }
        int i18 = this.Z;
        int i19 = i18 >> 1;
        float[] fArr4 = this.W;
        fArr4[i18] = f10;
        float[] fArr5 = this.X;
        int i20 = i18 + 1;
        this.Z = i20;
        fArr5[i18] = f14;
        fArr4[i20] = f11;
        int i21 = i18 + 2;
        this.Z = i21;
        fArr5[i20] = f15;
        fArr4[i21] = f12;
        int i22 = i18 + 3;
        this.Z = i22;
        fArr5[i21] = f16;
        fArr4[i22] = f11;
        int i23 = i18 + 4;
        this.Z = i23;
        fArr5[i22] = f15;
        fArr4[i23] = f10;
        int i24 = i18 + 5;
        this.Z = i24;
        fArr5[i23] = f14;
        fArr4[i24] = f13;
        int i25 = i18 + 6;
        this.Z = i25;
        fArr5[i24] = f17;
        fArr4[i25] = f12;
        int i26 = i18 + 7;
        this.Z = i26;
        fArr5[i25] = f16;
        fArr4[i26] = f13;
        this.Z = i18 + 8;
        fArr5[i26] = f17;
        short[] sArr3 = this.Y;
        int i27 = this.a0;
        int i28 = i27 + 1;
        this.a0 = i28;
        sArr3[i27] = (short) i19;
        int i29 = i27 + 2;
        this.a0 = i29;
        short s6 = (short) (i19 + 1);
        sArr3[i28] = s6;
        int i30 = i27 + 3;
        this.a0 = i30;
        short s10 = (short) (i19 + 2);
        sArr3[i29] = s10;
        int i31 = i27 + 4;
        this.a0 = i31;
        sArr3[i30] = s10;
        int i32 = i27 + 5;
        this.a0 = i32;
        sArr3[i31] = s6;
        this.a0 = i27 + 6;
        sArr3[i32] = (short) (i19 + 3);
    }

    public final void m(Canvas canvas, float f10) {
        p9 p9Var;
        float f11;
        float f12;
        tj0 tj0Var = this.a;
        float width = tj0Var.getWidth();
        float height = tj0Var.getHeight();
        int paddingLeft = tj0Var.getPaddingLeft();
        int i3 = this.e;
        float max = Math.max(0.0f, Math.min(width, paddingLeft + i3));
        float max2 = Math.max(max, Math.min(width, (width - tj0Var.getPaddingRight()) - i3));
        if (max >= max2) {
            j(canvas, 0.0f, 0.0f, width, height);
            return;
        }
        this.I = 0;
        for (int i10 = 0; i10 < tj0Var.getChildCount(); i10++) {
            View childAt = tj0Var.getChildAt(i10);
            int R = RecyclerView.R(childAt);
            u4.d1 T = tj0Var.T(childAt);
            if (childAt != tj0Var.getEmptyView() && childAt.getVisibility() == 0 && childAt.getAlpha() > 0.0f && ((!tj0Var.b0() || T == null || !T.j() || childAt.getAlpha() >= 1.0f) && u(childAt) && !tj0Var.h1(R))) {
                float v12 = tj0.v1(childAt);
                float G0 = tj0.G0(childAt);
                if (childAt instanceof b70) {
                    G0 -= ((b70) childAt).getBottomInfoMargin();
                }
                h(v12, G0);
            }
        }
        if (tj0Var.L2 != null) {
            for (int i11 = 0; i11 < tj0Var.L2.size(); i11++) {
                long longValue = ((Long) tj0Var.L2.get(i11)).longValue();
                Typeface typeface = org.telegram.messenger.g0.a;
                int i12 = (int) (longValue >> 32);
                int i13 = (int) longValue;
                float f13 = height;
                float f14 = 0.0f;
                for (int i14 = 0; i14 < tj0Var.getChildCount(); i14++) {
                    View childAt2 = tj0Var.getChildAt(i14);
                    int R2 = RecyclerView.R(childAt2);
                    if (R2 >= i12 && R2 <= i13) {
                        f13 = Math.min(f13, tj0.v1(childAt2));
                        f14 = Math.max(f14, tj0.G0(childAt2));
                    }
                }
                h(f13, f14);
            }
        }
        int i15 = 2;
        for (int i16 = 2; i16 < this.I; i16 += 2) {
            float[] fArr = this.H;
            float f15 = fArr[i16];
            float f16 = fArr[i16 + 1];
            int i17 = i16 - 2;
            while (i17 >= 0) {
                float[] fArr2 = this.H;
                float f17 = fArr2[i17];
                if (f17 > f15) {
                    fArr2[i17 + 2] = f17;
                    fArr2[i17 + 3] = fArr2[i17 + 1];
                    i17 -= 2;
                }
            }
            float[] fArr3 = this.H;
            fArr3[i17 + 2] = f15;
            fArr3[i17 + 3] = f16;
        }
        int i18 = 0;
        for (int i19 = 0; i19 < this.I; i19 += 2) {
            float max3 = Math.max(0.0f, this.H[i19]);
            float min = Math.min(height, this.H[i19 + 1]);
            if (min > max3) {
                if (i18 > 0) {
                    float[] fArr4 = this.H;
                    int i20 = i18 - 1;
                    float f18 = fArr4[i20];
                    if (max3 <= f18 + f10) {
                        fArr4[i20] = Math.max(f18, min);
                    }
                }
                float[] fArr5 = this.H;
                int i21 = i18 + 1;
                fArr5[i18] = max3;
                i18 += 2;
                fArr5[i21] = min;
            }
        }
        this.I = i18;
        if (i18 == 0) {
            j(canvas, 0.0f, 0.0f, width, height);
            return;
        }
        float[] fArr6 = this.H;
        float f19 = fArr6[0];
        float f20 = fArr6[i18 - 1];
        if (f19 > 0.0f) {
            j(canvas, 0.0f, 0.0f, width, Math.min(height, f19 + f10));
        }
        if (f20 < height) {
            j(canvas, 0.0f, Math.max(0.0f, f20 - f10), width, height);
        }
        float f21 = f19 > 0.0f ? f19 : 0.0f;
        float f22 = f20 < height ? f20 : height;
        if (f22 > f21) {
            j(canvas, 0.0f, f21, Math.min(width, max + f10), f22);
            p9Var = this;
            p9Var.j(canvas, Math.max(0.0f, max2 - f10), f21, width, f22);
        } else {
            p9Var = this;
        }
        while (i15 < p9Var.I) {
            float[] fArr7 = p9Var.H;
            float f23 = fArr7[i15 - 1];
            float f24 = fArr7[i15];
            if (f24 > f23) {
                f11 = max;
                f12 = max2;
                p9Var.j(canvas, f11, Math.max(0.0f, f23 - f10), f12, Math.min(height, f24 + f10));
            } else {
                f11 = max;
                f12 = max2;
            }
            i15 += 2;
            p9Var = this;
            max = f11;
            max2 = f12;
        }
    }

    public final void n(Canvas canvas, View view, View view2, boolean z10, boolean z11) {
        if (view == null || view2 == null) {
            return;
        }
        float bottomInfoMargin = view2 instanceof b70 ? ((b70) view2).getBottomInfoMargin() : 0.0f;
        float left = view.getLeft();
        this.a.getClass();
        float f10 = this.f;
        float max = Math.max((-f10) - r3.getSectionsOverscanTop(), tj0.v1(view) - (z10 ? f10 : 0.0f));
        float right = view.getRight();
        float min = Math.min(r3.getHeight() - (-f10), (tj0.G0(view2) + (z11 ? f10 : 0.0f)) - bottomInfoMargin);
        RectF rectF = this.y;
        rectF.set(left, max, right, min);
        if (rectF.bottom >= rectF.top) {
            o(canvas, rectF, view.getAlpha());
        }
    }

    public final void o(Canvas canvas, RectF rectF, float f10) {
        Float valueOf = Float.valueOf(0.0f);
        boolean z10 = this.V;
        Paint paint = this.w;
        if (z10) {
            paint.setColor(i0.a.o(this.a.getSectionColorForDecoration(), Math.round(Math.max(0.0f, Math.min(1.0f, f10)) * Color.alpha(r1))));
            float f11 = this.f;
            canvas.drawRoundRect(rectF, f11, f11, paint);
            return;
        }
        if (!this.L) {
            this.d.j(canvas, rectF, valueOf, valueOf, Float.valueOf(f10));
            return;
        }
        paint.setColor(r(f10));
        if (!this.U || f10 < 1.0f) {
            if (this.T) {
                i(rectF.left, rectF.top, rectF.right, rectF.bottom, paint.getColor());
            } else {
                canvas.drawRect(rectF, paint);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(Canvas canvas) {
        int i3;
        int i10;
        int i11;
        float[] fArr;
        View T0;
        u4.d1 T;
        Canvas canvas2 = canvas;
        tj0 tj0Var = this.a;
        boolean b02 = tj0Var.b0();
        RectF rectF = this.y;
        int i12 = this.e;
        float f10 = 0.0f;
        int i13 = 0;
        if (b02) {
            this.d0 = 0;
            this.f0 = 0;
            for (int i14 = 0; i14 < tj0Var.getChildCount(); i14++) {
                View childAt = tj0Var.getChildAt(i14);
                if (childAt != tj0Var.getEmptyView() && childAt.getVisibility() == 0 && childAt.getAlpha() > 0.0f && u(childAt)) {
                    float v12 = tj0.v1(childAt);
                    float G0 = tj0.G0(childAt);
                    u4.d1 T2 = tj0Var.T(childAt);
                    if (T2 == null || !T2.j() || childAt.getAlpha() >= 1.0f) {
                        if (tj0Var.h1(RecyclerView.R(childAt))) {
                        }
                        float alpha = childAt.getAlpha();
                        int i15 = this.d0;
                        i11 = i15 + 3;
                        fArr = this.c0;
                        if (i11 > fArr.length) {
                            float[] fArr2 = new float[fArr.length * 2];
                            System.arraycopy(fArr, 0, fArr2, 0, i15);
                            this.c0 = fArr2;
                        }
                        float[] fArr3 = this.c0;
                        int i16 = this.d0;
                        int i17 = i16 + 1;
                        this.d0 = i17;
                        fArr3[i16] = v12;
                        int i18 = i16 + 2;
                        this.d0 = i18;
                        fArr3[i17] = G0;
                        this.d0 = i16 + 3;
                        fArr3[i18] = alpha;
                    } else {
                        int i19 = T2.i;
                        if (i19 >= 0 && (T0 = tj0Var.T0(((int) Math.ceil(i19 / 1000.0d)) + 1)) != null && G0 > T0.getY() && u(T0) && (T = tj0Var.T(T0)) != null && !T.j()) {
                            v12 -= 1.0f;
                            G0 = T0.getY();
                            if (G0 < v12) {
                            }
                        }
                        float alpha2 = childAt.getAlpha();
                        int i152 = this.d0;
                        i11 = i152 + 3;
                        fArr = this.c0;
                        if (i11 > fArr.length) {
                        }
                        float[] fArr32 = this.c0;
                        int i162 = this.d0;
                        int i172 = i162 + 1;
                        this.d0 = i172;
                        fArr32[i162] = v12;
                        int i182 = i162 + 2;
                        this.d0 = i182;
                        fArr32[i172] = G0;
                        this.d0 = i162 + 3;
                        fArr32[i182] = alpha2;
                    }
                }
            }
            for (int i20 = 3; i20 < this.d0; i20 += 3) {
                float[] fArr4 = this.c0;
                float f11 = fArr4[i20];
                float f12 = fArr4[i20 + 1];
                float f13 = fArr4[i20 + 2];
                int i21 = i20 - 3;
                while (i21 >= 0) {
                    float[] fArr5 = this.c0;
                    float f14 = fArr5[i21];
                    if (f14 > f11) {
                        fArr5[i21 + 3] = f14;
                        fArr5[i21 + 4] = fArr5[i21 + 1];
                        fArr5[i21 + 5] = fArr5[i21 + 2];
                        i21 -= 3;
                    }
                }
                float[] fArr6 = this.c0;
                fArr6[i21 + 3] = f11;
                fArr6[i21 + 4] = f12;
                fArr6[i21 + 5] = f13;
            }
            int i22 = 0;
            while (i22 < this.d0) {
                float f15 = this.c0[i22 + 1];
                int i23 = i22 + 3;
                while (i23 < this.d0) {
                    float[] fArr7 = this.c0;
                    if (fArr7[i23] > 1.5f + f15) {
                        break;
                    }
                    f15 = Math.max(f15, fArr7[i23 + 1]);
                    i23 += 3;
                }
                float f16 = -3.4028235E38f;
                int i24 = i22;
                float f17 = -3.4028235E38f;
                float f18 = f10;
                float f19 = Float.MAX_VALUE;
                float f20 = Float.MAX_VALUE;
                while (i24 < i23) {
                    float f21 = f10;
                    float[] fArr8 = this.c0;
                    float f22 = fArr8[i24];
                    float f23 = fArr8[i24 + 1];
                    float f24 = fArr8[i24 + 2];
                    f20 = Math.min(f20, f22);
                    f16 = Math.max(f16, f23);
                    f18 = Math.max(f18, f24);
                    if (f24 >= 0.99f) {
                        f19 = Math.min(f19, f22);
                        f17 = Math.max(f17, f23);
                    }
                    i24 += 3;
                    f10 = f21;
                }
                float f25 = f10;
                if (f18 >= 0.001f) {
                    if (f19 != Float.MAX_VALUE) {
                        float f26 = f25;
                        float f27 = f26;
                        while (i22 < i23) {
                            float[] fArr9 = this.c0;
                            float f28 = fArr9[i22];
                            float f29 = fArr9[i22 + 1];
                            float f30 = fArr9[i22 + 2];
                            if (f30 < 0.99f) {
                                if (f28 < f19) {
                                    f26 = Math.max(f26, (f19 - f28) * f30);
                                }
                                if (f29 > f17) {
                                    f27 = Math.max(f27, (f29 - f17) * f30);
                                }
                            }
                            i22 += 3;
                        }
                        f20 = f19 - f26;
                        f16 = f17 + f27;
                        f18 = 1.0f;
                    }
                    if (f16 > f20) {
                        rectF.set(tj0Var.getPaddingLeft() + i12, f20, (tj0Var.getWidth() - tj0Var.getPaddingRight()) - i12, f16);
                        o(canvas2, rectF, f18);
                        int i25 = this.f0;
                        int i26 = i25 + 4;
                        float[] fArr10 = this.e0;
                        if (i26 > fArr10.length) {
                            float[] fArr11 = new float[fArr10.length * 2];
                            i10 = 0;
                            System.arraycopy(fArr10, 0, fArr11, 0, i25);
                            this.e0 = fArr11;
                        } else {
                            i10 = 0;
                        }
                        float[] fArr12 = this.e0;
                        int i27 = this.f0;
                        int i28 = i27 + 1;
                        this.f0 = i28;
                        fArr12[i27] = f20;
                        int i29 = i27 + 2;
                        this.f0 = i29;
                        fArr12[i28] = f16;
                        int i30 = i27 + 3;
                        this.f0 = i30;
                        fArr12[i29] = f18;
                        this.f0 = i27 + 4;
                        fArr12[i30] = f18;
                        i22 = i23;
                        i13 = i10;
                        f10 = f25;
                    }
                }
                i10 = 0;
                i22 = i23;
                i13 = i10;
                f10 = f25;
            }
            i3 = i13;
        } else {
            i3 = 0;
            int i31 = -1;
            int i32 = -1;
            int i33 = 0;
            View view = null;
            View view2 = null;
            while (i33 < tj0Var.getChildCount()) {
                View childAt2 = tj0Var.getChildAt(i33);
                if (childAt2 == tj0Var.getEmptyView() || childAt2.getVisibility() != 0 || childAt2.getAlpha() <= 0.0f || !u(childAt2) || tj0Var.h1(RecyclerView.R(childAt2))) {
                    n(canvas, view, view2, s(i31, view), t(i32, view2));
                    i31 = -1;
                    i32 = -1;
                    view = null;
                    view2 = null;
                } else {
                    if (view != null && Math.abs(view2.getAlpha() - childAt2.getAlpha()) > 0.1f) {
                        n(canvas2, view, view2, s(i31, view), t(i32, view2));
                        i31 = -1;
                        view = null;
                    }
                    if (view == null) {
                        i31 = i33;
                        view = childAt2;
                    }
                    i32 = i33;
                    view2 = childAt2;
                }
                i33++;
                canvas2 = canvas;
            }
            canvas2 = canvas;
            n(canvas2, view, view2, s(i31, view), t(i32, view2));
        }
        if (tj0Var.L2 == null) {
            return;
        }
        for (int i34 = i3; i34 < tj0Var.L2.size(); i34++) {
            long longValue = ((Long) tj0Var.L2.get(i34)).longValue();
            Typeface typeface = org.telegram.messenger.g0.a;
            int i35 = (int) (longValue >> 32);
            int i36 = (int) longValue;
            float height = tj0Var.getHeight();
            float f31 = this.f;
            float f32 = height + f31;
            float f33 = -f31;
            for (int i37 = i3; i37 < tj0Var.getChildCount(); i37++) {
                View childAt3 = tj0Var.getChildAt(i37);
                int R = RecyclerView.R(childAt3);
                if (R >= i35 && R <= i36) {
                    f32 = Math.min(f32, tj0.v1(childAt3));
                    f33 = Math.max(f33, tj0.G0(childAt3));
                }
            }
            if (f32 < f33) {
                rectF.set(tj0Var.getPaddingLeft() + i12, f32, (tj0Var.getWidth() - tj0Var.getPaddingRight()) - i12, f33);
                o(canvas2, rectF, 1.0f);
            }
        }
    }

    public final void q(Canvas canvas, float f10, float f11, float f12, float f13) {
        if (f13 <= 0.0f) {
            return;
        }
        float min = Math.min(1.0f, f13) * this.J;
        float f14 = f12 + min;
        l(canvas, 0, f10, f12, f10 + min, f14);
        l(canvas, 1, f11 - min, f12, f11, f14);
    }

    public final int r(float f10) {
        return i0.a.k(i0.a.o(this.a.getSectionColorForDecoration(), Math.round(Math.max(0.0f, Math.min(1.0f, f10)) * Color.alpha(r0))), this.s.getColor());
    }

    public final boolean s(int i3, View view) {
        if (view == null || i3 > 0) {
            return false;
        }
        u4.h0 adapter = this.a.getAdapter();
        int R = RecyclerView.R(view);
        if (adapter == null || R <= 0) {
            return false;
        }
        return ((Boolean) this.c.a(Integer.valueOf(adapter.d(R - 1)))).booleanValue();
    }

    public final boolean t(int i3, View view) {
        if (view == null) {
            return false;
        }
        tj0 tj0Var = this.a;
        if (i3 < tj0Var.getChildCount() - 1) {
            return false;
        }
        u4.h0 adapter = tj0Var.getAdapter();
        int R = RecyclerView.R(view);
        if (adapter == null || R < 0 || R >= adapter.b() - 1) {
            return false;
        }
        return ((Boolean) this.c.a(Integer.valueOf(adapter.d(R + 1)))).booleanValue();
    }

    public final boolean u(View view) {
        return ((Boolean) this.b.a(view)).booleanValue();
    }

    public final boolean v(int i3) {
        tj0 tj0Var = this.a;
        u4.h0 adapter = tj0Var.getAdapter();
        if (i3 >= 0 && adapter != null && i3 < adapter.b()) {
            View T0 = tj0Var.T0(i3);
            if (T0 != null) {
                return u(T0) && !tj0Var.h1(i3);
            }
            if (((Boolean) this.c.a(Integer.valueOf(adapter.d(i3)))).booleanValue() && !tj0Var.h1(i3)) {
                return true;
            }
        }
        return false;
    }
}
