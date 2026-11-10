package ei;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.y00;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class o extends w31 {
    public static final /* synthetic */ int b = 0;

    static {
        w31.h(new o());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
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
    public final View d(Context context, pj0 pj0Var, int i7, h6 h6Var) {
        return new p(context);
    }
}
