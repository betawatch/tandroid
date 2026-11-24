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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class jqa extends yo2 {
    public gn E;
    public final float F;
    public hx2 G;
    public int H;
    public int I;
    public final Paint J;
    public int K;
    public byte L;
    public final Path c;
    public final RectF d;
    public final vva e;
    public final short f;
    public final View h;
    public final ImageReceiver n;
    public final tl r;
    public RadialGradient s;
    public final Matrix w;
    public final tgb x;
    public final tgb y;

    /* JADX WARN: Multi-variable type inference failed */
    public jqa(View view, TL_stars.StarGift starGift, int i, float f) {
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
        this.K = gl.L(16.0f);
        this.L = (byte) 0;
        this.h = view;
        this.F = f;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.n = imageReceiver;
        tl tlVar = new tl(gl.L(i > 180 ? 24.0f : 18.0f), view, false);
        this.r = tlVar;
        this.f = i;
        if (starGift instanceof TL_stars.TL_starGift) {
            float f4 = i;
            jva.d1(imageReceiver, starGift.sticker, (int) (0.75f * f4));
            String str = starGift.title;
            tgb tgbVar = new tgb(str == null ? "Gift" : str, 16.0f, gl.o());
            this.x = tgbVar;
            tgbVar.m(-1);
            float f5 = i - 30;
            tgbVar.o(gl.L(f5));
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            tgbVar.a();
            tgbVar.l(1);
            tgb tgbVar2 = new tgb(starGift.sold_out ? k96.M0(2131749951, null) : k96.G(starGift.availability_total, "Gift2SoldAuctionPreviewGifts", new Object[0]), 13.0f, null);
            this.y = tgbVar2;
            tgbVar2.o(gl.L(f5));
            tgbVar2.a();
            tgbVar2.l(1);
            vva vvaVar = new vva(1, 40);
            this.e = vvaVar;
            float f6 = 0.45f * f4;
            vvaVar.f(-gl.L(f6), -gl.L(f6), gl.L(f6), gl.L(f4 * 0.25f));
            float L = gl.L(30.0f);
            RectF rectF = vvaVar.c;
            int width = (int) rectF.width();
            int height = (int) rectF.height();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            yyc yycVar = Utilities.c;
            PointF pointF2 = new PointF(gl.U1(yycVar.nextFloat(), 0, width), gl.U1(yycVar.nextFloat(), 0, height));
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
                    double U1 = gl.U1(r10.nextFloat(), 1, 2) * L;
                    double U12 = gl.U1(Utilities.c.nextFloat(), i4, 360);
                    PointF pointF4 = new PointF((float) ((Math.cos(Math.toRadians(U12)) * U1) + pointF3.x), (float) ((Math.sin(Math.toRadians(U12)) * U1) + pointF3.y));
                    int L2 = gl.L(15.0f) / 2;
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
                                        if (loe.a(pointF5.x, pointF5.y, pointF4.x, pointF4.y) < f2) {
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
            ArrayList arrayList3 = vvaVar.b;
            int size2 = size - arrayList3.size();
            for (int i14 = 0; i14 < size2; i14++) {
                arrayList3.add(new uva(vvaVar));
            }
            int size3 = arrayList.size();
            vvaVar.j = size3;
            if (vvaVar.l != null) {
                cyb cybVar = new cyb(size3);
                vvaVar.l = cybVar;
                Bitmap bitmap = vvaVar.d;
                float width2 = bitmap.getWidth();
                float height2 = bitmap.getHeight();
                int i15 = 0;
                while (i15 < cybVar.b) {
                    int i16 = i15;
                    cyb.d((float[]) cybVar.d, i16, 0.0f, 0.0f, width2, height2);
                    i15 = i16 + 1;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            for (int i17 = 0; i17 < vvaVar.j; i17++) {
                uva uvaVar = (uva) arrayList3.get(i17);
                PointF pointF6 = (PointF) arrayList.get(i17);
                vvaVar.c(uvaVar, currentTimeMillis, true);
                uvaVar.a = pointF6.x + rectF.left;
                uvaVar.b = pointF6.y + rectF.top;
                uvaVar.h = gl.R1(0.4f, 1.0f, Utilities.c.nextFloat());
                uvaVar.e *= 1.25f;
            }
        } else if (starGift != null) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) gta.i(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) gta.i(starGift.attributes, TL_stars.starGiftAttributePattern.class);
            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) gta.i(starGift.attributes, TL_stars.starGiftAttributeModel.class);
            if (stargiftattributepattern != null) {
                tlVar.i(stargiftattributepattern.document, false);
            }
            if (stargiftattributebackdrop != null) {
                this.s = new RadialGradient(0.0f, 0.0f, gl.N(i) / 2.0f, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                tlVar.k(Integer.valueOf(stargiftattributebackdrop.pattern_color | (-16777216)));
            }
            if (stargiftattributemodel != null) {
                jva.d1(imageReceiver, stargiftattributemodel.document, (int) (i * 0.75f));
            }
        }
        ((Paint) this.b).setShader(this.s);
        if (view.isAttachedToWindow()) {
            a();
        }
    }

    @Override // yo2
    public final void a() {
        this.r.a();
        this.n.I();
        if (this.G != null) {
            int currentTime = ConnectionsManager.getInstance(y6c.t0).getCurrentTime();
            int i = this.I;
            if (currentTime >= i) {
                i = this.H;
            }
            this.G.a(i - currentTime);
        }
    }

    @Override // yo2
    public final void b() {
        this.r.b();
        this.n.K();
        hx2 hx2Var = this.G;
        if (hx2Var != null) {
            hx2Var.b();
        }
    }

    public final void c(int i) {
        tgb tgbVar = this.y;
        if (tgbVar != null) {
            tgbVar.m(i | (-16777216));
        }
    }

    public final void d(int i, int i2) {
        this.I = i;
        this.H = i2;
        if (this.G == null) {
            this.G = new hx2(new wh9(this, (byte) 21));
        }
        this.G.a(ConnectionsManager.getInstance(y6c.t0).getCurrentTime() < i ? i - r0 : i2 - r0);
        if (this.E == null) {
            gn gnVar = new gn(false, false, false);
            this.E = gnVar;
            gnVar.u(-1);
            this.E.w(gl.L(12.0f));
            this.E.setCallback(new in(this, (byte) 11));
        }
        f();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        tgb tgbVar;
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
        ana.a(canvas, this.L, this.r, rectF.width(), rectF.height(), 1.0f, this.F);
        vva vvaVar = this.e;
        if (vvaVar != null) {
            vvaVar.b(canvas, -1, 1.0f);
        }
        canvas.restore();
        tgb tgbVar2 = this.x;
        ImageReceiver imageReceiver = this.n;
        if (tgbVar2 == null || (tgbVar = this.y) == null) {
            float min = Math.min(rectF.width(), rectF.height()) * 0.75f;
            float f2 = min / 2.0f;
            imageReceiver.i0(rectF.centerX() - f2, rectF.centerY() - f2, min, min);
            imageReceiver.h(canvas, null);
        } else {
            if (this.E != null) {
                Paint paint2 = this.J;
                paint2.setColor(1342177280);
                canvas.drawRoundRect(rectF.left + gl.L(6.0f), gl.L(6.0f) + rectF.top, rectF.left + gl.L(20.0f) + Math.max(this.E.c(), gl.L(3.0f)), rectF.top + gl.L(23.0f), gl.L(8.5f), gl.L(8.5f), paint2);
                canvas.save();
                canvas.translate(rectF.left + gl.L(13.0f), rectF.top + gl.L(14.0f));
                this.E.draw(canvas);
                canvas.restore();
            }
            float min2 = Math.min(rectF.width(), rectF.height()) * 0.6f;
            imageReceiver.i0(rectF.centerX() - (min2 / 2.0f), (rectF.height() * 0.12f) + rectF.top, min2, min2);
            imageReceiver.h(canvas, null);
            tgbVar2.e(canvas, rectF.centerX() - (tgbVar2.j() / 2.0f), rectF.bottom - gl.L(50.0f));
            tgbVar.e(canvas, rectF.centerX() - (tgbVar.j() / 2.0f), rectF.bottom - gl.L(30.0f));
        }
        canvas.restore();
    }

    public final void e(int i, int i2) {
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, gl.N(this.f) / 2.0f, new int[]{i | (-16777216), i2 | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.s = radialGradient;
        ((Paint) this.b).setShader(radialGradient);
    }

    public final void f() {
        tgb tgbVar;
        int currentTime = ConnectionsManager.getInstance(y6c.t0).getCurrentTime();
        int i = this.H;
        if (currentTime > i) {
            this.E.t(k96.M0(2131750350, null), true, true);
        } else {
            int i2 = this.I;
            gn gnVar = this.E;
            if (currentTime < i2) {
                gnVar.t(k96.a0(null, null, 2131750349, gl.g0(i2 - currentTime, true, false)), true, true);
            } else {
                gnVar.t(gl.g0(i - currentTime, true, false), true, true);
            }
        }
        if (currentTime <= this.H || (tgbVar = this.y) == null) {
            return;
        }
        tgbVar.p(k96.M0(2131749951, null));
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return gl.L(this.f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return gl.L(this.f);
    }
}
