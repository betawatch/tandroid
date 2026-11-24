// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gh4 extends ImageView {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gh4(Object obj, Context context, int i, byte b) {
        super(context);
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                super.onDraw(canvas);
                hh4 hh4Var = (hh4) this.c;
                qa6 qa6Var = hh4Var.s;
                if (hh4Var.r) {
                    int i = this.b / 2;
                    qa6Var.setBounds(i, i, getWidth() - i, getHeight() - i);
                    qa6Var.draw(canvas);
                    break;
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        switch (this.a) {
            case 1:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                if (accessibilityEvent.getEventType() == 32768) {
                    ((d85) ((db5) this.c).d).l1.x(this.b, true);
                    break;
                }
                break;
            default:
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                break;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                return drawable == ((hh4) this.c).s || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
