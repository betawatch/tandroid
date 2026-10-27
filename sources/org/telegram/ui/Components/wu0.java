package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class wu0 extends org.telegram.ui.Cells.n7 {
    public final /* synthetic */ int l0;
    public final /* synthetic */ mm0 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wu0(mm0 mm0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        super(context, 0, u6Var);
        this.l0 = i10;
        this.m0 = mm0Var;
    }

    @Override // org.telegram.ui.Cells.n7
    public final boolean d(MessageObject messageObject) {
        switch (this.l0) {
            case 0:
                xu0 xu0Var = (xu0) this.m0;
                if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                    if (messageObject.isMusic()) {
                        return MediaController.getInstance().setPlaylist(xu0Var.d, messageObject, xu0Var.v.e1);
                    }
                    return false;
                }
                boolean playMessage = MediaController.getInstance().playMessage(messageObject);
                MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? xu0Var.d : null, false);
                if (messageObject.isRoundVideo()) {
                    MediaController.getInstance().setCurrentVideoVisible(false);
                }
                return playMessage;
            default:
                ov0 ov0Var = (ov0) this.m0;
                int i10 = ov0Var.d;
                bw0 bw0Var = ov0Var.f;
                if (messageObject.isVoice() || messageObject.isRoundVideo()) {
                    boolean playMessage2 = MediaController.getInstance().playMessage(messageObject);
                    MediaController.getInstance().setVoiceMessagesPlaylist(playMessage2 ? bw0Var.v1[i10].a : null, false);
                    return playMessage2;
                }
                if (messageObject.isMusic()) {
                    return MediaController.getInstance().setPlaylist(bw0Var.v1[i10].a, messageObject, bw0Var.e1);
                }
                return false;
        }
    }
}
