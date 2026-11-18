package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.k80;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class x8 extends k80 {
    public final /* synthetic */ int M;
    public final /* synthetic */ y8 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x8(y8 y8Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        super(context, i6Var);
        this.M = i7;
        this.N = y8Var;
    }

    @Override // org.telegram.ui.Components.k80
    public final int c() {
        switch (this.M) {
            case 0:
                return this.N.a(super.c());
            default:
                return this.N.a(super.c());
        }
    }

    @Override // org.telegram.ui.Components.k80
    public final int d(int i7) {
        switch (this.M) {
        }
        return this.N.a(i7);
    }
}
