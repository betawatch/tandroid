package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class is0 extends org.telegram.ui.Cells.g7 {
    public final /* synthetic */ yu0 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is0(yu0 yu0Var, Context context) {
        super(context);
        this.i0 = yu0Var;
    }

    @Override // org.telegram.ui.Cells.g7
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
