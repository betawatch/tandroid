package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q20 extends ImageView {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q20(Object obj, Context context, int i10, int i11) {
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
                org.telegram.ui.b10 b10Var = (org.telegram.ui.b10) this.c;
                t80 t80Var = b10Var.s;
                if (b10Var.r) {
                    int i10 = this.b / 2;
                    t80Var.setBounds(i10, i10, getWidth() - i10, getHeight() - i10);
                    t80Var.draw(canvas);
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
                    ((org.telegram.ui.b40) ((kg.e1) this.c).d).i1.x(this.b, true);
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
                return drawable == ((org.telegram.ui.b10) this.c).s || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
