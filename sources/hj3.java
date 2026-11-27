// default package

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
