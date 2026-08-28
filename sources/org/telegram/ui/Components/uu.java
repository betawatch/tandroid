package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class uu extends View {
    public ImageReceiver.BackgroundThreadDrawHolder[] a;
    public ih.z2 b;
    public t5 c;
    public ValueAnimator d;
    public float e;

    public TLRPC.Document getDocument() {
        t5 t5Var = this.c;
        if (t5Var == null) {
            return null;
        }
        TLRPC.Document document = t5Var.document;
        if (document != null) {
            return document;
        }
        return k5.f(UserConfig.selectedAccount, t5Var.getDocumentId());
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30));
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
                ofFloat.addUpdateListener(new e6(this, 17));
                this.d.addListener(new org.telegram.ui.xp(this, 24));
                this.d.setInterpolator(new OvershootInterpolator(5.0f));
                this.d.setDuration(350L);
                this.d.start();
            }
        }
    }
}
