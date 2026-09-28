package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class ws0 extends org.telegram.ui.Cells.j7 {
    public final /* synthetic */ lv0 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ws0(lv0 lv0Var, Context context) {
        super(context);
        this.l0 = lv0Var;
    }

    @Override // org.telegram.ui.Cells.j7
    public final boolean d(MessageObject messageObject) {
        boolean isVoice = messageObject.isVoice();
        lv0 lv0Var = this.l0;
        if (isVoice || messageObject.isRoundVideo()) {
            boolean playMessage = MediaController.getInstance().playMessage(messageObject);
            MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? lv0Var.t1[4].a : null, false);
            return playMessage;
        }
        if (messageObject.isMusic()) {
            return MediaController.getInstance().setPlaylist(lv0Var.t1[4].a, messageObject, lv0Var.c1);
        }
        return false;
    }
}
