package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.d90;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class c9 extends d90 {
    public final /* synthetic */ int L;
    public final /* synthetic */ d9 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c9(d9 d9Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.L = i10;
        this.M = d9Var;
    }

    @Override // org.telegram.ui.Components.d90
    public final int c() {
        switch (this.L) {
            case 0:
                return this.M.a(super.c());
            default:
                return this.M.a(super.c());
        }
    }

    @Override // org.telegram.ui.Components.d90
    public final int d(int i10) {
        switch (this.L) {
        }
        return this.M.a(i10);
    }
}
