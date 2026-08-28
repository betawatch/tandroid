package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class zs0 extends org.telegram.ui.Cells.h7 {
    public final /* synthetic */ int h0;
    public final /* synthetic */ vk0 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zs0(vk0 vk0Var, Context context, org.telegram.ui.ActionBar.b6 b6Var, int i9) {
        super(context, 0, b6Var);
        this.h0 = i9;
        this.i0 = vk0Var;
    }

    @Override // org.telegram.ui.Cells.h7
    public final boolean d(MessageObject messageObject) {
        switch (this.h0) {
            case 0:
                at0 at0Var = (at0) this.i0;
                if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                    if (messageObject.isMusic()) {
                        return MediaController.getInstance().setPlaylist(at0Var.d, messageObject, at0Var.v.Y0);
                    }
                    return false;
                }
                boolean playMessage = MediaController.getInstance().playMessage(messageObject);
                MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? at0Var.d : null, false);
                if (messageObject.isRoundVideo()) {
                    MediaController.getInstance().setCurrentVideoVisible(false);
                }
                return playMessage;
            default:
                rt0 rt0Var = (rt0) this.i0;
                int i9 = rt0Var.d;
                eu0 eu0Var = rt0Var.f;
                if (messageObject.isVoice() || messageObject.isRoundVideo()) {
                    boolean playMessage2 = MediaController.getInstance().playMessage(messageObject);
                    MediaController.getInstance().setVoiceMessagesPlaylist(playMessage2 ? eu0Var.p1[i9].a : null, false);
                    return playMessage2;
                }
                if (messageObject.isMusic()) {
                    return MediaController.getInstance().setPlaylist(eu0Var.p1[i9].a, messageObject, eu0Var.Y0);
                }
                return false;
        }
    }
}
