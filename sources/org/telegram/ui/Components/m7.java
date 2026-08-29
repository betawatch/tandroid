package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class m7 implements zn0 {
    public final /* synthetic */ g8 a;

    public m7(g8 g8Var) {
        this.a = g8Var;
    }

    @Override // org.telegram.ui.Components.zn0
    public final void W(float f9, boolean z10) {
        if (z10) {
            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f9);
        }
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null || !playingMessageObject.isMusic()) {
            return;
        }
        this.a.G0(playingMessageObject, false);
    }

    @Override // org.telegram.ui.Components.zn0
    public final CharSequence getContentDescription() {
        StringBuilder sb2 = new StringBuilder();
        g8 g8Var = this.a;
        sb2.append(LocaleController.formatPluralString("Minutes", g8Var.z0 / 60, new Object[0]));
        sb2.append(' ');
        sb2.append(LocaleController.formatPluralString("Seconds", g8Var.z0 % 60, new Object[0]));
        return LocaleController.formatString("AccDescrPlayerDuration", R.string.AccDescrPlayerDuration, sb2.toString(), LocaleController.formatPluralString("Minutes", g8Var.A0 / 60, new Object[0]) + ' ' + LocaleController.formatPluralString("Seconds", g8Var.A0 % 60, new Object[0]));
    }

    @Override // org.telegram.ui.Components.zn0
    public final /* synthetic */ int k0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.zn0
    public final void v() {
    }
}
