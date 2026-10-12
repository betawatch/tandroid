package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class r7 implements fp0 {
    public final /* synthetic */ m8 a;

    public r7(m8 m8Var) {
        this.a = m8Var;
    }

    @Override // org.telegram.ui.Components.fp0
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

    @Override // org.telegram.ui.Components.fp0
    public final CharSequence getContentDescription() {
        StringBuilder sb2 = new StringBuilder();
        m8 m8Var = this.a;
        sb2.append(LocaleController.formatPluralString("Minutes", m8Var.D0 / 60, new Object[0]));
        sb2.append(' ');
        sb2.append(LocaleController.formatPluralString("Seconds", m8Var.D0 % 60, new Object[0]));
        return LocaleController.formatString("AccDescrPlayerDuration", R.string.AccDescrPlayerDuration, sb2.toString(), LocaleController.formatPluralString("Minutes", m8Var.E0 / 60, new Object[0]) + ' ' + LocaleController.formatPluralString("Seconds", m8Var.E0 % 60, new Object[0]));
    }

    @Override // org.telegram.ui.Components.fp0
    public final /* synthetic */ int k0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.fp0
    public final void z() {
    }
}
