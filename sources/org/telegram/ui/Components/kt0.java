package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class kt0 extends org.telegram.ui.Cells.f7 {
    public final /* synthetic */ int h0;
    public final /* synthetic */ il0 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kt0(il0 il0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, 0, c6Var);
        this.h0 = i10;
        this.i0 = il0Var;
    }

    @Override // org.telegram.ui.Cells.f7
    public final boolean d(MessageObject messageObject) {
        switch (this.h0) {
            case 0:
                lt0 lt0Var = (lt0) this.i0;
                if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                    if (messageObject.isMusic()) {
                        return MediaController.getInstance().setPlaylist(lt0Var.d, messageObject, lt0Var.v.Y0);
                    }
                    return false;
                }
                boolean playMessage = MediaController.getInstance().playMessage(messageObject);
                MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? lt0Var.d : null, false);
                if (messageObject.isRoundVideo()) {
                    MediaController.getInstance().setCurrentVideoVisible(false);
                }
                return playMessage;
            default:
                du0 du0Var = (du0) this.i0;
                int i10 = du0Var.d;
                qu0 qu0Var = du0Var.f;
                if (messageObject.isVoice() || messageObject.isRoundVideo()) {
                    boolean playMessage2 = MediaController.getInstance().playMessage(messageObject);
                    MediaController.getInstance().setVoiceMessagesPlaylist(playMessage2 ? qu0Var.p1[i10].a : null, false);
                    return playMessage2;
                }
                if (messageObject.isMusic()) {
                    return MediaController.getInstance().setPlaylist(qu0Var.p1[i10].a, messageObject, qu0Var.Y0);
                }
                return false;
        }
    }
}
