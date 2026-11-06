package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public abstract class bv extends fu {
    public final jv W;
    public final jv X;
    public final jv[] Y;
    public final boolean Z;

    public bv(kv kvVar, Rect rect, int i7, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, Layout.Alignment alignment) {
        super(kvVar, rect, i7);
        this.Z = alignment == Layout.Alignment.ALIGN_CENTER;
        jv jvVar = new jv(kvVar, spannableStringBuilder, this.c, alignment);
        this.W = jvVar;
        jv jvVar2 = !TextUtils.isEmpty(spannableStringBuilder2) ? new jv(kvVar, spannableStringBuilder2, this.c, alignment) : null;
        this.X = jvVar2;
        this.Y = jvVar2 == null ? new jv[]{jvVar} : new jv[]{jvVar, jvVar2};
    }

    @Override // org.telegram.messenger.fu
    public final int I() {
        Rect rect = this.b;
        int i02 = i0() + this.W.b.getHeight() + rect.top;
        jv jvVar = this.X;
        return i02 + (jvVar != null ? jvVar.b.getHeight() : 0) + rect.bottom;
    }

    @Override // org.telegram.messenger.fu
    public final int J() {
        jv jvVar = this.X;
        if (jvVar == null) {
            jvVar = this.W;
        }
        Rect rect = this.b;
        return jvVar.q() + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.fu
    public final int K() {
        Rect rect = this.b;
        int i7 = rect.left;
        int r10 = this.W.r();
        jv jvVar = this.X;
        return Math.max(r10, jvVar != null ? jvVar.r() : 0) + i7 + rect.right;
    }

    @Override // org.telegram.messenger.fu
    public final org.telegram.ui.Cells.t9[] L() {
        return this.Y;
    }

    @Override // org.telegram.messenger.fu
    public final void T() {
        this.W.i(this.V);
        jv jvVar = this.X;
        if (jvVar != null) {
            jvVar.i(this.V);
        }
    }

    @Override // org.telegram.messenger.fu
    public final void V() {
        this.W.f(this.V);
        jv jvVar = this.X;
        if (jvVar != null) {
            jvVar.f(this.V);
        }
    }

    @Override // org.telegram.messenger.fu
    public final void W(Canvas canvas) {
        canvas.save();
        jv jvVar = this.W;
        canvas.translate(j0(jvVar), 0.0f);
        jvVar.d(canvas, jvVar.S);
        canvas.restore();
        jv jvVar2 = this.X;
        if (jvVar2 != null) {
            canvas.save();
            canvas.translate(j0(jvVar2), i0() + jvVar.b.getHeight());
            jvVar2.d(canvas, jvVar2.S);
            canvas.restore();
        }
    }

    @Override // org.telegram.messenger.fu
    public final boolean Y(MotionEvent motionEvent) {
        int i7;
        jv jvVar = this.W;
        int height = jvVar.b.getHeight();
        float y10 = motionEvent.getY();
        int i10 = 0;
        if (y10 < 0.0f || y10 >= height) {
            jvVar = this.X;
            if (jvVar == null || y10 < i0() + height) {
                return false;
            }
            int j02 = j0(jvVar);
            i10 = i0() + height;
            i7 = j02;
        } else {
            i7 = j0(jvVar);
        }
        motionEvent.offsetLocation(-i7, -i10);
        boolean t6 = jvVar.t(motionEvent);
        motionEvent.offsetLocation(i7, i10);
        return t6;
    }

    @Override // org.telegram.messenger.fu
    public final void Z(int i7, int i10, int i11) {
        jv jvVar = this.W;
        jvVar.c = (j0(jvVar) + i7) - jvVar.f;
        jvVar.d = i10;
        jvVar.e = i11;
        jv jvVar2 = this.X;
        if (jvVar2 != null) {
            jvVar2.c = (j0(jvVar2) + i7) - jvVar2.f;
            jvVar2.d = i0() + jvVar.b.getHeight() + i10;
            jvVar2.e = i11;
        }
    }

    @Override // org.telegram.messenger.fu, org.telegram.ui.rg0
    public final Layout a() {
        return this.W.b;
    }

    public final int i0() {
        if (this.X != null) {
            return g0.L(2.0f);
        }
        return 0;
    }

    public final int j0(jv jvVar) {
        int L;
        int r10;
        boolean z9 = this.Z;
        Rect rect = this.b;
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

    @Override // org.telegram.messenger.fu
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        fu.l(spannableStringBuilder, null, this.Y);
    }

    @Override // org.telegram.messenger.fu
    public final boolean u(CharacterStyle characterStyle, int i7, wt wtVar) {
        boolean o4 = this.W.o(characterStyle, wtVar);
        Rect rect = this.b;
        if (o4) {
            wtVar.e = (j0(r0) + rect.left) - r0.f;
            wtVar.f = i7 + rect.top;
            return true;
        }
        jv jvVar = this.X;
        if (jvVar == null || !jvVar.o(characterStyle, wtVar)) {
            return false;
        }
        wtVar.e = (j0(jvVar) + rect.left) - jvVar.f;
        wtVar.f = i0() + r0.b.getHeight() + i7 + rect.top;
        return true;
    }

    @Override // org.telegram.messenger.fu
    public final boolean v() {
        return this.Z;
    }
}
