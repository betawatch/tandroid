package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class j4 extends hb0 {
    public final /* synthetic */ int[] y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(Context context, org.telegram.ui.ActionBar.f6 f6Var, int[] iArr) {
        super(context, f6Var);
        this.y0 = iArr;
    }

    @Override // org.telegram.ui.Components.hb0
    public final CharSequence d(int i7) {
        int i10 = this.y0[i7];
        return i10 == 0 ? org.telegram.messenger.hd.M0(2131748306, null) : i10 < 60 ? org.telegram.messenger.hd.G(i10, "Minutes", new Object[0]) : i10 < 1440 ? org.telegram.messenger.hd.G(i10 / 60, "Hours", new Object[0]) : i10 < 10080 ? org.telegram.messenger.hd.G(i10 / 1440, "Days", new Object[0]) : i10 < 44640 ? org.telegram.messenger.hd.G(i10 / 10080, "Weeks", new Object[0]) : i10 < 525600 ? org.telegram.messenger.hd.G(i10 / 44640, "Months", new Object[0]) : org.telegram.messenger.hd.G(i10 / 525600, "Years", new Object[0]);
    }
}
