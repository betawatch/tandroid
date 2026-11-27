// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class dh4 extends ImageView {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dh4(Object obj, Context context, int i, byte b) {
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
                eh4 eh4Var = (eh4) this.c;
                va6 va6Var = eh4Var.s;
                if (eh4Var.r) {
                    int i = this.b / 2;
                    va6Var.setBounds(i, i, getWidth() - i, getHeight() - i);
                    va6Var.draw(canvas);
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
                    ((h85) ((gb5) this.c).d).l1.x(this.b, true);
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
                return drawable == ((eh4) this.c).s || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
