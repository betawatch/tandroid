package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class sm0 extends t5 {
    public final z5 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ScrollSlidingTextTabStrip f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sm0(ScrollSlidingTextTabStrip scrollSlidingTextTabStrip, Context context, int i10) {
        super(context);
        this.f = scrollSlidingTextTabStrip;
        this.e = i10;
        this.d = new z5(this, 360L, pr.h);
    }

    @Override // org.telegram.ui.Components.t5, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float e6 = this.d.e(this.f.k0);
        if (e6 > 0.0f) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (AndroidUtilities.lerp(1.0f, 0.5f, e6) * 255.0f));
        } else {
            canvas2 = canvas;
        }
        super.onDraw(canvas2);
        if (e6 > 0.0f) {
            canvas2.restore();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setSelected(this.f.r == this.e);
    }
}
