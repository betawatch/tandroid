package ki;

import android.content.Context;
import c8.ja;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Components.z70;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class m3 extends n4 {
    public final z70 r;

    public m3(Context context, e6 e6Var) {
        super(context, e6Var);
        z70 z70Var = new z70(context, e6Var);
        this.r = z70Var;
        z70Var.setTextSize(1, 14.0f);
        q6.U(z70Var, j6.z6, e6Var);
        q6.G(z70Var, j6.L6, e6Var);
        z70Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        addView(z70Var, ja.d(-2, -2.0f, (hd.a0 ? 3 : 5) | 48, 10.0f, 14.0f, 10.0f, 0.0f));
    }
}
