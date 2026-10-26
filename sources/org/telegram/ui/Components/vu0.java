package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class vu0 extends org.telegram.ui.Cells.n7 {
    public final /* synthetic */ int l0;
    public final /* synthetic */ lm0 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vu0(lm0 lm0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        super(context, 0, u6Var);
        this.l0 = i10;
        this.m0 = lm0Var;
    }

    @Override // org.telegram.ui.Cells.n7
    public final boolean d(MessageObject messageObject) {
        switch (this.l0) {
            case 0:
                wu0 wu0Var = (wu0) this.m0;
                if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                    if (messageObject.isMusic()) {
                        return MediaController.getInstance().setPlaylist(wu0Var.d, messageObject, wu0Var.v.e1);
                    }
                    return false;
                }
                boolean playMessage = MediaController.getInstance().playMessage(messageObject);
                MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? wu0Var.d : null, false);
                if (messageObject.isRoundVideo()) {
                    MediaController.getInstance().setCurrentVideoVisible(false);
                }
                return playMessage;
            default:
                nv0 nv0Var = (nv0) this.m0;
                int i10 = nv0Var.d;
                aw0 aw0Var = nv0Var.f;
                if (messageObject.isVoice() || messageObject.isRoundVideo()) {
                    boolean playMessage2 = MediaController.getInstance().playMessage(messageObject);
                    MediaController.getInstance().setVoiceMessagesPlaylist(playMessage2 ? aw0Var.v1[i10].a : null, false);
                    return playMessage2;
                }
                if (messageObject.isMusic()) {
                    return MediaController.getInstance().setPlaylist(aw0Var.v1[i10].a, messageObject, aw0Var.e1);
                }
                return false;
        }
    }
}
