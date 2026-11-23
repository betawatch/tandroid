package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class eu extends au {
    public final ev X;
    public final ev Y;
    public final boolean Z;
    public final org.telegram.ui.Cells.u9[] a0;

    public eu(fv fvVar, Rect rect, int i7, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(fvVar, rect, i7);
        ev evVar = !TextUtils.isEmpty(spannableStringBuilder) ? new ev(fvVar, spannableStringBuilder, this.c) : null;
        this.X = evVar;
        ev evVar2 = TextUtils.isEmpty(spannableStringBuilder2) ? null : new ev(fvVar, spannableStringBuilder2, this.c);
        this.Y = evVar2;
        this.Z = fvVar.I();
        ArrayList arrayList = new ArrayList(2);
        if (evVar != null) {
            arrayList.add(evVar);
        }
        if (evVar2 != null) {
            arrayList.add(evVar2);
        }
        this.a0 = (org.telegram.ui.Cells.u9[]) arrayList.toArray(new org.telegram.ui.Cells.u9[0]);
    }

    @Override // org.telegram.messenger.au
    public final int I() {
        Rect rect = this.b;
        int i7 = rect.top;
        ev evVar = this.X;
        int j02 = j0() + (evVar != null ? evVar.b.getHeight() : 0) + i7;
        ev evVar2 = this.Y;
        return j02 + (evVar2 != null ? evVar2.b.getHeight() : 0) + rect.bottom;
    }

    @Override // org.telegram.messenger.au
    public final int J() {
        int i7;
        int i10;
        Rect rect = this.b;
        ev evVar = this.Y;
        if (evVar != null) {
            i7 = evVar.q() + rect.left;
            i10 = rect.right;
        } else {
            ev evVar2 = this.X;
            if (evVar2 != null) {
                i7 = evVar2.q() + rect.left;
                i10 = rect.right;
            } else {
                i7 = rect.left;
                i10 = rect.right;
            }
        }
        return i7 + i10;
    }

    @Override // org.telegram.messenger.au
    public final int K() {
        ev evVar = this.X;
        int max = evVar != null ? Math.max(0, evVar.r()) : 0;
        ev evVar2 = this.Y;
        if (evVar2 != null) {
            max = Math.max(max, evVar2.r());
        }
        Rect rect = this.b;
        return rect.left + max + rect.right;
    }

    @Override // org.telegram.messenger.au
    public final org.telegram.ui.Cells.u9[] L() {
        return this.a0;
    }

    @Override // org.telegram.messenger.au
    public final void T() {
        ev evVar = this.X;
        if (evVar != null) {
            evVar.i(this.W);
        }
        ev evVar2 = this.Y;
        if (evVar2 != null) {
            evVar2.i(this.W);
        }
    }

    @Override // org.telegram.messenger.au
    public final void V() {
        ev evVar = this.X;
        if (evVar != null) {
            evVar.f(this.W);
        }
        ev evVar2 = this.Y;
        if (evVar2 != null) {
            evVar2.f(this.W);
        }
    }

    @Override // org.telegram.messenger.au
    public final void W(Canvas canvas) {
        ev evVar = this.X;
        if (evVar != null) {
            evVar.d(canvas, evVar.T);
        }
        ev evVar2 = this.Y;
        if (evVar2 != null) {
            canvas.save();
            canvas.translate(i0(), j0() + (evVar != null ? evVar.b.getHeight() : 0));
            evVar2.d(canvas, evVar2.T);
            canvas.restore();
        }
    }

    @Override // org.telegram.messenger.au
    public final boolean Y(MotionEvent motionEvent) {
        ev evVar = this.X;
        int height = evVar != null ? evVar.b.getHeight() : 0;
        int j02 = j0();
        float y10 = motionEvent.getY();
        int i7 = this.b.top;
        float f10 = y10 - i7;
        if (evVar != null && f10 >= 0.0f && f10 < height) {
            motionEvent.offsetLocation(0.0f, -i7);
            boolean t6 = evVar.t(motionEvent);
            motionEvent.offsetLocation(0.0f, r5.top);
            return t6;
        }
        ev evVar2 = this.Y;
        if (evVar2 == null || f10 < height + j02) {
            return false;
        }
        int i02 = i0();
        motionEvent.offsetLocation(-i02, -r6);
        boolean t10 = evVar2.t(motionEvent);
        motionEvent.offsetLocation(i02, i7 + height + j02);
        return t10;
    }

    @Override // org.telegram.messenger.au
    public final void Z(int i7, int i10, int i11) {
        this.T = i7;
        this.U = i10;
        this.V = i11;
        ev evVar = this.X;
        if (evVar != null) {
            evVar.c = i7 - evVar.f;
            evVar.d = i10;
            evVar.e = i11;
        }
        ev evVar2 = this.Y;
        if (evVar2 != null) {
            evVar2.c = (i0() + i7) - evVar2.f;
            evVar2.d = j0() + (evVar != null ? evVar.b.getHeight() : 0) + i10;
            evVar2.e = i11;
        }
    }

    public final int i0() {
        ev evVar = this.Y;
        if (evVar == null || !this.Z) {
            return 0;
        }
        int i7 = this.a.C;
        Rect rect = this.b;
        return Math.max(0, ((i7 - rect.left) - rect.right) - evVar.r());
    }

    public final int j0() {
        if (this.X == null || this.Y == null) {
            return 0;
        }
        return g0.L(4.0f);
    }

    @Override // org.telegram.messenger.au
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        StaticLayout staticLayout;
        au.l(spannableStringBuilder, this.X, null);
        ev evVar = this.Y;
        if (evVar == null || (staticLayout = evVar.b) == null || TextUtils.isEmpty(staticLayout.getText())) {
            return;
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            spannableStringBuilder.append('\n');
        }
        spannableStringBuilder.append(staticLayout.getText());
    }

    @Override // org.telegram.messenger.au
    public final boolean v() {
        return false;
    }
}
