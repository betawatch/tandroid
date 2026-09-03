package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.f90;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class w8 extends f90 {
    public final /* synthetic */ int I;
    public final /* synthetic */ x8 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w8(x8 x8Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.I = i10;
        this.J = x8Var;
    }

    @Override // org.telegram.ui.Components.f90
    public final int c() {
        switch (this.I) {
            case 0:
                return this.J.a(super.c());
            default:
                return this.J.a(super.c());
        }
    }

    @Override // org.telegram.ui.Components.f90
    public final int d(int i10) {
        switch (this.I) {
        }
        return this.J.a(i10);
    }
}
