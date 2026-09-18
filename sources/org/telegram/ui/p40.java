package org.telegram.ui;

import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class p40 extends org.telegram.ui.Components.uc0 {
    public p40(LaunchActivity launchActivity) {
        super(launchActivity, null);
    }

    @Override // org.telegram.ui.Components.uc0
    public final CharSequence d(int i10) {
        return LocaleController.formatPluralString("Hours", i10, new Object[0]);
    }
}
