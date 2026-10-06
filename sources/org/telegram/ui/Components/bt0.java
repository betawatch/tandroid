package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
