package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class p4 extends nd0 {
    public final /* synthetic */ int[] y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(Context context, org.telegram.ui.ActionBar.u6 u6Var, int[] iArr) {
        super(context, u6Var);
        this.y0 = iArr;
    }

    @Override // org.telegram.ui.Components.nd0
    public final CharSequence d(int i10) {
        int i11 = this.y0[i10];
        return i11 == 0 ? LocaleController.getString(R.string.MuteNever) : i11 < 60 ? LocaleController.formatPluralString("Minutes", i11, new Object[0]) : i11 < 1440 ? LocaleController.formatPluralString("Hours", i11 / 60, new Object[0]) : i11 < 10080 ? LocaleController.formatPluralString("Days", i11 / 1440, new Object[0]) : i11 < 44640 ? LocaleController.formatPluralString("Weeks", i11 / 10080, new Object[0]) : i11 < 525600 ? LocaleController.formatPluralString("Months", i11 / 44640, new Object[0]) : LocaleController.formatPluralString("Years", i11 / 525600, new Object[0]);
    }
}
