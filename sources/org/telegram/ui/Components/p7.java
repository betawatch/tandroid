package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class p7 implements gp0 {
    public final /* synthetic */ k8 a;

    public p7(k8 k8Var) {
        this.a = k8Var;
    }

    @Override // org.telegram.ui.Components.gp0
    public final void L(float f7, boolean z10) {
        if (z10) {
            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f7);
        }
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null || !playingMessageObject.isMusic()) {
            return;
        }
        this.a.M0(playingMessageObject, false);
    }

    @Override // org.telegram.ui.Components.gp0
    public final /* synthetic */ int Y() {
        return 0;
    }

    @Override // org.telegram.ui.Components.gp0
    public final CharSequence getContentDescription() {
        StringBuilder sb2 = new StringBuilder();
        k8 k8Var = this.a;
        sb2.append(LocaleController.formatPluralString("Minutes", k8Var.C0 / 60, new Object[0]));
        sb2.append(' ');
        sb2.append(LocaleController.formatPluralString("Seconds", k8Var.C0 % 60, new Object[0]));
        return LocaleController.formatString("AccDescrPlayerDuration", R.string.AccDescrPlayerDuration, sb2.toString(), LocaleController.formatPluralString("Minutes", k8Var.D0 / 60, new Object[0]) + ' ' + LocaleController.formatPluralString("Seconds", k8Var.D0 % 60, new Object[0]));
    }

    @Override // org.telegram.ui.Components.gp0
    public final void v() {
    }
}
