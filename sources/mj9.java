// default package

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class mj9 extends qi9 {
    public final tj9 X;
    public final tj9 Y;
    public final tj9[] Z;
    public final boolean a0;

    public mj9(uj9 uj9Var, Rect rect, int i, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, Layout.Alignment alignment) {
        super(uj9Var, rect, i);
        this.a0 = alignment == Layout.Alignment.ALIGN_CENTER;
        tj9 tj9Var = new tj9(uj9Var, spannableStringBuilder, this.c, alignment);
        this.X = tj9Var;
        tj9 tj9Var2 = !TextUtils.isEmpty(spannableStringBuilder2) ? new tj9(uj9Var, spannableStringBuilder2, this.c, alignment) : null;
        this.Y = tj9Var2;
        this.Z = tj9Var2 == null ? new tj9[]{tj9Var} : new tj9[]{tj9Var, tj9Var2};
    }

    @Override // qi9
    public final int H() {
        Rect rect = this.b;
        int h0 = h0() + this.X.b.getHeight() + rect.top;
        tj9 tj9Var = this.Y;
        return h0 + (tj9Var != null ? tj9Var.b.getHeight() : 0) + rect.bottom;
    }

    @Override // qi9
    public final int I() {
        tj9 tj9Var = this.Y;
        if (tj9Var == null) {
            tj9Var = this.X;
        }
        Rect rect = this.b;
        return tj9Var.q() + rect.left + rect.right;
    }

    @Override // qi9
    public final int J() {
        Rect rect = this.b;
        int i = rect.left;
        int r = this.X.r();
        tj9 tj9Var = this.Y;
        return Math.max(r, tj9Var != null ? tj9Var.r() : 0) + i + rect.right;
    }

    @Override // qi9
    public final qkb[] K() {
        return this.Z;
    }

    @Override // qi9
    public final void S() {
        this.X.i(this.W);
        tj9 tj9Var = this.Y;
        if (tj9Var != null) {
            tj9Var.i(this.W);
        }
    }

    @Override // qi9
    public final void U() {
        this.X.f(this.W);
        tj9 tj9Var = this.Y;
        if (tj9Var != null) {
            tj9Var.f(this.W);
        }
    }

    @Override // qi9
    public final void V(Canvas canvas) {
        canvas.save();
        tj9 tj9Var = this.X;
        canvas.translate(i0(tj9Var), 0.0f);
        tj9Var.d(canvas, tj9Var.T);
        canvas.restore();
        tj9 tj9Var2 = this.Y;
        if (tj9Var2 != null) {
            canvas.save();
            canvas.translate(i0(tj9Var2), h0() + tj9Var.b.getHeight());
            tj9Var2.d(canvas, tj9Var2.T);
            canvas.restore();
        }
    }

    @Override // qi9
    public final boolean X(MotionEvent motionEvent) {
        int i;
        tj9 tj9Var = this.X;
        int height = tj9Var.b.getHeight();
        float y = motionEvent.getY();
        int i2 = 0;
        if (y < 0.0f || y >= height) {
            tj9Var = this.Y;
            if (tj9Var == null || y < h0() + height) {
                return false;
            }
            int i0 = i0(tj9Var);
            i2 = h0() + height;
            i = i0;
        } else {
            i = i0(tj9Var);
        }
        motionEvent.offsetLocation(-i, -i2);
        boolean t = tj9Var.t(motionEvent);
        motionEvent.offsetLocation(i, i2);
        return t;
    }

    @Override // qi9
    public final void Y(int i, int i2, int i3) {
        tj9 tj9Var = this.X;
        tj9Var.c = (i0(tj9Var) + i) - tj9Var.f;
        tj9Var.d = i2;
        tj9Var.e = i3;
        tj9 tj9Var2 = this.Y;
        if (tj9Var2 != null) {
            tj9Var2.c = (i0(tj9Var2) + i) - tj9Var2.f;
            tj9Var2.d = h0() + tj9Var.b.getHeight() + i2;
            tj9Var2.e = i3;
        }
    }

    @Override // qi9, mi7
    public final Layout a() {
        return this.X.b;
    }

    public final int h0() {
        if (this.Y != null) {
            return gm.L(2.0f);
        }
        return 0;
    }

    public final int i0(tj9 tj9Var) {
        int L;
        int r;
        Rect rect = this.b;
        boolean z = this.a0;
        uj9 uj9Var = this.a;
        if (z) {
            L = (((uj9Var.C + uj9Var.T) - uj9Var.S) - tj9Var.r()) / 2;
            r = rect.left;
        } else {
            if (!uj9Var.H()) {
                return 0;
            }
            L = (((uj9Var.C + uj9Var.T) - gm.L(14.0f)) - rect.right) - rect.left;
            r = tj9Var.r();
        }
        return L - r;
    }

    @Override // qi9
    public final void j(SpannableStringBuilder spannableStringBuilder) {
        qi9.k(spannableStringBuilder, null, this.Z);
    }

    @Override // qi9
    public final boolean t(CharacterStyle characterStyle, int i, ii9 ii9Var) {
        boolean o = this.X.o(characterStyle, ii9Var);
        Rect rect = this.b;
        if (o) {
            ii9Var.e = (i0(r0) + rect.left) - r0.f;
            ii9Var.f = i + rect.top;
            return true;
        }
        tj9 tj9Var = this.Y;
        if (tj9Var == null || !tj9Var.o(characterStyle, ii9Var)) {
            return false;
        }
        ii9Var.e = (i0(tj9Var) + rect.left) - tj9Var.f;
        ii9Var.f = h0() + r0.b.getHeight() + i + rect.top;
        return true;
    }

    @Override // qi9
    public final boolean u() {
        return this.a0;
    }
}
