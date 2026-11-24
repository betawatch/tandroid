// default package

import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ix extends d32 {
    public boolean d0;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.d0 = true;
        setOffsetY(View.MeasureSpec.getSize(i2) * 0.4f);
        this.d0 = false;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i2) - gm.L(56.0f)) - gm.m, TLObject.FLAG_30));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.d0) {
            return;
        }
        super.requestLayout();
    }
}
