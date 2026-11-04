package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class ru extends xt {
    public final bv X;
    public final bv[] Y;
    public final boolean Z;
    public int a0;
    public int b0;
    public int c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru(cv cvVar, Rect rect, int i3, SpannableStringBuilder spannableStringBuilder) {
        super(cvVar, rect, i3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.c0 = -1;
        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
        this.Z = false;
        bv bvVar = new bv(cvVar, spannableStringBuilder, this.c, alignment);
        this.X = bvVar;
        this.Y = new bv[]{bvVar};
    }

    @Override // org.telegram.messenger.xt
    public final int H() {
        return this.a0;
    }

    @Override // org.telegram.messenger.xt
    public int I() {
        Rect rect = this.b;
        return this.X.b.getHeight() + rect.top + this.a0 + this.b0 + rect.bottom;
    }

    @Override // org.telegram.messenger.xt
    public final int J() {
        Rect rect = this.b;
        return this.X.q() + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.xt
    public final int K() {
        Rect rect = this.b;
        return this.X.r() + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.xt
    public final org.telegram.ui.Cells.s9[] L() {
        return this.Y;
    }

    @Override // org.telegram.messenger.xt
    public final void T() {
        this.X.i(this.W);
    }

    @Override // org.telegram.messenger.xt
    public final void V() {
        this.X.f(this.W);
    }

    @Override // org.telegram.messenger.xt
    public void W(Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, this.a0);
        int i02 = i0();
        bv bvVar = this.X;
        if (i02 != 0) {
            bvVar.c = (this.b.left + i02) - bvVar.f;
            canvas.save();
            canvas.translate(i02, 0.0f);
            bvVar.d(canvas, bvVar.T);
            canvas.restore();
        } else {
            bvVar.d(canvas, bvVar.T);
        }
        canvas.restore();
    }

    @Override // org.telegram.messenger.xt
    public final void X(Canvas canvas, int i3, float f10) {
        canvas.save();
        canvas.translate(0.0f, this.a0);
        int i02 = i0();
        bv bvVar = this.X;
        if (i02 != 0) {
            bvVar.c = (this.b.left + i02) - bvVar.f;
            canvas.save();
            canvas.translate(i02, 0.0f);
            bvVar.m(canvas, i3, f10);
            canvas.restore();
        } else {
            bvVar.m(canvas, i3, f10);
        }
        canvas.restore();
    }

    @Override // org.telegram.messenger.xt
    public boolean Y(MotionEvent motionEvent) {
        int i02 = i0();
        motionEvent.offsetLocation(-i02, -this.a0);
        boolean t10 = this.X.t(motionEvent);
        motionEvent.offsetLocation(i02, this.a0);
        return t10;
    }

    @Override // org.telegram.messenger.xt
    public final void Z(int i3, int i10, int i11) {
        super.Z(i3, i10 + this.a0, i11);
        int i02 = i0();
        if (i02 != 0) {
            int i12 = i3 + i02;
            bv bvVar = this.X;
            bvVar.c = i12 - bvVar.f;
        }
    }

    @Override // org.telegram.messenger.xt, org.telegram.ui.lg0
    public final Layout a() {
        return this.X.b;
    }

    public final int i0() {
        int L;
        int r5;
        boolean z10 = this.Z;
        Rect rect = this.b;
        bv bvVar = this.X;
        cv cvVar = this.a;
        if (z10) {
            L = (((cvVar.C + cvVar.T) - cvVar.S) - bvVar.r()) / 2;
            r5 = rect.left;
        } else {
            if (!cvVar.I()) {
                return 0;
            }
            L = (((cvVar.C + cvVar.T) - g0.L(14.0f)) - rect.right) - rect.left;
            r5 = bvVar.r();
        }
        return L - r5;
    }

    public final void j0(int i3, int i10) {
        this.a0 = i3;
        this.b0 = i10;
        g0();
    }

    @Override // org.telegram.messenger.xt
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        xt.l(spannableStringBuilder, this.X, this.Y);
    }

    @Override // org.telegram.messenger.xt
    public final boolean u(CharacterStyle characterStyle, int i3, ot otVar) {
        if (!this.X.o(characterStyle, otVar)) {
            return false;
        }
        Rect rect = this.b;
        otVar.e = (i0() + rect.left) - r0.f;
        otVar.f = i3 + rect.top + this.a0;
        return true;
    }

    @Override // org.telegram.messenger.xt
    public final boolean v() {
        return this.Z;
    }
}
