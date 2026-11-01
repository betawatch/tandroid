package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class vu extends ru {
    public final vv W;
    public final vv X;
    public final boolean Y;
    public final org.telegram.ui.Cells.u9[] Z;

    public vu(wv wvVar, Rect rect, int i10, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(wvVar, rect, i10);
        vv vvVar = !TextUtils.isEmpty(spannableStringBuilder) ? new vv(wvVar, spannableStringBuilder, this.c) : null;
        this.W = vvVar;
        vv vvVar2 = TextUtils.isEmpty(spannableStringBuilder2) ? null : new vv(wvVar, spannableStringBuilder2, this.c);
        this.X = vvVar2;
        this.Y = wvVar.I();
        ArrayList arrayList = new ArrayList(2);
        if (vvVar != null) {
            arrayList.add(vvVar);
        }
        if (vvVar2 != null) {
            arrayList.add(vvVar2);
        }
        this.Z = (org.telegram.ui.Cells.u9[]) arrayList.toArray(new org.telegram.ui.Cells.u9[0]);
    }

    @Override // org.telegram.messenger.ru
    public final int H() {
        Rect rect = this.b;
        int i10 = rect.top;
        vv vvVar = this.W;
        int i02 = i0() + (vvVar != null ? vvVar.b.getHeight() : 0) + i10;
        vv vvVar2 = this.X;
        return i02 + (vvVar2 != null ? vvVar2.b.getHeight() : 0) + rect.bottom;
    }

    @Override // org.telegram.messenger.ru
    public final int I() {
        int i10;
        int i11;
        Rect rect = this.b;
        vv vvVar = this.X;
        if (vvVar != null) {
            i10 = vvVar.q() + rect.left;
            i11 = rect.right;
        } else {
            vv vvVar2 = this.W;
            if (vvVar2 != null) {
                i10 = vvVar2.q() + rect.left;
                i11 = rect.right;
            } else {
                i10 = rect.left;
                i11 = rect.right;
            }
        }
        return i10 + i11;
    }

    @Override // org.telegram.messenger.ru
    public final int J() {
        vv vvVar = this.W;
        int max = vvVar != null ? Math.max(0, vvVar.r()) : 0;
        vv vvVar2 = this.X;
        if (vvVar2 != null) {
            max = Math.max(max, vvVar2.r());
        }
        Rect rect = this.b;
        return rect.left + max + rect.right;
    }

    @Override // org.telegram.messenger.ru
    public final org.telegram.ui.Cells.u9[] K() {
        return this.Z;
    }

    @Override // org.telegram.messenger.ru
    public final void S() {
        vv vvVar = this.W;
        if (vvVar != null) {
            vvVar.i(this.V);
        }
        vv vvVar2 = this.X;
        if (vvVar2 != null) {
            vvVar2.i(this.V);
        }
    }

    @Override // org.telegram.messenger.ru
    public final void U() {
        vv vvVar = this.W;
        if (vvVar != null) {
            vvVar.f(this.V);
        }
        vv vvVar2 = this.X;
        if (vvVar2 != null) {
            vvVar2.f(this.V);
        }
    }

    @Override // org.telegram.messenger.ru
    public final void V(Canvas canvas) {
        vv vvVar = this.W;
        if (vvVar != null) {
            vvVar.d(canvas, vvVar.S);
        }
        vv vvVar2 = this.X;
        if (vvVar2 != null) {
            canvas.save();
            canvas.translate(h0(), i0() + (vvVar != null ? vvVar.b.getHeight() : 0));
            vvVar2.d(canvas, vvVar2.S);
            canvas.restore();
        }
    }

    @Override // org.telegram.messenger.ru
    public final boolean X(MotionEvent motionEvent) {
        vv vvVar = this.W;
        int height = vvVar != null ? vvVar.b.getHeight() : 0;
        int i02 = i0();
        float y3 = motionEvent.getY();
        int i10 = this.b.top;
        float f7 = y3 - i10;
        if (vvVar != null && f7 >= 0.0f && f7 < height) {
            motionEvent.offsetLocation(0.0f, -i10);
            boolean t10 = vvVar.t(motionEvent);
            motionEvent.offsetLocation(0.0f, r5.top);
            return t10;
        }
        vv vvVar2 = this.X;
        if (vvVar2 == null || f7 < height + i02) {
            return false;
        }
        int h02 = h0();
        motionEvent.offsetLocation(-h02, -r6);
        boolean t11 = vvVar2.t(motionEvent);
        motionEvent.offsetLocation(h02, i10 + height + i02);
        return t11;
    }

    @Override // org.telegram.messenger.ru
    public final void Y(int i10, int i11, int i12) {
        this.S = i10;
        this.T = i11;
        this.U = i12;
        vv vvVar = this.W;
        if (vvVar != null) {
            vvVar.c = i10 - vvVar.f;
            vvVar.d = i11;
            vvVar.e = i12;
        }
        vv vvVar2 = this.X;
        if (vvVar2 != null) {
            vvVar2.c = (h0() + i10) - vvVar2.f;
            vvVar2.d = i0() + (vvVar != null ? vvVar.b.getHeight() : 0) + i11;
            vvVar2.e = i12;
        }
    }

    public final int h0() {
        vv vvVar = this.X;
        if (vvVar == null || !this.Y) {
            return 0;
        }
        int i10 = this.a.C;
        Rect rect = this.b;
        return Math.max(0, ((i10 - rect.left) - rect.right) - vvVar.r());
    }

    public final int i0() {
        if (this.W == null || this.X == null) {
            return 0;
        }
        return i0.L(4.0f);
    }

    @Override // org.telegram.messenger.ru
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        StaticLayout staticLayout;
        ru.l(spannableStringBuilder, this.W, null);
        vv vvVar = this.X;
        if (vvVar == null || (staticLayout = vvVar.b) == null || TextUtils.isEmpty(staticLayout.getText())) {
            return;
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            spannableStringBuilder.append('\n');
        }
        spannableStringBuilder.append(staticLayout.getText());
    }

    @Override // org.telegram.messenger.ru
    public final boolean v() {
        return false;
    }
}
