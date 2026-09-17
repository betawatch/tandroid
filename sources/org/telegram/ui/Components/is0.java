package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class is0 extends org.telegram.ui.Cells.i7 {
    public final /* synthetic */ xu0 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is0(xu0 xu0Var, Context context) {
        super(context);
        this.l0 = xu0Var;
    }

    @Override // org.telegram.ui.Cells.i7
    public final boolean d(MessageObject messageObject) {
        boolean isVoice = messageObject.isVoice();
        xu0 xu0Var = this.l0;
        if (isVoice || messageObject.isRoundVideo()) {
            boolean playMessage = MediaController.getInstance().playMessage(messageObject);
            MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? xu0Var.t1[4].a : null, false);
            return playMessage;
        }
        if (messageObject.isMusic()) {
            return MediaController.getInstance().setPlaylist(xu0Var.t1[4].a, messageObject, xu0Var.c1);
        }
        return false;
    }
}
