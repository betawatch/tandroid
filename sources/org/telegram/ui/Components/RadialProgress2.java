package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import j$.util.Objects;
import java.util.Locale;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class RadialProgress2 {
    public float A;
    public boolean B;
    public Bitmap C;
    public Canvas D;
    public float E;
    public wjb F;
    public int G;
    public float H;
    public float I;
    public View b;
    public boolean c;
    public final Paint e;
    public final Paint f;
    public final Paint g;
    public final Paint h;
    public final tj6 i;
    public final tj6 j;
    public float k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public float r;
    public float s;
    public int t;
    public int u;
    public int v;
    public final ImageReceiver w;
    public int x;
    public boolean y;
    public boolean z;
    public final RectF a = new RectF();
    public int d = -1;

    public RadialProgress2(View view, wjb wjbVar) {
        Paint paint = new Paint(1);
        this.f = paint;
        this.g = new Paint(1);
        this.h = new Paint(1);
        this.k = 1.0f;
        this.p = -1;
        this.q = -1;
        this.s = 1.0f;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.A = 1.0f;
        this.B = true;
        this.E = 1.0f;
        this.H = 1.0f;
        this.I = 1.0f;
        this.F = wjbVar;
        this.e = new Paint(1);
        this.b = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.w = imageReceiver;
        imageReceiver.K0 = true;
        tj6 tj6Var = new tj6();
        this.i = tj6Var;
        tj6 tj6Var2 = new tj6();
        this.j = tj6Var2;
        tj6Var2.j = true;
        tj6Var2.b.setStrokeWidth(gl.L(2.0f));
        tj6Var2.d(4, false);
        int L = gl.L(22.0f);
        this.x = L;
        imageReceiver.q0(L);
        paint.setColor(1677721600);
        if (view != null) {
            tj6Var.A = new em0(view);
            tj6Var2.A = new em0(view);
        }
    }

    public final int a() {
        return this.i.q;
    }

    public final float b() {
        tj6 tj6Var = this.i;
        int i = tj6Var.q;
        int i2 = tj6Var.p;
        if ((i == 3 || i == 6 || i == 10 || i == 8 || i == 0) && i2 == 4) {
            return tj6Var.b();
        }
        if (i != 4) {
            return 1.0f;
        }
        return 1.0f - tj6Var.b();
    }

    public final void c() {
        if (this.C == null) {
            try {
                this.C = Bitmap.createBitmap(gl.L(48.0f), gl.L(48.0f), Bitmap.Config.ARGB_8888);
                this.D = new Canvas(this.C);
            } catch (Throwable unused) {
            }
        }
    }

    public final void d() {
        int L = gl.L(2.0f);
        View view = this.b;
        RectF rectF = this.a;
        int i = ((int) rectF.left) - L;
        int i2 = ((int) rectF.top) - L;
        int i3 = L << 1;
        view.invalidate(i, i2, ((int) rectF.right) + i3, ((int) rectF.bottom) + i3);
    }

    public void draw(Canvas canvas) {
        int i;
        int ceil;
        int ceil2;
        float f;
        float f2;
        Paint paint;
        int i2;
        float centerX;
        int i3;
        int i4;
        float centerY;
        float f3;
        int i5;
        Canvas canvas2;
        Canvas canvas3;
        Canvas canvas4;
        int argb;
        boolean z;
        tj6 tj6Var = this.i;
        int i6 = tj6Var.q;
        Paint paint2 = tj6Var.c;
        if (i6 != 4 || tj6Var.b() < 1.0f) {
            RectF rectF = this.a;
            if (rectF.isEmpty()) {
                return;
            }
            int i7 = tj6Var.q;
            float b = b();
            boolean z2 = this.z;
            tj6 tj6Var2 = this.j;
            Paint paint3 = this.h;
            if (!z2 || this.q >= 0) {
                int i8 = this.u;
                if (i8 >= 0) {
                    tj6Var2.c(bkb.v0(i8, this.F));
                } else {
                    tj6Var2.c(this.n);
                }
                int i9 = this.p;
                if (i9 >= 0) {
                    int i10 = this.q;
                    wjb wjbVar = this.F;
                    if (i10 >= 0) {
                        paint3.setColor(gl.R0(this.r, this.s, bkb.v0(i9, wjbVar), bkb.v0(this.q, this.F)));
                    } else {
                        paint3.setColor(bkb.v0(i9, wjbVar));
                    }
                } else {
                    paint3.setColor(this.l);
                }
            } else {
                int i11 = this.v;
                if (i11 >= 0) {
                    tj6Var2.c(bkb.v0(i11, this.F));
                } else {
                    tj6Var2.c(this.o);
                }
                int i12 = this.t;
                if (i12 >= 0) {
                    paint3.setColor(bkb.v0(i12, this.F));
                } else {
                    paint3.setColor(this.m);
                }
            }
            boolean z3 = this.y;
            Paint paint4 = this.g;
            if (z3) {
                int i13 = this.v;
                if (i13 >= 0) {
                    i = bkb.v0(i13, this.F);
                    tj6Var.c(i);
                    paint2.setColor(bkb.v0(this.t, this.F) | (-16777216));
                } else {
                    i = this.o;
                    tj6Var.c(i);
                    paint2.setColor(this.m | (-16777216));
                }
                int i14 = this.t;
                if (i14 >= 0) {
                    paint4.setColor(bkb.v0(i14, this.F));
                } else {
                    paint4.setColor(this.m);
                }
            } else {
                int i15 = this.u;
                if (i15 >= 0) {
                    i = bkb.v0(i15, this.F);
                    tj6Var.c(i);
                    paint2.setColor(bkb.v0(this.p, this.F) | (-16777216));
                } else {
                    i = this.n;
                    tj6Var.c(i);
                    paint2.setColor(this.l | (-16777216));
                }
                int i16 = this.p;
                if (i16 >= 0) {
                    paint4.setColor(bkb.v0(i16, this.F));
                } else {
                    paint4.setColor(this.l);
                }
            }
            if ((this.c || this.q >= 0) && this.D != null) {
                this.C.eraseColor(0);
            }
            paint4.setAlpha((int) (paint4.getAlpha() * b * this.E * this.A));
            paint3.setAlpha((int) (paint3.getAlpha() * b * this.E));
            if ((this.c || this.q >= 0) && this.D != null) {
                ceil = (int) Math.ceil(rectF.width() / 2.0f);
                ceil2 = (int) Math.ceil(rectF.height() / 2.0f);
            } else {
                ceil = (int) rectF.centerX();
                ceil2 = (int) rectF.centerY();
            }
            ImageReceiver imageReceiver = this.w;
            boolean B = imageReceiver.B();
            Paint paint5 = this.f;
            boolean z4 = true;
            if (B) {
                float f4 = imageReceiver.i1;
                f = 1.0f;
                paint5.setAlpha((int) (this.E * 100.0f * f4 * b));
                if (f4 >= 1.0f) {
                    argb = -1;
                    f2 = b;
                    paint = paint3;
                    z = false;
                } else {
                    int red = Color.red(i);
                    int green = Color.green(i);
                    f2 = b;
                    int blue = Color.blue(i);
                    paint = paint3;
                    argb = Color.argb(Color.alpha(i) + ((int) ((255 - r9) * f4)), red + ((int) ((255 - red) * f4)), green + ((int) ((255 - green) * f4)), blue + ((int) ((255 - blue) * f4)));
                    z = true;
                }
                tj6Var.c(argb);
                int i17 = this.x;
                float f5 = ceil - i17;
                float f6 = ceil2 - i17;
                float f7 = i17 << 1;
                imageReceiver.i0(f5, f6, f7, f7);
                z4 = z;
            } else {
                f = 1.0f;
                f2 = b;
                paint = paint3;
            }
            Canvas canvas5 = this.D;
            if (canvas5 == null || this.q < 0 || this.s == f) {
                i2 = TLObject.FLAG_31;
            } else {
                i2 = canvas5.save();
                float f8 = f;
                float B2 = ls6.B(f8, this.s, 0.1f, f8);
                this.D.scale(B2, B2, ceil, ceil2);
            }
            if (z4 && this.B) {
                if ((this.c || this.q >= 0) && (canvas4 = this.D) != null) {
                    canvas4.drawCircle(ceil, ceil2, this.x, paint4);
                } else if (i7 != 4 || f2 != 0.0f) {
                    canvas.drawCircle(ceil, ceil2, this.x, paint4);
                }
            }
            if (imageReceiver.B()) {
                imageReceiver.setAlpha(this.E * f2 * this.H);
                if ((this.c || this.q >= 0) && (canvas3 = this.D) != null) {
                    imageReceiver.h(canvas3, null);
                    this.D.drawCircle(ceil, ceil2, this.x, paint5);
                } else {
                    imageReceiver.h(canvas, null);
                    canvas.drawCircle(ceil, ceil2, this.x, paint5);
                }
            }
            int i18 = this.x;
            int i19 = this.G;
            if (i19 > 0 && i18 > i19) {
                i18 = i19;
            }
            if (this.I != 1.0f) {
                canvas.save();
                float f9 = this.I;
                canvas.scale(f9, f9, ceil, ceil2);
            }
            tj6Var.setBounds(ceil - i18, ceil2 - i18, ceil + i18, ceil2 + i18);
            tj6Var.E = imageReceiver.B();
            if (this.c || this.q >= 0) {
                Canvas canvas6 = this.D;
                if (canvas6 != null) {
                    tj6Var.draw(canvas6);
                } else {
                    tj6Var.draw(canvas);
                }
            } else {
                tj6Var.o = this.E;
                tj6Var.draw(canvas);
            }
            if (i2 != Integer.MIN_VALUE && (canvas2 = this.D) != null) {
                canvas2.restoreToCount(i2);
            }
            if (this.c || this.q >= 0) {
                if (Math.abs(rectF.width() - gl.L(44.0f)) < gl.p) {
                    centerX = rectF.centerX() + gl.L(16.0f);
                    i4 = 20;
                    centerY = rectF.centerY() + gl.L(16.0f);
                    i3 = 0;
                } else {
                    centerX = rectF.centerX() + gl.L(18.0f);
                    i3 = 2;
                    i4 = 22;
                    centerY = rectF.centerY() + gl.L(18.0f);
                }
                int i20 = i4 / 2;
                if (this.c) {
                    f3 = tj6Var2.q != 4 ? 1.0f : 1.0f - tj6Var2.b();
                    if (f3 == 0.0f) {
                        this.c = false;
                    }
                } else {
                    f3 = 1.0f;
                }
                Canvas canvas7 = this.D;
                if (canvas7 != null) {
                    float f10 = i4 + 18 + i3;
                    canvas7.drawCircle(gl.L(f10), gl.L(f10), gl.L(i20 + 1) * f3 * this.k, bkb.m0);
                } else {
                    int i21 = this.d;
                    Paint paint6 = this.e;
                    paint6.setColor(i21);
                    canvas.drawCircle(centerX, centerY, gl.L(12.0f), paint6);
                }
                if (this.D != null) {
                    canvas.drawBitmap(this.C, (int) rectF.left, (int) rectF.top, (Paint) null);
                }
                if (this.k < 1.0f) {
                    i5 = canvas.save();
                    float f11 = this.k;
                    canvas.scale(f11, f11, centerX, centerY);
                } else {
                    i5 = TLObject.FLAG_31;
                }
                float f12 = i20;
                canvas.drawCircle(centerX, centerY, tb4.A(1.0f, this.s, gl.L(1.0f), gl.L(f12) * f3), paint);
                if (this.c) {
                    tj6Var2.setBounds((int) (centerX - (gl.L(f12) * f3)), (int) (centerY - (gl.L(f12) * f3)), (int) ((gl.L(f12) * f3) + centerX), (int) ((gl.L(f12) * f3) + centerY));
                    tj6Var2.draw(canvas);
                }
                if (i5 != Integer.MIN_VALUE) {
                    canvas.restoreToCount(i5);
                }
            }
            if (this.I != 1.0f) {
                canvas.restore();
            }
        }
    }

    public final void e() {
        this.w.I();
    }

    public final void f() {
        this.w.K();
    }

    public final void g(int i, int i2, int i3, int i4) {
        this.p = i;
        this.t = i2;
        this.u = i3;
        this.v = i4;
    }

    public final void h(String str) {
        String str2;
        if (str != null) {
            Locale locale = Locale.US;
            str2 = tb4.m(this.x << 1, this.x << 1, "_");
        } else {
            str2 = null;
        }
        this.w.e0(str, str2, null, null, -1L);
    }

    public final void i(TLRPC.PhotoSize photoSize, TLRPC.Document document, k27 k27Var) {
        Locale locale = Locale.US;
        gl5 c = gl5.c(photoSize, document);
        int i = this.x;
        this.w.d0(c, tb4.m(i << 1, i << 1, "_"), null, null, k27Var, 1);
    }

    public final void j(TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, TLRPC.Document document, Object obj) {
        Locale locale = Locale.US;
        String m = tb4.m(this.x << 1, this.x << 1, "_");
        this.w.Z(photoSize == null ? null : gl5.c(photoSize, document), m, photoSize2 != null ? gl5.c(photoSize2, document) : null, m, null, 0L, null, obj, 1);
    }

    public final void k(int i, boolean z, boolean z2) {
        if (i == 2 || i == 3 || i == 4) {
            tj6 tj6Var = this.j;
            if (z && i == tj6Var.q) {
                return;
            }
            tj6Var.d(i, z2);
            boolean z3 = i != 4 || tj6Var.b() < 1.0f;
            this.c = z3;
            if (z3) {
                c();
            }
            if (z2) {
                d();
            } else {
                this.b.invalidate();
            }
        }
    }

    public final void l(int i) {
        this.e.setColor(i);
    }

    public final void m(View view) {
        this.b = view;
        this.w.p0(view);
        Objects.requireNonNull(view);
        this.i.A = new em0(view);
        this.j.A = new em0(view);
    }

    public final void n(boolean z, boolean z2) {
        if (z2) {
            this.z = z;
        } else {
            this.y = z;
        }
        d();
    }

    public final void o(boolean z, float f) {
        if (this.c) {
            this.j.e(z, f);
        } else {
            this.i.e(z, f);
        }
    }

    public final void p(int i, int i2, int i3, int i4) {
        this.a.set(i, i2, i3, i4);
    }

    public void setAsMini() {
        tj6 tj6Var = this.i;
        tj6Var.j = true;
        tj6Var.b.setStrokeWidth(gl.L(2.0f));
    }

    public void setBackgroundGradientDrawable(LinearGradient linearGradient) {
        tj6 tj6Var = this.i;
        tj6Var.C = linearGradient;
        tj6Var.D = new Matrix();
        tj6 tj6Var2 = this.j;
        tj6Var2.C = linearGradient;
        tj6Var2.D = new Matrix();
    }

    public void setCircleRadius(int i) {
        this.x = i;
        this.w.q0(i);
    }

    public void setColors(int i, int i2, int i3, int i4) {
        this.l = i;
        this.m = i2;
        this.n = i3;
        this.o = i4;
        this.p = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
    }

    public void setIcon(int i, boolean z, boolean z2) {
        tj6 tj6Var = this.i;
        if (z && i == tj6Var.q) {
            return;
        }
        tj6Var.d(i, z2);
        View view = this.b;
        if (view != null) {
            if (z2) {
                d();
            } else {
                view.invalidate();
            }
        }
    }
}
