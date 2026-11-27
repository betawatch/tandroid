// default package

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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class kua extends rp2 {
    public hn E;
    public final float F;
    public by2 G;
    public int H;
    public int I;
    public final Paint J;
    public int K;
    public byte L;
    public final Path c;
    public final RectF d;
    public final yza e;
    public final short f;
    public final View h;
    public final ImageReceiver n;
    public final ul r;
    public RadialGradient s;
    public final Matrix w;
    public final pkb x;
    public final pkb y;

    /* JADX WARN: Multi-variable type inference failed */
    public kua(View view, TL_stars.StarGift starGift, int i, float f) {
        super(view);
        float f2;
        int i2;
        float f3;
        int i3;
        PointF pointF;
        this.c = new Path();
        this.d = new RectF();
        this.w = new Matrix();
        this.J = new Paint(1);
        this.K = hl.L(16.0f);
        this.L = (byte) 0;
        this.h = view;
        this.F = f;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.n = imageReceiver;
        ul ulVar = new ul(hl.L(i > 180 ? 24.0f : 18.0f), view, false);
        this.r = ulVar;
        this.f = i;
        if (starGift instanceof TL_stars.TL_starGift) {
            float f4 = i;
            nza.e1(imageReceiver, starGift.sticker, (int) (0.75f * f4));
            String str = starGift.title;
            pkb pkbVar = new pkb(str == null ? "Gift" : str, 16.0f, hl.o());
            this.x = pkbVar;
            pkbVar.m(-1);
            float f5 = i - 30;
            pkbVar.o(hl.L(f5));
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            pkbVar.a();
            pkbVar.l(1);
            pkb pkbVar2 = new pkb(starGift.sold_out ? ob6.M0(2131749913, null) : ob6.G(starGift.availability_total, "Gift2SoldAuctionPreviewGifts", new Object[0]), 13.0f, null);
            this.y = pkbVar2;
            pkbVar2.o(hl.L(f5));
            pkbVar2.a();
            pkbVar2.l(1);
            yza yzaVar = new yza(1, 40);
            this.e = yzaVar;
            float f6 = 0.45f * f4;
            yzaVar.f(-hl.L(f6), -hl.L(f6), hl.L(f6), hl.L(f4 * 0.25f));
            float L = hl.L(30.0f);
            RectF rectF = yzaVar.c;
            int width = (int) rectF.width();
            int height = (int) rectF.height();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            o3d o3dVar = Utilities.c;
            PointF pointF2 = new PointF(hl.U1(o3dVar.nextFloat(), 0, width), hl.U1(o3dVar.nextFloat(), 0, height));
            float floor = (float) Math.floor(L / 1.4142135623730951d);
            int i4 = 0;
            int ceil = (int) Math.ceil(width / floor);
            int i5 = ceil + 1;
            int ceil2 = (int) Math.ceil(height / floor);
            int i6 = ceil2 + 1;
            PointF[][] pointFArr = (PointF[][]) Array.newInstance((Class<?>) PointF.class, i5, i6);
            for (int i7 = 0; i7 < i5; i7++) {
                for (int i8 = 0; i8 < i6; i8++) {
                    pointFArr[i7][i8] = null;
                }
            }
            pointFArr[(int) Math.floor(pointF2.x / floor)][(int) Math.floor(pointF2.y / floor)] = pointF2;
            arrayList.add(pointF2);
            arrayList2.add(pointF2);
            while (!arrayList2.isEmpty()) {
                int nextInt = arrayList2.size() > 1 ? Utilities.c.nextInt(arrayList2.size() - 1) : i4;
                PointF pointF3 = (PointF) arrayList2.get(nextInt);
                int i9 = i4;
                while (true) {
                    if (i9 >= 15) {
                        f2 = L;
                        i2 = ceil;
                        f3 = floor;
                        arrayList2.remove(nextInt);
                        break;
                    }
                    f3 = floor;
                    int i10 = i9;
                    double U1 = hl.U1(r10.nextFloat(), 1, 2) * L;
                    double U12 = hl.U1(Utilities.c.nextFloat(), i4, 360);
                    PointF pointF4 = new PointF((float) ((Math.cos(Math.toRadians(U12)) * U1) + pointF3.x), (float) ((Math.sin(Math.toRadians(U12)) * U1) + pointF3.y));
                    int L2 = hl.L(15.0f) / 2;
                    float f7 = pointF4.x;
                    float f8 = L2;
                    if (f7 >= f8 && f7 < width - L2) {
                        float f9 = pointF4.y;
                        if (f9 >= f8 && f9 < height - L2) {
                            int floor2 = (int) Math.floor(f7 / f3);
                            int floor3 = (int) Math.floor(pointF4.y / f3);
                            int min = Math.min(floor2 + 1, ceil);
                            f2 = L;
                            int max = Math.max(floor3 - 1, 0);
                            int min2 = Math.min(floor3 + 1, ceil2);
                            for (int max2 = Math.max(floor2 - 1, 0); max2 <= min; max2++) {
                                int i11 = max;
                                while (i11 <= min2) {
                                    int i12 = min;
                                    PointF pointF5 = pointFArr[max2][i11];
                                    int i13 = max;
                                    if (pointF5 != null) {
                                        i3 = ceil;
                                        pointF = pointF3;
                                        if (dte.a(pointF5.x, pointF5.y, pointF4.x, pointF4.y) < f2) {
                                            break;
                                        }
                                    } else {
                                        i3 = ceil;
                                        pointF = pointF3;
                                    }
                                    i11++;
                                    max = i13;
                                    min = i12;
                                    ceil = i3;
                                    pointF3 = pointF;
                                }
                            }
                            i2 = ceil;
                            arrayList.add(pointF4);
                            pointFArr[(int) Math.floor(pointF4.x / f3)][(int) Math.floor(pointF4.y / f3)] = pointF4;
                            arrayList2.add(pointF4);
                            break;
                        }
                    }
                    f2 = L;
                    i3 = ceil;
                    pointF = pointF3;
                    i9 = i10 + 1;
                    floor = f3;
                    L = f2;
                    ceil = i3;
                    pointF3 = pointF;
                    i4 = 0;
                }
                floor = f3;
                L = f2;
                ceil = i2;
                i4 = 0;
            }
            int size = arrayList.size();
            ArrayList arrayList3 = yzaVar.b;
            int size2 = size - arrayList3.size();
            for (int i14 = 0; i14 < size2; i14++) {
                arrayList3.add(new xza(yzaVar));
            }
            int size3 = arrayList.size();
            yzaVar.j = size3;
            if (yzaVar.l != null) {
                d2c d2cVar = new d2c(size3);
                yzaVar.l = d2cVar;
                Bitmap bitmap = yzaVar.d;
                float width2 = bitmap.getWidth();
                float height2 = bitmap.getHeight();
                int i15 = 0;
                while (i15 < d2cVar.b) {
                    int i16 = i15;
                    d2c.d((float[]) d2cVar.d, i16, 0.0f, 0.0f, width2, height2);
                    i15 = i16 + 1;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            for (int i17 = 0; i17 < yzaVar.j; i17++) {
                xza xzaVar = (xza) arrayList3.get(i17);
                PointF pointF6 = (PointF) arrayList.get(i17);
                yzaVar.c(xzaVar, currentTimeMillis, true);
                xzaVar.a = pointF6.x + rectF.left;
                xzaVar.b = pointF6.y + rectF.top;
                xzaVar.h = hl.R1(0.4f, 1.0f, Utilities.c.nextFloat());
                xzaVar.e *= 1.25f;
            }
        } else if (starGift != null) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) jxa.i(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) jxa.i(starGift.attributes, TL_stars.starGiftAttributePattern.class);
            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) jxa.i(starGift.attributes, TL_stars.starGiftAttributeModel.class);
            if (stargiftattributepattern != null) {
                ulVar.i(stargiftattributepattern.document, false);
            }
            if (stargiftattributebackdrop != null) {
                this.s = new RadialGradient(0.0f, 0.0f, hl.N(i) / 2.0f, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                ulVar.k(Integer.valueOf(stargiftattributebackdrop.pattern_color | (-16777216)));
            }
            if (stargiftattributemodel != null) {
                nza.e1(imageReceiver, stargiftattributemodel.document, (int) (i * 0.75f));
            }
        }
        ((Paint) this.b).setShader(this.s);
        if (view.isAttachedToWindow()) {
            a();
        }
    }

    @Override // rp2
    public final void a() {
        this.r.a();
        this.n.I();
        if (this.G != null) {
            int currentTime = ConnectionsManager.getInstance(yac.t0).getCurrentTime();
            int i = this.I;
            if (currentTime >= i) {
                i = this.H;
            }
            this.G.a(i - currentTime);
        }
    }

    @Override // rp2
    public final void b() {
        this.r.b();
        this.n.K();
        by2 by2Var = this.G;
        if (by2Var != null) {
            by2Var.b();
        }
    }

    public final void c(int i) {
        pkb pkbVar = this.y;
        if (pkbVar != null) {
            pkbVar.m(i | (-16777216));
        }
    }

    public final void d(int i, int i2) {
        this.I = i;
        this.H = i2;
        if (this.G == null) {
            this.G = new by2(new hja(this, (byte) 4));
        }
        this.G.a(ConnectionsManager.getInstance(yac.t0).getCurrentTime() < i ? i - r0 : i2 - r0);
        if (this.E == null) {
            hn hnVar = new hn(false, false, false);
            this.E = hnVar;
            hnVar.u(-1);
            this.E.w(hl.L(12.0f));
            this.E.setCallback(new jn(this, (byte) 11));
        }
        f();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        pkb pkbVar;
        Paint paint = (Paint) this.b;
        Rect bounds = getBounds();
        RectF rectF = this.d;
        rectF.set(bounds);
        canvas.save();
        Path path = this.c;
        path.rewind();
        float f = this.K;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
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
        xqa.a(canvas, this.L, this.r, rectF.width(), rectF.height(), 1.0f, this.F);
        yza yzaVar = this.e;
        if (yzaVar != null) {
            yzaVar.b(canvas, -1, 1.0f);
        }
        canvas.restore();
        pkb pkbVar2 = this.x;
        ImageReceiver imageReceiver = this.n;
        if (pkbVar2 == null || (pkbVar = this.y) == null) {
            float min = Math.min(rectF.width(), rectF.height()) * 0.75f;
            float f2 = min / 2.0f;
            imageReceiver.i0(rectF.centerX() - f2, rectF.centerY() - f2, min, min);
            imageReceiver.h(canvas, null);
        } else {
            if (this.E != null) {
                Paint paint2 = this.J;
                paint2.setColor(1342177280);
                canvas.drawRoundRect(rectF.left + hl.L(6.0f), hl.L(6.0f) + rectF.top, rectF.left + hl.L(20.0f) + Math.max(this.E.c(), hl.L(3.0f)), rectF.top + hl.L(23.0f), hl.L(8.5f), hl.L(8.5f), paint2);
                canvas.save();
                canvas.translate(rectF.left + hl.L(13.0f), rectF.top + hl.L(14.0f));
                this.E.draw(canvas);
                canvas.restore();
            }
            float min2 = Math.min(rectF.width(), rectF.height()) * 0.6f;
            imageReceiver.i0(rectF.centerX() - (min2 / 2.0f), (rectF.height() * 0.12f) + rectF.top, min2, min2);
            imageReceiver.h(canvas, null);
            pkbVar2.e(canvas, rectF.centerX() - (pkbVar2.j() / 2.0f), rectF.bottom - hl.L(50.0f));
            pkbVar.e(canvas, rectF.centerX() - (pkbVar.j() / 2.0f), rectF.bottom - hl.L(30.0f));
        }
        canvas.restore();
    }

    public final void e(int i, int i2) {
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, hl.N(this.f) / 2.0f, new int[]{i | (-16777216), i2 | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.s = radialGradient;
        ((Paint) this.b).setShader(radialGradient);
    }

    public final void f() {
        pkb pkbVar;
        int currentTime = ConnectionsManager.getInstance(yac.t0).getCurrentTime();
        int i = this.H;
        if (currentTime > i) {
            this.E.t(ob6.M0(2131750327, null), true, true);
        } else {
            int i2 = this.I;
            hn hnVar = this.E;
            if (currentTime < i2) {
                hnVar.t(ob6.a0(null, null, 2131750326, hl.g0(i2 - currentTime, true, false)), true, true);
            } else {
                hnVar.t(hl.g0(i - currentTime, true, false), true, true);
            }
        }
        if (currentTime <= this.H || (pkbVar = this.y) == null) {
            return;
        }
        pkbVar.p(ob6.M0(2131749913, null));
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return hl.L(this.f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return hl.L(this.f);
    }
}
