package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class js0 extends org.telegram.ui.Cells.h7 {
    public final /* synthetic */ zu0 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public js0(zu0 zu0Var, Context context) {
        super(context);
        this.i0 = zu0Var;
    }

    @Override // org.telegram.ui.Cells.h7
    public final boolean d(MessageObject messageObject) {
        boolean isVoice = messageObject.isVoice();
        zu0 zu0Var = this.i0;
        if (isVoice || messageObject.isRoundVideo()) {
            boolean playMessage = MediaController.getInstance().playMessage(messageObject);
            MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? zu0Var.q1[4].a : null, false);
            return playMessage;
        }
        if (messageObject.isMusic()) {
            return MediaController.getInstance().setPlaylist(zu0Var.q1[4].a, messageObject, zu0Var.Z0);
        }
        return false;
    }
}
