package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class gu0 extends org.telegram.ui.Cells.k7 {
    public final /* synthetic */ int l0;
    public final /* synthetic */ xl0 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gu0(xl0 xl0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, 0, f6Var);
        this.l0 = i10;
        this.m0 = xl0Var;
    }

    @Override // org.telegram.ui.Cells.k7
    public final boolean d(MessageObject messageObject) {
        switch (this.l0) {
            case 0:
                hu0 hu0Var = (hu0) this.m0;
                if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                    if (messageObject.isMusic()) {
                        return MediaController.getInstance().setPlaylist(hu0Var.d, messageObject, hu0Var.v.c1);
                    }
                    return false;
                }
                boolean playMessage = MediaController.getInstance().playMessage(messageObject);
                MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? hu0Var.d : null, false);
                if (messageObject.isRoundVideo()) {
                    MediaController.getInstance().setCurrentVideoVisible(false);
                }
                return playMessage;
            default:
                yu0 yu0Var = (yu0) this.m0;
                int i10 = yu0Var.d;
                lv0 lv0Var = yu0Var.f;
                if (messageObject.isVoice() || messageObject.isRoundVideo()) {
                    boolean playMessage2 = MediaController.getInstance().playMessage(messageObject);
                    MediaController.getInstance().setVoiceMessagesPlaylist(playMessage2 ? lv0Var.t1[i10].a : null, false);
                    return playMessage2;
                }
                if (messageObject.isMusic()) {
                    return MediaController.getInstance().setPlaylist(lv0Var.t1[i10].a, messageObject, lv0Var.c1);
                }
                return false;
        }
    }
}
