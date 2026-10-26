package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.z90;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class f9 extends z90 {
    public final /* synthetic */ int L;
    public final /* synthetic */ g9 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f9(g9 g9Var, Context context, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        super(context, u6Var);
        this.L = i10;
        this.M = g9Var;
    }

    @Override // org.telegram.ui.Components.z90
    public final int c() {
        switch (this.L) {
            case 0:
                return this.M.a(super.c());
            default:
                return this.M.a(super.c());
        }
    }

    @Override // org.telegram.ui.Components.z90
    public final int d(int i10) {
        switch (this.L) {
        }
        return this.M.a(i10);
    }
}
