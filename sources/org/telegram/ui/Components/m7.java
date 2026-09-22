package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class m7 implements eo0 {
    public final /* synthetic */ h8 a;

    public m7(h8 h8Var) {
        this.a = h8Var;
    }

    @Override // org.telegram.ui.Components.eo0
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

    @Override // org.telegram.ui.Components.eo0
    public final CharSequence getContentDescription() {
        StringBuilder sb2 = new StringBuilder();
        h8 h8Var = this.a;
        sb2.append(LocaleController.formatPluralString("Minutes", h8Var.D0 / 60, new Object[0]));
        sb2.append(' ');
        sb2.append(LocaleController.formatPluralString("Seconds", h8Var.D0 % 60, new Object[0]));
        return LocaleController.formatString("AccDescrPlayerDuration", R.string.AccDescrPlayerDuration, sb2.toString(), LocaleController.formatPluralString("Minutes", h8Var.E0 / 60, new Object[0]) + ' ' + LocaleController.formatPluralString("Seconds", h8Var.E0 % 60, new Object[0]));
    }

    @Override // org.telegram.ui.Components.eo0
    public final /* synthetic */ int m0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.eo0
    public final void B() {
    }
}
