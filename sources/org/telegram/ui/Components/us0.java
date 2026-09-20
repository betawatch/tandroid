package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class us0 extends org.telegram.ui.Cells.k7 {
    public final /* synthetic */ jv0 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us0(jv0 jv0Var, Context context) {
        super(context);
        this.l0 = jv0Var;
    }

    @Override // org.telegram.ui.Cells.k7
    public final boolean d(MessageObject messageObject) {
        boolean isVoice = messageObject.isVoice();
        jv0 jv0Var = this.l0;
        if (isVoice || messageObject.isRoundVideo()) {
            boolean playMessage = MediaController.getInstance().playMessage(messageObject);
            MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? jv0Var.t1[4].a : null, false);
            return playMessage;
        }
        if (messageObject.isMusic()) {
            return MediaController.getInstance().setPlaylist(jv0Var.t1[4].a, messageObject, jv0Var.c1);
        }
        return false;
    }
}
