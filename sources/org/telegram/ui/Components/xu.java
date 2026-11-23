package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class xu extends View {
    public org.telegram.messenger.hc[] a;
    public fi.s2 b;
    public y5 c;
    public ValueAnimator d;
    public float e;

    public TLRPC.Document getDocument() {
        y5 y5Var = this.c;
        if (y5Var == null) {
            return null;
        }
        TLRPC.Document document = y5Var.document;
        if (document != null) {
            return document;
        }
        return p5.e(org.telegram.messenger.k10.t0, y5Var.getDocumentId());
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        if (isPressed() != z10) {
            super.setPressed(z10);
            invalidate();
            if (z10 && (valueAnimator = this.d) != null) {
                valueAnimator.removeAllListeners();
                this.d.cancel();
            }
            if (z10) {
                return;
            }
            float f10 = this.e;
            if (f10 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                this.d = ofFloat;
                ofFloat.addUpdateListener(new x(this, 18));
                this.d.addListener(new y(this, 24));
                org.telegram.ui.Cells.c0.q(5.0f, this.d);
                this.d.setDuration(350L);
                this.d.start();
            }
        }
    }
}
