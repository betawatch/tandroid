package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.n90;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class c9 extends n90 {
    public final /* synthetic */ int L;
    public final /* synthetic */ d9 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c9(d9 d9Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.L = i10;
        this.M = d9Var;
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
