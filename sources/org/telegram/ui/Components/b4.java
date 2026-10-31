package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b4 extends ac0 {
    public final /* synthetic */ int[] y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(Context context, org.telegram.ui.ActionBar.p6 p6Var, int[] iArr) {
        super(context, p6Var);
        this.y0 = iArr;
    }

    @Override // org.telegram.ui.Components.ac0
    public final CharSequence d(int i10) {
        int i11 = this.y0[i10];
        return i11 == 0 ? org.telegram.messenger.cd.L0(2131753849, null) : i11 < 10080 ? org.telegram.messenger.cd.G(i11 / 1440, "Days", new Object[0]) : i11 < 44640 ? org.telegram.messenger.cd.G(i11 / 1440, "Weeks", new Object[0]) : i11 < 525600 ? org.telegram.messenger.cd.G(i11 / 10080, "Months", new Object[0]) : org.telegram.messenger.cd.G(((i11 * 5) / 31) * 1440, "Years", new Object[0]);
    }
}
