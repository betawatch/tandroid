// default package

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class a47 implements vnb {
    public final TextPaint a;
    public final TextPaint b;
    public final TextPaint c;
    public final Paint d;
    public final Paint e;
    public final /* synthetic */ vw7 f;

    public a47(vw7 vw7Var) {
        this.f = vw7Var;
        TextPaint textPaint = new TextPaint();
        this.a = textPaint;
        TextPaint textPaint2 = new TextPaint();
        this.b = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        this.c = textPaint3;
        new Paint(3);
        this.d = new Paint(3);
        Paint paint = new Paint(3);
        this.e = paint;
        textPaint.setTextSize(hl.L(Math.max(16, xea.S0) - 2));
        textPaint2.setTextSize(hl.L(Math.max(16, xea.S0) - 2));
        textPaint3.setTextSize(hl.L(15.0f));
        textPaint3.setTypeface(hl.o());
        paint.setColor(352321536);
    }

    @Override // vnb
    public final boolean a() {
        return this.f.D0;
    }

    @Override // vnb
    public final void b(float f, float f2, int i, int i2) {
        aob.q(f, f2, i, i2);
    }

    @Override // vnb
    public final ColorFilter c() {
        return aob.v3;
    }

    @Override // vnb
    public final Paint d(String str) {
        str.getClass();
        switch (str) {
            case "paintChatActionText2":
                return this.b;
            case "paintChatBotButton":
                return this.c;
            case "paintChatActionBackgroundDarken":
                return this.e;
            case "paintChatActionBackgroundSelected":
                return this.d;
            case "paintChatActionText":
                return this.a;
            default:
                return aob.T0(str);
        }
    }

    @Override // vnb
    public final boolean e() {
        return xea.D0;
    }

    @Override // vnb
    public final int f(int i) {
        return h(i);
    }

    @Override // vnb
    public final boolean g() {
        return false;
    }

    @Override // vnb
    public final Drawable getDrawable(String str) {
        vw7 vw7Var = this.f;
        a47 a47Var = vw7Var.F0;
        if (str.equals("drawableMsgIn")) {
            t37 t37Var = vw7Var.G0;
            if (t37Var != null) {
                return t37Var;
            }
            t37 t37Var2 = new t37(0, false, false, a47Var);
            vw7Var.G0 = t37Var2;
            return t37Var2;
        }
        if (str.equals("drawableMsgInSelected")) {
            t37 t37Var3 = vw7Var.H0;
            if (t37Var3 != null) {
                return t37Var3;
            }
            t37 t37Var4 = new t37(0, false, true, a47Var);
            vw7Var.H0 = t37Var4;
            return t37Var4;
        }
        if (str.equals("drawableMsgOut")) {
            t37 t37Var5 = vw7Var.I0;
            if (t37Var5 != null) {
                return t37Var5;
            }
            t37 t37Var6 = new t37(0, true, false, a47Var);
            vw7Var.I0 = t37Var6;
            return t37Var6;
        }
        if (str.equals("drawableMsgOutSelected")) {
            t37 t37Var7 = vw7Var.J0;
            if (t37Var7 != null) {
                return t37Var7;
            }
            t37 t37Var8 = new t37(0, true, true, a47Var);
            vw7Var.J0 = t37Var8;
            return t37Var8;
        }
        if (str.equals("drawableMsgInMedia")) {
            t37 t37Var9 = vw7Var.K0;
            if (t37Var9 == null) {
                t37Var9 = new t37(1, false, false, a47Var);
                vw7Var.K0 = t37Var9;
            }
            t37Var9.invalidateSelf();
            return vw7Var.K0;
        }
        if (str.equals("drawableMsgInMediaSelected")) {
            t37 t37Var10 = vw7Var.L0;
            if (t37Var10 != null) {
                return t37Var10;
            }
            t37 t37Var11 = new t37(1, false, true, a47Var);
            vw7Var.L0 = t37Var11;
            return t37Var11;
        }
        if (str.equals("drawableMsgOutMedia")) {
            t37 t37Var12 = vw7Var.M0;
            if (t37Var12 != null) {
                return t37Var12;
            }
            t37 t37Var13 = new t37(1, true, false, a47Var);
            vw7Var.M0 = t37Var13;
            return t37Var13;
        }
        if (!str.equals("drawableMsgOutMediaSelected")) {
            return aob.P0(str);
        }
        t37 t37Var14 = vw7Var.N0;
        if (t37Var14 != null) {
            return t37Var14;
        }
        t37 t37Var15 = new t37(1, true, true, a47Var);
        vw7Var.N0 = t37Var15;
        return t37Var15;
    }

    @Override // vnb
    public final int h(int i) {
        return this.f.E0.get(i, aob.w0(null, i, false));
    }

    @Override // vnb
    public final int j(int i) {
        return h(i);
    }

    @Override // vnb
    public final void i(int i, int i2) {
    }
}
