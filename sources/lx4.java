// default package

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class lx4 extends Drawable {
    public static sx4 E = new sx4();
    public long A;
    public Bitmap B;
    public Paint C;
    public int D;
    public final ViewGroup a;
    public final ylb b;
    public final Paint c;
    public final Paint d;
    public final RectF e;
    public final Path f;
    public final boolean g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int i;
    public RadialGradient j;
    public final Matrix k;
    public final kx4 l;
    public int[] m;
    public LinearGradient n;
    public final Matrix o;
    public boolean p;
    public final Paint q;
    public final ln r;
    public float s;
    public boolean t;
    public int u;
    public boolean v;
    public boolean w;
    public int x;
    public int y;
    public Integer z;

    public lx4(ViewGroup viewGroup, ylb ylbVar, boolean z) {
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new RectF();
        this.f = new Path();
        this.k = new Matrix();
        this.o = new Matrix();
        Paint paint3 = new Paint(1);
        this.q = paint3;
        byte b = 9;
        this.r = new ln(new qn4(this, b), 320L, d53.h);
        this.s = gm.L(11.0f);
        this.v = true;
        this.w = false;
        int i = cmb.c6;
        this.y = i;
        this.a = viewGroup;
        this.b = ylbVar;
        kx4 kx4Var = new kx4(this, viewGroup, gm.L(28.0f));
        this.l = kx4Var;
        viewGroup.addOnAttachStateChangeListener(new wd(this, b));
        if (viewGroup.isAttachedToWindow()) {
            kx4Var.a();
        }
        this.g = z;
        int v0 = cmb.v0(i, ylbVar);
        this.x = v0;
        paint.setColor(v0);
        a(z);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z) {
        int v0 = z ? cmb.v0(cmb.Z5, this.b) : 0;
        if (this.t != z || (z && this.u != v0)) {
            this.t = z;
            Paint paint = this.c;
            if (!z) {
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                return;
            }
            float L = gm.L(1.66f);
            float L2 = gm.L(0.33f);
            this.u = v0;
            paint.setShadowLayer(L, 0.0f, L2, v0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x02d0, code lost:
    
        if (r6 != null) goto L103;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02da  */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r23v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Canvas canvas, float f) {
        ?? r23;
        boolean z;
        boolean z2;
        float f2;
        float f3;
        Bitmap bitmap;
        Paint a;
        boolean z3;
        BlendMode blendMode;
        Bitmap bitmap2;
        NinePatchDrawable ninePatchDrawable;
        boolean z4;
        boolean z5;
        int v0;
        Canvas canvas2 = canvas;
        Paint paint = this.c;
        int color = paint.getColor();
        int i = this.x;
        ylb ylbVar = this.b;
        if (color == i && (v0 = cmb.v0(cmb.c6, ylbVar)) != this.x) {
            this.x = v0;
            paint.setColor(v0);
        }
        Rect bounds = getBounds();
        float d = this.r.d(this.p);
        RectF rectF = this.e;
        rectF.set(bounds);
        if (this.v) {
            rectF.inset(gm.L(3.33f), gm.L(4.0f));
        }
        if (this.h != null) {
            int U1 = gm.U1(0.35f, Math.min(bounds.width(), bounds.height()), Math.max(bounds.width(), bounds.height())) / 2;
            if (this.j == null || this.i != U1) {
                this.i = U1;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.h;
                int i2 = stargiftattributebackdrop.center_color | (-16777216);
                this.j = new RadialGradient(0.0f, 0.0f, U1, new int[]{i2, i2, stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 0.0f, 1.0f}, Shader.TileMode.CLAMP);
            }
            Matrix matrix = this.k;
            matrix.reset();
            matrix.postTranslate(bounds.centerX(), Math.min(gm.L(50.0f), bounds.centerY()));
            this.j.setLocalMatrix(matrix);
            paint.setShader(this.j);
        } else {
            paint.setShader(null);
        }
        int i3 = cmb.Z5;
        int v02 = cmb.v0(i3, ylbVar);
        int i4 = cmb.c6;
        int v03 = cmb.v0(i4, ylbVar);
        boolean z6 = this.s == ((float) gm.L(11.0f)) && v02 == cmb.w0(null, i3, false) && v03 == cmb.w0(null, i4, false);
        boolean z7 = this.g;
        a(z7 && !z6);
        if (z6) {
            if (E == null) {
                E = new sx4();
            }
            Rect rect = gm.Q;
            rectF.round(rect);
            if (this.h != null) {
                if (z7) {
                    sx4 sx4Var = E;
                    NinePatchDrawable ninePatchDrawable2 = sx4Var.b;
                    if (ninePatchDrawable2 == null || sx4Var.h != v02) {
                        sx4Var.h = v02;
                        z5 = false;
                        z = true;
                        ninePatchDrawable2 = ure.b(sx4Var.a, 0, sx4Var.g, gm.L(1.66f), v02, gm.L(0.33f), 0);
                        sx4Var.b = ninePatchDrawable2;
                    } else {
                        z5 = false;
                        z = true;
                    }
                    ur3.h(ninePatchDrawable2, rect);
                    ninePatchDrawable2.draw(canvas2);
                    z4 = z5;
                } else {
                    z4 = false;
                    z = true;
                }
                float f4 = this.s;
                canvas2.drawRoundRect(rectF, f4, f4, paint);
                r23 = z4;
            } else {
                r23 = 0;
                z = true;
                sx4 sx4Var2 = E;
                if (z7) {
                    ninePatchDrawable = sx4Var2.f;
                    if (ninePatchDrawable == null || (sx4Var2.j != v03 && sx4Var2.k != v02)) {
                        sx4Var2.j = v03;
                        sx4Var2.k = v02;
                        ninePatchDrawable = ure.b(sx4Var2.e, v03, sx4Var2.g, gm.L(1.66f), v02, gm.L(0.33f), v03);
                        sx4Var2.f = ninePatchDrawable;
                    }
                } else {
                    NinePatchDrawable ninePatchDrawable3 = sx4Var2.d;
                    if (ninePatchDrawable3 == null || sx4Var2.i != v03) {
                        sx4Var2.i = v03;
                        ninePatchDrawable3 = ure.b(sx4Var2.c, v03, sx4Var2.g, 0.0f, 0, 0.0f, v03);
                        sx4Var2.d = ninePatchDrawable3;
                    }
                    ninePatchDrawable = ninePatchDrawable3;
                }
                ur3.h(ninePatchDrawable, rect);
                ninePatchDrawable.draw(canvas2);
            }
        } else {
            r23 = 0;
            z = true;
            float f5 = this.s;
            canvas2.drawRoundRect(rectF, f5, f5, paint);
        }
        int[] iArr = this.m;
        kx4 kx4Var = this.l;
        boolean z8 = (iArr == null && (this.h == null || kx4Var.d())) ? r23 : z;
        if (z8) {
            canvas2.save();
            Path path = this.f;
            path.rewind();
            float f6 = this.s;
            path.addRoundRect(rectF, f6, f6, Path.Direction.CW);
            canvas2.clipPath(path);
        }
        if (this.m != null) {
            if (this.n == null) {
                this.n = new LinearGradient(0.0f, 0.0f, 100.0f, 0.0f, this.m, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            }
            Matrix matrix2 = this.o;
            matrix2.reset();
            matrix2.postTranslate(bounds.left, bounds.top);
            matrix2.postRotate((float) ((Math.atan2(bounds.height(), bounds.width()) / 3.141592653589793d) * 180.0d));
            float sqrt = ((float) Math.sqrt(Math.pow(bounds.height(), 2.0d) + Math.pow(bounds.width(), 2.0d))) / 100.0f;
            matrix2.postScale(sqrt, sqrt);
            this.n.setLocalMatrix(matrix2);
            LinearGradient linearGradient = this.n;
            Paint paint2 = this.d;
            paint2.setShader(linearGradient);
            paint2.setStrokeWidth(gm.L(4.66f));
            float f7 = this.s;
            canvas2.drawRoundRect(rectF, f7, f7, paint2);
        }
        if (this.h == null || kx4Var.d()) {
            z2 = z8;
        } else {
            int i5 = this.h.pattern_color | (-16777216);
            canvas2.save();
            canvas2.translate(bounds.centerX(), bounds.centerY());
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 29) {
                Drawable drawable = kx4Var.f[r23];
                f2 = 1.0f;
                if (drawable != null && kx4Var.d.c == 1.0f && (drawable instanceof vm)) {
                    vm vmVar = (vm) drawable;
                    mm mmVar = vmVar.k;
                    long h = vmVar.h();
                    if (mmVar != null) {
                        z2 = z8;
                        f3 = -31.0f;
                        if (h == this.A) {
                            bitmap = mmVar.n();
                        }
                        bitmap = null;
                        if (bitmap != null) {
                            if (this.B != bitmap || (a = this.C) == null) {
                                this.B = bitmap;
                                a = s4.a(bitmap);
                                this.C = a;
                                z3 = z;
                            } else {
                                z3 = r23;
                            }
                            if (this.D != i5 || z3) {
                                this.D = i5;
                                if (i6 >= 29) {
                                    ul1.l();
                                    blendMode = BlendMode.SRC_IN;
                                    a.setColorFilter(new BlendModeColorFilter(i5, blendMode));
                                } else {
                                    a.setColorFilter(new PorterDuffColorFilter(i5, PorterDuff.Mode.SRC_IN));
                                }
                            }
                            if (f < 1.0f) {
                                bitmap2 = bitmap;
                                bpa.b(canvas2, 2, this.C, bitmap2, bounds.width(), bounds.height(), 1.0f - f);
                            } else {
                                bitmap2 = bitmap;
                            }
                            if (f > 0.0f) {
                                canvas2.translate(0.0f, gm.L(f3));
                                bpa.b(canvas2, 0, this.C, bitmap2, bounds.width(), bounds.height(), f);
                            }
                            canvas2 = canvas;
                            canvas2.restore();
                        }
                    }
                }
                z2 = z8;
                f3 = -31.0f;
                bitmap = null;
                if (bitmap != null) {
                }
            } else {
                z2 = z8;
                f2 = 1.0f;
                f3 = -31.0f;
            }
            kx4Var.k(Integer.valueOf(i5));
            if (f < f2) {
                canvas2 = canvas;
                bpa.a(canvas2, 2, kx4Var, bounds.width(), bounds.height(), f2 - f, 1.0f);
            } else {
                canvas2 = canvas;
            }
            if (f > 0.0f) {
                canvas2.translate(0.0f, gm.L(f3));
                bpa.a(canvas2, 0, kx4Var, bounds.width(), bounds.height(), f, 1.0f);
            }
            canvas2.restore();
        }
        if (z2) {
            canvas2.restore();
        }
        if (d > 0.0f) {
            boolean z9 = this.w;
            Paint paint3 = this.q;
            if (!z9) {
                Integer num = this.z;
                paint3.setColor(num != null ? num.intValue() : cmb.v0(this.y, ylbVar));
                paint3.setStrokeWidth(gm.R1(0.0f, gm.N(1.667f), d));
                RectF rectF2 = gm.P;
                rectF2.set(rectF);
                float R1 = gm.R1(-gm.N(2.33f), gm.N(3.33f), d);
                rectF2.inset(R1, R1);
                float R12 = gm.R1(this.s, gm.N(7.33f), d);
                canvas2.drawRoundRect(rectF2, R12, R12, paint3);
                return;
            }
            if (z9 == z) {
                Integer num2 = this.z;
                paint3.setColor(num2 != null ? num2.intValue() : cmb.v0(this.y, ylbVar));
                paint3.setStrokeWidth(gm.R1(0.0f, gm.N(3.0f), d));
                RectF rectF3 = gm.P;
                rectF3.set(rectF);
                float R13 = gm.R1(0.0f, gm.N(3.0f) / 2.0f, d);
                rectF3.inset(R13, R13);
                float R14 = gm.R1(this.s, gm.N(10.0f), d);
                canvas2.drawRoundRect(rectF3, R14, R14, paint3);
            }
        }
    }

    public final void c() {
        this.a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.j = null;
        }
        this.h = stargiftattributebackdrop;
        c();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        b(canvas, 0.0f);
    }

    public final void e(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.A = 0L;
        kx4 kx4Var = this.l;
        if (stargiftattributepattern == null) {
            kx4Var.g(null, false);
            return;
        }
        kx4Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.A = document.id;
        }
    }

    public final void f(boolean z, boolean z2) {
        if (this.p == z) {
            return;
        }
        this.p = z;
        if (!z2) {
            this.r.a(z);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.m == iArr) {
            return;
        }
        this.m = iArr;
        this.n = null;
        c();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        rect.set(gm.L(3.33f), gm.L(4.0f), gm.L(3.33f), gm.L(4.0f));
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
