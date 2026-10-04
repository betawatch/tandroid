package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class at0 extends org.telegram.ui.Cells.j7 {
    public final /* synthetic */ pv0 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at0(pv0 pv0Var, Context context) {
        super(context);
        this.l0 = pv0Var;
    }

    @Override // org.telegram.ui.Cells.j7
    public final boolean d(MessageObject messageObject) {
        boolean isVoice = messageObject.isVoice();
        pv0 pv0Var = this.l0;
        if (isVoice || messageObject.isRoundVideo()) {
            boolean playMessage = MediaController.getInstance().playMessage(messageObject);
            MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? pv0Var.t1[4].a : null, false);
            return playMessage;
        }
        if (messageObject.isMusic()) {
            return MediaController.getInstance().setPlaylist(pv0Var.t1[4].a, messageObject, pv0Var.c1);
        }
        return false;
    }
}
