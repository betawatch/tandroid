package ki;

import android.content.Context;
import c8.na;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Components.j80;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class h3 extends o4 {
    public final j80 r;

    public h3(Context context, i6 i6Var) {
        super(context, i6Var);
        j80 j80Var = new j80(context, i6Var);
        this.r = j80Var;
        j80Var.setTextSize(1, 14.0f);
        u6.U(j80Var, n6.z6, i6Var);
        u6.G(j80Var, n6.L6, i6Var);
        j80Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        addView(j80Var, na.d(-2, -2.0f, (gd.a0 ? 3 : 5) | 48, 10.0f, 14.0f, 10.0f, 0.0f));
    }
}
