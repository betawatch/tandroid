package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class o7 implements yo0 {
    public final /* synthetic */ j8 a;

    public o7(j8 j8Var) {
        this.a = j8Var;
    }

    @Override // org.telegram.ui.Components.yo0
    public final void Y(float f7, boolean z10) {
        if (z10) {
            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f7);
        }
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null || !playingMessageObject.isMusic()) {
            return;
        }
        this.a.G0(playingMessageObject, false);
    }

    @Override // org.telegram.ui.Components.yo0
    public final CharSequence getContentDescription() {
        StringBuilder sb2 = new StringBuilder();
        j8 j8Var = this.a;
        sb2.append(LocaleController.formatPluralString("Minutes", j8Var.D0 / 60, new Object[0]));
        sb2.append(' ');
        sb2.append(LocaleController.formatPluralString("Seconds", j8Var.D0 % 60, new Object[0]));
        return LocaleController.formatString("AccDescrPlayerDuration", R.string.AccDescrPlayerDuration, sb2.toString(), LocaleController.formatPluralString("Minutes", j8Var.E0 / 60, new Object[0]) + ' ' + LocaleController.formatPluralString("Seconds", j8Var.E0 % 60, new Object[0]));
    }

    @Override // org.telegram.ui.Components.yo0
    public final /* synthetic */ int p0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.yo0
    public final void B() {
    }
}
