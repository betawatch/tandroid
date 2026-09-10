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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
    public final ca0 i;
    public final ca0 j;
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
        imageReceiver.setInvalidateAll(true);
        ca0 ca0Var = new ca0();
        this.i = ca0Var;
        ca0 ca0Var2 = new ca0();
        this.j = ca0Var2;
        ca0Var2.j = true;
        ca0Var2.b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        ca0Var2.d(4, false);
        int dp = AndroidUtilities.dp(22.0f);
        this.x = dp;
        imageReceiver.setRoundRadius(dp);
        paint.setColor(1677721600);
        if (view != null) {
            ca0Var.A = new pv(view, 13);
            ca0Var2.A = new pv(view, 13);
        }
    }

    public final int a() {
        return this.i.q;
    }

    public final float b() {
        ca0 ca0Var = this.i;
        int i10 = ca0Var.q;
        int i11 = ca0Var.p;
        if ((i10 == 3 || i10 == 6 || i10 == 10 || i10 == 8 || i10 == 0) && i11 == 4) {
            return ca0Var.b();
        }
        if (i10 != 4) {
            return 1.0f;
        }
        return 1.0f - ca0Var.b();
    }

    public final void c() {
        if (this.C == null) {
            try {
                this.C = Bitmap.createBitmap(AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), Bitmap.Config.ARGB_8888);
                this.D = new Canvas(this.C);
            } catch (Throwable unused) {
            }
        }
    }

    public final void d() {
        int dp = AndroidUtilities.dp(2.0f);
        View view = this.b;
        RectF rectF = this.a;
        int i10 = ((int) rectF.left) - dp;
        int i11 = ((int) rectF.top) - dp;
        int i12 = dp * 2;
        view.invalidate(i10, i11, ((int) rectF.right) + i12, ((int) rectF.bottom) + i12);
    }

    public void draw(Canvas canvas) {
        int i10;
        int ceil;
        int ceil2;
        float f7;
        Paint paint;
        float f10;
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
        ca0 ca0Var = this.i;
        int i14 = ca0Var.q;
        Paint paint2 = ca0Var.c;
        if (i14 != 4 || ca0Var.b() < 1.0f) {
            RectF rectF = this.a;
            if (rectF.isEmpty()) {
                return;
            }
            int i15 = ca0Var.q;
            float b10 = b();
            boolean z10 = this.z;
            ca0 ca0Var2 = this.j;
            Paint paint3 = this.h;
            if (!z10 || this.q >= 0) {
                int i16 = this.u;
                if (i16 >= 0) {
                    ca0Var2.c(org.telegram.ui.ActionBar.j6.v0(i16, this.F));
                } else {
                    ca0Var2.c(this.n);
                }
                int i17 = this.p;
                if (i17 < 0) {
                    paint3.setColor(this.l);
                } else if (this.q >= 0) {
                    paint3.setColor(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.v0(i17, this.F), org.telegram.ui.ActionBar.j6.v0(this.q, this.F), this.r, this.s));
                } else {
                    paint3.setColor(org.telegram.ui.ActionBar.j6.v0(i17, this.F));
                }
            } else {
                int i18 = this.v;
                if (i18 >= 0) {
                    ca0Var2.c(org.telegram.ui.ActionBar.j6.v0(i18, this.F));
                } else {
                    ca0Var2.c(this.o);
                }
                int i19 = this.t;
                if (i19 >= 0) {
                    paint3.setColor(org.telegram.ui.ActionBar.j6.v0(i19, this.F));
                } else {
                    paint3.setColor(this.m);
                }
            }
            boolean z11 = this.y;
            Paint paint4 = this.g;
            if (z11) {
                int i20 = this.v;
                if (i20 >= 0) {
                    i10 = org.telegram.ui.ActionBar.j6.v0(i20, this.F);
                    ca0Var.c(i10);
                    paint2.setColor((-16777216) | org.telegram.ui.ActionBar.j6.v0(this.t, this.F));
                } else {
                    i10 = this.o;
                    ca0Var.c(i10);
                    paint2.setColor((-16777216) | this.m);
                }
                int i21 = this.t;
                if (i21 >= 0) {
                    paint4.setColor(org.telegram.ui.ActionBar.j6.v0(i21, this.F));
                } else {
                    paint4.setColor(this.m);
                }
            } else {
                int i22 = this.u;
                if (i22 >= 0) {
                    i10 = org.telegram.ui.ActionBar.j6.v0(i22, this.F);
                    ca0Var.c(i10);
                    paint2.setColor((-16777216) | org.telegram.ui.ActionBar.j6.v0(this.p, this.F));
                } else {
                    i10 = this.n;
                    ca0Var.c(i10);
                    paint2.setColor((-16777216) | this.l);
                }
                int i23 = this.p;
                if (i23 >= 0) {
                    paint4.setColor(org.telegram.ui.ActionBar.j6.v0(i23, this.F));
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
            boolean hasBitmapImage = imageReceiver.hasBitmapImage();
            boolean z12 = true;
            Paint paint5 = this.f;
            int i24 = 2;
            if (hasBitmapImage) {
                float currentAlpha = imageReceiver.getCurrentAlpha();
                paint5.setAlpha((int) (this.E * 100.0f * currentAlpha * b10));
                if (currentAlpha >= 1.0f) {
                    argb = -1;
                    f7 = b10;
                    paint = paint3;
                    z12 = false;
                    f10 = 1.0f;
                } else {
                    int red = Color.red(i10);
                    f10 = 1.0f;
                    int green = Color.green(i10);
                    f7 = b10;
                    int blue = Color.blue(i10);
                    paint = paint3;
                    argb = Color.argb(Color.alpha(i10) + ((int) ((255 - r9) * currentAlpha)), red + ((int) ((255 - red) * currentAlpha)), green + ((int) ((255 - green) * currentAlpha)), blue + ((int) ((255 - blue) * currentAlpha)));
                }
                ca0Var.c(argb);
                int i25 = this.x;
                float f12 = ceil - i25;
                float f13 = ceil2 - i25;
                float f14 = i25 * 2;
                imageReceiver.setImageCoords(f12, f13, f14, f14);
            } else {
                f7 = b10;
                paint = paint3;
                f10 = 1.0f;
            }
            Canvas canvas5 = this.D;
            if (canvas5 == null || this.q < 0 || this.s == f10) {
                i11 = TLObject.FLAG_31;
            } else {
                i11 = canvas5.save();
                float a2 = com.google.android.gms.internal.vision.e2.a(1.0f, this.s, 0.1f, 1.0f);
                this.D.scale(a2, a2, ceil, ceil2);
            }
            if (z12 && this.B) {
                if ((this.c || this.q >= 0) && (canvas4 = this.D) != null) {
                    canvas4.drawCircle(ceil, ceil2, this.x, paint4);
                } else if (i15 != 4 || f7 != 0.0f) {
                    canvas.drawCircle(ceil, ceil2, this.x, paint4);
                }
            }
            if (imageReceiver.hasBitmapImage()) {
                imageReceiver.setAlpha(f7 * this.E * this.H);
                if ((this.c || this.q >= 0) && (canvas3 = this.D) != null) {
                    imageReceiver.draw(canvas3);
                    this.D.drawCircle(ceil, ceil2, this.x, paint5);
                } else {
                    imageReceiver.draw(canvas);
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
                float f15 = this.I;
                canvas.scale(f15, f15, ceil, ceil2);
            }
            ca0Var.setBounds(ceil - i26, ceil2 - i26, ceil + i26, ceil2 + i26);
            ca0Var.E = imageReceiver.hasBitmapImage();
            if (this.c || this.q >= 0) {
                Canvas canvas6 = this.D;
                if (canvas6 != null) {
                    ca0Var.draw(canvas6);
                } else {
                    ca0Var.draw(canvas);
                }
            } else {
                ca0Var.o = this.E;
                ca0Var.draw(canvas);
            }
            if (i11 != Integer.MIN_VALUE && (canvas2 = this.D) != null) {
                canvas2.restoreToCount(i11);
            }
            if (this.c || this.q >= 0) {
                if (Math.abs(rectF.width() - AndroidUtilities.dp(44.0f)) < AndroidUtilities.density) {
                    float f16 = 16;
                    centerX = rectF.centerX() + AndroidUtilities.dp(f16);
                    centerY = rectF.centerY() + AndroidUtilities.dp(f16);
                    i12 = 20;
                    i24 = 0;
                } else {
                    centerX = rectF.centerX() + AndroidUtilities.dp(18.0f);
                    centerY = rectF.centerY() + AndroidUtilities.dp(18.0f);
                    i12 = 22;
                }
                int i28 = i12 / 2;
                if (this.c) {
                    float b11 = ca0Var2.q != 4 ? 1.0f : 1.0f - ca0Var2.b();
                    if (b11 == 0.0f) {
                        this.c = false;
                    }
                    f11 = b11;
                } else {
                    f11 = 1.0f;
                }
                Canvas canvas7 = this.D;
                if (canvas7 != null) {
                    float f17 = i12 + 18 + i24;
                    canvas7.drawCircle(AndroidUtilities.dp(f17), AndroidUtilities.dp(f17), AndroidUtilities.dp(i28 + 1) * f11 * this.k, org.telegram.ui.ActionBar.j6.n0);
                } else {
                    int i29 = this.d;
                    Paint paint6 = this.e;
                    paint6.setColor(i29);
                    canvas.drawCircle(centerX, centerY, AndroidUtilities.dp(12.0f), paint6);
                }
                if (this.D != null) {
                    canvas.drawBitmap(this.C, (int) rectF.left, (int) rectF.top, (Paint) null);
                }
                if (this.k < 1.0f) {
                    i13 = canvas.save();
                    float f18 = this.k;
                    canvas.scale(f18, f18, centerX, centerY);
                } else {
                    i13 = TLObject.FLAG_31;
                }
                float f19 = i28;
                canvas.drawCircle(centerX, centerY, com.google.android.gms.internal.vision.e2.z(1.0f, this.s, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(f19) * f11), paint);
                if (this.c) {
                    ca0Var2.setBounds((int) (centerX - (AndroidUtilities.dp(f19) * f11)), (int) (centerY - (AndroidUtilities.dp(f19) * f11)), (int) ((AndroidUtilities.dp(f19) * f11) + centerX), (int) ((AndroidUtilities.dp(f19) * f11) + centerY));
                    ca0Var2.draw(canvas);
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
        this.w.onAttachedToWindow();
    }

    public final void f() {
        this.w.onDetachedFromWindow();
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
            str2 = a4.a.k(this.x * 2, this.x * 2, "_");
        } else {
            str2 = null;
        }
        this.w.setImage(str, str2, null, null, -1L);
    }

    public final void i(TLRPC.PhotoSize photoSize, TLRPC.Document document, MessageObject messageObject) {
        Locale locale = Locale.US;
        ImageLocation forDocument = ImageLocation.getForDocument(photoSize, document);
        int i10 = this.x;
        this.w.setImage(forDocument, a4.a.k(i10 * 2, i10 * 2, "_"), null, null, messageObject, 1);
    }

    public final void j(TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, TLRPC.Document document, Object obj) {
        Locale locale = Locale.US;
        String k10 = a4.a.k(this.x * 2, this.x * 2, "_");
        this.w.setImage(photoSize == null ? null : ImageLocation.getForDocument(photoSize, document), k10, photoSize2 != null ? ImageLocation.getForDocument(photoSize2, document) : null, k10, null, 0L, null, obj, 1);
    }

    public final void k(int i10, boolean z10, boolean z11) {
        if (i10 == 2 || i10 == 3 || i10 == 4) {
            ca0 ca0Var = this.j;
            if (z10 && i10 == ca0Var.q) {
                return;
            }
            ca0Var.d(i10, z11);
            boolean z12 = i10 != 4 || ca0Var.b() < 1.0f;
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

    public final void m(View view) {
        this.b = view;
        this.w.setParentView(view);
        Objects.requireNonNull(view);
        this.i.A = new pv(view, 13);
        this.j.A = new pv(view, 13);
    }

    public final void n(boolean z10, boolean z11) {
        if (z11) {
            this.z = z10;
        } else {
            this.y = z10;
        }
        d();
    }

    public final void o(float f7, boolean z10) {
        if (this.c) {
            this.j.e(f7, z10);
        } else {
            this.i.e(f7, z10);
        }
    }

    public final void p(int i10) {
        this.d = i10;
    }

    public final void q(int i10, int i11, int i12, int i13) {
        this.a.set(i10, i11, i12, i13);
    }

    public void setAsMini() {
        ca0 ca0Var = this.i;
        ca0Var.j = true;
        ca0Var.b.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public void setBackgroundGradientDrawable(LinearGradient linearGradient) {
        ca0 ca0Var = this.i;
        ca0Var.C = linearGradient;
        ca0Var.D = new Matrix();
        ca0 ca0Var2 = this.j;
        ca0Var2.C = linearGradient;
        ca0Var2.D = new Matrix();
    }

    public void setCircleRadius(int i10) {
        this.x = i10;
        this.w.setRoundRadius(i10);
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
        ca0 ca0Var = this.i;
        if (z10 && i10 == ca0Var.q) {
            return;
        }
        ca0Var.d(i10, z11);
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
