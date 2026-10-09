package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class q7 implements jp0 {
    public final /* synthetic */ l8 a;

    public q7(l8 l8Var) {
        this.a = l8Var;
    }

    @Override // org.telegram.ui.Components.jp0
    public final void X(float f7, boolean z10) {
        if (z10) {
            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f7);
        }
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null || !playingMessageObject.isMusic()) {
            return;
        }
        this.a.G0(playingMessageObject, false);
    }

    @Override // org.telegram.ui.Components.jp0
    public final CharSequence getContentDescription() {
        StringBuilder sb2 = new StringBuilder();
        l8 l8Var = this.a;
        sb2.append(LocaleController.formatPluralString("Minutes", l8Var.D0 / 60, new Object[0]));
        sb2.append(' ');
        sb2.append(LocaleController.formatPluralString("Seconds", l8Var.D0 % 60, new Object[0]));
        return LocaleController.formatString("AccDescrPlayerDuration", R.string.AccDescrPlayerDuration, sb2.toString(), LocaleController.formatPluralString("Minutes", l8Var.E0 / 60, new Object[0]) + ' ' + LocaleController.formatPluralString("Seconds", l8Var.E0 % 60, new Object[0]));
    }

    @Override // org.telegram.ui.Components.jp0
    public final /* synthetic */ int i0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.jp0
    public final void z() {
    }
}
