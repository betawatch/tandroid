package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class h7 implements on0 {
    public final /* synthetic */ c8 a;

    public h7(c8 c8Var) {
        this.a = c8Var;
    }

    @Override // org.telegram.ui.Components.on0
    public final void Q(float f10, boolean z10) {
        if (z10) {
            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f10);
        }
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null || !playingMessageObject.isMusic()) {
            return;
        }
        this.a.F0(playingMessageObject, false);
    }

    @Override // org.telegram.ui.Components.on0
    public final /* synthetic */ int c0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.on0
    public final CharSequence getContentDescription() {
        StringBuilder sb2 = new StringBuilder();
        c8 c8Var = this.a;
        sb2.append(LocaleController.formatPluralString("Minutes", c8Var.z0 / 60, new Object[0]));
        sb2.append(' ');
        sb2.append(LocaleController.formatPluralString("Seconds", c8Var.z0 % 60, new Object[0]));
        return LocaleController.formatString("AccDescrPlayerDuration", R.string.AccDescrPlayerDuration, sb2.toString(), LocaleController.formatPluralString("Minutes", c8Var.A0 / 60, new Object[0]) + ' ' + LocaleController.formatPluralString("Seconds", c8Var.A0 % 60, new Object[0]));
    }

    @Override // org.telegram.ui.Components.on0
    public final void n() {
    }
}
