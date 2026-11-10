package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class ju extends fu {
    public final jv W;
    public final jv X;
    public final boolean Y;
    public final org.telegram.ui.Cells.t9[] Z;

    public ju(kv kvVar, Rect rect, int i7, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(kvVar, rect, i7);
        jv jvVar = !TextUtils.isEmpty(spannableStringBuilder) ? new jv(kvVar, spannableStringBuilder, this.c) : null;
        this.W = jvVar;
        jv jvVar2 = TextUtils.isEmpty(spannableStringBuilder2) ? null : new jv(kvVar, spannableStringBuilder2, this.c);
        this.X = jvVar2;
        this.Y = kvVar.I();
        ArrayList arrayList = new ArrayList(2);
        if (jvVar != null) {
            arrayList.add(jvVar);
        }
        if (jvVar2 != null) {
            arrayList.add(jvVar2);
        }
        this.Z = (org.telegram.ui.Cells.t9[]) arrayList.toArray(new org.telegram.ui.Cells.t9[0]);
    }

    @Override // org.telegram.messenger.fu
    public final int I() {
        Rect rect = this.b;
        int i7 = rect.top;
        jv jvVar = this.W;
        int j02 = j0() + (jvVar != null ? jvVar.b.getHeight() : 0) + i7;
        jv jvVar2 = this.X;
        return j02 + (jvVar2 != null ? jvVar2.b.getHeight() : 0) + rect.bottom;
    }

    @Override // org.telegram.messenger.fu
    public final int J() {
        int i7;
        int i10;
        Rect rect = this.b;
        jv jvVar = this.X;
        if (jvVar != null) {
            i7 = jvVar.q() + rect.left;
            i10 = rect.right;
        } else {
            jv jvVar2 = this.W;
            if (jvVar2 != null) {
                i7 = jvVar2.q() + rect.left;
                i10 = rect.right;
            } else {
                i7 = rect.left;
                i10 = rect.right;
            }
        }
        return i7 + i10;
    }

    @Override // org.telegram.messenger.fu
    public final int K() {
        jv jvVar = this.W;
        int max = jvVar != null ? Math.max(0, jvVar.r()) : 0;
        jv jvVar2 = this.X;
        if (jvVar2 != null) {
            max = Math.max(max, jvVar2.r());
        }
        Rect rect = this.b;
        return rect.left + max + rect.right;
    }

    @Override // org.telegram.messenger.fu
    public final org.telegram.ui.Cells.t9[] L() {
        return this.Z;
    }

    @Override // org.telegram.messenger.fu
    public final void T() {
        jv jvVar = this.W;
        if (jvVar != null) {
            jvVar.i(this.V);
        }
        jv jvVar2 = this.X;
        if (jvVar2 != null) {
            jvVar2.i(this.V);
        }
    }

    @Override // org.telegram.messenger.fu
    public final void V() {
        jv jvVar = this.W;
        if (jvVar != null) {
            jvVar.f(this.V);
        }
        jv jvVar2 = this.X;
        if (jvVar2 != null) {
            jvVar2.f(this.V);
        }
    }

    @Override // org.telegram.messenger.fu
    public final void W(Canvas canvas) {
        jv jvVar = this.W;
        if (jvVar != null) {
            jvVar.d(canvas, jvVar.S);
        }
        jv jvVar2 = this.X;
        if (jvVar2 != null) {
            canvas.save();
            canvas.translate(i0(), j0() + (jvVar != null ? jvVar.b.getHeight() : 0));
            jvVar2.d(canvas, jvVar2.S);
            canvas.restore();
        }
    }

    @Override // org.telegram.messenger.fu
    public final boolean Y(MotionEvent motionEvent) {
        jv jvVar = this.W;
        int height = jvVar != null ? jvVar.b.getHeight() : 0;
        int j02 = j0();
        float y10 = motionEvent.getY();
        int i7 = this.b.top;
        float f10 = y10 - i7;
        if (jvVar != null && f10 >= 0.0f && f10 < height) {
            motionEvent.offsetLocation(0.0f, -i7);
            boolean t6 = jvVar.t(motionEvent);
            motionEvent.offsetLocation(0.0f, r5.top);
            return t6;
        }
        jv jvVar2 = this.X;
        if (jvVar2 == null || f10 < height + j02) {
            return false;
        }
        int i02 = i0();
        motionEvent.offsetLocation(-i02, -r6);
        boolean t10 = jvVar2.t(motionEvent);
        motionEvent.offsetLocation(i02, i7 + height + j02);
        return t10;
    }

    @Override // org.telegram.messenger.fu
    public final void Z(int i7, int i10, int i11) {
        this.S = i7;
        this.T = i10;
        this.U = i11;
        jv jvVar = this.W;
        if (jvVar != null) {
            jvVar.c = i7 - jvVar.f;
            jvVar.d = i10;
            jvVar.e = i11;
        }
        jv jvVar2 = this.X;
        if (jvVar2 != null) {
            jvVar2.c = (i0() + i7) - jvVar2.f;
            jvVar2.d = j0() + (jvVar != null ? jvVar.b.getHeight() : 0) + i10;
            jvVar2.e = i11;
        }
    }

    public final int i0() {
        jv jvVar = this.X;
        if (jvVar == null || !this.Y) {
            return 0;
        }
        int i7 = this.a.C;
        Rect rect = this.b;
        return Math.max(0, ((i7 - rect.left) - rect.right) - jvVar.r());
    }

    public final int j0() {
        if (this.W == null || this.X == null) {
            return 0;
        }
        return g0.L(4.0f);
    }

    @Override // org.telegram.messenger.fu
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        StaticLayout staticLayout;
        fu.l(spannableStringBuilder, this.W, null);
        jv jvVar = this.X;
        if (jvVar == null || (staticLayout = jvVar.b) == null || TextUtils.isEmpty(staticLayout.getText())) {
            return;
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            spannableStringBuilder.append('\n');
        }
        spannableStringBuilder.append(staticLayout.getText());
    }

    @Override // org.telegram.messenger.fu
    public final boolean v() {
        return false;
    }
}
