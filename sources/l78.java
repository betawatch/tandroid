// default package

import android.app.Activity;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class l78 extends a {
    public final /* synthetic */ r78 G1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l78(r78 r78Var, Activity activity) {
        super(activity, null);
        this.G1 = r78Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        super.setAlpha(f);
        this.G1.b.invalidate();
    }
}
