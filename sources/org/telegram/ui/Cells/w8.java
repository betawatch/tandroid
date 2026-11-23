package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.j80;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class w8 extends j80 {
    public final /* synthetic */ int M;
    public final /* synthetic */ x8 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w8(x8 x8Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        super(context, i6Var);
        this.M = i7;
        this.N = x8Var;
    }

    @Override // org.telegram.ui.Components.j80
    public final int c() {
        switch (this.M) {
            case 0:
                return this.N.a(super.c());
            default:
                return this.N.a(super.c());
        }
    }

    @Override // org.telegram.ui.Components.j80
    public final int d(int i7) {
        switch (this.M) {
        }
        return this.N.a(i7);
    }
}
