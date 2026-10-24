package ei;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.xp;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class k3 extends xp {
    public final /* synthetic */ int d;
    public final /* synthetic */ ViewGroup e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k3(ViewGroup viewGroup, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, 21, g6Var);
        this.d = i10;
        this.e = viewGroup;
    }

    @Override // android.view.View
    public final void invalidate() {
        switch (this.d) {
            case 0:
                super.invalidate();
                ((m3) this.e).invalidate();
                break;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Cells.q2) this.e).invalidate();
                break;
            default:
                super.invalidate();
                ((org.telegram.ui.web.i) this.e).invalidate();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(m3 m3Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, 24, g6Var);
        this.d = 0;
        this.e = m3Var;
    }
}
