package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class vs0 extends org.telegram.ui.Cells.j7 {
    public final /* synthetic */ kv0 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs0(kv0 kv0Var, Context context) {
        super(context);
        this.l0 = kv0Var;
    }

    @Override // org.telegram.ui.Cells.j7
    public final boolean d(MessageObject messageObject) {
        boolean isVoice = messageObject.isVoice();
        kv0 kv0Var = this.l0;
        if (isVoice || messageObject.isRoundVideo()) {
            boolean playMessage = MediaController.getInstance().playMessage(messageObject);
            MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? kv0Var.t1[4].a : null, false);
            return playMessage;
        }
        if (messageObject.isMusic()) {
            return MediaController.getInstance().setPlaylist(kv0Var.t1[4].a, messageObject, kv0Var.c1);
        }
        return false;
    }
}
