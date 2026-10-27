package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class rt0 extends org.telegram.ui.Cells.n7 {
    public final /* synthetic */ bw0 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rt0(bw0 bw0Var, Context context) {
        super(context);
        this.l0 = bw0Var;
    }

    @Override // org.telegram.ui.Cells.n7
    public final boolean d(MessageObject messageObject) {
        boolean isVoice = messageObject.isVoice();
        bw0 bw0Var = this.l0;
        if (isVoice || messageObject.isRoundVideo()) {
            boolean playMessage = MediaController.getInstance().playMessage(messageObject);
            MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? bw0Var.v1[4].a : null, false);
            return playMessage;
        }
        if (messageObject.isMusic()) {
            return MediaController.getInstance().setPlaylist(bw0Var.v1[4].a, messageObject, bw0Var.e1);
        }
        return false;
    }
}
