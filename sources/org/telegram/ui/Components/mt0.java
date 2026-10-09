package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class mt0 extends org.telegram.ui.Cells.j7 {
    public final /* synthetic */ bw0 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mt0(bw0 bw0Var, Context context) {
        super(context);
        this.l0 = bw0Var;
    }

    @Override // org.telegram.ui.Cells.j7
    public final boolean d(MessageObject messageObject) {
        boolean isVoice = messageObject.isVoice();
        bw0 bw0Var = this.l0;
        if (isVoice || messageObject.isRoundVideo()) {
            boolean playMessage = MediaController.getInstance().playMessage(messageObject);
            MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? bw0Var.t1[4].a : null, false);
            return playMessage;
        }
        if (messageObject.isMusic()) {
            return MediaController.getInstance().setPlaylist(bw0Var.t1[4].a, messageObject, bw0Var.c1);
        }
        return false;
    }
}
