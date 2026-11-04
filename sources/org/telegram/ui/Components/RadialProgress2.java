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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class RadialProgress2 {
    public float A;
    public boolean B;
    public Bitmap C;
    public Canvas D;
    public float E;
    public org.telegram.ui.ActionBar.e6 F;
    public int G;
    public float H;
    public float I;
    public View b;
    public boolean c;
    public final Paint e;
    public final Paint f;
    public final Paint g;
    public final Paint h;
    public final m80 i;
    public final m80 j;
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

    public RadialProgress2(View view, org.telegram.ui.ActionBar.e6 e6Var) {
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
        this.F = e6Var;
        this.e = new Paint(1);
        this.b = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.w = imageReceiver;
        imageReceiver.K0 = true;
        m80 m80Var = new m80();
        this.i = m80Var;
        m80 m80Var2 = new m80();
        this.j = m80Var2;
        m80Var2.j = true;
        m80Var2.b.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        m80Var2.d(4, false);
        int L = org.telegram.messenger.g0.L(22.0f);
        this.x = L;
        imageReceiver.J0(L);
        paint.setColor(1677721600);
        if (view != null) {
            m80Var.A = new zw(view, 14);
            m80Var2.A = new zw(view, 14);
        }
    }

    public final int a() {
        return this.i.q;
    }

    public final float b() {
        m80 m80Var = this.i;
        int i3 = m80Var.q;
        int i10 = m80Var.p;
        if ((i3 == 3 || i3 == 6 || i3 == 10 || i3 == 8 || i3 == 0) && i10 == 4) {
            return m80Var.b();
        }
        if (i3 != 4) {
            return 1.0f;
        }
        return 1.0f - m80Var.b();
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
        int i3 = ((int) rectF.left) - L;
        int i10 = ((int) rectF.top) - L;
        int i11 = L * 2;
        view.invalidate(i3, i10, ((int) rectF.right) + i11, ((int) rectF.bottom) + i11);
    }

    public void draw(Canvas canvas) {
        int i3;
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
        m80 m80Var = this.i;
        int i13 = m80Var.q;
        Paint paint2 = m80Var.c;
        if (i13 != 4 || m80Var.b() < 1.0f) {
            RectF rectF = this.a;
            if (rectF.isEmpty()) {
                return;
            }
            int i14 = m80Var.q;
            float b10 = b();
            boolean z10 = this.z;
            m80 m80Var2 = this.j;
            Paint paint3 = this.h;
            if (!z10 || this.q >= 0) {
                int i15 = this.u;
                if (i15 >= 0) {
                    m80Var2.c(org.telegram.ui.ActionBar.k6.w0(i15, this.F));
                } else {
                    m80Var2.c(this.n);
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
                    m80Var2.c(org.telegram.ui.ActionBar.k6.w0(i17, this.F));
                } else {
                    m80Var2.c(this.o);
                }
                int i18 = this.t;
                if (i18 >= 0) {
                    paint3.setColor(org.telegram.ui.ActionBar.k6.w0(i18, this.F));
                } else {
                    paint3.setColor(this.m);
                }
            }
            boolean z11 = this.y;
            Paint paint4 = this.g;
            if (z11) {
                int i19 = this.v;
                if (i19 >= 0) {
                    i3 = org.telegram.ui.ActionBar.k6.w0(i19, this.F);
                    m80Var.c(i3);
                    paint2.setColor((-16777216) | org.telegram.ui.ActionBar.k6.w0(this.t, this.F));
                } else {
                    i3 = this.o;
                    m80Var.c(i3);
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
                    i3 = org.telegram.ui.ActionBar.k6.w0(i21, this.F);
                    m80Var.c(i3);
                    paint2.setColor((-16777216) | org.telegram.ui.ActionBar.k6.w0(this.p, this.F));
                } else {
                    i3 = this.n;
                    m80Var.c(i3);
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
            boolean z12 = true;
            Paint paint5 = this.f;
            int i23 = 2;
            if (I) {
                float f13 = imageReceiver.i1;
                f10 = 1.0f;
                paint5.setAlpha((int) (this.E * 100.0f * f13 * b10));
                if (f13 >= 1.0f) {
                    argb = -1;
                    f11 = b10;
                    paint = paint3;
                    z12 = false;
                } else {
                    int red = Color.red(i3);
                    int green = Color.green(i3);
                    f11 = b10;
                    int blue = Color.blue(i3);
                    paint = paint3;
                    argb = Color.argb(Color.alpha(i3) + ((int) ((255 - r9) * f13)), red + ((int) ((255 - red) * f13)), green + ((int) ((255 - green) * f13)), blue + ((int) ((255 - blue) * f13)));
                }
                m80Var.c(argb);
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
                float D = a1.g.D(f17, this.s, 0.1f, f17);
                this.D.scale(D, D, ceil, ceil2);
            }
            if (z12 && this.B) {
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
            m80Var.setBounds(ceil - i25, ceil2 - i25, ceil + i25, ceil2 + i25);
            m80Var.E = imageReceiver.I();
            if (this.c || this.q >= 0) {
                Canvas canvas6 = this.D;
                if (canvas6 != null) {
                    m80Var.draw(canvas6);
                } else {
                    m80Var.draw(canvas);
                }
            } else {
                m80Var.o = this.E;
                m80Var.draw(canvas);
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
                    float b11 = m80Var2.q != 4 ? 1.0f : 1.0f - m80Var2.b();
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
                canvas.drawCircle(centerX, centerY, com.google.android.recaptcha.internal.a.y(1.0f, this.s, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(f22) * f12), paint);
                if (this.c) {
                    m80Var2.setBounds((int) (centerX - (org.telegram.messenger.g0.L(f22) * f12)), (int) (centerY - (org.telegram.messenger.g0.L(f22) * f12)), (int) ((org.telegram.messenger.g0.L(f22) * f12) + centerX), (int) ((org.telegram.messenger.g0.L(f22) * f12) + centerY));
                    m80Var2.draw(canvas);
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

    public final void g(int i3, int i10, int i11, int i12) {
        this.p = i3;
        this.t = i10;
        this.u = i11;
        this.v = i12;
    }

    public final void h(String str) {
        String str2;
        if (str != null) {
            Locale locale = Locale.US;
            str2 = com.google.android.recaptcha.internal.a.i(this.x * 2, "_", this.x * 2);
        } else {
            str2 = null;
        }
        this.w.o0(str, str2, null, null, -1L);
    }

    public final void i(TLRPC.PhotoSize photoSize, TLRPC.Document document, org.telegram.messenger.zi ziVar) {
        Locale locale = Locale.US;
        org.telegram.messenger.ac c2 = org.telegram.messenger.ac.c(photoSize, document);
        int i3 = this.x;
        this.w.q0(c2, com.google.android.recaptcha.internal.a.i(i3 * 2, "_", i3 * 2), null, null, ziVar, 1);
    }

    public final void j(TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, TLRPC.Document document, Object obj) {
        Locale locale = Locale.US;
        String i3 = com.google.android.recaptcha.internal.a.i(this.x * 2, "_", this.x * 2);
        this.w.r0(photoSize == null ? null : org.telegram.messenger.ac.c(photoSize, document), i3, photoSize2 != null ? org.telegram.messenger.ac.c(photoSize2, document) : null, i3, null, 0L, null, obj, 1);
    }

    public final void k(int i3, boolean z10, boolean z11) {
        if (i3 == 2 || i3 == 3 || i3 == 4) {
            m80 m80Var = this.j;
            if (z10 && i3 == m80Var.q) {
                return;
            }
            m80Var.d(i3, z11);
            boolean z12 = i3 != 4 || m80Var.b() < 1.0f;
            this.c = z12;
            if (z12) {
                c();
            }
            if (z11) {
                d();
            } else {
                this.b.invalidate();
            }
        }
    }

    public final void l(float f10) {
        this.k = f10;
    }

    public final void m(int i3) {
        this.e.setColor(i3);
    }

    public final void n(View view) {
        this.b = view;
        this.w.H0(view);
        Objects.requireNonNull(view);
        this.i.A = new zw(view, 14);
        this.j.A = new zw(view, 14);
    }

    public final void o(boolean z10, boolean z11) {
        if (z11) {
            this.z = z10;
        } else {
            this.y = z10;
        }
        d();
    }

    public final void p(boolean z10, float f10) {
        if (this.c) {
            this.j.e(z10, f10);
        } else {
            this.i.e(z10, f10);
        }
    }

    public final void q(int i3) {
        this.d = i3;
    }

    public final void r(int i3, int i10, int i11, int i12) {
        this.a.set(i3, i10, i11, i12);
    }

    public void setAsMini() {
        m80 m80Var = this.i;
        m80Var.j = true;
        m80Var.b.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
    }

    public void setBackgroundGradientDrawable(LinearGradient linearGradient) {
        m80 m80Var = this.i;
        m80Var.C = linearGradient;
        m80Var.D = new Matrix();
        m80 m80Var2 = this.j;
        m80Var2.C = linearGradient;
        m80Var2.D = new Matrix();
    }

    public void setCircleRadius(int i3) {
        this.x = i3;
        this.w.J0(i3);
    }

    public void setColors(int i3, int i10, int i11, int i12) {
        this.l = i3;
        this.m = i10;
        this.n = i11;
        this.o = i12;
        this.p = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
    }

    public void setIcon(int i3, boolean z10, boolean z11) {
        m80 m80Var = this.i;
        if (z10 && i3 == m80Var.q) {
            return;
        }
        m80Var.d(i3, z11);
        View view = this.b;
        if (view != null) {
            if (z11) {
                d();
            } else {
                view.invalidate();
            }
        }
    }
}
