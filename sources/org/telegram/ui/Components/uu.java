package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class uu extends View {
    public org.telegram.messenger.gc[] a;
    public fi.s2 b;
    public x5 c;
    public ValueAnimator d;
    public float e;

    public TLRPC.Document getDocument() {
        x5 x5Var = this.c;
        if (x5Var == null) {
            return null;
        }
        TLRPC.Document document = x5Var.document;
        if (document != null) {
            return document;
        }
        return o5.e(org.telegram.messenger.j10.t0, x5Var.getDocumentId());
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
                ofFloat.addUpdateListener(new w(this, 18));
                this.d.addListener(new x(this, 24));
                org.telegram.ui.Cells.c0.q(5.0f, this.d);
                this.d.setDuration(350L);
                this.d.start();
            }
        }
    }
}
