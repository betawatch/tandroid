package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class du extends zt {
    public final dv X;
    public final dv Y;
    public final boolean Z;
    public final org.telegram.ui.Cells.u9[] a0;

    public du(ev evVar, Rect rect, int i7, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(evVar, rect, i7);
        dv dvVar = !TextUtils.isEmpty(spannableStringBuilder) ? new dv(evVar, spannableStringBuilder, this.c) : null;
        this.X = dvVar;
        dv dvVar2 = TextUtils.isEmpty(spannableStringBuilder2) ? null : new dv(evVar, spannableStringBuilder2, this.c);
        this.Y = dvVar2;
        this.Z = evVar.I();
        ArrayList arrayList = new ArrayList(2);
        if (dvVar != null) {
            arrayList.add(dvVar);
        }
        if (dvVar2 != null) {
            arrayList.add(dvVar2);
        }
        this.a0 = (org.telegram.ui.Cells.u9[]) arrayList.toArray(new org.telegram.ui.Cells.u9[0]);
    }

    @Override // org.telegram.messenger.zt
    public final int I() {
        Rect rect = this.b;
        int i7 = rect.top;
        dv dvVar = this.X;
        int j02 = j0() + (dvVar != null ? dvVar.b.getHeight() : 0) + i7;
        dv dvVar2 = this.Y;
        return j02 + (dvVar2 != null ? dvVar2.b.getHeight() : 0) + rect.bottom;
    }

    @Override // org.telegram.messenger.zt
    public final int J() {
        int i7;
        int i10;
        Rect rect = this.b;
        dv dvVar = this.Y;
        if (dvVar != null) {
            i7 = dvVar.q() + rect.left;
            i10 = rect.right;
        } else {
            dv dvVar2 = this.X;
            if (dvVar2 != null) {
                i7 = dvVar2.q() + rect.left;
                i10 = rect.right;
            } else {
                i7 = rect.left;
                i10 = rect.right;
            }
        }
        return i7 + i10;
    }

    @Override // org.telegram.messenger.zt
    public final int K() {
        dv dvVar = this.X;
        int max = dvVar != null ? Math.max(0, dvVar.r()) : 0;
        dv dvVar2 = this.Y;
        if (dvVar2 != null) {
            max = Math.max(max, dvVar2.r());
        }
        Rect rect = this.b;
        return rect.left + max + rect.right;
    }

    @Override // org.telegram.messenger.zt
    public final org.telegram.ui.Cells.u9[] L() {
        return this.a0;
    }

    @Override // org.telegram.messenger.zt
    public final void T() {
        dv dvVar = this.X;
        if (dvVar != null) {
            dvVar.i(this.W);
        }
        dv dvVar2 = this.Y;
        if (dvVar2 != null) {
            dvVar2.i(this.W);
        }
    }

    @Override // org.telegram.messenger.zt
    public final void V() {
        dv dvVar = this.X;
        if (dvVar != null) {
            dvVar.f(this.W);
        }
        dv dvVar2 = this.Y;
        if (dvVar2 != null) {
            dvVar2.f(this.W);
        }
    }

    @Override // org.telegram.messenger.zt
    public final void W(Canvas canvas) {
        dv dvVar = this.X;
        if (dvVar != null) {
            dvVar.d(canvas, dvVar.T);
        }
        dv dvVar2 = this.Y;
        if (dvVar2 != null) {
            canvas.save();
            canvas.translate(i0(), j0() + (dvVar != null ? dvVar.b.getHeight() : 0));
            dvVar2.d(canvas, dvVar2.T);
            canvas.restore();
        }
    }

    @Override // org.telegram.messenger.zt
    public final boolean Y(MotionEvent motionEvent) {
        dv dvVar = this.X;
        int height = dvVar != null ? dvVar.b.getHeight() : 0;
        int j02 = j0();
        float y10 = motionEvent.getY();
        int i7 = this.b.top;
        float f10 = y10 - i7;
        if (dvVar != null && f10 >= 0.0f && f10 < height) {
            motionEvent.offsetLocation(0.0f, -i7);
            boolean t6 = dvVar.t(motionEvent);
            motionEvent.offsetLocation(0.0f, r5.top);
            return t6;
        }
        dv dvVar2 = this.Y;
        if (dvVar2 == null || f10 < height + j02) {
            return false;
        }
        int i02 = i0();
        motionEvent.offsetLocation(-i02, -r6);
        boolean t10 = dvVar2.t(motionEvent);
        motionEvent.offsetLocation(i02, i7 + height + j02);
        return t10;
    }

    @Override // org.telegram.messenger.zt
    public final void Z(int i7, int i10, int i11) {
        this.T = i7;
        this.U = i10;
        this.V = i11;
        dv dvVar = this.X;
        if (dvVar != null) {
            dvVar.c = i7 - dvVar.f;
            dvVar.d = i10;
            dvVar.e = i11;
        }
        dv dvVar2 = this.Y;
        if (dvVar2 != null) {
            dvVar2.c = (i0() + i7) - dvVar2.f;
            dvVar2.d = j0() + (dvVar != null ? dvVar.b.getHeight() : 0) + i10;
            dvVar2.e = i11;
        }
    }

    public final int i0() {
        dv dvVar = this.Y;
        if (dvVar == null || !this.Z) {
            return 0;
        }
        int i7 = this.a.C;
        Rect rect = this.b;
        return Math.max(0, ((i7 - rect.left) - rect.right) - dvVar.r());
    }

    public final int j0() {
        if (this.X == null || this.Y == null) {
            return 0;
        }
        return g0.L(4.0f);
    }

    @Override // org.telegram.messenger.zt
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        StaticLayout staticLayout;
        zt.l(spannableStringBuilder, this.X, null);
        dv dvVar = this.Y;
        if (dvVar == null || (staticLayout = dvVar.b) == null || TextUtils.isEmpty(staticLayout.getText())) {
            return;
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            spannableStringBuilder.append('\n');
        }
        spannableStringBuilder.append(staticLayout.getText());
    }

    @Override // org.telegram.messenger.zt
    public final boolean v() {
        return false;
    }
}
