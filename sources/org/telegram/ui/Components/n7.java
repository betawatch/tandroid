package org.telegram.ui.Components;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class n7 implements ro0 {
    public final /* synthetic */ i8 a;

    public n7(i8 i8Var) {
        this.a = i8Var;
    }

    @Override // org.telegram.ui.Components.ro0
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

    @Override // org.telegram.ui.Components.ro0
    public final CharSequence getContentDescription() {
        StringBuilder sb2 = new StringBuilder();
        i8 i8Var = this.a;
        sb2.append(LocaleController.formatPluralString("Minutes", i8Var.D0 / 60, new Object[0]));
        sb2.append(' ');
        sb2.append(LocaleController.formatPluralString("Seconds", i8Var.D0 % 60, new Object[0]));
        return LocaleController.formatString("AccDescrPlayerDuration", R.string.AccDescrPlayerDuration, sb2.toString(), LocaleController.formatPluralString("Minutes", i8Var.E0 / 60, new Object[0]) + ' ' + LocaleController.formatPluralString("Seconds", i8Var.E0 % 60, new Object[0]));
    }

    @Override // org.telegram.ui.Components.ro0
    public final /* synthetic */ int l0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.ro0
    public final void B() {
    }
}
