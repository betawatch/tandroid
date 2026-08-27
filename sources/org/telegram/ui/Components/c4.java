package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class c4 extends fc0 {
    public final /* synthetic */ int[] s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(Context context, org.telegram.ui.ActionBar.c6 c6Var, int[] iArr) {
        super(context, c6Var);
        this.s0 = iArr;
    }

    @Override // org.telegram.ui.Components.fc0
    public final CharSequence d(int i10) {
        int i11 = this.s0[i10];
        return i11 == 0 ? LocaleController.getString(R.string.AutoDeleteNever) : i11 < 10080 ? LocaleController.formatPluralString("Days", i11 / 1440, new Object[0]) : i11 < 44640 ? LocaleController.formatPluralString("Weeks", i11 / 1440, new Object[0]) : i11 < 525600 ? LocaleController.formatPluralString("Months", i11 / 10080, new Object[0]) : LocaleController.formatPluralString("Years", ((i11 * 5) / 31) * 1440, new Object[0]);
    }
}
