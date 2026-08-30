package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class i7 implements jo0 {
    public final /* synthetic */ c8 a;

    public i7(c8 c8Var) {
        this.a = c8Var;
    }

    @Override // org.telegram.ui.Components.jo0
    public final void Y(float f10, boolean z4) {
        if (z4) {
            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f10);
        }
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null || !playingMessageObject.isMusic()) {
            return;
        }
        this.a.G0(playingMessageObject, false);
    }

    @Override // org.telegram.ui.Components.jo0
    public final CharSequence getContentDescription() {
        StringBuilder sb = new StringBuilder();
        c8 c8Var = this.a;
        sb.append(LocaleController.formatPluralString("Minutes", c8Var.A0 / 60, new Object[0]));
        sb.append(' ');
        sb.append(LocaleController.formatPluralString("Seconds", c8Var.A0 % 60, new Object[0]));
        return LocaleController.formatString("AccDescrPlayerDuration", R.string.AccDescrPlayerDuration, sb.toString(), LocaleController.formatPluralString("Minutes", c8Var.B0 / 60, new Object[0]) + ' ' + LocaleController.formatPluralString("Seconds", c8Var.B0 % 60, new Object[0]));
    }

    @Override // org.telegram.ui.Components.jo0
    public final /* synthetic */ int j0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.jo0
    public final void B() {
    }
}
