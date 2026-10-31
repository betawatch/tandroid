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
import org.telegram.messenger.tz;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.jb0;
import w7.k9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class c5 extends Drawable {
    public static final jb0[] T = new jb0[3];
    public NinePatchDrawable F;
    public int G;
    public boolean I;
    public c5 J;
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
    public p6 p;
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
    public int H = zs.e4;

    public c5(int i10, boolean z10, boolean z11, p6 p6Var) {
        this.p = p6Var;
        this.q = z10;
        this.l = i10;
        this.m = z11;
    }

    public final void a() {
        Bitmap bitmap;
        if (this.a instanceof BitmapShader) {
            boolean z10 = this.L;
            Matrix matrix = this.k;
            jb0[] jb0VarArr = T;
            int i10 = this.l;
            char c10 = 2;
            if (z10 && (bitmap = this.N) != null) {
                char c11 = i10 == 2 ? (char) 1 : (char) 0;
                float min = 1.0f / Math.min(bitmap.getWidth() / jb0VarArr[c11].getBounds().width(), this.N.getHeight() / jb0VarArr[c11].getBounds().height());
                matrix.postScale(min, min);
            } else {
                if (!this.v) {
                    c10 = i10 == 2 ? (char) 1 : (char) 0;
                }
                Bitmap bitmap2 = jb0VarArr[c10].k;
                float min2 = 1.0f / Math.min(bitmap2.getWidth() / jb0VarArr[c10].getBounds().width(), bitmap2.getHeight() / jb0VarArr[c10].getBounds().height());
                matrix.postScale(min2, min2);
            }
        }
    }

    public final int b(float f7) {
        return this.l == 2 ? (int) Math.ceil(f7 * 3.0f) : org.telegram.messenger.i0.L(f7);
    }

    public final void c(Canvas canvas, Paint paint) {
        int b10;
        int i10;
        Path path;
        boolean z10;
        c5 c5Var;
        Path path2;
        Drawable g10;
        if (this.q || !n() || this.S) {
            Rect bounds = getBounds();
            Paint paint2 = this.c;
            if (paint == null && paint2.getStyle() == Paint.Style.FILL && this.a == null && this.Q == 0 && this.R <= 0.0f && (g10 = g()) != null) {
                g10.setBounds(bounds);
                g10.draw(canvas);
                return;
            }
            int b11 = b(2.0f);
            int i11 = this.Q;
            if (i11 != 0) {
                i10 = i11;
            } else {
                if (this.R > 0.0f) {
                    i11 = org.telegram.messenger.i0.W1(this.R, b(tz.Y0), Math.min(bounds.width(), bounds.height()) / 2);
                    b10 = org.telegram.messenger.i0.W1(this.R, b(Math.min(6, tz.Y0)), Math.min(bounds.width(), bounds.height()) / 2);
                } else if (this.l == 2) {
                    i11 = b(6.0f);
                    b10 = b(6.0f);
                } else {
                    i11 = b(tz.Y0);
                    b10 = b(Math.min(6, tz.Y0));
                }
                i10 = b10;
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
                int i12 = this.b;
            }
            m.c3 c3Var = this.P;
            boolean z11 = true;
            if (c3Var != null) {
                path = (Path) c3Var.c;
                z10 = c3Var.b(bounds, true, true);
            } else {
                path = this.n;
                z10 = true;
            }
            if (z10 || this.Q != 0) {
                if (paint == null) {
                    z11 = false;
                }
                c5Var = this;
                int i13 = i11;
                path2 = path;
                c5Var.f(path2, bounds, b11, i13, b12, i10, max, true, true, z11);
            } else {
                c5Var = this;
                path2 = path;
            }
            canvas.drawPath(path2, paint2);
            if (c5Var.a != null && c5Var.m && paint == null) {
                int o10 = i0.b.o(h(t6.Pc), (int) ((Color.alpha(r15) * c5Var.H) / 255.0f));
                Paint paint3 = c5Var.d;
                paint3.setColor(o10);
                canvas.drawPath(path2, paint3);
            }
        }
    }

    public final void d(Canvas canvas, m.c3 c3Var) {
        e(canvas, c3Var, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        c5 c5Var = this.J;
        if (c5Var == null) {
            c(canvas, null);
            return;
        }
        c5Var.draw(canvas);
        setAlpha((int) (this.K * 255.0f));
        c(canvas, null);
        setAlpha(zs.e4);
    }

    public final void e(Canvas canvas, m.c3 c3Var, Paint paint) {
        this.P = c3Var;
        c5 c5Var = this.J;
        if (c5Var != null) {
            c5Var.P = c3Var;
        }
        c(canvas, paint);
        this.P = null;
        c5 c5Var2 = this.J;
        if (c5Var2 != null) {
            c5Var2.P = null;
        }
    }

    public final void f(Path path, Rect rect, int i10, int i11, int i12, int i13, int i14, boolean z10, boolean z11, boolean z12) {
        path.rewind();
        int height = (rect.height() - i10) >> 1;
        int i15 = i11;
        if (i15 > height) {
            i15 = height;
        }
        boolean z13 = this.q;
        int i16 = this.l;
        RectF rectF = this.j;
        if (z13) {
            if (this.I || i16 == 2 || z12 || z10) {
                int i17 = this.u ? i13 : i15;
                if (i16 == 1) {
                    path.moveTo((rect.right - b(8.0f)) - i17, rect.bottom - i10);
                } else {
                    path.moveTo(rect.right - b(2.6f), rect.bottom - i10);
                }
                path.lineTo(rect.left + i10 + i17, rect.bottom - i10);
                int i18 = i17 * 2;
                rectF.set(rect.left + i10, r13 - i18, r10 + i18, rect.bottom - i10);
                path.arcTo(rectF, 90.0f, 90.0f, false);
            } else {
                path.moveTo(rect.right - b(8.0f), (i14 - this.r) + this.b);
                path.lineTo(rect.left + i10, (i14 - this.r) + this.b);
            }
            if (this.I || i16 == 2 || z12 || z11) {
                path.lineTo(rect.left + i10, rect.top + i10 + i15);
                int i19 = i15 * 2;
                rectF.set(rect.left + i10, rect.top + i10, r3 + i19, r10 + i19);
                path.arcTo(rectF, 180.0f, 90.0f, false);
                int i20 = this.s ? i13 : i15;
                if (i16 == 1) {
                    path.lineTo((rect.right - i10) - i20, rect.top + i10);
                    int i21 = rect.right - i10;
                    int i22 = i20 * 2;
                    rectF.set(i21 - i22, rect.top + i10, i21, r11 + i22);
                } else {
                    path.lineTo((rect.right - b(8.0f)) - i20, rect.top + i10);
                    int i23 = i20 * 2;
                    rectF.set((rect.right - b(8.0f)) - i23, rect.top + i10, rect.right - b(8.0f), rect.top + i10 + i23);
                }
                path.arcTo(rectF, 270.0f, 90.0f, false);
            } else {
                path.lineTo(rect.left + i10, (i14 - this.r) - b(2.0f));
                if (i16 == 1) {
                    path.lineTo(rect.right - i10, (i14 - this.r) - b(2.0f));
                } else {
                    path.lineTo(rect.right - b(8.0f), (i14 - this.r) - b(2.0f));
                }
            }
            if (i16 == 1) {
                if (z12 || z10) {
                    if (this.t) {
                        i15 = i13;
                    }
                    path.lineTo(rect.right - i10, (rect.bottom - i10) - i15);
                    int i24 = i15 * 2;
                    rectF.set(r3 - i24, r2 - i24, rect.right - i10, rect.bottom - i10);
                    path.arcTo(rectF, 0.0f, 90.0f, false);
                } else {
                    path.lineTo(rect.right - i10, (i14 - this.r) + this.b);
                }
            } else if (this.I || i16 == 2 || z12 || z10) {
                path.lineTo(rect.right - b(8.0f), ((rect.bottom - i10) - i12) - b(3.0f));
                int i25 = i12 * 2;
                rectF.set(rect.right - b(8.0f), ((rect.bottom - i10) - i25) - b(9.0f), (rect.right - b(7.0f)) + i25, (rect.bottom - i10) - b(1.0f));
                path.arcTo(rectF, 180.0f, -83.0f, false);
            } else {
                path.lineTo(rect.right - b(8.0f), (i14 - this.r) + this.b);
            }
        } else {
            if (this.I || i16 == 2 || z12 || z10) {
                int i26 = this.u ? i13 : i15;
                if (i16 == 1) {
                    path.moveTo(b(8.0f) + rect.left + i26, rect.bottom - i10);
                } else {
                    path.moveTo(b(2.6f) + rect.left, rect.bottom - i10);
                }
                path.lineTo((rect.right - i10) - i26, rect.bottom - i10);
                int i27 = i26 * 2;
                rectF.set(r10 - i27, r13 - i27, rect.right - i10, rect.bottom - i10);
                path.arcTo(rectF, 90.0f, -90.0f, false);
            } else {
                path.moveTo(b(8.0f) + rect.left, (i14 - this.r) + this.b);
                path.lineTo(rect.right - i10, (i14 - this.r) + this.b);
            }
            if (this.I || i16 == 2 || z12 || z11) {
                path.lineTo(rect.right - i10, rect.top + i10 + i15);
                int i28 = rect.right - i10;
                int i29 = i15 * 2;
                rectF.set(i28 - i29, rect.top + i10, i28, r13 + i29);
                path.arcTo(rectF, 0.0f, -90.0f, false);
                int i30 = this.s ? i13 : i15;
                if (i16 == 1) {
                    path.lineTo(rect.left + i10 + i30, rect.top + i10);
                    int i31 = i30 * 2;
                    rectF.set(rect.left + i10, rect.top + i10, r10 + i31, r13 + i31);
                } else {
                    path.lineTo(b(8.0f) + rect.left + i30, rect.top + i10);
                    int i32 = i30 * 2;
                    rectF.set(b(8.0f) + rect.left, rect.top + i10, b(8.0f) + rect.left + i32, rect.top + i10 + i32);
                }
                path.arcTo(rectF, 270.0f, -90.0f, false);
            } else {
                path.lineTo(rect.right - i10, (i14 - this.r) - b(2.0f));
                if (i16 == 1) {
                    path.lineTo(rect.left + i10, (i14 - this.r) - b(2.0f));
                } else {
                    path.lineTo(b(8.0f) + rect.left, (i14 - this.r) - b(2.0f));
                }
            }
            if (i16 == 1) {
                if (z12 || z10) {
                    if (this.t || this.u) {
                        i15 = i13;
                    }
                    path.lineTo(rect.left + i10, (rect.bottom - i10) - i15);
                    int i33 = i15 * 2;
                    rectF.set(rect.left + i10, r2 - i33, r3 + i33, rect.bottom - i10);
                    path.arcTo(rectF, 180.0f, -90.0f, false);
                } else {
                    path.lineTo(rect.left + i10, (i14 - this.r) + this.b);
                }
            } else if (this.I || i16 == 2 || z12 || z10) {
                path.lineTo(b(8.0f) + rect.left, ((rect.bottom - i10) - i12) - b(3.0f));
                int i34 = i12 * 2;
                rectF.set((b(7.0f) + rect.left) - i34, ((rect.bottom - i10) - i34) - b(9.0f), b(8.0f) + rect.left, (rect.bottom - i10) - b(1.0f));
                path.arcTo(rectF, 0.0f, 83.0f, false);
            } else {
                path.lineTo(b(8.0f) + rect.left, (i14 - this.r) + this.b);
            }
        }
        path.close();
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

    public final Drawable g() {
        int h;
        int i10;
        Drawable[][] drawableArr;
        int[][] iArr;
        int i11;
        int i12;
        Rect rect = this.o;
        int i13 = this.Q;
        if (i13 == 0) {
            i13 = this.R > 0.0f ? 0 : b(tz.Y0);
        }
        boolean z10 = this.s;
        char c10 = (z10 && this.t) ? (char) 3 : z10 ? (char) 2 : this.t ? (char) 1 : (char) 0;
        boolean z11 = this.m;
        char c11 = (z11 && this.u) ? (char) 3 : z11 ? (char) 1 : this.u ? (char) 2 : (char) 0;
        Integer num = this.w;
        boolean z12 = this.q;
        if (num != null) {
            h = num.intValue();
        } else if (z12 && n()) {
            h = i();
        } else if (z11) {
            h = h(z12 ? t6.pb : t6.Rc);
        } else {
            h = h(z12 ? t6.ob : t6.ra);
        }
        boolean z13 = (!this.x || this.a != null || z11 || this.L || n()) ? false : true;
        int h10 = h(z12 ? t6.qb : t6.ta);
        boolean z14 = this.M;
        Drawable[][] drawableArr2 = this.D;
        int[][] iArr2 = this.E;
        int[] iArr3 = this.B;
        int[][] iArr4 = this.C;
        if (z14 == z13 && iArr4[c11][c10] == i13 && ((!z13 || iArr3[c10] == h10) && iArr2[c11][c10] == h)) {
            i10 = h;
            drawableArr = drawableArr2;
            iArr = iArr2;
        } else {
            iArr4[c11][c10] = i13;
            this.S = true;
            try {
                Bitmap createBitmap = Bitmap.createBitmap(b(50.0f), b(40.0f), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                rect.set(getBounds());
                if (z13) {
                    iArr3[c10] = h10;
                    Paint paint = new Paint(1);
                    i11 = 1;
                    paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, b(40.0f), new int[]{358573417, 694117737}, (float[]) null, Shader.TileMode.CLAMP));
                    paint.setColorFilter(new PorterDuffColorFilter(h10, PorterDuff.Mode.MULTIPLY));
                    paint.setShadowLayer(2.0f, 0.0f, 1.0f, -1);
                    if (org.telegram.messenger.i0.p > 1.0f) {
                        setBounds(-1, -1, createBitmap.getWidth() + 1, createBitmap.getHeight() + 1);
                        i12 = 0;
                    } else {
                        i12 = 0;
                        setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                    }
                    c(canvas, paint);
                    if (org.telegram.messenger.i0.p > 1.0f) {
                        paint.setColor(i12);
                        paint.setShadowLayer(0.0f, 0.0f, 0.0f, i12);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        c(canvas, paint);
                    }
                } else {
                    i11 = 1;
                }
                Paint paint2 = new Paint(i11);
                paint2.setColor(h);
                setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                c(canvas, paint2);
                drawableArr = drawableArr2;
                iArr = iArr2;
                i10 = h;
                try {
                    drawableArr2[c11][c10] = new NinePatchDrawable(createBitmap, k9.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, i10).array(), new Rect(), null);
                    setBounds(rect);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                i10 = h;
                drawableArr = drawableArr2;
                iArr = iArr2;
            }
            this.S = false;
        }
        this.M = z13;
        iArr[c11][c10] = i10;
        return drawableArr[c11][c10];
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public int h(int i10) {
        if (this.l == 2) {
            return t6.x0(null, i10, false);
        }
        p6 p6Var = this.p;
        return p6Var != null ? p6Var.h(i10) : t6.x0(null, i10, false);
    }

    public final int i() {
        int h = h(t6.La);
        if (this.m) {
            h = i0.b.o(h, Math.min(zs.e4, Color.alpha(h) * 2));
        }
        return i0.b.k(h, h(t6.ua));
    }

    public int j(int i10) {
        if (this.l == 2) {
            return t6.x0(null, i10, false);
        }
        p6 p6Var = this.p;
        return p6Var != null ? p6Var.j(i10) : t6.im.get(i10);
    }

    public final jb0 k() {
        boolean z10 = this.v;
        jb0[] jb0VarArr = T;
        if (z10) {
            return jb0VarArr[2];
        }
        return jb0VarArr[this.l == 2 ? (char) 1 : (char) 0];
    }

    public final Drawable l() {
        int i10;
        if (this.L || n() || (this.a == null && !this.m && this.J == null)) {
            return null;
        }
        int b10 = b(tz.Y0);
        boolean z10 = this.s;
        boolean z11 = false;
        char c10 = (z10 && this.t) ? (char) 3 : z10 ? (char) 2 : this.t ? (char) 1 : (char) 0;
        int[] iArr = this.y;
        int i11 = iArr[c10];
        Drawable[] drawableArr = this.A;
        if (i11 != b10) {
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
                if (org.telegram.messenger.i0.p > 1.0f) {
                    setBounds(-1, -1, createBitmap.getWidth() + 1, createBitmap.getHeight() + 1);
                } else {
                    setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                }
                c(canvas, paint);
                if (org.telegram.messenger.i0.p > 1.0f) {
                    paint.setColor(0);
                    paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                    c(canvas, paint);
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                bitmapArr[c10] = createBitmap;
                drawableArr[c10] = new NinePatchDrawable(createBitmap, k9.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, i10).array(), new Rect(), null);
                z11 = true;
            } catch (Throwable unused) {
            }
        }
        int h = h(this.q ? t6.qb : t6.ta);
        Drawable drawable = drawableArr[c10];
        if (drawable != null) {
            int[] iArr2 = this.B;
            if (iArr2[c10] != h || z11) {
                drawable.setColorFilter(new PorterDuffColorFilter(h, PorterDuff.Mode.MULTIPLY));
                iArr2[c10] = h;
            }
        }
        return drawableArr[c10];
    }

    public final boolean m() {
        return this.a != null && t6.km;
    }

    public final boolean n() {
        return t6.i1(this.p) && this.l != 2 && this.w == null;
    }

    public final Path o() {
        int b10;
        int i10;
        boolean z10;
        boolean z11;
        Path path;
        m.c3 c3Var = this.P;
        Rect bounds = getBounds();
        int b11 = b(2.0f);
        int i11 = this.Q;
        int i12 = this.l;
        if (i11 != 0) {
            i10 = i11;
        } else {
            if (this.R > 0.0f) {
                i11 = org.telegram.messenger.i0.W1(this.R, b(tz.Y0), Math.min(bounds.width(), bounds.height()) / 2);
                b10 = org.telegram.messenger.i0.W1(this.R, b(Math.min(6, tz.Y0)), Math.min(bounds.width(), bounds.height()) / 2);
            } else if (i12 == 2) {
                i11 = b(6.0f);
                b10 = b(6.0f);
            } else {
                i11 = b(tz.Y0);
                b10 = b(Math.min(6, tz.Y0));
            }
            i10 = b10;
        }
        int b12 = b(6.0f);
        int max = Math.max(bounds.top, 0);
        boolean z12 = true;
        if (c3Var == null || bounds.height() >= this.b) {
            z10 = i12 != 1 ? (this.r + bounds.bottom) - i11 < this.b : (this.r + bounds.bottom) - (b12 * 2) < this.b;
            z11 = (i11 * 2) + this.r >= 0;
        } else {
            z10 = true;
            z11 = true;
        }
        if (c3Var != null) {
            path = (Path) c3Var.c;
            z12 = c3Var.b(bounds, z10, z11);
        } else {
            path = this.n;
        }
        if (!z12 && this.Q == 0) {
            return path;
        }
        boolean z13 = z10;
        Path path2 = path;
        f(path2, bounds, b11, i11, b12, i10, max, z13, z11, true);
        return path2;
    }

    public void p(int i10, int i11, int i12) {
        q(i10, i11, i12, i12, 0, 0, false, false);
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
    public void q(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, boolean z11) {
        int i16;
        int i17;
        int h;
        int j10;
        int j11;
        int j12;
        boolean z12;
        boolean z13;
        char c10;
        boolean z14;
        int i18;
        ?? r11;
        boolean z15;
        c5 c5Var = this.J;
        if (c5Var != null) {
            i16 = i12;
            i17 = i14;
            c5Var.q(i10, i11, i16, i13, i17, i15, z10, z11);
        } else {
            i16 = i12;
            i17 = i14;
        }
        Integer num = this.w;
        if (num != null) {
            h = num.intValue();
        } else {
            boolean z16 = this.q;
            if (z16 && n()) {
                h = i();
            } else {
                boolean z17 = this.m;
                if (z16) {
                    h = h(z17 ? t6.pb : t6.ob);
                    j10 = j(t6.rb);
                    j11 = j(t6.sb);
                    j12 = j(t6.tb);
                    z12 = j(t6.Oc) != 0;
                    if (j10 != 0) {
                        h = h(t6.ob);
                    }
                    boolean z18 = this.v;
                    int i19 = this.l;
                    char c11 = !z18 ? (char) 2 : i19 == 2 ? (char) 1 : (char) 0;
                    z13 = this.L;
                    jb0[] jb0VarArr = T;
                    if (z13 && j11 != 0 && z12) {
                        c10 = 3;
                        jb0 jb0Var = jb0VarArr[c11];
                        if (jb0Var != null) {
                            int[] iArr = jb0Var.a;
                            z14 = true;
                            this.e = iArr[0];
                            this.f = iArr[1];
                            this.g = iArr[2];
                            this.h = iArr[3];
                            Paint paint = this.c;
                            if (!z13 && j11 != 0 && z12) {
                                if (i16 != this.b || this.O == null || this.e != h || this.f != j10 || this.g != j11 || this.h != j12 || this.i != z12) {
                                    if (this.N == null) {
                                        Bitmap createBitmap = Bitmap.createBitmap(60, 80, Bitmap.Config.ARGB_8888);
                                        this.N = createBitmap;
                                        createBitmap.setHasAlpha(false);
                                        Bitmap bitmap = this.N;
                                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                                        this.O = new BitmapShader(bitmap, tileMode, tileMode);
                                    }
                                    if (jb0VarArr[c11] == null) {
                                        jb0 jb0Var2 = new jb0();
                                        jb0VarArr[c11] = jb0Var2;
                                        if (i19 != 2) {
                                            boolean z19 = z14;
                                            jb0Var2.t = z19;
                                            z15 = z19;
                                        } else {
                                            z15 = z14;
                                        }
                                        jb0Var2.v(b(1.0f));
                                        r11 = z15;
                                    } else {
                                        r11 = z14;
                                    }
                                    jb0 jb0Var3 = jb0VarArr[c11];
                                    Bitmap bitmap2 = this.N;
                                    int[] iArr2 = jb0Var3.a;
                                    iArr2[0] = h;
                                    iArr2[r11] = j10;
                                    iArr2[2] = j11;
                                    iArr2[c10] = j12;
                                    Utilities.generateGradient(bitmap2, jb0Var3.i, jb0Var3.e.getInterpolation(jb0Var3.h), iArr2);
                                    this.O.setLocalMatrix(this.k);
                                }
                                BitmapShader bitmapShader = this.O;
                                this.a = bitmapShader;
                                paint.setShader(bitmapShader);
                                paint.setColor(-1);
                                this.e = h;
                                this.i = z12;
                                this.f = j10;
                                this.g = j11;
                                this.h = j12;
                            } else if (j10 == 0 && (this.a == null || i16 != this.b || this.e != h || this.f != j10 || this.g != j11 || this.h != j12 || this.i != z12)) {
                                if (j11 != 0 && z12) {
                                    if (jb0VarArr[c11] == null) {
                                        jb0 jb0Var4 = new jb0();
                                        jb0VarArr[c11] = jb0Var4;
                                        if (i19 != 2) {
                                            jb0Var4.t = true;
                                        }
                                        jb0Var4.v(b(1.0f));
                                    }
                                    jb0VarArr[c11].n(h, j10, j11, j12);
                                    this.a = jb0VarArr[c11].v;
                                } else if (j11 == 0) {
                                    this.a = new LinearGradient(0.0f, i17, 0.0f, i16, new int[]{j10, h}, (float[]) null, Shader.TileMode.CLAMP);
                                } else if (j12 != 0) {
                                    this.a = new LinearGradient(0.0f, i17, 0.0f, i16, new int[]{j12, j11, j10, h}, (float[]) null, Shader.TileMode.CLAMP);
                                } else {
                                    this.a = new LinearGradient(0.0f, i17, 0.0f, i16, new int[]{j11, j10, h}, (float[]) null, Shader.TileMode.CLAMP);
                                }
                                paint.setShader(this.a);
                                this.e = h;
                                this.i = z12;
                                this.f = j10;
                                this.g = j11;
                                this.h = j12;
                                paint.setColor(-1);
                            } else if (j10 == 0) {
                                if (this.a != null) {
                                    this.a = null;
                                    paint.setShader(null);
                                }
                                paint.setColor(h);
                            }
                            if (this.a instanceof BitmapShader) {
                                i18 = 0;
                                jb0VarArr[c11].setBounds(0, i17, i11, i16 - i13);
                            } else {
                                i18 = 0;
                            }
                            this.b = i16;
                            if (this.a instanceof BitmapShader) {
                                i18 = i13;
                            }
                            this.r = i10 - i18;
                            this.s = z10;
                            this.t = z11;
                        }
                    } else {
                        c10 = 3;
                    }
                    z14 = true;
                    Paint paint2 = this.c;
                    if (!z13) {
                    }
                    if (j10 == 0) {
                    }
                    if (j10 == 0) {
                    }
                    if (this.a instanceof BitmapShader) {
                    }
                    this.b = i16;
                    if (this.a instanceof BitmapShader) {
                    }
                    this.r = i10 - i18;
                    this.s = z10;
                    this.t = z11;
                }
                h = h(z17 ? t6.Rc : t6.ra);
            }
        }
        j10 = 0;
        j11 = 0;
        j12 = 0;
        z12 = false;
        if (j10 != 0) {
        }
        boolean z182 = this.v;
        int i192 = this.l;
        if (!z182) {
        }
        z13 = this.L;
        jb0[] jb0VarArr2 = T;
        if (z13) {
        }
        c10 = 3;
        z14 = true;
        Paint paint22 = this.c;
        if (!z13) {
        }
        if (j10 == 0) {
        }
        if (j10 == 0) {
        }
        if (this.a instanceof BitmapShader) {
        }
        this.b = i16;
        if (this.a instanceof BitmapShader) {
        }
        this.r = i10 - i18;
        this.s = z10;
        this.t = z11;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        int i11 = this.H;
        Paint paint = this.c;
        if (i11 != i10 || paint.getAlpha() != i10) {
            this.H = i10;
            paint.setAlpha(i10);
            if (this.q) {
                this.d.setAlpha((int) ((i10 / 255.0f) * Color.alpha(h(t6.Pc))));
            }
        }
        if (this.a == null) {
            Drawable g10 = g();
            if (g10.getAlpha() != i10) {
                g10.setAlpha(i10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        c5 c5Var = this.J;
        if (c5Var != null) {
            c5Var.setBounds(i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(int i10, PorterDuff.Mode mode) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
