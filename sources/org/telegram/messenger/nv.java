package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public abstract class nv extends ru {
    public final vv W;
    public final vv X;
    public final vv[] Y;
    public final boolean Z;

    public nv(wv wvVar, Rect rect, int i10, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, Layout.Alignment alignment) {
        super(wvVar, rect, i10);
        this.Z = alignment == Layout.Alignment.ALIGN_CENTER;
        vv vvVar = new vv(wvVar, spannableStringBuilder, this.c, alignment);
        this.W = vvVar;
        vv vvVar2 = !TextUtils.isEmpty(spannableStringBuilder2) ? new vv(wvVar, spannableStringBuilder2, this.c, alignment) : null;
        this.X = vvVar2;
        this.Y = vvVar2 == null ? new vv[]{vvVar} : new vv[]{vvVar, vvVar2};
    }

    @Override // org.telegram.messenger.ru
    public final int H() {
        Rect rect = this.b;
        int h02 = h0() + this.W.b.getHeight() + rect.top;
        vv vvVar = this.X;
        return h02 + (vvVar != null ? vvVar.b.getHeight() : 0) + rect.bottom;
    }

    @Override // org.telegram.messenger.ru
    public final int I() {
        vv vvVar = this.X;
        if (vvVar == null) {
            vvVar = this.W;
        }
        Rect rect = this.b;
        return vvVar.q() + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.ru
    public final int J() {
        Rect rect = this.b;
        int i10 = rect.left;
        int r10 = this.W.r();
        vv vvVar = this.X;
        return Math.max(r10, vvVar != null ? vvVar.r() : 0) + i10 + rect.right;
    }

    @Override // org.telegram.messenger.ru
    public final org.telegram.ui.Cells.u9[] K() {
        return this.Y;
    }

    @Override // org.telegram.messenger.ru
    public final void S() {
        this.W.i(this.V);
        vv vvVar = this.X;
        if (vvVar != null) {
            vvVar.i(this.V);
        }
    }

    @Override // org.telegram.messenger.ru
    public final void U() {
        this.W.f(this.V);
        vv vvVar = this.X;
        if (vvVar != null) {
            vvVar.f(this.V);
        }
    }

    @Override // org.telegram.messenger.ru
    public final void V(Canvas canvas) {
        canvas.save();
        vv vvVar = this.W;
        canvas.translate(i0(vvVar), 0.0f);
        vvVar.d(canvas, vvVar.S);
        canvas.restore();
        vv vvVar2 = this.X;
        if (vvVar2 != null) {
            canvas.save();
            canvas.translate(i0(vvVar2), h0() + vvVar.b.getHeight());
            vvVar2.d(canvas, vvVar2.S);
            canvas.restore();
        }
    }

    @Override // org.telegram.messenger.ru
    public final boolean X(MotionEvent motionEvent) {
        int i10;
        vv vvVar = this.W;
        int height = vvVar.b.getHeight();
        float y3 = motionEvent.getY();
        int i11 = 0;
        if (y3 < 0.0f || y3 >= height) {
            vvVar = this.X;
            if (vvVar == null || y3 < h0() + height) {
                return false;
            }
            int i02 = i0(vvVar);
            i11 = h0() + height;
            i10 = i02;
        } else {
            i10 = i0(vvVar);
        }
        motionEvent.offsetLocation(-i10, -i11);
        boolean t10 = vvVar.t(motionEvent);
        motionEvent.offsetLocation(i10, i11);
        return t10;
    }

    @Override // org.telegram.messenger.ru
    public final void Y(int i10, int i11, int i12) {
        vv vvVar = this.W;
        vvVar.c = (i0(vvVar) + i10) - vvVar.f;
        vvVar.d = i11;
        vvVar.e = i12;
        vv vvVar2 = this.X;
        if (vvVar2 != null) {
            vvVar2.c = (i0(vvVar2) + i10) - vvVar2.f;
            vvVar2.d = h0() + vvVar.b.getHeight() + i11;
            vvVar2.e = i12;
        }
    }

    @Override // org.telegram.messenger.ru, org.telegram.ui.vh0
    public final Layout a() {
        return this.W.b;
    }

    public final int h0() {
        if (this.X != null) {
            return i0.L(2.0f);
        }
        return 0;
    }

    public final int i0(vv vvVar) {
        int L;
        int r10;
        boolean z10 = this.Z;
        Rect rect = this.b;
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

    @Override // org.telegram.messenger.ru
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        ru.l(spannableStringBuilder, null, this.Y);
    }

    @Override // org.telegram.messenger.ru
    public final boolean u(CharacterStyle characterStyle, int i10, iu iuVar) {
        boolean o10 = this.W.o(characterStyle, iuVar);
        Rect rect = this.b;
        if (o10) {
            iuVar.e = (i0(r0) + rect.left) - r0.f;
            iuVar.f = i10 + rect.top;
            return true;
        }
        vv vvVar = this.X;
        if (vvVar == null || !vvVar.o(characterStyle, iuVar)) {
            return false;
        }
        iuVar.e = (i0(vvVar) + rect.left) - vvVar.f;
        iuVar.f = h0() + r0.b.getHeight() + i10 + rect.top;
        return true;
    }

    @Override // org.telegram.messenger.ru
    public final boolean v() {
        return this.Z;
    }
}
