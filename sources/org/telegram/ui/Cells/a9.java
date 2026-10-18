package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.x90;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class a9 extends x90 {
    public final /* synthetic */ int L;
    public final /* synthetic */ b9 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a9(b9 b9Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.L = i10;
        this.M = b9Var;
    }

    @Override // org.telegram.ui.Components.x90
    public final int c() {
        switch (this.L) {
            case 0:
                return this.M.a(super.c());
            default:
                return this.M.a(super.c());
        }
    }

    @Override // org.telegram.ui.Components.x90
    public final int d(int i10) {
        switch (this.L) {
        }
        return this.M.a(i10);
    }
}
