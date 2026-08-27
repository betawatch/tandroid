package gh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class y1 extends Drawable {
    public static f2 C = new f2();
    public Paint A;
    public int B;
    public final ViewGroup a;
    public final org.telegram.ui.ActionBar.c6 b;
    public final Paint c;
    public final Paint d;
    public final RectF e;
    public final Path f;
    public final boolean g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int i;
    public RadialGradient j;
    public final Matrix k;
    public final x1 l;
    public int[] m;
    public LinearGradient n;
    public final Matrix o;
    public boolean p;
    public final Paint q;
    public final org.telegram.ui.Components.y5 r;
    public float s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public Integer x;
    public long y;
    public Bitmap z;

    public y1(ViewGroup viewGroup, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new RectF();
        this.f = new Path();
        this.k = new Matrix();
        new Path();
        this.o = new Matrix();
        Paint paint3 = new Paint(1);
        this.q = paint3;
        this.r = new org.telegram.ui.Components.y5(new f2.r(this, 8), 320L, er.h);
        this.s = AndroidUtilities.dp(11.0f);
        this.u = true;
        this.v = 0;
        int i10 = org.telegram.ui.ActionBar.g6.d6;
        this.w = i10;
        this.a = viewGroup;
        this.b = c6Var;
        x1 x1Var = new x1(this, viewGroup, AndroidUtilities.dp(28.0f));
        this.l = x1Var;
        viewGroup.addOnAttachStateChangeListener(new bf.b(this, 1));
        if (viewGroup.isAttachedToWindow()) {
            x1Var.a();
        }
        this.g = z10;
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        a(z10);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z10) {
        if (this.t != z10) {
            this.t = z10;
            Paint paint = this.c;
            if (z10) {
                paint.setShadowLayer(AndroidUtilities.dp(1.66f), 0.0f, AndroidUtilities.dp(0.33f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.a6, this.b));
            } else {
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x02be, code lost:
    
        if (r6 != null) goto L97;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Canvas canvas, float f10) {
        org.telegram.ui.ActionBar.c6 c6Var;
        float f11;
        Bitmap bitmap;
        boolean z10;
        BlendMode blendMode;
        Bitmap bitmap2;
        NinePatchDrawable ninePatchDrawable;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        float e9 = this.r.e(this.p);
        RectF rectF = this.e;
        rectF.set(bounds);
        if (this.u) {
            rectF.inset(AndroidUtilities.dp(3.33f), AndroidUtilities.dp(4.0f));
        }
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.h;
        Paint paint = this.c;
        if (stargiftattributebackdrop != null) {
            int lerp = AndroidUtilities.lerp(Math.min(bounds.width(), bounds.height()), Math.max(bounds.width(), bounds.height()), 0.35f) / 2;
            if (this.j == null || this.i != lerp) {
                this.i = lerp;
                float f12 = lerp;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = this.h;
                int i10 = stargiftattributebackdrop2.center_color | (-16777216);
                this.j = new RadialGradient(0.0f, 0.0f, f12, new int[]{i10, i10, stargiftattributebackdrop2.edge_color | (-16777216)}, new float[]{0.0f, 0.0f, 1.0f}, Shader.TileMode.CLAMP);
            }
            Matrix matrix = this.k;
            matrix.reset();
            matrix.postTranslate(bounds.centerX(), Math.min(AndroidUtilities.dp(50.0f), bounds.centerY()));
            this.j.setLocalMatrix(matrix);
            paint.setShader(this.j);
        } else {
            paint.setShader(null);
        }
        int i11 = org.telegram.ui.ActionBar.g6.a6;
        org.telegram.ui.ActionBar.c6 c6Var2 = this.b;
        final int v02 = org.telegram.ui.ActionBar.g6.v0(i11, c6Var2);
        int i12 = org.telegram.ui.ActionBar.g6.d6;
        final int v03 = org.telegram.ui.ActionBar.g6.v0(i12, c6Var2);
        final int i13 = 0;
        boolean z11 = this.s == ((float) AndroidUtilities.dp(11.0f)) && v02 == org.telegram.ui.ActionBar.g6.w0(null, i11, false) && v03 == org.telegram.ui.ActionBar.g6.w0(null, i12, false);
        boolean z12 = this.g;
        a(z12 && !z11);
        if (z11) {
            if (C == null) {
                C = new f2();
            }
            Rect rect = AndroidUtilities.rectTmp2;
            rectF.round(rect);
            if (this.h != null) {
                if (z12) {
                    f2 f2Var = C;
                    if (f2Var.b == null || f2Var.h != v02) {
                        f2Var.h = v02;
                        Bitmap[] bitmapArr = f2Var.a;
                        float[] fArr = f2Var.g;
                        final float dp = AndroidUtilities.dp(1.66f);
                        final float dp2 = AndroidUtilities.dp(0.33f);
                        f2Var.b = h7.l6.b(bitmapArr, fArr, dp, dp2, 0, new pg.e() { // from class: pg.d
                            @Override // pg.e
                            public final void a(Canvas canvas3, RectF rectF2, float[] fArr2) {
                                Path path = new Path();
                                path.addRoundRect(rectF2, fArr2, Path.Direction.CW);
                                Paint paint2 = new Paint(1);
                                paint2.setStyle(Paint.Style.FILL);
                                paint2.setColor(i13);
                                float f13 = dp;
                                if (f13 > 0.0f) {
                                    paint2.setShadowLayer(f13, 0.0f, dp2, v02);
                                }
                                canvas3.drawPath(path, paint2);
                                if (f13 > 0.0f) {
                                    paint2.clearShadowLayer();
                                    canvas3.drawPath(path, paint2);
                                }
                            }
                        });
                    }
                    NinePatchDrawable ninePatchDrawable2 = f2Var.b;
                    gf.s.h(ninePatchDrawable2, rect);
                    ninePatchDrawable2.draw(canvas2);
                }
                float f13 = this.s;
                canvas2.drawRoundRect(rectF, f13, f13, paint);
            } else {
                if (z12) {
                    f2 f2Var2 = C;
                    if (f2Var2.f == null || (f2Var2.j != v03 && f2Var2.k != v02)) {
                        f2Var2.j = v03;
                        f2Var2.k = v02;
                        Bitmap[] bitmapArr2 = f2Var2.e;
                        float[] fArr2 = f2Var2.g;
                        final float dp3 = AndroidUtilities.dp(1.66f);
                        final float dp4 = AndroidUtilities.dp(0.33f);
                        f2Var2.f = h7.l6.b(bitmapArr2, fArr2, dp3, dp4, v03, new pg.e() { // from class: pg.d
                            @Override // pg.e
                            public final void a(Canvas canvas3, RectF rectF2, float[] fArr22) {
                                Path path = new Path();
                                path.addRoundRect(rectF2, fArr22, Path.Direction.CW);
                                Paint paint2 = new Paint(1);
                                paint2.setStyle(Paint.Style.FILL);
                                paint2.setColor(v03);
                                float f132 = dp3;
                                if (f132 > 0.0f) {
                                    paint2.setShadowLayer(f132, 0.0f, dp4, v02);
                                }
                                canvas3.drawPath(path, paint2);
                                if (f132 > 0.0f) {
                                    paint2.clearShadowLayer();
                                    canvas3.drawPath(path, paint2);
                                }
                            }
                        });
                    }
                    ninePatchDrawable = f2Var2.f;
                } else {
                    f2 f2Var3 = C;
                    if (f2Var3.d == null || f2Var3.i != v03) {
                        f2Var3.i = v03;
                        final float f14 = 0.0f;
                        final float f15 = 0.0f;
                        f2Var3.d = h7.l6.b(f2Var3.c, f2Var3.g, 0.0f, 0.0f, v03, new pg.e() { // from class: pg.d
                            @Override // pg.e
                            public final void a(Canvas canvas3, RectF rectF2, float[] fArr22) {
                                Path path = new Path();
                                path.addRoundRect(rectF2, fArr22, Path.Direction.CW);
                                Paint paint2 = new Paint(1);
                                paint2.setStyle(Paint.Style.FILL);
                                paint2.setColor(v03);
                                float f132 = f14;
                                if (f132 > 0.0f) {
                                    paint2.setShadowLayer(f132, 0.0f, f15, i13);
                                }
                                canvas3.drawPath(path, paint2);
                                if (f132 > 0.0f) {
                                    paint2.clearShadowLayer();
                                    canvas3.drawPath(path, paint2);
                                }
                            }
                        });
                    }
                    ninePatchDrawable = f2Var3.d;
                }
                gf.s.h(ninePatchDrawable, rect);
                ninePatchDrawable.draw(canvas2);
            }
        } else {
            float f16 = this.s;
            canvas2.drawRoundRect(rectF, f16, f16, paint);
        }
        int[] iArr = this.m;
        x1 x1Var = this.l;
        boolean z13 = (iArr == null && (this.h == null || x1Var.d())) ? false : true;
        if (z13) {
            canvas2.save();
            Path path = this.f;
            path.rewind();
            float f17 = this.s;
            path.addRoundRect(rectF, f17, f17, Path.Direction.CW);
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
            paint2.setStrokeWidth(AndroidUtilities.dp(4.66f));
            float f18 = this.s;
            canvas2.drawRoundRect(rectF, f18, f18, paint2);
        }
        if (this.h == null || x1Var.d()) {
            c6Var = c6Var2;
        } else {
            int i14 = this.h.pattern_color | (-16777216);
            canvas2.save();
            canvas2.translate(bounds.centerX(), bounds.centerY());
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 29) {
                Drawable drawable = x1Var.f[0];
                f11 = 1.0f;
                if (drawable != null && x1Var.d.c == 1.0f && (drawable instanceof org.telegram.ui.Components.k5)) {
                    org.telegram.ui.Components.k5 k5Var = (org.telegram.ui.Components.k5) drawable;
                    jh.y2 y2Var = k5Var.k;
                    long i16 = k5Var.i();
                    if (y2Var != null) {
                        c6Var = c6Var2;
                        if (i16 == this.y) {
                            bitmap = y2Var.getBitmap();
                        }
                        bitmap = null;
                        if (bitmap != null) {
                            if (this.z != bitmap || this.A == null) {
                                this.z = bitmap;
                                this.A = g0.a.a(bitmap);
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (this.B != i14 || z10) {
                                this.B = i14;
                                if (i15 >= 29) {
                                    Paint paint3 = this.A;
                                    blendMode = BlendMode.SRC_IN;
                                    paint3.setColorFilter(new BlendModeColorFilter(i14, blendMode));
                                } else {
                                    this.A.setColorFilter(new PorterDuffColorFilter(i14, PorterDuff.Mode.SRC_IN));
                                }
                            }
                            if (f10 < 1.0f) {
                                bitmap2 = bitmap;
                                hh.y0.b(canvas2, 2, this.A, bitmap2, bounds.width(), bounds.height(), 1.0f - f10);
                            } else {
                                bitmap2 = bitmap;
                            }
                            if (f10 > 0.0f) {
                                canvas2.translate(0.0f, AndroidUtilities.dp(-31.0f));
                                hh.y0.b(canvas2, 0, this.A, bitmap2, bounds.width(), bounds.height(), f10);
                            }
                            canvas2 = canvas;
                            canvas2.restore();
                        }
                    }
                }
                c6Var = c6Var2;
                bitmap = null;
                if (bitmap != null) {
                }
            } else {
                c6Var = c6Var2;
                f11 = 1.0f;
            }
            x1Var.k(Integer.valueOf(i14));
            if (f10 < f11) {
                canvas2 = canvas;
                hh.y0.a(canvas2, 2, x1Var, bounds.width(), bounds.height(), f11 - f10, 1.0f);
            } else {
                canvas2 = canvas;
            }
            if (f10 > 0.0f) {
                canvas2.translate(0.0f, AndroidUtilities.dp(-31.0f));
                hh.y0.a(canvas2, 0, x1Var, bounds.width(), bounds.height(), f10, 1.0f);
            }
            canvas2.restore();
        }
        if (z13) {
            canvas2.restore();
        }
        if (e9 > 0.0f) {
            int i17 = this.v;
            Paint paint4 = this.q;
            if (i17 == 0) {
                Integer num = this.x;
                paint4.setColor(num != null ? num.intValue() : org.telegram.ui.ActionBar.g6.v0(this.w, c6Var));
                paint4.setStrokeWidth(AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(1.667f), e9));
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(rectF);
                float lerp2 = AndroidUtilities.lerp(-AndroidUtilities.dpf2(2.33f), AndroidUtilities.dpf2(3.33f), e9);
                rectF2.inset(lerp2, lerp2);
                float lerp3 = AndroidUtilities.lerp(this.s, AndroidUtilities.dpf2(7.33f), e9);
                canvas2.drawRoundRect(rectF2, lerp3, lerp3, paint4);
                return;
            }
            org.telegram.ui.ActionBar.c6 c6Var3 = c6Var;
            if (i17 == 1) {
                Integer num2 = this.x;
                paint4.setColor(num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.g6.v0(this.w, c6Var3));
                paint4.setStrokeWidth(AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(3.0f), e9));
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(rectF);
                float lerp4 = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(3.0f) / 2.0f, e9);
                rectF3.inset(lerp4, lerp4);
                float lerp5 = AndroidUtilities.lerp(this.s, AndroidUtilities.dpf2(10.0f), e9);
                canvas2.drawRoundRect(rectF3, lerp5, lerp5, paint4);
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
        this.y = 0L;
        x1 x1Var = this.l;
        if (stargiftattributepattern == null) {
            x1Var.g(null, false);
            return;
        }
        x1Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.y = document.id;
        }
    }

    public final void f(boolean z10, boolean z11) {
        if (this.p == z10) {
            return;
        }
        this.p = z10;
        if (!z11) {
            this.r.a(z10);
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
        rect.set(AndroidUtilities.dp(3.33f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.33f), AndroidUtilities.dp(4.0f));
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
