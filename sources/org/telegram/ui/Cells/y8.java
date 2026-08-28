package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.l80;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class y8 extends l80 {
    public final /* synthetic */ int H;
    public final /* synthetic */ z8 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y8(z8 z8Var, Context context, org.telegram.ui.ActionBar.b6 b6Var, int i9) {
        super(context, b6Var);
        this.H = i9;
        this.I = z8Var;
    }

    @Override // org.telegram.ui.Components.l80
    public final int c() {
        switch (this.H) {
            case 0:
                return this.I.a(super.c());
            default:
                return this.I.a(super.c());
        }
    }

    @Override // org.telegram.ui.Components.l80
    public final int d(int i9) {
        switch (this.H) {
        }
        return this.I.a(i9);
    }
}
