// default package

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class hh9 extends mg9 {
    public final qh9 X;
    public final qh9[] Y;
    public final boolean Z;
    public int a0;
    public int b0;
    public int c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh9(rh9 rh9Var, Rect rect, int i, SpannableStringBuilder spannableStringBuilder) {
        super(rh9Var, rect, i);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.c0 = -1;
        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
        this.Z = false;
        qh9 qh9Var = new qh9(rh9Var, spannableStringBuilder, this.c, alignment);
        this.X = qh9Var;
        this.Y = new qh9[]{qh9Var};
    }

    @Override // mg9
    public final int H() {
        return this.a0;
    }

    @Override // mg9
    public int I() {
        Rect rect = this.b;
        return this.X.b.getHeight() + rect.top + this.a0 + this.b0 + rect.bottom;
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
    public void W(Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, this.a0);
        int i0 = i0();
        qh9 qh9Var = this.X;
        if (i0 != 0) {
            qh9Var.c = (this.b.left + i0) - qh9Var.f;
            canvas.save();
            canvas.translate(i0, 0.0f);
            qh9Var.d(canvas, qh9Var.T);
            canvas.restore();
        } else {
            qh9Var.d(canvas, qh9Var.T);
        }
        canvas.restore();
    }

    @Override // mg9
    public final void X(Canvas canvas, int i, float f) {
        canvas.save();
        canvas.translate(0.0f, this.a0);
        int i0 = i0();
        qh9 qh9Var = this.X;
        if (i0 != 0) {
            qh9Var.c = (this.b.left + i0) - qh9Var.f;
            canvas.save();
            canvas.translate(i0, 0.0f);
            qh9Var.m(canvas, i, f);
            canvas.restore();
        } else {
            qh9Var.m(canvas, i, f);
        }
        canvas.restore();
    }

    @Override // mg9
    public boolean Y(MotionEvent motionEvent) {
        int i0 = i0();
        motionEvent.offsetLocation(-i0, -this.a0);
        boolean t = this.X.t(motionEvent);
        motionEvent.offsetLocation(i0, this.a0);
        return t;
    }

    @Override // mg9
    public final void Z(int i, int i2, int i3) {
        super.Z(i, i2 + this.a0, i3);
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
        int L;
        int r;
        Rect rect = this.b;
        qh9 qh9Var = this.X;
        boolean z = this.Z;
        rh9 rh9Var = this.a;
        if (z) {
            L = (((rh9Var.C + rh9Var.T) - rh9Var.S) - qh9Var.r()) / 2;
            r = rect.left;
        } else {
            if (!rh9Var.H()) {
                return 0;
            }
            L = (((rh9Var.C + rh9Var.T) - gl.L(14.0f)) - rect.right) - rect.left;
            r = qh9Var.r();
        }
        return L - r;
    }

    public final void j0(int i, int i2) {
        this.a0 = i;
        this.b0 = i2;
        g0();
    }

    @Override // mg9
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        mg9.m(spannableStringBuilder, this.X, this.Y);
    }

    @Override // mg9
    public final boolean u(CharacterStyle characterStyle, int i, eg9 eg9Var) {
        if (!this.X.o(characterStyle, eg9Var)) {
            return false;
        }
        Rect rect = this.b;
        eg9Var.e = (i0() + rect.left) - r0.f;
        eg9Var.f = i + rect.top + this.a0;
        return true;
    }

    @Override // mg9
    public final boolean v() {
        return this.Z;
    }
}
