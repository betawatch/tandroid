package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class tu extends xt {
    public final bv X;
    public final bv Y;
    public final bv[] Z;
    public final boolean a0;

    public tu(cv cvVar, Rect rect, int i3, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, Layout.Alignment alignment) {
        super(cvVar, rect, i3);
        this.a0 = alignment == Layout.Alignment.ALIGN_CENTER;
        bv bvVar = new bv(cvVar, spannableStringBuilder, this.c, alignment);
        this.X = bvVar;
        bv bvVar2 = !TextUtils.isEmpty(spannableStringBuilder2) ? new bv(cvVar, spannableStringBuilder2, this.c, alignment) : null;
        this.Y = bvVar2;
        this.Z = bvVar2 == null ? new bv[]{bvVar} : new bv[]{bvVar, bvVar2};
    }

    @Override // org.telegram.messenger.xt
    public final int I() {
        Rect rect = this.b;
        int i02 = i0() + this.X.b.getHeight() + rect.top;
        bv bvVar = this.Y;
        return i02 + (bvVar != null ? bvVar.b.getHeight() : 0) + rect.bottom;
    }

    @Override // org.telegram.messenger.xt
    public final int J() {
        bv bvVar = this.Y;
        if (bvVar == null) {
            bvVar = this.X;
        }
        Rect rect = this.b;
        return bvVar.q() + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.xt
    public final int K() {
        Rect rect = this.b;
        int i3 = rect.left;
        int r5 = this.X.r();
        bv bvVar = this.Y;
        return Math.max(r5, bvVar != null ? bvVar.r() : 0) + i3 + rect.right;
    }

    @Override // org.telegram.messenger.xt
    public final org.telegram.ui.Cells.s9[] L() {
        return this.Z;
    }

    @Override // org.telegram.messenger.xt
    public final void T() {
        this.X.i(this.W);
        bv bvVar = this.Y;
        if (bvVar != null) {
            bvVar.i(this.W);
        }
    }

    @Override // org.telegram.messenger.xt
    public final void V() {
        this.X.f(this.W);
        bv bvVar = this.Y;
        if (bvVar != null) {
            bvVar.f(this.W);
        }
    }

    @Override // org.telegram.messenger.xt
    public final void W(Canvas canvas) {
        canvas.save();
        bv bvVar = this.X;
        canvas.translate(j0(bvVar), 0.0f);
        bvVar.d(canvas, bvVar.T);
        canvas.restore();
        bv bvVar2 = this.Y;
        if (bvVar2 != null) {
            canvas.save();
            canvas.translate(j0(bvVar2), i0() + bvVar.b.getHeight());
            bvVar2.d(canvas, bvVar2.T);
            canvas.restore();
        }
    }

    @Override // org.telegram.messenger.xt
    public final boolean Y(MotionEvent motionEvent) {
        int i3;
        bv bvVar = this.X;
        int height = bvVar.b.getHeight();
        float y9 = motionEvent.getY();
        int i10 = 0;
        if (y9 < 0.0f || y9 >= height) {
            bvVar = this.Y;
            if (bvVar == null || y9 < i0() + height) {
                return false;
            }
            int j02 = j0(bvVar);
            i10 = i0() + height;
            i3 = j02;
        } else {
            i3 = j0(bvVar);
        }
        motionEvent.offsetLocation(-i3, -i10);
        boolean t10 = bvVar.t(motionEvent);
        motionEvent.offsetLocation(i3, i10);
        return t10;
    }

    @Override // org.telegram.messenger.xt
    public final void Z(int i3, int i10, int i11) {
        bv bvVar = this.X;
        bvVar.c = (j0(bvVar) + i3) - bvVar.f;
        bvVar.d = i10;
        bvVar.e = i11;
        bv bvVar2 = this.Y;
        if (bvVar2 != null) {
            bvVar2.c = (j0(bvVar2) + i3) - bvVar2.f;
            bvVar2.d = i0() + bvVar.b.getHeight() + i10;
            bvVar2.e = i11;
        }
    }

    @Override // org.telegram.messenger.xt, org.telegram.ui.lg0
    public final Layout a() {
        return this.X.b;
    }

    public final int i0() {
        if (this.Y != null) {
            return g0.L(2.0f);
        }
        return 0;
    }

    public final int j0(bv bvVar) {
        int L;
        int r5;
        boolean z10 = this.a0;
        Rect rect = this.b;
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

    @Override // org.telegram.messenger.xt
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        xt.l(spannableStringBuilder, null, this.Z);
    }

    @Override // org.telegram.messenger.xt
    public final boolean u(CharacterStyle characterStyle, int i3, ot otVar) {
        boolean o10 = this.X.o(characterStyle, otVar);
        Rect rect = this.b;
        if (o10) {
            otVar.e = (j0(r0) + rect.left) - r0.f;
            otVar.f = i3 + rect.top;
            return true;
        }
        bv bvVar = this.Y;
        if (bvVar == null || !bvVar.o(characterStyle, otVar)) {
            return false;
        }
        otVar.e = (j0(bvVar) + rect.left) - bvVar.f;
        otVar.f = i0() + r0.b.getHeight() + i3 + rect.top;
        return true;
    }

    @Override // org.telegram.messenger.xt
    public final boolean v() {
        return this.a0;
    }
}
