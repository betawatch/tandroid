package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class l4 extends qc0 {
    public final /* synthetic */ int[] s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(Context context, org.telegram.ui.ActionBar.c6 c6Var, int[] iArr) {
        super(context, c6Var);
        this.s0 = iArr;
    }

    @Override // org.telegram.ui.Components.qc0
    public final CharSequence d(int i10) {
        int i11 = this.s0[i10];
        return i11 == 0 ? LocaleController.getString(R.string.MuteNever) : i11 < 60 ? LocaleController.formatPluralString("Minutes", i11, new Object[0]) : i11 < 1440 ? LocaleController.formatPluralString("Hours", i11 / 60, new Object[0]) : i11 < 10080 ? LocaleController.formatPluralString("Days", i11 / 1440, new Object[0]) : i11 < 44640 ? LocaleController.formatPluralString("Weeks", i11 / 10080, new Object[0]) : i11 < 525600 ? LocaleController.formatPluralString("Months", i11 / 44640, new Object[0]) : LocaleController.formatPluralString("Years", i11 / 525600, new Object[0]);
    }
}
