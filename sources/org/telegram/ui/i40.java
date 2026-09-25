package org.telegram.ui;

import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class i40 extends org.telegram.ui.Components.ed0 {
    public i40(LaunchActivity launchActivity) {
        super(launchActivity, null);
    }

    @Override // org.telegram.ui.Components.ed0
    public final CharSequence d(int i10) {
        return LocaleController.formatPluralString("Hours", i10, new Object[0]);
    }
}
