// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class cx9 extends oh8 {
    public final /* synthetic */ dx9 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx9(dx9 dx9Var, Context context) {
        super(2, null, context);
        this.N = dx9Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        dx9 dx9Var = this.N;
        if (dx9Var.getParent() instanceof View) {
            ((View) dx9Var.getParent()).invalidate();
        }
    }
}
