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
import k7.t7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ec0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class g5 extends Drawable {
    public static final ec0[] Q = new ec0[3];
    public NinePatchDrawable D;
    public int E;
    public boolean G;
    public g5 H;
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
    public f6 p;
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

    public g5(int i10, boolean z4, boolean z10, f6 f6Var) {
        this.p = f6Var;
        this.q = z4;
        this.l = i10;
        this.m = z10;
    }

    public final void a() {
        Bitmap bitmap;
        if (this.a instanceof BitmapShader) {
            boolean z4 = this.J;
            Matrix matrix = this.k;
            ec0[] ec0VarArr = Q;
            int i10 = this.l;
            char c3 = 2;
            if (z4 && (bitmap = this.L) != null) {
                char c10 = i10 == 2 ? (char) 1 : (char) 0;
                float min = 1.0f / Math.min(bitmap.getWidth() / ec0VarArr[c10].getBounds().width(), this.L.getHeight() / ec0VarArr[c10].getBounds().height());
                matrix.postScale(min, min);
            } else {
                if (!this.v) {
                    c3 = i10 == 2 ? (char) 1 : (char) 0;
                }
                Bitmap bitmap2 = ec0VarArr[c3].k;
                float min2 = 1.0f / Math.min(bitmap2.getWidth() / ec0VarArr[c3].getBounds().width(), bitmap2.getHeight() / ec0VarArr[c3].getBounds().height());
                matrix.postScale(min2, min2);
            }
        }
    }

    public final int b(float f10) {
        return this.l == 2 ? (int) Math.ceil(f10 * 3.0f) : AndroidUtilities.dp(f10);
    }

    public final void c(Canvas canvas, Paint paint) {
        int b10;
        int i10;
        Path path;
        boolean z4;
        g5 g5Var;
        Path path2;
        Drawable f10;
        Rect bounds = getBounds();
        if (paint == null && this.a == null && this.O == 0 && this.P <= 0.0f && (f10 = f()) != null) {
            f10.setBounds(bounds);
            f10.draw(canvas);
            return;
        }
        int b11 = b(2.0f);
        int i11 = this.O;
        if (i11 != 0) {
            i10 = i11;
        } else {
            if (this.P > 0.0f) {
                i11 = AndroidUtilities.lerp(b(SharedConfig.bubbleRadius), Math.min(bounds.width(), bounds.height()) / 2, this.P);
                b10 = AndroidUtilities.lerp(b(Math.min(6, SharedConfig.bubbleRadius)), Math.min(bounds.width(), bounds.height()) / 2, this.P);
            } else if (this.l == 2) {
                i11 = b(6.0f);
                b10 = b(6.0f);
            } else {
                i11 = b(SharedConfig.bubbleRadius);
                b10 = b(Math.min(6, SharedConfig.bubbleRadius));
            }
            i10 = b10;
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
            int i12 = this.b;
        }
        m.f3 f3Var = this.N;
        if (f3Var != null) {
            path = (Path) f3Var.c;
            z4 = f3Var.a(bounds, true, true);
        } else {
            path = this.n;
            z4 = true;
        }
        if (z4 || this.O != 0) {
            g5Var = this;
            int i13 = i11;
            path2 = path;
            g5Var.e(path2, bounds, b11, i13, b12, i10, max, true, true, paint != null);
        } else {
            g5Var = this;
            path2 = path;
        }
        canvas.drawPath(path2, paint2);
        if (g5Var.a != null && g5Var.m && paint == null) {
            int k10 = i0.a.k(g(j6.bc), (int) ((Color.alpha(r15) * g5Var.F) / 255.0f));
            Paint paint3 = g5Var.d;
            paint3.setColor(k10);
            canvas.drawPath(path2, paint3);
        }
    }

    public final void d(Canvas canvas, m.f3 f3Var, Paint paint) {
        this.N = f3Var;
        g5 g5Var = this.H;
        if (g5Var != null) {
            g5Var.N = f3Var;
        }
        c(canvas, paint);
        this.N = null;
        g5 g5Var2 = this.H;
        if (g5Var2 != null) {
            g5Var2.N = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        g5 g5Var = this.H;
        if (g5Var == null) {
            c(canvas, null);
            return;
        }
        g5Var.draw(canvas);
        setAlpha((int) (this.I * 255.0f));
        c(canvas, null);
        setAlpha(255);
    }

    public final void e(Path path, Rect rect, int i10, int i11, int i12, int i13, int i14, boolean z4, boolean z10, boolean z11) {
        path.rewind();
        int height = (rect.height() - i10) >> 1;
        int i15 = i11;
        if (i15 > height) {
            i15 = height;
        }
        boolean z12 = this.q;
        int i16 = this.l;
        RectF rectF = this.j;
        if (z12) {
            if (this.G || i16 == 2 || z11 || z4) {
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
            if (this.G || i16 == 2 || z11 || z10) {
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
                if (z11 || z4) {
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
            } else if (this.G || i16 == 2 || z11 || z4) {
                path.lineTo(rect.right - b(8.0f), ((rect.bottom - i10) - i12) - b(3.0f));
                int i25 = i12 * 2;
                rectF.set(rect.right - b(8.0f), ((rect.bottom - i10) - i25) - b(9.0f), (rect.right - b(7.0f)) + i25, (rect.bottom - i10) - b(1.0f));
                path.arcTo(rectF, 180.0f, -83.0f, false);
            } else {
                path.lineTo(rect.right - b(8.0f), (i14 - this.r) + this.b);
            }
        } else {
            if (this.G || i16 == 2 || z11 || z4) {
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
            if (this.G || i16 == 2 || z11 || z10) {
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
                if (z11 || z4) {
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
            } else if (this.G || i16 == 2 || z11 || z4) {
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
        Drawable[][] drawableArr;
        int[][] iArr;
        int i10;
        int i11;
        Rect rect = this.o;
        int i12 = this.O;
        if (i12 == 0) {
            i12 = this.P > 0.0f ? 0 : b(SharedConfig.bubbleRadius);
        }
        boolean z4 = this.s;
        char c3 = (z4 && this.t) ? (char) 3 : z4 ? (char) 2 : this.t ? (char) 1 : (char) 0;
        boolean z10 = this.m;
        char c10 = (z10 && this.u) ? (char) 3 : z10 ? (char) 1 : this.u ? (char) 2 : (char) 0;
        boolean z11 = this.q;
        if (z10) {
            g10 = g(z11 ? j6.Ba : j6.dc);
        } else {
            g10 = g(z11 ? j6.Aa : j6.ra);
        }
        boolean z12 = (this.a != null || z10 || this.J) ? false : true;
        int g11 = g(z11 ? j6.Ca : j6.ta);
        boolean z13 = this.K;
        Drawable[][] drawableArr2 = this.B;
        int[][] iArr2 = this.C;
        int[] iArr3 = this.z;
        int[][] iArr4 = this.A;
        if (z13 != z12 || iArr4[c10][c3] != i12 || ((z12 && iArr3[c3] != g11) || iArr2[c10][c3] != g10)) {
            iArr4[c10][c3] = i12;
            try {
                Bitmap createBitmap = Bitmap.createBitmap(b(50.0f), b(40.0f), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                rect.set(getBounds());
                if (z12) {
                    iArr3[c3] = g11;
                    Paint paint = new Paint(1);
                    paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, b(40.0f), new int[]{358573417, 694117737}, (float[]) null, Shader.TileMode.CLAMP));
                    paint.setColorFilter(new PorterDuffColorFilter(g11, PorterDuff.Mode.MULTIPLY));
                    paint.setShadowLayer(2.0f, 0.0f, 1.0f, -1);
                    if (AndroidUtilities.density > 1.0f) {
                        setBounds(-1, -1, createBitmap.getWidth() + 1, createBitmap.getHeight() + 1);
                        i11 = 0;
                    } else {
                        i11 = 0;
                        setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                    }
                    c(canvas, paint);
                    if (AndroidUtilities.density > 1.0f) {
                        paint.setColor(i11);
                        paint.setShadowLayer(0.0f, 0.0f, 0.0f, i11);
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
                i10 = g10;
                try {
                    drawableArr2[c10][c3] = new NinePatchDrawable(createBitmap, t7.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, i10).array(), new Rect(), null);
                    setBounds(rect);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
            }
            this.K = z12;
            iArr[c10][c3] = i10;
            return drawableArr[c10][c3];
        }
        i10 = g10;
        drawableArr = drawableArr2;
        iArr = iArr2;
        this.K = z12;
        iArr[c10][c3] = i10;
        return drawableArr[c10][c3];
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

    public int g(int i10) {
        if (this.l == 2) {
            return j6.w0(null, i10, false);
        }
        f6 f6Var = this.p;
        return f6Var != null ? f6Var.x0(i10) : j6.w0(null, i10, false);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public int h(int i10) {
        if (this.l == 2) {
            return j6.w0(null, i10, false);
        }
        f6 f6Var = this.p;
        return f6Var != null ? f6Var.f1(i10) : j6.rl.get(i10);
    }

    public final ec0 i() {
        boolean z4 = this.v;
        ec0[] ec0VarArr = Q;
        if (z4) {
            return ec0VarArr[2];
        }
        return ec0VarArr[this.l == 2 ? (char) 1 : (char) 0];
    }

    public final Drawable j() {
        int i10;
        if (this.J || (this.a == null && !this.m && this.H == null)) {
            return null;
        }
        int b10 = b(SharedConfig.bubbleRadius);
        boolean z4 = this.s;
        boolean z10 = false;
        char c3 = (z4 && this.t) ? (char) 3 : z4 ? (char) 2 : this.t ? (char) 1 : (char) 0;
        int[] iArr = this.w;
        int i11 = iArr[c3];
        Drawable[] drawableArr = this.y;
        if (i11 != b10) {
            iArr[c3] = b10;
            Bitmap[] bitmapArr = this.x;
            Bitmap bitmap = bitmapArr[c3];
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
                bitmapArr[c3] = createBitmap;
                drawableArr[c3] = new NinePatchDrawable(createBitmap, t7.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, i10).array(), new Rect(), null);
                z10 = true;
            } catch (Throwable unused) {
            }
        }
        int g10 = g(this.q ? j6.Ca : j6.ta);
        Drawable drawable = drawableArr[c3];
        if (drawable != null) {
            int[] iArr2 = this.z;
            if (iArr2[c3] != g10 || z10) {
                drawable.setColorFilter(new PorterDuffColorFilter(g10, PorterDuff.Mode.MULTIPLY));
                iArr2[c3] = g10;
            }
        }
        return drawableArr[c3];
    }

    public final Drawable[] k() {
        return this.y;
    }

    public final boolean l() {
        return this.a != null && j6.tl;
    }

    public final Path m() {
        int b10;
        int i10;
        boolean z4;
        boolean z10;
        Path path;
        m.f3 f3Var = this.N;
        Rect bounds = getBounds();
        int b11 = b(2.0f);
        int i11 = this.O;
        int i12 = this.l;
        if (i11 != 0) {
            i10 = i11;
        } else {
            if (this.P > 0.0f) {
                i11 = AndroidUtilities.lerp(b(SharedConfig.bubbleRadius), Math.min(bounds.width(), bounds.height()) / 2, this.P);
                b10 = AndroidUtilities.lerp(b(Math.min(6, SharedConfig.bubbleRadius)), Math.min(bounds.width(), bounds.height()) / 2, this.P);
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
        boolean z11 = true;
        if (f3Var == null || bounds.height() >= this.b) {
            z4 = i12 != 1 ? (this.r + bounds.bottom) - i11 < this.b : (this.r + bounds.bottom) - (b12 * 2) < this.b;
            z10 = (i11 * 2) + this.r >= 0;
        } else {
            z4 = true;
            z10 = true;
        }
        if (f3Var != null) {
            path = (Path) f3Var.c;
            z11 = f3Var.a(bounds, z4, z10);
        } else {
            path = this.n;
        }
        if (!z11 && this.O == 0) {
            return path;
        }
        boolean z12 = z4;
        Path path2 = path;
        e(path2, bounds, b11, i11, b12, i10, max, z12, z10, true);
        return path2;
    }

    public void n(int i10, int i11, int i12) {
        o(i10, i11, i12, i12, 0, 0, false, false);
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
    public void o(int i10, int i11, int i12, int i13, int i14, int i15, boolean z4, boolean z10) {
        int i16;
        int i17;
        int g10;
        int i18;
        int i19;
        int i20;
        boolean z11;
        boolean z12;
        char c3;
        int i21;
        char c10;
        g5 g5Var = this.H;
        if (g5Var != null) {
            i16 = i12;
            i17 = i14;
            g5Var.o(i10, i11, i16, i13, i17, i15, z4, z10);
        } else {
            i16 = i12;
            i17 = i14;
        }
        boolean z13 = this.q;
        boolean z14 = this.m;
        if (z13) {
            g10 = g(z14 ? j6.Ba : j6.Aa);
            i18 = h(j6.Da);
            i19 = h(j6.Ea);
            i20 = h(j6.Fa);
            if (h(j6.ac) != 0) {
                z11 = true;
                if (i18 != 0) {
                    g10 = g(j6.Aa);
                }
                boolean z15 = this.v;
                int i22 = this.l;
                char c11 = !z15 ? (char) 2 : i22 == 2 ? (char) 1 : (char) 0;
                z12 = this.J;
                ec0[] ec0VarArr = Q;
                if (z12 && i19 != 0 && z11) {
                    c3 = 3;
                    ec0 ec0Var = ec0VarArr[c11];
                    if (ec0Var != null) {
                        int[] iArr = ec0Var.a;
                        this.e = iArr[0];
                        this.f = iArr[1];
                        this.g = iArr[2];
                        this.h = iArr[3];
                        Paint paint = this.c;
                        if (!z12 && i19 != 0 && z11) {
                            if (i16 != this.b || this.M == null || this.e != g10 || this.f != i18 || this.g != i19 || this.h != i20 || this.i != z11) {
                                if (this.L == null) {
                                    Bitmap createBitmap = Bitmap.createBitmap(60, 80, Bitmap.Config.ARGB_8888);
                                    this.L = createBitmap;
                                    createBitmap.setHasAlpha(false);
                                    Bitmap bitmap = this.L;
                                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                                    this.M = new BitmapShader(bitmap, tileMode, tileMode);
                                }
                                if (ec0VarArr[c11] == null) {
                                    ec0 ec0Var2 = new ec0();
                                    ec0VarArr[c11] = ec0Var2;
                                    if (i22 != 2) {
                                        c10 = 1;
                                        ec0Var2.t = true;
                                    } else {
                                        c10 = 1;
                                    }
                                    ec0Var2.w(b(1.0f));
                                } else {
                                    c10 = 1;
                                }
                                ec0 ec0Var3 = ec0VarArr[c11];
                                Bitmap bitmap2 = this.L;
                                int[] iArr2 = ec0Var3.a;
                                iArr2[0] = g10;
                                iArr2[c10] = i18;
                                iArr2[2] = i19;
                                iArr2[c3] = i20;
                                Utilities.generateGradient(bitmap2, ec0Var3.i, ec0Var3.e.getInterpolation(ec0Var3.h), iArr2);
                                this.M.setLocalMatrix(this.k);
                            }
                            BitmapShader bitmapShader = this.M;
                            this.a = bitmapShader;
                            paint.setShader(bitmapShader);
                            paint.setColor(-1);
                            this.e = g10;
                            this.i = z11;
                            this.f = i18;
                            this.g = i19;
                            this.h = i20;
                        } else if (i18 == 0 && (this.a == null || i16 != this.b || this.e != g10 || this.f != i18 || this.g != i19 || this.h != i20 || this.i != z11)) {
                            if (i19 != 0 && z11) {
                                if (ec0VarArr[c11] == null) {
                                    ec0 ec0Var4 = new ec0();
                                    ec0VarArr[c11] = ec0Var4;
                                    if (i22 != 2) {
                                        ec0Var4.t = true;
                                    }
                                    ec0Var4.w(b(1.0f));
                                }
                                ec0VarArr[c11].n(g10, i18, i19, i20);
                                this.a = ec0VarArr[c11].v;
                            } else if (i19 == 0) {
                                this.a = new LinearGradient(0.0f, i17, 0.0f, i16, new int[]{i18, g10}, (float[]) null, Shader.TileMode.CLAMP);
                            } else if (i20 != 0) {
                                this.a = new LinearGradient(0.0f, i17, 0.0f, i16, new int[]{i20, i19, i18, g10}, (float[]) null, Shader.TileMode.CLAMP);
                            } else {
                                this.a = new LinearGradient(0.0f, i17, 0.0f, i16, new int[]{i19, i18, g10}, (float[]) null, Shader.TileMode.CLAMP);
                            }
                            paint.setShader(this.a);
                            this.e = g10;
                            this.i = z11;
                            this.f = i18;
                            this.g = i19;
                            this.h = i20;
                            paint.setColor(-1);
                        } else if (i18 == 0) {
                            if (this.a != null) {
                                this.a = null;
                                paint.setShader(null);
                            }
                            paint.setColor(g10);
                        }
                        if (this.a instanceof BitmapShader) {
                            i21 = 0;
                            ec0VarArr[c11].setBounds(0, i17, i11, i16 - i13);
                        } else {
                            i21 = 0;
                        }
                        this.b = i16;
                        if (this.a instanceof BitmapShader) {
                            i21 = i13;
                        }
                        this.r = i10 - i21;
                        this.s = z4;
                        this.t = z10;
                    }
                } else {
                    c3 = 3;
                }
                Paint paint2 = this.c;
                if (!z12) {
                }
                if (i18 == 0) {
                }
                if (i18 == 0) {
                }
                if (this.a instanceof BitmapShader) {
                }
                this.b = i16;
                if (this.a instanceof BitmapShader) {
                }
                this.r = i10 - i21;
                this.s = z4;
                this.t = z10;
            }
        } else {
            g10 = g(z14 ? j6.dc : j6.ra);
            i18 = 0;
            i19 = 0;
            i20 = 0;
        }
        z11 = false;
        if (i18 != 0) {
        }
        boolean z152 = this.v;
        int i222 = this.l;
        if (!z152) {
        }
        z12 = this.J;
        ec0[] ec0VarArr2 = Q;
        if (z12) {
        }
        c3 = 3;
        Paint paint22 = this.c;
        if (!z12) {
        }
        if (i18 == 0) {
        }
        if (i18 == 0) {
        }
        if (this.a instanceof BitmapShader) {
        }
        this.b = i16;
        if (this.a instanceof BitmapShader) {
        }
        this.r = i10 - i21;
        this.s = z4;
        this.t = z10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        int i11 = this.F;
        Paint paint = this.c;
        if (i11 != i10 || paint.getAlpha() != i10) {
            this.F = i10;
            paint.setAlpha(i10);
            if (this.q) {
                this.d.setAlpha((int) ((i10 / 255.0f) * Color.alpha(g(j6.bc))));
            }
        }
        if (this.a == null) {
            Drawable f10 = f();
            if (f10.getAlpha() != i10) {
                f10.setAlpha(i10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        g5 g5Var = this.H;
        if (g5Var != null) {
            g5Var.setBounds(i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(int i10, PorterDuff.Mode mode) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
