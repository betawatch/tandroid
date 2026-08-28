package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class vl0 extends s5 {
    public final y5 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ScrollSlidingTextTabStrip f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl0(ScrollSlidingTextTabStrip scrollSlidingTextTabStrip, Context context, int i9) {
        super(context);
        this.f = scrollSlidingTextTabStrip;
        this.e = i9;
        this.d = new y5(this, 360L, gr.h);
    }

    @Override // org.telegram.ui.Components.s5, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float e10 = this.d.e(this.f.j0);
        if (e10 > 0.0f) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (AndroidUtilities.lerp(1.0f, 0.5f, e10) * 255.0f));
        } else {
            canvas2 = canvas;
        }
        super.onDraw(canvas2);
        if (e10 > 0.0f) {
            canvas2.restore();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setSelected(this.f.r == this.e);
    }
}
