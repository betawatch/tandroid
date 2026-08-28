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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class RadialProgress2 {
    public float A;
    public boolean B;
    public Bitmap C;
    public Canvas D;
    public float E;
    public org.telegram.ui.ActionBar.b6 F;
    public int G;
    public float H;
    public float I;
    public View b;
    public boolean c;
    public final Paint e;
    public final Paint f;
    public final Paint g;
    public final Paint h;
    public final b90 i;
    public final b90 j;
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

    public RadialProgress2(View view, org.telegram.ui.ActionBar.b6 b6Var) {
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
        this.F = b6Var;
        this.e = new Paint(1);
        this.b = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.w = imageReceiver;
        imageReceiver.setInvalidateAll(true);
        b90 b90Var = new b90();
        this.i = b90Var;
        b90 b90Var2 = new b90();
        this.j = b90Var2;
        b90Var2.j = true;
        b90Var2.b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        b90Var2.d(4, false);
        int dp = AndroidUtilities.dp(22.0f);
        this.x = dp;
        imageReceiver.setRoundRadius(dp);
        paint.setColor(1677721600);
        if (view != null) {
            b90Var.A = new wu(view, 13);
            b90Var2.A = new wu(view, 13);
        }
    }

    public final int a() {
        return this.i.q;
    }

    public final float b() {
        b90 b90Var = this.i;
        int i9 = b90Var.q;
        int i10 = b90Var.p;
        if ((i9 == 3 || i9 == 6 || i9 == 10 || i9 == 8 || i9 == 0) && i10 == 4) {
            return b90Var.b();
        }
        if (i9 != 4) {
            return 1.0f;
        }
        return 1.0f - b90Var.b();
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
        int i9 = ((int) rectF.left) - dp;
        int i10 = ((int) rectF.top) - dp;
        int i11 = dp * 2;
        view.invalidate(i9, i10, ((int) rectF.right) + i11, ((int) rectF.bottom) + i11);
    }

    public void draw(Canvas canvas) {
        int i9;
        int ceil;
        int ceil2;
        float f10;
        Paint paint;
        float f11;
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
        b90 b90Var = this.i;
        int i13 = b90Var.q;
        Paint paint2 = b90Var.c;
        if (i13 != 4 || b90Var.b() < 1.0f) {
            RectF rectF = this.a;
            if (rectF.isEmpty()) {
                return;
            }
            int i14 = b90Var.q;
            float b10 = b();
            boolean z10 = this.z;
            b90 b90Var2 = this.j;
            Paint paint3 = this.h;
            if (!z10 || this.q >= 0) {
                int i15 = this.u;
                if (i15 >= 0) {
                    b90Var2.c(org.telegram.ui.ActionBar.f6.v0(i15, this.F));
                } else {
                    b90Var2.c(this.n);
                }
                int i16 = this.p;
                if (i16 < 0) {
                    paint3.setColor(this.l);
                } else if (this.q >= 0) {
                    paint3.setColor(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.f6.v0(i16, this.F), org.telegram.ui.ActionBar.f6.v0(this.q, this.F), this.r, this.s));
                } else {
                    paint3.setColor(org.telegram.ui.ActionBar.f6.v0(i16, this.F));
                }
            } else {
                int i17 = this.v;
                if (i17 >= 0) {
                    b90Var2.c(org.telegram.ui.ActionBar.f6.v0(i17, this.F));
                } else {
                    b90Var2.c(this.o);
                }
                int i18 = this.t;
                if (i18 >= 0) {
                    paint3.setColor(org.telegram.ui.ActionBar.f6.v0(i18, this.F));
                } else {
                    paint3.setColor(this.m);
                }
            }
            boolean z11 = this.y;
            Paint paint4 = this.g;
            if (z11) {
                int i19 = this.v;
                if (i19 >= 0) {
                    i9 = org.telegram.ui.ActionBar.f6.v0(i19, this.F);
                    b90Var.c(i9);
                    paint2.setColor((-16777216) | org.telegram.ui.ActionBar.f6.v0(this.t, this.F));
                } else {
                    i9 = this.o;
                    b90Var.c(i9);
                    paint2.setColor((-16777216) | this.m);
                }
                int i20 = this.t;
                if (i20 >= 0) {
                    paint4.setColor(org.telegram.ui.ActionBar.f6.v0(i20, this.F));
                } else {
                    paint4.setColor(this.m);
                }
            } else {
                int i21 = this.u;
                if (i21 >= 0) {
                    i9 = org.telegram.ui.ActionBar.f6.v0(i21, this.F);
                    b90Var.c(i9);
                    paint2.setColor((-16777216) | org.telegram.ui.ActionBar.f6.v0(this.p, this.F));
                } else {
                    i9 = this.n;
                    b90Var.c(i9);
                    paint2.setColor((-16777216) | this.l);
                }
                int i22 = this.p;
                if (i22 >= 0) {
                    paint4.setColor(org.telegram.ui.ActionBar.f6.v0(i22, this.F));
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
            int i23 = 2;
            if (hasBitmapImage) {
                float currentAlpha = imageReceiver.getCurrentAlpha();
                paint5.setAlpha((int) (this.E * 100.0f * currentAlpha * b10));
                if (currentAlpha >= 1.0f) {
                    argb = -1;
                    f10 = b10;
                    paint = paint3;
                    z12 = false;
                    f11 = 1.0f;
                } else {
                    int red = Color.red(i9);
                    f11 = 1.0f;
                    int green = Color.green(i9);
                    f10 = b10;
                    int blue = Color.blue(i9);
                    paint = paint3;
                    argb = Color.argb(Color.alpha(i9) + ((int) ((255 - r9) * currentAlpha)), red + ((int) ((255 - red) * currentAlpha)), green + ((int) ((255 - green) * currentAlpha)), blue + ((int) ((255 - blue) * currentAlpha)));
                }
                b90Var.c(argb);
                int i24 = this.x;
                float f13 = ceil - i24;
                float f14 = ceil2 - i24;
                float f15 = i24 * 2;
                imageReceiver.setImageCoords(f13, f14, f15, f15);
            } else {
                f10 = b10;
                paint = paint3;
                f11 = 1.0f;
            }
            Canvas canvas5 = this.D;
            if (canvas5 == null || this.q < 0 || this.s == f11) {
                i10 = TLObject.FLAG_31;
            } else {
                i10 = canvas5.save();
                float C = j3.r0.C(1.0f, this.s, 0.1f, 1.0f);
                this.D.scale(C, C, ceil, ceil2);
            }
            if (z12 && this.B) {
                if ((this.c || this.q >= 0) && (canvas4 = this.D) != null) {
                    canvas4.drawCircle(ceil, ceil2, this.x, paint4);
                } else if (i14 != 4 || f10 != 0.0f) {
                    canvas.drawCircle(ceil, ceil2, this.x, paint4);
                }
            }
            if (imageReceiver.hasBitmapImage()) {
                imageReceiver.setAlpha(f10 * this.E * this.H);
                if ((this.c || this.q >= 0) && (canvas3 = this.D) != null) {
                    imageReceiver.draw(canvas3);
                    this.D.drawCircle(ceil, ceil2, this.x, paint5);
                } else {
                    imageReceiver.draw(canvas);
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
                float f16 = this.I;
                canvas.scale(f16, f16, ceil, ceil2);
            }
            b90Var.setBounds(ceil - i25, ceil2 - i25, ceil + i25, ceil2 + i25);
            b90Var.E = imageReceiver.hasBitmapImage();
            if (this.c || this.q >= 0) {
                Canvas canvas6 = this.D;
                if (canvas6 != null) {
                    b90Var.draw(canvas6);
                } else {
                    b90Var.draw(canvas);
                }
            } else {
                b90Var.o = this.E;
                b90Var.draw(canvas);
            }
            if (i10 != Integer.MIN_VALUE && (canvas2 = this.D) != null) {
                canvas2.restoreToCount(i10);
            }
            if (this.c || this.q >= 0) {
                if (Math.abs(rectF.width() - AndroidUtilities.dp(44.0f)) < AndroidUtilities.density) {
                    float f17 = 16;
                    centerX = rectF.centerX() + AndroidUtilities.dp(f17);
                    centerY = rectF.centerY() + AndroidUtilities.dp(f17);
                    i11 = 20;
                    i23 = 0;
                } else {
                    centerX = rectF.centerX() + AndroidUtilities.dp(18.0f);
                    centerY = rectF.centerY() + AndroidUtilities.dp(18.0f);
                    i11 = 22;
                }
                int i27 = i11 / 2;
                if (this.c) {
                    float b11 = b90Var2.q != 4 ? 1.0f : 1.0f - b90Var2.b();
                    if (b11 == 0.0f) {
                        this.c = false;
                    }
                    f12 = b11;
                } else {
                    f12 = 1.0f;
                }
                Canvas canvas7 = this.D;
                if (canvas7 != null) {
                    float f18 = i11 + 18 + i23;
                    canvas7.drawCircle(AndroidUtilities.dp(f18), AndroidUtilities.dp(f18), AndroidUtilities.dp(i27 + 1) * f12 * this.k, org.telegram.ui.ActionBar.f6.n0);
                } else {
                    int i28 = this.d;
                    Paint paint6 = this.e;
                    paint6.setColor(i28);
                    canvas.drawCircle(centerX, centerY, AndroidUtilities.dp(12.0f), paint6);
                }
                if (this.D != null) {
                    canvas.drawBitmap(this.C, (int) rectF.left, (int) rectF.top, (Paint) null);
                }
                if (this.k < 1.0f) {
                    i12 = canvas.save();
                    float f19 = this.k;
                    canvas.scale(f19, f19, centerX, centerY);
                } else {
                    i12 = TLObject.FLAG_31;
                }
                float f20 = i27;
                canvas.drawCircle(centerX, centerY, e2.c.z(1.0f, this.s, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(f20) * f12), paint);
                if (this.c) {
                    b90Var2.setBounds((int) (centerX - (AndroidUtilities.dp(f20) * f12)), (int) (centerY - (AndroidUtilities.dp(f20) * f12)), (int) ((AndroidUtilities.dp(f20) * f12) + centerX), (int) ((AndroidUtilities.dp(f20) * f12) + centerY));
                    b90Var2.draw(canvas);
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
        this.w.onAttachedToWindow();
    }

    public final void f() {
        this.w.onDetachedFromWindow();
    }

    public final void g(int i9, int i10, int i11, int i12) {
        this.p = i9;
        this.t = i10;
        this.u = i11;
        this.v = i12;
    }

    public final void h(String str) {
        String str2;
        if (str != null) {
            Locale locale = Locale.US;
            str2 = e2.c.l(this.x * 2, "_", this.x * 2);
        } else {
            str2 = null;
        }
        this.w.setImage(str, str2, null, null, -1L);
    }

    public final void i(TLRPC.PhotoSize photoSize, TLRPC.Document document, MessageObject messageObject) {
        Locale locale = Locale.US;
        ImageLocation forDocument = ImageLocation.getForDocument(photoSize, document);
        int i9 = this.x;
        this.w.setImage(forDocument, e2.c.l(i9 * 2, "_", i9 * 2), null, null, messageObject, 1);
    }

    public final void j(TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, TLRPC.Document document, Object obj) {
        Locale locale = Locale.US;
        String l10 = e2.c.l(this.x * 2, "_", this.x * 2);
        this.w.setImage(photoSize == null ? null : ImageLocation.getForDocument(photoSize, document), l10, photoSize2 != null ? ImageLocation.getForDocument(photoSize2, document) : null, l10, null, 0L, null, obj, 1);
    }

    public final void k(int i9, boolean z10, boolean z11) {
        if (i9 == 2 || i9 == 3 || i9 == 4) {
            b90 b90Var = this.j;
            if (z10 && i9 == b90Var.q) {
                return;
            }
            b90Var.d(i9, z11);
            boolean z12 = i9 != 4 || b90Var.b() < 1.0f;
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

    public final void m(View view) {
        this.b = view;
        this.w.setParentView(view);
        Objects.requireNonNull(view);
        this.i.A = new wu(view, 13);
        this.j.A = new wu(view, 13);
    }

    public final void n(boolean z10, boolean z11) {
        if (z11) {
            this.z = z10;
        } else {
            this.y = z10;
        }
        d();
    }

    public final void o(float f10, boolean z10) {
        if (this.c) {
            this.j.e(f10, z10);
        } else {
            this.i.e(f10, z10);
        }
    }

    public final void p(int i9) {
        this.d = i9;
    }

    public final void q(int i9, int i10, int i11, int i12) {
        this.a.set(i9, i10, i11, i12);
    }

    public void setAsMini() {
        b90 b90Var = this.i;
        b90Var.j = true;
        b90Var.b.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public void setBackgroundGradientDrawable(LinearGradient linearGradient) {
        b90 b90Var = this.i;
        b90Var.C = linearGradient;
        b90Var.D = new Matrix();
        b90 b90Var2 = this.j;
        b90Var2.C = linearGradient;
        b90Var2.D = new Matrix();
    }

    public void setCircleRadius(int i9) {
        this.x = i9;
        this.w.setRoundRadius(i9);
    }

    public void setColors(int i9, int i10, int i11, int i12) {
        this.l = i9;
        this.m = i10;
        this.n = i11;
        this.o = i12;
        this.p = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
    }

    public void setIcon(int i9, boolean z10, boolean z11) {
        b90 b90Var = this.i;
        if (z10 && i9 == b90Var.q) {
            return;
        }
        b90Var.d(i9, z11);
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
