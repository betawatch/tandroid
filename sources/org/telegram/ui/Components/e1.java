package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e1 implements bc0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int[] b;

    public /* synthetic */ e1(int i10, int[] iArr) {
        this.a = i10;
        this.b = iArr;
    }

    @Override // org.telegram.ui.Components.bc0
    public final String g(int i10) {
        switch (this.a) {
            case 0:
                int i11 = this.b[i10];
                return i11 == 0 ? LocaleController.getString(R.string.MuteNever) : i11 < 60 ? LocaleController.formatPluralString("Minutes", i11, new Object[0]) : i11 < 1440 ? LocaleController.formatPluralString("Hours", i11 / 60, new Object[0]) : i11 < 10080 ? LocaleController.formatPluralString("Days", i11 / 1440, new Object[0]) : i11 < 44640 ? LocaleController.formatPluralString("Weeks", i11 / 10080, new Object[0]) : i11 < 525600 ? LocaleController.formatPluralString("Months", i11 / 44640, new Object[0]) : LocaleController.formatPluralString("Years", i11 / 525600, new Object[0]);
            default:
                int i12 = this.b[i10];
                return i12 == 0 ? LocaleController.getString(R.string.AutoDeleteNever) : i12 < 10080 ? LocaleController.formatPluralString("Days", i12 / 1440, new Object[0]) : i12 < 44640 ? LocaleController.formatPluralString("Weeks", i12 / 10080, new Object[0]) : i12 < 525600 ? LocaleController.formatPluralString("Months", i12 / 44640, new Object[0]) : LocaleController.formatPluralString("Years", i12 / 525600, new Object[0]);
        }
    }
}
