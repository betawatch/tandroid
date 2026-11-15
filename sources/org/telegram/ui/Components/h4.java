package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class h4 extends ib0 {
    public final /* synthetic */ int[] z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(Context context, org.telegram.ui.ActionBar.e6 e6Var, int[] iArr) {
        super(context, e6Var);
        this.z0 = iArr;
    }

    @Override // org.telegram.ui.Components.ib0
    public final CharSequence d(int i7) {
        int i10 = this.z0[i7];
        return i10 == 0 ? org.telegram.messenger.hd.M0(2131748307, null) : i10 < 60 ? org.telegram.messenger.hd.G(i10, "Minutes", new Object[0]) : i10 < 1440 ? org.telegram.messenger.hd.G(i10 / 60, "Hours", new Object[0]) : i10 < 10080 ? org.telegram.messenger.hd.G(i10 / 1440, "Days", new Object[0]) : i10 < 44640 ? org.telegram.messenger.hd.G(i10 / 10080, "Weeks", new Object[0]) : i10 < 525600 ? org.telegram.messenger.hd.G(i10 / 44640, "Months", new Object[0]) : org.telegram.messenger.hd.G(i10 / 525600, "Years", new Object[0]);
    }
}
