package fi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.q00;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class n extends q31 {
    public static final /* synthetic */ int b = 0;

    static {
        q31.h(new n());
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        o oVar = (o) view;
        q00 q00Var = (q00) r31Var.G;
        oVar.a.setText(q00Var.b);
        oVar.b.setText(q00Var.c);
        if (oVar.c != z10) {
            oVar.invalidate();
        }
        oVar.c = z10;
        oVar.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, tj0 tj0Var, int i3, e6 e6Var) {
        return new o(context);
    }
}
