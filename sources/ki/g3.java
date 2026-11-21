package ki;

import android.content.Context;
import c8.ma;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Components.m80;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class g3 extends o4 {
    public final m80 r;

    public g3(Context context, h6 h6Var) {
        super(context, h6Var);
        m80 m80Var = new m80(context, h6Var);
        this.r = m80Var;
        m80Var.setTextSize(1, 14.0f);
        t6.U(m80Var, m6.z6, h6Var);
        t6.G(m80Var, m6.L6, h6Var);
        m80Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        addView(m80Var, ma.d(-2, -2.0f, (gd.a0 ? 3 : 5) | 48, 10.0f, 14.0f, 10.0f, 0.0f));
    }
}
