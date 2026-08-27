package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class bt0 extends org.telegram.ui.Cells.e7 {
    public final /* synthetic */ int h0;
    public final /* synthetic */ yk0 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bt0(yk0 yk0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, 0, c6Var);
        this.h0 = i10;
        this.i0 = yk0Var;
    }

    @Override // org.telegram.ui.Cells.e7
    public final boolean d(MessageObject messageObject) {
        switch (this.h0) {
            case 0:
                ct0 ct0Var = (ct0) this.i0;
                if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                    if (messageObject.isMusic()) {
                        return MediaController.getInstance().setPlaylist(ct0Var.d, messageObject, ct0Var.v.Y0);
                    }
                    return false;
                }
                boolean playMessage = MediaController.getInstance().playMessage(messageObject);
                MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? ct0Var.d : null, false);
                if (messageObject.isRoundVideo()) {
                    MediaController.getInstance().setCurrentVideoVisible(false);
                }
                return playMessage;
            default:
                ut0 ut0Var = (ut0) this.i0;
                int i10 = ut0Var.d;
                hu0 hu0Var = ut0Var.f;
                if (messageObject.isVoice() || messageObject.isRoundVideo()) {
                    boolean playMessage2 = MediaController.getInstance().playMessage(messageObject);
                    MediaController.getInstance().setVoiceMessagesPlaylist(playMessage2 ? hu0Var.p1[i10].a : null, false);
                    return playMessage2;
                }
                if (messageObject.isMusic()) {
                    return MediaController.getInstance().setPlaylist(hu0Var.p1[i10].a, messageObject, hu0Var.Y0);
                }
                return false;
        }
    }
}
