package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public class xu extends cu {
    public final hv X;
    public final hv[] Y;
    public final boolean Z;
    public int a0;
    public int b0;
    public int c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu(iv ivVar, Rect rect, int i7, SpannableStringBuilder spannableStringBuilder) {
        super(ivVar, rect, i7);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.c0 = -1;
        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
        this.Z = false;
        hv hvVar = new hv(ivVar, spannableStringBuilder, this.c, alignment);
        this.X = hvVar;
        this.Y = new hv[]{hvVar};
    }

    @Override // org.telegram.messenger.cu
    public final int H() {
        return this.a0;
    }

    @Override // org.telegram.messenger.cu
    public int I() {
        Rect rect = this.b;
        return this.X.b.getHeight() + rect.top + this.a0 + this.b0 + rect.bottom;
    }

    @Override // org.telegram.messenger.cu
    public final int J() {
        Rect rect = this.b;
        return this.X.q() + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.cu
    public final int K() {
        Rect rect = this.b;
        return this.X.r() + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.cu
    public final org.telegram.ui.Cells.s9[] L() {
        return this.Y;
    }

    @Override // org.telegram.messenger.cu
    public final void T() {
        this.X.i(this.W);
    }

    @Override // org.telegram.messenger.cu
    public final void V() {
        this.X.f(this.W);
    }

    @Override // org.telegram.messenger.cu
    public void W(Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, this.a0);
        int i02 = i0();
        hv hvVar = this.X;
        if (i02 != 0) {
            hvVar.c = (this.b.left + i02) - hvVar.f;
            canvas.save();
            canvas.translate(i02, 0.0f);
            hvVar.d(canvas, hvVar.T);
            canvas.restore();
        } else {
            hvVar.d(canvas, hvVar.T);
        }
        canvas.restore();
    }

    @Override // org.telegram.messenger.cu
    public final void X(Canvas canvas, int i7, float f10) {
        canvas.save();
        canvas.translate(0.0f, this.a0);
        int i02 = i0();
        hv hvVar = this.X;
        if (i02 != 0) {
            hvVar.c = (this.b.left + i02) - hvVar.f;
            canvas.save();
            canvas.translate(i02, 0.0f);
            hvVar.m(canvas, i7, f10);
            canvas.restore();
        } else {
            hvVar.m(canvas, i7, f10);
        }
        canvas.restore();
    }

    @Override // org.telegram.messenger.cu
    public boolean Y(MotionEvent motionEvent) {
        int i02 = i0();
        motionEvent.offsetLocation(-i02, -this.a0);
        boolean t6 = this.X.t(motionEvent);
        motionEvent.offsetLocation(i02, this.a0);
        return t6;
    }

    @Override // org.telegram.messenger.cu
    public final void Z(int i7, int i10, int i11) {
        super.Z(i7, i10 + this.a0, i11);
        int i02 = i0();
        if (i02 != 0) {
            int i12 = i7 + i02;
            hv hvVar = this.X;
            hvVar.c = i12 - hvVar.f;
        }
    }

    @Override // org.telegram.messenger.cu, org.telegram.ui.rg0
    public final Layout a() {
        return this.X.b;
    }

    public final int i0() {
        int L;
        int r10;
        boolean z10 = this.Z;
        Rect rect = this.b;
        hv hvVar = this.X;
        iv ivVar = this.a;
        if (z10) {
            L = (((ivVar.C + ivVar.T) - ivVar.S) - hvVar.r()) / 2;
            r10 = rect.left;
        } else {
            if (!ivVar.I()) {
                return 0;
            }
            L = (((ivVar.C + ivVar.T) - g0.L(14.0f)) - rect.right) - rect.left;
            r10 = hvVar.r();
        }
        return L - r10;
    }

    public final void j0(int i7, int i10) {
        this.a0 = i7;
        this.b0 = i10;
        g0();
    }

    @Override // org.telegram.messenger.cu
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        cu.l(spannableStringBuilder, this.X, this.Y);
    }

    @Override // org.telegram.messenger.cu
    public final boolean u(CharacterStyle characterStyle, int i7, tt ttVar) {
        if (!this.X.o(characterStyle, ttVar)) {
            return false;
        }
        Rect rect = this.b;
        ttVar.e = (i0() + rect.left) - r0.f;
        ttVar.f = i7 + rect.top + this.a0;
        return true;
    }

    @Override // org.telegram.messenger.cu
    public final boolean v() {
        return this.Z;
    }
}
