package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class as0 extends org.telegram.ui.Cells.f7 {
    public final /* synthetic */ qu0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public as0(qu0 qu0Var, Context context) {
        super(context);
        this.h0 = qu0Var;
    }

    @Override // org.telegram.ui.Cells.f7
    public final boolean d(MessageObject messageObject) {
        boolean isVoice = messageObject.isVoice();
        qu0 qu0Var = this.h0;
        if (isVoice || messageObject.isRoundVideo()) {
            boolean playMessage = MediaController.getInstance().playMessage(messageObject);
            MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? qu0Var.p1[4].a : null, false);
            return playMessage;
        }
        if (messageObject.isMusic()) {
            return MediaController.getInstance().setPlaylist(qu0Var.p1[4].a, messageObject, qu0Var.Y0);
        }
        return false;
    }
}
