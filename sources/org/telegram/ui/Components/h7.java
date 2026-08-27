package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class h7 implements pn0 {
    public final /* synthetic */ b8 a;

    public h7(b8 b8Var) {
        this.a = b8Var;
    }

    @Override // org.telegram.ui.Components.pn0
    public final void P(float f10, boolean z10) {
        if (z10) {
            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f10);
        }
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null || !playingMessageObject.isMusic()) {
            return;
        }
        this.a.G0(playingMessageObject, false);
    }

    @Override // org.telegram.ui.Components.pn0
    public final /* synthetic */ int a0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.pn0
    public final CharSequence getContentDescription() {
        StringBuilder sb2 = new StringBuilder();
        b8 b8Var = this.a;
        sb2.append(LocaleController.formatPluralString("Minutes", b8Var.z0 / 60, new Object[0]));
        sb2.append(' ');
        sb2.append(LocaleController.formatPluralString("Seconds", b8Var.z0 % 60, new Object[0]));
        return LocaleController.formatString("AccDescrPlayerDuration", R.string.AccDescrPlayerDuration, sb2.toString(), LocaleController.formatPluralString("Minutes", b8Var.A0 / 60, new Object[0]) + ' ' + LocaleController.formatPluralString("Seconds", b8Var.A0 % 60, new Object[0]));
    }

    @Override // org.telegram.ui.Components.pn0
    public final void r() {
    }
}
