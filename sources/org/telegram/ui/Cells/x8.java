package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.g90;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class x8 extends g90 {
    public final /* synthetic */ int I;
    public final /* synthetic */ y8 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x8(y8 y8Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, g6Var);
        this.I = i10;
        this.J = y8Var;
    }

    @Override // org.telegram.ui.Components.g90
    public final int c() {
        switch (this.I) {
            case 0:
                return this.J.a(super.c());
            default:
                return this.J.a(super.c());
        }
    }

    @Override // org.telegram.ui.Components.g90
    public final int d(int i10) {
        switch (this.I) {
        }
        return this.J.a(i10);
    }
}
