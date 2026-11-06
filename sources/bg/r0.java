package bg;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class r0 extends ViewOutlineProvider {
    public final /* synthetic */ int a = 0;
    public float b;

    public r0(int i7) {
        this.b = i7;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.a) {
            case 0:
                outline.setRoundRect(view.getPaddingLeft(), view.getPaddingTop(), view.getMeasuredWidth() - view.getPaddingRight(), view.getMeasuredHeight() - view.getPaddingBottom(), this.b);
                break;
            default:
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), org.telegram.messenger.g0.N(this.b));
                break;
        }
    }

    public r0(float f10) {
        this.b = f10;
    }
}
