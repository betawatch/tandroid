package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class h1 implements rc0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int[] b;

    public /* synthetic */ h1(int i10, int[] iArr) {
        this.a = i10;
        this.b = iArr;
    }

    @Override // org.telegram.ui.Components.rc0
    public final String f(int i10) {
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
