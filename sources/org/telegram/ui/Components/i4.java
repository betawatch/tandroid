package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class i4 extends hb0 {
    public final /* synthetic */ int[] y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(Context context, org.telegram.ui.ActionBar.h6 h6Var, int[] iArr) {
        super(context, h6Var);
        this.y0 = iArr;
    }

    @Override // org.telegram.ui.Components.hb0
    public final CharSequence d(int i7) {
        int i10 = this.y0[i7];
        return i10 == 0 ? org.telegram.messenger.id.M0(2131748307, null) : i10 < 60 ? org.telegram.messenger.id.G(i10, "Minutes", new Object[0]) : i10 < 1440 ? org.telegram.messenger.id.G(i10 / 60, "Hours", new Object[0]) : i10 < 10080 ? org.telegram.messenger.id.G(i10 / 1440, "Days", new Object[0]) : i10 < 44640 ? org.telegram.messenger.id.G(i10 / 10080, "Weeks", new Object[0]) : i10 < 525600 ? org.telegram.messenger.id.G(i10 / 44640, "Months", new Object[0]) : org.telegram.messenger.id.G(i10 / 525600, "Years", new Object[0]);
    }
}
