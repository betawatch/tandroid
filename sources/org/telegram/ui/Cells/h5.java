package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class h5 extends Switch {
    public final /* synthetic */ i5 b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(i5 i5Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.b0 = i5Var;
    }

    @Override // org.telegram.ui.Components.Switch
    public final int a(int i7) {
        return this.b0.a(i7);
    }
}
