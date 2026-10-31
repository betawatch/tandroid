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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class RadialProgress2 {
    public float A;
    public boolean B;
    public Bitmap C;
    public Canvas D;
    public float E;
    public org.telegram.ui.ActionBar.p6 F;
    public int G;
    public float H;
    public float I;
    public View b;
    public boolean c;
    public final Paint e;
    public final Paint f;
    public final Paint g;
    public final Paint h;
    public final i90 i;
    public final i90 j;
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

    public RadialProgress2(View view, org.telegram.ui.ActionBar.p6 p6Var) {
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
        this.F = p6Var;
        this.e = new Paint(1);
        this.b = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.w = imageReceiver;
        imageReceiver.J0 = true;
        i90 i90Var = new i90();
        this.i = i90Var;
        i90 i90Var2 = new i90();
        this.j = i90Var2;
        i90Var2.j = true;
        i90Var2.b.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        i90Var2.d(4, false);
        int L = org.telegram.messenger.i0.L(22.0f);
        this.x = L;
        imageReceiver.J0(L);
        paint.setColor(1677721600);
        if (view != null) {
            i90Var.A = new px(view, 14);
            i90Var2.A = new px(view, 14);
        }
    }

    public final int a() {
        return this.i.q;
    }

    public final float b() {
        i90 i90Var = this.i;
        int i10 = i90Var.q;
        int i11 = i90Var.p;
        if ((i10 == 3 || i10 == 6 || i10 == 10 || i10 == 8 || i10 == 0) && i11 == 4) {
            return i90Var.b();
        }
        if (i10 != 4) {
            return 1.0f;
        }
        return 1.0f - i90Var.b();
    }

    public final void c() {
        if (this.C == null) {
            try {
                this.C = Bitmap.createBitmap(org.telegram.messenger.i0.L(48.0f), org.telegram.messenger.i0.L(48.0f), Bitmap.Config.ARGB_8888);
                this.D = new Canvas(this.C);
            } catch (Throwable unused) {
            }
        }
    }

    public final void d() {
        int L = org.telegram.messenger.i0.L(2.0f);
        View view = this.b;
        RectF rectF = this.a;
        int i10 = ((int) rectF.left) - L;
        int i11 = ((int) rectF.top) - L;
        int i12 = L * 2;
        view.invalidate(i10, i11, ((int) rectF.right) + i12, ((int) rectF.bottom) + i12);
    }

    public void draw(Canvas canvas) {
        int i10;
        int ceil;
        int ceil2;
        float f7;
        float f10;
        Paint paint;
        int i11;
        float centerX;
        float centerY;
        int i12;
        float f11;
        int i13;
        Canvas canvas2;
        Canvas canvas3;
        Canvas canvas4;
        int argb;
        i90 i90Var = this.i;
        int i14 = i90Var.q;
        Paint paint2 = i90Var.c;
        if (i14 != 4 || i90Var.b() < 1.0f) {
            RectF rectF = this.a;
            if (rectF.isEmpty()) {
                return;
            }
            int i15 = i90Var.q;
            float b10 = b();
            boolean z10 = this.z;
            i90 i90Var2 = this.j;
            Paint paint3 = this.h;
            if (!z10 || this.q >= 0) {
                int i16 = this.u;
                if (i16 >= 0) {
                    i90Var2.c(org.telegram.ui.ActionBar.t6.w0(i16, this.F));
                } else {
                    i90Var2.c(this.n);
                }
                int i17 = this.p;
                if (i17 < 0) {
                    paint3.setColor(this.l);
                } else if (this.q >= 0) {
                    paint3.setColor(org.telegram.messenger.i0.S0(this.r, this.s, org.telegram.ui.ActionBar.t6.w0(i17, this.F), org.telegram.ui.ActionBar.t6.w0(this.q, this.F)));
                } else {
                    paint3.setColor(org.telegram.ui.ActionBar.t6.w0(i17, this.F));
                }
            } else {
                int i18 = this.v;
                if (i18 >= 0) {
                    i90Var2.c(org.telegram.ui.ActionBar.t6.w0(i18, this.F));
                } else {
                    i90Var2.c(this.o);
                }
                int i19 = this.t;
                if (i19 >= 0) {
                    paint3.setColor(org.telegram.ui.ActionBar.t6.w0(i19, this.F));
                } else {
                    paint3.setColor(this.m);
                }
            }
            boolean z11 = this.y;
            Paint paint4 = this.g;
            if (z11) {
                int i20 = this.v;
                if (i20 >= 0) {
                    i10 = org.telegram.ui.ActionBar.t6.w0(i20, this.F);
                    i90Var.c(i10);
                    paint2.setColor((-16777216) | org.telegram.ui.ActionBar.t6.w0(this.t, this.F));
                } else {
                    i10 = this.o;
                    i90Var.c(i10);
                    paint2.setColor((-16777216) | this.m);
                }
                int i21 = this.t;
                if (i21 >= 0) {
                    paint4.setColor(org.telegram.ui.ActionBar.t6.w0(i21, this.F));
                } else {
                    paint4.setColor(this.m);
                }
            } else {
                int i22 = this.u;
                if (i22 >= 0) {
                    i10 = org.telegram.ui.ActionBar.t6.w0(i22, this.F);
                    i90Var.c(i10);
                    paint2.setColor((-16777216) | org.telegram.ui.ActionBar.t6.w0(this.p, this.F));
                } else {
                    i10 = this.n;
                    i90Var.c(i10);
                    paint2.setColor((-16777216) | this.l);
                }
                int i23 = this.p;
                if (i23 >= 0) {
                    paint4.setColor(org.telegram.ui.ActionBar.t6.w0(i23, this.F));
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
            int i24 = 2;
            if (I) {
                float f12 = imageReceiver.h1;
                f7 = 1.0f;
                paint5.setAlpha((int) (this.E * 100.0f * f12 * b10));
                if (f12 >= 1.0f) {
                    argb = -1;
                    f10 = b10;
                    paint = paint3;
                    z12 = false;
                } else {
                    int red = Color.red(i10);
                    int green = Color.green(i10);
                    f10 = b10;
                    int blue = Color.blue(i10);
                    paint = paint3;
                    argb = Color.argb(Color.alpha(i10) + ((int) ((255 - r9) * f12)), red + ((int) ((255 - red) * f12)), green + ((int) ((255 - green) * f12)), blue + ((int) ((255 - blue) * f12)));
                }
                i90Var.c(argb);
                int i25 = this.x;
                float f13 = ceil - i25;
                float f14 = ceil2 - i25;
                float f15 = i25 * 2;
                imageReceiver.y0(f13, f14, f15, f15);
            } else {
                f7 = 1.0f;
                f10 = b10;
                paint = paint3;
            }
            Canvas canvas5 = this.D;
            if (canvas5 == null || this.q < 0 || this.s == f7) {
                i11 = TLObject.FLAG_31;
            } else {
                i11 = canvas5.save();
                float f16 = f7;
                float z13 = sc.e.z(f16, this.s, 0.1f, f16);
                this.D.scale(z13, z13, ceil, ceil2);
            }
            if (z12 && this.B) {
                if ((this.c || this.q >= 0) && (canvas4 = this.D) != null) {
                    canvas4.drawCircle(ceil, ceil2, this.x, paint4);
                } else if (i15 != 4 || f10 != 0.0f) {
                    canvas.drawCircle(ceil, ceil2, this.x, paint4);
                }
            }
            if (imageReceiver.I()) {
                imageReceiver.setAlpha(this.E * f10 * this.H);
                if ((this.c || this.q >= 0) && (canvas3 = this.D) != null) {
                    imageReceiver.h(canvas3, null);
                    this.D.drawCircle(ceil, ceil2, this.x, paint5);
                } else {
                    imageReceiver.h(canvas, null);
                    canvas.drawCircle(ceil, ceil2, this.x, paint5);
                }
            }
            int i26 = this.x;
            int i27 = this.G;
            if (i27 > 0 && i26 > i27) {
                i26 = i27;
            }
            if (this.I != 1.0f) {
                canvas.save();
                float f17 = this.I;
                canvas.scale(f17, f17, ceil, ceil2);
            }
            i90Var.setBounds(ceil - i26, ceil2 - i26, ceil + i26, ceil2 + i26);
            i90Var.E = imageReceiver.I();
            if (this.c || this.q >= 0) {
                Canvas canvas6 = this.D;
                if (canvas6 != null) {
                    i90Var.draw(canvas6);
                } else {
                    i90Var.draw(canvas);
                }
            } else {
                i90Var.o = this.E;
                i90Var.draw(canvas);
            }
            if (i11 != Integer.MIN_VALUE && (canvas2 = this.D) != null) {
                canvas2.restoreToCount(i11);
            }
            if (this.c || this.q >= 0) {
                if (Math.abs(rectF.width() - org.telegram.messenger.i0.L(44.0f)) < org.telegram.messenger.i0.p) {
                    float f18 = 16;
                    centerX = rectF.centerX() + org.telegram.messenger.i0.L(f18);
                    centerY = rectF.centerY() + org.telegram.messenger.i0.L(f18);
                    i12 = 20;
                    i24 = 0;
                } else {
                    centerX = rectF.centerX() + org.telegram.messenger.i0.L(18.0f);
                    centerY = rectF.centerY() + org.telegram.messenger.i0.L(18.0f);
                    i12 = 22;
                }
                int i28 = i12 / 2;
                if (this.c) {
                    float b11 = i90Var2.q != 4 ? 1.0f : 1.0f - i90Var2.b();
                    if (b11 == 0.0f) {
                        this.c = false;
                    }
                    f11 = b11;
                } else {
                    f11 = 1.0f;
                }
                Canvas canvas7 = this.D;
                if (canvas7 != null) {
                    float f19 = i12 + 18 + i24;
                    canvas7.drawCircle(org.telegram.messenger.i0.L(f19), org.telegram.messenger.i0.L(f19), org.telegram.messenger.i0.L(i28 + 1) * f11 * this.k, org.telegram.ui.ActionBar.t6.n0);
                } else {
                    int i29 = this.d;
                    Paint paint6 = this.e;
                    paint6.setColor(i29);
                    canvas.drawCircle(centerX, centerY, org.telegram.messenger.i0.L(12.0f), paint6);
                }
                if (this.D != null) {
                    canvas.drawBitmap(this.C, (int) rectF.left, (int) rectF.top, (Paint) null);
                }
                if (this.k < 1.0f) {
                    i13 = canvas.save();
                    float f20 = this.k;
                    canvas.scale(f20, f20, centerX, centerY);
                } else {
                    i13 = TLObject.FLAG_31;
                }
                float f21 = i28;
                canvas.drawCircle(centerX, centerY, c3.i0.z(1.0f, this.s, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(f21) * f11), paint);
                if (this.c) {
                    i90Var2.setBounds((int) (centerX - (org.telegram.messenger.i0.L(f21) * f11)), (int) (centerY - (org.telegram.messenger.i0.L(f21) * f11)), (int) ((org.telegram.messenger.i0.L(f21) * f11) + centerX), (int) ((org.telegram.messenger.i0.L(f21) * f11) + centerY));
                    i90Var2.draw(canvas);
                }
                if (i13 != Integer.MIN_VALUE) {
                    canvas.restoreToCount(i13);
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

    public final void g(int i10, int i11, int i12, int i13) {
        this.p = i10;
        this.t = i11;
        this.u = i12;
        this.v = i13;
    }

    public final void h(String str) {
        String str2;
        if (str != null) {
            Locale locale = Locale.US;
            str2 = a1.g.i(this.x * 2, this.x * 2, "_");
        } else {
            str2 = null;
        }
        this.w.o0(str, str2, null, null, -1L);
    }

    public final void i(TLRPC.PhotoSize photoSize, TLRPC.Document document, org.telegram.messenger.jj jjVar) {
        Locale locale = Locale.US;
        org.telegram.messenger.ic c10 = org.telegram.messenger.ic.c(photoSize, document);
        int i10 = this.x;
        this.w.q0(c10, a1.g.i(i10 * 2, i10 * 2, "_"), null, null, jjVar, 1);
    }

    public final void j(TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, TLRPC.Document document, Object obj) {
        Locale locale = Locale.US;
        String i10 = a1.g.i(this.x * 2, this.x * 2, "_");
        this.w.r0(photoSize == null ? null : org.telegram.messenger.ic.c(photoSize, document), i10, photoSize2 != null ? org.telegram.messenger.ic.c(photoSize2, document) : null, i10, null, 0L, null, obj, 1);
    }

    public final void k(int i10, boolean z10, boolean z11) {
        if (i10 == 2 || i10 == 3 || i10 == 4) {
            i90 i90Var = this.j;
            if (z10 && i10 == i90Var.q) {
                return;
            }
            i90Var.d(i10, z11);
            boolean z12 = i10 != 4 || i90Var.b() < 1.0f;
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

    public final void l(float f7) {
        this.k = f7;
    }

    public final void m(int i10) {
        this.e.setColor(i10);
    }

    public final void n(View view) {
        this.b = view;
        this.w.H0(view);
        Objects.requireNonNull(view);
        this.i.A = new px(view, 14);
        this.j.A = new px(view, 14);
    }

    public final void o(boolean z10, boolean z11) {
        if (z11) {
            this.z = z10;
        } else {
            this.y = z10;
        }
        d();
    }

    public final void p(boolean z10, float f7) {
        if (this.c) {
            this.j.e(z10, f7);
        } else {
            this.i.e(z10, f7);
        }
    }

    public final void q(int i10) {
        this.d = i10;
    }

    public final void r(int i10, int i11, int i12, int i13) {
        this.a.set(i10, i11, i12, i13);
    }

    public void setAsMini() {
        i90 i90Var = this.i;
        i90Var.j = true;
        i90Var.b.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
    }

    public void setBackgroundGradientDrawable(LinearGradient linearGradient) {
        i90 i90Var = this.i;
        i90Var.C = linearGradient;
        i90Var.D = new Matrix();
        i90 i90Var2 = this.j;
        i90Var2.C = linearGradient;
        i90Var2.D = new Matrix();
    }

    public void setCircleRadius(int i10) {
        this.x = i10;
        this.w.J0(i10);
    }

    public void setColors(int i10, int i11, int i12, int i13) {
        this.l = i10;
        this.m = i11;
        this.n = i12;
        this.o = i13;
        this.p = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
    }

    public void setIcon(int i10, boolean z10, boolean z11) {
        i90 i90Var = this.i;
        if (z10 && i10 == i90Var.q) {
            return;
        }
        i90Var.d(i10, z11);
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
