// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class kb2 {
    public final gb2 a;
    public int b;
    public ni2 c;
    public String d;
    public usc e;
    public Drawable f;
    public int g = -1;

    public kb2(gb2 gb2Var) {
        this.a = gb2Var;
    }

    public final void a(Canvas canvas) {
        gb2 gb2Var = this.a;
        ml mlVar = gb2Var.U0;
        mv6 mv6Var = gb2Var.ec;
        Drawable drawable = (Drawable) mv6Var.d;
        if (drawable == null) {
            drawable = b00.d((Context) mv6Var.b, R.drawable.map_pin);
            mv6Var.d = drawable;
        }
        int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
        int intrinsicHeight = (int) (drawable.getIntrinsicHeight() * 0.8f);
        int z = (int) oo1.z(mlVar.N0, intrinsicWidth, 2.0f, mlVar.L0);
        int interpolation = (int) ((((mlVar.O0 / 2.0f) - intrinsicHeight) + mlVar.M0) - ((1.0f - s33.k.getInterpolation(mlVar.i1)) * gl.L(16.0f)));
        drawable.setAlpha((int) (Math.min(1.0f, mlVar.i1 * 5.0f) * 255.0f));
        drawable.setBounds(z, interpolation, intrinsicWidth + z, intrinsicHeight + interpolation);
        drawable.draw(canvas);
        if (mlVar.i1 < 1.0f) {
            gb2Var.invalidate();
        }
    }

    public final void b(Canvas canvas) {
        float f;
        float f2;
        float f3;
        String C;
        float abs;
        float f4;
        RectF rectF;
        float f5;
        gb2 gb2Var;
        ImageReceiver imageReceiver;
        nb2 nb2Var;
        float f6;
        gb2 gb2Var2 = this.a;
        int i = gb2Var2.a6;
        ImageReceiver imageReceiver2 = gb2Var2.F7;
        nb2 nb2Var2 = gb2Var2.ub;
        RectF rectF2 = gb2Var2.c4;
        ml mlVar = gb2Var2.U0;
        if (gb2Var2.e3 != null) {
            if (gb2Var2.Q5.O3()) {
                bkb.G2.setColor(bkb.v0(bkb.Vc, gb2Var2.cc));
                bkb.H2.setColor(bkb.v0(gb2Var2.A2() ? bkb.Bc : bkb.Ac, gb2Var2.cc));
            } else {
                bkb.G2.setColor(bkb.v0(bkb.Uc, gb2Var2.cc));
                bkb.H2.setColor(bkb.v0(gb2Var2.A2() ? bkb.ze : bkb.ye, gb2Var2.cc));
            }
            if (!(k27.n1(gb2Var2.Q5.k) instanceof TLRPC.TL_messageMediaGeoLive)) {
                canvas.save();
                canvas.translate(mlVar.L0 + gl.L(6.0f), mlVar.x() + gl.L(8.0f));
                gb2Var2.e3.draw(canvas);
                if (gb2Var2.x3 != null) {
                    canvas.translate(0.0f, gl.L(21.0f));
                    gb2Var2.x3.draw(canvas);
                }
                canvas.restore();
                return;
            }
            int x = (int) (mlVar.x() + gl.L(30.0f));
            if (!gb2Var2.h3 || nb2Var2.j) {
                gb2Var2.S9 = true;
                StaticLayout staticLayout = gb2Var2.e3;
                StaticLayout staticLayout2 = gb2Var2.x3;
                f = 1.0f;
                boolean z = false;
                if (nb2Var2.j) {
                    float f7 = nb2Var2.m;
                    String str = nb2Var2.l;
                    staticLayout = nb2Var2.n;
                    StaticLayout staticLayout3 = nb2Var2.o;
                    f2 = 255.0f;
                    abs = f7;
                    f4 = 1.0f - nb2Var2.L1;
                    C = str;
                    staticLayout2 = staticLayout3;
                    f3 = 2.0f;
                } else {
                    f2 = 255.0f;
                    if (k27.n1(gb2Var2.Q5.k).period == Integer.MAX_VALUE) {
                        C = "";
                        f4 = 1.0f;
                        abs = 1.0f;
                        f3 = 2.0f;
                        z = true;
                    } else {
                        f3 = 2.0f;
                        C = k96.C(Math.abs(k27.n1(gb2Var2.Q5.k).period - (ConnectionsManager.getInstance(i).getCurrentTime() - gb2Var2.Q5.k.date)));
                        abs = 1.0f - (Math.abs(ConnectionsManager.getInstance(i).getCurrentTime() - gb2Var2.Q5.k.date) / k27.n1(gb2Var2.Q5.k).period);
                        f4 = 1.0f;
                    }
                }
                float f8 = f4;
                rectF2.set(mlVar.w() - gl.L(43.0f), x - gl.L(15.0f), mlVar.w() - gl.L(13.0f), gl.L(15.0f) + x);
                if (gb2Var2.Q5.O3()) {
                    Paint paint = bkb.k2;
                    int i2 = bkb.Lb;
                    paint.setColor(bkb.v0(i2, gb2Var2.cc));
                    bkb.E2.setColor(bkb.v0(i2, gb2Var2.cc));
                } else {
                    Paint paint2 = bkb.k2;
                    int i3 = bkb.td;
                    paint2.setColor(bkb.v0(i3, gb2Var2.cc));
                    bkb.E2.setColor(bkb.v0(i3, gb2Var2.cc));
                }
                int alpha = bkb.G2.getAlpha();
                int alpha2 = bkb.H2.getAlpha();
                int alpha3 = bkb.E2.getAlpha();
                if (f8 != 1.0f) {
                    f5 = 50.0f;
                    rectF = rectF2;
                    bkb.G2.setAlpha((int) (alpha * f8));
                    bkb.H2.setAlpha((int) (alpha2 * f8));
                    bkb.E2.setAlpha((int) (alpha3 * f8));
                    canvas.save();
                    canvas.translate(0.0f, (-gl.L(50.0f)) * nb2Var2.L1);
                } else {
                    rectF = rectF2;
                    f5 = 50.0f;
                }
                bkb.k2.setAlpha((int) (f8 * f5));
                StaticLayout staticLayout4 = staticLayout2;
                canvas.drawCircle(rectF.centerX(), rectF.centerY(), gl.L(15.0f), bkb.k2);
                bkb.k2.setAlpha((int) (f8 * f2));
                StaticLayout staticLayout5 = staticLayout;
                gb2Var = gb2Var2;
                imageReceiver = imageReceiver2;
                RectF rectF3 = rectF;
                canvas.drawArc(rectF3, -90.0f, abs * (-360.0f), false, bkb.k2);
                if (z) {
                    if (this.f == null) {
                        this.f = gb2Var.getContext().getResources().getDrawable(R.drawable.filled_location_forever).mutate();
                    }
                    if (bkb.E2.getColor() != this.g) {
                        Drawable drawable = this.f;
                        int color = bkb.E2.getColor();
                        this.g = color;
                        drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                    }
                    nb2Var = nb2Var2;
                    f6 = abs;
                    this.f.setBounds(oo1.A(2, (int) rectF3.centerX(), this.f), oo1.y(2, (int) rectF3.centerY(), this.f), oo1.w(2, (int) rectF3.centerX(), this.f), oo1.i(2, (int) rectF3.centerY(), this.f));
                    this.f.draw(canvas);
                } else {
                    nb2Var = nb2Var2;
                    f6 = abs;
                    float measureText = bkb.E2.measureText(C);
                    int length = C.length();
                    float f9 = length > 4 ? 0.75f : length > 3 ? 0.85f : 1.0f;
                    canvas.save();
                    canvas.scale(f9, f9, rectF3.centerX(), rectF3.centerY());
                    canvas.drawText(C, rectF3.centerX() - (measureText / f3), gl.L(4.0f) + x, bkb.E2);
                    canvas.restore();
                }
                if (staticLayout5 != null && staticLayout4 != null) {
                    canvas.save();
                    canvas.translate(mlVar.L0 + gl.L(10.0f), mlVar.x() + gl.L(10.0f));
                    staticLayout5.draw(canvas);
                    canvas.translate(0.0f, gl.L(23.0f));
                    staticLayout4.draw(canvas);
                    canvas.restore();
                }
                if (f8 != 1.0f) {
                    bkb.G2.setAlpha(alpha);
                    bkb.H2.setAlpha(alpha2);
                    bkb.E2.setAlpha(alpha3);
                    canvas.restore();
                }
                nb2 nb2Var3 = nb2Var;
                nb2Var3.m = f6;
                nb2Var3.l = C;
                nb2Var3.n = staticLayout5;
                nb2Var3.o = staticLayout4;
            } else {
                nb2Var2.l = null;
                nb2Var2.n = null;
                nb2Var2.o = null;
                gb2Var = gb2Var2;
                imageReceiver = imageReceiver2;
                f3 = 2.0f;
                f = 1.0f;
                f2 = 255.0f;
            }
            float f10 = mlVar.G() ? f : mlVar.i1;
            if (f10 > 0.0f) {
                if (mlVar.E() || mlVar.G()) {
                    int L = (int) (((mlVar.N0 / f3) + mlVar.L0) - gl.L(31.0f));
                    int L2 = (int) ((((mlVar.O0 / f3) + mlVar.M0) - gl.L(38.0f)) - ((f - s33.k.getInterpolation(f10)) * gl.L(16.0f)));
                    mv6 mv6Var = gb2Var.ec;
                    Drawable drawable2 = (Drawable) mv6Var.c;
                    if (drawable2 == null) {
                        drawable2 = b00.d((Context) mv6Var.b, R.drawable.livepin);
                        mv6Var.c = drawable2;
                    }
                    hf0.t(L, L2, drawable2);
                    float f11 = f10 * 5.0f;
                    drawable2.setAlpha((int) (Math.min(f, f11) * f2));
                    drawable2.draw(canvas);
                    ImageReceiver imageReceiver3 = imageReceiver;
                    imageReceiver3.i0(gl.L(5.0f) + L, gl.L(5.0f) + L2, gl.L(52.0f), gl.L(52.0f));
                    imageReceiver3.setAlpha(Math.min(1.0f, f11));
                    imageReceiver3.h(canvas, null);
                }
            }
        }
    }
}
