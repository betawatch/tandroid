package ii;

import android.content.Context;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.s70;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class p3 extends org.telegram.ui.Cells.n4 {
    public final s70 r;

    public p3(Context context, e6 e6Var) {
        super(context, e6Var);
        s70 s70Var = new s70(context, e6Var);
        this.r = s70Var;
        s70Var.setTextSize(1, 14.0f);
        r6.V(s70Var, k6.z6, e6Var);
        r6.H(s70Var, k6.L6, e6Var);
        s70Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        addView(s70Var, mf.d(-2, -2.0f, (bd.a0 ? 3 : 5) | 48, 10.0f, 14.0f, 10.0f, 0.0f));
    }
}
