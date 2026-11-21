package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class q4 extends tb0 {
    public final /* synthetic */ int[] z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(Context context, org.telegram.ui.ActionBar.h6 h6Var, int[] iArr) {
        super(context, h6Var);
        this.z0 = iArr;
    }

    @Override // org.telegram.ui.Components.tb0
    public final CharSequence d(int i7) {
        int i10 = this.z0[i7];
        return i10 == 0 ? org.telegram.messenger.gd.N0(2131748114, null) : i10 < 60 ? org.telegram.messenger.gd.G(i10, "Minutes", new Object[0]) : i10 < 1440 ? org.telegram.messenger.gd.G(i10 / 60, "Hours", new Object[0]) : i10 < 10080 ? org.telegram.messenger.gd.G(i10 / 1440, "Days", new Object[0]) : i10 < 44640 ? org.telegram.messenger.gd.G(i10 / 10080, "Weeks", new Object[0]) : i10 < 525600 ? org.telegram.messenger.gd.G(i10 / 44640, "Months", new Object[0]) : org.telegram.messenger.gd.G(i10 / 525600, "Years", new Object[0]);
    }
}
