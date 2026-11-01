package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public class lv extends ru {
    public final vv W;
    public final vv[] X;
    public final boolean Y;
    public int Z;
    public int a0;
    public int b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv(wv wvVar, Rect rect, int i10, SpannableStringBuilder spannableStringBuilder) {
        super(wvVar, rect, i10);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.b0 = -1;
        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
        this.Y = false;
        vv vvVar = new vv(wvVar, spannableStringBuilder, this.c, alignment);
        this.W = vvVar;
        this.X = new vv[]{vvVar};
    }

    @Override // org.telegram.messenger.ru
    public final int G() {
        return this.Z;
    }

    @Override // org.telegram.messenger.ru
    public int H() {
        Rect rect = this.b;
        return this.W.b.getHeight() + rect.top + this.Z + this.a0 + rect.bottom;
    }

    @Override // org.telegram.messenger.ru
    public final int I() {
        Rect rect = this.b;
        return this.W.q() + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.ru
    public final int J() {
        Rect rect = this.b;
        return this.W.r() + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.ru
    public final org.telegram.ui.Cells.u9[] K() {
        return this.X;
    }

    @Override // org.telegram.messenger.ru
    public final void S() {
        this.W.i(this.V);
    }

    @Override // org.telegram.messenger.ru
    public final void U() {
        this.W.f(this.V);
    }

    @Override // org.telegram.messenger.ru
    public void V(Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, this.Z);
        int h02 = h0();
        vv vvVar = this.W;
        if (h02 != 0) {
            vvVar.c = (this.b.left + h02) - vvVar.f;
            canvas.save();
            canvas.translate(h02, 0.0f);
            vvVar.d(canvas, vvVar.S);
            canvas.restore();
        } else {
            vvVar.d(canvas, vvVar.S);
        }
        canvas.restore();
    }

    @Override // org.telegram.messenger.ru
    public final void W(Canvas canvas, int i10, float f7) {
        canvas.save();
        canvas.translate(0.0f, this.Z);
        int h02 = h0();
        vv vvVar = this.W;
        if (h02 != 0) {
            vvVar.c = (this.b.left + h02) - vvVar.f;
            canvas.save();
            canvas.translate(h02, 0.0f);
            vvVar.m(canvas, i10, f7);
            canvas.restore();
        } else {
            vvVar.m(canvas, i10, f7);
        }
        canvas.restore();
    }

    @Override // org.telegram.messenger.ru
    public boolean X(MotionEvent motionEvent) {
        int h02 = h0();
        motionEvent.offsetLocation(-h02, -this.Z);
        boolean t10 = this.W.t(motionEvent);
        motionEvent.offsetLocation(h02, this.Z);
        return t10;
    }

    @Override // org.telegram.messenger.ru
    public final void Y(int i10, int i11, int i12) {
        super.Y(i10, i11 + this.Z, i12);
        int h02 = h0();
        if (h02 != 0) {
            int i13 = i10 + h02;
            vv vvVar = this.W;
            vvVar.c = i13 - vvVar.f;
        }
    }

    @Override // org.telegram.messenger.ru, org.telegram.ui.vh0
    public final Layout a() {
        return this.W.b;
    }

    public final int h0() {
        int L;
        int r10;
        boolean z10 = this.Y;
        Rect rect = this.b;
        vv vvVar = this.W;
        wv wvVar = this.a;
        if (z10) {
            L = (((wvVar.C + wvVar.T) - wvVar.S) - vvVar.r()) / 2;
            r10 = rect.left;
        } else {
            if (!wvVar.I()) {
                return 0;
            }
            L = (((wvVar.C + wvVar.T) - i0.L(14.0f)) - rect.right) - rect.left;
            r10 = vvVar.r();
        }
        return L - r10;
    }

    public final void i0(int i10, int i11) {
        this.Z = i10;
        this.a0 = i11;
        f0();
    }

    @Override // org.telegram.messenger.ru
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        ru.l(spannableStringBuilder, this.W, this.X);
    }

    @Override // org.telegram.messenger.ru
    public final boolean u(CharacterStyle characterStyle, int i10, iu iuVar) {
        if (!this.W.o(characterStyle, iuVar)) {
            return false;
        }
        Rect rect = this.b;
        iuVar.e = (h0() + rect.left) - r0.f;
        iuVar.f = i10 + rect.top + this.Z;
        return true;
    }

    @Override // org.telegram.messenger.ru
    public final boolean v() {
        return this.Y;
    }
}
