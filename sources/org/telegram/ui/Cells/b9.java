package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.y90;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class b9 extends y90 {
    public final /* synthetic */ int L;
    public final /* synthetic */ c9 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b9(c9 c9Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, g6Var);
        this.L = i10;
        this.M = c9Var;
    }

    @Override // org.telegram.ui.Components.y90
    public final int c() {
        switch (this.L) {
            case 0:
                return this.M.a(super.c());
            default:
                return this.M.a(super.c());
        }
    }

    @Override // org.telegram.ui.Components.y90
    public final int d(int i10) {
        switch (this.L) {
        }
        return this.M.a(i10);
    }
}
