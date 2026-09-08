package org.telegram.ui;

import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class o40 extends org.telegram.ui.Components.vc0 {
    public o40(LaunchActivity launchActivity) {
        super(launchActivity, null);
    }

    @Override // org.telegram.ui.Components.vc0
    public final CharSequence d(int i10) {
        return LocaleController.formatPluralString("Minutes", i10, new Object[0]);
    }
}
