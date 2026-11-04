package ai;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.ma;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j2 extends ci.l6 {
    public final /* synthetic */ int u3 = 0;
    public final /* synthetic */ ma v3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(b3 b3Var, Context context, int i3, long j10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i3, j10, e6Var, null);
        this.v3 = b3Var;
    }

    @Override // org.telegram.ui.ActionBar.t2
    public int Q() {
        switch (this.u3) {
            case 1:
                return ((ci.l6) this.v3).Q();
            default:
                return super.Q();
        }
    }

    @Override // ci.l6, org.telegram.ui.ActionBar.t2, org.telegram.ui.ActionBar.z1
    public fc k() {
        switch (this.u3) {
            case 0:
                b3 b3Var = (b3) this.v3;
                return new fc(b3Var.c, b3Var.J0);
            default:
                return super.k();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(ci.l6 l6Var, Context context, int i3, long j10, org.telegram.ui.ActionBar.e6 e6Var, View view) {
        super(context, i3, j10, e6Var, view);
        this.v3 = l6Var;
    }
}
