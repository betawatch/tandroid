package mh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.rq;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class t4 extends rq {
    public final Path b;
    public final RectF c;
    public final wa d;
    public final int e;
    public final View f;
    public final ImageReceiver g;
    public final org.telegram.ui.Components.j5 h;
    public RadialGradient i;
    public final Matrix j;
    public final k01 k;
    public final k01 l;
    public org.telegram.ui.Components.j6 m;
    public final float n;
    public lf.p o;
    public int p;
    public int q;
    public final Paint r;
    public int s;
    public int t;

    public t4(View view, TL_stars.StarGift starGift, int i10, float f10) {
        super(view);
        float f11;
        float f12;
        int i11;
        int i12;
        int i13;
        int i14;
        this.b = new Path();
        this.c = new RectF();
        this.j = new Matrix();
        this.r = new Paint(1);
        this.s = AndroidUtilities.dp(16.0f);
        this.t = 0;
        this.f = view;
        this.n = f10;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.g = imageReceiver;
        org.telegram.ui.Components.j5 j5Var = new org.telegram.ui.Components.j5(view, AndroidUtilities.dp(i10 > 180 ? 24.0f : 18.0f), false);
        this.h = j5Var;
        this.e = i10;
        if (starGift instanceof TL_stars.TL_starGift) {
            float f13 = i10;
            ja.Z0(imageReceiver, starGift.sticker, (int) (0.75f * f13));
            String str = starGift.title;
            k01 k01Var = new k01(str == null ? "Gift" : str, 16.0f, AndroidUtilities.bold());
            this.k = k01Var;
            k01Var.o(-1);
            float f14 = i10 - 30;
            k01Var.q(AndroidUtilities.dp(f14));
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            k01Var.a();
            k01Var.n(1);
            k01 k01Var2 = new k01(starGift.sold_out ? LocaleController.getString(R.string.Gift2SoldOutTitle) : LocaleController.formatPluralString("Gift2SoldAuctionPreviewGifts", starGift.availability_total, new Object[0]), 13.0f, null);
            this.l = k01Var2;
            k01Var2.q(AndroidUtilities.dp(f14));
            k01Var2.a();
            k01Var2.n(1);
            wa waVar = new wa(1, 40);
            this.d = waVar;
            float f15 = 0.45f * f13;
            waVar.f(-AndroidUtilities.dp(f15), -AndroidUtilities.dp(f15), AndroidUtilities.dp(f15), AndroidUtilities.dp(f13 * 0.25f));
            float dp = AndroidUtilities.dp(30.0f);
            RectF rectF = waVar.c;
            int width = (int) rectF.width();
            int height = (int) rectF.height();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            PointF pointF = new PointF(AndroidUtilities.lerp(0, width, Utilities.fastRandom.nextFloat()), AndroidUtilities.lerp(0, height, Utilities.fastRandom.nextFloat()));
            float floor = (float) Math.floor(dp / Math.sqrt(2));
            int ceil = (int) Math.ceil(width / floor);
            int i15 = ceil + 1;
            int ceil2 = (int) Math.ceil(height / floor);
            int i16 = ceil2 + 1;
            PointF[][] pointFArr = (PointF[][]) Array.newInstance((Class<?>) PointF.class, i15, i16);
            for (int i17 = 0; i17 < i15; i17++) {
                for (int i18 = 0; i18 < i16; i18++) {
                    pointFArr[i17][i18] = null;
                }
            }
            pointFArr[(int) Math.floor(pointF.x / floor)][(int) Math.floor(pointF.y / floor)] = pointF;
            arrayList.add(pointF);
            arrayList2.add(pointF);
            while (!arrayList2.isEmpty()) {
                int nextInt = arrayList2.size() > 1 ? Utilities.fastRandom.nextInt(arrayList2.size() - 1) : 0;
                PointF pointF2 = (PointF) arrayList2.get(nextInt);
                int i19 = 0;
                while (true) {
                    if (i19 >= 15) {
                        f11 = dp;
                        f12 = floor;
                        i11 = ceil;
                        i12 = width;
                        arrayList2.remove(nextInt);
                        break;
                    }
                    f11 = dp;
                    f12 = floor;
                    int i20 = i19;
                    double lerp = AndroidUtilities.lerp(1, 2, Utilities.fastRandom.nextFloat()) * f11;
                    double lerp2 = AndroidUtilities.lerp(0, 360, Utilities.fastRandom.nextFloat());
                    PointF pointF3 = new PointF((float) ((Math.cos(Math.toRadians(lerp2)) * lerp) + pointF2.x), (float) ((Math.sin(Math.toRadians(lerp2)) * lerp) + pointF2.y));
                    int dp2 = AndroidUtilities.dp(15.0f) / 2;
                    float f16 = pointF3.x;
                    float f17 = dp2;
                    if (f16 >= f17 && f16 < width - dp2) {
                        float f18 = pointF3.y;
                        if (f18 >= f17 && f18 < height - dp2) {
                            int floor2 = (int) Math.floor(f16 / f12);
                            int floor3 = (int) Math.floor(pointF3.y / f12);
                            int max = Math.max(floor2 - 1, 0);
                            int min = Math.min(floor2 + 1, ceil);
                            int max2 = Math.max(floor3 - 1, 0);
                            int min2 = Math.min(floor3 + 1, ceil2);
                            while (max <= min) {
                                int i21 = min;
                                int i22 = max2;
                                while (i22 <= min2) {
                                    int i23 = i22;
                                    PointF pointF4 = pointFArr[max][i23];
                                    int i24 = max2;
                                    if (pointF4 != null) {
                                        i13 = ceil;
                                        i14 = width;
                                        if (k7.o6.a(pointF4.x, pointF4.y, pointF3.x, pointF3.y) < f11) {
                                            break;
                                        }
                                    } else {
                                        i13 = ceil;
                                        i14 = width;
                                    }
                                    i22 = i23 + 1;
                                    max2 = i24;
                                    ceil = i13;
                                    width = i14;
                                }
                                max++;
                                min = i21;
                            }
                            i11 = ceil;
                            i12 = width;
                            arrayList.add(pointF3);
                            pointFArr[(int) Math.floor(pointF3.x / f12)][(int) Math.floor(pointF3.y / f12)] = pointF3;
                            arrayList2.add(pointF3);
                            break;
                        }
                    }
                    i13 = ceil;
                    i14 = width;
                    i19 = i20 + 1;
                    floor = f12;
                    dp = f11;
                    ceil = i13;
                    width = i14;
                }
                floor = f12;
                dp = f11;
                ceil = i11;
                width = i12;
            }
            int size = arrayList.size();
            ArrayList arrayList3 = waVar.b;
            int size2 = size - arrayList3.size();
            for (int i25 = 0; i25 < size2; i25++) {
                arrayList3.add(new va(waVar));
            }
            int size3 = arrayList.size();
            waVar.j = size3;
            if (waVar.l != null) {
                a4.k kVar = new a4.k(size3);
                waVar.l = kVar;
                Bitmap bitmap = waVar.d;
                float width2 = bitmap.getWidth();
                float height2 = bitmap.getHeight();
                int i26 = 0;
                while (i26 < kVar.a) {
                    int i27 = i26;
                    a4.k.b((float[]) kVar.c, i27, 0.0f, 0.0f, width2, height2);
                    i26 = i27 + 1;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            for (int i28 = 0; i28 < waVar.j; i28++) {
                va vaVar = (va) arrayList3.get(i28);
                PointF pointF5 = (PointF) arrayList.get(i28);
                waVar.c(vaVar, currentTimeMillis, true);
                vaVar.a = pointF5.x + rectF.left;
                vaVar.b = pointF5.y + rectF.top;
                vaVar.h = AndroidUtilities.lerp(0.4f, 1.0f, Utilities.fastRandom.nextFloat());
                vaVar.e *= 1.25f;
            }
        } else if (starGift != null) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) t7.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) t7.l(starGift.attributes, TL_stars.starGiftAttributePattern.class);
            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) t7.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
            if (stargiftattributepattern != null) {
                j5Var.i(stargiftattributepattern.document, false);
            }
            if (stargiftattributebackdrop != null) {
                this.i = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dpf2(i10) / 2.0f, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                j5Var.k(Integer.valueOf(stargiftattributebackdrop.pattern_color | (-16777216)));
            }
            if (stargiftattributemodel != null) {
                ja.Z0(imageReceiver, stargiftattributemodel.document, (int) (i10 * 0.75f));
            }
        }
        this.a.setShader(this.i);
        if (view.isAttachedToWindow()) {
            a();
        }
    }

    @Override // org.telegram.ui.Components.rq
    public final void a() {
        this.h.a();
        this.g.onAttachedToWindow();
        if (this.o != null) {
            int currentTime = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
            int i10 = this.q;
            if (currentTime >= i10) {
                i10 = this.p;
            }
            this.o.a(i10 - currentTime);
        }
    }

    @Override // org.telegram.ui.Components.rq
    public final void b() {
        this.h.b();
        this.g.onDetachedFromWindow();
        lf.p pVar = this.o;
        if (pVar != null) {
            pVar.b();
        }
    }

    public final void c(int i10) {
        k01 k01Var = this.l;
        if (k01Var != null) {
            k01Var.o(i10 | (-16777216));
        }
    }

    public final void d(int i10, int i11) {
        this.q = i10;
        this.p = i11;
        if (this.o == null) {
            this.o = new lf.p(new hg.f(this, 28));
        }
        this.o.a(ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime() < i10 ? i10 - r0 : i11 - r0);
        if (this.m == null) {
            org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(false, false, false, false);
            this.m = j6Var;
            j6Var.r(-1);
            this.m.t(AndroidUtilities.dp(12.0f));
            this.m.setCallback(new i.f(this, 4));
        }
        h();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        k01 k01Var;
        Rect bounds = getBounds();
        RectF rectF = this.c;
        rectF.set(bounds);
        canvas.save();
        Path path = this.b;
        path.rewind();
        float f10 = this.s;
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.clipPath(path);
        RadialGradient radialGradient = this.i;
        Paint paint = this.a;
        if (radialGradient != null) {
            Matrix matrix = this.j;
            matrix.reset();
            matrix.postTranslate(rectF.centerX(), rectF.centerY());
            this.i.setLocalMatrix(matrix);
            paint.setShader(this.i);
        }
        canvas.drawPaint(paint);
        canvas.save();
        canvas.translate(rectF.centerX(), rectF.centerY());
        w0.a(canvas, this.t, this.h, rectF.width(), rectF.height(), 1.0f, this.n);
        wa waVar = this.d;
        if (waVar != null) {
            waVar.b(canvas, -1, 1.0f);
        }
        canvas.restore();
        k01 k01Var2 = this.k;
        ImageReceiver imageReceiver = this.g;
        if (k01Var2 == null || (k01Var = this.l) == null) {
            float min = Math.min(rectF.width(), rectF.height()) * 0.75f;
            float f11 = min / 2.0f;
            imageReceiver.setImageCoords(rectF.centerX() - f11, rectF.centerY() - f11, min, min);
            imageReceiver.draw(canvas);
        } else {
            if (this.m != null) {
                Paint paint2 = this.r;
                paint2.setColor(1342177280);
                canvas.drawRoundRect(rectF.left + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f) + rectF.top, rectF.left + AndroidUtilities.dp(20.0f) + Math.max(this.m.d(), AndroidUtilities.dp(3.0f)), rectF.top + AndroidUtilities.dp(23.0f), AndroidUtilities.dp(8.5f), AndroidUtilities.dp(8.5f), paint2);
                canvas.save();
                canvas.translate(rectF.left + AndroidUtilities.dp(13.0f), rectF.top + AndroidUtilities.dp(14.0f));
                this.m.draw(canvas);
                canvas.restore();
            }
            float min2 = Math.min(rectF.width(), rectF.height()) * 0.6f;
            imageReceiver.setImageCoords(rectF.centerX() - (min2 / 2.0f), (rectF.height() * 0.12f) + rectF.top, min2, min2);
            imageReceiver.draw(canvas);
            k01Var2.e(canvas, rectF.centerX() - (k01Var2.l() / 2.0f), rectF.bottom - AndroidUtilities.dp(50.0f));
            k01Var.e(canvas, rectF.centerX() - (k01Var.l() / 2.0f), rectF.bottom - AndroidUtilities.dp(30.0f));
        }
        canvas.restore();
    }

    public final void e(int i10, int i11) {
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dpf2(this.e) / 2.0f, new int[]{i10 | (-16777216), i11 | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.i = radialGradient;
        this.a.setShader(radialGradient);
    }

    public final void f() {
        this.t = 3;
    }

    public final void g(int i10) {
        this.s = i10;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(this.e);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(this.e);
    }

    public final void h() {
        k01 k01Var;
        int currentTime = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
        int i10 = this.p;
        if (currentTime > i10) {
            this.m.q(LocaleController.getString(R.string.Gift2AuctionCountdownFinished), true, true);
        } else {
            int i11 = this.q;
            if (currentTime < i11) {
                this.m.q(LocaleController.formatString(R.string.Gift2AuctionCountdownStartsIn, AndroidUtilities.formatDuration(i11 - currentTime, true)), true, true);
            } else {
                this.m.q(AndroidUtilities.formatDuration(i10 - currentTime, true), true, true);
            }
        }
        if (currentTime <= this.p || (k01Var = this.l) == null) {
            return;
        }
        k01Var.r(LocaleController.getString(R.string.Gift2SoldOutTitle));
    }
}
