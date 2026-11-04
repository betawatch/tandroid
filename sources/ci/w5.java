package ci;

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
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.yp;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w5 extends yp {
    public org.telegram.ui.Components.g6 E;
    public final float F;
    public cg.p G;
    public int H;
    public int I;
    public final Paint J;
    public int K;
    public int L;
    public final Path c;
    public final RectF d;
    public final lc e;
    public final int f;
    public final View h;
    public final ImageReceiver n;
    public final org.telegram.ui.Components.e5 r;
    public RadialGradient s;
    public final Matrix w;
    public final ly0 x;
    public final ly0 y;

    public w5(View view, TL_stars.StarGift starGift, int i3, float f10) {
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
        this.J = new Paint(1);
        this.K = org.telegram.messenger.g0.L(16.0f);
        this.L = 0;
        this.h = view;
        this.F = f10;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.n = imageReceiver;
        org.telegram.ui.Components.e5 e5Var = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(i3 > 180 ? 24.0f : 18.0f), view, false);
        this.r = e5Var;
        this.f = i3;
        if (starGift instanceof TL_stars.TL_starGift) {
            float f13 = i3;
            wb.c1(imageReceiver, starGift.sticker, (int) (0.75f * f13));
            String str = starGift.title;
            ly0 ly0Var = new ly0(str == null ? "Gift" : str, 16.0f, org.telegram.messenger.g0.o());
            this.x = ly0Var;
            ly0Var.n(-1);
            float f14 = i3 - 30;
            ly0Var.p(org.telegram.messenger.g0.L(f14));
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            ly0Var.a();
            ly0Var.m(1);
            ly0 ly0Var2 = new ly0(starGift.sold_out ? bd.M0(2131749975, null) : bd.G(starGift.availability_total, "Gift2SoldAuctionPreviewGifts", new Object[0]), 13.0f, null);
            this.y = ly0Var2;
            ly0Var2.p(org.telegram.messenger.g0.L(f14));
            ly0Var2.a();
            ly0Var2.m(1);
            lc lcVar = new lc(1, 40);
            this.e = lcVar;
            float f15 = 0.45f * f13;
            lcVar.f(-org.telegram.messenger.g0.L(f15), -org.telegram.messenger.g0.L(f15), org.telegram.messenger.g0.L(f15), org.telegram.messenger.g0.L(f13 * 0.25f));
            float L = org.telegram.messenger.g0.L(30.0f);
            RectF rectF = lcVar.c;
            int width = (int) rectF.width();
            int height = (int) rectF.height();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            f5.a aVar = Utilities.c;
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
                                        if (a7.h.a(pointF4.x, pointF4.y, pointF3.x, pointF3.y) < f11) {
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
            ArrayList arrayList3 = lcVar.b;
            int size2 = size - arrayList3.size();
            for (int i27 = 0; i27 < size2; i27++) {
                arrayList3.add(new kc(lcVar));
            }
            int size3 = arrayList.size();
            lcVar.j = size3;
            if (lcVar.l != null) {
                e0.e0 e0Var = new e0.e0(size3);
                lcVar.l = e0Var;
                Bitmap bitmap = lcVar.d;
                float width2 = bitmap.getWidth();
                float height2 = bitmap.getHeight();
                int i28 = 0;
                while (i28 < e0Var.b) {
                    int i29 = i28;
                    e0.e0.d((float[]) e0Var.d, i29, 0.0f, 0.0f, width2, height2);
                    i28 = i29 + 1;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            for (int i30 = 0; i30 < lcVar.j; i30++) {
                kc kcVar = (kc) arrayList3.get(i30);
                PointF pointF5 = (PointF) arrayList.get(i30);
                lcVar.c(kcVar, currentTimeMillis, true);
                kcVar.a = pointF5.x + rectF.left;
                kcVar.b = pointF5.y + rectF.top;
                kcVar.h = org.telegram.messenger.g0.T1(0.4f, 1.0f, Utilities.c.nextFloat());
                kcVar.e *= 1.25f;
            }
        } else if (starGift != null) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) e9.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) e9.l(starGift.attributes, TL_stars.starGiftAttributePattern.class);
            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) e9.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
            if (stargiftattributepattern != null) {
                e5Var.i(stargiftattributepattern.document, false);
            }
            if (stargiftattributebackdrop != null) {
                this.s = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.N(i3) / 2.0f, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                e5Var.k(Integer.valueOf(stargiftattributebackdrop.pattern_color | (-16777216)));
            }
            if (stargiftattributemodel != null) {
                wb.c1(imageReceiver, stargiftattributemodel.document, (int) (i3 * 0.75f));
            }
        }
        ((Paint) this.b).setShader(this.s);
        if (view.isAttachedToWindow()) {
            a();
        }
    }

    @Override // org.telegram.ui.Components.yp
    public final void a() {
        this.r.a();
        this.n.P();
        if (this.G != null) {
            int currentTime = ConnectionsManager.getInstance(h10.t0).getCurrentTime();
            int i3 = this.I;
            if (currentTime >= i3) {
                i3 = this.H;
            }
            this.G.a(i3 - currentTime);
        }
    }

    @Override // org.telegram.ui.Components.yp
    public final void b() {
        this.r.b();
        this.n.R();
        cg.p pVar = this.G;
        if (pVar != null) {
            pVar.b();
        }
    }

    public final void c(int i3) {
        ly0 ly0Var = this.y;
        if (ly0Var != null) {
            ly0Var.n(i3 | (-16777216));
        }
    }

    public final void d(int i3, int i10) {
        this.I = i3;
        this.H = i10;
        if (this.G == null) {
            this.G = new cg.p(new a1.c(this, 14));
        }
        this.G.a(ConnectionsManager.getInstance(h10.t0).getCurrentTime() < i3 ? i3 - r0 : i10 - r0);
        if (this.E == null) {
            org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(false, false, false);
            this.E = g6Var;
            g6Var.u(-1);
            this.E.w(org.telegram.messenger.g0.L(12.0f));
            this.E.setCallback(new ah.a(this, 2));
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
        float f10 = this.K;
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
        b1.a(canvas, this.L, this.r, rectF.width(), rectF.height(), 1.0f, this.F);
        lc lcVar = this.e;
        if (lcVar != null) {
            lcVar.b(canvas, -1, 1.0f);
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
            if (this.E != null) {
                Paint paint2 = this.J;
                paint2.setColor(1342177280);
                canvas.drawRoundRect(rectF.left + org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f) + rectF.top, rectF.left + org.telegram.messenger.g0.L(20.0f) + Math.max(this.E.c(), org.telegram.messenger.g0.L(3.0f)), rectF.top + org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(8.5f), org.telegram.messenger.g0.L(8.5f), paint2);
                canvas.save();
                canvas.translate(rectF.left + org.telegram.messenger.g0.L(13.0f), rectF.top + org.telegram.messenger.g0.L(14.0f));
                this.E.draw(canvas);
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

    public final void e(int i3, int i10) {
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.N(this.f) / 2.0f, new int[]{i3 | (-16777216), i10 | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.s = radialGradient;
        ((Paint) this.b).setShader(radialGradient);
    }

    public final void f() {
        this.L = 3;
    }

    public final void g(int i3) {
        this.K = i3;
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
        int currentTime = ConnectionsManager.getInstance(h10.t0).getCurrentTime();
        int i3 = this.H;
        if (currentTime > i3) {
            this.E.t(bd.M0(2131750374, null), true, true);
        } else {
            int i10 = this.I;
            if (currentTime < i10) {
                this.E.t(bd.a0(null, null, 2131750373, org.telegram.messenger.g0.g0(i10 - currentTime, true, false)), true, true);
            } else {
                this.E.t(org.telegram.messenger.g0.g0(i3 - currentTime, true, false), true, true);
            }
        }
        if (currentTime <= this.H || (ly0Var = this.y) == null) {
            return;
        }
        ly0Var.q(bd.M0(2131749975, null));
    }
}
