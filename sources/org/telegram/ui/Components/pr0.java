package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class pr0 extends org.telegram.ui.Cells.h7 {
    public final /* synthetic */ eu0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pr0(eu0 eu0Var, Context context) {
        super(context);
        this.h0 = eu0Var;
    }

    @Override // org.telegram.ui.Cells.h7
    public final boolean d(MessageObject messageObject) {
        boolean isVoice = messageObject.isVoice();
        eu0 eu0Var = this.h0;
        if (isVoice || messageObject.isRoundVideo()) {
            boolean playMessage = MediaController.getInstance().playMessage(messageObject);
            MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? eu0Var.p1[4].a : null, false);
            return playMessage;
        }
        if (messageObject.isMusic()) {
            return MediaController.getInstance().setPlaylist(eu0Var.p1[4].a, messageObject, eu0Var.Y0);
        }
        return false;
    }
}
