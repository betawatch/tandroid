package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class pu extends View {
    public org.telegram.messenger.hc[] a;
    public fi.u2 b;
    public p5 c;
    public ValueAnimator d;
    public float e;

    public TLRPC.Document getDocument() {
        p5 p5Var = this.c;
        if (p5Var == null) {
            return null;
        }
        TLRPC.Document document = p5Var.document;
        if (document != null) {
            return document;
        }
        return g5.e(org.telegram.messenger.m10.t0, p5Var.getDocumentId());
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
                ofFloat.addUpdateListener(new c6(this, 17));
                this.d.addListener(new x5(this, 23));
                org.telegram.messenger.i20.k(5.0f, this.d);
                this.d.setDuration(350L);
                this.d.start();
            }
        }
    }
}
