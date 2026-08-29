package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.y80;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class v8 extends y80 {
    public final /* synthetic */ int H;
    public final /* synthetic */ w8 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v8(w8 w8Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.H = i10;
        this.I = w8Var;
    }

    @Override // org.telegram.ui.Components.y80
    public final int c() {
        switch (this.H) {
            case 0:
                return this.I.a(super.c());
            default:
                return this.I.a(super.c());
        }
    }

    @Override // org.telegram.ui.Components.y80
    public final int d(int i10) {
        switch (this.H) {
        }
        return this.I.a(i10);
    }
}
