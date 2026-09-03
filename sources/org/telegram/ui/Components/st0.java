package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class st0 extends org.telegram.ui.Cells.g7 {
    public final /* synthetic */ int i0;
    public final /* synthetic */ ql0 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ st0(ql0 ql0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, 0, f6Var);
        this.i0 = i10;
        this.j0 = ql0Var;
    }

    @Override // org.telegram.ui.Cells.g7
    public final boolean d(MessageObject messageObject) {
        switch (this.i0) {
            case 0:
                tt0 tt0Var = (tt0) this.j0;
                if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                    if (messageObject.isMusic()) {
                        return MediaController.getInstance().setPlaylist(tt0Var.d, messageObject, tt0Var.v.Z0);
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
                lu0 lu0Var = (lu0) this.j0;
                int i10 = lu0Var.d;
                yu0 yu0Var = lu0Var.f;
                if (messageObject.isVoice() || messageObject.isRoundVideo()) {
                    boolean playMessage2 = MediaController.getInstance().playMessage(messageObject);
                    MediaController.getInstance().setVoiceMessagesPlaylist(playMessage2 ? yu0Var.q1[i10].a : null, false);
                    return playMessage2;
                }
                if (messageObject.isMusic()) {
                    return MediaController.getInstance().setPlaylist(yu0Var.q1[i10].a, messageObject, yu0Var.Z0);
                }
                return false;
        }
    }
}
