package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.n90;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class b9 extends n90 {
    public final /* synthetic */ int L;
    public final /* synthetic */ c9 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b9(c9 c9Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.L = i10;
        this.M = c9Var;
    }

    @Override // org.telegram.ui.Components.n90
    public final int c() {
        switch (this.L) {
            case 0:
                return this.M.a(super.c());
            default:
                return this.M.a(super.c());
        }
    }

    @Override // org.telegram.ui.Components.n90
    public final int d(int i10) {
        switch (this.L) {
        }
        return this.M.a(i10);
    }
}
