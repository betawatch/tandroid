package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class p7 implements eo0 {
    public final /* synthetic */ k8 a;

    public p7(k8 k8Var) {
        this.a = k8Var;
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
        k8 k8Var = this.a;
        sb2.append(LocaleController.formatPluralString("Minutes", k8Var.D0 / 60, new Object[0]));
        sb2.append(' ');
        sb2.append(LocaleController.formatPluralString("Seconds", k8Var.D0 % 60, new Object[0]));
        return LocaleController.formatString("AccDescrPlayerDuration", R.string.AccDescrPlayerDuration, sb2.toString(), LocaleController.formatPluralString("Minutes", k8Var.E0 / 60, new Object[0]) + ' ' + LocaleController.formatPluralString("Seconds", k8Var.E0 % 60, new Object[0]));
    }

    @Override // org.telegram.ui.Components.eo0
    public final /* synthetic */ int l0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.eo0
    public final void B() {
    }
}
