package org.telegram.ui.ActionBar;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import java.lang.reflect.Array;
import java.util.Arrays;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.iz;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.qa0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class u4 extends Drawable {
    public static final qa0[] T = new qa0[3];
    public NinePatchDrawable F;
    public int G;
    public boolean I;
    public u4 J;
    public float K;
    public boolean L;
    public boolean M;
    public Bitmap N;
    public BitmapShader O;
    public m.c3 P;
    public int Q;
    public float R;
    public boolean S;
    public Shader a;
    public int b;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public final int l;
    public final boolean m;
    public h6 p;
    public final boolean q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public final Paint c = new Paint(1);
    public final RectF j = new RectF();
    public final Matrix k = new Matrix();
    public final Rect o = new Rect();
    public Integer w = null;
    public boolean x = true;
    public final int[] y = {-1, -1, -1, -1};
    public final Bitmap[] z = new Bitmap[4];
    public final Drawable[] A = new Drawable[4];
    public final int[] B = {-1, -1, -1, -1};
    public final int[][] C = {new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}};
    public final Drawable[][] D = (Drawable[][]) Array.newInstance((Class<?>) Drawable.class, 4, 4);
    public final int[][] E = {new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}};
    public final Path n = new Path();
    public final Paint d = new Paint(1);
    public int H = qs.e4;

    public u4(int i7, boolean z9, boolean z10, h6 h6Var) {
        this.p = h6Var;
        this.q = z9;
        this.l = i7;
        this.m = z10;
    }

    public final void a() {
        Bitmap bitmap;
        if (this.a instanceof BitmapShader) {
            boolean z9 = this.L;
            Matrix matrix = this.k;
            qa0[] qa0VarArr = T;
            int i7 = this.l;
            char c10 = 2;
            if (z9 && (bitmap = this.N) != null) {
                char c11 = i7 == 2 ? (char) 1 : (char) 0;
                float min = 1.0f / Math.min(bitmap.getWidth() / qa0VarArr[c11].getBounds().width(), this.N.getHeight() / qa0VarArr[c11].getBounds().height());
                matrix.postScale(min, min);
            } else {
                if (!this.v) {
                    c10 = i7 == 2 ? (char) 1 : (char) 0;
                }
                Bitmap bitmap2 = qa0VarArr[c10].k;
                float min2 = 1.0f / Math.min(bitmap2.getWidth() / qa0VarArr[c10].getBounds().width(), bitmap2.getHeight() / qa0VarArr[c10].getBounds().height());
                matrix.postScale(min2, min2);
            }
        }
    }

    public final int b(float f10) {
        return this.l == 2 ? (int) Math.ceil(f10 * 3.0f) : org.telegram.messenger.g0.L(f10);
    }

    public final void c(Canvas canvas, Paint paint) {
        int b10;
        int i7;
        Path path;
        boolean z9;
        u4 u4Var;
        Path path2;
        Drawable f10;
        if (this.q || !m() || this.S) {
            Rect bounds = getBounds();
            Paint paint2 = this.c;
            if (paint == null && paint2.getStyle() == Paint.Style.FILL && this.a == null && this.Q == 0 && this.R <= 0.0f && (f10 = f()) != null) {
                f10.setBounds(bounds);
                f10.draw(canvas);
                return;
            }
            int b11 = b(2.0f);
            int i10 = this.Q;
            if (i10 != 0) {
                i7 = i10;
            } else {
                if (this.R > 0.0f) {
                    i10 = org.telegram.messenger.g0.W1(this.R, b(iz.Y0), Math.min(bounds.width(), bounds.height()) / 2);
                    b10 = org.telegram.messenger.g0.W1(this.R, b(Math.min(6, iz.Y0)), Math.min(bounds.width(), bounds.height()) / 2);
                } else if (this.l == 2) {
                    i10 = b(6.0f);
                    b10 = b(6.0f);
                } else {
                    i10 = b(iz.Y0);
                    b10 = b(Math.min(6, iz.Y0));
                }
                i7 = b10;
            }
            int b12 = b(6.0f);
            if (paint != null) {
                paint2 = paint;
            }
            if (paint == null && this.a != null) {
                Matrix matrix = this.k;
                matrix.reset();
                a();
                matrix.postTranslate(0.0f, -this.r);
                this.a.setLocalMatrix(matrix);
            }
            int max = Math.max(bounds.top, 0);
            if (this.P != null) {
                bounds.height();
                int i11 = this.b;
            }
            m.c3 c3Var = this.P;
            boolean z10 = true;
            if (c3Var != null) {
                path = (Path) c3Var.c;
                z9 = c3Var.b(bounds, true, true);
            } else {
                path = this.n;
                z9 = true;
            }
            if (z9 || this.Q != 0) {
                if (paint == null) {
                    z10 = false;
                }
                u4Var = this;
                int i12 = i10;
                path2 = path;
                u4Var.e(path2, bounds, b11, i12, b12, i7, max, true, true, z10);
            } else {
                u4Var = this;
                path2 = path;
            }
            canvas.drawPath(path2, paint2);
            if (u4Var.a != null && u4Var.m && paint == null) {
                int o4 = i0.a.o(g(m6.Pc), (int) ((Color.alpha(r15) * u4Var.H) / 255.0f));
                Paint paint3 = u4Var.d;
                paint3.setColor(o4);
                canvas.drawPath(path2, paint3);
            }
        }
    }

    public final void d(Canvas canvas, m.c3 c3Var, Paint paint) {
        this.P = c3Var;
        u4 u4Var = this.J;
        if (u4Var != null) {
            u4Var.P = c3Var;
        }
        c(canvas, paint);
        this.P = null;
        u4 u4Var2 = this.J;
        if (u4Var2 != null) {
            u4Var2.P = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        u4 u4Var = this.J;
        if (u4Var == null) {
            c(canvas, null);
            return;
        }
        u4Var.draw(canvas);
        setAlpha((int) (this.K * 255.0f));
        c(canvas, null);
        setAlpha(qs.e4);
    }

    public final void e(Path path, Rect rect, int i7, int i10, int i11, int i12, int i13, boolean z9, boolean z10, boolean z11) {
        path.rewind();
        int height = (rect.height() - i7) >> 1;
        int i14 = i10;
        if (i14 > height) {
            i14 = height;
        }
        boolean z12 = this.q;
        int i15 = this.l;
        RectF rectF = this.j;
        if (z12) {
            if (this.I || i15 == 2 || z11 || z9) {
                int i16 = this.u ? i12 : i14;
                if (i15 == 1) {
                    path.moveTo((rect.right - b(8.0f)) - i16, rect.bottom - i7);
                } else {
                    path.moveTo(rect.right - b(2.6f), rect.bottom - i7);
                }
                path.lineTo(rect.left + i7 + i16, rect.bottom - i7);
                int i17 = i16 * 2;
                rectF.set(rect.left + i7, r13 - i17, r10 + i17, rect.bottom - i7);
                path.arcTo(rectF, 90.0f, 90.0f, false);
            } else {
                path.moveTo(rect.right - b(8.0f), (i13 - this.r) + this.b);
                path.lineTo(rect.left + i7, (i13 - this.r) + this.b);
            }
            if (this.I || i15 == 2 || z11 || z10) {
                path.lineTo(rect.left + i7, rect.top + i7 + i14);
                int i18 = i14 * 2;
                rectF.set(rect.left + i7, rect.top + i7, r3 + i18, r10 + i18);
                path.arcTo(rectF, 180.0f, 90.0f, false);
                int i19 = this.s ? i12 : i14;
                if (i15 == 1) {
                    path.lineTo((rect.right - i7) - i19, rect.top + i7);
                    int i20 = rect.right - i7;
                    int i21 = i19 * 2;
                    rectF.set(i20 - i21, rect.top + i7, i20, r11 + i21);
                } else {
                    path.lineTo((rect.right - b(8.0f)) - i19, rect.top + i7);
                    int i22 = i19 * 2;
                    rectF.set((rect.right - b(8.0f)) - i22, rect.top + i7, rect.right - b(8.0f), rect.top + i7 + i22);
                }
                path.arcTo(rectF, 270.0f, 90.0f, false);
            } else {
                path.lineTo(rect.left + i7, (i13 - this.r) - b(2.0f));
                if (i15 == 1) {
                    path.lineTo(rect.right - i7, (i13 - this.r) - b(2.0f));
                } else {
                    path.lineTo(rect.right - b(8.0f), (i13 - this.r) - b(2.0f));
                }
            }
            if (i15 == 1) {
                if (z11 || z9) {
                    if (this.t) {
                        i14 = i12;
                    }
                    path.lineTo(rect.right - i7, (rect.bottom - i7) - i14);
                    int i23 = i14 * 2;
                    rectF.set(r3 - i23, r2 - i23, rect.right - i7, rect.bottom - i7);
                    path.arcTo(rectF, 0.0f, 90.0f, false);
                } else {
                    path.lineTo(rect.right - i7, (i13 - this.r) + this.b);
                }
            } else if (this.I || i15 == 2 || z11 || z9) {
                path.lineTo(rect.right - b(8.0f), ((rect.bottom - i7) - i11) - b(3.0f));
                int i24 = i11 * 2;
                rectF.set(rect.right - b(8.0f), ((rect.bottom - i7) - i24) - b(9.0f), (rect.right - b(7.0f)) + i24, (rect.bottom - i7) - b(1.0f));
                path.arcTo(rectF, 180.0f, -83.0f, false);
            } else {
                path.lineTo(rect.right - b(8.0f), (i13 - this.r) + this.b);
            }
        } else {
            if (this.I || i15 == 2 || z11 || z9) {
                int i25 = this.u ? i12 : i14;
                if (i15 == 1) {
                    path.moveTo(b(8.0f) + rect.left + i25, rect.bottom - i7);
                } else {
                    path.moveTo(b(2.6f) + rect.left, rect.bottom - i7);
                }
                path.lineTo((rect.right - i7) - i25, rect.bottom - i7);
                int i26 = i25 * 2;
                rectF.set(r10 - i26, r13 - i26, rect.right - i7, rect.bottom - i7);
                path.arcTo(rectF, 90.0f, -90.0f, false);
            } else {
                path.moveTo(b(8.0f) + rect.left, (i13 - this.r) + this.b);
                path.lineTo(rect.right - i7, (i13 - this.r) + this.b);
            }
            if (this.I || i15 == 2 || z11 || z10) {
                path.lineTo(rect.right - i7, rect.top + i7 + i14);
                int i27 = rect.right - i7;
                int i28 = i14 * 2;
                rectF.set(i27 - i28, rect.top + i7, i27, r13 + i28);
                path.arcTo(rectF, 0.0f, -90.0f, false);
                int i29 = this.s ? i12 : i14;
                if (i15 == 1) {
                    path.lineTo(rect.left + i7 + i29, rect.top + i7);
                    int i30 = i29 * 2;
                    rectF.set(rect.left + i7, rect.top + i7, r10 + i30, r13 + i30);
                } else {
                    path.lineTo(b(8.0f) + rect.left + i29, rect.top + i7);
                    int i31 = i29 * 2;
                    rectF.set(b(8.0f) + rect.left, rect.top + i7, b(8.0f) + rect.left + i31, rect.top + i7 + i31);
                }
                path.arcTo(rectF, 270.0f, -90.0f, false);
            } else {
                path.lineTo(rect.right - i7, (i13 - this.r) - b(2.0f));
                if (i15 == 1) {
                    path.lineTo(rect.left + i7, (i13 - this.r) - b(2.0f));
                } else {
                    path.lineTo(b(8.0f) + rect.left, (i13 - this.r) - b(2.0f));
                }
            }
            if (i15 == 1) {
                if (z11 || z9) {
                    if (this.t || this.u) {
                        i14 = i12;
                    }
                    path.lineTo(rect.left + i7, (rect.bottom - i7) - i14);
                    int i32 = i14 * 2;
                    rectF.set(rect.left + i7, r2 - i32, r3 + i32, rect.bottom - i7);
                    path.arcTo(rectF, 180.0f, -90.0f, false);
                } else {
                    path.lineTo(rect.left + i7, (i13 - this.r) + this.b);
                }
            } else if (this.I || i15 == 2 || z11 || z9) {
                path.lineTo(b(8.0f) + rect.left, ((rect.bottom - i7) - i11) - b(3.0f));
                int i33 = i11 * 2;
                rectF.set((b(7.0f) + rect.left) - i33, ((rect.bottom - i7) - i33) - b(9.0f), b(8.0f) + rect.left, (rect.bottom - i7) - b(1.0f));
                path.arcTo(rectF, 0.0f, 83.0f, false);
            } else {
                path.lineTo(b(8.0f) + rect.left, (i13 - this.r) + this.b);
            }
        }
        path.close();
    }

    public final Drawable f() {
        int g10;
        int i7;
        Drawable[][] drawableArr;
        int[][] iArr;
        int i10;
        int i11;
        Rect rect = this.o;
        int i12 = this.Q;
        if (i12 == 0) {
            i12 = this.R > 0.0f ? 0 : b(iz.Y0);
        }
        boolean z9 = this.s;
        char c10 = (z9 && this.t) ? (char) 3 : z9 ? (char) 2 : this.t ? (char) 1 : (char) 0;
        boolean z10 = this.m;
        char c11 = (z10 && this.u) ? (char) 3 : z10 ? (char) 1 : this.u ? (char) 2 : (char) 0;
        Integer num = this.w;
        boolean z11 = this.q;
        if (num != null) {
            g10 = num.intValue();
        } else if (z11 && m()) {
            g10 = h();
        } else if (z10) {
            g10 = g(z11 ? m6.pb : m6.Rc);
        } else {
            g10 = g(z11 ? m6.ob : m6.ra);
        }
        boolean z12 = (!this.x || this.a != null || z10 || this.L || m()) ? false : true;
        int g11 = g(z11 ? m6.qb : m6.ta);
        boolean z13 = this.M;
        Drawable[][] drawableArr2 = this.D;
        int[][] iArr2 = this.E;
        int[] iArr3 = this.B;
        int[][] iArr4 = this.C;
        if (z13 == z12 && iArr4[c11][c10] == i12 && ((!z12 || iArr3[c10] == g11) && iArr2[c11][c10] == g10)) {
            i7 = g10;
            drawableArr = drawableArr2;
            iArr = iArr2;
        } else {
            iArr4[c11][c10] = i12;
            this.S = true;
            try {
                Bitmap createBitmap = Bitmap.createBitmap(b(50.0f), b(40.0f), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                rect.set(getBounds());
                if (z12) {
                    iArr3[c10] = g11;
                    Paint paint = new Paint(1);
                    i10 = 1;
                    paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, b(40.0f), new int[]{358573417, 694117737}, (float[]) null, Shader.TileMode.CLAMP));
                    paint.setColorFilter(new PorterDuffColorFilter(g11, PorterDuff.Mode.MULTIPLY));
                    paint.setShadowLayer(2.0f, 0.0f, 1.0f, -1);
                    if (org.telegram.messenger.g0.p > 1.0f) {
                        setBounds(-1, -1, createBitmap.getWidth() + 1, createBitmap.getHeight() + 1);
                        i11 = 0;
                    } else {
                        i11 = 0;
                        setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                    }
                    c(canvas, paint);
                    if (org.telegram.messenger.g0.p > 1.0f) {
                        paint.setColor(i11);
                        paint.setShadowLayer(0.0f, 0.0f, 0.0f, i11);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        c(canvas, paint);
                    }
                } else {
                    i10 = 1;
                }
                Paint paint2 = new Paint(i10);
                paint2.setColor(g10);
                setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                c(canvas, paint2);
                drawableArr = drawableArr2;
                iArr = iArr2;
                i7 = g10;
                try {
                    drawableArr2[c11][c10] = new NinePatchDrawable(createBitmap, c8.n0.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, i7).array(), new Rect(), null);
                    setBounds(rect);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                i7 = g10;
                drawableArr = drawableArr2;
                iArr = iArr2;
            }
            this.S = false;
        }
        this.M = z12;
        iArr[c11][c10] = i7;
        return drawableArr[c11][c10];
    }

    public final void finalize() {
        super.finalize();
        Bitmap[] bitmapArr = this.z;
        for (Bitmap bitmap : bitmapArr) {
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        Arrays.fill(bitmapArr, (Object) null);
        Arrays.fill(this.A, (Object) null);
        Arrays.fill(this.y, -1);
    }

    public int g(int i7) {
        if (this.l == 2) {
            return m6.x0(null, i7, false);
        }
        h6 h6Var = this.p;
        return h6Var != null ? h6Var.h(i7) : m6.x0(null, i7, false);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public final int h() {
        int g10 = g(m6.La);
        if (this.m) {
            g10 = i0.a.o(g10, Math.min(qs.e4, Color.alpha(g10) * 2));
        }
        return i0.a.k(g10, g(m6.ua));
    }

    public int i(int i7) {
        if (this.l == 2) {
            return m6.x0(null, i7, false);
        }
        h6 h6Var = this.p;
        return h6Var != null ? h6Var.j(i7) : m6.im.get(i7);
    }

    public final qa0 j() {
        boolean z9 = this.v;
        qa0[] qa0VarArr = T;
        if (z9) {
            return qa0VarArr[2];
        }
        return qa0VarArr[this.l == 2 ? (char) 1 : (char) 0];
    }

    public final Drawable k() {
        int i7;
        if (this.L || m() || (this.a == null && !this.m && this.J == null)) {
            return null;
        }
        int b10 = b(iz.Y0);
        boolean z9 = this.s;
        boolean z10 = false;
        char c10 = (z9 && this.t) ? (char) 3 : z9 ? (char) 2 : this.t ? (char) 1 : (char) 0;
        int[] iArr = this.y;
        int i10 = iArr[c10];
        Drawable[] drawableArr = this.A;
        if (i10 != b10) {
            iArr[c10] = b10;
            Bitmap[] bitmapArr = this.z;
            Bitmap bitmap = bitmapArr[c10];
            if (bitmap != null) {
                bitmap.recycle();
            }
            try {
                Bitmap createBitmap = Bitmap.createBitmap(b(50.0f), b(40.0f), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(1);
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, b(40.0f), new int[]{358573417, 694117737}, (float[]) null, Shader.TileMode.CLAMP));
                paint.setShadowLayer(2.0f, 0.0f, 1.0f, -1);
                if (org.telegram.messenger.g0.p > 1.0f) {
                    setBounds(-1, -1, createBitmap.getWidth() + 1, createBitmap.getHeight() + 1);
                } else {
                    setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                }
                c(canvas, paint);
                if (org.telegram.messenger.g0.p > 1.0f) {
                    paint.setColor(0);
                    paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                    c(canvas, paint);
                    i7 = 0;
                } else {
                    i7 = 1;
                }
                bitmapArr[c10] = createBitmap;
                drawableArr[c10] = new NinePatchDrawable(createBitmap, c8.n0.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, i7).array(), new Rect(), null);
                z10 = true;
            } catch (Throwable unused) {
            }
        }
        int g10 = g(this.q ? m6.qb : m6.ta);
        Drawable drawable = drawableArr[c10];
        if (drawable != null) {
            int[] iArr2 = this.B;
            if (iArr2[c10] != g10 || z10) {
                drawable.setColorFilter(new PorterDuffColorFilter(g10, PorterDuff.Mode.MULTIPLY));
                iArr2[c10] = g10;
            }
        }
        return drawableArr[c10];
    }

    public final boolean l() {
        return this.a != null && m6.km;
    }

    public final boolean m() {
        return m6.i1(this.p) && this.l != 2 && this.w == null;
    }

    public final Path n() {
        int b10;
        int i7;
        boolean z9;
        boolean z10;
        Path path;
        m.c3 c3Var = this.P;
        Rect bounds = getBounds();
        int b11 = b(2.0f);
        int i10 = this.Q;
        int i11 = this.l;
        if (i10 != 0) {
            i7 = i10;
        } else {
            if (this.R > 0.0f) {
                i10 = org.telegram.messenger.g0.W1(this.R, b(iz.Y0), Math.min(bounds.width(), bounds.height()) / 2);
                b10 = org.telegram.messenger.g0.W1(this.R, b(Math.min(6, iz.Y0)), Math.min(bounds.width(), bounds.height()) / 2);
            } else if (i11 == 2) {
                i10 = b(6.0f);
                b10 = b(6.0f);
            } else {
                i10 = b(iz.Y0);
                b10 = b(Math.min(6, iz.Y0));
            }
            i7 = b10;
        }
        int b12 = b(6.0f);
        int max = Math.max(bounds.top, 0);
        boolean z11 = true;
        if (c3Var == null || bounds.height() >= this.b) {
            z9 = i11 != 1 ? (this.r + bounds.bottom) - i10 < this.b : (this.r + bounds.bottom) - (b12 * 2) < this.b;
            z10 = (i10 * 2) + this.r >= 0;
        } else {
            z9 = true;
            z10 = true;
        }
        if (c3Var != null) {
            path = (Path) c3Var.c;
            z11 = c3Var.b(bounds, z9, z10);
        } else {
            path = this.n;
        }
        if (!z11 && this.Q == 0) {
            return path;
        }
        boolean z12 = z9;
        Path path2 = path;
        e(path2, bounds, b11, i10, b12, i7, max, z12, z10, true);
        return path2;
    }

    public void o(int i7, int i10, int i11) {
        p(i7, i10, i11, i11, 0, 0, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0076  */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void p(int i7, int i10, int i11, int i12, int i13, int i14, boolean z9, boolean z10) {
        int i15;
        int i16;
        int g10;
        int i17;
        int i18;
        int i19;
        boolean z11;
        boolean z12;
        char c10;
        boolean z13;
        int i20;
        ?? r11;
        boolean z14;
        u4 u4Var = this.J;
        if (u4Var != null) {
            i15 = i11;
            i16 = i13;
            u4Var.p(i7, i10, i15, i12, i16, i14, z9, z10);
        } else {
            i15 = i11;
            i16 = i13;
        }
        Integer num = this.w;
        if (num != null) {
            g10 = num.intValue();
        } else {
            boolean z15 = this.q;
            if (z15 && m()) {
                g10 = h();
            } else {
                boolean z16 = this.m;
                if (z15) {
                    g10 = g(z16 ? m6.pb : m6.ob);
                    i17 = i(m6.rb);
                    i18 = i(m6.sb);
                    i19 = i(m6.tb);
                    z11 = i(m6.Oc) != 0;
                    if (i17 != 0) {
                        g10 = g(m6.ob);
                    }
                    boolean z17 = this.v;
                    int i21 = this.l;
                    char c11 = !z17 ? (char) 2 : i21 == 2 ? (char) 1 : (char) 0;
                    z12 = this.L;
                    qa0[] qa0VarArr = T;
                    if (z12 && i18 != 0 && z11) {
                        c10 = 3;
                        qa0 qa0Var = qa0VarArr[c11];
                        if (qa0Var != null) {
                            int[] iArr = qa0Var.a;
                            z13 = true;
                            this.e = iArr[0];
                            this.f = iArr[1];
                            this.g = iArr[2];
                            this.h = iArr[3];
                            Paint paint = this.c;
                            if (!z12 && i18 != 0 && z11) {
                                if (i15 != this.b || this.O == null || this.e != g10 || this.f != i17 || this.g != i18 || this.h != i19 || this.i != z11) {
                                    if (this.N == null) {
                                        Bitmap createBitmap = Bitmap.createBitmap(60, 80, Bitmap.Config.ARGB_8888);
                                        this.N = createBitmap;
                                        createBitmap.setHasAlpha(false);
                                        Bitmap bitmap = this.N;
                                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                                        this.O = new BitmapShader(bitmap, tileMode, tileMode);
                                    }
                                    if (qa0VarArr[c11] == null) {
                                        qa0 qa0Var2 = new qa0();
                                        qa0VarArr[c11] = qa0Var2;
                                        if (i21 != 2) {
                                            boolean z18 = z13;
                                            qa0Var2.t = z18;
                                            z14 = z18;
                                        } else {
                                            z14 = z13;
                                        }
                                        qa0Var2.v(b(1.0f));
                                        r11 = z14;
                                    } else {
                                        r11 = z13;
                                    }
                                    qa0 qa0Var3 = qa0VarArr[c11];
                                    Bitmap bitmap2 = this.N;
                                    int[] iArr2 = qa0Var3.a;
                                    iArr2[0] = g10;
                                    iArr2[r11] = i17;
                                    iArr2[2] = i18;
                                    iArr2[c10] = i19;
                                    Utilities.generateGradient(bitmap2, qa0Var3.i, qa0Var3.e.getInterpolation(qa0Var3.h), iArr2);
                                    this.O.setLocalMatrix(this.k);
                                }
                                BitmapShader bitmapShader = this.O;
                                this.a = bitmapShader;
                                paint.setShader(bitmapShader);
                                paint.setColor(-1);
                                this.e = g10;
                                this.i = z11;
                                this.f = i17;
                                this.g = i18;
                                this.h = i19;
                            } else if (i17 == 0 && (this.a == null || i15 != this.b || this.e != g10 || this.f != i17 || this.g != i18 || this.h != i19 || this.i != z11)) {
                                if (i18 != 0 && z11) {
                                    if (qa0VarArr[c11] == null) {
                                        qa0 qa0Var4 = new qa0();
                                        qa0VarArr[c11] = qa0Var4;
                                        if (i21 != 2) {
                                            qa0Var4.t = true;
                                        }
                                        qa0Var4.v(b(1.0f));
                                    }
                                    qa0VarArr[c11].n(g10, i17, i18, i19);
                                    this.a = qa0VarArr[c11].v;
                                } else if (i18 == 0) {
                                    this.a = new LinearGradient(0.0f, i16, 0.0f, i15, new int[]{i17, g10}, (float[]) null, Shader.TileMode.CLAMP);
                                } else if (i19 != 0) {
                                    this.a = new LinearGradient(0.0f, i16, 0.0f, i15, new int[]{i19, i18, i17, g10}, (float[]) null, Shader.TileMode.CLAMP);
                                } else {
                                    this.a = new LinearGradient(0.0f, i16, 0.0f, i15, new int[]{i18, i17, g10}, (float[]) null, Shader.TileMode.CLAMP);
                                }
                                paint.setShader(this.a);
                                this.e = g10;
                                this.i = z11;
                                this.f = i17;
                                this.g = i18;
                                this.h = i19;
                                paint.setColor(-1);
                            } else if (i17 == 0) {
                                if (this.a != null) {
                                    this.a = null;
                                    paint.setShader(null);
                                }
                                paint.setColor(g10);
                            }
                            if (this.a instanceof BitmapShader) {
                                i20 = 0;
                                qa0VarArr[c11].setBounds(0, i16, i10, i15 - i12);
                            } else {
                                i20 = 0;
                            }
                            this.b = i15;
                            if (this.a instanceof BitmapShader) {
                                i20 = i12;
                            }
                            this.r = i7 - i20;
                            this.s = z9;
                            this.t = z10;
                        }
                    } else {
                        c10 = 3;
                    }
                    z13 = true;
                    Paint paint2 = this.c;
                    if (!z12) {
                    }
                    if (i17 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    if (this.a instanceof BitmapShader) {
                    }
                    this.b = i15;
                    if (this.a instanceof BitmapShader) {
                    }
                    this.r = i7 - i20;
                    this.s = z9;
                    this.t = z10;
                }
                g10 = g(z16 ? m6.Rc : m6.ra);
            }
        }
        i17 = 0;
        i18 = 0;
        i19 = 0;
        z11 = false;
        if (i17 != 0) {
        }
        boolean z172 = this.v;
        int i212 = this.l;
        if (!z172) {
        }
        z12 = this.L;
        qa0[] qa0VarArr2 = T;
        if (z12) {
        }
        c10 = 3;
        z13 = true;
        Paint paint22 = this.c;
        if (!z12) {
        }
        if (i17 == 0) {
        }
        if (i17 == 0) {
        }
        if (this.a instanceof BitmapShader) {
        }
        this.b = i15;
        if (this.a instanceof BitmapShader) {
        }
        this.r = i7 - i20;
        this.s = z9;
        this.t = z10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        int i10 = this.H;
        Paint paint = this.c;
        if (i10 != i7 || paint.getAlpha() != i7) {
            this.H = i7;
            paint.setAlpha(i7);
            if (this.q) {
                this.d.setAlpha((int) ((i7 / 255.0f) * Color.alpha(g(m6.Pc))));
            }
        }
        if (this.a == null) {
            Drawable f10 = f();
            if (f10.getAlpha() != i7) {
                f10.setAlpha(i7);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i7, int i10, int i11, int i12) {
        super.setBounds(i7, i10, i11, i12);
        u4 u4Var = this.J;
        if (u4Var != null) {
            u4Var.setBounds(i7, i10, i11, i12);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(int i7, PorterDuff.Mode mode) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
