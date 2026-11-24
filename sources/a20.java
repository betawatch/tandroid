// default package

import android.app.Activity;
import android.view.MotionEvent;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class a20 extends av9 {
    public final /* synthetic */ i20 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a20(i20 i20Var, Activity activity, wjb wjbVar) {
        super(wjbVar, activity, false);
        this.n0 = i20Var;
    }

    @Override // av9
    public final boolean d(MotionEvent motionEvent) {
        if (this.n0.A2 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
