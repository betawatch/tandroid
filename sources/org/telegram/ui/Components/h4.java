package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class h4 extends bc0 {
    public final /* synthetic */ int[] s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(Context context, org.telegram.ui.ActionBar.b6 b6Var, int[] iArr) {
        super(context, b6Var);
        this.s0 = iArr;
    }

    @Override // org.telegram.ui.Components.bc0
    public final CharSequence d(int i9) {
        int i10 = this.s0[i9];
        return i10 == 0 ? LocaleController.getString(R.string.MuteNever) : i10 < 60 ? LocaleController.formatPluralString("Minutes", i10, new Object[0]) : i10 < 1440 ? LocaleController.formatPluralString("Hours", i10 / 60, new Object[0]) : i10 < 10080 ? LocaleController.formatPluralString("Days", i10 / 1440, new Object[0]) : i10 < 44640 ? LocaleController.formatPluralString("Weeks", i10 / 10080, new Object[0]) : i10 < 525600 ? LocaleController.formatPluralString("Months", i10 / 44640, new Object[0]) : LocaleController.formatPluralString("Years", i10 / 525600, new Object[0]);
    }
}
