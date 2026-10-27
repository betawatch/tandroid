package bi;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class f5 extends LinearLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ h7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f5(h7 h7Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = h7Var;
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
