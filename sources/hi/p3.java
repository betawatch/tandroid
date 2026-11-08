package hi;

import android.content.Context;
import c8.ha;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.w70;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final class p3 extends org.telegram.ui.Cells.n4 {
    public final w70 r;

    public p3(Context context, f6 f6Var) {
        super(context, f6Var);
        w70 w70Var = new w70(context, f6Var);
        this.r = w70Var;
        w70Var.setTextSize(1, 14.0f);
        r6.V(w70Var, k6.z6, f6Var);
        r6.H(w70Var, k6.L6, f6Var);
        w70Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        addView(w70Var, ha.d(-2, -2.0f, (id.a0 ? 3 : 5) | 48, 10.0f, 14.0f, 10.0f, 0.0f));
    }
}
