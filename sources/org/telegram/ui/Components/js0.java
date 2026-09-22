package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class js0 extends org.telegram.ui.Cells.i7 {
    public final /* synthetic */ yu0 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public js0(yu0 yu0Var, Context context) {
        super(context);
        this.l0 = yu0Var;
    }

    @Override // org.telegram.ui.Cells.i7
    public final boolean d(MessageObject messageObject) {
        boolean isVoice = messageObject.isVoice();
        yu0 yu0Var = this.l0;
        if (isVoice || messageObject.isRoundVideo()) {
            boolean playMessage = MediaController.getInstance().playMessage(messageObject);
            MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? yu0Var.t1[4].a : null, false);
            return playMessage;
        }
        if (messageObject.isMusic()) {
            return MediaController.getInstance().setPlaylist(yu0Var.t1[4].a, messageObject, yu0Var.c1);
        }
        return false;
    }
}
