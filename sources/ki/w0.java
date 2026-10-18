package ki;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class w0 extends e61 {
    public static final /* synthetic */ int a = 0;

    static {
        e61.setup(new w0());
    }

    @Override // org.telegram.ui.Components.e61
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        x0 x0Var = (x0) view;
        a aVar = (a) f61Var.G;
        s2 s2Var = (s2) f61Var.H;
        x0Var.a = aVar;
        x0Var.v = s2Var;
        x0Var.w = LocaleController.isRTL;
        x0Var.c(aVar);
    }

    @Override // org.telegram.ui.Components.e61
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new x0(context, d6Var);
    }

    @Override // org.telegram.ui.Components.e61
    public final boolean isClickable() {
        return false;
    }
}
