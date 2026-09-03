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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
    public final v90 i;
    public final v90 j;
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
        v90 v90Var = new v90();
        this.i = v90Var;
        v90 v90Var2 = new v90();
        this.j = v90Var2;
        v90Var2.j = true;
        v90Var2.b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        v90Var2.d(4, false);
        int dp = AndroidUtilities.dp(22.0f);
        this.x = dp;
        imageReceiver.setRoundRadius(dp);
        paint.setColor(1677721600);
        if (view != null) {
            v90Var.A = new ev(view, 13);
            v90Var2.A = new ev(view, 13);
        }
    }

    public final int a() {
        return this.i.q;
    }

    public final float b() {
        v90 v90Var = this.i;
        int i10 = v90Var.q;
        int i11 = v90Var.p;
        if ((i10 == 3 || i10 == 6 || i10 == 10 || i10 == 8 || i10 == 0) && i11 == 4) {
            return v90Var.b();
        }
        if (i10 != 4) {
            return 1.0f;
        }
        return 1.0f - v90Var.b();
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
        float f10;
        Paint paint;
        float f11;
        int i11;
        float centerX;
        float centerY;
        int i12;
        float f12;
        int i13;
        Canvas canvas2;
        Canvas canvas3;
        Canvas canvas4;
        int argb;
        v90 v90Var = this.i;
        int i14 = v90Var.q;
        Paint paint2 = v90Var.c;
        if (i14 != 4 || v90Var.b() < 1.0f) {
            RectF rectF = this.a;
            if (rectF.isEmpty()) {
                return;
            }
            int i15 = v90Var.q;
            float b10 = b();
            boolean z4 = this.z;
            v90 v90Var2 = this.j;
            Paint paint3 = this.h;
            if (!z4 || this.q >= 0) {
                int i16 = this.u;
                if (i16 >= 0) {
                    v90Var2.c(org.telegram.ui.ActionBar.j6.v0(i16, this.F));
                } else {
                    v90Var2.c(this.n);
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
                    v90Var2.c(org.telegram.ui.ActionBar.j6.v0(i18, this.F));
                } else {
                    v90Var2.c(this.o);
                }
                int i19 = this.t;
                if (i19 >= 0) {
                    paint3.setColor(org.telegram.ui.ActionBar.j6.v0(i19, this.F));
                } else {
                    paint3.setColor(this.m);
                }
            }
            boolean z10 = this.y;
            Paint paint4 = this.g;
            if (z10) {
                int i20 = this.v;
                if (i20 >= 0) {
                    i10 = org.telegram.ui.ActionBar.j6.v0(i20, this.F);
                    v90Var.c(i10);
                    paint2.setColor((-16777216) | org.telegram.ui.ActionBar.j6.v0(this.t, this.F));
                } else {
                    i10 = this.o;
                    v90Var.c(i10);
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
                    v90Var.c(i10);
                    paint2.setColor((-16777216) | org.telegram.ui.ActionBar.j6.v0(this.p, this.F));
                } else {
                    i10 = this.n;
                    v90Var.c(i10);
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
            boolean z11 = true;
            Paint paint5 = this.f;
            int i24 = 2;
            if (hasBitmapImage) {
                float currentAlpha = imageReceiver.getCurrentAlpha();
                paint5.setAlpha((int) (this.E * 100.0f * currentAlpha * b10));
                if (currentAlpha >= 1.0f) {
                    argb = -1;
                    f10 = b10;
                    paint = paint3;
                    z11 = false;
                    f11 = 1.0f;
                } else {
                    int red = Color.red(i10);
                    f11 = 1.0f;
                    int green = Color.green(i10);
                    f10 = b10;
                    int blue = Color.blue(i10);
                    paint = paint3;
                    argb = Color.argb(Color.alpha(i10) + ((int) ((255 - r9) * currentAlpha)), red + ((int) ((255 - red) * currentAlpha)), green + ((int) ((255 - green) * currentAlpha)), blue + ((int) ((255 - blue) * currentAlpha)));
                }
                v90Var.c(argb);
                int i25 = this.x;
                float f13 = ceil - i25;
                float f14 = ceil2 - i25;
                float f15 = i25 * 2;
                imageReceiver.setImageCoords(f13, f14, f15, f15);
            } else {
                f10 = b10;
                paint = paint3;
                f11 = 1.0f;
            }
            Canvas canvas5 = this.D;
            if (canvas5 == null || this.q < 0 || this.s == f11) {
                i11 = TLObject.FLAG_31;
            } else {
                i11 = canvas5.save();
                float c3 = org.telegram.ui.ai.c(1.0f, this.s, 0.1f, 1.0f);
                this.D.scale(c3, c3, ceil, ceil2);
            }
            if (z11 && this.B) {
                if ((this.c || this.q >= 0) && (canvas4 = this.D) != null) {
                    canvas4.drawCircle(ceil, ceil2, this.x, paint4);
                } else if (i15 != 4 || f10 != 0.0f) {
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
            int i26 = this.x;
            int i27 = this.G;
            if (i27 > 0 && i26 > i27) {
                i26 = i27;
            }
            if (this.I != 1.0f) {
                canvas.save();
                float f16 = this.I;
                canvas.scale(f16, f16, ceil, ceil2);
            }
            v90Var.setBounds(ceil - i26, ceil2 - i26, ceil + i26, ceil2 + i26);
            v90Var.E = imageReceiver.hasBitmapImage();
            if (this.c || this.q >= 0) {
                Canvas canvas6 = this.D;
                if (canvas6 != null) {
                    v90Var.draw(canvas6);
                } else {
                    v90Var.draw(canvas);
                }
            } else {
                v90Var.o = this.E;
                v90Var.draw(canvas);
            }
            if (i11 != Integer.MIN_VALUE && (canvas2 = this.D) != null) {
                canvas2.restoreToCount(i11);
            }
            if (this.c || this.q >= 0) {
                if (Math.abs(rectF.width() - AndroidUtilities.dp(44.0f)) < AndroidUtilities.density) {
                    float f17 = 16;
                    centerX = rectF.centerX() + AndroidUtilities.dp(f17);
                    centerY = rectF.centerY() + AndroidUtilities.dp(f17);
                    i12 = 20;
                    i24 = 0;
                } else {
                    centerX = rectF.centerX() + AndroidUtilities.dp(18.0f);
                    centerY = rectF.centerY() + AndroidUtilities.dp(18.0f);
                    i12 = 22;
                }
                int i28 = i12 / 2;
                if (this.c) {
                    float b11 = v90Var2.q != 4 ? 1.0f : 1.0f - v90Var2.b();
                    if (b11 == 0.0f) {
                        this.c = false;
                    }
                    f12 = b11;
                } else {
                    f12 = 1.0f;
                }
                Canvas canvas7 = this.D;
                if (canvas7 != null) {
                    float f18 = i12 + 18 + i24;
                    canvas7.drawCircle(AndroidUtilities.dp(f18), AndroidUtilities.dp(f18), AndroidUtilities.dp(i28 + 1) * f12 * this.k, org.telegram.ui.ActionBar.j6.n0);
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
                    float f19 = this.k;
                    canvas.scale(f19, f19, centerX, centerY);
                } else {
                    i13 = TLObject.FLAG_31;
                }
                float f20 = i28;
                canvas.drawCircle(centerX, centerY, e2.c.w(1.0f, this.s, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(f20) * f12), paint);
                if (this.c) {
                    v90Var2.setBounds((int) (centerX - (AndroidUtilities.dp(f20) * f12)), (int) (centerY - (AndroidUtilities.dp(f20) * f12)), (int) ((AndroidUtilities.dp(f20) * f12) + centerX), (int) ((AndroidUtilities.dp(f20) * f12) + centerY));
                    v90Var2.draw(canvas);
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
            str2 = e2.c.h(this.x * 2, "_", this.x * 2);
        } else {
            str2 = null;
        }
        this.w.setImage(str, str2, null, null, -1L);
    }

    public final void i(TLRPC.PhotoSize photoSize, TLRPC.Document document, MessageObject messageObject) {
        Locale locale = Locale.US;
        ImageLocation forDocument = ImageLocation.getForDocument(photoSize, document);
        int i10 = this.x;
        this.w.setImage(forDocument, e2.c.h(i10 * 2, "_", i10 * 2), null, null, messageObject, 1);
    }

    public final void j(TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, TLRPC.Document document, Object obj) {
        Locale locale = Locale.US;
        String h = e2.c.h(this.x * 2, "_", this.x * 2);
        this.w.setImage(photoSize == null ? null : ImageLocation.getForDocument(photoSize, document), h, photoSize2 != null ? ImageLocation.getForDocument(photoSize2, document) : null, h, null, 0L, null, obj, 1);
    }

    public final void k(int i10, boolean z4, boolean z10) {
        if (i10 == 2 || i10 == 3 || i10 == 4) {
            v90 v90Var = this.j;
            if (z4 && i10 == v90Var.q) {
                return;
            }
            v90Var.d(i10, z10);
            boolean z11 = i10 != 4 || v90Var.b() < 1.0f;
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

    public final void m(View view) {
        this.b = view;
        this.w.setParentView(view);
        Objects.requireNonNull(view);
        this.i.A = new ev(view, 13);
        this.j.A = new ev(view, 13);
    }

    public final void n(boolean z4, boolean z10) {
        if (z10) {
            this.z = z4;
        } else {
            this.y = z4;
        }
        d();
    }

    public final void o(float f10, boolean z4) {
        if (this.c) {
            this.j.e(f10, z4);
        } else {
            this.i.e(f10, z4);
        }
    }

    public final void p(int i10) {
        this.d = i10;
    }

    public final void q(int i10, int i11, int i12, int i13) {
        this.a.set(i10, i11, i12, i13);
    }

    public void setAsMini() {
        v90 v90Var = this.i;
        v90Var.j = true;
        v90Var.b.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public void setBackgroundGradientDrawable(LinearGradient linearGradient) {
        v90 v90Var = this.i;
        v90Var.C = linearGradient;
        v90Var.D = new Matrix();
        v90 v90Var2 = this.j;
        v90Var2.C = linearGradient;
        v90Var2.D = new Matrix();
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

    public void setIcon(int i10, boolean z4, boolean z10) {
        v90 v90Var = this.i;
        if (z4 && i10 == v90Var.q) {
            return;
        }
        v90Var.d(i10, z10);
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
