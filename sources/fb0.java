// default package

import android.app.Activity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class fb0 extends nb0 {
    public final /* synthetic */ eb0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb0(ob0 ob0Var, Activity activity, eb0 eb0Var) {
        super(ob0Var, activity);
        this.H = eb0Var;
    }

    @Override // nb0, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.H.invalidate();
    }
}
