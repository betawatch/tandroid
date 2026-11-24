// default package

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ay3 extends zx3 {
    public final /* synthetic */ by3 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay3(by3 by3Var, Context context, int i) {
        super(by3Var.s, context, i);
        this.P = by3Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.P.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
