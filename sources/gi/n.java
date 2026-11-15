package gi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.v00;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class n extends a41 {
    public static final /* synthetic */ int b = 0;

    static {
        a41.h(new n());
    }

    @Override // org.telegram.ui.Components.a41
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        o oVar = (o) view;
        v00 v00Var = (v00) b41Var.G;
        oVar.a.setText(v00Var.b);
        oVar.b.setText(v00Var.c);
        if (oVar.c != z10) {
            oVar.invalidate();
        }
        oVar.c = z10;
        oVar.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.a41
    public final View d(Context context, uj0 uj0Var, int i7, e6 e6Var) {
        return new o(context);
    }
}
