package org.telegram.ui;

import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class n40 extends org.telegram.ui.Components.uc0 {
    public n40(LaunchActivity launchActivity) {
        super(launchActivity, null);
    }

    @Override // org.telegram.ui.Components.uc0
    public final CharSequence d(int i10) {
        return LocaleController.formatPluralString("Hours", i10, new Object[0]);
    }
}
