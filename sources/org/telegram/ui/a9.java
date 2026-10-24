package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class a9 extends FragmentContextView {
    public final /* synthetic */ int X0 = 0;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(m9 m9Var, Context context, m9 m9Var2, y8 y8Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, m9Var2, y8Var, false, g6Var);
        this.Y0 = m9Var;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.X0) {
            case 0:
                m9 m9Var = (m9) this.Y0;
                m9Var.M.i(m9Var.N, i10 == 0, true);
                break;
            default:
                ye1 ye1Var = (ye1) this.Y0;
                ye1Var.U0.i(ye1Var.F0, i10 == 0, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(ye1 ye1Var, Context context, ye1 ye1Var2) {
        super(context, ye1Var2, null, false, null);
        this.Y0 = ye1Var;
    }
}
