package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class bt0 extends org.telegram.ui.Cells.j7 {
    public final /* synthetic */ qv0 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bt0(qv0 qv0Var, Context context) {
        super(context);
        this.l0 = qv0Var;
    }

    @Override // org.telegram.ui.Cells.j7
    public final boolean d(MessageObject messageObject) {
        boolean isVoice = messageObject.isVoice();
        qv0 qv0Var = this.l0;
        if (isVoice || messageObject.isRoundVideo()) {
            boolean playMessage = MediaController.getInstance().playMessage(messageObject);
            MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? qv0Var.t1[4].a : null, false);
            return playMessage;
        }
        if (messageObject.isMusic()) {
            return MediaController.getInstance().setPlaylist(qv0Var.t1[4].a, messageObject, qv0Var.c1);
        }
        return false;
    }
}
