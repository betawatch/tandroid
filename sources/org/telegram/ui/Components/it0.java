package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class it0 extends org.telegram.ui.Cells.j7 {
    public final /* synthetic */ xv0 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public it0(xv0 xv0Var, Context context) {
        super(context);
        this.l0 = xv0Var;
    }

    @Override // org.telegram.ui.Cells.j7
    public final boolean d(MessageObject messageObject) {
        boolean isVoice = messageObject.isVoice();
        xv0 xv0Var = this.l0;
        if (isVoice || messageObject.isRoundVideo()) {
            boolean playMessage = MediaController.getInstance().playMessage(messageObject);
            MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? xv0Var.t1[4].a : null, false);
            return playMessage;
        }
        if (messageObject.isMusic()) {
            return MediaController.getInstance().setPlaylist(xv0Var.t1[4].a, messageObject, xv0Var.c1);
        }
        return false;
    }
}
