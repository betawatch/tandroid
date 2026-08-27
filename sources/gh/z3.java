package gh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class z3 extends m41 {
    public static final /* synthetic */ int a = 0;

    static {
        m41.setup(new z3());
    }

    @Override // org.telegram.ui.Components.m41
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        p80 p80Var = (p80) view;
        p80Var.setGravity(n41Var.z);
        p80Var.setTextColor((int) n41Var.B);
        p80Var.setTextSize(1, n41Var.A);
        p80Var.setTypeface(n41Var.q ? AndroidUtilities.bold() : null);
        int i10 = n41Var.i;
        p80Var.setPadding(i10, 0, i10, n41Var.k);
        p80Var.setText(n41Var.l);
    }

    @Override // org.telegram.ui.Components.m41
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new ag.v2(context, 1, null);
    }
}
