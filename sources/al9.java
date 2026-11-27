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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class al9 extends dk9 {
    public final gl9 X;
    public final gl9[] Y;
    public int Z;
    public LinearGradient a0;
    public final Matrix b0;
    public final Paint c0;

    public al9(hl9 hl9Var, Rect rect, int i, SpannableStringBuilder spannableStringBuilder) {
        super(hl9Var, rect, i);
        this.b0 = new Matrix();
        this.c0 = new Paint(1);
        gl9 gl9Var = new gl9(hl9Var, spannableStringBuilder, this.c);
        this.X = gl9Var;
        this.Y = new gl9[]{gl9Var};
    }

    @Override // dk9
    public final int H() {
        Rect rect = this.b;
        return this.X.b.getHeight() + rect.top + rect.bottom;
    }

    @Override // dk9
    public final int I() {
        Rect rect = this.b;
        return this.X.q() + rect.left + rect.right;
    }

    @Override // dk9
    public final int J() {
        Rect rect = this.b;
        return this.X.r() + rect.left + rect.right;
    }

    @Override // dk9
    public final kmb[] K() {
        return this.Y;
    }

    @Override // dk9
    public final void S() {
        this.X.i(this.W);
    }

    @Override // dk9
    public final void U() {
        this.X.f(this.W);
    }

    @Override // dk9
    public final void V(Canvas canvas) {
        gl9 gl9Var = this.X;
        int i = gl9Var.f;
        hl9 hl9Var = this.a;
        canvas.saveLayerAlpha(0.0f, 0.0f, hl9Var.C, H(), jn7.d4, 31);
        int h0 = h0();
        if (h0 != 0) {
            gl9Var.c = (this.b.left + h0) - i;
            canvas.save();
            canvas.translate(h0, 0.0f);
        }
        gl9Var.d(canvas, gl9Var.T);
        if (hl9Var.E()) {
            canvas.save();
            canvas.translate(-i, 0.0f);
            hm.drawAnimatedEmojis(canvas, gl9Var.b, gl9Var.F, 0.0f, gl9Var.x, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        if (h0 != 0) {
            canvas.restore();
        }
        i0();
        Matrix matrix = this.b0;
        matrix.reset();
        matrix.postTranslate(((System.currentTimeMillis() % 2000) / 2000.0f) * this.c, 0.0f);
        this.a0.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, hl9Var.C, H(), this.c0);
        canvas.restore();
        View view = this.W;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // dk9
    public final void W(Canvas canvas, int i, float f) {
        gl9 gl9Var = this.X;
        int i2 = gl9Var.f;
        hl9 hl9Var = this.a;
        int i3 = hl9Var.C;
        TextPaint textPaint = hl9Var.w;
        canvas.saveLayerAlpha(0.0f, 0.0f, i3, H(), jn7.d4, 31);
        int h0 = h0();
        if (h0 != 0) {
            gl9Var.c = (this.b.left + h0) - i2;
        }
        canvas.save();
        canvas.translate(h0 - i2, 0.0f);
        int color = textPaint.getColor();
        textPaint.setColor(-1);
        textPaint.linkColor = aob.v0(hl9Var.D() ? aob.Yc : aob.Xc, hl9Var.D);
        ui7.b(canvas, gl9Var.b, i, f, new m88((Object) this, (Object) this.W, (byte) 24));
        canvas.restore();
        textPaint.setColor(color);
        i0();
        Matrix matrix = this.b0;
        matrix.reset();
        matrix.postTranslate(((System.currentTimeMillis() % 2000) / 2000.0f) * this.c, 0.0f);
        this.a0.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, hl9Var.C, H(), this.c0);
        canvas.restore();
        View view = this.W;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // dk9
    public final boolean X(MotionEvent motionEvent) {
        int h0 = h0();
        gl9 gl9Var = this.X;
        if (h0 == 0) {
            return gl9Var.t(motionEvent);
        }
        motionEvent.offsetLocation(-h0, 0.0f);
        boolean t = gl9Var.t(motionEvent);
        motionEvent.offsetLocation(h0, 0.0f);
        return t;
    }

    @Override // dk9
    public final void Y(int i, int i2, int i3) {
        super.Y(i, i2, i3);
        int h0 = h0();
        if (h0 != 0) {
            gl9 gl9Var = this.X;
            gl9Var.c = (i + h0) - gl9Var.f;
        }
    }

    @Override // dk9, si7
    public final Layout a() {
        return this.X.b;
    }

    public final int h0() {
        hl9 hl9Var = this.a;
        if (!hl9Var.H()) {
            return 0;
        }
        int L = (hl9Var.C + hl9Var.T) - hl.L(14.0f);
        Rect rect = this.b;
        return ((L - rect.right) - rect.left) - this.X.r();
    }

    public final void i0() {
        hl9 hl9Var = this.a;
        int v0 = aob.v0(hl9Var.D() ? aob.Wc : aob.Vc, hl9Var.D);
        if (this.a0 == null || this.Z != v0) {
            this.Z = v0;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.c, 0.0f, new int[]{aob.p1(0.7f, v0), aob.p1(0.25f, v0), aob.p1(0.7f, v0)}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.REPEAT);
            this.a0 = linearGradient;
            Paint paint = this.c0;
            paint.setShader(linearGradient);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        }
    }

    @Override // dk9
    public final void j(SpannableStringBuilder spannableStringBuilder) {
        dk9.k(spannableStringBuilder, this.X, this.Y);
    }

    @Override // dk9
    public final boolean r(Canvas canvas, ColorFilter colorFilter) {
        return false;
    }

    @Override // dk9
    public final boolean t(CharacterStyle characterStyle, int i, vj9 vj9Var) {
        if (!this.X.o(characterStyle, vj9Var)) {
            return false;
        }
        Rect rect = this.b;
        vj9Var.e = (h0() + rect.left) - r0.f;
        vj9Var.f = i + rect.top;
        return true;
    }
}
