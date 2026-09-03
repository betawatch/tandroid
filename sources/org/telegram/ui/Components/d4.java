package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class d4 extends xc0 {
    public final /* synthetic */ int[] t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(Context context, org.telegram.ui.ActionBar.f6 f6Var, int[] iArr) {
        super(context, f6Var);
        this.t0 = iArr;
    }

    @Override // org.telegram.ui.Components.xc0
    public final CharSequence d(int i10) {
        int i11 = this.t0[i10];
        return i11 == 0 ? LocaleController.getString(R.string.AutoDeleteNever) : i11 < 10080 ? LocaleController.formatPluralString("Days", i11 / 1440, new Object[0]) : i11 < 44640 ? LocaleController.formatPluralString("Weeks", i11 / 1440, new Object[0]) : i11 < 525600 ? LocaleController.formatPluralString("Months", i11 / 10080, new Object[0]) : LocaleController.formatPluralString("Years", ((i11 * 5) / 31) * 1440, new Object[0]);
    }
}
