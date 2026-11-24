// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jt9 extends fn {
    public final ln d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ScrollSlidingTextTabStrip f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jt9(ScrollSlidingTextTabStrip scrollSlidingTextTabStrip, Context context, int i) {
        super(context);
        this.f = scrollSlidingTextTabStrip;
        this.e = i;
        this.d = new ln(360L, this, d53.h);
    }

    @Override // fn, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.d.d(this.f.o0);
        if (d > 0.0f) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (gm.R1(1.0f, 0.5f, d) * 255.0f));
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
