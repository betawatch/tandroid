package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class et0 extends org.telegram.ui.Cells.h7 {
    public final /* synthetic */ tv0 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et0(tv0 tv0Var, Context context) {
        super(context);
        this.l0 = tv0Var;
    }

    @Override // org.telegram.ui.Cells.h7
    public final boolean d(MessageObject messageObject) {
        boolean isVoice = messageObject.isVoice();
        tv0 tv0Var = this.l0;
        if (isVoice || messageObject.isRoundVideo()) {
            boolean playMessage = MediaController.getInstance().playMessage(messageObject);
            MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? tv0Var.t1[4].a : null, false);
            return playMessage;
        }
        if (messageObject.isMusic()) {
            return MediaController.getInstance().setPlaylist(tv0Var.t1[4].a, messageObject, tv0Var.c1);
        }
        return false;
    }
}
