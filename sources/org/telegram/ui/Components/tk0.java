package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class tk0 extends p5 {
    public final v5 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ScrollSlidingTextTabStrip f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk0(ScrollSlidingTextTabStrip scrollSlidingTextTabStrip, Context context, int i7) {
        super(context);
        this.f = scrollSlidingTextTabStrip;
        this.e = i7;
        this.d = new v5(this, 360L, wq.h);
    }

    @Override // org.telegram.ui.Components.p5, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.d.d(this.f.n0);
        if (d > 0.0f) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (org.telegram.messenger.g0.T1(1.0f, 0.5f, d) * 255.0f));
        } else {
            canvas2 = canvas;
        }
        super.onDraw(canvas2);
        if (d > 0.0f) {
            canvas2.restore();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setSelected(this.f.r == this.e);
    }
}
