// default package

import android.content.Context;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class oa2 extends RadioButton {
    public final /* synthetic */ pa2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa2(pa2 pa2Var, Context context) {
        super(context);
        this.y = pa2Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.y.invalidate();
    }
}
