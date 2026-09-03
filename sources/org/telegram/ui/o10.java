package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class o10 extends org.telegram.ui.Cells.g7 {
    public final /* synthetic */ p10 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o10(p10 p10Var, Context context) {
        super(context, 1, null);
        this.i0 = p10Var;
    }

    @Override // org.telegram.ui.Cells.g7
    public final boolean d(MessageObject messageObject) {
        boolean isVoice = messageObject.isVoice();
        p10 p10Var = this.i0;
        if (isVoice || messageObject.isRoundVideo()) {
            boolean playMessage = MediaController.getInstance().playMessage(messageObject);
            MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? p10Var.v.f : null, false);
            return playMessage;
        }
        if (!messageObject.isMusic()) {
            return false;
        }
        u10 u10Var = p10Var.v;
        String str = u10Var.N;
        long j10 = u10Var.B;
        long j11 = u10Var.E;
        MediaController.PlaylistGlobalSearchParams playlistGlobalSearchParams = new MediaController.PlaylistGlobalSearchParams(str, j10, j11, j11, u10Var.y);
        u10 u10Var2 = p10Var.v;
        playlistGlobalSearchParams.endReached = u10Var2.K;
        playlistGlobalSearchParams.nextSearchRate = u10Var2.v;
        playlistGlobalSearchParams.totalCount = u10Var2.L;
        playlistGlobalSearchParams.folderId = u10Var2.G ? 1 : 0;
        return MediaController.getInstance().setPlaylist(p10Var.v.f, messageObject, 0L, playlistGlobalSearchParams);
    }
}
