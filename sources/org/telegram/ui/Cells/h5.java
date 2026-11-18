package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
