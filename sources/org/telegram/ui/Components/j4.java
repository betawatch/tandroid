package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class j4 extends od0 {
    public final /* synthetic */ int[] w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(Context context, org.telegram.ui.ActionBar.d6 d6Var, int[] iArr) {
        super(context, d6Var);
        this.w0 = iArr;
    }

    @Override // org.telegram.ui.Components.od0
    public final CharSequence d(int i10) {
        int i11 = this.w0[i10];
        return i11 == 0 ? LocaleController.getString(R.string.AutoDeleteNever) : i11 < 10080 ? LocaleController.formatPluralString("Days", i11 / 1440, new Object[0]) : i11 < 44640 ? LocaleController.formatPluralString("Weeks", i11 / 1440, new Object[0]) : i11 < 525600 ? LocaleController.formatPluralString("Months", i11 / 10080, new Object[0]) : LocaleController.formatPluralString("Years", ((i11 * 5) / 31) * 1440, new Object[0]);
    }
}
