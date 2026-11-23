package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public abstract class wu extends au {
    public final ev X;
    public final ev Y;
    public final ev[] Z;
    public final boolean a0;

    public wu(fv fvVar, Rect rect, int i7, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, Layout.Alignment alignment) {
        super(fvVar, rect, i7);
        this.a0 = alignment == Layout.Alignment.ALIGN_CENTER;
        ev evVar = new ev(fvVar, spannableStringBuilder, this.c, alignment);
        this.X = evVar;
        ev evVar2 = !TextUtils.isEmpty(spannableStringBuilder2) ? new ev(fvVar, spannableStringBuilder2, this.c, alignment) : null;
        this.Y = evVar2;
        this.Z = evVar2 == null ? new ev[]{evVar} : new ev[]{evVar, evVar2};
    }

    @Override // org.telegram.messenger.au
    public final int I() {
        Rect rect = this.b;
        int i02 = i0() + this.X.b.getHeight() + rect.top;
        ev evVar = this.Y;
        return i02 + (evVar != null ? evVar.b.getHeight() : 0) + rect.bottom;
    }

    @Override // org.telegram.messenger.au
    public final int J() {
        ev evVar = this.Y;
        if (evVar == null) {
            evVar = this.X;
        }
        Rect rect = this.b;
        return evVar.q() + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.au
    public final int K() {
        Rect rect = this.b;
        int i7 = rect.left;
        int r10 = this.X.r();
        ev evVar = this.Y;
        return Math.max(r10, evVar != null ? evVar.r() : 0) + i7 + rect.right;
    }

    @Override // org.telegram.messenger.au
    public final org.telegram.ui.Cells.u9[] L() {
        return this.Z;
    }

    @Override // org.telegram.messenger.au
    public final void T() {
        this.X.i(this.W);
        ev evVar = this.Y;
        if (evVar != null) {
            evVar.i(this.W);
        }
    }

    @Override // org.telegram.messenger.au
    public final void V() {
        this.X.f(this.W);
        ev evVar = this.Y;
        if (evVar != null) {
            evVar.f(this.W);
        }
    }

    @Override // org.telegram.messenger.au
    public final void W(Canvas canvas) {
        canvas.save();
        ev evVar = this.X;
        canvas.translate(j0(evVar), 0.0f);
        evVar.d(canvas, evVar.T);
        canvas.restore();
        ev evVar2 = this.Y;
        if (evVar2 != null) {
            canvas.save();
            canvas.translate(j0(evVar2), i0() + evVar.b.getHeight());
            evVar2.d(canvas, evVar2.T);
            canvas.restore();
        }
    }

    @Override // org.telegram.messenger.au
    public final boolean Y(MotionEvent motionEvent) {
        int i7;
        ev evVar = this.X;
        int height = evVar.b.getHeight();
        float y10 = motionEvent.getY();
        int i10 = 0;
        if (y10 < 0.0f || y10 >= height) {
            evVar = this.Y;
            if (evVar == null || y10 < i0() + height) {
                return false;
            }
            int j02 = j0(evVar);
            i10 = i0() + height;
            i7 = j02;
        } else {
            i7 = j0(evVar);
        }
        motionEvent.offsetLocation(-i7, -i10);
        boolean t6 = evVar.t(motionEvent);
        motionEvent.offsetLocation(i7, i10);
        return t6;
    }

    @Override // org.telegram.messenger.au
    public final void Z(int i7, int i10, int i11) {
        ev evVar = this.X;
        evVar.c = (j0(evVar) + i7) - evVar.f;
        evVar.d = i10;
        evVar.e = i11;
        ev evVar2 = this.Y;
        if (evVar2 != null) {
            evVar2.c = (j0(evVar2) + i7) - evVar2.f;
            evVar2.d = i0() + evVar.b.getHeight() + i10;
            evVar2.e = i11;
        }
    }

    @Override // org.telegram.messenger.au, org.telegram.ui.wg0
    public final Layout a() {
        return this.X.b;
    }

    public final int i0() {
        if (this.Y != null) {
            return g0.L(2.0f);
        }
        return 0;
    }

    public final int j0(ev evVar) {
        int L;
        int r10;
        boolean z10 = this.a0;
        Rect rect = this.b;
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

    @Override // org.telegram.messenger.au
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        au.l(spannableStringBuilder, null, this.Z);
    }

    @Override // org.telegram.messenger.au
    public final boolean u(CharacterStyle characterStyle, int i7, rt rtVar) {
        boolean o4 = this.X.o(characterStyle, rtVar);
        Rect rect = this.b;
        if (o4) {
            rtVar.e = (j0(r0) + rect.left) - r0.f;
            rtVar.f = i7 + rect.top;
            return true;
        }
        ev evVar = this.Y;
        if (evVar == null || !evVar.o(characterStyle, rtVar)) {
            return false;
        }
        rtVar.e = (j0(evVar) + rect.left) - evVar.f;
        rtVar.f = i0() + r0.b.getHeight() + i7 + rect.top;
        return true;
    }

    @Override // org.telegram.messenger.au
    public final boolean v() {
        return this.a0;
    }
}
