package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class n10 extends org.telegram.ui.Cells.j7 {
    public final /* synthetic */ o10 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n10(o10 o10Var, Context context) {
        super(context, 1, null);
        this.l0 = o10Var;
    }

    @Override // org.telegram.ui.Cells.j7
    public final boolean d(MessageObject messageObject) {
        boolean isVoice = messageObject.isVoice();
        o10 o10Var = this.l0;
        if (isVoice || messageObject.isRoundVideo()) {
            boolean playMessage = MediaController.getInstance().playMessage(messageObject);
            MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? o10Var.v.f : null, false);
            return playMessage;
        }
        if (!messageObject.isMusic()) {
            return false;
        }
        t10 t10Var = o10Var.v;
        String str = t10Var.Q;
        long j3 = t10Var.E;
        long j10 = t10Var.H;
        MediaController.PlaylistGlobalSearchParams playlistGlobalSearchParams = new MediaController.PlaylistGlobalSearchParams(str, j3, j10, j10, t10Var.y);
        t10 t10Var2 = o10Var.v;
        playlistGlobalSearchParams.endReached = t10Var2.N;
        playlistGlobalSearchParams.nextSearchRate = t10Var2.v;
        playlistGlobalSearchParams.totalCount = t10Var2.O;
        playlistGlobalSearchParams.folderId = t10Var2.J ? 1 : 0;
        return MediaController.getInstance().setPlaylist(o10Var.v.f, messageObject, 0L, playlistGlobalSearchParams);
    }
}
