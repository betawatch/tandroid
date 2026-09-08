package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class iv extends View {
    public ImageReceiver.BackgroundThreadDrawHolder[] a;
    public bi.y3 b;
    public z5 c;
    public ValueAnimator d;
    public float e;

    public TLRPC.Document getDocument() {
        z5 z5Var = this.c;
        if (z5Var == null) {
            return null;
        }
        TLRPC.Document document = z5Var.document;
        if (document != null) {
            return document;
        }
        return q5.f(UserConfig.selectedAccount, z5Var.getDocumentId());
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
                ofFloat.addUpdateListener(new l6(this, 17));
                this.d.addListener(new j6(this, 21));
                this.d.setInterpolator(new OvershootInterpolator(5.0f));
                this.d.setDuration(350L);
                this.d.start();
            }
        }
    }
}
