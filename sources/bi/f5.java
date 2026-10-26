package bi;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
