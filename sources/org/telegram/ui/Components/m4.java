package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class m4 extends fd0 {
    public final /* synthetic */ int[] w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(Context context, org.telegram.ui.ActionBar.f6 f6Var, int[] iArr) {
        super(context, f6Var);
        this.w0 = iArr;
    }

    @Override // org.telegram.ui.Components.fd0
    public final CharSequence d(int i10) {
        int i11 = this.w0[i10];
        return i11 == 0 ? LocaleController.getString(R.string.MuteNever) : i11 < 60 ? LocaleController.formatPluralString("Minutes", i11, new Object[0]) : i11 < 1440 ? LocaleController.formatPluralString("Hours", i11 / 60, new Object[0]) : i11 < 10080 ? LocaleController.formatPluralString("Days", i11 / 1440, new Object[0]) : i11 < 44640 ? LocaleController.formatPluralString("Weeks", i11 / 10080, new Object[0]) : i11 < 525600 ? LocaleController.formatPluralString("Months", i11 / 44640, new Object[0]) : LocaleController.formatPluralString("Years", i11 / 525600, new Object[0]);
    }
}
