package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class k4 extends qb0 {
    public final /* synthetic */ int[] z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(Context context, org.telegram.ui.ActionBar.i6 i6Var, int[] iArr) {
        super(context, i6Var);
        this.z0 = iArr;
    }

    @Override // org.telegram.ui.Components.qb0
    public final CharSequence d(int i7) {
        int i10 = this.z0[i7];
        return i10 == 0 ? org.telegram.messenger.gd.N0(2131753846, null) : i10 < 10080 ? org.telegram.messenger.gd.G(i10 / 1440, "Days", new Object[0]) : i10 < 44640 ? org.telegram.messenger.gd.G(i10 / 1440, "Weeks", new Object[0]) : i10 < 525600 ? org.telegram.messenger.gd.G(i10 / 10080, "Months", new Object[0]) : org.telegram.messenger.gd.G(((i10 * 5) / 31) * 1440, "Years", new Object[0]);
    }
}
