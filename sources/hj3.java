// default package

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class hj3 extends rq4 {
    public final /* synthetic */ byte L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hj3(Context context, vnb vnbVar, byte b) {
        super(context, vnbVar);
        this.L = b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.L) {
            case 0:
                if (motionEvent.getAction() != 0 || getAlpha() >= 0.25f) {
                    break;
                }
                break;
            default:
                if (motionEvent.getAction() != 0 || getAlpha() >= 0.25f) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
