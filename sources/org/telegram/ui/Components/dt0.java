package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
