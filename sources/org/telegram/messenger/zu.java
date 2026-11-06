package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public class zu extends fu {
    public final jv W;
    public final jv[] X;
    public final boolean Y;
    public int Z;
    public int a0;
    public int b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zu(kv kvVar, Rect rect, int i7, SpannableStringBuilder spannableStringBuilder) {
        super(kvVar, rect, i7);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.b0 = -1;
        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
        this.Y = false;
        jv jvVar = new jv(kvVar, spannableStringBuilder, this.c, alignment);
        this.W = jvVar;
        this.X = new jv[]{jvVar};
    }

    @Override // org.telegram.messenger.fu
    public final int H() {
        return this.Z;
    }

    @Override // org.telegram.messenger.fu
    public int I() {
        Rect rect = this.b;
        return this.W.b.getHeight() + rect.top + this.Z + this.a0 + rect.bottom;
    }

    @Override // org.telegram.messenger.fu
    public final int J() {
        Rect rect = this.b;
        return this.W.q() + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.fu
    public final int K() {
        Rect rect = this.b;
        return this.W.r() + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.fu
    public final org.telegram.ui.Cells.t9[] L() {
        return this.X;
    }

    @Override // org.telegram.messenger.fu
    public final void T() {
        this.W.i(this.V);
    }

    @Override // org.telegram.messenger.fu
    public final void V() {
        this.W.f(this.V);
    }

    @Override // org.telegram.messenger.fu
    public void W(Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, this.Z);
        int i02 = i0();
        jv jvVar = this.W;
        if (i02 != 0) {
            jvVar.c = (this.b.left + i02) - jvVar.f;
            canvas.save();
            canvas.translate(i02, 0.0f);
            jvVar.d(canvas, jvVar.S);
            canvas.restore();
        } else {
            jvVar.d(canvas, jvVar.S);
        }
        canvas.restore();
    }

    @Override // org.telegram.messenger.fu
    public final void X(Canvas canvas, int i7, float f10) {
        canvas.save();
        canvas.translate(0.0f, this.Z);
        int i02 = i0();
        jv jvVar = this.W;
        if (i02 != 0) {
            jvVar.c = (this.b.left + i02) - jvVar.f;
            canvas.save();
            canvas.translate(i02, 0.0f);
            jvVar.m(canvas, i7, f10);
            canvas.restore();
        } else {
            jvVar.m(canvas, i7, f10);
        }
        canvas.restore();
    }

    @Override // org.telegram.messenger.fu
    public boolean Y(MotionEvent motionEvent) {
        int i02 = i0();
        motionEvent.offsetLocation(-i02, -this.Z);
        boolean t6 = this.W.t(motionEvent);
        motionEvent.offsetLocation(i02, this.Z);
        return t6;
    }

    @Override // org.telegram.messenger.fu
    public final void Z(int i7, int i10, int i11) {
        super.Z(i7, i10 + this.Z, i11);
        int i02 = i0();
        if (i02 != 0) {
            int i12 = i7 + i02;
            jv jvVar = this.W;
            jvVar.c = i12 - jvVar.f;
        }
    }

    @Override // org.telegram.messenger.fu, org.telegram.ui.rg0
    public final Layout a() {
        return this.W.b;
    }

    public final int i0() {
        int L;
        int r10;
        boolean z9 = this.Y;
        Rect rect = this.b;
        jv jvVar = this.W;
        kv kvVar = this.a;
        if (z9) {
            L = (((kvVar.C + kvVar.T) - kvVar.S) - jvVar.r()) / 2;
            r10 = rect.left;
        } else {
            if (!kvVar.I()) {
                return 0;
            }
            L = (((kvVar.C + kvVar.T) - g0.L(14.0f)) - rect.right) - rect.left;
            r10 = jvVar.r();
        }
        return L - r10;
    }

    public final void j0(int i7, int i10) {
        this.Z = i7;
        this.a0 = i10;
        g0();
    }

    @Override // org.telegram.messenger.fu
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        fu.l(spannableStringBuilder, this.W, this.X);
    }

    @Override // org.telegram.messenger.fu
    public final boolean u(CharacterStyle characterStyle, int i7, wt wtVar) {
        if (!this.W.o(characterStyle, wtVar)) {
            return false;
        }
        Rect rect = this.b;
        wtVar.e = (i0() + rect.left) - r0.f;
        wtVar.f = i7 + rect.top + this.Z;
        return true;
    }

    @Override // org.telegram.messenger.fu
    public final boolean v() {
        return this.Y;
    }
}
