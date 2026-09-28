package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.p90;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class b9 extends p90 {
    public final /* synthetic */ int L;
    public final /* synthetic */ c9 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b9(c9 c9Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.L = i10;
        this.M = c9Var;
    }

    @Override // org.telegram.ui.Components.p90
    public final int c() {
        switch (this.L) {
            case 0:
                return this.M.a(super.c());
            default:
                return this.M.a(super.c());
        }
    }

    @Override // org.telegram.ui.Components.p90
    public final int d(int i10) {
        switch (this.L) {
        }
        return this.M.a(i10);
    }
}
