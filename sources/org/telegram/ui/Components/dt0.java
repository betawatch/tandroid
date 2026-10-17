package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class dt0 extends org.telegram.ui.Cells.h7 {
    public final /* synthetic */ sv0 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt0(sv0 sv0Var, Context context) {
        super(context);
        this.l0 = sv0Var;
    }

    @Override // org.telegram.ui.Cells.h7
    public final boolean d(MessageObject messageObject) {
        boolean isVoice = messageObject.isVoice();
        sv0 sv0Var = this.l0;
        if (isVoice || messageObject.isRoundVideo()) {
            boolean playMessage = MediaController.getInstance().playMessage(messageObject);
            MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? sv0Var.t1[4].a : null, false);
            return playMessage;
        }
        if (messageObject.isMusic()) {
            return MediaController.getInstance().setPlaylist(sv0Var.t1[4].a, messageObject, sv0Var.c1);
        }
        return false;
    }
}
