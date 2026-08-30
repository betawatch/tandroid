package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class dv extends View {
    public ImageReceiver.BackgroundThreadDrawHolder[] a;
    public nh.y2 b;
    public u5 c;
    public ValueAnimator d;
    public float e;

    public TLRPC.Document getDocument() {
        u5 u5Var = this.c;
        if (u5Var == null) {
            return null;
        }
        TLRPC.Document document = u5Var.document;
        if (document != null) {
            return document;
        }
        return l5.f(UserConfig.selectedAccount, u5Var.getDocumentId());
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public void setPressed(boolean z4) {
        ValueAnimator valueAnimator;
        if (isPressed() != z4) {
            super.setPressed(z4);
            invalidate();
            if (z4 && (valueAnimator = this.d) != null) {
                valueAnimator.removeAllListeners();
                this.d.cancel();
            }
            if (z4) {
                return;
            }
            float f10 = this.e;
            if (f10 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                this.d = ofFloat;
                int i10 = 17;
                ofFloat.addUpdateListener(new f6(this, i10));
                this.d.addListener(new a9(this, i10));
                this.d.setInterpolator(new OvershootInterpolator(5.0f));
                this.d.setDuration(350L);
                this.d.start();
            }
        }
    }
}
