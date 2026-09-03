package kh;

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
import k7.t7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.mr;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class u1 extends Drawable {
    public static b2 C = new b2();
    public Paint A;
    public int B;
    public final ViewGroup a;
    public final f6 b;
    public final Paint c;
    public final Paint d;
    public final RectF e;
    public final Path f;
    public final boolean g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int i;
    public RadialGradient j;
    public final Matrix k;
    public final t1 l;
    public int[] m;
    public LinearGradient n;
    public final Matrix o;
    public boolean p;
    public final Paint q;
    public final org.telegram.ui.Components.z5 r;
    public float s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public Integer x;
    public long y;
    public Bitmap z;

    public u1(ViewGroup viewGroup, f6 f6Var, boolean z4) {
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
        this.r = new org.telegram.ui.Components.z5(new e3.h(this, 27), 320L, mr.h);
        this.s = AndroidUtilities.dp(11.0f);
        this.u = true;
        this.v = 0;
        int i10 = j6.d6;
        this.w = i10;
        this.a = viewGroup;
        this.b = f6Var;
        t1 t1Var = new t1(this, viewGroup, AndroidUtilities.dp(28.0f));
        this.l = t1Var;
        viewGroup.addOnAttachStateChangeListener(new ef.b(this, 1));
        if (viewGroup.isAttachedToWindow()) {
            t1Var.a();
        }
        this.g = z4;
        paint.setColor(j6.v0(i10, f6Var));
        a(z4);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z4) {
        if (this.t != z4) {
            this.t = z4;
            Paint paint = this.c;
            if (z4) {
                paint.setShadowLayer(AndroidUtilities.dp(1.66f), 0.0f, AndroidUtilities.dp(0.33f), j6.v0(j6.a6, this.b));
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
        f6 f6Var;
        float f11;
        Bitmap bitmap;
        boolean z4;
        BlendMode blendMode;
        Bitmap bitmap2;
        NinePatchDrawable ninePatchDrawable;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        float e = this.r.e(this.p);
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
        int i11 = j6.a6;
        f6 f6Var2 = this.b;
        final int v02 = j6.v0(i11, f6Var2);
        int i12 = j6.d6;
        final int v03 = j6.v0(i12, f6Var2);
        final int i13 = 0;
        boolean z10 = this.s == ((float) AndroidUtilities.dp(11.0f)) && v02 == j6.w0(null, i11, false) && v03 == j6.w0(null, i12, false);
        boolean z11 = this.g;
        a(z11 && !z10);
        if (z10) {
            if (C == null) {
                C = new b2();
            }
            Rect rect = AndroidUtilities.rectTmp2;
            rectF.round(rect);
            if (this.h != null) {
                if (z11) {
                    b2 b2Var = C;
                    if (b2Var.b == null || b2Var.h != v02) {
                        b2Var.h = v02;
                        Bitmap[] bitmapArr = b2Var.a;
                        float[] fArr = b2Var.g;
                        final float dp = AndroidUtilities.dp(1.66f);
                        final float dp2 = AndroidUtilities.dp(0.33f);
                        b2Var.b = t7.b(bitmapArr, fArr, dp, dp2, 0, new tg.e() { // from class: tg.d
                            @Override // tg.e
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
                    NinePatchDrawable ninePatchDrawable2 = b2Var.b;
                    kf.r.h(ninePatchDrawable2, rect);
                    ninePatchDrawable2.draw(canvas2);
                }
                float f13 = this.s;
                canvas2.drawRoundRect(rectF, f13, f13, paint);
            } else {
                if (z11) {
                    b2 b2Var2 = C;
                    if (b2Var2.f == null || (b2Var2.j != v03 && b2Var2.k != v02)) {
                        b2Var2.j = v03;
                        b2Var2.k = v02;
                        Bitmap[] bitmapArr2 = b2Var2.e;
                        float[] fArr2 = b2Var2.g;
                        final float dp3 = AndroidUtilities.dp(1.66f);
                        final float dp4 = AndroidUtilities.dp(0.33f);
                        b2Var2.f = t7.b(bitmapArr2, fArr2, dp3, dp4, v03, new tg.e() { // from class: tg.d
                            @Override // tg.e
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
                    ninePatchDrawable = b2Var2.f;
                } else {
                    b2 b2Var3 = C;
                    if (b2Var3.d == null || b2Var3.i != v03) {
                        b2Var3.i = v03;
                        final float f14 = 0.0f;
                        final float f15 = 0.0f;
                        b2Var3.d = t7.b(b2Var3.c, b2Var3.g, 0.0f, 0.0f, v03, new tg.e() { // from class: tg.d
                            @Override // tg.e
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
                    ninePatchDrawable = b2Var3.d;
                }
                kf.r.h(ninePatchDrawable, rect);
                ninePatchDrawable.draw(canvas2);
            }
        } else {
            float f16 = this.s;
            canvas2.drawRoundRect(rectF, f16, f16, paint);
        }
        int[] iArr = this.m;
        t1 t1Var = this.l;
        boolean z12 = (iArr == null && (this.h == null || t1Var.d())) ? false : true;
        if (z12) {
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
        if (this.h == null || t1Var.d()) {
            f6Var = f6Var2;
        } else {
            int i14 = this.h.pattern_color | (-16777216);
            canvas2.save();
            canvas2.translate(bounds.centerX(), bounds.centerY());
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 29) {
                Drawable drawable = t1Var.f[0];
                f11 = 1.0f;
                if (drawable != null && t1Var.d.c == 1.0f && (drawable instanceof org.telegram.ui.Components.l5)) {
                    org.telegram.ui.Components.l5 l5Var = (org.telegram.ui.Components.l5) drawable;
                    nh.y2 y2Var = l5Var.k;
                    long i16 = l5Var.i();
                    if (y2Var != null) {
                        f6Var = f6Var2;
                        if (i16 == this.y) {
                            bitmap = y2Var.getBitmap();
                        }
                        bitmap = null;
                        if (bitmap != null) {
                            if (this.z != bitmap || this.A == null) {
                                this.z = bitmap;
                                this.A = g0.a.a(bitmap);
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (this.B != i14 || z4) {
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
                                lh.x0.b(canvas2, 2, this.A, bitmap2, bounds.width(), bounds.height(), 1.0f - f10);
                            } else {
                                bitmap2 = bitmap;
                            }
                            if (f10 > 0.0f) {
                                canvas2.translate(0.0f, AndroidUtilities.dp(-31.0f));
                                lh.x0.b(canvas2, 0, this.A, bitmap2, bounds.width(), bounds.height(), f10);
                            }
                            canvas2 = canvas;
                            canvas2.restore();
                        }
                    }
                }
                f6Var = f6Var2;
                bitmap = null;
                if (bitmap != null) {
                }
            } else {
                f6Var = f6Var2;
                f11 = 1.0f;
            }
            t1Var.k(Integer.valueOf(i14));
            if (f10 < f11) {
                canvas2 = canvas;
                lh.x0.a(canvas2, 2, t1Var, bounds.width(), bounds.height(), f11 - f10, 1.0f);
            } else {
                canvas2 = canvas;
            }
            if (f10 > 0.0f) {
                canvas2.translate(0.0f, AndroidUtilities.dp(-31.0f));
                lh.x0.a(canvas2, 0, t1Var, bounds.width(), bounds.height(), f10, 1.0f);
            }
            canvas2.restore();
        }
        if (z12) {
            canvas2.restore();
        }
        if (e > 0.0f) {
            int i17 = this.v;
            Paint paint4 = this.q;
            if (i17 == 0) {
                Integer num = this.x;
                paint4.setColor(num != null ? num.intValue() : j6.v0(this.w, f6Var));
                paint4.setStrokeWidth(AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(1.667f), e));
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(rectF);
                float lerp2 = AndroidUtilities.lerp(-AndroidUtilities.dpf2(2.33f), AndroidUtilities.dpf2(3.33f), e);
                rectF2.inset(lerp2, lerp2);
                float lerp3 = AndroidUtilities.lerp(this.s, AndroidUtilities.dpf2(7.33f), e);
                canvas2.drawRoundRect(rectF2, lerp3, lerp3, paint4);
                return;
            }
            f6 f6Var3 = f6Var;
            if (i17 == 1) {
                Integer num2 = this.x;
                paint4.setColor(num2 != null ? num2.intValue() : j6.v0(this.w, f6Var3));
                paint4.setStrokeWidth(AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(3.0f), e));
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(rectF);
                float lerp4 = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(3.0f) / 2.0f, e);
                rectF3.inset(lerp4, lerp4);
                float lerp5 = AndroidUtilities.lerp(this.s, AndroidUtilities.dpf2(10.0f), e);
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
        t1 t1Var = this.l;
        if (stargiftattributepattern == null) {
            t1Var.g(null, false);
            return;
        }
        t1Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.y = document.id;
        }
    }

    public final void f(boolean z4, boolean z10) {
        if (this.p == z4) {
            return;
        }
        this.p = z4;
        if (!z10) {
            this.r.a(z4);
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
