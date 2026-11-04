package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class bu extends xt {
    public final bv X;
    public final bv Y;
    public final boolean Z;
    public final org.telegram.ui.Cells.s9[] a0;

    public bu(cv cvVar, Rect rect, int i3, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(cvVar, rect, i3);
        bv bvVar = !TextUtils.isEmpty(spannableStringBuilder) ? new bv(cvVar, spannableStringBuilder, this.c) : null;
        this.X = bvVar;
        bv bvVar2 = TextUtils.isEmpty(spannableStringBuilder2) ? null : new bv(cvVar, spannableStringBuilder2, this.c);
        this.Y = bvVar2;
        this.Z = cvVar.I();
        ArrayList arrayList = new ArrayList(2);
        if (bvVar != null) {
            arrayList.add(bvVar);
        }
        if (bvVar2 != null) {
            arrayList.add(bvVar2);
        }
        this.a0 = (org.telegram.ui.Cells.s9[]) arrayList.toArray(new org.telegram.ui.Cells.s9[0]);
    }

    @Override // org.telegram.messenger.xt
    public final int I() {
        Rect rect = this.b;
        int i3 = rect.top;
        bv bvVar = this.X;
        int j02 = j0() + (bvVar != null ? bvVar.b.getHeight() : 0) + i3;
        bv bvVar2 = this.Y;
        return j02 + (bvVar2 != null ? bvVar2.b.getHeight() : 0) + rect.bottom;
    }

    @Override // org.telegram.messenger.xt
    public final int J() {
        int i3;
        int i10;
        Rect rect = this.b;
        bv bvVar = this.Y;
        if (bvVar != null) {
            i3 = bvVar.q() + rect.left;
            i10 = rect.right;
        } else {
            bv bvVar2 = this.X;
            if (bvVar2 != null) {
                i3 = bvVar2.q() + rect.left;
                i10 = rect.right;
            } else {
                i3 = rect.left;
                i10 = rect.right;
            }
        }
        return i3 + i10;
    }

    @Override // org.telegram.messenger.xt
    public final int K() {
        bv bvVar = this.X;
        int max = bvVar != null ? Math.max(0, bvVar.r()) : 0;
        bv bvVar2 = this.Y;
        if (bvVar2 != null) {
            max = Math.max(max, bvVar2.r());
        }
        Rect rect = this.b;
        return rect.left + max + rect.right;
    }

    @Override // org.telegram.messenger.xt
    public final org.telegram.ui.Cells.s9[] L() {
        return this.a0;
    }

    @Override // org.telegram.messenger.xt
    public final void T() {
        bv bvVar = this.X;
        if (bvVar != null) {
            bvVar.i(this.W);
        }
        bv bvVar2 = this.Y;
        if (bvVar2 != null) {
            bvVar2.i(this.W);
        }
    }

    @Override // org.telegram.messenger.xt
    public final void V() {
        bv bvVar = this.X;
        if (bvVar != null) {
            bvVar.f(this.W);
        }
        bv bvVar2 = this.Y;
        if (bvVar2 != null) {
            bvVar2.f(this.W);
        }
    }

    @Override // org.telegram.messenger.xt
    public final void W(Canvas canvas) {
        bv bvVar = this.X;
        if (bvVar != null) {
            bvVar.d(canvas, bvVar.T);
        }
        bv bvVar2 = this.Y;
        if (bvVar2 != null) {
            canvas.save();
            canvas.translate(i0(), j0() + (bvVar != null ? bvVar.b.getHeight() : 0));
            bvVar2.d(canvas, bvVar2.T);
            canvas.restore();
        }
    }

    @Override // org.telegram.messenger.xt
    public final boolean Y(MotionEvent motionEvent) {
        bv bvVar = this.X;
        int height = bvVar != null ? bvVar.b.getHeight() : 0;
        int j02 = j0();
        float y9 = motionEvent.getY();
        int i3 = this.b.top;
        float f10 = y9 - i3;
        if (bvVar != null && f10 >= 0.0f && f10 < height) {
            motionEvent.offsetLocation(0.0f, -i3);
            boolean t10 = bvVar.t(motionEvent);
            motionEvent.offsetLocation(0.0f, r5.top);
            return t10;
        }
        bv bvVar2 = this.Y;
        if (bvVar2 == null || f10 < height + j02) {
            return false;
        }
        int i02 = i0();
        motionEvent.offsetLocation(-i02, -r6);
        boolean t11 = bvVar2.t(motionEvent);
        motionEvent.offsetLocation(i02, i3 + height + j02);
        return t11;
    }

    @Override // org.telegram.messenger.xt
    public final void Z(int i3, int i10, int i11) {
        this.T = i3;
        this.U = i10;
        this.V = i11;
        bv bvVar = this.X;
        if (bvVar != null) {
            bvVar.c = i3 - bvVar.f;
            bvVar.d = i10;
            bvVar.e = i11;
        }
        bv bvVar2 = this.Y;
        if (bvVar2 != null) {
            bvVar2.c = (i0() + i3) - bvVar2.f;
            bvVar2.d = j0() + (bvVar != null ? bvVar.b.getHeight() : 0) + i10;
            bvVar2.e = i11;
        }
    }

    public final int i0() {
        bv bvVar = this.Y;
        if (bvVar == null || !this.Z) {
            return 0;
        }
        int i3 = this.a.C;
        Rect rect = this.b;
        return Math.max(0, ((i3 - rect.left) - rect.right) - bvVar.r());
    }

    public final int j0() {
        if (this.X == null || this.Y == null) {
            return 0;
        }
        return g0.L(4.0f);
    }

    @Override // org.telegram.messenger.xt
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        StaticLayout staticLayout;
        xt.l(spannableStringBuilder, this.X, null);
        bv bvVar = this.Y;
        if (bvVar == null || (staticLayout = bvVar.b) == null || TextUtils.isEmpty(staticLayout.getText())) {
            return;
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            spannableStringBuilder.append('\n');
        }
        spannableStringBuilder.append(staticLayout.getText());
    }

    @Override // org.telegram.messenger.xt
    public final boolean v() {
        return false;
    }
}
