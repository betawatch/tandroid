// default package

import android.content.Context;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
