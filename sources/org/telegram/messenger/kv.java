package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class kv extends qu {
    public final uv W;
    public final uv[] X;
    public final boolean Y;
    public int Z;
    public int a0;
    public int b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv(vv vvVar, Rect rect, int i10, SpannableStringBuilder spannableStringBuilder) {
        super(vvVar, rect, i10);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.b0 = -1;
        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
        this.Y = false;
        uv uvVar = new uv(vvVar, spannableStringBuilder, this.c, alignment);
        this.W = uvVar;
        this.X = new uv[]{uvVar};
    }

    @Override // org.telegram.messenger.qu
    public final int G() {
        return this.Z;
    }

    @Override // org.telegram.messenger.qu
    public int H() {
        Rect rect = this.b;
        return this.W.b.getHeight() + rect.top + this.Z + this.a0 + rect.bottom;
    }

    @Override // org.telegram.messenger.qu
    public final int I() {
        Rect rect = this.b;
        return this.W.q() + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.qu
    public final int J() {
        Rect rect = this.b;
        return this.W.r() + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.qu
    public final org.telegram.ui.Cells.u9[] K() {
        return this.X;
    }

    @Override // org.telegram.messenger.qu
    public final void S() {
        this.W.i(this.V);
    }

    @Override // org.telegram.messenger.qu
    public final void U() {
        this.W.f(this.V);
    }

    @Override // org.telegram.messenger.qu
    public void V(Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, this.Z);
        int h02 = h0();
        uv uvVar = this.W;
        if (h02 != 0) {
            uvVar.c = (this.b.left + h02) - uvVar.f;
            canvas.save();
            canvas.translate(h02, 0.0f);
            uvVar.d(canvas, uvVar.S);
            canvas.restore();
        } else {
            uvVar.d(canvas, uvVar.S);
        }
        canvas.restore();
    }

    @Override // org.telegram.messenger.qu
    public final void W(Canvas canvas, int i10, float f7) {
        canvas.save();
        canvas.translate(0.0f, this.Z);
        int h02 = h0();
        uv uvVar = this.W;
        if (h02 != 0) {
            uvVar.c = (this.b.left + h02) - uvVar.f;
            canvas.save();
            canvas.translate(h02, 0.0f);
            uvVar.m(canvas, i10, f7);
            canvas.restore();
        } else {
            uvVar.m(canvas, i10, f7);
        }
        canvas.restore();
    }

    @Override // org.telegram.messenger.qu
    public boolean X(MotionEvent motionEvent) {
        int h02 = h0();
        motionEvent.offsetLocation(-h02, -this.Z);
        boolean t10 = this.W.t(motionEvent);
        motionEvent.offsetLocation(h02, this.Z);
        return t10;
    }

    @Override // org.telegram.messenger.qu
    public final void Y(int i10, int i11, int i12) {
        super.Y(i10, i11 + this.Z, i12);
        int h02 = h0();
        if (h02 != 0) {
            int i13 = i10 + h02;
            uv uvVar = this.W;
            uvVar.c = i13 - uvVar.f;
        }
    }

    @Override // org.telegram.messenger.qu, org.telegram.ui.xh0
    public final Layout a() {
        return this.W.b;
    }

    public final int h0() {
        int L;
        int r10;
        boolean z10 = this.Y;
        Rect rect = this.b;
        uv uvVar = this.W;
        vv vvVar = this.a;
        if (z10) {
            L = (((vvVar.C + vvVar.T) - vvVar.S) - uvVar.r()) / 2;
            r10 = rect.left;
        } else {
            if (!vvVar.I()) {
                return 0;
            }
            L = (((vvVar.C + vvVar.T) - i0.L(14.0f)) - rect.right) - rect.left;
            r10 = uvVar.r();
        }
        return L - r10;
    }

    public final void i0(int i10, int i11) {
        this.Z = i10;
        this.a0 = i11;
        f0();
    }

    @Override // org.telegram.messenger.qu
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        qu.l(spannableStringBuilder, this.W, this.X);
    }

    @Override // org.telegram.messenger.qu
    public final boolean u(CharacterStyle characterStyle, int i10, hu huVar) {
        if (!this.W.o(characterStyle, huVar)) {
            return false;
        }
        Rect rect = this.b;
        huVar.e = (h0() + rect.left) - r0.f;
        huVar.f = i10 + rect.top + this.Z;
        return true;
    }

    @Override // org.telegram.messenger.qu
    public final boolean v() {
        return this.Y;
    }
}
