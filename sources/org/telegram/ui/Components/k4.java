package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class k4 extends sb0 {
    public final /* synthetic */ int[] z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(Context context, org.telegram.ui.ActionBar.i6 i6Var, int[] iArr) {
        super(context, i6Var);
        this.z0 = iArr;
    }

    @Override // org.telegram.ui.Components.sb0
    public final CharSequence d(int i7) {
        int i10 = this.z0[i7];
        return i10 == 0 ? org.telegram.messenger.gd.M0(2131753847, null) : i10 < 10080 ? org.telegram.messenger.gd.G(i10 / 1440, "Days", new Object[0]) : i10 < 44640 ? org.telegram.messenger.gd.G(i10 / 1440, "Weeks", new Object[0]) : i10 < 525600 ? org.telegram.messenger.gd.G(i10 / 10080, "Months", new Object[0]) : org.telegram.messenger.gd.G(((i10 * 5) / 31) * 1440, "Years", new Object[0]);
    }
}
