package bi;

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
import org.telegram.ui.Components.kr;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class e3 extends Drawable {
    public static m3 E = new m3();
    public long A;
    public Bitmap B;
    public Paint C;
    public int D;
    public final ViewGroup a;
    public final org.telegram.ui.ActionBar.i6 b;
    public final Paint c;
    public final Paint d;
    public final RectF e;
    public final Path f;
    public final boolean g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int i;
    public RadialGradient j;
    public final Matrix k;
    public final d3 l;
    public int[] m;
    public LinearGradient n;
    public final Matrix o;
    public boolean p;
    public final Paint q;
    public final org.telegram.ui.Components.c6 r;
    public float s;
    public boolean t;
    public int u;
    public boolean v;
    public int w;
    public int x;
    public int y;
    public Integer z;

    public e3(ViewGroup viewGroup, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
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
        this.r = new org.telegram.ui.Components.c6(new a3.f(this, 21), 320L, kr.h);
        this.s = org.telegram.messenger.g0.L(11.0f);
        this.v = true;
        this.w = 0;
        int i7 = org.telegram.ui.ActionBar.n6.d6;
        this.y = i7;
        this.a = viewGroup;
        this.b = i6Var;
        d3 d3Var = new d3(this, viewGroup, org.telegram.messenger.g0.L(28.0f));
        this.l = d3Var;
        viewGroup.addOnAttachStateChangeListener(new x2(this, 1));
        if (viewGroup.isAttachedToWindow()) {
            d3Var.a();
        }
        this.g = z10;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
        this.x = w02;
        paint.setColor(w02);
        a(z10);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z10) {
        int w02 = z10 ? org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.a6, this.b) : 0;
        if (this.t != z10 || (z10 && this.u != w02)) {
            this.t = z10;
            Paint paint = this.c;
            if (!z10) {
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                return;
            }
            float L = org.telegram.messenger.g0.L(1.66f);
            float L2 = org.telegram.messenger.g0.L(0.33f);
            this.u = w02;
            paint.setShadowLayer(L, 0.0f, L2, w02);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x02d7, code lost:
    
        if (r6 != null) goto L106;
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Canvas canvas, float f10) {
        int i7;
        int i10;
        int i11;
        float f11;
        float f12;
        Bitmap bitmap;
        int i12;
        BlendMode blendMode;
        Bitmap bitmap2;
        NinePatchDrawable ninePatchDrawable;
        int w02;
        Canvas canvas2 = canvas;
        Paint paint = this.c;
        int color = paint.getColor();
        int i13 = this.x;
        org.telegram.ui.ActionBar.i6 i6Var = this.b;
        if (color == i13 && (w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.d6, i6Var)) != this.x) {
            this.x = w02;
            paint.setColor(w02);
        }
        Rect bounds = getBounds();
        float d = this.r.d(this.p);
        RectF rectF = this.e;
        rectF.set(bounds);
        if (this.v) {
            rectF.inset(org.telegram.messenger.g0.L(3.33f), org.telegram.messenger.g0.L(4.0f));
        }
        if (this.h != null) {
            int W1 = org.telegram.messenger.g0.W1(0.35f, Math.min(bounds.width(), bounds.height()), Math.max(bounds.width(), bounds.height())) / 2;
            if (this.j == null || this.i != W1) {
                this.i = W1;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.h;
                int i14 = stargiftattributebackdrop.center_color | (-16777216);
                this.j = new RadialGradient(0.0f, 0.0f, W1, new int[]{i14, i14, stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 0.0f, 1.0f}, Shader.TileMode.CLAMP);
            }
            Matrix matrix = this.k;
            matrix.reset();
            matrix.postTranslate(bounds.centerX(), Math.min(org.telegram.messenger.g0.L(50.0f), bounds.centerY()));
            this.j.setLocalMatrix(matrix);
            paint.setShader(this.j);
        } else {
            paint.setShader(null);
        }
        int i15 = org.telegram.ui.ActionBar.n6.a6;
        int w03 = org.telegram.ui.ActionBar.n6.w0(i15, i6Var);
        int i16 = org.telegram.ui.ActionBar.n6.d6;
        int w04 = org.telegram.ui.ActionBar.n6.w0(i16, i6Var);
        boolean z10 = this.s == ((float) org.telegram.messenger.g0.L(11.0f)) && w03 == org.telegram.ui.ActionBar.n6.x0(null, i15, false) && w04 == org.telegram.ui.ActionBar.n6.x0(null, i16, false);
        boolean z11 = this.g;
        a(z11 && !z10);
        if (z10) {
            if (E == null) {
                E = new m3();
            }
            Rect rect = org.telegram.messenger.g0.Q;
            rectF.round(rect);
            if (this.h != null) {
                if (z11) {
                    m3 m3Var = E;
                    if (m3Var.b == null || m3Var.h != w03) {
                        m3Var.h = w03;
                        i7 = 0;
                        i10 = 1;
                        m3Var.b = c8.r0.b(m3Var.a, 0, m3Var.g, org.telegram.messenger.g0.L(1.66f), w03, org.telegram.messenger.g0.L(0.33f), 0);
                    } else {
                        i7 = 0;
                        i10 = 1;
                    }
                    NinePatchDrawable ninePatchDrawable2 = m3Var.b;
                    bg.t.h(ninePatchDrawable2, rect);
                    ninePatchDrawable2.draw(canvas2);
                } else {
                    i7 = 0;
                    i10 = 1;
                }
                float f13 = this.s;
                canvas2.drawRoundRect(rectF, f13, f13, paint);
            } else {
                i7 = 0;
                i10 = 1;
                if (z11) {
                    m3 m3Var2 = E;
                    if (m3Var2.f == null || (m3Var2.j != w04 && m3Var2.k != w03)) {
                        m3Var2.j = w04;
                        m3Var2.k = w03;
                        m3Var2.f = c8.r0.b(m3Var2.e, w04, m3Var2.g, org.telegram.messenger.g0.L(1.66f), w03, org.telegram.messenger.g0.L(0.33f), w04);
                    }
                    ninePatchDrawable = m3Var2.f;
                } else {
                    m3 m3Var3 = E;
                    if (m3Var3.d == null || m3Var3.i != w04) {
                        m3Var3.i = w04;
                        m3Var3.d = c8.r0.b(m3Var3.c, w04, m3Var3.g, 0.0f, 0, 0.0f, w04);
                    }
                    ninePatchDrawable = m3Var3.d;
                }
                bg.t.h(ninePatchDrawable, rect);
                ninePatchDrawable.draw(canvas2);
            }
        } else {
            i7 = 0;
            i10 = 1;
            float f14 = this.s;
            canvas2.drawRoundRect(rectF, f14, f14, paint);
        }
        int[] iArr = this.m;
        d3 d3Var = this.l;
        int i17 = (iArr == null && (this.h == null || d3Var.d())) ? i7 : i10;
        if (i17 != 0) {
            canvas2.save();
            Path path = this.f;
            path.rewind();
            float f15 = this.s;
            path.addRoundRect(rectF, f15, f15, Path.Direction.CW);
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
            paint2.setStrokeWidth(org.telegram.messenger.g0.L(4.66f));
            float f16 = this.s;
            canvas2.drawRoundRect(rectF, f16, f16, paint2);
        }
        if (this.h == null || d3Var.d()) {
            i11 = i17;
        } else {
            int i18 = this.h.pattern_color | (-16777216);
            canvas2.save();
            canvas2.translate(bounds.centerX(), bounds.centerY());
            int i19 = Build.VERSION.SDK_INT;
            if (i19 >= 29) {
                Drawable drawable = d3Var.f[i7];
                f11 = 1.0f;
                if (drawable != null && d3Var.d.c == 1.0f && (drawable instanceof org.telegram.ui.Components.o5)) {
                    org.telegram.ui.Components.o5 o5Var = (org.telegram.ui.Components.o5) drawable;
                    fi.s2 s2Var = o5Var.k;
                    long h = o5Var.h();
                    if (s2Var != null) {
                        i11 = i17;
                        f12 = -31.0f;
                        if (h == this.A) {
                            bitmap = s2Var.n();
                        }
                        bitmap = null;
                        if (bitmap != null) {
                            if (this.B != bitmap || this.C == null) {
                                this.B = bitmap;
                                this.C = g0.a.a(bitmap);
                                i12 = i10;
                            } else {
                                i12 = i7;
                            }
                            if (this.D != i18 || i12 != 0) {
                                this.D = i18;
                                if (i19 >= 29) {
                                    Paint paint3 = this.C;
                                    blendMode = BlendMode.SRC_IN;
                                    paint3.setColorFilter(new BlendModeColorFilter(i18, blendMode));
                                } else {
                                    this.C.setColorFilter(new PorterDuffColorFilter(i18, PorterDuff.Mode.SRC_IN));
                                }
                            }
                            if (f10 < 1.0f) {
                                bitmap2 = bitmap;
                                di.v0.b(canvas2, 2, this.C, bitmap2, bounds.width(), bounds.height(), 1.0f - f10);
                            } else {
                                bitmap2 = bitmap;
                            }
                            if (f10 > 0.0f) {
                                canvas2.translate(0.0f, org.telegram.messenger.g0.L(f12));
                                di.v0.b(canvas2, 0, this.C, bitmap2, bounds.width(), bounds.height(), f10);
                            }
                            canvas2 = canvas;
                            canvas2.restore();
                        }
                    }
                }
                i11 = i17;
                f12 = -31.0f;
                bitmap = null;
                if (bitmap != null) {
                }
            } else {
                i11 = i17;
                f11 = 1.0f;
                f12 = -31.0f;
            }
            d3Var.k(Integer.valueOf(i18));
            if (f10 < f11) {
                canvas2 = canvas;
                di.v0.a(canvas2, 2, d3Var, bounds.width(), bounds.height(), f11 - f10, 1.0f);
            } else {
                canvas2 = canvas;
            }
            if (f10 > 0.0f) {
                canvas2.translate(0.0f, org.telegram.messenger.g0.L(f12));
                di.v0.a(canvas2, 0, d3Var, bounds.width(), bounds.height(), f10, 1.0f);
            }
            canvas2.restore();
        }
        if (i11 != 0) {
            canvas2.restore();
        }
        if (d > 0.0f) {
            int i20 = this.w;
            Paint paint4 = this.q;
            if (i20 == 0) {
                Integer num = this.z;
                paint4.setColor(num != null ? num.intValue() : org.telegram.ui.ActionBar.n6.w0(this.y, i6Var));
                paint4.setStrokeWidth(org.telegram.messenger.g0.T1(0.0f, org.telegram.messenger.g0.N(1.667f), d));
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(rectF);
                float T1 = org.telegram.messenger.g0.T1(-org.telegram.messenger.g0.N(2.33f), org.telegram.messenger.g0.N(3.33f), d);
                rectF2.inset(T1, T1);
                float T12 = org.telegram.messenger.g0.T1(this.s, org.telegram.messenger.g0.N(7.33f), d);
                canvas2.drawRoundRect(rectF2, T12, T12, paint4);
                return;
            }
            if (i20 == i10) {
                Integer num2 = this.z;
                paint4.setColor(num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.n6.w0(this.y, i6Var));
                paint4.setStrokeWidth(org.telegram.messenger.g0.T1(0.0f, org.telegram.messenger.g0.N(3.0f), d));
                RectF rectF3 = org.telegram.messenger.g0.P;
                rectF3.set(rectF);
                float T13 = org.telegram.messenger.g0.T1(0.0f, org.telegram.messenger.g0.N(3.0f) / 2.0f, d);
                rectF3.inset(T13, T13);
                float T14 = org.telegram.messenger.g0.T1(this.s, org.telegram.messenger.g0.N(10.0f), d);
                canvas2.drawRoundRect(rectF3, T14, T14, paint4);
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
        d3 d3Var = this.l;
        if (stargiftattributepattern == null) {
            d3Var.g(null, false);
            return;
        }
        d3Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.A = document.id;
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
        rect.set(org.telegram.messenger.g0.L(3.33f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(3.33f), org.telegram.messenger.g0.L(4.0f));
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
