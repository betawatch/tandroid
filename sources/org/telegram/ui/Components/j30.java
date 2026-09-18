package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class j30 extends ImageView {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j30(Object obj, Context context, int i10, int i11) {
        super(context);
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.onDraw(canvas);
                org.telegram.ui.b20 b20Var = (org.telegram.ui.b20) this.c;
                g90 g90Var = b20Var.s;
                if (b20Var.r) {
                    int i10 = this.b / 2;
                    g90Var.setBounds(i10, i10, getWidth() - i10, getHeight() - i10);
                    g90Var.draw(canvas);
                    break;
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        switch (this.a) {
            case 0:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((k30) this.c).c.b.x(this.b, true);
                    break;
                }
                break;
            default:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                break;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.a) {
            case 1:
                return drawable == ((org.telegram.ui.b20) this.c).s || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
