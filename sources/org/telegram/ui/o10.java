package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class o10 extends org.telegram.ui.Cells.i7 {
    public final /* synthetic */ p10 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o10(p10 p10Var, Context context) {
        super(context, 1, null);
        this.l0 = p10Var;
    }

    @Override // org.telegram.ui.Cells.i7
    public final boolean d(MessageObject messageObject) {
        boolean isVoice = messageObject.isVoice();
        p10 p10Var = this.l0;
        if (isVoice || messageObject.isRoundVideo()) {
            boolean playMessage = MediaController.getInstance().playMessage(messageObject);
            MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? p10Var.v.f : null, false);
            return playMessage;
        }
        if (!messageObject.isMusic()) {
            return false;
        }
        u10 u10Var = p10Var.v;
        String str = u10Var.Q;
        long j3 = u10Var.E;
        long j10 = u10Var.H;
        MediaController.PlaylistGlobalSearchParams playlistGlobalSearchParams = new MediaController.PlaylistGlobalSearchParams(str, j3, j10, j10, u10Var.y);
        u10 u10Var2 = p10Var.v;
        playlistGlobalSearchParams.endReached = u10Var2.N;
        playlistGlobalSearchParams.nextSearchRate = u10Var2.v;
        playlistGlobalSearchParams.totalCount = u10Var2.O;
        playlistGlobalSearchParams.folderId = u10Var2.J ? 1 : 0;
        return MediaController.getInstance().setPlaylist(p10Var.v.f, messageObject, 0L, playlistGlobalSearchParams);
    }
}
