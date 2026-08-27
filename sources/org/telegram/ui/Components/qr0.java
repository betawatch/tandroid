package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class qr0 extends org.telegram.ui.Cells.e7 {
    public final /* synthetic */ hu0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qr0(hu0 hu0Var, Context context) {
        super(context);
        this.h0 = hu0Var;
    }

    @Override // org.telegram.ui.Cells.e7
    public final boolean d(MessageObject messageObject) {
        boolean isVoice = messageObject.isVoice();
        hu0 hu0Var = this.h0;
        if (isVoice || messageObject.isRoundVideo()) {
            boolean playMessage = MediaController.getInstance().playMessage(messageObject);
            MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? hu0Var.p1[4].a : null, false);
            return playMessage;
        }
        if (messageObject.isMusic()) {
            return MediaController.getInstance().setPlaylist(hu0Var.p1[4].a, messageObject, hu0Var.Y0);
        }
        return false;
    }
}
