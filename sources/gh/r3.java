package gh;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class r3 extends LinearLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ k5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r3(k5 k5Var, Context context, int i9) {
        super(context);
        this.a = i9;
        this.b = k5Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                if (this.b.U0.c(0)) {
                    break;
                }
                break;
            case 1:
                if (this.b.U0.c(1)) {
                    break;
                }
                break;
            case 2:
                if (this.b.U0.c(2)) {
                    break;
                }
                break;
            default:
                if (this.b.U0.c(3)) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
