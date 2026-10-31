package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class vu extends View {
    public org.telegram.messenger.jc[] a;
    public ag.c2 b;
    public o5 c;
    public ValueAnimator d;
    public float e;

    public TLRPC.Document getDocument() {
        o5 o5Var = this.c;
        if (o5Var == null) {
            return null;
        }
        TLRPC.Document document = o5Var.document;
        if (document != null) {
            return document;
        }
        return f5.e(org.telegram.messenger.d20.s0, o5Var.getDocumentId());
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setPadding(org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30));
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
            float f7 = this.e;
            if (f7 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                this.d = ofFloat;
                ofFloat.addUpdateListener(new a6(this, 17));
                this.d.addListener(new w5(this, 23));
                org.telegram.messenger.z20.j(5.0f, this.d);
                this.d.setDuration(350L);
                this.d.start();
            }
        }
    }
}
