package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class e4 extends hb0 {
    public final /* synthetic */ int[] y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(Context context, org.telegram.ui.ActionBar.f6 f6Var, int[] iArr) {
        super(context, f6Var);
        this.y0 = iArr;
    }

    @Override // org.telegram.ui.Components.hb0
    public final CharSequence d(int i7) {
        int i10 = this.y0[i7];
        return i10 == 0 ? org.telegram.messenger.id.M0(2131753849, null) : i10 < 10080 ? org.telegram.messenger.id.G(i10 / 1440, "Days", new Object[0]) : i10 < 44640 ? org.telegram.messenger.id.G(i10 / 1440, "Weeks", new Object[0]) : i10 < 525600 ? org.telegram.messenger.id.G(i10 / 10080, "Months", new Object[0]) : org.telegram.messenger.id.G(((i10 * 5) / 31) * 1440, "Years", new Object[0]);
    }
}
