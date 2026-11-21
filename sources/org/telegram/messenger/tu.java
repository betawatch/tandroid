package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public class tu extends zt {
    public final dv X;
    public final dv[] Y;
    public final boolean Z;
    public int a0;
    public int b0;
    public int c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu(ev evVar, Rect rect, int i7, SpannableStringBuilder spannableStringBuilder) {
        super(evVar, rect, i7);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.c0 = -1;
        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
        this.Z = false;
        dv dvVar = new dv(evVar, spannableStringBuilder, this.c, alignment);
        this.X = dvVar;
        this.Y = new dv[]{dvVar};
    }

    @Override // org.telegram.messenger.zt
    public final int H() {
        return this.a0;
    }

    @Override // org.telegram.messenger.zt
    public int I() {
        Rect rect = this.b;
        return this.X.b.getHeight() + rect.top + this.a0 + this.b0 + rect.bottom;
    }

    @Override // org.telegram.messenger.zt
    public final int J() {
        Rect rect = this.b;
        return this.X.q() + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.zt
    public final int K() {
        Rect rect = this.b;
        return this.X.r() + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.zt
    public final org.telegram.ui.Cells.u9[] L() {
        return this.Y;
    }

    @Override // org.telegram.messenger.zt
    public final void T() {
        this.X.i(this.W);
    }

    @Override // org.telegram.messenger.zt
    public final void V() {
        this.X.f(this.W);
    }

    @Override // org.telegram.messenger.zt
    public void W(Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, this.a0);
        int i02 = i0();
        dv dvVar = this.X;
        if (i02 != 0) {
            dvVar.c = (this.b.left + i02) - dvVar.f;
            canvas.save();
            canvas.translate(i02, 0.0f);
            dvVar.d(canvas, dvVar.T);
            canvas.restore();
        } else {
            dvVar.d(canvas, dvVar.T);
        }
        canvas.restore();
    }

    @Override // org.telegram.messenger.zt
    public final void X(Canvas canvas, int i7, float f10) {
        canvas.save();
        canvas.translate(0.0f, this.a0);
        int i02 = i0();
        dv dvVar = this.X;
        if (i02 != 0) {
            dvVar.c = (this.b.left + i02) - dvVar.f;
            canvas.save();
            canvas.translate(i02, 0.0f);
            dvVar.m(canvas, i7, f10);
            canvas.restore();
        } else {
            dvVar.m(canvas, i7, f10);
        }
        canvas.restore();
    }

    @Override // org.telegram.messenger.zt
    public boolean Y(MotionEvent motionEvent) {
        int i02 = i0();
        motionEvent.offsetLocation(-i02, -this.a0);
        boolean t6 = this.X.t(motionEvent);
        motionEvent.offsetLocation(i02, this.a0);
        return t6;
    }

    @Override // org.telegram.messenger.zt
    public final void Z(int i7, int i10, int i11) {
        super.Z(i7, i10 + this.a0, i11);
        int i02 = i0();
        if (i02 != 0) {
            int i12 = i7 + i02;
            dv dvVar = this.X;
            dvVar.c = i12 - dvVar.f;
        }
    }

    @Override // org.telegram.messenger.zt, org.telegram.ui.wg0
    public final Layout a() {
        return this.X.b;
    }

    public final int i0() {
        int L;
        int r10;
        boolean z10 = this.Z;
        Rect rect = this.b;
        dv dvVar = this.X;
        ev evVar = this.a;
        if (z10) {
            L = (((evVar.C + evVar.T) - evVar.S) - dvVar.r()) / 2;
            r10 = rect.left;
        } else {
            if (!evVar.I()) {
                return 0;
            }
            L = (((evVar.C + evVar.T) - g0.L(14.0f)) - rect.right) - rect.left;
            r10 = dvVar.r();
        }
        return L - r10;
    }

    public final void j0(int i7, int i10) {
        this.a0 = i7;
        this.b0 = i10;
        g0();
    }

    @Override // org.telegram.messenger.zt
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        zt.l(spannableStringBuilder, this.X, this.Y);
    }

    @Override // org.telegram.messenger.zt
    public final boolean u(CharacterStyle characterStyle, int i7, qt qtVar) {
        if (!this.X.o(characterStyle, qtVar)) {
            return false;
        }
        Rect rect = this.b;
        qtVar.e = (i0() + rect.left) - r0.f;
        qtVar.f = i7 + rect.top + this.a0;
        return true;
    }

    @Override // org.telegram.messenger.zt
    public final boolean v() {
        return this.Z;
    }
}
