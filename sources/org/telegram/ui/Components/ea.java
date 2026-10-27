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
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ea extends s4.n0 implements dh.a {
    public final RectF E;
    public Bitmap F;
    public float[] G;
    public int H;
    public int I;
    public float J;
    public boolean K;
    public lm0 L;
    public float[] M;
    public int[] N;
    public short[] O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public boolean U;
    public float[] V;
    public float[] W;
    public short[] X;
    public int Y;
    public int Z;
    public final nm0 a;
    public boolean a0;
    public final Utilities.CallbackReturn b;
    public float[] b0;
    public final Utilities.CallbackReturn c;
    public int c0;
    public final Utilities.Callback5 d;
    public float[] d0;
    public final int e;
    public int e0;
    public final float f;
    public final boolean h;
    public final Paint n = new Paint(3);
    public final Paint r = new Paint(3);
    public final Paint s = new Paint();
    public final Paint v = new Paint();
    public final Paint w;
    public final RectF x;
    public final Rect y;

    public ea(nm0 nm0Var, Utilities.CallbackReturn callbackReturn, Utilities.CallbackReturn callbackReturn2, int i10, float f7, tv tvVar, boolean z10, boolean z11, lm0 lm0Var) {
        Paint paint = new Paint();
        this.w = paint;
        this.x = new RectF();
        this.y = new Rect();
        this.E = new RectF();
        this.G = new float[32];
        this.J = -1.0f;
        this.M = new float[128];
        this.N = new int[64];
        this.O = new short[96];
        this.V = new float[128];
        this.W = new float[128];
        this.X = new short[96];
        this.b0 = new float[48];
        this.d0 = new float[32];
        this.a = nm0Var;
        this.b = callbackReturn;
        this.c = callbackReturn2;
        this.e = i10;
        this.f = f7;
        this.d = tvVar;
        this.h = z10;
        this.K = z11;
        this.L = lm0Var;
        paint.setColor(-1);
    }

    @Override // dh.a
    public final void b(ch.a aVar, RectF rectF) {
        aVar.a = true;
    }

    @Override // s4.n0
    public final void d(Rect rect, View view, RecyclerView recyclerView, s4.b1 b1Var) {
        int b10;
        if (u(view)) {
            int i10 = this.e;
            rect.right = i10;
            rect.left = i10;
            s4.e1 T = recyclerView.T(view);
            s4.h0 adapter = recyclerView.getAdapter();
            if (T == null || adapter == null || (b10 = T.b()) == -1) {
                return;
            }
            if (b10 == 0) {
                rect.top = this.h ? i10 : AndroidUtilities.dp(4.0f);
            }
            if (b10 == adapter.h() - 1) {
                rect.bottom = i10;
            }
        }
    }

    @Override // s4.n0
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        nm0 nm0Var = this.a;
        if (recyclerView != nm0Var) {
            return;
        }
        int sectionsBackgroundColorForDecoration = nm0Var.getSectionsBackgroundColorForDecoration();
        Paint paint = this.s;
        if (paint.getColor() != sectionsBackgroundColorForDecoration) {
            paint.setColor(sectionsBackgroundColorForDecoration);
            this.F = null;
            this.J = -1.0f;
        }
        if (!this.K) {
            p(canvas);
            return;
        }
        int ordinal = this.L.ordinal();
        if (ordinal == 0) {
            canvas.drawRect(0.0f, 0.0f, nm0Var.getWidth(), nm0Var.getHeight(), paint);
            p(canvas);
            return;
        }
        if (ordinal == 1) {
            int r6 = r(1.0f);
            Paint paint2 = this.v;
            paint2.setColor(r6);
            canvas.drawRect(0.0f, 0.0f, nm0Var.getWidth(), nm0Var.getHeight(), paint2);
            m(canvas, 0.0f);
            this.T = true;
            p(canvas);
            this.T = false;
            return;
        }
        if (ordinal != 3) {
            m(canvas, 1.0f);
            p(canvas);
            return;
        }
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = true;
        m(canvas, 0.0f);
        p(canvas);
        this.S = false;
        int i10 = this.P;
        if (i10 == 0) {
            return;
        }
        canvas.drawVertices(Canvas.VertexMode.TRIANGLES, i10, this.M, 0, null, 0, this.N, 0, this.O, 0, this.R, this.w);
    }

    @Override // dh.a
    public final void f(Canvas canvas, RectF rectF) {
        canvas.save();
        try {
            canvas.clipRect(rectF);
            this.U = true;
            p(canvas);
        } finally {
            this.U = false;
            canvas.restore();
        }
    }

    @Override // s4.n0
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        int i10;
        ea eaVar = this;
        nm0 nm0Var = eaVar.a;
        if (recyclerView == nm0Var) {
            float f7 = eaVar.f;
            if (f7 <= 0.0f) {
                return;
            }
            int sectionsBackgroundColorForDecoration = nm0Var.getSectionsBackgroundColorForDecoration();
            Paint paint = eaVar.s;
            if (paint.getColor() != sectionsBackgroundColorForDecoration) {
                paint.setColor(sectionsBackgroundColorForDecoration);
                eaVar.F = null;
                eaVar.J = -1.0f;
            }
            int max = Math.max(1, (int) Math.ceil(f7));
            Bitmap bitmap = eaVar.F;
            Paint paint2 = eaVar.r;
            if (bitmap == null || eaVar.I != max || eaVar.J != f7) {
                eaVar.I = max;
                eaVar.J = f7;
                int i11 = max * 2;
                eaVar.F = Bitmap.createBitmap(i11, i11, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(eaVar.F);
                canvas2.drawColor(paint.getColor());
                Paint paint3 = new Paint(1);
                paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                float f10 = max;
                canvas2.drawCircle(f10, f10, f7, paint3);
                Bitmap bitmap2 = eaVar.F;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint2.setShader(new BitmapShader(bitmap2, tileMode, tileMode));
            }
            boolean z10 = eaVar.K && eaVar.L == lm0.b;
            eaVar.a0 = z10;
            if (z10) {
                eaVar.Y = 0;
                eaVar.Z = 0;
            }
            if (nm0Var.b0()) {
                int paddingLeft = nm0Var.getPaddingLeft();
                int i12 = eaVar.e;
                float f11 = paddingLeft + i12;
                float width = (nm0Var.getWidth() - nm0Var.getPaddingRight()) - i12;
                float f12 = f7 * 0.2f;
                for (int i13 = 0; i13 < eaVar.e0; i13 += 4) {
                    float[] fArr = eaVar.d0;
                    float f13 = fArr[i13];
                    float f14 = fArr[i13 + 1];
                    float f15 = fArr[i13 + 2];
                    float f16 = fArr[i13 + 3];
                    if (f12 > 0.0f && i13 > 0) {
                        f15 = Math.min(f15, Math.max(0.0f, Math.min(1.0f, (f13 - fArr[i13 - 3]) / f12)));
                    }
                    if (f12 > 0.0f && (i10 = i13 + 4) < eaVar.e0) {
                        f16 = Math.min(f16, Math.max(0.0f, Math.min(1.0f, (eaVar.d0[i10] - f14) / f12)));
                    }
                    eaVar.q(canvas, f11, width, f13, f15);
                    eaVar.k(canvas, f11, width, f14, f16);
                }
            } else {
                int i14 = 0;
                while (i14 < nm0Var.getChildCount()) {
                    View childAt = nm0Var.getChildAt(i14);
                    s4.e1 T = nm0Var.T(childAt);
                    int R = RecyclerView.R(childAt);
                    if (childAt != nm0Var.getEmptyView() && childAt.getVisibility() == 0 && childAt.getAlpha() > 0.0f && R != -1 && ((T == null || !T.j()) && eaVar.u(childAt) && !nm0Var.h1(R))) {
                        float x9 = childAt.getX();
                        float width2 = x9 + childAt.getWidth();
                        if (!eaVar.v(R - 1)) {
                            eaVar.q(canvas, x9, width2, nm0.y1(childAt), 1.0f);
                        }
                        if (!eaVar.v(R + 1)) {
                            eaVar.k(canvas, x9, width2, nm0.G0(childAt), 1.0f);
                        }
                    }
                    i14++;
                    eaVar = this;
                }
            }
            if (nm0Var.K2 != null) {
                for (int i15 = 0; i15 < nm0Var.K2.size(); i15++) {
                    long longValue = ((Long) nm0Var.K2.get(i15)).longValue();
                    View U0 = nm0Var.U0(AndroidUtilities.unpackA(longValue));
                    View U02 = nm0Var.U0(AndroidUtilities.unpackB(longValue));
                    if (U0 != null) {
                        q(canvas, U0.getX(), U0.getWidth() + U0.getX(), nm0.y1(U0), 1.0f);
                    }
                    if (U02 != null) {
                        k(canvas, U02.getX(), U02.getX() + U02.getWidth(), nm0.G0(U02), 1.0f);
                    }
                }
            }
            if (this.a0) {
                this.a0 = false;
                int i16 = this.Y;
                if (i16 == 0) {
                    return;
                }
                canvas.drawVertices(Canvas.VertexMode.TRIANGLES, i16, this.V, 0, this.W, 0, null, 0, this.X, 0, this.Z, paint2);
            }
        }
    }

    public final void h(float f7, float f10) {
        if (f10 <= f7) {
            return;
        }
        int i10 = this.H;
        int i11 = i10 + 2;
        float[] fArr = this.G;
        if (i11 > fArr.length) {
            float[] fArr2 = new float[fArr.length * 2];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.G = fArr2;
        }
        float[] fArr3 = this.G;
        int i12 = this.H;
        int i13 = i12 + 1;
        this.H = i13;
        fArr3[i12] = f7;
        this.H = i12 + 2;
        fArr3[i13] = f10;
    }

    public final void i(float f7, float f10, float f11, float f12, int i10) {
        if (f11 <= f7 || f12 <= f10) {
            return;
        }
        int i11 = this.P;
        int i12 = i11 + 8;
        float[] fArr = this.M;
        if (i12 > fArr.length) {
            float[] fArr2 = new float[fArr.length * 2];
            System.arraycopy(fArr, 0, fArr2, 0, i11);
            this.M = fArr2;
        }
        int i13 = this.Q;
        int i14 = i13 + 4;
        int[] iArr = this.N;
        if (i14 > iArr.length) {
            int[] iArr2 = new int[iArr.length * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i13);
            this.N = iArr2;
        }
        int i15 = this.R;
        int i16 = i15 + 6;
        short[] sArr = this.O;
        if (i16 > sArr.length) {
            short[] sArr2 = new short[sArr.length * 2];
            System.arraycopy(sArr, 0, sArr2, 0, i15);
            this.O = sArr2;
        }
        int i17 = this.Q;
        float[] fArr3 = this.M;
        int i18 = this.P;
        int i19 = i18 + 1;
        this.P = i19;
        fArr3[i18] = f7;
        int i20 = i18 + 2;
        this.P = i20;
        fArr3[i19] = f10;
        int i21 = i18 + 3;
        this.P = i21;
        fArr3[i20] = f11;
        int i22 = i18 + 4;
        this.P = i22;
        fArr3[i21] = f10;
        int i23 = i18 + 5;
        this.P = i23;
        fArr3[i22] = f7;
        int i24 = i18 + 6;
        this.P = i24;
        fArr3[i23] = f12;
        int i25 = i18 + 7;
        this.P = i25;
        fArr3[i24] = f11;
        this.P = i18 + 8;
        fArr3[i25] = f12;
        int[] iArr3 = this.N;
        int i26 = i17 + 1;
        this.Q = i26;
        iArr3[i17] = i10;
        int i27 = i17 + 2;
        this.Q = i27;
        iArr3[i26] = i10;
        int i28 = i17 + 3;
        this.Q = i28;
        iArr3[i27] = i10;
        this.Q = i17 + 4;
        iArr3[i28] = i10;
        short[] sArr3 = this.O;
        int i29 = this.R;
        int i30 = i29 + 1;
        this.R = i30;
        sArr3[i29] = (short) i17;
        int i31 = i29 + 2;
        this.R = i31;
        short s10 = (short) (i17 + 1);
        sArr3[i30] = s10;
        int i32 = i29 + 3;
        this.R = i32;
        short s11 = (short) (i17 + 2);
        sArr3[i31] = s11;
        int i33 = i29 + 4;
        this.R = i33;
        sArr3[i32] = s11;
        int i34 = i29 + 5;
        this.R = i34;
        sArr3[i33] = s10;
        this.R = i29 + 6;
        sArr3[i34] = (short) (i17 + 3);
    }

    public final void j(Canvas canvas, float f7, float f10, float f11, float f12) {
        if (f11 <= f7 || f12 <= f10) {
            return;
        }
        boolean z10 = this.S;
        Paint paint = this.s;
        if (z10) {
            i(f7, f10, f11, f12, paint.getColor());
        } else {
            canvas.drawRect(f7, f10, f11, f12, paint);
        }
    }

    public final void k(Canvas canvas, float f7, float f10, float f11, float f12) {
        if (f12 <= 0.0f) {
            return;
        }
        float min = Math.min(1.0f, f12) * this.I;
        float f13 = f11 - min;
        l(canvas, 2, f7, f13, f7 + min, f11);
        l(canvas, 3, f10 - min, f13, f10, f11);
    }

    public final void l(Canvas canvas, int i10, float f7, float f10, float f11, float f12) {
        int i11 = (i10 & 1) == 0 ? 0 : this.I;
        int i12 = i10 < 2 ? 0 : this.I;
        if (!this.a0) {
            int i13 = this.I;
            Rect rect = this.y;
            rect.set(i11, i12, i11 + i13, i13 + i12);
            RectF rectF = this.E;
            rectF.set(f7, f10, f11, f12);
            canvas.drawBitmap(this.F, rect, rectF, this.n);
            return;
        }
        float f13 = i11;
        float f14 = i12;
        int i14 = this.I;
        float f15 = i11 + i14;
        float f16 = i12 + i14;
        int i15 = this.Y;
        int i16 = i15 + 8;
        float[] fArr = this.V;
        if (i16 > fArr.length) {
            int length = fArr.length * 2;
            float[] fArr2 = new float[length];
            float[] fArr3 = new float[length];
            System.arraycopy(fArr, 0, fArr2, 0, i15);
            System.arraycopy(this.W, 0, fArr3, 0, this.Y);
            this.V = fArr2;
            this.W = fArr3;
        }
        int i17 = this.Z;
        int i18 = i17 + 6;
        short[] sArr = this.X;
        if (i18 > sArr.length) {
            short[] sArr2 = new short[sArr.length * 2];
            System.arraycopy(sArr, 0, sArr2, 0, i17);
            this.X = sArr2;
        }
        int i19 = this.Y;
        int i20 = i19 >> 1;
        float[] fArr4 = this.V;
        fArr4[i19] = f7;
        float[] fArr5 = this.W;
        int i21 = i19 + 1;
        this.Y = i21;
        fArr5[i19] = f13;
        fArr4[i21] = f10;
        int i22 = i19 + 2;
        this.Y = i22;
        fArr5[i21] = f14;
        fArr4[i22] = f11;
        int i23 = i19 + 3;
        this.Y = i23;
        fArr5[i22] = f15;
        fArr4[i23] = f10;
        int i24 = i19 + 4;
        this.Y = i24;
        fArr5[i23] = f14;
        fArr4[i24] = f7;
        int i25 = i19 + 5;
        this.Y = i25;
        fArr5[i24] = f13;
        fArr4[i25] = f12;
        int i26 = i19 + 6;
        this.Y = i26;
        fArr5[i25] = f16;
        fArr4[i26] = f11;
        int i27 = i19 + 7;
        this.Y = i27;
        fArr5[i26] = f15;
        fArr4[i27] = f12;
        this.Y = i19 + 8;
        fArr5[i27] = f16;
        short[] sArr3 = this.X;
        int i28 = this.Z;
        int i29 = i28 + 1;
        this.Z = i29;
        sArr3[i28] = (short) i20;
        int i30 = i28 + 2;
        this.Z = i30;
        short s10 = (short) (i20 + 1);
        sArr3[i29] = s10;
        int i31 = i28 + 3;
        this.Z = i31;
        short s11 = (short) (i20 + 2);
        sArr3[i30] = s11;
        int i32 = i28 + 4;
        this.Z = i32;
        sArr3[i31] = s11;
        int i33 = i28 + 5;
        this.Z = i33;
        sArr3[i32] = s10;
        this.Z = i28 + 6;
        sArr3[i33] = (short) (i20 + 3);
    }

    public final void m(Canvas canvas, float f7) {
        ea eaVar;
        float f10;
        float f11;
        nm0 nm0Var = this.a;
        float width = nm0Var.getWidth();
        float height = nm0Var.getHeight();
        int paddingLeft = nm0Var.getPaddingLeft();
        int i10 = this.e;
        float max = Math.max(0.0f, Math.min(width, paddingLeft + i10));
        float max2 = Math.max(max, Math.min(width, (width - nm0Var.getPaddingRight()) - i10));
        if (max >= max2) {
            j(canvas, 0.0f, 0.0f, width, height);
            return;
        }
        this.H = 0;
        for (int i11 = 0; i11 < nm0Var.getChildCount(); i11++) {
            View childAt = nm0Var.getChildAt(i11);
            int R = RecyclerView.R(childAt);
            s4.e1 T = nm0Var.T(childAt);
            if (childAt != nm0Var.getEmptyView() && childAt.getVisibility() == 0 && childAt.getAlpha() > 0.0f && ((!nm0Var.b0() || T == null || !T.j() || childAt.getAlpha() >= 1.0f) && u(childAt) && !nm0Var.h1(R))) {
                float y12 = nm0.y1(childAt);
                float G0 = nm0.G0(childAt);
                if (childAt instanceof h90) {
                    G0 -= ((h90) childAt).getBottomInfoMargin();
                }
                h(y12, G0);
            }
        }
        if (nm0Var.K2 != null) {
            for (int i12 = 0; i12 < nm0Var.K2.size(); i12++) {
                long longValue = ((Long) nm0Var.K2.get(i12)).longValue();
                int unpackA = AndroidUtilities.unpackA(longValue);
                int unpackB = AndroidUtilities.unpackB(longValue);
                float f12 = height;
                float f13 = 0.0f;
                for (int i13 = 0; i13 < nm0Var.getChildCount(); i13++) {
                    View childAt2 = nm0Var.getChildAt(i13);
                    int R2 = RecyclerView.R(childAt2);
                    if (R2 >= unpackA && R2 <= unpackB) {
                        f12 = Math.min(f12, nm0.y1(childAt2));
                        f13 = Math.max(f13, nm0.G0(childAt2));
                    }
                }
                h(f12, f13);
            }
        }
        int i14 = 2;
        for (int i15 = 2; i15 < this.H; i15 += 2) {
            float[] fArr = this.G;
            float f14 = fArr[i15];
            float f15 = fArr[i15 + 1];
            int i16 = i15 - 2;
            while (i16 >= 0) {
                float[] fArr2 = this.G;
                float f16 = fArr2[i16];
                if (f16 > f14) {
                    fArr2[i16 + 2] = f16;
                    fArr2[i16 + 3] = fArr2[i16 + 1];
                    i16 -= 2;
                }
            }
            float[] fArr3 = this.G;
            fArr3[i16 + 2] = f14;
            fArr3[i16 + 3] = f15;
        }
        int i17 = 0;
        for (int i18 = 0; i18 < this.H; i18 += 2) {
            float max3 = Math.max(0.0f, this.G[i18]);
            float min = Math.min(height, this.G[i18 + 1]);
            if (min > max3) {
                if (i17 > 0) {
                    float[] fArr4 = this.G;
                    int i19 = i17 - 1;
                    float f17 = fArr4[i19];
                    if (max3 <= f17 + f7) {
                        fArr4[i19] = Math.max(f17, min);
                    }
                }
                float[] fArr5 = this.G;
                int i20 = i17 + 1;
                fArr5[i17] = max3;
                i17 += 2;
                fArr5[i20] = min;
            }
        }
        this.H = i17;
        if (i17 == 0) {
            j(canvas, 0.0f, 0.0f, width, height);
            return;
        }
        float[] fArr6 = this.G;
        float f18 = fArr6[0];
        float f19 = fArr6[i17 - 1];
        if (f18 > 0.0f) {
            j(canvas, 0.0f, 0.0f, width, Math.min(height, f18 + f7));
        }
        if (f19 < height) {
            j(canvas, 0.0f, Math.max(0.0f, f19 - f7), width, height);
        }
        float f20 = f18 > 0.0f ? f18 : 0.0f;
        float f21 = f19 < height ? f19 : height;
        if (f21 > f20) {
            j(canvas, 0.0f, f20, Math.min(width, max + f7), f21);
            eaVar = this;
            eaVar.j(canvas, Math.max(0.0f, max2 - f7), f20, width, f21);
        } else {
            eaVar = this;
        }
        while (i14 < eaVar.H) {
            float[] fArr7 = eaVar.G;
            float f22 = fArr7[i14 - 1];
            float f23 = fArr7[i14];
            if (f23 > f22) {
                f10 = max;
                f11 = max2;
                eaVar.j(canvas, f10, Math.max(0.0f, f22 - f7), f11, Math.min(height, f23 + f7));
            } else {
                f10 = max;
                f11 = max2;
            }
            i14 += 2;
            eaVar = this;
            max = f10;
            max2 = f11;
        }
    }

    public final void n(Canvas canvas, View view, View view2, boolean z10, boolean z11) {
        if (view == null || view2 == null) {
            return;
        }
        float bottomInfoMargin = view2 instanceof h90 ? ((h90) view2).getBottomInfoMargin() : 0.0f;
        float left = view.getLeft();
        this.a.getClass();
        float f7 = this.f;
        float max = Math.max(-f7, nm0.y1(view) - (z10 ? f7 : 0.0f));
        float right = view.getRight();
        float min = Math.min(r3.getHeight() - (-f7), (nm0.G0(view2) + (z11 ? f7 : 0.0f)) - bottomInfoMargin);
        RectF rectF = this.x;
        rectF.set(left, max, right, min);
        if (rectF.bottom >= rectF.top) {
            o(canvas, rectF, view.getAlpha());
        }
    }

    public final void o(Canvas canvas, RectF rectF, float f7) {
        Float valueOf = Float.valueOf(0.0f);
        boolean z10 = this.U;
        Paint paint = this.v;
        if (z10) {
            paint.setColor(i0.a.o(this.a.getSectionColorForDecoration(), Math.round(Math.max(0.0f, Math.min(1.0f, f7)) * Color.alpha(r1))));
            float f10 = this.f;
            canvas.drawRoundRect(rectF, f10, f10, paint);
            return;
        }
        if (!this.K) {
            this.d.run(canvas, rectF, valueOf, valueOf, Float.valueOf(f7));
            return;
        }
        paint.setColor(r(f7));
        if (!this.T || f7 < 1.0f) {
            if (this.S) {
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
        int i10;
        int i11;
        int i12;
        float[] fArr;
        View U0;
        s4.e1 T;
        Canvas canvas2 = canvas;
        nm0 nm0Var = this.a;
        boolean b02 = nm0Var.b0();
        RectF rectF = this.x;
        int i13 = this.e;
        float f7 = 0.0f;
        int i14 = 0;
        if (b02) {
            this.c0 = 0;
            this.e0 = 0;
            for (int i15 = 0; i15 < nm0Var.getChildCount(); i15++) {
                View childAt = nm0Var.getChildAt(i15);
                if (childAt != nm0Var.getEmptyView() && childAt.getVisibility() == 0 && childAt.getAlpha() > 0.0f && u(childAt)) {
                    float y12 = nm0.y1(childAt);
                    float G0 = nm0.G0(childAt);
                    s4.e1 T2 = nm0Var.T(childAt);
                    if (T2 == null || !T2.j() || childAt.getAlpha() >= 1.0f) {
                        if (nm0Var.h1(RecyclerView.R(childAt))) {
                        }
                        float alpha = childAt.getAlpha();
                        int i16 = this.c0;
                        i12 = i16 + 3;
                        fArr = this.b0;
                        if (i12 > fArr.length) {
                            float[] fArr2 = new float[fArr.length * 2];
                            System.arraycopy(fArr, 0, fArr2, 0, i16);
                            this.b0 = fArr2;
                        }
                        float[] fArr3 = this.b0;
                        int i17 = this.c0;
                        int i18 = i17 + 1;
                        this.c0 = i18;
                        fArr3[i17] = y12;
                        int i19 = i17 + 2;
                        this.c0 = i19;
                        fArr3[i18] = G0;
                        this.c0 = i17 + 3;
                        fArr3[i19] = alpha;
                    } else {
                        int i20 = T2.i;
                        if (i20 >= 0 && (U0 = nm0Var.U0(((int) Math.ceil(i20 / 1000.0d)) + 1)) != null && G0 > U0.getY() && u(U0) && (T = nm0Var.T(U0)) != null && !T.j()) {
                            y12 -= 1.0f;
                            G0 = U0.getY();
                            if (G0 < y12) {
                            }
                        }
                        float alpha2 = childAt.getAlpha();
                        int i162 = this.c0;
                        i12 = i162 + 3;
                        fArr = this.b0;
                        if (i12 > fArr.length) {
                        }
                        float[] fArr32 = this.b0;
                        int i172 = this.c0;
                        int i182 = i172 + 1;
                        this.c0 = i182;
                        fArr32[i172] = y12;
                        int i192 = i172 + 2;
                        this.c0 = i192;
                        fArr32[i182] = G0;
                        this.c0 = i172 + 3;
                        fArr32[i192] = alpha2;
                    }
                }
            }
            for (int i21 = 3; i21 < this.c0; i21 += 3) {
                float[] fArr4 = this.b0;
                float f10 = fArr4[i21];
                float f11 = fArr4[i21 + 1];
                float f12 = fArr4[i21 + 2];
                int i22 = i21 - 3;
                while (i22 >= 0) {
                    float[] fArr5 = this.b0;
                    float f13 = fArr5[i22];
                    if (f13 > f10) {
                        fArr5[i22 + 3] = f13;
                        fArr5[i22 + 4] = fArr5[i22 + 1];
                        fArr5[i22 + 5] = fArr5[i22 + 2];
                        i22 -= 3;
                    }
                }
                float[] fArr6 = this.b0;
                fArr6[i22 + 3] = f10;
                fArr6[i22 + 4] = f11;
                fArr6[i22 + 5] = f12;
            }
            int i23 = 0;
            while (i23 < this.c0) {
                float f14 = this.b0[i23 + 1];
                int i24 = i23 + 3;
                while (i24 < this.c0) {
                    float[] fArr7 = this.b0;
                    if (fArr7[i24] > 1.5f + f14) {
                        break;
                    }
                    f14 = Math.max(f14, fArr7[i24 + 1]);
                    i24 += 3;
                }
                float f15 = -3.4028235E38f;
                int i25 = i23;
                float f16 = -3.4028235E38f;
                float f17 = f7;
                float f18 = Float.MAX_VALUE;
                float f19 = Float.MAX_VALUE;
                while (i25 < i24) {
                    float f20 = f7;
                    float[] fArr8 = this.b0;
                    float f21 = fArr8[i25];
                    float f22 = fArr8[i25 + 1];
                    float f23 = fArr8[i25 + 2];
                    f19 = Math.min(f19, f21);
                    f15 = Math.max(f15, f22);
                    f17 = Math.max(f17, f23);
                    if (f23 >= 0.99f) {
                        f18 = Math.min(f18, f21);
                        f16 = Math.max(f16, f22);
                    }
                    i25 += 3;
                    f7 = f20;
                }
                float f24 = f7;
                if (f17 >= 0.001f) {
                    if (f18 != Float.MAX_VALUE) {
                        float f25 = f24;
                        float f26 = f25;
                        while (i23 < i24) {
                            float[] fArr9 = this.b0;
                            float f27 = fArr9[i23];
                            float f28 = fArr9[i23 + 1];
                            float f29 = fArr9[i23 + 2];
                            if (f29 < 0.99f) {
                                if (f27 < f18) {
                                    f25 = Math.max(f25, (f18 - f27) * f29);
                                }
                                if (f28 > f16) {
                                    f26 = Math.max(f26, (f28 - f16) * f29);
                                }
                            }
                            i23 += 3;
                        }
                        f19 = f18 - f25;
                        f15 = f16 + f26;
                        f17 = 1.0f;
                    }
                    if (f15 > f19) {
                        rectF.set(nm0Var.getPaddingLeft() + i13, f19, (nm0Var.getWidth() - nm0Var.getPaddingRight()) - i13, f15);
                        o(canvas2, rectF, f17);
                        int i26 = this.e0;
                        int i27 = i26 + 4;
                        float[] fArr10 = this.d0;
                        if (i27 > fArr10.length) {
                            float[] fArr11 = new float[fArr10.length * 2];
                            i11 = 0;
                            System.arraycopy(fArr10, 0, fArr11, 0, i26);
                            this.d0 = fArr11;
                        } else {
                            i11 = 0;
                        }
                        float[] fArr12 = this.d0;
                        int i28 = this.e0;
                        int i29 = i28 + 1;
                        this.e0 = i29;
                        fArr12[i28] = f19;
                        int i30 = i28 + 2;
                        this.e0 = i30;
                        fArr12[i29] = f15;
                        int i31 = i28 + 3;
                        this.e0 = i31;
                        fArr12[i30] = f17;
                        this.e0 = i28 + 4;
                        fArr12[i31] = f17;
                        i23 = i24;
                        i14 = i11;
                        f7 = f24;
                    }
                }
                i11 = 0;
                i23 = i24;
                i14 = i11;
                f7 = f24;
            }
            i10 = i14;
        } else {
            i10 = 0;
            int i32 = -1;
            int i33 = -1;
            int i34 = 0;
            View view = null;
            View view2 = null;
            while (i34 < nm0Var.getChildCount()) {
                View childAt2 = nm0Var.getChildAt(i34);
                if (childAt2 == nm0Var.getEmptyView() || childAt2.getVisibility() != 0 || childAt2.getAlpha() <= 0.0f || !u(childAt2) || nm0Var.h1(RecyclerView.R(childAt2))) {
                    n(canvas, view, view2, s(i32, view), t(i33, view2));
                    i32 = -1;
                    i33 = -1;
                    view = null;
                    view2 = null;
                } else {
                    if (view != null && Math.abs(view2.getAlpha() - childAt2.getAlpha()) > 0.1f) {
                        n(canvas2, view, view2, s(i32, view), t(i33, view2));
                        i32 = -1;
                        view = null;
                    }
                    if (view == null) {
                        i32 = i34;
                        view = childAt2;
                    }
                    i33 = i34;
                    view2 = childAt2;
                }
                i34++;
                canvas2 = canvas;
            }
            canvas2 = canvas;
            n(canvas2, view, view2, s(i32, view), t(i33, view2));
        }
        if (nm0Var.K2 == null) {
            return;
        }
        for (int i35 = i10; i35 < nm0Var.K2.size(); i35++) {
            long longValue = ((Long) nm0Var.K2.get(i35)).longValue();
            int unpackA = AndroidUtilities.unpackA(longValue);
            int unpackB = AndroidUtilities.unpackB(longValue);
            float height = nm0Var.getHeight();
            float f30 = this.f;
            float f31 = height + f30;
            float f32 = -f30;
            for (int i36 = i10; i36 < nm0Var.getChildCount(); i36++) {
                View childAt3 = nm0Var.getChildAt(i36);
                int R = RecyclerView.R(childAt3);
                if (R >= unpackA && R <= unpackB) {
                    f31 = Math.min(f31, nm0.y1(childAt3));
                    f32 = Math.max(f32, nm0.G0(childAt3));
                }
            }
            if (f31 < f32) {
                rectF.set(nm0Var.getPaddingLeft() + i13, f31, (nm0Var.getWidth() - nm0Var.getPaddingRight()) - i13, f32);
                o(canvas2, rectF, 1.0f);
            }
        }
    }

    public final void q(Canvas canvas, float f7, float f10, float f11, float f12) {
        if (f12 <= 0.0f) {
            return;
        }
        float min = Math.min(1.0f, f12) * this.I;
        float f13 = f11 + min;
        l(canvas, 0, f7, f11, f7 + min, f13);
        l(canvas, 1, f10 - min, f11, f10, f13);
    }

    public final int r(float f7) {
        return i0.a.k(i0.a.o(this.a.getSectionColorForDecoration(), Math.round(Math.max(0.0f, Math.min(1.0f, f7)) * Color.alpha(r0))), this.s.getColor());
    }

    public final boolean s(int i10, View view) {
        if (view == null || i10 > 0) {
            return false;
        }
        s4.h0 adapter = this.a.getAdapter();
        int R = RecyclerView.R(view);
        if (adapter == null || R <= 0) {
            return false;
        }
        return ((Boolean) this.c.run(Integer.valueOf(adapter.j(R - 1)))).booleanValue();
    }

    public final boolean t(int i10, View view) {
        if (view == null) {
            return false;
        }
        nm0 nm0Var = this.a;
        if (i10 < nm0Var.getChildCount() - 1) {
            return false;
        }
        s4.h0 adapter = nm0Var.getAdapter();
        int R = RecyclerView.R(view);
        if (adapter == null || R < 0 || R >= adapter.h() - 1) {
            return false;
        }
        return ((Boolean) this.c.run(Integer.valueOf(adapter.j(R + 1)))).booleanValue();
    }

    public final boolean u(View view) {
        return ((Boolean) this.b.run(view)).booleanValue();
    }

    public final boolean v(int i10) {
        nm0 nm0Var = this.a;
        s4.h0 adapter = nm0Var.getAdapter();
        if (i10 >= 0 && adapter != null && i10 < adapter.h()) {
            View U0 = nm0Var.U0(i10);
            if (U0 != null) {
                return u(U0) && !nm0Var.h1(i10);
            }
            if (((Boolean) this.c.run(Integer.valueOf(adapter.j(i10)))).booleanValue() && !nm0Var.h1(i10)) {
                return true;
            }
        }
        return false;
    }
}
