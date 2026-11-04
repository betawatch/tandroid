package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h4 extends cb0 {
    public final /* synthetic */ int[] z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(Context context, org.telegram.ui.ActionBar.e6 e6Var, int[] iArr) {
        super(context, e6Var);
        this.z0 = iArr;
    }

    @Override // org.telegram.ui.Components.cb0
    public final CharSequence d(int i3) {
        int i10 = this.z0[i3];
        return i10 == 0 ? org.telegram.messenger.bd.M0(2131748315, null) : i10 < 60 ? org.telegram.messenger.bd.G(i10, "Minutes", new Object[0]) : i10 < 1440 ? org.telegram.messenger.bd.G(i10 / 60, "Hours", new Object[0]) : i10 < 10080 ? org.telegram.messenger.bd.G(i10 / 1440, "Days", new Object[0]) : i10 < 44640 ? org.telegram.messenger.bd.G(i10 / 10080, "Weeks", new Object[0]) : i10 < 525600 ? org.telegram.messenger.bd.G(i10 / 44640, "Months", new Object[0]) : org.telegram.messenger.bd.G(i10 / 525600, "Years", new Object[0]);
    }
}
