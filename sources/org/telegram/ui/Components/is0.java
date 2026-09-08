package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
