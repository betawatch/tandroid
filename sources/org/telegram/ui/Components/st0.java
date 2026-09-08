package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class st0 extends org.telegram.ui.Cells.i7 {
    public final /* synthetic */ int l0;
    public final /* synthetic */ kl0 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ st0(kl0 kl0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, 0, f6Var);
        this.l0 = i10;
        this.m0 = kl0Var;
    }

    @Override // org.telegram.ui.Cells.i7
    public final boolean d(MessageObject messageObject) {
        switch (this.l0) {
            case 0:
                tt0 tt0Var = (tt0) this.m0;
                if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                    if (messageObject.isMusic()) {
                        return MediaController.getInstance().setPlaylist(tt0Var.d, messageObject, tt0Var.v.c1);
                    }
                    return false;
                }
                boolean playMessage = MediaController.getInstance().playMessage(messageObject);
                MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? tt0Var.d : null, false);
                if (messageObject.isRoundVideo()) {
                    MediaController.getInstance().setCurrentVideoVisible(false);
                }
                return playMessage;
            default:
                ku0 ku0Var = (ku0) this.m0;
                int i10 = ku0Var.d;
                xu0 xu0Var = ku0Var.f;
                if (messageObject.isVoice() || messageObject.isRoundVideo()) {
                    boolean playMessage2 = MediaController.getInstance().playMessage(messageObject);
                    MediaController.getInstance().setVoiceMessagesPlaylist(playMessage2 ? xu0Var.t1[i10].a : null, false);
                    return playMessage2;
                }
                if (messageObject.isMusic()) {
                    return MediaController.getInstance().setPlaylist(xu0Var.t1[i10].a, messageObject, xu0Var.c1);
                }
                return false;
        }
    }
}
