package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class qt0 extends org.telegram.ui.Cells.n7 {
    public final /* synthetic */ aw0 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt0(aw0 aw0Var, Context context) {
        super(context);
        this.l0 = aw0Var;
    }

    @Override // org.telegram.ui.Cells.n7
    public final boolean d(MessageObject messageObject) {
        boolean isVoice = messageObject.isVoice();
        aw0 aw0Var = this.l0;
        if (isVoice || messageObject.isRoundVideo()) {
            boolean playMessage = MediaController.getInstance().playMessage(messageObject);
            MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? aw0Var.v1[4].a : null, false);
            return playMessage;
        }
        if (messageObject.isMusic()) {
            return MediaController.getInstance().setPlaylist(aw0Var.v1[4].a, messageObject, aw0Var.e1);
        }
        return false;
    }
}
