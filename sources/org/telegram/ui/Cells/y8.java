package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.p80;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class y8 extends p80 {
    public final /* synthetic */ int L;
    public final /* synthetic */ z8 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y8(z8 z8Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        super(context, p6Var);
        this.L = i10;
        this.M = z8Var;
    }

    @Override // org.telegram.ui.Components.p80
    public final int c() {
        switch (this.L) {
            case 0:
                return this.M.a(super.c());
            default:
                return this.M.a(super.c());
        }
    }

    @Override // org.telegram.ui.Components.p80
    public final int d(int i10) {
        switch (this.L) {
        }
        return this.M.a(i10);
    }
}
