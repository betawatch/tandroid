package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class gu extends cu {
    public final hv X;
    public final hv Y;
    public final boolean Z;
    public final org.telegram.ui.Cells.s9[] a0;

    public gu(iv ivVar, Rect rect, int i7, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(ivVar, rect, i7);
        hv hvVar = !TextUtils.isEmpty(spannableStringBuilder) ? new hv(ivVar, spannableStringBuilder, this.c) : null;
        this.X = hvVar;
        hv hvVar2 = TextUtils.isEmpty(spannableStringBuilder2) ? null : new hv(ivVar, spannableStringBuilder2, this.c);
        this.Y = hvVar2;
        this.Z = ivVar.I();
        ArrayList arrayList = new ArrayList(2);
        if (hvVar != null) {
            arrayList.add(hvVar);
        }
        if (hvVar2 != null) {
            arrayList.add(hvVar2);
        }
        this.a0 = (org.telegram.ui.Cells.s9[]) arrayList.toArray(new org.telegram.ui.Cells.s9[0]);
    }

    @Override // org.telegram.messenger.cu
    public final int I() {
        Rect rect = this.b;
        int i7 = rect.top;
        hv hvVar = this.X;
        int j02 = j0() + (hvVar != null ? hvVar.b.getHeight() : 0) + i7;
        hv hvVar2 = this.Y;
        return j02 + (hvVar2 != null ? hvVar2.b.getHeight() : 0) + rect.bottom;
    }

    @Override // org.telegram.messenger.cu
    public final int J() {
        int i7;
        int i10;
        Rect rect = this.b;
        hv hvVar = this.Y;
        if (hvVar != null) {
            i7 = hvVar.q() + rect.left;
            i10 = rect.right;
        } else {
            hv hvVar2 = this.X;
            if (hvVar2 != null) {
                i7 = hvVar2.q() + rect.left;
                i10 = rect.right;
            } else {
                i7 = rect.left;
                i10 = rect.right;
            }
        }
        return i7 + i10;
    }

    @Override // org.telegram.messenger.cu
    public final int K() {
        hv hvVar = this.X;
        int max = hvVar != null ? Math.max(0, hvVar.r()) : 0;
        hv hvVar2 = this.Y;
        if (hvVar2 != null) {
            max = Math.max(max, hvVar2.r());
        }
        Rect rect = this.b;
        return rect.left + max + rect.right;
    }

    @Override // org.telegram.messenger.cu
    public final org.telegram.ui.Cells.s9[] L() {
        return this.a0;
    }

    @Override // org.telegram.messenger.cu
    public final void T() {
        hv hvVar = this.X;
        if (hvVar != null) {
            hvVar.i(this.W);
        }
        hv hvVar2 = this.Y;
        if (hvVar2 != null) {
            hvVar2.i(this.W);
        }
    }

    @Override // org.telegram.messenger.cu
    public final void V() {
        hv hvVar = this.X;
        if (hvVar != null) {
            hvVar.f(this.W);
        }
        hv hvVar2 = this.Y;
        if (hvVar2 != null) {
            hvVar2.f(this.W);
        }
    }

    @Override // org.telegram.messenger.cu
    public final void W(Canvas canvas) {
        hv hvVar = this.X;
        if (hvVar != null) {
            hvVar.d(canvas, hvVar.T);
        }
        hv hvVar2 = this.Y;
        if (hvVar2 != null) {
            canvas.save();
            canvas.translate(i0(), j0() + (hvVar != null ? hvVar.b.getHeight() : 0));
            hvVar2.d(canvas, hvVar2.T);
            canvas.restore();
        }
    }

    @Override // org.telegram.messenger.cu
    public final boolean Y(MotionEvent motionEvent) {
        hv hvVar = this.X;
        int height = hvVar != null ? hvVar.b.getHeight() : 0;
        int j02 = j0();
        float y10 = motionEvent.getY();
        int i7 = this.b.top;
        float f10 = y10 - i7;
        if (hvVar != null && f10 >= 0.0f && f10 < height) {
            motionEvent.offsetLocation(0.0f, -i7);
            boolean t6 = hvVar.t(motionEvent);
            motionEvent.offsetLocation(0.0f, r5.top);
            return t6;
        }
        hv hvVar2 = this.Y;
        if (hvVar2 == null || f10 < height + j02) {
            return false;
        }
        int i02 = i0();
        motionEvent.offsetLocation(-i02, -r6);
        boolean t10 = hvVar2.t(motionEvent);
        motionEvent.offsetLocation(i02, i7 + height + j02);
        return t10;
    }

    @Override // org.telegram.messenger.cu
    public final void Z(int i7, int i10, int i11) {
        this.T = i7;
        this.U = i10;
        this.V = i11;
        hv hvVar = this.X;
        if (hvVar != null) {
            hvVar.c = i7 - hvVar.f;
            hvVar.d = i10;
            hvVar.e = i11;
        }
        hv hvVar2 = this.Y;
        if (hvVar2 != null) {
            hvVar2.c = (i0() + i7) - hvVar2.f;
            hvVar2.d = j0() + (hvVar != null ? hvVar.b.getHeight() : 0) + i10;
            hvVar2.e = i11;
        }
    }

    public final int i0() {
        hv hvVar = this.Y;
        if (hvVar == null || !this.Z) {
            return 0;
        }
        int i7 = this.a.C;
        Rect rect = this.b;
        return Math.max(0, ((i7 - rect.left) - rect.right) - hvVar.r());
    }

    public final int j0() {
        if (this.X == null || this.Y == null) {
            return 0;
        }
        return g0.L(4.0f);
    }

    @Override // org.telegram.messenger.cu
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        StaticLayout staticLayout;
        cu.l(spannableStringBuilder, this.X, null);
        hv hvVar = this.Y;
        if (hvVar == null || (staticLayout = hvVar.b) == null || TextUtils.isEmpty(staticLayout.getText())) {
            return;
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            spannableStringBuilder.append('\n');
        }
        spannableStringBuilder.append(staticLayout.getText());
    }

    @Override // org.telegram.messenger.cu
    public final boolean v() {
        return false;
    }
}
