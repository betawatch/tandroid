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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public class RadialProgress2 {
    public float A;
    public boolean B;
    public Bitmap C;
    public Canvas D;
    public float E;
    public org.telegram.ui.ActionBar.f6 F;
    public int G;
    public float H;
    public float I;
    public View b;
    public boolean c;
    public final Paint e;
    public final Paint f;
    public final Paint g;
    public final Paint h;
    public final p80 i;
    public final p80 j;
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

    public RadialProgress2(View view, org.telegram.ui.ActionBar.f6 f6Var) {
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
        this.F = f6Var;
        this.e = new Paint(1);
        this.b = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.w = imageReceiver;
        imageReceiver.J0 = true;
        p80 p80Var = new p80();
        this.i = p80Var;
        p80 p80Var2 = new p80();
        this.j = p80Var2;
        p80Var2.j = true;
        p80Var2.b.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        p80Var2.d(4, false);
        int L = org.telegram.messenger.g0.L(22.0f);
        this.x = L;
        imageReceiver.J0(L);
        paint.setColor(1677721600);
        if (view != null) {
            p80Var.A = new ax(view, 14);
            p80Var2.A = new ax(view, 14);
        }
    }

    public final int a() {
        return this.i.q;
    }

    public final float b() {
        p80 p80Var = this.i;
        int i7 = p80Var.q;
        int i10 = p80Var.p;
        if ((i7 == 3 || i7 == 6 || i7 == 10 || i7 == 8 || i7 == 0) && i10 == 4) {
            return p80Var.b();
        }
        if (i7 != 4) {
            return 1.0f;
        }
        return 1.0f - p80Var.b();
    }

    public final void c() {
        if (this.C == null) {
            try {
                this.C = Bitmap.createBitmap(org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(48.0f), Bitmap.Config.ARGB_8888);
                this.D = new Canvas(this.C);
            } catch (Throwable unused) {
            }
        }
    }

    public final void d() {
        int L = org.telegram.messenger.g0.L(2.0f);
        View view = this.b;
        RectF rectF = this.a;
        int i7 = ((int) rectF.left) - L;
        int i10 = ((int) rectF.top) - L;
        int i11 = L * 2;
        view.invalidate(i7, i10, ((int) rectF.right) + i11, ((int) rectF.bottom) + i11);
    }

    public void draw(Canvas canvas) {
        int i7;
        int ceil;
        int ceil2;
        float f10;
        float f11;
        Paint paint;
        int i10;
        float centerX;
        float centerY;
        int i11;
        float f12;
        int i12;
        Canvas canvas2;
        Canvas canvas3;
        Canvas canvas4;
        int argb;
        p80 p80Var = this.i;
        int i13 = p80Var.q;
        Paint paint2 = p80Var.c;
        if (i13 != 4 || p80Var.b() < 1.0f) {
            RectF rectF = this.a;
            if (rectF.isEmpty()) {
                return;
            }
            int i14 = p80Var.q;
            float b10 = b();
            boolean z9 = this.z;
            p80 p80Var2 = this.j;
            Paint paint3 = this.h;
            if (!z9 || this.q >= 0) {
                int i15 = this.u;
                if (i15 >= 0) {
                    p80Var2.c(org.telegram.ui.ActionBar.k6.w0(i15, this.F));
                } else {
                    p80Var2.c(this.n);
                }
                int i16 = this.p;
                if (i16 < 0) {
                    paint3.setColor(this.l);
                } else if (this.q >= 0) {
                    paint3.setColor(org.telegram.messenger.g0.S0(this.r, this.s, org.telegram.ui.ActionBar.k6.w0(i16, this.F), org.telegram.ui.ActionBar.k6.w0(this.q, this.F)));
                } else {
                    paint3.setColor(org.telegram.ui.ActionBar.k6.w0(i16, this.F));
                }
            } else {
                int i17 = this.v;
                if (i17 >= 0) {
                    p80Var2.c(org.telegram.ui.ActionBar.k6.w0(i17, this.F));
                } else {
                    p80Var2.c(this.o);
                }
                int i18 = this.t;
                if (i18 >= 0) {
                    paint3.setColor(org.telegram.ui.ActionBar.k6.w0(i18, this.F));
                } else {
                    paint3.setColor(this.m);
                }
            }
            boolean z10 = this.y;
            Paint paint4 = this.g;
            if (z10) {
                int i19 = this.v;
                if (i19 >= 0) {
                    i7 = org.telegram.ui.ActionBar.k6.w0(i19, this.F);
                    p80Var.c(i7);
                    paint2.setColor((-16777216) | org.telegram.ui.ActionBar.k6.w0(this.t, this.F));
                } else {
                    i7 = this.o;
                    p80Var.c(i7);
                    paint2.setColor((-16777216) | this.m);
                }
                int i20 = this.t;
                if (i20 >= 0) {
                    paint4.setColor(org.telegram.ui.ActionBar.k6.w0(i20, this.F));
                } else {
                    paint4.setColor(this.m);
                }
            } else {
                int i21 = this.u;
                if (i21 >= 0) {
                    i7 = org.telegram.ui.ActionBar.k6.w0(i21, this.F);
                    p80Var.c(i7);
                    paint2.setColor((-16777216) | org.telegram.ui.ActionBar.k6.w0(this.p, this.F));
                } else {
                    i7 = this.n;
                    p80Var.c(i7);
                    paint2.setColor((-16777216) | this.l);
                }
                int i22 = this.p;
                if (i22 >= 0) {
                    paint4.setColor(org.telegram.ui.ActionBar.k6.w0(i22, this.F));
                } else {
                    paint4.setColor(this.l);
                }
            }
            if ((this.c || this.q >= 0) && this.D != null) {
                this.C.eraseColor(0);
            }
            paint4.setAlpha((int) (paint4.getAlpha() * b10 * this.E * this.A));
            paint3.setAlpha((int) (paint3.getAlpha() * b10 * this.E));
            if ((this.c || this.q >= 0) && this.D != null) {
                ceil = (int) Math.ceil(rectF.width() / 2.0f);
                ceil2 = (int) Math.ceil(rectF.height() / 2.0f);
            } else {
                ceil = (int) rectF.centerX();
                ceil2 = (int) rectF.centerY();
            }
            ImageReceiver imageReceiver = this.w;
            boolean I = imageReceiver.I();
            boolean z11 = true;
            Paint paint5 = this.f;
            int i23 = 2;
            if (I) {
                float f13 = imageReceiver.h1;
                f10 = 1.0f;
                paint5.setAlpha((int) (this.E * 100.0f * f13 * b10));
                if (f13 >= 1.0f) {
                    argb = -1;
                    f11 = b10;
                    paint = paint3;
                    z11 = false;
                } else {
                    int red = Color.red(i7);
                    int green = Color.green(i7);
                    f11 = b10;
                    int blue = Color.blue(i7);
                    paint = paint3;
                    argb = Color.argb(Color.alpha(i7) + ((int) ((255 - r9) * f13)), red + ((int) ((255 - red) * f13)), green + ((int) ((255 - green) * f13)), blue + ((int) ((255 - blue) * f13)));
                }
                p80Var.c(argb);
                int i24 = this.x;
                float f14 = ceil - i24;
                float f15 = ceil2 - i24;
                float f16 = i24 * 2;
                imageReceiver.y0(f14, f15, f16, f16);
            } else {
                f10 = 1.0f;
                f11 = b10;
                paint = paint3;
            }
            Canvas canvas5 = this.D;
            if (canvas5 == null || this.q < 0 || this.s == f10) {
                i10 = TLObject.FLAG_31;
            } else {
                i10 = canvas5.save();
                float f17 = f10;
                float v = com.google.android.recaptcha.internal.a.v(f17, this.s, 0.1f, f17);
                this.D.scale(v, v, ceil, ceil2);
            }
            if (z11 && this.B) {
                if ((this.c || this.q >= 0) && (canvas4 = this.D) != null) {
                    canvas4.drawCircle(ceil, ceil2, this.x, paint4);
                } else if (i14 != 4 || f11 != 0.0f) {
                    canvas.drawCircle(ceil, ceil2, this.x, paint4);
                }
            }
            if (imageReceiver.I()) {
                imageReceiver.setAlpha(this.E * f11 * this.H);
                if ((this.c || this.q >= 0) && (canvas3 = this.D) != null) {
                    imageReceiver.h(canvas3, null);
                    this.D.drawCircle(ceil, ceil2, this.x, paint5);
                } else {
                    imageReceiver.h(canvas, null);
                    canvas.drawCircle(ceil, ceil2, this.x, paint5);
                }
            }
            int i25 = this.x;
            int i26 = this.G;
            if (i26 > 0 && i25 > i26) {
                i25 = i26;
            }
            if (this.I != 1.0f) {
                canvas.save();
                float f18 = this.I;
                canvas.scale(f18, f18, ceil, ceil2);
            }
            p80Var.setBounds(ceil - i25, ceil2 - i25, ceil + i25, ceil2 + i25);
            p80Var.E = imageReceiver.I();
            if (this.c || this.q >= 0) {
                Canvas canvas6 = this.D;
                if (canvas6 != null) {
                    p80Var.draw(canvas6);
                } else {
                    p80Var.draw(canvas);
                }
            } else {
                p80Var.o = this.E;
                p80Var.draw(canvas);
            }
            if (i10 != Integer.MIN_VALUE && (canvas2 = this.D) != null) {
                canvas2.restoreToCount(i10);
            }
            if (this.c || this.q >= 0) {
                if (Math.abs(rectF.width() - org.telegram.messenger.g0.L(44.0f)) < org.telegram.messenger.g0.p) {
                    float f19 = 16;
                    centerX = rectF.centerX() + org.telegram.messenger.g0.L(f19);
                    centerY = rectF.centerY() + org.telegram.messenger.g0.L(f19);
                    i11 = 20;
                    i23 = 0;
                } else {
                    centerX = rectF.centerX() + org.telegram.messenger.g0.L(18.0f);
                    centerY = rectF.centerY() + org.telegram.messenger.g0.L(18.0f);
                    i11 = 22;
                }
                int i27 = i11 / 2;
                if (this.c) {
                    float b11 = p80Var2.q != 4 ? 1.0f : 1.0f - p80Var2.b();
                    if (b11 == 0.0f) {
                        this.c = false;
                    }
                    f12 = b11;
                } else {
                    f12 = 1.0f;
                }
                Canvas canvas7 = this.D;
                if (canvas7 != null) {
                    float f20 = i11 + 18 + i23;
                    canvas7.drawCircle(org.telegram.messenger.g0.L(f20), org.telegram.messenger.g0.L(f20), org.telegram.messenger.g0.L(i27 + 1) * f12 * this.k, org.telegram.ui.ActionBar.k6.n0);
                } else {
                    int i28 = this.d;
                    Paint paint6 = this.e;
                    paint6.setColor(i28);
                    canvas.drawCircle(centerX, centerY, org.telegram.messenger.g0.L(12.0f), paint6);
                }
                if (this.D != null) {
                    canvas.drawBitmap(this.C, (int) rectF.left, (int) rectF.top, (Paint) null);
                }
                if (this.k < 1.0f) {
                    i12 = canvas.save();
                    float f21 = this.k;
                    canvas.scale(f21, f21, centerX, centerY);
                } else {
                    i12 = TLObject.FLAG_31;
                }
                float f22 = i27;
                canvas.drawCircle(centerX, centerY, com.google.android.recaptcha.internal.a.z(1.0f, this.s, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(f22) * f12), paint);
                if (this.c) {
                    p80Var2.setBounds((int) (centerX - (org.telegram.messenger.g0.L(f22) * f12)), (int) (centerY - (org.telegram.messenger.g0.L(f22) * f12)), (int) ((org.telegram.messenger.g0.L(f22) * f12) + centerX), (int) ((org.telegram.messenger.g0.L(f22) * f12) + centerY));
                    p80Var2.draw(canvas);
                }
                if (i12 != Integer.MIN_VALUE) {
                    canvas.restoreToCount(i12);
                }
            }
            if (this.I != 1.0f) {
                canvas.restore();
            }
        }
    }

    public final void e() {
        this.w.P();
    }

    public final void f() {
        this.w.R();
    }

    public final void g(int i7, int i10, int i11, int i12) {
        this.p = i7;
        this.t = i10;
        this.u = i11;
        this.v = i12;
    }

    public final void h(String str) {
        String str2;
        if (str != null) {
            Locale locale = Locale.US;
            str2 = com.google.android.recaptcha.internal.a.j(this.x * 2, "_", this.x * 2);
        } else {
            str2 = null;
        }
        this.w.o0(str, str2, null, null, -1L);
    }

    public final void i(TLRPC.PhotoSize photoSize, TLRPC.Document document, org.telegram.messenger.ij ijVar) {
        Locale locale = Locale.US;
        org.telegram.messenger.hc c10 = org.telegram.messenger.hc.c(photoSize, document);
        int i7 = this.x;
        this.w.q0(c10, com.google.android.recaptcha.internal.a.j(i7 * 2, "_", i7 * 2), null, null, ijVar, 1);
    }

    public final void j(TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, TLRPC.Document document, Object obj) {
        Locale locale = Locale.US;
        String j3 = com.google.android.recaptcha.internal.a.j(this.x * 2, "_", this.x * 2);
        this.w.r0(photoSize == null ? null : org.telegram.messenger.hc.c(photoSize, document), j3, photoSize2 != null ? org.telegram.messenger.hc.c(photoSize2, document) : null, j3, null, 0L, null, obj, 1);
    }

    public final void k(int i7, boolean z9, boolean z10) {
        if (i7 == 2 || i7 == 3 || i7 == 4) {
            p80 p80Var = this.j;
            if (z9 && i7 == p80Var.q) {
                return;
            }
            p80Var.d(i7, z10);
            boolean z11 = i7 != 4 || p80Var.b() < 1.0f;
            this.c = z11;
            if (z11) {
                c();
            }
            if (z10) {
                d();
            } else {
                this.b.invalidate();
            }
        }
    }

    public final void l(float f10) {
        this.k = f10;
    }

    public final void m(int i7) {
        this.e.setColor(i7);
    }

    public final void n(View view) {
        this.b = view;
        this.w.H0(view);
        Objects.requireNonNull(view);
        this.i.A = new ax(view, 14);
        this.j.A = new ax(view, 14);
    }

    public final void o(boolean z9, boolean z10) {
        if (z10) {
            this.z = z9;
        } else {
            this.y = z9;
        }
        d();
    }

    public final void p(boolean z9, float f10) {
        if (this.c) {
            this.j.e(z9, f10);
        } else {
            this.i.e(z9, f10);
        }
    }

    public final void q(int i7) {
        this.d = i7;
    }

    public final void r(int i7, int i10, int i11, int i12) {
        this.a.set(i7, i10, i11, i12);
    }

    public void setAsMini() {
        p80 p80Var = this.i;
        p80Var.j = true;
        p80Var.b.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
    }

    public void setBackgroundGradientDrawable(LinearGradient linearGradient) {
        p80 p80Var = this.i;
        p80Var.C = linearGradient;
        p80Var.D = new Matrix();
        p80 p80Var2 = this.j;
        p80Var2.C = linearGradient;
        p80Var2.D = new Matrix();
    }

    public void setCircleRadius(int i7) {
        this.x = i7;
        this.w.J0(i7);
    }

    public void setColors(int i7, int i10, int i11, int i12) {
        this.l = i7;
        this.m = i10;
        this.n = i11;
        this.o = i12;
        this.p = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
    }

    public void setIcon(int i7, boolean z9, boolean z10) {
        p80 p80Var = this.i;
        if (z9 && i7 == p80Var.q) {
            return;
        }
        p80Var.d(i7, z10);
        View view = this.b;
        if (view != null) {
            if (z10) {
                d();
            } else {
                view.invalidate();
            }
        }
    }
}
