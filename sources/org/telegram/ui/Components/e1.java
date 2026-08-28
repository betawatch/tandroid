package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e1 implements xb0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int[] b;

    public /* synthetic */ e1(int i9, int[] iArr) {
        this.a = i9;
        this.b = iArr;
    }

    @Override // org.telegram.ui.Components.xb0
    public final String g(int i9) {
        switch (this.a) {
            case 0:
                int i10 = this.b[i9];
                return i10 == 0 ? LocaleController.getString(R.string.MuteNever) : i10 < 60 ? LocaleController.formatPluralString("Minutes", i10, new Object[0]) : i10 < 1440 ? LocaleController.formatPluralString("Hours", i10 / 60, new Object[0]) : i10 < 10080 ? LocaleController.formatPluralString("Days", i10 / 1440, new Object[0]) : i10 < 44640 ? LocaleController.formatPluralString("Weeks", i10 / 10080, new Object[0]) : i10 < 525600 ? LocaleController.formatPluralString("Months", i10 / 44640, new Object[0]) : LocaleController.formatPluralString("Years", i10 / 525600, new Object[0]);
            default:
                int i11 = this.b[i9];
                return i11 == 0 ? LocaleController.getString(R.string.AutoDeleteNever) : i11 < 10080 ? LocaleController.formatPluralString("Days", i11 / 1440, new Object[0]) : i11 < 44640 ? LocaleController.formatPluralString("Weeks", i11 / 10080, new Object[0]) : i11 < 525600 ? LocaleController.formatPluralString("Months", i11 / 44640, new Object[0]) : LocaleController.formatPluralString("Years", i11 / 525600, new Object[0]);
        }
    }
}
