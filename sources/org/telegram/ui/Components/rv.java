package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class rv extends View {
    public ImageReceiver.BackgroundThreadDrawHolder[] a;
    public di.f3 b;
    public c6 c;
    public ValueAnimator d;
    public float e;

    public TLRPC.Document getDocument() {
        c6 c6Var = this.c;
        if (c6Var == null) {
            return null;
        }
        TLRPC.Document document = c6Var.document;
        if (document != null) {
            return document;
        }
        return t5.f(UserConfig.selectedAccount, c6Var.getDocumentId());
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
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
                ofFloat.addUpdateListener(new n6(this, 18));
                this.d.addListener(new org.telegram.ui.qp(this, 25));
                org.telegram.ui.d3.m(5.0f, this.d);
                this.d.setDuration(350L);
                this.d.start();
            }
        }
    }
}
