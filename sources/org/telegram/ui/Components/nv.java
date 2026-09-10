package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class nv extends View {
    public ImageReceiver.BackgroundThreadDrawHolder[] a;
    public gg.h1 b;
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
        return p5.f(UserConfig.selectedAccount, y5Var.getDocumentId());
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
                ofFloat.addUpdateListener(new j6(this, 17));
                this.d.addListener(new rm(this, 8));
                this.d.setInterpolator(new OvershootInterpolator(5.0f));
                this.d.setDuration(350L);
                this.d.start();
            }
        }
    }
}
