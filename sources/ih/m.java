package ih;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;
import org.telegram.ui.qg0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class m extends z41 {
    public static final /* synthetic */ int b = 0;

    static {
        z41.h(new m());
    }

    @Override // org.telegram.ui.Components.z41
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        qg0 qg0Var = (qg0) view;
        qg0Var.a((TLObject) a51Var.G, a51Var.z, true);
        qg0Var.setOnClickListener(a51Var.D);
    }

    @Override // org.telegram.ui.Components.z41
    public final boolean c(a51 a51Var, a51 a51Var2) {
        return a51Var.B == a51Var2.B;
    }

    @Override // org.telegram.ui.Components.z41
    public final View d(Context context, tk0 tk0Var, int i10, p6 p6Var) {
        qg0 qg0Var = new qg0(context);
        qg0Var.setBackground(t6.N0(false));
        return qg0Var;
    }

    @Override // org.telegram.ui.Components.z41
    public final boolean e(a51 a51Var, a51 a51Var2) {
        return a51Var.B == a51Var2.B;
    }
}
