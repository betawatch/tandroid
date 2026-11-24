// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class kh9 extends mg9 {
    public final qh9 X;
    public final qh9[] Y;
    public int Z;
    public LinearGradient a0;
    public final Matrix b0;
    public final Paint c0;

    public kh9(rh9 rh9Var, Rect rect, int i, SpannableStringBuilder spannableStringBuilder) {
        super(rh9Var, rect, i);
        this.b0 = new Matrix();
        this.c0 = new Paint(1);
        qh9 qh9Var = new qh9(rh9Var, spannableStringBuilder, this.c);
        this.X = qh9Var;
        this.Y = new qh9[]{qh9Var};
    }

    @Override // mg9
    public final int I() {
        Rect rect = this.b;
        return this.X.b.getHeight() + rect.top + rect.bottom;
    }

    @Override // mg9
    public final int J() {
        Rect rect = this.b;
        return this.X.q() + rect.left + rect.right;
    }

    @Override // mg9
    public final int K() {
        Rect rect = this.b;
        return this.X.r() + rect.left + rect.right;
    }

    @Override // mg9
    public final pib[] L() {
        return this.Y;
    }

    @Override // mg9
    public final void T() {
        this.X.i(this.W);
    }

    @Override // mg9
    public final void V() {
        this.X.f(this.W);
    }

    @Override // mg9
    public final void W(Canvas canvas) {
        qh9 qh9Var = this.X;
        int i = qh9Var.f;
        rh9 rh9Var = this.a;
        canvas.saveLayerAlpha(0.0f, 0.0f, rh9Var.C, I(), kk7.d4, 31);
        int i0 = i0();
        if (i0 != 0) {
            qh9Var.c = (this.b.left + i0) - i;
            canvas.save();
            canvas.translate(i0, 0.0f);
        }
        qh9Var.d(canvas, qh9Var.T);
        if (rh9Var.E()) {
            canvas.save();
            canvas.translate(-i, 0.0f);
            gm.drawAnimatedEmojis(canvas, qh9Var.b, qh9Var.F, 0.0f, qh9Var.x, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        if (i0 != 0) {
            canvas.restore();
        }
        j0();
        Matrix matrix = this.b0;
        matrix.reset();
        matrix.postTranslate(((System.currentTimeMillis() % 2000) / 2000.0f) * this.c, 0.0f);
        this.a0.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, rh9Var.C, I(), this.c0);
        canvas.restore();
        View view = this.W;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // mg9
    public final void X(Canvas canvas, int i, float f) {
        qh9 qh9Var = this.X;
        int i2 = qh9Var.f;
        rh9 rh9Var = this.a;
        int i3 = rh9Var.C;
        TextPaint textPaint = rh9Var.w;
        canvas.saveLayerAlpha(0.0f, 0.0f, i3, I(), kk7.d4, 31);
        int i0 = i0();
        if (i0 != 0) {
            qh9Var.c = (this.b.left + i0) - i2;
        }
        canvas.save();
        canvas.translate(i0 - i2, 0.0f);
        int color = textPaint.getColor();
        textPaint.setColor(-1);
        textPaint.linkColor = bkb.v0(rh9Var.D() ? bkb.Xc : bkb.Wc, rh9Var.D);
        lg7.b(canvas, qh9Var.b, i, f, new kq8(this, this.W, (byte) 9));
        canvas.restore();
        textPaint.setColor(color);
        j0();
        Matrix matrix = this.b0;
        matrix.reset();
        matrix.postTranslate(((System.currentTimeMillis() % 2000) / 2000.0f) * this.c, 0.0f);
        this.a0.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, rh9Var.C, I(), this.c0);
        canvas.restore();
        View view = this.W;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // mg9
    public final boolean Y(MotionEvent motionEvent) {
        int i0 = i0();
        qh9 qh9Var = this.X;
        if (i0 == 0) {
            return qh9Var.t(motionEvent);
        }
        motionEvent.offsetLocation(-i0, 0.0f);
        boolean t = qh9Var.t(motionEvent);
        motionEvent.offsetLocation(i0, 0.0f);
        return t;
    }

    @Override // mg9
    public final void Z(int i, int i2, int i3) {
        super.Z(i, i2, i3);
        int i0 = i0();
        if (i0 != 0) {
            qh9 qh9Var = this.X;
            qh9Var.c = (i + i0) - qh9Var.f;
        }
    }

    @Override // mg9, jg7
    public final Layout a() {
        return this.X.b;
    }

    public final int i0() {
        rh9 rh9Var = this.a;
        if (!rh9Var.H()) {
            return 0;
        }
        int L = (rh9Var.C + rh9Var.T) - gl.L(14.0f);
        Rect rect = this.b;
        return ((L - rect.right) - rect.left) - this.X.r();
    }

    public final void j0() {
        rh9 rh9Var = this.a;
        int v0 = bkb.v0(rh9Var.D() ? bkb.Vc : bkb.Uc, rh9Var.D);
        if (this.a0 == null || this.Z != v0) {
            this.Z = v0;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.c, 0.0f, new int[]{bkb.p1(0.7f, v0), bkb.p1(0.25f, v0), bkb.p1(0.7f, v0)}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.REPEAT);
            this.a0 = linearGradient;
            Paint paint = this.c0;
            paint.setShader(linearGradient);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        }
    }

    @Override // mg9
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        mg9.m(spannableStringBuilder, this.X, this.Y);
    }

    @Override // mg9
    public final boolean s(Canvas canvas, ColorFilter colorFilter) {
        return false;
    }

    @Override // mg9
    public final boolean u(CharacterStyle characterStyle, int i, eg9 eg9Var) {
        if (!this.X.o(characterStyle, eg9Var)) {
            return false;
        }
        Rect rect = this.b;
        eg9Var.e = (i0() + rect.left) - r0.f;
        eg9Var.f = i + rect.top;
        return true;
    }
}
