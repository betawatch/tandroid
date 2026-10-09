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
import org.telegram.ui.Components.cd0;
import v7.r7;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public class f5 extends Drawable {
    public static final cd0[] S = new cd0[3];
    public NinePatchDrawable F;
    public int G;
    public boolean I;
    public f5 J;
    public float K;
    public boolean L;
    public boolean M;
    public Bitmap N;
    public BitmapShader O;
    public m.c3 P;
    public int Q;
    public float R;
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
    public int H = 255;

    public f5(int i10, boolean z10, boolean z11, e6 e6Var) {
        this.p = e6Var;
        this.q = z10;
        this.l = i10;
        this.m = z11;
    }

    public final void a() {
        Bitmap bitmap;
        if (this.a instanceof BitmapShader) {
            boolean z10 = this.L;
            Matrix matrix = this.k;
            cd0[] cd0VarArr = S;
            int i10 = this.l;
            char c10 = 2;
            if (z10 && (bitmap = this.N) != null) {
                char c11 = i10 == 2 ? (char) 1 : (char) 0;
                float min = 1.0f / Math.min(bitmap.getWidth() / cd0VarArr[c11].getBounds().width(), this.N.getHeight() / cd0VarArr[c11].getBounds().height());
                matrix.postScale(min, min);
            } else {
                if (!this.v) {
                    c10 = i10 == 2 ? (char) 1 : (char) 0;
                }
                Bitmap bitmap2 = cd0VarArr[c10].k;
                float min2 = 1.0f / Math.min(bitmap2.getWidth() / cd0VarArr[c10].getBounds().width(), bitmap2.getHeight() / cd0VarArr[c10].getBounds().height());
                matrix.postScale(min2, min2);
            }
        }
    }

    public final int b(float f7) {
        return this.l == 2 ? (int) Math.ceil(f7 * 3.0f) : AndroidUtilities.dp(f7);
    }

    public final void c(Canvas canvas, Paint paint) {
        int b10;
        Path path;
        boolean z10;
        f5 f5Var;
        Path path2;
        Drawable f7;
        Rect bounds = getBounds();
        Paint paint2 = this.c;
        if (paint == null && paint2.getStyle() == Paint.Style.FILL && this.a == null && this.Q == 0 && this.R <= 0.0f && (f7 = f()) != null) {
            f7.setBounds(bounds);
            f7.draw(canvas);
            return;
        }
        int b11 = b(2.0f);
        int i10 = this.Q;
        if (i10 != 0) {
            b10 = i10;
        } else if (this.R > 0.0f) {
            i10 = AndroidUtilities.lerp(b(SharedConfig.bubbleRadius), Math.min(bounds.width(), bounds.height()) / 2, this.R);
            b10 = AndroidUtilities.lerp(b(Math.min(6, SharedConfig.bubbleRadius)), Math.min(bounds.width(), bounds.height()) / 2, this.R);
        } else if (this.l == 2) {
            i10 = b(6.0f);
            b10 = b(6.0f);
        } else {
            i10 = b(SharedConfig.bubbleRadius);
            b10 = b(Math.min(6, SharedConfig.bubbleRadius));
        }
        int b12 = b(6.0f);
        Paint paint3 = paint == null ? paint2 : paint;
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
        boolean z11 = true;
        if (c3Var != null) {
            path = (Path) c3Var.c;
            z10 = c3Var.a(bounds, true, true);
        } else {
            path = this.n;
            z10 = true;
        }
        if (z10 || this.Q != 0) {
            if (paint == null) {
                z11 = false;
            }
            f5Var = this;
            path2 = path;
            f5Var.e(path2, bounds, b11, i10, b12, b10, max, true, true, z11);
        } else {
            f5Var = this;
            path2 = path;
        }
        canvas.drawPath(path2, paint3);
        if (f5Var.a != null && f5Var.m && paint == null) {
            int k10 = i0.a.k(g(i6.bc), (int) ((Color.alpha(r15) * f5Var.H) / 255.0f));
            Paint paint4 = f5Var.d;
            paint4.setColor(k10);
            canvas.drawPath(path2, paint4);
        }
    }

    public final void d(Canvas canvas, m.c3 c3Var, Paint paint) {
        this.P = c3Var;
        f5 f5Var = this.J;
        if (f5Var != null) {
            f5Var.P = c3Var;
        }
        c(canvas, paint);
        this.P = null;
        f5 f5Var2 = this.J;
        if (f5Var2 != null) {
            f5Var2.P = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        f5 f5Var = this.J;
        if (f5Var == null) {
            c(canvas, null);
            return;
        }
        f5Var.draw(canvas);
        setAlpha((int) (this.K * 255.0f));
        c(canvas, null);
        setAlpha(255);
    }

    public final void e(Path path, Rect rect, int i10, int i11, int i12, int i13, int i14, boolean z10, boolean z11, boolean z12) {
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

    public final Drawable f() {
        int g10;
        int i10;
        Drawable[][] drawableArr;
        int[][] iArr;
        int i11;
        int i12;
        Rect rect = this.o;
        int i13 = this.Q;
        if (i13 == 0) {
            i13 = this.R > 0.0f ? 0 : b(SharedConfig.bubbleRadius);
        }
        boolean z10 = this.s;
        char c10 = (z10 && this.t) ? (char) 3 : z10 ? (char) 2 : this.t ? (char) 1 : (char) 0;
        boolean z11 = this.m;
        char c11 = (z11 && this.u) ? (char) 3 : z11 ? (char) 1 : this.u ? (char) 2 : (char) 0;
        Integer num = this.w;
        boolean z12 = this.q;
        if (num != null) {
            g10 = num.intValue();
        } else if (z11) {
            g10 = g(z12 ? i6.Ba : i6.dc);
        } else {
            g10 = g(z12 ? i6.Aa : i6.ra);
        }
        boolean z13 = this.x && this.a == null && !z11 && !this.L;
        int g11 = g(z12 ? i6.Ca : i6.ta);
        boolean z14 = this.M;
        Drawable[][] drawableArr2 = this.D;
        int[][] iArr2 = this.E;
        int[] iArr3 = this.B;
        int[][] iArr4 = this.C;
        if (z14 != z13 || iArr4[c11][c10] != i13 || ((z13 && iArr3[c10] != g11) || iArr2[c11][c10] != g10)) {
            iArr4[c11][c10] = i13;
            try {
                Bitmap createBitmap = Bitmap.createBitmap(b(50.0f), b(40.0f), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                rect.set(getBounds());
                if (z13) {
                    iArr3[c10] = g11;
                    Paint paint = new Paint(1);
                    i10 = 1;
                    paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, b(40.0f), new int[]{358573417, 694117737}, (float[]) null, Shader.TileMode.CLAMP));
                    paint.setColorFilter(new PorterDuffColorFilter(g11, PorterDuff.Mode.MULTIPLY));
                    paint.setShadowLayer(2.0f, 0.0f, 1.0f, -1);
                    if (AndroidUtilities.density > 1.0f) {
                        setBounds(-1, -1, createBitmap.getWidth() + 1, createBitmap.getHeight() + 1);
                        i12 = 0;
                    } else {
                        i12 = 0;
                        setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                    }
                    c(canvas, paint);
                    if (AndroidUtilities.density > 1.0f) {
                        paint.setColor(i12);
                        paint.setShadowLayer(0.0f, 0.0f, 0.0f, i12);
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
                i11 = g10;
                try {
                    drawableArr2[c11][c10] = new NinePatchDrawable(createBitmap, r7.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, i11).array(), new Rect(), null);
                    setBounds(rect);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
            }
            this.M = z13;
            iArr[c11][c10] = i11;
            return drawableArr[c11][c10];
        }
        i11 = g10;
        drawableArr = drawableArr2;
        iArr = iArr2;
        this.M = z13;
        iArr[c11][c10] = i11;
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

    public int g(int i10) {
        if (this.l == 2) {
            return i6.x0(null, i10, false);
        }
        e6 e6Var = this.p;
        return e6Var != null ? e6Var.x0(i10) : i6.x0(null, i10, false);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public int h(int i10) {
        if (this.l == 2) {
            return i6.x0(null, i10, false);
        }
        e6 e6Var = this.p;
        return e6Var != null ? e6Var.a1(i10) : i6.ul.get(i10);
    }

    public final cd0 i() {
        boolean z10 = this.v;
        cd0[] cd0VarArr = S;
        if (z10) {
            return cd0VarArr[2];
        }
        return cd0VarArr[this.l == 2 ? (char) 1 : (char) 0];
    }

    public final Drawable j() {
        int i10;
        if (this.L || (this.a == null && !this.m && this.J == null)) {
            return null;
        }
        int b10 = b(SharedConfig.bubbleRadius);
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
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                bitmapArr[c10] = createBitmap;
                drawableArr[c10] = new NinePatchDrawable(createBitmap, r7.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, i10).array(), new Rect(), null);
                z11 = true;
            } catch (Throwable unused) {
            }
        }
        int g10 = g(this.q ? i6.Ca : i6.ta);
        Drawable drawable = drawableArr[c10];
        if (drawable != null) {
            int[] iArr2 = this.B;
            if (iArr2[c10] != g10 || z11) {
                drawable.setColorFilter(new PorterDuffColorFilter(g10, PorterDuff.Mode.MULTIPLY));
                iArr2[c10] = g10;
            }
        }
        return drawableArr[c10];
    }

    public final Drawable[] k() {
        return this.A;
    }

    public final boolean l() {
        return this.a != null && i6.wl;
    }

    public final Path m() {
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
                i11 = AndroidUtilities.lerp(b(SharedConfig.bubbleRadius), Math.min(bounds.width(), bounds.height()) / 2, this.R);
                b10 = AndroidUtilities.lerp(b(Math.min(6, SharedConfig.bubbleRadius)), Math.min(bounds.width(), bounds.height()) / 2, this.R);
            } else if (i12 == 2) {
                i11 = b(6.0f);
                b10 = b(6.0f);
            } else {
                i11 = b(SharedConfig.bubbleRadius);
                b10 = b(Math.min(6, SharedConfig.bubbleRadius));
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
            z12 = c3Var.a(bounds, z10, z11);
        } else {
            path = this.n;
        }
        if (!z12 && this.Q == 0) {
            return path;
        }
        boolean z13 = z10;
        Path path2 = path;
        e(path2, bounds, b11, i11, b12, i10, max, z13, z11, true);
        return path2;
    }

    public void n(int i10, int i11, int i12) {
        o(i10, i11, i12, i12, 0, 0, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0069  */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void o(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, boolean z11) {
        int i16;
        int i17;
        int g10;
        int h;
        int h10;
        int h11;
        boolean z12;
        boolean z13;
        char c10;
        boolean z14;
        int i18;
        ?? r11;
        boolean z15;
        f5 f5Var = this.J;
        if (f5Var != null) {
            i16 = i12;
            i17 = i14;
            f5Var.o(i10, i11, i16, i13, i17, i15, z10, z11);
        } else {
            i16 = i12;
            i17 = i14;
        }
        Integer num = this.w;
        if (num != null) {
            g10 = num.intValue();
        } else {
            boolean z16 = this.q;
            boolean z17 = this.m;
            if (z16) {
                g10 = g(z17 ? i6.Ba : i6.Aa);
                h = h(i6.Da);
                h10 = h(i6.Ea);
                h11 = h(i6.Fa);
                z12 = h(i6.ac) != 0;
                if (h != 0) {
                    g10 = g(i6.Aa);
                }
                boolean z18 = this.v;
                int i19 = this.l;
                char c11 = !z18 ? (char) 2 : i19 == 2 ? (char) 1 : (char) 0;
                z13 = this.L;
                cd0[] cd0VarArr = S;
                if (z13 && h10 != 0 && z12) {
                    c10 = 3;
                    cd0 cd0Var = cd0VarArr[c11];
                    if (cd0Var != null) {
                        int[] iArr = cd0Var.a;
                        z14 = true;
                        this.e = iArr[0];
                        this.f = iArr[1];
                        this.g = iArr[2];
                        this.h = iArr[3];
                        Paint paint = this.c;
                        if (!z13 && h10 != 0 && z12) {
                            if (i16 != this.b || this.O == null || this.e != g10 || this.f != h || this.g != h10 || this.h != h11 || this.i != z12) {
                                if (this.N == null) {
                                    Bitmap createBitmap = Bitmap.createBitmap(60, 80, Bitmap.Config.ARGB_8888);
                                    this.N = createBitmap;
                                    createBitmap.setHasAlpha(false);
                                    Bitmap bitmap = this.N;
                                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                                    this.O = new BitmapShader(bitmap, tileMode, tileMode);
                                }
                                if (cd0VarArr[c11] == null) {
                                    cd0 cd0Var2 = new cd0();
                                    cd0VarArr[c11] = cd0Var2;
                                    if (i19 != 2) {
                                        boolean z19 = z14;
                                        cd0Var2.t = z19;
                                        z15 = z19;
                                    } else {
                                        z15 = z14;
                                    }
                                    cd0Var2.w(b(1.0f));
                                    r11 = z15;
                                } else {
                                    r11 = z14;
                                }
                                cd0 cd0Var3 = cd0VarArr[c11];
                                Bitmap bitmap2 = this.N;
                                int[] iArr2 = cd0Var3.a;
                                iArr2[0] = g10;
                                iArr2[r11] = h;
                                iArr2[2] = h10;
                                iArr2[c10] = h11;
                                Utilities.generateGradient(bitmap2, cd0Var3.i, cd0Var3.e.getInterpolation(cd0Var3.h), iArr2);
                                this.O.setLocalMatrix(this.k);
                            }
                            BitmapShader bitmapShader = this.O;
                            this.a = bitmapShader;
                            paint.setShader(bitmapShader);
                            paint.setColor(-1);
                            this.e = g10;
                            this.i = z12;
                            this.f = h;
                            this.g = h10;
                            this.h = h11;
                        } else if (h == 0 && (this.a == null || i16 != this.b || this.e != g10 || this.f != h || this.g != h10 || this.h != h11 || this.i != z12)) {
                            if (h10 != 0 && z12) {
                                if (cd0VarArr[c11] == null) {
                                    cd0 cd0Var4 = new cd0();
                                    cd0VarArr[c11] = cd0Var4;
                                    if (i19 != 2) {
                                        cd0Var4.t = true;
                                    }
                                    cd0Var4.w(b(1.0f));
                                }
                                cd0VarArr[c11].n(g10, h, h10, h11);
                                this.a = cd0VarArr[c11].v;
                            } else if (h10 == 0) {
                                this.a = new LinearGradient(0.0f, i17, 0.0f, i16, new int[]{h, g10}, (float[]) null, Shader.TileMode.CLAMP);
                            } else if (h11 != 0) {
                                this.a = new LinearGradient(0.0f, i17, 0.0f, i16, new int[]{h11, h10, h, g10}, (float[]) null, Shader.TileMode.CLAMP);
                            } else {
                                this.a = new LinearGradient(0.0f, i17, 0.0f, i16, new int[]{h10, h, g10}, (float[]) null, Shader.TileMode.CLAMP);
                            }
                            paint.setShader(this.a);
                            this.e = g10;
                            this.i = z12;
                            this.f = h;
                            this.g = h10;
                            this.h = h11;
                            paint.setColor(-1);
                        } else if (h == 0) {
                            if (this.a != null) {
                                this.a = null;
                                paint.setShader(null);
                            }
                            paint.setColor(g10);
                        }
                        if (this.a instanceof BitmapShader) {
                            i18 = 0;
                            cd0VarArr[c11].setBounds(0, i17, i11, i16 - i13);
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
                if (h == 0) {
                }
                if (h == 0) {
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
            g10 = g(z17 ? i6.dc : i6.ra);
        }
        h = 0;
        h10 = 0;
        h11 = 0;
        z12 = false;
        if (h != 0) {
        }
        boolean z182 = this.v;
        int i192 = this.l;
        if (!z182) {
        }
        z13 = this.L;
        cd0[] cd0VarArr2 = S;
        if (z13) {
        }
        c10 = 3;
        z14 = true;
        Paint paint22 = this.c;
        if (!z13) {
        }
        if (h == 0) {
        }
        if (h == 0) {
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
                this.d.setAlpha((int) ((i10 / 255.0f) * Color.alpha(g(i6.bc))));
            }
        }
        if (this.a == null) {
            Drawable f7 = f();
            if (f7.getAlpha() != i10) {
                f7.setAlpha(i10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        f5 f5Var = this.J;
        if (f5Var != null) {
            f5Var.setBounds(i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(int i10, PorterDuff.Mode mode) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
