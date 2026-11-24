// default package

import android.app.Activity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class db0 extends lb0 {
    public final /* synthetic */ cb0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db0(mb0 mb0Var, Activity activity, cb0 cb0Var) {
        super(mb0Var, activity);
        this.H = cb0Var;
    }

    @Override // lb0, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.H.invalidate();
    }
}
