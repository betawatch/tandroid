package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.aa0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class f9 extends aa0 {
    public final /* synthetic */ int L;
    public final /* synthetic */ g9 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f9(g9 g9Var, Context context, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        super(context, u6Var);
        this.L = i10;
        this.M = g9Var;
    }

    @Override // org.telegram.ui.Components.aa0
    public final int c() {
        switch (this.L) {
            case 0:
                return this.M.a(super.c());
            default:
                return this.M.a(super.c());
        }
    }

    @Override // org.telegram.ui.Components.aa0
    public final int d(int i10) {
        switch (this.L) {
        }
        return this.M.a(i10);
    }
}
