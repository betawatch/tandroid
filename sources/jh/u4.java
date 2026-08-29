package jh;

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
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.zz0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class u4 extends lq {
    public final Path b;
    public final RectF c;
    public final va d;
    public final int e;
    public final View f;
    public final ImageReceiver g;
    public final org.telegram.ui.Components.n5 h;
    public RadialGradient i;
    public final Matrix j;
    public final zz0 k;
    public final zz0 l;
    public org.telegram.ui.Components.n6 m;
    public final float n;
    public jf.p o;
    public int p;
    public int q;
    public final Paint r;
    public int s;
    public int t;

    public u4(View view, TL_stars.StarGift starGift, int i10, float f9) {
        super(view);
        float f10;
        float f11;
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
        this.n = f9;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.g = imageReceiver;
        org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(view, AndroidUtilities.dp(i10 > 180 ? 24.0f : 18.0f), false);
        this.h = n5Var;
        this.e = i10;
        if (starGift instanceof TL_stars.TL_starGift) {
            float f12 = i10;
            ia.Z0(imageReceiver, starGift.sticker, (int) (0.75f * f12));
            String str = starGift.title;
            zz0 zz0Var = new zz0(str == null ? "Gift" : str, 16.0f, AndroidUtilities.bold());
            this.k = zz0Var;
            zz0Var.o(-1);
            float f13 = i10 - 30;
            zz0Var.q(AndroidUtilities.dp(f13));
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            zz0Var.a();
            zz0Var.n(1);
            zz0 zz0Var2 = new zz0(starGift.sold_out ? LocaleController.getString(R.string.Gift2SoldOutTitle) : LocaleController.formatPluralString("Gift2SoldAuctionPreviewGifts", starGift.availability_total, new Object[0]), 13.0f, null);
            this.l = zz0Var2;
            zz0Var2.q(AndroidUtilities.dp(f13));
            zz0Var2.a();
            zz0Var2.n(1);
            va vaVar = new va(1, 40);
            this.d = vaVar;
            float f14 = 0.45f * f12;
            vaVar.f(-AndroidUtilities.dp(f14), -AndroidUtilities.dp(f14), AndroidUtilities.dp(f14), AndroidUtilities.dp(f12 * 0.25f));
            float dp = AndroidUtilities.dp(30.0f);
            RectF rectF = vaVar.c;
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
                        f10 = dp;
                        f11 = floor;
                        i11 = ceil;
                        i12 = width;
                        arrayList2.remove(nextInt);
                        break;
                    }
                    f10 = dp;
                    f11 = floor;
                    int i20 = i19;
                    double lerp = AndroidUtilities.lerp(1, 2, Utilities.fastRandom.nextFloat()) * f10;
                    double lerp2 = AndroidUtilities.lerp(0, 360, Utilities.fastRandom.nextFloat());
                    PointF pointF3 = new PointF((float) ((Math.cos(Math.toRadians(lerp2)) * lerp) + pointF2.x), (float) ((Math.sin(Math.toRadians(lerp2)) * lerp) + pointF2.y));
                    int dp2 = AndroidUtilities.dp(15.0f) / 2;
                    float f15 = pointF3.x;
                    float f16 = dp2;
                    if (f15 >= f16 && f15 < width - dp2) {
                        float f17 = pointF3.y;
                        if (f17 >= f16 && f17 < height - dp2) {
                            int floor2 = (int) Math.floor(f15 / f11);
                            int floor3 = (int) Math.floor(pointF3.y / f11);
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
                                        if (i7.z5.a(pointF4.x, pointF4.y, pointF3.x, pointF3.y) < f10) {
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
                            pointFArr[(int) Math.floor(pointF3.x / f11)][(int) Math.floor(pointF3.y / f11)] = pointF3;
                            arrayList2.add(pointF3);
                            break;
                        }
                    }
                    i13 = ceil;
                    i14 = width;
                    i19 = i20 + 1;
                    floor = f11;
                    dp = f10;
                    ceil = i13;
                    width = i14;
                }
                floor = f11;
                dp = f10;
                ceil = i11;
                width = i12;
            }
            int size = arrayList.size();
            ArrayList arrayList3 = vaVar.b;
            int size2 = size - arrayList3.size();
            for (int i25 = 0; i25 < size2; i25++) {
                arrayList3.add(new ua(vaVar));
            }
            int size3 = arrayList.size();
            vaVar.j = size3;
            if (vaVar.l != null) {
                e0.i0 i0Var = new e0.i0(size3);
                vaVar.l = i0Var;
                Bitmap bitmap = vaVar.d;
                float width2 = bitmap.getWidth();
                float height2 = bitmap.getHeight();
                int i26 = 0;
                while (i26 < i0Var.a) {
                    int i27 = i26;
                    e0.i0.a((float[]) i0Var.c, i27, 0.0f, 0.0f, width2, height2);
                    i26 = i27 + 1;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            for (int i28 = 0; i28 < vaVar.j; i28++) {
                ua uaVar = (ua) arrayList3.get(i28);
                PointF pointF5 = (PointF) arrayList.get(i28);
                vaVar.c(uaVar, currentTimeMillis, true);
                uaVar.a = pointF5.x + rectF.left;
                uaVar.b = pointF5.y + rectF.top;
                uaVar.h = AndroidUtilities.lerp(0.4f, 1.0f, Utilities.fastRandom.nextFloat());
                uaVar.e *= 1.25f;
            }
        } else if (starGift != null) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) s7.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) s7.l(starGift.attributes, TL_stars.starGiftAttributePattern.class);
            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) s7.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
            if (stargiftattributepattern != null) {
                n5Var.i(stargiftattributepattern.document, false);
            }
            if (stargiftattributebackdrop != null) {
                this.i = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dpf2(i10) / 2.0f, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                n5Var.k(Integer.valueOf(stargiftattributebackdrop.pattern_color | (-16777216)));
            }
            if (stargiftattributemodel != null) {
                ia.Z0(imageReceiver, stargiftattributemodel.document, (int) (i10 * 0.75f));
            }
        }
        this.a.setShader(this.i);
        if (view.isAttachedToWindow()) {
            a();
        }
    }

    @Override // org.telegram.ui.Components.lq
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

    @Override // org.telegram.ui.Components.lq
    public final void b() {
        this.h.b();
        this.g.onDetachedFromWindow();
        jf.p pVar = this.o;
        if (pVar != null) {
            pVar.b();
        }
    }

    public final void c(int i10) {
        zz0 zz0Var = this.l;
        if (zz0Var != null) {
            zz0Var.o(i10 | (-16777216));
        }
    }

    public final void d(int i10, int i11) {
        this.q = i10;
        this.p = i11;
        if (this.o == null) {
            this.o = new jf.p(new eg.n(this, 20));
        }
        this.o.a(ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime() < i10 ? i10 - r0 : i11 - r0);
        if (this.m == null) {
            org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, false, false, false);
            this.m = n6Var;
            n6Var.r(-1);
            this.m.t(AndroidUtilities.dp(12.0f));
            this.m.setCallback(new hg.a(this, 3));
        }
        h();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        zz0 zz0Var;
        Rect bounds = getBounds();
        RectF rectF = this.c;
        rectF.set(bounds);
        canvas.save();
        Path path = this.b;
        path.rewind();
        float f9 = this.s;
        path.addRoundRect(rectF, f9, f9, Path.Direction.CW);
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
        x0.a(canvas, this.t, this.h, rectF.width(), rectF.height(), 1.0f, this.n);
        va vaVar = this.d;
        if (vaVar != null) {
            vaVar.b(canvas, -1, 1.0f);
        }
        canvas.restore();
        zz0 zz0Var2 = this.k;
        ImageReceiver imageReceiver = this.g;
        if (zz0Var2 == null || (zz0Var = this.l) == null) {
            float min = Math.min(rectF.width(), rectF.height()) * 0.75f;
            float f10 = min / 2.0f;
            imageReceiver.setImageCoords(rectF.centerX() - f10, rectF.centerY() - f10, min, min);
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
            zz0Var2.e(canvas, rectF.centerX() - (zz0Var2.l() / 2.0f), rectF.bottom - AndroidUtilities.dp(50.0f));
            zz0Var.e(canvas, rectF.centerX() - (zz0Var.l() / 2.0f), rectF.bottom - AndroidUtilities.dp(30.0f));
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
        zz0 zz0Var;
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
        if (currentTime <= this.p || (zz0Var = this.l) == null) {
            return;
        }
        zz0Var.r(LocaleController.getString(R.string.Gift2SoldOutTitle));
    }
}
