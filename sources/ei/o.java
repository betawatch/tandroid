package ei;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.y00;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class o extends q31 {
    public static final /* synthetic */ int b = 0;

    static {
        q31.h(new o());
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        p pVar = (p) view;
        y00 y00Var = (y00) r31Var.G;
        pVar.a.setText(y00Var.b);
        pVar.b.setText(y00Var.c);
        if (pVar.c != z9) {
            pVar.invalidate();
        }
        pVar.c = z9;
        pVar.setWillNotDraw(!z9);
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        return new p(context);
    }
}
