package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class r7 implements kp0 {
    public final /* synthetic */ m8 a;

    public r7(m8 m8Var) {
        this.a = m8Var;
    }

    @Override // org.telegram.ui.Components.kp0
    public final void U(float f7, boolean z10) {
        if (z10) {
            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f7);
        }
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null || !playingMessageObject.isMusic()) {
            return;
        }
        this.a.M0(playingMessageObject, false);
    }

    @Override // org.telegram.ui.Components.kp0
    public final CharSequence getContentDescription() {
        StringBuilder sb2 = new StringBuilder();
        m8 m8Var = this.a;
        sb2.append(LocaleController.formatPluralString("Minutes", m8Var.C0 / 60, new Object[0]));
        sb2.append(' ');
        sb2.append(LocaleController.formatPluralString("Seconds", m8Var.C0 % 60, new Object[0]));
        return LocaleController.formatString("AccDescrPlayerDuration", R.string.AccDescrPlayerDuration, sb2.toString(), LocaleController.formatPluralString("Minutes", m8Var.D0 / 60, new Object[0]) + ' ' + LocaleController.formatPluralString("Seconds", m8Var.D0 % 60, new Object[0]));
    }

    @Override // org.telegram.ui.Components.kp0
    public final /* synthetic */ int k0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.kp0
    public final void y() {
    }
}
