// default package

import android.app.Activity;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
