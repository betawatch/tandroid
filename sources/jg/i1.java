package jg;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.tz;
import org.telegram.ui.ActionBar.c5;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import vh.s3;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i1 implements p6 {
    public final TextPaint a;
    public final TextPaint b;
    public final TextPaint c;
    public final Paint d;
    public final Paint e;
    public final /* synthetic */ s3 f;

    public i1(s3 s3Var) {
        this.f = s3Var;
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
        textPaint.setTextSize(org.telegram.messenger.i0.L(Math.max(16, tz.W0) - 2));
        textPaint2.setTextSize(org.telegram.messenger.i0.L(Math.max(16, tz.W0) - 2));
        textPaint3.setTextSize(org.telegram.messenger.i0.L(15.0f));
        textPaint3.setTypeface(org.telegram.messenger.i0.o());
        paint.setColor(352321536);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final boolean a() {
        return this.f.B0;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void b(float f7, float f10, int i10, int i11) {
        t6.r(f7, f10, i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final ColorFilter c() {
        return t6.v3;
    }

    @Override // org.telegram.ui.ActionBar.p6
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
                return t6.V0(str);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final boolean e() {
        return tz.H0;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final int f(int i10) {
        return h(i10);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final Drawable getDrawable(String str) {
        s3 s3Var = this.f;
        i1 i1Var = s3Var.D0;
        if (str.equals("drawableMsgIn")) {
            if (s3Var.E0 == null) {
                s3Var.E0 = new c5(0, false, false, i1Var);
            }
            return s3Var.E0;
        }
        if (str.equals("drawableMsgInSelected")) {
            if (s3Var.F0 == null) {
                s3Var.F0 = new c5(0, false, true, i1Var);
            }
            return s3Var.F0;
        }
        if (str.equals("drawableMsgOut")) {
            if (s3Var.G0 == null) {
                s3Var.G0 = new c5(0, true, false, i1Var);
            }
            return s3Var.G0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            if (s3Var.H0 == null) {
                s3Var.H0 = new c5(0, true, true, i1Var);
            }
            return s3Var.H0;
        }
        if (str.equals("drawableMsgInMedia")) {
            if (s3Var.I0 == null) {
                s3Var.I0 = new c5(1, false, false, i1Var);
            }
            s3Var.I0.invalidateSelf();
            return s3Var.I0;
        }
        if (str.equals("drawableMsgInMediaSelected")) {
            if (s3Var.J0 == null) {
                s3Var.J0 = new c5(1, false, true, i1Var);
            }
            return s3Var.J0;
        }
        if (str.equals("drawableMsgOutMedia")) {
            if (s3Var.K0 == null) {
                s3Var.K0 = new c5(1, true, false, i1Var);
            }
            return s3Var.K0;
        }
        if (!str.equals("drawableMsgOutMediaSelected")) {
            return t6.R0(str);
        }
        if (s3Var.L0 == null) {
            s3Var.L0 = new c5(1, true, true, i1Var);
        }
        return s3Var.L0;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final int h(int i10) {
        return this.f.C0.get(i10, t6.x0(null, i10, false));
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final int j(int i10) {
        return h(i10);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void i(int i10, int i11) {
    }
}
