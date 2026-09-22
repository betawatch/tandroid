package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.c90;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class b9 extends c90 {
    public final /* synthetic */ int L;
    public final /* synthetic */ c9 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b9(c9 c9Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, e6Var);
        this.L = i10;
        this.M = c9Var;
    }

    @Override // org.telegram.ui.Components.c90
    public final int c() {
        switch (this.L) {
            case 0:
                return this.M.a(super.c());
            default:
                return this.M.a(super.c());
        }
    }

    @Override // org.telegram.ui.Components.c90
    public final int d(int i10) {
        switch (this.L) {
        }
        return this.M.a(i10);
    }
}
