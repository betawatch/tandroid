package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ss0 extends org.telegram.ui.Cells.k7 {
    public final /* synthetic */ iv0 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss0(iv0 iv0Var, Context context) {
        super(context);
        this.l0 = iv0Var;
    }

    @Override // org.telegram.ui.Cells.k7
    public final boolean d(MessageObject messageObject) {
        boolean isVoice = messageObject.isVoice();
        iv0 iv0Var = this.l0;
        if (isVoice || messageObject.isRoundVideo()) {
            boolean playMessage = MediaController.getInstance().playMessage(messageObject);
            MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? iv0Var.t1[4].a : null, false);
            return playMessage;
        }
        if (messageObject.isMusic()) {
            return MediaController.getInstance().setPlaylist(iv0Var.t1[4].a, messageObject, iv0Var.c1);
        }
        return false;
    }
}
