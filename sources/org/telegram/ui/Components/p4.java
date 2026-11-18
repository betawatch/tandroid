package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class p4 extends sb0 {
    public final /* synthetic */ int[] z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(Context context, org.telegram.ui.ActionBar.i6 i6Var, int[] iArr) {
        super(context, i6Var);
        this.z0 = iArr;
    }

    @Override // org.telegram.ui.Components.sb0
    public final CharSequence d(int i7) {
        int i10 = this.z0[i7];
        return i10 == 0 ? org.telegram.messenger.gd.M0(2131748115, null) : i10 < 60 ? org.telegram.messenger.gd.G(i10, "Minutes", new Object[0]) : i10 < 1440 ? org.telegram.messenger.gd.G(i10 / 60, "Hours", new Object[0]) : i10 < 10080 ? org.telegram.messenger.gd.G(i10 / 1440, "Days", new Object[0]) : i10 < 44640 ? org.telegram.messenger.gd.G(i10 / 10080, "Weeks", new Object[0]) : i10 < 525600 ? org.telegram.messenger.gd.G(i10 / 44640, "Months", new Object[0]) : org.telegram.messenger.gd.G(i10 / 525600, "Years", new Object[0]);
    }
}
