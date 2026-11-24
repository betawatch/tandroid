// default package

import android.content.Context;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jb2 extends RadioButton {
    public final /* synthetic */ kb2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb2(kb2 kb2Var, Context context) {
        super(context);
        this.y = kb2Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.y.invalidate();
    }
}
