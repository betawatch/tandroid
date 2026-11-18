package ki;

import android.content.Context;
import c8.ma;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Components.k80;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class h3 extends o4 {
    public final k80 r;

    public h3(Context context, i6 i6Var) {
        super(context, i6Var);
        k80 k80Var = new k80(context, i6Var);
        this.r = k80Var;
        k80Var.setTextSize(1, 14.0f);
        u6.U(k80Var, n6.z6, i6Var);
        u6.G(k80Var, n6.L6, i6Var);
        k80Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        addView(k80Var, ma.d(-2, -2.0f, (gd.a0 ? 3 : 5) | 48, 10.0f, 14.0f, 10.0f, 0.0f));
    }
}
