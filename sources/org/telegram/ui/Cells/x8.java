package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.e90;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class x8 extends e90 {
    public final /* synthetic */ int I;
    public final /* synthetic */ y8 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x8(y8 y8Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.I = i10;
        this.J = y8Var;
    }

    @Override // org.telegram.ui.Components.e90
    public final int c() {
        switch (this.I) {
            case 0:
                return this.J.a(super.c());
            default:
                return this.J.a(super.c());
        }
    }

    @Override // org.telegram.ui.Components.e90
    public final int d(int i10) {
        switch (this.I) {
        }
        return this.J.a(i10);
    }
}
