package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ks0 extends org.telegram.ui.Cells.i7 {
    public final /* synthetic */ zu0 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks0(zu0 zu0Var, Context context) {
        super(context);
        this.l0 = zu0Var;
    }

    @Override // org.telegram.ui.Cells.i7
    public final boolean d(MessageObject messageObject) {
        boolean isVoice = messageObject.isVoice();
        zu0 zu0Var = this.l0;
        if (isVoice || messageObject.isRoundVideo()) {
            boolean playMessage = MediaController.getInstance().playMessage(messageObject);
            MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? zu0Var.t1[4].a : null, false);
            return playMessage;
        }
        if (messageObject.isMusic()) {
            return MediaController.getInstance().setPlaylist(zu0Var.t1[4].a, messageObject, zu0Var.c1);
        }
        return false;
    }
}
