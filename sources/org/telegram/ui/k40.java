package org.telegram.ui;

import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class k40 extends org.telegram.ui.Components.yc0 {
    public k40(LaunchActivity launchActivity) {
        super(launchActivity, null);
    }

    @Override // org.telegram.ui.Components.yc0
    public final CharSequence d(int i10) {
        return LocaleController.formatPluralString("Minutes", i10, new Object[0]);
    }
}
