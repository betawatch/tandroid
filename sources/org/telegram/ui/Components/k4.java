package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class k4 extends md0 {
    public final /* synthetic */ int[] y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(Context context, org.telegram.ui.ActionBar.u6 u6Var, int[] iArr) {
        super(context, u6Var);
        this.y0 = iArr;
    }

    @Override // org.telegram.ui.Components.md0
    public final CharSequence d(int i10) {
        int i11 = this.y0[i10];
        return i11 == 0 ? LocaleController.getString(R.string.AutoDeleteNever) : i11 < 10080 ? LocaleController.formatPluralString("Days", i11 / 1440, new Object[0]) : i11 < 44640 ? LocaleController.formatPluralString("Weeks", i11 / 1440, new Object[0]) : i11 < 525600 ? LocaleController.formatPluralString("Months", i11 / 10080, new Object[0]) : LocaleController.formatPluralString("Years", ((i11 * 5) / 31) * 1440, new Object[0]);
    }
}
