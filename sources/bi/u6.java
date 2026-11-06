package bi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.Layout;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.p10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ly0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class u6 extends a5.h {
    public org.telegram.ui.Components.i6 D;
    public final float E;
    public bg.q F;
    public int G;
    public int H;
    public final Paint I;
    public int J;
    public int K;
    public final Path c;
    public final RectF d;
    public final ud e;
    public final int f;
    public final View h;
    public final ImageReceiver n;
    public final org.telegram.ui.Components.g5 r;
    public RadialGradient s;
    public final Matrix w;
    public final ly0 x;
    public final ly0 y;

    public u6(View view, TL_stars.StarGift starGift, int i7, float f10) {
        super(view);
        float f11;
        float f12;
        int i10;
        int i11;
        int i12;
        int i13;
        this.c = new Path();
        this.d = new RectF();
        this.w = new Matrix();
        this.I = new Paint(1);
        this.J = org.telegram.messenger.g0.L(16.0f);
        this.K = 0;
        this.h = view;
        this.E = f10;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.n = imageReceiver;
        org.telegram.ui.Components.g5 g5Var = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(i7 > 180 ? 24.0f : 18.0f), view, false);
        this.r = g5Var;
        this.f = i7;
        if (starGift instanceof TL_stars.TL_starGift) {
            float f13 = i7;
            dd.c1(imageReceiver, starGift.sticker, (int) (0.75f * f13));
            String str = starGift.title;
            ly0 ly0Var = new ly0(str == null ? "Gift" : str, 16.0f, org.telegram.messenger.g0.o());
            this.x = ly0Var;
            ly0Var.n(-1);
            float f14 = i7 - 30;
            ly0Var.p(org.telegram.messenger.g0.L(f14));
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            ly0Var.a();
            ly0Var.m(1);
            ly0 ly0Var2 = new ly0(starGift.sold_out ? org.telegram.messenger.hd.M0(2131749966, null) : org.telegram.messenger.hd.G(starGift.availability_total, "Gift2SoldAuctionPreviewGifts", new Object[0]), 13.0f, null);
            this.y = ly0Var2;
            ly0Var2.p(org.telegram.messenger.g0.L(f14));
            ly0Var2.a();
            ly0Var2.m(1);
            ud udVar = new ud(1, 40);
            this.e = udVar;
            float f15 = 0.45f * f13;
            udVar.f(-org.telegram.messenger.g0.L(f15), -org.telegram.messenger.g0.L(f15), org.telegram.messenger.g0.L(f15), org.telegram.messenger.g0.L(f13 * 0.25f));
            float L = org.telegram.messenger.g0.L(30.0f);
            RectF rectF = udVar.c;
            int width = (int) rectF.width();
            int height = (int) rectF.height();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            g5.a aVar = Utilities.c;
            PointF pointF = new PointF(org.telegram.messenger.g0.W1(aVar.nextFloat(), 0, width), org.telegram.messenger.g0.W1(aVar.nextFloat(), 0, height));
            int i14 = 1;
            int i15 = 0;
            float floor = (float) Math.floor(L / Math.sqrt(2));
            int ceil = (int) Math.ceil(width / floor);
            int i16 = ceil + 1;
            int ceil2 = (int) Math.ceil(height / floor);
            int i17 = ceil2 + 1;
            PointF[][] pointFArr = (PointF[][]) Array.newInstance((Class<?>) PointF.class, i16, i17);
            for (int i18 = 0; i18 < i16; i18++) {
                for (int i19 = 0; i19 < i17; i19++) {
                    pointFArr[i18][i19] = null;
                }
            }
            pointFArr[(int) Math.floor(pointF.x / floor)][(int) Math.floor(pointF.y / floor)] = pointF;
            arrayList.add(pointF);
            arrayList2.add(pointF);
            while (!arrayList2.isEmpty()) {
                int i20 = i14;
                int nextInt = arrayList2.size() > i20 ? Utilities.c.nextInt(arrayList2.size() - i20) : i15;
                PointF pointF2 = (PointF) arrayList2.get(nextInt);
                int i21 = i15;
                while (true) {
                    if (i21 >= 15) {
                        f11 = L;
                        f12 = floor;
                        i10 = ceil;
                        i11 = width;
                        arrayList2.remove(nextInt);
                        break;
                    }
                    f11 = L;
                    f12 = floor;
                    int i22 = i21;
                    double W1 = org.telegram.messenger.g0.W1(r14.nextFloat(), 1, 2) * f11;
                    double W12 = org.telegram.messenger.g0.W1(Utilities.c.nextFloat(), i15, 360);
                    PointF pointF3 = new PointF((float) ((Math.cos(Math.toRadians(W12)) * W1) + pointF2.x), (float) ((Math.sin(Math.toRadians(W12)) * W1) + pointF2.y));
                    int L2 = org.telegram.messenger.g0.L(15.0f) / 2;
                    float f16 = pointF3.x;
                    float f17 = L2;
                    if (f16 >= f17 && f16 < width - L2) {
                        float f18 = pointF3.y;
                        if (f18 >= f17 && f18 < height - L2) {
                            int floor2 = (int) Math.floor(f16 / f12);
                            int floor3 = (int) Math.floor(pointF3.y / f12);
                            int max = Math.max(floor2 - 1, 0);
                            int min = Math.min(floor2 + 1, ceil);
                            int max2 = Math.max(floor3 - 1, 0);
                            int min2 = Math.min(floor3 + 1, ceil2);
                            while (max <= min) {
                                int i23 = min;
                                int i24 = max2;
                                while (i24 <= min2) {
                                    int i25 = i24;
                                    PointF pointF4 = pointFArr[max][i25];
                                    int i26 = max2;
                                    if (pointF4 != null) {
                                        i12 = ceil;
                                        i13 = width;
                                        if (a8.r9.a(pointF4.x, pointF4.y, pointF3.x, pointF3.y) < f11) {
                                            break;
                                        }
                                    } else {
                                        i12 = ceil;
                                        i13 = width;
                                    }
                                    i24 = i25 + 1;
                                    max2 = i26;
                                    ceil = i12;
                                    width = i13;
                                }
                                max++;
                                min = i23;
                            }
                            i10 = ceil;
                            i11 = width;
                            arrayList.add(pointF3);
                            pointFArr[(int) Math.floor(pointF3.x / f12)][(int) Math.floor(pointF3.y / f12)] = pointF3;
                            arrayList2.add(pointF3);
                            break;
                        }
                    }
                    i12 = ceil;
                    i13 = width;
                    i21 = i22 + 1;
                    floor = f12;
                    L = f11;
                    ceil = i12;
                    width = i13;
                    i15 = 0;
                }
                floor = f12;
                L = f11;
                ceil = i10;
                width = i11;
                i14 = 1;
                i15 = 0;
            }
            int size = arrayList.size();
            ArrayList arrayList3 = udVar.b;
            int size2 = size - arrayList3.size();
            for (int i27 = 0; i27 < size2; i27++) {
                arrayList3.add(new td(udVar));
            }
            int size3 = arrayList.size();
            udVar.j = size3;
            if (udVar.l != null) {
                a4.k kVar = new a4.k(size3);
                udVar.l = kVar;
                Bitmap bitmap = udVar.d;
                float width2 = bitmap.getWidth();
                float height2 = bitmap.getHeight();
                int i28 = 0;
                while (i28 < kVar.b) {
                    int i29 = i28;
                    a4.k.d((float[]) kVar.d, i29, 0.0f, 0.0f, width2, height2);
                    i28 = i29 + 1;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            for (int i30 = 0; i30 < udVar.j; i30++) {
                td tdVar = (td) arrayList3.get(i30);
                PointF pointF5 = (PointF) arrayList.get(i30);
                udVar.c(tdVar, currentTimeMillis, true);
                tdVar.a = pointF5.x + rectF.left;
                tdVar.b = pointF5.y + rectF.top;
                tdVar.h = org.telegram.messenger.g0.T1(0.4f, 1.0f, Utilities.c.nextFloat());
                tdVar.e *= 1.25f;
            }
        } else if (starGift != null) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) ea.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) ea.l(starGift.attributes, TL_stars.starGiftAttributePattern.class);
            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) ea.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
            if (stargiftattributepattern != null) {
                g5Var.i(stargiftattributepattern.document, false);
            }
            if (stargiftattributebackdrop != null) {
                this.s = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.N(i7) / 2.0f, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                g5Var.k(Integer.valueOf(stargiftattributebackdrop.pattern_color | (-16777216)));
            }
            if (stargiftattributemodel != null) {
                dd.c1(imageReceiver, stargiftattributemodel.document, (int) (i7 * 0.75f));
            }
        }
        ((Paint) this.b).setShader(this.s);
        if (view.isAttachedToWindow()) {
            a();
        }
    }

    @Override // a5.h
    public final void a() {
        this.r.a();
        this.n.P();
        if (this.F != null) {
            int currentTime = ConnectionsManager.getInstance(p10.s0).getCurrentTime();
            int i7 = this.H;
            if (currentTime >= i7) {
                i7 = this.G;
            }
            this.F.a(i7 - currentTime);
        }
    }

    @Override // a5.h
    public final void b() {
        this.r.b();
        this.n.R();
        bg.q qVar = this.F;
        if (qVar != null) {
            qVar.b();
        }
    }

    public final void c(int i7) {
        ly0 ly0Var = this.y;
        if (ly0Var != null) {
            ly0Var.n(i7 | (-16777216));
        }
    }

    public final void d(int i7, int i10) {
        this.H = i7;
        this.G = i10;
        if (this.F == null) {
            this.F = new bg.q(new a1.c(this, 13));
        }
        this.F.a(ConnectionsManager.getInstance(p10.s0).getCurrentTime() < i7 ? i7 - r0 : i10 - r0);
        if (this.D == null) {
            org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, false, false);
            this.D = i6Var;
            i6Var.u(-1);
            this.D.w(org.telegram.messenger.g0.L(12.0f));
            this.D.setCallback(new a5.b(this, 1));
        }
        h();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ly0 ly0Var;
        Paint paint = (Paint) this.b;
        Rect bounds = getBounds();
        RectF rectF = this.d;
        rectF.set(bounds);
        canvas.save();
        Path path = this.c;
        path.rewind();
        float f10 = this.J;
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.clipPath(path);
        if (this.s != null) {
            Matrix matrix = this.w;
            matrix.reset();
            matrix.postTranslate(rectF.centerX(), rectF.centerY());
            this.s.setLocalMatrix(matrix);
            paint.setShader(this.s);
        }
        canvas.drawPaint(paint);
        canvas.save();
        canvas.translate(rectF.centerX(), rectF.centerY());
        i1.a(canvas, this.K, this.r, rectF.width(), rectF.height(), 1.0f, this.E);
        ud udVar = this.e;
        if (udVar != null) {
            udVar.b(canvas, -1, 1.0f);
        }
        canvas.restore();
        ly0 ly0Var2 = this.x;
        ImageReceiver imageReceiver = this.n;
        if (ly0Var2 == null || (ly0Var = this.y) == null) {
            float min = Math.min(rectF.width(), rectF.height()) * 0.75f;
            float f11 = min / 2.0f;
            imageReceiver.y0(rectF.centerX() - f11, rectF.centerY() - f11, min, min);
            imageReceiver.h(canvas, null);
        } else {
            if (this.D != null) {
                Paint paint2 = this.I;
                paint2.setColor(1342177280);
                canvas.drawRoundRect(rectF.left + org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f) + rectF.top, rectF.left + org.telegram.messenger.g0.L(20.0f) + Math.max(this.D.c(), org.telegram.messenger.g0.L(3.0f)), rectF.top + org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(8.5f), org.telegram.messenger.g0.L(8.5f), paint2);
                canvas.save();
                canvas.translate(rectF.left + org.telegram.messenger.g0.L(13.0f), rectF.top + org.telegram.messenger.g0.L(14.0f));
                this.D.draw(canvas);
                canvas.restore();
            }
            float min2 = Math.min(rectF.width(), rectF.height()) * 0.6f;
            imageReceiver.y0(rectF.centerX() - (min2 / 2.0f), (rectF.height() * 0.12f) + rectF.top, min2, min2);
            imageReceiver.h(canvas, null);
            ly0Var2.e(canvas, rectF.centerX() - (ly0Var2.k() / 2.0f), rectF.bottom - org.telegram.messenger.g0.L(50.0f));
            ly0Var.e(canvas, rectF.centerX() - (ly0Var.k() / 2.0f), rectF.bottom - org.telegram.messenger.g0.L(30.0f));
        }
        canvas.restore();
    }

    public final void e(int i7, int i10) {
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.N(this.f) / 2.0f, new int[]{i7 | (-16777216), i10 | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.s = radialGradient;
        ((Paint) this.b).setShader(radialGradient);
    }

    public final void f() {
        this.K = 3;
    }

    public final void g(int i7) {
        this.J = i7;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(this.f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(this.f);
    }

    public final void h() {
        ly0 ly0Var;
        int currentTime = ConnectionsManager.getInstance(p10.s0).getCurrentTime();
        int i7 = this.G;
        if (currentTime > i7) {
            this.D.t(org.telegram.messenger.hd.M0(2131750365, null), true, true);
        } else {
            int i10 = this.H;
            if (currentTime < i10) {
                this.D.t(org.telegram.messenger.hd.a0(null, null, 2131750364, org.telegram.messenger.g0.g0(i10 - currentTime, true, false)), true, true);
            } else {
                this.D.t(org.telegram.messenger.g0.g0(i7 - currentTime, true, false), true, true);
            }
        }
        if (currentTime <= this.G || (ly0Var = this.y) == null) {
            return;
        }
        ly0Var.q(org.telegram.messenger.hd.M0(2131749966, null));
    }
}
