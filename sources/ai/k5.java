package ai;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class k5 extends LinearLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ l7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k5(l7 l7Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = l7Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                if (this.b.b1.c(0)) {
                    break;
                }
                break;
            case 1:
                if (this.b.b1.c(1)) {
                    break;
                }
                break;
            case 2:
                if (this.b.b1.c(2)) {
                    break;
                }
                break;
            default:
                if (this.b.b1.c(3)) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
