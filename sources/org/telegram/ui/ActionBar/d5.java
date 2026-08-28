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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.jb0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class d5 extends Drawable {
    public static final jb0[] Q = new jb0[3];
    public NinePatchDrawable D;
    public int E;
    public boolean G;
    public d5 H;
    public float I;
    public boolean J;
    public boolean K;
    public Bitmap L;
    public BitmapShader M;
    public m.f3 N;
    public int O;
    public float P;
    public Shader a;
    public int b;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public final int l;
    public final boolean m;
    public b6 p;
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
    public final int[] w = {-1, -1, -1, -1};
    public final Bitmap[] x = new Bitmap[4];
    public final Drawable[] y = new Drawable[4];
    public final int[] z = {-1, -1, -1, -1};
    public final int[][] A = {new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}};
    public final Drawable[][] B = (Drawable[][]) Array.newInstance((Class<?>) Drawable.class, 4, 4);
    public final int[][] C = {new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}};
    public final Path n = new Path();
    public final Paint d = new Paint(1);
    public int F = 255;

    public d5(int i9, boolean z10, boolean z11, b6 b6Var) {
        this.p = b6Var;
        this.q = z10;
        this.l = i9;
        this.m = z11;
    }

    public final void a() {
        Bitmap bitmap;
        if (this.a instanceof BitmapShader) {
            boolean z10 = this.J;
            Matrix matrix = this.k;
            jb0[] jb0VarArr = Q;
            int i9 = this.l;
            char c10 = 2;
            if (z10 && (bitmap = this.L) != null) {
                char c11 = i9 == 2 ? (char) 1 : (char) 0;
                float min = 1.0f / Math.min(bitmap.getWidth() / jb0VarArr[c11].getBounds().width(), this.L.getHeight() / jb0VarArr[c11].getBounds().height());
                matrix.postScale(min, min);
            } else {
                if (!this.v) {
                    c10 = i9 == 2 ? (char) 1 : (char) 0;
                }
                Bitmap bitmap2 = jb0VarArr[c10].k;
                float min2 = 1.0f / Math.min(bitmap2.getWidth() / jb0VarArr[c10].getBounds().width(), bitmap2.getHeight() / jb0VarArr[c10].getBounds().height());
                matrix.postScale(min2, min2);
            }
        }
    }

    public final int b(float f10) {
        return this.l == 2 ? (int) Math.ceil(f10 * 3.0f) : AndroidUtilities.dp(f10);
    }

    public final void c(Canvas canvas, Paint paint) {
        int b10;
        int i9;
        Path path;
        boolean z10;
        d5 d5Var;
        Path path2;
        Drawable f10;
        Rect bounds = getBounds();
        if (paint == null && this.a == null && this.O == 0 && this.P <= 0.0f && (f10 = f()) != null) {
            f10.setBounds(bounds);
            f10.draw(canvas);
            return;
        }
        int b11 = b(2.0f);
        int i10 = this.O;
        if (i10 != 0) {
            i9 = i10;
        } else {
            if (this.P > 0.0f) {
                i10 = AndroidUtilities.lerp(b(SharedConfig.bubbleRadius), Math.min(bounds.width(), bounds.height()) / 2, this.P);
                b10 = AndroidUtilities.lerp(b(Math.min(6, SharedConfig.bubbleRadius)), Math.min(bounds.width(), bounds.height()) / 2, this.P);
            } else if (this.l == 2) {
                i10 = b(6.0f);
                b10 = b(6.0f);
            } else {
                i10 = b(SharedConfig.bubbleRadius);
                b10 = b(Math.min(6, SharedConfig.bubbleRadius));
            }
            i9 = b10;
        }
        int b12 = b(6.0f);
        Paint paint2 = paint == null ? this.c : paint;
        if (paint == null && this.a != null) {
            Matrix matrix = this.k;
            matrix.reset();
            a();
            matrix.postTranslate(0.0f, -this.r);
            this.a.setLocalMatrix(matrix);
        }
        int max = Math.max(bounds.top, 0);
        if (this.N != null) {
            bounds.height();
            int i11 = this.b;
        }
        m.f3 f3Var = this.N;
        if (f3Var != null) {
            path = (Path) f3Var.c;
            z10 = f3Var.a(bounds, true, true);
        } else {
            path = this.n;
            z10 = true;
        }
        if (z10 || this.O != 0) {
            d5Var = this;
            int i12 = i10;
            path2 = path;
            d5Var.e(path2, bounds, b11, i12, b12, i9, max, true, true, paint != null);
        } else {
            d5Var = this;
            path2 = path;
        }
        canvas.drawPath(path2, paint2);
        if (d5Var.a != null && d5Var.m && paint == null) {
            int k10 = i0.a.k(g(f6.bc), (int) ((Color.alpha(r15) * d5Var.F) / 255.0f));
            Paint paint3 = d5Var.d;
            paint3.setColor(k10);
            canvas.drawPath(path2, paint3);
        }
    }

    public final void d(Canvas canvas, m.f3 f3Var, Paint paint) {
        this.N = f3Var;
        d5 d5Var = this.H;
        if (d5Var != null) {
            d5Var.N = f3Var;
        }
        c(canvas, paint);
        this.N = null;
        d5 d5Var2 = this.H;
        if (d5Var2 != null) {
            d5Var2.N = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        d5 d5Var = this.H;
        if (d5Var == null) {
            c(canvas, null);
            return;
        }
        d5Var.draw(canvas);
        setAlpha((int) (this.I * 255.0f));
        c(canvas, null);
        setAlpha(255);
    }

    public final void e(Path path, Rect rect, int i9, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12) {
        path.rewind();
        int height = (rect.height() - i9) >> 1;
        int i14 = i10;
        if (i14 > height) {
            i14 = height;
        }
        boolean z13 = this.q;
        int i15 = this.l;
        RectF rectF = this.j;
        if (z13) {
            if (this.G || i15 == 2 || z12 || z10) {
                int i16 = this.u ? i12 : i14;
                if (i15 == 1) {
                    path.moveTo((rect.right - b(8.0f)) - i16, rect.bottom - i9);
                } else {
                    path.moveTo(rect.right - b(2.6f), rect.bottom - i9);
                }
                path.lineTo(rect.left + i9 + i16, rect.bottom - i9);
                int i17 = i16 * 2;
                rectF.set(rect.left + i9, r13 - i17, r10 + i17, rect.bottom - i9);
                path.arcTo(rectF, 90.0f, 90.0f, false);
            } else {
                path.moveTo(rect.right - b(8.0f), (i13 - this.r) + this.b);
                path.lineTo(rect.left + i9, (i13 - this.r) + this.b);
            }
            if (this.G || i15 == 2 || z12 || z11) {
                path.lineTo(rect.left + i9, rect.top + i9 + i14);
                int i18 = i14 * 2;
                rectF.set(rect.left + i9, rect.top + i9, r3 + i18, r10 + i18);
                path.arcTo(rectF, 180.0f, 90.0f, false);
                int i19 = this.s ? i12 : i14;
                if (i15 == 1) {
                    path.lineTo((rect.right - i9) - i19, rect.top + i9);
                    int i20 = rect.right - i9;
                    int i21 = i19 * 2;
                    rectF.set(i20 - i21, rect.top + i9, i20, r11 + i21);
                } else {
                    path.lineTo((rect.right - b(8.0f)) - i19, rect.top + i9);
                    int i22 = i19 * 2;
                    rectF.set((rect.right - b(8.0f)) - i22, rect.top + i9, rect.right - b(8.0f), rect.top + i9 + i22);
                }
                path.arcTo(rectF, 270.0f, 90.0f, false);
            } else {
                path.lineTo(rect.left + i9, (i13 - this.r) - b(2.0f));
                if (i15 == 1) {
                    path.lineTo(rect.right - i9, (i13 - this.r) - b(2.0f));
                } else {
                    path.lineTo(rect.right - b(8.0f), (i13 - this.r) - b(2.0f));
                }
            }
            if (i15 == 1) {
                if (z12 || z10) {
                    if (this.t) {
                        i14 = i12;
                    }
                    path.lineTo(rect.right - i9, (rect.bottom - i9) - i14);
                    int i23 = i14 * 2;
                    rectF.set(r3 - i23, r2 - i23, rect.right - i9, rect.bottom - i9);
                    path.arcTo(rectF, 0.0f, 90.0f, false);
                } else {
                    path.lineTo(rect.right - i9, (i13 - this.r) + this.b);
                }
            } else if (this.G || i15 == 2 || z12 || z10) {
                path.lineTo(rect.right - b(8.0f), ((rect.bottom - i9) - i11) - b(3.0f));
                int i24 = i11 * 2;
                rectF.set(rect.right - b(8.0f), ((rect.bottom - i9) - i24) - b(9.0f), (rect.right - b(7.0f)) + i24, (rect.bottom - i9) - b(1.0f));
                path.arcTo(rectF, 180.0f, -83.0f, false);
            } else {
                path.lineTo(rect.right - b(8.0f), (i13 - this.r) + this.b);
            }
        } else {
            if (this.G || i15 == 2 || z12 || z10) {
                int i25 = this.u ? i12 : i14;
                if (i15 == 1) {
                    path.moveTo(b(8.0f) + rect.left + i25, rect.bottom - i9);
                } else {
                    path.moveTo(b(2.6f) + rect.left, rect.bottom - i9);
                }
                path.lineTo((rect.right - i9) - i25, rect.bottom - i9);
                int i26 = i25 * 2;
                rectF.set(r10 - i26, r13 - i26, rect.right - i9, rect.bottom - i9);
                path.arcTo(rectF, 90.0f, -90.0f, false);
            } else {
                path.moveTo(b(8.0f) + rect.left, (i13 - this.r) + this.b);
                path.lineTo(rect.right - i9, (i13 - this.r) + this.b);
            }
            if (this.G || i15 == 2 || z12 || z11) {
                path.lineTo(rect.right - i9, rect.top + i9 + i14);
                int i27 = rect.right - i9;
                int i28 = i14 * 2;
                rectF.set(i27 - i28, rect.top + i9, i27, r13 + i28);
                path.arcTo(rectF, 0.0f, -90.0f, false);
                int i29 = this.s ? i12 : i14;
                if (i15 == 1) {
                    path.lineTo(rect.left + i9 + i29, rect.top + i9);
                    int i30 = i29 * 2;
                    rectF.set(rect.left + i9, rect.top + i9, r10 + i30, r13 + i30);
                } else {
                    path.lineTo(b(8.0f) + rect.left + i29, rect.top + i9);
                    int i31 = i29 * 2;
                    rectF.set(b(8.0f) + rect.left, rect.top + i9, b(8.0f) + rect.left + i31, rect.top + i9 + i31);
                }
                path.arcTo(rectF, 270.0f, -90.0f, false);
            } else {
                path.lineTo(rect.right - i9, (i13 - this.r) - b(2.0f));
                if (i15 == 1) {
                    path.lineTo(rect.left + i9, (i13 - this.r) - b(2.0f));
                } else {
                    path.lineTo(b(8.0f) + rect.left, (i13 - this.r) - b(2.0f));
                }
            }
            if (i15 == 1) {
                if (z12 || z10) {
                    if (this.t || this.u) {
                        i14 = i12;
                    }
                    path.lineTo(rect.left + i9, (rect.bottom - i9) - i14);
                    int i32 = i14 * 2;
                    rectF.set(rect.left + i9, r2 - i32, r3 + i32, rect.bottom - i9);
                    path.arcTo(rectF, 180.0f, -90.0f, false);
                } else {
                    path.lineTo(rect.left + i9, (i13 - this.r) + this.b);
                }
            } else if (this.G || i15 == 2 || z12 || z10) {
                path.lineTo(b(8.0f) + rect.left, ((rect.bottom - i9) - i11) - b(3.0f));
                int i33 = i11 * 2;
                rectF.set((b(7.0f) + rect.left) - i33, ((rect.bottom - i9) - i33) - b(9.0f), b(8.0f) + rect.left, (rect.bottom - i9) - b(1.0f));
                path.arcTo(rectF, 0.0f, 83.0f, false);
            } else {
                path.lineTo(b(8.0f) + rect.left, (i13 - this.r) + this.b);
            }
        }
        path.close();
    }

    public final Drawable f() {
        int g10;
        Drawable[][] drawableArr;
        int[][] iArr;
        int i9;
        int i10;
        Rect rect = this.o;
        int i11 = this.O;
        if (i11 == 0) {
            i11 = this.P > 0.0f ? 0 : b(SharedConfig.bubbleRadius);
        }
        boolean z10 = this.s;
        char c10 = (z10 && this.t) ? (char) 3 : z10 ? (char) 2 : this.t ? (char) 1 : (char) 0;
        boolean z11 = this.m;
        char c11 = (z11 && this.u) ? (char) 3 : z11 ? (char) 1 : this.u ? (char) 2 : (char) 0;
        boolean z12 = this.q;
        if (z11) {
            g10 = g(z12 ? f6.Ba : f6.dc);
        } else {
            g10 = g(z12 ? f6.Aa : f6.ra);
        }
        boolean z13 = (this.a != null || z11 || this.J) ? false : true;
        int g11 = g(z12 ? f6.Ca : f6.ta);
        boolean z14 = this.K;
        Drawable[][] drawableArr2 = this.B;
        int[][] iArr2 = this.C;
        int[] iArr3 = this.z;
        int[][] iArr4 = this.A;
        if (z14 != z13 || iArr4[c11][c10] != i11 || ((z13 && iArr3[c10] != g11) || iArr2[c11][c10] != g10)) {
            iArr4[c11][c10] = i11;
            try {
                Bitmap createBitmap = Bitmap.createBitmap(b(50.0f), b(40.0f), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                rect.set(getBounds());
                if (z13) {
                    iArr3[c10] = g11;
                    Paint paint = new Paint(1);
                    paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, b(40.0f), new int[]{358573417, 694117737}, (float[]) null, Shader.TileMode.CLAMP));
                    paint.setColorFilter(new PorterDuffColorFilter(g11, PorterDuff.Mode.MULTIPLY));
                    paint.setShadowLayer(2.0f, 0.0f, 1.0f, -1);
                    if (AndroidUtilities.density > 1.0f) {
                        setBounds(-1, -1, createBitmap.getWidth() + 1, createBitmap.getHeight() + 1);
                        i10 = 0;
                    } else {
                        i10 = 0;
                        setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                    }
                    c(canvas, paint);
                    if (AndroidUtilities.density > 1.0f) {
                        paint.setColor(i10);
                        paint.setShadowLayer(0.0f, 0.0f, 0.0f, i10);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        c(canvas, paint);
                    }
                }
                Paint paint2 = new Paint(1);
                paint2.setColor(g10);
                setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                c(canvas, paint2);
                drawableArr = drawableArr2;
                iArr = iArr2;
                i9 = g10;
                try {
                    drawableArr2[c11][c10] = new NinePatchDrawable(createBitmap, g7.z5.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, i9).array(), new Rect(), null);
                    setBounds(rect);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
            }
            this.K = z13;
            iArr[c11][c10] = i9;
            return drawableArr[c11][c10];
        }
        i9 = g10;
        drawableArr = drawableArr2;
        iArr = iArr2;
        this.K = z13;
        iArr[c11][c10] = i9;
        return drawableArr[c11][c10];
    }

    public final void finalize() {
        super.finalize();
        Bitmap[] bitmapArr = this.x;
        for (Bitmap bitmap : bitmapArr) {
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        Arrays.fill(bitmapArr, (Object) null);
        Arrays.fill(this.y, (Object) null);
        Arrays.fill(this.w, -1);
    }

    public int g(int i9) {
        if (this.l == 2) {
            return f6.w0(null, i9, false);
        }
        b6 b6Var = this.p;
        return b6Var != null ? b6Var.N0(i9) : f6.w0(null, i9, false);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public int h(int i9) {
        if (this.l == 2) {
            return f6.w0(null, i9, false);
        }
        b6 b6Var = this.p;
        return b6Var != null ? b6Var.q1(i9) : f6.rl.get(i9);
    }

    public final jb0 i() {
        boolean z10 = this.v;
        jb0[] jb0VarArr = Q;
        if (z10) {
            return jb0VarArr[2];
        }
        return jb0VarArr[this.l == 2 ? (char) 1 : (char) 0];
    }

    public final Drawable j() {
        int i9;
        if (this.J || (this.a == null && !this.m && this.H == null)) {
            return null;
        }
        int b10 = b(SharedConfig.bubbleRadius);
        boolean z10 = this.s;
        boolean z11 = false;
        char c10 = (z10 && this.t) ? (char) 3 : z10 ? (char) 2 : this.t ? (char) 1 : (char) 0;
        int[] iArr = this.w;
        int i10 = iArr[c10];
        Drawable[] drawableArr = this.y;
        if (i10 != b10) {
            iArr[c10] = b10;
            Bitmap[] bitmapArr = this.x;
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
                if (AndroidUtilities.density > 1.0f) {
                    setBounds(-1, -1, createBitmap.getWidth() + 1, createBitmap.getHeight() + 1);
                } else {
                    setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                }
                c(canvas, paint);
                if (AndroidUtilities.density > 1.0f) {
                    paint.setColor(0);
                    paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                    c(canvas, paint);
                    i9 = 0;
                } else {
                    i9 = 1;
                }
                bitmapArr[c10] = createBitmap;
                drawableArr[c10] = new NinePatchDrawable(createBitmap, g7.z5.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, i9).array(), new Rect(), null);
                z11 = true;
            } catch (Throwable unused) {
            }
        }
        int g10 = g(this.q ? f6.Ca : f6.ta);
        Drawable drawable = drawableArr[c10];
        if (drawable != null) {
            int[] iArr2 = this.z;
            if (iArr2[c10] != g10 || z11) {
                drawable.setColorFilter(new PorterDuffColorFilter(g10, PorterDuff.Mode.MULTIPLY));
                iArr2[c10] = g10;
            }
        }
        return drawableArr[c10];
    }

    public final Drawable[] k() {
        return this.y;
    }

    public final boolean l() {
        return this.a != null && f6.tl;
    }

    public final Path m() {
        int b10;
        int i9;
        boolean z10;
        boolean z11;
        Path path;
        m.f3 f3Var = this.N;
        Rect bounds = getBounds();
        int b11 = b(2.0f);
        int i10 = this.O;
        int i11 = this.l;
        if (i10 != 0) {
            i9 = i10;
        } else {
            if (this.P > 0.0f) {
                i10 = AndroidUtilities.lerp(b(SharedConfig.bubbleRadius), Math.min(bounds.width(), bounds.height()) / 2, this.P);
                b10 = AndroidUtilities.lerp(b(Math.min(6, SharedConfig.bubbleRadius)), Math.min(bounds.width(), bounds.height()) / 2, this.P);
            } else if (i11 == 2) {
                i10 = b(6.0f);
                b10 = b(6.0f);
            } else {
                i10 = b(SharedConfig.bubbleRadius);
                b10 = b(Math.min(6, SharedConfig.bubbleRadius));
            }
            i9 = b10;
        }
        int b12 = b(6.0f);
        int max = Math.max(bounds.top, 0);
        boolean z12 = true;
        if (f3Var == null || bounds.height() >= this.b) {
            z10 = i11 != 1 ? (this.r + bounds.bottom) - i10 < this.b : (this.r + bounds.bottom) - (b12 * 2) < this.b;
            z11 = (i10 * 2) + this.r >= 0;
        } else {
            z10 = true;
            z11 = true;
        }
        if (f3Var != null) {
            path = (Path) f3Var.c;
            z12 = f3Var.a(bounds, z10, z11);
        } else {
            path = this.n;
        }
        if (!z12 && this.O == 0) {
            return path;
        }
        boolean z13 = z10;
        Path path2 = path;
        e(path2, bounds, b11, i10, b12, i9, max, z13, z11, true);
        return path2;
    }

    public void n(int i9, int i10, int i11) {
        o(i9, i10, i11, i11, 0, 0, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void o(int i9, int i10, int i11, int i12, int i13, int i14, boolean z10, boolean z11) {
        int i15;
        int i16;
        int g10;
        int i17;
        int i18;
        int i19;
        boolean z12;
        boolean z13;
        char c10;
        int i20;
        char c11;
        d5 d5Var = this.H;
        if (d5Var != null) {
            i15 = i11;
            i16 = i13;
            d5Var.o(i9, i10, i15, i12, i16, i14, z10, z11);
        } else {
            i15 = i11;
            i16 = i13;
        }
        boolean z14 = this.q;
        boolean z15 = this.m;
        if (z14) {
            g10 = g(z15 ? f6.Ba : f6.Aa);
            i17 = h(f6.Da);
            i18 = h(f6.Ea);
            i19 = h(f6.Fa);
            if (h(f6.ac) != 0) {
                z12 = true;
                if (i17 != 0) {
                    g10 = g(f6.Aa);
                }
                boolean z16 = this.v;
                int i21 = this.l;
                char c12 = !z16 ? (char) 2 : i21 == 2 ? (char) 1 : (char) 0;
                z13 = this.J;
                jb0[] jb0VarArr = Q;
                if (z13 && i18 != 0 && z12) {
                    c10 = 3;
                    jb0 jb0Var = jb0VarArr[c12];
                    if (jb0Var != null) {
                        int[] iArr = jb0Var.a;
                        this.e = iArr[0];
                        this.f = iArr[1];
                        this.g = iArr[2];
                        this.h = iArr[3];
                        Paint paint = this.c;
                        if (!z13 && i18 != 0 && z12) {
                            if (i15 != this.b || this.M == null || this.e != g10 || this.f != i17 || this.g != i18 || this.h != i19 || this.i != z12) {
                                if (this.L == null) {
                                    Bitmap createBitmap = Bitmap.createBitmap(60, 80, Bitmap.Config.ARGB_8888);
                                    this.L = createBitmap;
                                    createBitmap.setHasAlpha(false);
                                    Bitmap bitmap = this.L;
                                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                                    this.M = new BitmapShader(bitmap, tileMode, tileMode);
                                }
                                if (jb0VarArr[c12] == null) {
                                    jb0 jb0Var2 = new jb0();
                                    jb0VarArr[c12] = jb0Var2;
                                    if (i21 != 2) {
                                        c11 = 1;
                                        jb0Var2.t = true;
                                    } else {
                                        c11 = 1;
                                    }
                                    jb0Var2.w(b(1.0f));
                                } else {
                                    c11 = 1;
                                }
                                jb0 jb0Var3 = jb0VarArr[c12];
                                Bitmap bitmap2 = this.L;
                                int[] iArr2 = jb0Var3.a;
                                iArr2[0] = g10;
                                iArr2[c11] = i17;
                                iArr2[2] = i18;
                                iArr2[c10] = i19;
                                Utilities.generateGradient(bitmap2, jb0Var3.i, jb0Var3.e.getInterpolation(jb0Var3.h), iArr2);
                                this.M.setLocalMatrix(this.k);
                            }
                            BitmapShader bitmapShader = this.M;
                            this.a = bitmapShader;
                            paint.setShader(bitmapShader);
                            paint.setColor(-1);
                            this.e = g10;
                            this.i = z12;
                            this.f = i17;
                            this.g = i18;
                            this.h = i19;
                        } else if (i17 == 0 && (this.a == null || i15 != this.b || this.e != g10 || this.f != i17 || this.g != i18 || this.h != i19 || this.i != z12)) {
                            if (i18 != 0 && z12) {
                                if (jb0VarArr[c12] == null) {
                                    jb0 jb0Var4 = new jb0();
                                    jb0VarArr[c12] = jb0Var4;
                                    if (i21 != 2) {
                                        jb0Var4.t = true;
                                    }
                                    jb0Var4.w(b(1.0f));
                                }
                                jb0VarArr[c12].n(g10, i17, i18, i19);
                                this.a = jb0VarArr[c12].v;
                            } else if (i18 == 0) {
                                this.a = new LinearGradient(0.0f, i16, 0.0f, i15, new int[]{i17, g10}, (float[]) null, Shader.TileMode.CLAMP);
                            } else if (i19 != 0) {
                                this.a = new LinearGradient(0.0f, i16, 0.0f, i15, new int[]{i19, i18, i17, g10}, (float[]) null, Shader.TileMode.CLAMP);
                            } else {
                                this.a = new LinearGradient(0.0f, i16, 0.0f, i15, new int[]{i18, i17, g10}, (float[]) null, Shader.TileMode.CLAMP);
                            }
                            paint.setShader(this.a);
                            this.e = g10;
                            this.i = z12;
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
                            jb0VarArr[c12].setBounds(0, i16, i10, i15 - i12);
                        } else {
                            i20 = 0;
                        }
                        this.b = i15;
                        if (this.a instanceof BitmapShader) {
                            i20 = i12;
                        }
                        this.r = i9 - i20;
                        this.s = z10;
                        this.t = z11;
                    }
                } else {
                    c10 = 3;
                }
                Paint paint2 = this.c;
                if (!z13) {
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
                this.r = i9 - i20;
                this.s = z10;
                this.t = z11;
            }
        } else {
            g10 = g(z15 ? f6.dc : f6.ra);
            i17 = 0;
            i18 = 0;
            i19 = 0;
        }
        z12 = false;
        if (i17 != 0) {
        }
        boolean z162 = this.v;
        int i212 = this.l;
        if (!z162) {
        }
        z13 = this.J;
        jb0[] jb0VarArr2 = Q;
        if (z13) {
        }
        c10 = 3;
        Paint paint22 = this.c;
        if (!z13) {
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
        this.r = i9 - i20;
        this.s = z10;
        this.t = z11;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        int i10 = this.F;
        Paint paint = this.c;
        if (i10 != i9 || paint.getAlpha() != i9) {
            this.F = i9;
            paint.setAlpha(i9);
            if (this.q) {
                this.d.setAlpha((int) ((i9 / 255.0f) * Color.alpha(g(f6.bc))));
            }
        }
        if (this.a == null) {
            Drawable f10 = f();
            if (f10.getAlpha() != i9) {
                f10.setAlpha(i9);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i9, int i10, int i11, int i12) {
        super.setBounds(i9, i10, i11, i12);
        d5 d5Var = this.H;
        if (d5Var != null) {
            d5Var.setBounds(i9, i10, i11, i12);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(int i9, PorterDuff.Mode mode) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
