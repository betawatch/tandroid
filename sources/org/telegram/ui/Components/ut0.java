package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ut0 extends org.telegram.ui.Cells.i7 {
    public final /* synthetic */ int l0;
    public final /* synthetic */ ll0 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ut0(ll0 ll0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, 0, f6Var);
        this.l0 = i10;
        this.m0 = ll0Var;
    }

    @Override // org.telegram.ui.Cells.i7
    public final boolean d(MessageObject messageObject) {
        switch (this.l0) {
            case 0:
                vt0 vt0Var = (vt0) this.m0;
                if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                    if (messageObject.isMusic()) {
                        return MediaController.getInstance().setPlaylist(vt0Var.d, messageObject, vt0Var.v.c1);
                    }
                    return false;
                }
                boolean playMessage = MediaController.getInstance().playMessage(messageObject);
                MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? vt0Var.d : null, false);
                if (messageObject.isRoundVideo()) {
                    MediaController.getInstance().setCurrentVideoVisible(false);
                }
                return playMessage;
            default:
                mu0 mu0Var = (mu0) this.m0;
                int i10 = mu0Var.d;
                zu0 zu0Var = mu0Var.f;
                if (messageObject.isVoice() || messageObject.isRoundVideo()) {
                    boolean playMessage2 = MediaController.getInstance().playMessage(messageObject);
                    MediaController.getInstance().setVoiceMessagesPlaylist(playMessage2 ? zu0Var.t1[i10].a : null, false);
                    return playMessage2;
                }
                if (messageObject.isMusic()) {
                    return MediaController.getInstance().setPlaylist(zu0Var.t1[i10].a, messageObject, zu0Var.c1);
                }
                return false;
        }
    }
}
