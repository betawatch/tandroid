package bi;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class h5 extends LinearLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h5(k7 k7Var, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = k7Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                if (this.b.T2.c(0)) {
                    break;
                }
                break;
            case 1:
                if (this.b.T2.c(1)) {
                    break;
                }
                break;
            case 2:
                if (this.b.T2.c(2)) {
                    break;
                }
                break;
            default:
                if (this.b.T2.c(3)) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
