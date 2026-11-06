package ei;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.y00;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class o extends w31 {
    public static final /* synthetic */ int b = 0;

    static {
        w31.h(new o());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        p pVar = (p) view;
        y00 y00Var = (y00) x31Var.G;
        pVar.a.setText(y00Var.b);
        pVar.b.setText(y00Var.c);
        if (pVar.c != z9) {
            pVar.invalidate();
        }
        pVar.c = z9;
        pVar.setWillNotDraw(!z9);
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        return new p(context);
    }
}
