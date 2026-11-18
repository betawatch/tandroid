package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public abstract class vu extends zt {
    public final dv X;
    public final dv Y;
    public final dv[] Z;
    public final boolean a0;

    public vu(ev evVar, Rect rect, int i7, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, Layout.Alignment alignment) {
        super(evVar, rect, i7);
        this.a0 = alignment == Layout.Alignment.ALIGN_CENTER;
        dv dvVar = new dv(evVar, spannableStringBuilder, this.c, alignment);
        this.X = dvVar;
        dv dvVar2 = !TextUtils.isEmpty(spannableStringBuilder2) ? new dv(evVar, spannableStringBuilder2, this.c, alignment) : null;
        this.Y = dvVar2;
        this.Z = dvVar2 == null ? new dv[]{dvVar} : new dv[]{dvVar, dvVar2};
    }

    @Override // org.telegram.messenger.zt
    public final int I() {
        Rect rect = this.b;
        int i02 = i0() + this.X.b.getHeight() + rect.top;
        dv dvVar = this.Y;
        return i02 + (dvVar != null ? dvVar.b.getHeight() : 0) + rect.bottom;
    }

    @Override // org.telegram.messenger.zt
    public final int J() {
        dv dvVar = this.Y;
        if (dvVar == null) {
            dvVar = this.X;
        }
        Rect rect = this.b;
        return dvVar.q() + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.zt
    public final int K() {
        Rect rect = this.b;
        int i7 = rect.left;
        int r10 = this.X.r();
        dv dvVar = this.Y;
        return Math.max(r10, dvVar != null ? dvVar.r() : 0) + i7 + rect.right;
    }

    @Override // org.telegram.messenger.zt
    public final org.telegram.ui.Cells.u9[] L() {
        return this.Z;
    }

    @Override // org.telegram.messenger.zt
    public final void T() {
        this.X.i(this.W);
        dv dvVar = this.Y;
        if (dvVar != null) {
            dvVar.i(this.W);
        }
    }

    @Override // org.telegram.messenger.zt
    public final void V() {
        this.X.f(this.W);
        dv dvVar = this.Y;
        if (dvVar != null) {
            dvVar.f(this.W);
        }
    }

    @Override // org.telegram.messenger.zt
    public final void W(Canvas canvas) {
        canvas.save();
        dv dvVar = this.X;
        canvas.translate(j0(dvVar), 0.0f);
        dvVar.d(canvas, dvVar.T);
        canvas.restore();
        dv dvVar2 = this.Y;
        if (dvVar2 != null) {
            canvas.save();
            canvas.translate(j0(dvVar2), i0() + dvVar.b.getHeight());
            dvVar2.d(canvas, dvVar2.T);
            canvas.restore();
        }
    }

    @Override // org.telegram.messenger.zt
    public final boolean Y(MotionEvent motionEvent) {
        int i7;
        dv dvVar = this.X;
        int height = dvVar.b.getHeight();
        float y10 = motionEvent.getY();
        int i10 = 0;
        if (y10 < 0.0f || y10 >= height) {
            dvVar = this.Y;
            if (dvVar == null || y10 < i0() + height) {
                return false;
            }
            int j02 = j0(dvVar);
            i10 = i0() + height;
            i7 = j02;
        } else {
            i7 = j0(dvVar);
        }
        motionEvent.offsetLocation(-i7, -i10);
        boolean t6 = dvVar.t(motionEvent);
        motionEvent.offsetLocation(i7, i10);
        return t6;
    }

    @Override // org.telegram.messenger.zt
    public final void Z(int i7, int i10, int i11) {
        dv dvVar = this.X;
        dvVar.c = (j0(dvVar) + i7) - dvVar.f;
        dvVar.d = i10;
        dvVar.e = i11;
        dv dvVar2 = this.Y;
        if (dvVar2 != null) {
            dvVar2.c = (j0(dvVar2) + i7) - dvVar2.f;
            dvVar2.d = i0() + dvVar.b.getHeight() + i10;
            dvVar2.e = i11;
        }
    }

    @Override // org.telegram.messenger.zt, org.telegram.ui.wg0
    public final Layout a() {
        return this.X.b;
    }

    public final int i0() {
        if (this.Y != null) {
            return g0.L(2.0f);
        }
        return 0;
    }

    public final int j0(dv dvVar) {
        int L;
        int r10;
        boolean z10 = this.a0;
        Rect rect = this.b;
        ev evVar = this.a;
        if (z10) {
            L = (((evVar.C + evVar.T) - evVar.S) - dvVar.r()) / 2;
            r10 = rect.left;
        } else {
            if (!evVar.I()) {
                return 0;
            }
            L = (((evVar.C + evVar.T) - g0.L(14.0f)) - rect.right) - rect.left;
            r10 = dvVar.r();
        }
        return L - r10;
    }

    @Override // org.telegram.messenger.zt
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        zt.l(spannableStringBuilder, null, this.Z);
    }

    @Override // org.telegram.messenger.zt
    public final boolean u(CharacterStyle characterStyle, int i7, qt qtVar) {
        boolean o4 = this.X.o(characterStyle, qtVar);
        Rect rect = this.b;
        if (o4) {
            qtVar.e = (j0(r0) + rect.left) - r0.f;
            qtVar.f = i7 + rect.top;
            return true;
        }
        dv dvVar = this.Y;
        if (dvVar == null || !dvVar.o(characterStyle, qtVar)) {
            return false;
        }
        qtVar.e = (j0(dvVar) + rect.left) - dvVar.f;
        qtVar.f = i0() + r0.b.getHeight() + i7 + rect.top;
        return true;
    }

    @Override // org.telegram.messenger.zt
    public final boolean v() {
        return this.a0;
    }
}
