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
import b8.ld;
import java.lang.reflect.Array;
import java.util.Arrays;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.az;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.la0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class t4 extends Drawable {
    public static final la0[] T = new la0[3];
    public NinePatchDrawable F;
    public int G;
    public boolean I;
    public t4 J;
    public float K;
    public boolean L;
    public boolean M;
    public Bitmap N;
    public BitmapShader O;
    public m.b3 P;
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
    public e6 p;
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
    public int H = hs.e4;

    public t4(int i3, boolean z10, boolean z11, e6 e6Var) {
        this.p = e6Var;
        this.q = z10;
        this.l = i3;
        this.m = z11;
    }

    public final void a() {
        Bitmap bitmap;
        if (this.a instanceof BitmapShader) {
            boolean z10 = this.L;
            Matrix matrix = this.k;
            la0[] la0VarArr = T;
            int i3 = this.l;
            char c2 = 2;
            if (z10 && (bitmap = this.N) != null) {
                char c10 = i3 == 2 ? (char) 1 : (char) 0;
                float min = 1.0f / Math.min(bitmap.getWidth() / la0VarArr[c10].getBounds().width(), this.N.getHeight() / la0VarArr[c10].getBounds().height());
                matrix.postScale(min, min);
            } else {
                if (!this.v) {
                    c2 = i3 == 2 ? (char) 1 : (char) 0;
                }
                Bitmap bitmap2 = la0VarArr[c2].k;
                float min2 = 1.0f / Math.min(bitmap2.getWidth() / la0VarArr[c2].getBounds().width(), bitmap2.getHeight() / la0VarArr[c2].getBounds().height());
                matrix.postScale(min2, min2);
            }
        }
    }

    public final int b(float f10) {
        return this.l == 2 ? (int) Math.ceil(f10 * 3.0f) : org.telegram.messenger.g0.L(f10);
    }

    public final void c(Canvas canvas, Paint paint) {
        int b10;
        int i3;
        Path path;
        boolean z10;
        t4 t4Var;
        Path path2;
        Drawable g7;
        if (this.q || !n() || this.S) {
            Rect bounds = getBounds();
            Paint paint2 = this.c;
            if (paint == null && paint2.getStyle() == Paint.Style.FILL && this.a == null && this.Q == 0 && this.R <= 0.0f && (g7 = g()) != null) {
                g7.setBounds(bounds);
                g7.draw(canvas);
                return;
            }
            int b11 = b(2.0f);
            int i10 = this.Q;
            if (i10 != 0) {
                i3 = i10;
            } else {
                if (this.R > 0.0f) {
                    i10 = org.telegram.messenger.g0.W1(this.R, b(az.Y0), Math.min(bounds.width(), bounds.height()) / 2);
                    b10 = org.telegram.messenger.g0.W1(this.R, b(Math.min(6, az.Y0)), Math.min(bounds.width(), bounds.height()) / 2);
                } else if (this.l == 2) {
                    i10 = b(6.0f);
                    b10 = b(6.0f);
                } else {
                    i10 = b(az.Y0);
                    b10 = b(Math.min(6, az.Y0));
                }
                i3 = b10;
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
            m.b3 b3Var = this.P;
            boolean z11 = true;
            if (b3Var != null) {
                path = (Path) b3Var.c;
                z10 = b3Var.b(bounds, true, true);
            } else {
                path = this.n;
                z10 = true;
            }
            if (z10 || this.Q != 0) {
                if (paint == null) {
                    z11 = false;
                }
                t4Var = this;
                int i12 = i10;
                path2 = path;
                t4Var.f(path2, bounds, b11, i12, b12, i3, max, true, true, z11);
            } else {
                t4Var = this;
                path2 = path;
            }
            canvas.drawPath(path2, paint2);
            if (t4Var.a != null && t4Var.m && paint == null) {
                int o10 = i0.a.o(h(k6.Pc), (int) ((Color.alpha(r15) * t4Var.H) / 255.0f));
                Paint paint3 = t4Var.d;
                paint3.setColor(o10);
                canvas.drawPath(path2, paint3);
            }
        }
    }

    public final void d(Canvas canvas, m.b3 b3Var) {
        e(canvas, b3Var, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        t4 t4Var = this.J;
        if (t4Var == null) {
            c(canvas, null);
            return;
        }
        t4Var.draw(canvas);
        setAlpha((int) (this.K * 255.0f));
        c(canvas, null);
        setAlpha(hs.e4);
    }

    public final void e(Canvas canvas, m.b3 b3Var, Paint paint) {
        this.P = b3Var;
        t4 t4Var = this.J;
        if (t4Var != null) {
            t4Var.P = b3Var;
        }
        c(canvas, paint);
        this.P = null;
        t4 t4Var2 = this.J;
        if (t4Var2 != null) {
            t4Var2.P = null;
        }
    }

    public final void f(Path path, Rect rect, int i3, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12) {
        path.rewind();
        int height = (rect.height() - i3) >> 1;
        int i14 = i10;
        if (i14 > height) {
            i14 = height;
        }
        boolean z13 = this.q;
        int i15 = this.l;
        RectF rectF = this.j;
        if (z13) {
            if (this.I || i15 == 2 || z12 || z10) {
                int i16 = this.u ? i12 : i14;
                if (i15 == 1) {
                    path.moveTo((rect.right - b(8.0f)) - i16, rect.bottom - i3);
                } else {
                    path.moveTo(rect.right - b(2.6f), rect.bottom - i3);
                }
                path.lineTo(rect.left + i3 + i16, rect.bottom - i3);
                int i17 = i16 * 2;
                rectF.set(rect.left + i3, r13 - i17, r10 + i17, rect.bottom - i3);
                path.arcTo(rectF, 90.0f, 90.0f, false);
            } else {
                path.moveTo(rect.right - b(8.0f), (i13 - this.r) + this.b);
                path.lineTo(rect.left + i3, (i13 - this.r) + this.b);
            }
            if (this.I || i15 == 2 || z12 || z11) {
                path.lineTo(rect.left + i3, rect.top + i3 + i14);
                int i18 = i14 * 2;
                rectF.set(rect.left + i3, rect.top + i3, r3 + i18, r10 + i18);
                path.arcTo(rectF, 180.0f, 90.0f, false);
                int i19 = this.s ? i12 : i14;
                if (i15 == 1) {
                    path.lineTo((rect.right - i3) - i19, rect.top + i3);
                    int i20 = rect.right - i3;
                    int i21 = i19 * 2;
                    rectF.set(i20 - i21, rect.top + i3, i20, r11 + i21);
                } else {
                    path.lineTo((rect.right - b(8.0f)) - i19, rect.top + i3);
                    int i22 = i19 * 2;
                    rectF.set((rect.right - b(8.0f)) - i22, rect.top + i3, rect.right - b(8.0f), rect.top + i3 + i22);
                }
                path.arcTo(rectF, 270.0f, 90.0f, false);
            } else {
                path.lineTo(rect.left + i3, (i13 - this.r) - b(2.0f));
                if (i15 == 1) {
                    path.lineTo(rect.right - i3, (i13 - this.r) - b(2.0f));
                } else {
                    path.lineTo(rect.right - b(8.0f), (i13 - this.r) - b(2.0f));
                }
            }
            if (i15 == 1) {
                if (z12 || z10) {
                    if (this.t) {
                        i14 = i12;
                    }
                    path.lineTo(rect.right - i3, (rect.bottom - i3) - i14);
                    int i23 = i14 * 2;
                    rectF.set(r3 - i23, r2 - i23, rect.right - i3, rect.bottom - i3);
                    path.arcTo(rectF, 0.0f, 90.0f, false);
                } else {
                    path.lineTo(rect.right - i3, (i13 - this.r) + this.b);
                }
            } else if (this.I || i15 == 2 || z12 || z10) {
                path.lineTo(rect.right - b(8.0f), ((rect.bottom - i3) - i11) - b(3.0f));
                int i24 = i11 * 2;
                rectF.set(rect.right - b(8.0f), ((rect.bottom - i3) - i24) - b(9.0f), (rect.right - b(7.0f)) + i24, (rect.bottom - i3) - b(1.0f));
                path.arcTo(rectF, 180.0f, -83.0f, false);
            } else {
                path.lineTo(rect.right - b(8.0f), (i13 - this.r) + this.b);
            }
        } else {
            if (this.I || i15 == 2 || z12 || z10) {
                int i25 = this.u ? i12 : i14;
                if (i15 == 1) {
                    path.moveTo(b(8.0f) + rect.left + i25, rect.bottom - i3);
                } else {
                    path.moveTo(b(2.6f) + rect.left, rect.bottom - i3);
                }
                path.lineTo((rect.right - i3) - i25, rect.bottom - i3);
                int i26 = i25 * 2;
                rectF.set(r10 - i26, r13 - i26, rect.right - i3, rect.bottom - i3);
                path.arcTo(rectF, 90.0f, -90.0f, false);
            } else {
                path.moveTo(b(8.0f) + rect.left, (i13 - this.r) + this.b);
                path.lineTo(rect.right - i3, (i13 - this.r) + this.b);
            }
            if (this.I || i15 == 2 || z12 || z11) {
                path.lineTo(rect.right - i3, rect.top + i3 + i14);
                int i27 = rect.right - i3;
                int i28 = i14 * 2;
                rectF.set(i27 - i28, rect.top + i3, i27, r13 + i28);
                path.arcTo(rectF, 0.0f, -90.0f, false);
                int i29 = this.s ? i12 : i14;
                if (i15 == 1) {
                    path.lineTo(rect.left + i3 + i29, rect.top + i3);
                    int i30 = i29 * 2;
                    rectF.set(rect.left + i3, rect.top + i3, r10 + i30, r13 + i30);
                } else {
                    path.lineTo(b(8.0f) + rect.left + i29, rect.top + i3);
                    int i31 = i29 * 2;
                    rectF.set(b(8.0f) + rect.left, rect.top + i3, b(8.0f) + rect.left + i31, rect.top + i3 + i31);
                }
                path.arcTo(rectF, 270.0f, -90.0f, false);
            } else {
                path.lineTo(rect.right - i3, (i13 - this.r) - b(2.0f));
                if (i15 == 1) {
                    path.lineTo(rect.left + i3, (i13 - this.r) - b(2.0f));
                } else {
                    path.lineTo(b(8.0f) + rect.left, (i13 - this.r) - b(2.0f));
                }
            }
            if (i15 == 1) {
                if (z12 || z10) {
                    if (this.t || this.u) {
                        i14 = i12;
                    }
                    path.lineTo(rect.left + i3, (rect.bottom - i3) - i14);
                    int i32 = i14 * 2;
                    rectF.set(rect.left + i3, r2 - i32, r3 + i32, rect.bottom - i3);
                    path.arcTo(rectF, 180.0f, -90.0f, false);
                } else {
                    path.lineTo(rect.left + i3, (i13 - this.r) + this.b);
                }
            } else if (this.I || i15 == 2 || z12 || z10) {
                path.lineTo(b(8.0f) + rect.left, ((rect.bottom - i3) - i11) - b(3.0f));
                int i33 = i11 * 2;
                rectF.set((b(7.0f) + rect.left) - i33, ((rect.bottom - i3) - i33) - b(9.0f), b(8.0f) + rect.left, (rect.bottom - i3) - b(1.0f));
                path.arcTo(rectF, 0.0f, 83.0f, false);
            } else {
                path.lineTo(b(8.0f) + rect.left, (i13 - this.r) + this.b);
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
        int i3;
        Drawable[][] drawableArr;
        int[][] iArr;
        int i10;
        int i11;
        Rect rect = this.o;
        int i12 = this.Q;
        if (i12 == 0) {
            i12 = this.R > 0.0f ? 0 : b(az.Y0);
        }
        boolean z10 = this.s;
        char c2 = (z10 && this.t) ? (char) 3 : z10 ? (char) 2 : this.t ? (char) 1 : (char) 0;
        boolean z11 = this.m;
        char c10 = (z11 && this.u) ? (char) 3 : z11 ? (char) 1 : this.u ? (char) 2 : (char) 0;
        Integer num = this.w;
        boolean z12 = this.q;
        if (num != null) {
            h = num.intValue();
        } else if (z12 && n()) {
            h = i();
        } else if (z11) {
            h = h(z12 ? k6.pb : k6.Rc);
        } else {
            h = h(z12 ? k6.ob : k6.ra);
        }
        boolean z13 = (!this.x || this.a != null || z11 || this.L || n()) ? false : true;
        int h7 = h(z12 ? k6.qb : k6.ta);
        boolean z14 = this.M;
        Drawable[][] drawableArr2 = this.D;
        int[][] iArr2 = this.E;
        int[] iArr3 = this.B;
        int[][] iArr4 = this.C;
        if (z14 == z13 && iArr4[c10][c2] == i12 && ((!z13 || iArr3[c2] == h7) && iArr2[c10][c2] == h)) {
            i3 = h;
            drawableArr = drawableArr2;
            iArr = iArr2;
        } else {
            iArr4[c10][c2] = i12;
            this.S = true;
            try {
                Bitmap createBitmap = Bitmap.createBitmap(b(50.0f), b(40.0f), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                rect.set(getBounds());
                if (z13) {
                    iArr3[c2] = h7;
                    Paint paint = new Paint(1);
                    i10 = 1;
                    paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, b(40.0f), new int[]{358573417, 694117737}, (float[]) null, Shader.TileMode.CLAMP));
                    paint.setColorFilter(new PorterDuffColorFilter(h7, PorterDuff.Mode.MULTIPLY));
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
                paint2.setColor(h);
                setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                c(canvas, paint2);
                drawableArr = drawableArr2;
                iArr = iArr2;
                i3 = h;
                try {
                    drawableArr2[c10][c2] = new NinePatchDrawable(createBitmap, ld.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, i3).array(), new Rect(), null);
                    setBounds(rect);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                i3 = h;
                drawableArr = drawableArr2;
                iArr = iArr2;
            }
            this.S = false;
        }
        this.M = z13;
        iArr[c10][c2] = i3;
        return drawableArr[c10][c2];
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public int h(int i3) {
        if (this.l == 2) {
            return k6.x0(null, i3, false);
        }
        e6 e6Var = this.p;
        return e6Var != null ? e6Var.h(i3) : k6.x0(null, i3, false);
    }

    public final int i() {
        int h = h(k6.La);
        if (this.m) {
            h = i0.a.o(h, Math.min(hs.e4, Color.alpha(h) * 2));
        }
        return i0.a.k(h, h(k6.ua));
    }

    public int j(int i3) {
        if (this.l == 2) {
            return k6.x0(null, i3, false);
        }
        e6 e6Var = this.p;
        return e6Var != null ? e6Var.j(i3) : k6.im.get(i3);
    }

    public final la0 k() {
        boolean z10 = this.v;
        la0[] la0VarArr = T;
        if (z10) {
            return la0VarArr[2];
        }
        return la0VarArr[this.l == 2 ? (char) 1 : (char) 0];
    }

    public final Drawable l() {
        int i3;
        if (this.L || n() || (this.a == null && !this.m && this.J == null)) {
            return null;
        }
        int b10 = b(az.Y0);
        boolean z10 = this.s;
        boolean z11 = false;
        char c2 = (z10 && this.t) ? (char) 3 : z10 ? (char) 2 : this.t ? (char) 1 : (char) 0;
        int[] iArr = this.y;
        int i10 = iArr[c2];
        Drawable[] drawableArr = this.A;
        if (i10 != b10) {
            iArr[c2] = b10;
            Bitmap[] bitmapArr = this.z;
            Bitmap bitmap = bitmapArr[c2];
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
                    i3 = 0;
                } else {
                    i3 = 1;
                }
                bitmapArr[c2] = createBitmap;
                drawableArr[c2] = new NinePatchDrawable(createBitmap, ld.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, i3).array(), new Rect(), null);
                z11 = true;
            } catch (Throwable unused) {
            }
        }
        int h = h(this.q ? k6.qb : k6.ta);
        Drawable drawable = drawableArr[c2];
        if (drawable != null) {
            int[] iArr2 = this.B;
            if (iArr2[c2] != h || z11) {
                drawable.setColorFilter(new PorterDuffColorFilter(h, PorterDuff.Mode.MULTIPLY));
                iArr2[c2] = h;
            }
        }
        return drawableArr[c2];
    }

    public final boolean m() {
        return this.a != null && k6.km;
    }

    public final boolean n() {
        return k6.i1(this.p) && this.l != 2 && this.w == null;
    }

    public final Path o() {
        int b10;
        int i3;
        boolean z10;
        boolean z11;
        Path path;
        m.b3 b3Var = this.P;
        Rect bounds = getBounds();
        int b11 = b(2.0f);
        int i10 = this.Q;
        int i11 = this.l;
        if (i10 != 0) {
            i3 = i10;
        } else {
            if (this.R > 0.0f) {
                i10 = org.telegram.messenger.g0.W1(this.R, b(az.Y0), Math.min(bounds.width(), bounds.height()) / 2);
                b10 = org.telegram.messenger.g0.W1(this.R, b(Math.min(6, az.Y0)), Math.min(bounds.width(), bounds.height()) / 2);
            } else if (i11 == 2) {
                i10 = b(6.0f);
                b10 = b(6.0f);
            } else {
                i10 = b(az.Y0);
                b10 = b(Math.min(6, az.Y0));
            }
            i3 = b10;
        }
        int b12 = b(6.0f);
        int max = Math.max(bounds.top, 0);
        boolean z12 = true;
        if (b3Var == null || bounds.height() >= this.b) {
            z10 = i11 != 1 ? (this.r + bounds.bottom) - i10 < this.b : (this.r + bounds.bottom) - (b12 * 2) < this.b;
            z11 = (i10 * 2) + this.r >= 0;
        } else {
            z10 = true;
            z11 = true;
        }
        if (b3Var != null) {
            path = (Path) b3Var.c;
            z12 = b3Var.b(bounds, z10, z11);
        } else {
            path = this.n;
        }
        if (!z12 && this.Q == 0) {
            return path;
        }
        boolean z13 = z10;
        Path path2 = path;
        f(path2, bounds, b11, i10, b12, i3, max, z13, z11, true);
        return path2;
    }

    public void p(int i3, int i10, int i11) {
        q(i3, i10, i11, i11, 0, 0, false, false);
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
    public void q(int i3, int i10, int i11, int i12, int i13, int i14, boolean z10, boolean z11) {
        int i15;
        int i16;
        int h;
        int j10;
        int j11;
        int j12;
        boolean z12;
        boolean z13;
        char c2;
        boolean z14;
        int i17;
        ?? r11;
        boolean z15;
        t4 t4Var = this.J;
        if (t4Var != null) {
            i15 = i11;
            i16 = i13;
            t4Var.q(i3, i10, i15, i12, i16, i14, z10, z11);
        } else {
            i15 = i11;
            i16 = i13;
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
                    h = h(z17 ? k6.pb : k6.ob);
                    j10 = j(k6.rb);
                    j11 = j(k6.sb);
                    j12 = j(k6.tb);
                    z12 = j(k6.Oc) != 0;
                    if (j10 != 0) {
                        h = h(k6.ob);
                    }
                    boolean z18 = this.v;
                    int i18 = this.l;
                    char c10 = !z18 ? (char) 2 : i18 == 2 ? (char) 1 : (char) 0;
                    z13 = this.L;
                    la0[] la0VarArr = T;
                    if (z13 && j11 != 0 && z12) {
                        c2 = 3;
                        la0 la0Var = la0VarArr[c10];
                        if (la0Var != null) {
                            int[] iArr = la0Var.a;
                            z14 = true;
                            this.e = iArr[0];
                            this.f = iArr[1];
                            this.g = iArr[2];
                            this.h = iArr[3];
                            Paint paint = this.c;
                            if (!z13 && j11 != 0 && z12) {
                                if (i15 != this.b || this.O == null || this.e != h || this.f != j10 || this.g != j11 || this.h != j12 || this.i != z12) {
                                    if (this.N == null) {
                                        Bitmap createBitmap = Bitmap.createBitmap(60, 80, Bitmap.Config.ARGB_8888);
                                        this.N = createBitmap;
                                        createBitmap.setHasAlpha(false);
                                        Bitmap bitmap = this.N;
                                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                                        this.O = new BitmapShader(bitmap, tileMode, tileMode);
                                    }
                                    if (la0VarArr[c10] == null) {
                                        la0 la0Var2 = new la0();
                                        la0VarArr[c10] = la0Var2;
                                        if (i18 != 2) {
                                            boolean z19 = z14;
                                            la0Var2.t = z19;
                                            z15 = z19;
                                        } else {
                                            z15 = z14;
                                        }
                                        la0Var2.v(b(1.0f));
                                        r11 = z15;
                                    } else {
                                        r11 = z14;
                                    }
                                    la0 la0Var3 = la0VarArr[c10];
                                    Bitmap bitmap2 = this.N;
                                    int[] iArr2 = la0Var3.a;
                                    iArr2[0] = h;
                                    iArr2[r11] = j10;
                                    iArr2[2] = j11;
                                    iArr2[c2] = j12;
                                    Utilities.generateGradient(bitmap2, la0Var3.i, la0Var3.e.getInterpolation(la0Var3.h), iArr2);
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
                            } else if (j10 == 0 && (this.a == null || i15 != this.b || this.e != h || this.f != j10 || this.g != j11 || this.h != j12 || this.i != z12)) {
                                if (j11 != 0 && z12) {
                                    if (la0VarArr[c10] == null) {
                                        la0 la0Var4 = new la0();
                                        la0VarArr[c10] = la0Var4;
                                        if (i18 != 2) {
                                            la0Var4.t = true;
                                        }
                                        la0Var4.v(b(1.0f));
                                    }
                                    la0VarArr[c10].n(h, j10, j11, j12);
                                    this.a = la0VarArr[c10].v;
                                } else if (j11 == 0) {
                                    this.a = new LinearGradient(0.0f, i16, 0.0f, i15, new int[]{j10, h}, (float[]) null, Shader.TileMode.CLAMP);
                                } else if (j12 != 0) {
                                    this.a = new LinearGradient(0.0f, i16, 0.0f, i15, new int[]{j12, j11, j10, h}, (float[]) null, Shader.TileMode.CLAMP);
                                } else {
                                    this.a = new LinearGradient(0.0f, i16, 0.0f, i15, new int[]{j11, j10, h}, (float[]) null, Shader.TileMode.CLAMP);
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
                                i17 = 0;
                                la0VarArr[c10].setBounds(0, i16, i10, i15 - i12);
                            } else {
                                i17 = 0;
                            }
                            this.b = i15;
                            if (this.a instanceof BitmapShader) {
                                i17 = i12;
                            }
                            this.r = i3 - i17;
                            this.s = z10;
                            this.t = z11;
                        }
                    } else {
                        c2 = 3;
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
                    this.b = i15;
                    if (this.a instanceof BitmapShader) {
                    }
                    this.r = i3 - i17;
                    this.s = z10;
                    this.t = z11;
                }
                h = h(z17 ? k6.Rc : k6.ra);
            }
        }
        j10 = 0;
        j11 = 0;
        j12 = 0;
        z12 = false;
        if (j10 != 0) {
        }
        boolean z182 = this.v;
        int i182 = this.l;
        if (!z182) {
        }
        z13 = this.L;
        la0[] la0VarArr2 = T;
        if (z13) {
        }
        c2 = 3;
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
        this.b = i15;
        if (this.a instanceof BitmapShader) {
        }
        this.r = i3 - i17;
        this.s = z10;
        this.t = z11;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        int i10 = this.H;
        Paint paint = this.c;
        if (i10 != i3 || paint.getAlpha() != i3) {
            this.H = i3;
            paint.setAlpha(i3);
            if (this.q) {
                this.d.setAlpha((int) ((i3 / 255.0f) * Color.alpha(h(k6.Pc))));
            }
        }
        if (this.a == null) {
            Drawable g7 = g();
            if (g7.getAlpha() != i3) {
                g7.setAlpha(i3);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i3, int i10, int i11, int i12) {
        super.setBounds(i3, i10, i11, i12);
        t4 t4Var = this.J;
        if (t4Var != null) {
            t4Var.setBounds(i3, i10, i11, i12);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(int i3, PorterDuff.Mode mode) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
