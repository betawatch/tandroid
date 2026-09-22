package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class tt0 extends org.telegram.ui.Cells.i7 {
    public final /* synthetic */ int l0;
    public final /* synthetic */ kl0 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tt0(kl0 kl0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, 0, e6Var);
        this.l0 = i10;
        this.m0 = kl0Var;
    }

    @Override // org.telegram.ui.Cells.i7
    public final boolean d(MessageObject messageObject) {
        switch (this.l0) {
            case 0:
                ut0 ut0Var = (ut0) this.m0;
                if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                    if (messageObject.isMusic()) {
                        return MediaController.getInstance().setPlaylist(ut0Var.d, messageObject, ut0Var.v.c1);
                    }
                    return false;
                }
                boolean playMessage = MediaController.getInstance().playMessage(messageObject);
                MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? ut0Var.d : null, false);
                if (messageObject.isRoundVideo()) {
                    MediaController.getInstance().setCurrentVideoVisible(false);
                }
                return playMessage;
            default:
                lu0 lu0Var = (lu0) this.m0;
                int i10 = lu0Var.d;
                yu0 yu0Var = lu0Var.f;
                if (messageObject.isVoice() || messageObject.isRoundVideo()) {
                    boolean playMessage2 = MediaController.getInstance().playMessage(messageObject);
                    MediaController.getInstance().setVoiceMessagesPlaylist(playMessage2 ? yu0Var.t1[i10].a : null, false);
                    return playMessage2;
                }
                if (messageObject.isMusic()) {
                    return MediaController.getInstance().setPlaylist(yu0Var.t1[i10].a, messageObject, yu0Var.c1);
                }
                return false;
        }
    }
}
