package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class is0 extends org.telegram.ui.Cells.h7 {
    public final /* synthetic */ yu0 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is0(yu0 yu0Var, Context context) {
        super(context);
        this.i0 = yu0Var;
    }

    @Override // org.telegram.ui.Cells.h7
    public final boolean d(MessageObject messageObject) {
        boolean isVoice = messageObject.isVoice();
        yu0 yu0Var = this.i0;
        if (isVoice || messageObject.isRoundVideo()) {
            boolean playMessage = MediaController.getInstance().playMessage(messageObject);
            MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? yu0Var.q1[4].a : null, false);
            return playMessage;
        }
        if (messageObject.isMusic()) {
            return MediaController.getInstance().setPlaylist(yu0Var.q1[4].a, messageObject, yu0Var.Z0);
        }
        return false;
    }
}
