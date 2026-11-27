// default package

import android.content.Context;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
