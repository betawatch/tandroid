package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class mv extends qu {
    public final uv W;
    public final uv X;
    public final uv[] Y;
    public final boolean Z;

    public mv(vv vvVar, Rect rect, int i10, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, Layout.Alignment alignment) {
        super(vvVar, rect, i10);
        this.Z = alignment == Layout.Alignment.ALIGN_CENTER;
        uv uvVar = new uv(vvVar, spannableStringBuilder, this.c, alignment);
        this.W = uvVar;
        uv uvVar2 = !TextUtils.isEmpty(spannableStringBuilder2) ? new uv(vvVar, spannableStringBuilder2, this.c, alignment) : null;
        this.X = uvVar2;
        this.Y = uvVar2 == null ? new uv[]{uvVar} : new uv[]{uvVar, uvVar2};
    }

    @Override // org.telegram.messenger.qu
    public final int H() {
        Rect rect = this.b;
        int h02 = h0() + this.W.b.getHeight() + rect.top;
        uv uvVar = this.X;
        return h02 + (uvVar != null ? uvVar.b.getHeight() : 0) + rect.bottom;
    }

    @Override // org.telegram.messenger.qu
    public final int I() {
        uv uvVar = this.X;
        if (uvVar == null) {
            uvVar = this.W;
        }
        Rect rect = this.b;
        return uvVar.q() + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.qu
    public final int J() {
        Rect rect = this.b;
        int i10 = rect.left;
        int r10 = this.W.r();
        uv uvVar = this.X;
        return Math.max(r10, uvVar != null ? uvVar.r() : 0) + i10 + rect.right;
    }

    @Override // org.telegram.messenger.qu
    public final org.telegram.ui.Cells.u9[] K() {
        return this.Y;
    }

    @Override // org.telegram.messenger.qu
    public final void S() {
        this.W.i(this.V);
        uv uvVar = this.X;
        if (uvVar != null) {
            uvVar.i(this.V);
        }
    }

    @Override // org.telegram.messenger.qu
    public final void U() {
        this.W.f(this.V);
        uv uvVar = this.X;
        if (uvVar != null) {
            uvVar.f(this.V);
        }
    }

    @Override // org.telegram.messenger.qu
    public final void V(Canvas canvas) {
        canvas.save();
        uv uvVar = this.W;
        canvas.translate(i0(uvVar), 0.0f);
        uvVar.d(canvas, uvVar.S);
        canvas.restore();
        uv uvVar2 = this.X;
        if (uvVar2 != null) {
            canvas.save();
            canvas.translate(i0(uvVar2), h0() + uvVar.b.getHeight());
            uvVar2.d(canvas, uvVar2.S);
            canvas.restore();
        }
    }

    @Override // org.telegram.messenger.qu
    public final boolean X(MotionEvent motionEvent) {
        int i10;
        uv uvVar = this.W;
        int height = uvVar.b.getHeight();
        float y3 = motionEvent.getY();
        int i11 = 0;
        if (y3 < 0.0f || y3 >= height) {
            uvVar = this.X;
            if (uvVar == null || y3 < h0() + height) {
                return false;
            }
            int i02 = i0(uvVar);
            i11 = h0() + height;
            i10 = i02;
        } else {
            i10 = i0(uvVar);
        }
        motionEvent.offsetLocation(-i10, -i11);
        boolean t10 = uvVar.t(motionEvent);
        motionEvent.offsetLocation(i10, i11);
        return t10;
    }

    @Override // org.telegram.messenger.qu
    public final void Y(int i10, int i11, int i12) {
        uv uvVar = this.W;
        uvVar.c = (i0(uvVar) + i10) - uvVar.f;
        uvVar.d = i11;
        uvVar.e = i12;
        uv uvVar2 = this.X;
        if (uvVar2 != null) {
            uvVar2.c = (i0(uvVar2) + i10) - uvVar2.f;
            uvVar2.d = h0() + uvVar.b.getHeight() + i11;
            uvVar2.e = i12;
        }
    }

    @Override // org.telegram.messenger.qu, org.telegram.ui.xh0
    public final Layout a() {
        return this.W.b;
    }

    public final int h0() {
        if (this.X != null) {
            return i0.L(2.0f);
        }
        return 0;
    }

    public final int i0(uv uvVar) {
        int L;
        int r10;
        boolean z10 = this.Z;
        Rect rect = this.b;
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

    @Override // org.telegram.messenger.qu
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        qu.l(spannableStringBuilder, null, this.Y);
    }

    @Override // org.telegram.messenger.qu
    public final boolean u(CharacterStyle characterStyle, int i10, hu huVar) {
        boolean o10 = this.W.o(characterStyle, huVar);
        Rect rect = this.b;
        if (o10) {
            huVar.e = (i0(r0) + rect.left) - r0.f;
            huVar.f = i10 + rect.top;
            return true;
        }
        uv uvVar = this.X;
        if (uvVar == null || !uvVar.o(characterStyle, huVar)) {
            return false;
        }
        huVar.e = (i0(uvVar) + rect.left) - uvVar.f;
        huVar.f = h0() + r0.b.getHeight() + i10 + rect.top;
        return true;
    }

    @Override // org.telegram.messenger.qu
    public final boolean v() {
        return this.Z;
    }
}
