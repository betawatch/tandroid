// default package

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class hk9 extends dk9 {
    public final gl9 X;
    public final gl9 Y;
    public final boolean Z;
    public final kmb[] a0;

    public hk9(hl9 hl9Var, Rect rect, int i, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(hl9Var, rect, i);
        gl9 gl9Var = !TextUtils.isEmpty(spannableStringBuilder) ? new gl9(hl9Var, spannableStringBuilder, this.c) : null;
        this.X = gl9Var;
        gl9 gl9Var2 = TextUtils.isEmpty(spannableStringBuilder2) ? null : new gl9(hl9Var, spannableStringBuilder2, this.c);
        this.Y = gl9Var2;
        this.Z = hl9Var.H();
        ArrayList arrayList = new ArrayList(2);
        if (gl9Var != null) {
            arrayList.add(gl9Var);
        }
        if (gl9Var2 != null) {
            arrayList.add(gl9Var2);
        }
        this.a0 = (kmb[]) arrayList.toArray(new kmb[0]);
    }

    @Override // dk9
    public final int H() {
        Rect rect = this.b;
        int i = rect.top;
        gl9 gl9Var = this.X;
        int i0 = i0() + (gl9Var != null ? gl9Var.b.getHeight() : 0) + i;
        gl9 gl9Var2 = this.Y;
        return i0 + (gl9Var2 != null ? gl9Var2.b.getHeight() : 0) + rect.bottom;
    }

    @Override // dk9
    public final int I() {
        int i;
        int i2;
        Rect rect = this.b;
        gl9 gl9Var = this.Y;
        if (gl9Var != null) {
            i = gl9Var.q() + rect.left;
            i2 = rect.right;
        } else {
            i = rect.left;
            gl9 gl9Var2 = this.X;
            if (gl9Var2 != null) {
                return gl9Var2.q() + i + rect.right;
            }
            i2 = rect.right;
        }
        return i + i2;
    }

    @Override // dk9
    public final int J() {
        gl9 gl9Var = this.X;
        int max = gl9Var != null ? Math.max(0, gl9Var.r()) : 0;
        gl9 gl9Var2 = this.Y;
        if (gl9Var2 != null) {
            max = Math.max(max, gl9Var2.r());
        }
        Rect rect = this.b;
        return rect.left + max + rect.right;
    }

    @Override // dk9
    public final kmb[] K() {
        return this.a0;
    }

    @Override // dk9
    public final void S() {
        gl9 gl9Var = this.X;
        if (gl9Var != null) {
            gl9Var.i(this.W);
        }
        gl9 gl9Var2 = this.Y;
        if (gl9Var2 != null) {
            gl9Var2.i(this.W);
        }
    }

    @Override // dk9
    public final void U() {
        gl9 gl9Var = this.X;
        if (gl9Var != null) {
            gl9Var.f(this.W);
        }
        gl9 gl9Var2 = this.Y;
        if (gl9Var2 != null) {
            gl9Var2.f(this.W);
        }
    }

    @Override // dk9
    public final void V(Canvas canvas) {
        gl9 gl9Var = this.X;
        if (gl9Var != null) {
            gl9Var.d(canvas, gl9Var.T);
        }
        gl9 gl9Var2 = this.Y;
        if (gl9Var2 != null) {
            canvas.save();
            canvas.translate(h0(), i0() + (gl9Var != null ? gl9Var.b.getHeight() : 0));
            gl9Var2.d(canvas, gl9Var2.T);
            canvas.restore();
        }
    }

    @Override // dk9
    public final boolean X(MotionEvent motionEvent) {
        gl9 gl9Var = this.X;
        int height = gl9Var != null ? gl9Var.b.getHeight() : 0;
        int i0 = i0();
        float y = motionEvent.getY();
        int i = this.b.top;
        float f = y - i;
        if (gl9Var != null && f >= 0.0f && f < height) {
            motionEvent.offsetLocation(0.0f, -i);
            boolean t = gl9Var.t(motionEvent);
            motionEvent.offsetLocation(0.0f, r5.top);
            return t;
        }
        gl9 gl9Var2 = this.Y;
        if (gl9Var2 == null || f < height + i0) {
            return false;
        }
        int h0 = h0();
        motionEvent.offsetLocation(-h0, -r6);
        boolean t2 = gl9Var2.t(motionEvent);
        motionEvent.offsetLocation(h0, i + height + i0);
        return t2;
    }

    @Override // dk9
    public final void Y(int i, int i2, int i3) {
        this.T = i;
        this.U = i2;
        this.V = i3;
        gl9 gl9Var = this.X;
        if (gl9Var != null) {
            gl9Var.c = i - gl9Var.f;
            gl9Var.d = i2;
            gl9Var.e = i3;
        }
        gl9 gl9Var2 = this.Y;
        if (gl9Var2 != null) {
            gl9Var2.c = (h0() + i) - gl9Var2.f;
            gl9Var2.d = i0() + (gl9Var != null ? gl9Var.b.getHeight() : 0) + i2;
            gl9Var2.e = i3;
        }
    }

    public final int h0() {
        gl9 gl9Var = this.Y;
        if (gl9Var == null || !this.Z) {
            return 0;
        }
        int i = this.a.C;
        Rect rect = this.b;
        return Math.max(0, ((i - rect.left) - rect.right) - gl9Var.r());
    }

    public final int i0() {
        if (this.X == null || this.Y == null) {
            return 0;
        }
        return hl.L(4.0f);
    }

    @Override // dk9
    public final void j(SpannableStringBuilder spannableStringBuilder) {
        StaticLayout staticLayout;
        dk9.k(spannableStringBuilder, this.X, null);
        gl9 gl9Var = this.Y;
        if (gl9Var == null || (staticLayout = gl9Var.b) == null || TextUtils.isEmpty(staticLayout.getText())) {
            return;
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            spannableStringBuilder.append('\n');
        }
        spannableStringBuilder.append(staticLayout.getText());
    }

    @Override // dk9
    public final boolean u() {
        return false;
    }
}
