package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class uu extends qu {
    public final uv W;
    public final uv X;
    public final boolean Y;
    public final org.telegram.ui.Cells.u9[] Z;

    public uu(vv vvVar, Rect rect, int i10, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(vvVar, rect, i10);
        uv uvVar = !TextUtils.isEmpty(spannableStringBuilder) ? new uv(vvVar, spannableStringBuilder, this.c) : null;
        this.W = uvVar;
        uv uvVar2 = TextUtils.isEmpty(spannableStringBuilder2) ? null : new uv(vvVar, spannableStringBuilder2, this.c);
        this.X = uvVar2;
        this.Y = vvVar.I();
        ArrayList arrayList = new ArrayList(2);
        if (uvVar != null) {
            arrayList.add(uvVar);
        }
        if (uvVar2 != null) {
            arrayList.add(uvVar2);
        }
        this.Z = (org.telegram.ui.Cells.u9[]) arrayList.toArray(new org.telegram.ui.Cells.u9[0]);
    }

    @Override // org.telegram.messenger.qu
    public final int H() {
        Rect rect = this.b;
        int i10 = rect.top;
        uv uvVar = this.W;
        int i02 = i0() + (uvVar != null ? uvVar.b.getHeight() : 0) + i10;
        uv uvVar2 = this.X;
        return i02 + (uvVar2 != null ? uvVar2.b.getHeight() : 0) + rect.bottom;
    }

    @Override // org.telegram.messenger.qu
    public final int I() {
        int i10;
        int i11;
        Rect rect = this.b;
        uv uvVar = this.X;
        if (uvVar != null) {
            i10 = uvVar.q() + rect.left;
            i11 = rect.right;
        } else {
            uv uvVar2 = this.W;
            if (uvVar2 != null) {
                i10 = uvVar2.q() + rect.left;
                i11 = rect.right;
            } else {
                i10 = rect.left;
                i11 = rect.right;
            }
        }
        return i10 + i11;
    }

    @Override // org.telegram.messenger.qu
    public final int J() {
        uv uvVar = this.W;
        int max = uvVar != null ? Math.max(0, uvVar.r()) : 0;
        uv uvVar2 = this.X;
        if (uvVar2 != null) {
            max = Math.max(max, uvVar2.r());
        }
        Rect rect = this.b;
        return rect.left + max + rect.right;
    }

    @Override // org.telegram.messenger.qu
    public final org.telegram.ui.Cells.u9[] K() {
        return this.Z;
    }

    @Override // org.telegram.messenger.qu
    public final void S() {
        uv uvVar = this.W;
        if (uvVar != null) {
            uvVar.i(this.V);
        }
        uv uvVar2 = this.X;
        if (uvVar2 != null) {
            uvVar2.i(this.V);
        }
    }

    @Override // org.telegram.messenger.qu
    public final void U() {
        uv uvVar = this.W;
        if (uvVar != null) {
            uvVar.f(this.V);
        }
        uv uvVar2 = this.X;
        if (uvVar2 != null) {
            uvVar2.f(this.V);
        }
    }

    @Override // org.telegram.messenger.qu
    public final void V(Canvas canvas) {
        uv uvVar = this.W;
        if (uvVar != null) {
            uvVar.d(canvas, uvVar.S);
        }
        uv uvVar2 = this.X;
        if (uvVar2 != null) {
            canvas.save();
            canvas.translate(h0(), i0() + (uvVar != null ? uvVar.b.getHeight() : 0));
            uvVar2.d(canvas, uvVar2.S);
            canvas.restore();
        }
    }

    @Override // org.telegram.messenger.qu
    public final boolean X(MotionEvent motionEvent) {
        uv uvVar = this.W;
        int height = uvVar != null ? uvVar.b.getHeight() : 0;
        int i02 = i0();
        float y3 = motionEvent.getY();
        int i10 = this.b.top;
        float f7 = y3 - i10;
        if (uvVar != null && f7 >= 0.0f && f7 < height) {
            motionEvent.offsetLocation(0.0f, -i10);
            boolean t10 = uvVar.t(motionEvent);
            motionEvent.offsetLocation(0.0f, r5.top);
            return t10;
        }
        uv uvVar2 = this.X;
        if (uvVar2 == null || f7 < height + i02) {
            return false;
        }
        int h02 = h0();
        motionEvent.offsetLocation(-h02, -r6);
        boolean t11 = uvVar2.t(motionEvent);
        motionEvent.offsetLocation(h02, i10 + height + i02);
        return t11;
    }

    @Override // org.telegram.messenger.qu
    public final void Y(int i10, int i11, int i12) {
        this.S = i10;
        this.T = i11;
        this.U = i12;
        uv uvVar = this.W;
        if (uvVar != null) {
            uvVar.c = i10 - uvVar.f;
            uvVar.d = i11;
            uvVar.e = i12;
        }
        uv uvVar2 = this.X;
        if (uvVar2 != null) {
            uvVar2.c = (h0() + i10) - uvVar2.f;
            uvVar2.d = i0() + (uvVar != null ? uvVar.b.getHeight() : 0) + i11;
            uvVar2.e = i12;
        }
    }

    public final int h0() {
        uv uvVar = this.X;
        if (uvVar == null || !this.Y) {
            return 0;
        }
        int i10 = this.a.C;
        Rect rect = this.b;
        return Math.max(0, ((i10 - rect.left) - rect.right) - uvVar.r());
    }

    public final int i0() {
        if (this.W == null || this.X == null) {
            return 0;
        }
        return i0.L(4.0f);
    }

    @Override // org.telegram.messenger.qu
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        StaticLayout staticLayout;
        qu.l(spannableStringBuilder, this.W, null);
        uv uvVar = this.X;
        if (uvVar == null || (staticLayout = uvVar.b) == null || TextUtils.isEmpty(staticLayout.getText())) {
            return;
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            spannableStringBuilder.append('\n');
        }
        spannableStringBuilder.append(staticLayout.getText());
    }

    @Override // org.telegram.messenger.qu
    public final boolean v() {
        return false;
    }
}
