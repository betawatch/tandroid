package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.s70;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v8 extends s70 {
    public final /* synthetic */ int M;
    public final /* synthetic */ w8 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v8(w8 w8Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        super(context, e6Var);
        this.M = i3;
        this.N = w8Var;
    }

    @Override // org.telegram.ui.Components.s70
    public final int c() {
        switch (this.M) {
            case 0:
                return this.N.a(super.c());
            default:
                return this.N.a(super.c());
        }
    }

    @Override // org.telegram.ui.Components.s70
    public final int d(int i3) {
        switch (this.M) {
        }
        return this.N.a(i3);
    }
}
