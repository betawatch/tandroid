package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class ku extends View {
    public org.telegram.messenger.ic[] a;
    public di.z2 b;
    public r5 c;
    public ValueAnimator d;
    public float e;

    public TLRPC.Document getDocument() {
        r5 r5Var = this.c;
        if (r5Var == null) {
            return null;
        }
        TLRPC.Document document = r5Var.document;
        if (document != null) {
            return document;
        }
        return i5.e(org.telegram.messenger.p10.s0, r5Var.getDocumentId());
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public void setPressed(boolean z9) {
        ValueAnimator valueAnimator;
        if (isPressed() != z9) {
            super.setPressed(z9);
            invalidate();
            if (z9 && (valueAnimator = this.d) != null) {
                valueAnimator.removeAllListeners();
                this.d.cancel();
            }
            if (z9) {
                return;
            }
            float f10 = this.e;
            if (f10 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                this.d = ofFloat;
                ofFloat.addUpdateListener(new e6(this, 17));
                this.d.addListener(new z5(this, 23));
                org.telegram.messenger.camera.q.i(5.0f, this.d);
                this.d.setDuration(350L);
                this.d.start();
            }
        }
    }
}
