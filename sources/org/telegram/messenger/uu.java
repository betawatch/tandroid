package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public class uu extends au {
    public final ev X;
    public final ev[] Y;
    public final boolean Z;
    public int a0;
    public int b0;
    public int c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu(fv fvVar, Rect rect, int i7, SpannableStringBuilder spannableStringBuilder) {
        super(fvVar, rect, i7);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.c0 = -1;
        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
        this.Z = false;
        ev evVar = new ev(fvVar, spannableStringBuilder, this.c, alignment);
        this.X = evVar;
        this.Y = new ev[]{evVar};
    }

    @Override // org.telegram.messenger.au
    public final int H() {
        return this.a0;
    }

    @Override // org.telegram.messenger.au
    public int I() {
        Rect rect = this.b;
        return this.X.b.getHeight() + rect.top + this.a0 + this.b0 + rect.bottom;
    }

    @Override // org.telegram.messenger.au
    public final int J() {
        Rect rect = this.b;
        return this.X.q() + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.au
    public final int K() {
        Rect rect = this.b;
        return this.X.r() + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.au
    public final org.telegram.ui.Cells.u9[] L() {
        return this.Y;
    }

    @Override // org.telegram.messenger.au
    public final void T() {
        this.X.i(this.W);
    }

    @Override // org.telegram.messenger.au
    public final void V() {
        this.X.f(this.W);
    }

    @Override // org.telegram.messenger.au
    public void W(Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, this.a0);
        int i02 = i0();
        ev evVar = this.X;
        if (i02 != 0) {
            evVar.c = (this.b.left + i02) - evVar.f;
            canvas.save();
            canvas.translate(i02, 0.0f);
            evVar.d(canvas, evVar.T);
            canvas.restore();
        } else {
            evVar.d(canvas, evVar.T);
        }
        canvas.restore();
    }

    @Override // org.telegram.messenger.au
    public final void X(Canvas canvas, int i7, float f10) {
        canvas.save();
        canvas.translate(0.0f, this.a0);
        int i02 = i0();
        ev evVar = this.X;
        if (i02 != 0) {
            evVar.c = (this.b.left + i02) - evVar.f;
            canvas.save();
            canvas.translate(i02, 0.0f);
            evVar.m(canvas, i7, f10);
            canvas.restore();
        } else {
            evVar.m(canvas, i7, f10);
        }
        canvas.restore();
    }

    @Override // org.telegram.messenger.au
    public boolean Y(MotionEvent motionEvent) {
        int i02 = i0();
        motionEvent.offsetLocation(-i02, -this.a0);
        boolean t6 = this.X.t(motionEvent);
        motionEvent.offsetLocation(i02, this.a0);
        return t6;
    }

    @Override // org.telegram.messenger.au
    public final void Z(int i7, int i10, int i11) {
        super.Z(i7, i10 + this.a0, i11);
        int i02 = i0();
        if (i02 != 0) {
            int i12 = i7 + i02;
            ev evVar = this.X;
            evVar.c = i12 - evVar.f;
        }
    }

    @Override // org.telegram.messenger.au, org.telegram.ui.wg0
    public final Layout a() {
        return this.X.b;
    }

    public final int i0() {
        int L;
        int r10;
        boolean z10 = this.Z;
        Rect rect = this.b;
        ev evVar = this.X;
        fv fvVar = this.a;
        if (z10) {
            L = (((fvVar.C + fvVar.T) - fvVar.S) - evVar.r()) / 2;
            r10 = rect.left;
        } else {
            if (!fvVar.I()) {
                return 0;
            }
            L = (((fvVar.C + fvVar.T) - g0.L(14.0f)) - rect.right) - rect.left;
            r10 = evVar.r();
        }
        return L - r10;
    }

    public final void j0(int i7, int i10) {
        this.a0 = i7;
        this.b0 = i10;
        g0();
    }

    @Override // org.telegram.messenger.au
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        au.l(spannableStringBuilder, this.X, this.Y);
    }

    @Override // org.telegram.messenger.au
    public final boolean u(CharacterStyle characterStyle, int i7, rt rtVar) {
        if (!this.X.o(characterStyle, rtVar)) {
            return false;
        }
        Rect rect = this.b;
        rtVar.e = (i0() + rect.left) - r0.f;
        rtVar.f = i7 + rect.top + this.a0;
        return true;
    }

    @Override // org.telegram.messenger.au
    public final boolean v() {
        return this.Z;
    }
}
