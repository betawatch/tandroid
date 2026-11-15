package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public abstract class zu extends cu {
    public final hv X;
    public final hv Y;
    public final hv[] Z;
    public final boolean a0;

    public zu(iv ivVar, Rect rect, int i7, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, Layout.Alignment alignment) {
        super(ivVar, rect, i7);
        this.a0 = alignment == Layout.Alignment.ALIGN_CENTER;
        hv hvVar = new hv(ivVar, spannableStringBuilder, this.c, alignment);
        this.X = hvVar;
        hv hvVar2 = !TextUtils.isEmpty(spannableStringBuilder2) ? new hv(ivVar, spannableStringBuilder2, this.c, alignment) : null;
        this.Y = hvVar2;
        this.Z = hvVar2 == null ? new hv[]{hvVar} : new hv[]{hvVar, hvVar2};
    }

    @Override // org.telegram.messenger.cu
    public final int I() {
        Rect rect = this.b;
        int i02 = i0() + this.X.b.getHeight() + rect.top;
        hv hvVar = this.Y;
        return i02 + (hvVar != null ? hvVar.b.getHeight() : 0) + rect.bottom;
    }

    @Override // org.telegram.messenger.cu
    public final int J() {
        hv hvVar = this.Y;
        if (hvVar == null) {
            hvVar = this.X;
        }
        Rect rect = this.b;
        return hvVar.q() + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.cu
    public final int K() {
        Rect rect = this.b;
        int i7 = rect.left;
        int r10 = this.X.r();
        hv hvVar = this.Y;
        return Math.max(r10, hvVar != null ? hvVar.r() : 0) + i7 + rect.right;
    }

    @Override // org.telegram.messenger.cu
    public final org.telegram.ui.Cells.s9[] L() {
        return this.Z;
    }

    @Override // org.telegram.messenger.cu
    public final void T() {
        this.X.i(this.W);
        hv hvVar = this.Y;
        if (hvVar != null) {
            hvVar.i(this.W);
        }
    }

    @Override // org.telegram.messenger.cu
    public final void V() {
        this.X.f(this.W);
        hv hvVar = this.Y;
        if (hvVar != null) {
            hvVar.f(this.W);
        }
    }

    @Override // org.telegram.messenger.cu
    public final void W(Canvas canvas) {
        canvas.save();
        hv hvVar = this.X;
        canvas.translate(j0(hvVar), 0.0f);
        hvVar.d(canvas, hvVar.T);
        canvas.restore();
        hv hvVar2 = this.Y;
        if (hvVar2 != null) {
            canvas.save();
            canvas.translate(j0(hvVar2), i0() + hvVar.b.getHeight());
            hvVar2.d(canvas, hvVar2.T);
            canvas.restore();
        }
    }

    @Override // org.telegram.messenger.cu
    public final boolean Y(MotionEvent motionEvent) {
        int i7;
        hv hvVar = this.X;
        int height = hvVar.b.getHeight();
        float y10 = motionEvent.getY();
        int i10 = 0;
        if (y10 < 0.0f || y10 >= height) {
            hvVar = this.Y;
            if (hvVar == null || y10 < i0() + height) {
                return false;
            }
            int j02 = j0(hvVar);
            i10 = i0() + height;
            i7 = j02;
        } else {
            i7 = j0(hvVar);
        }
        motionEvent.offsetLocation(-i7, -i10);
        boolean t6 = hvVar.t(motionEvent);
        motionEvent.offsetLocation(i7, i10);
        return t6;
    }

    @Override // org.telegram.messenger.cu
    public final void Z(int i7, int i10, int i11) {
        hv hvVar = this.X;
        hvVar.c = (j0(hvVar) + i7) - hvVar.f;
        hvVar.d = i10;
        hvVar.e = i11;
        hv hvVar2 = this.Y;
        if (hvVar2 != null) {
            hvVar2.c = (j0(hvVar2) + i7) - hvVar2.f;
            hvVar2.d = i0() + hvVar.b.getHeight() + i10;
            hvVar2.e = i11;
        }
    }

    @Override // org.telegram.messenger.cu, org.telegram.ui.rg0
    public final Layout a() {
        return this.X.b;
    }

    public final int i0() {
        if (this.Y != null) {
            return g0.L(2.0f);
        }
        return 0;
    }

    public final int j0(hv hvVar) {
        int L;
        int r10;
        boolean z10 = this.a0;
        Rect rect = this.b;
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

    @Override // org.telegram.messenger.cu
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        cu.l(spannableStringBuilder, null, this.Z);
    }

    @Override // org.telegram.messenger.cu
    public final boolean u(CharacterStyle characterStyle, int i7, tt ttVar) {
        boolean o4 = this.X.o(characterStyle, ttVar);
        Rect rect = this.b;
        if (o4) {
            ttVar.e = (j0(r0) + rect.left) - r0.f;
            ttVar.f = i7 + rect.top;
            return true;
        }
        hv hvVar = this.Y;
        if (hvVar == null || !hvVar.o(characterStyle, ttVar)) {
            return false;
        }
        ttVar.e = (j0(hvVar) + rect.left) - hvVar.f;
        ttVar.f = i0() + r0.b.getHeight() + i7 + rect.top;
        return true;
    }

    @Override // org.telegram.messenger.cu
    public final boolean v() {
        return this.a0;
    }
}
