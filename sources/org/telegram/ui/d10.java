package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class d10 extends org.telegram.ui.Cells.n7 {
    public final /* synthetic */ e10 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d10(e10 e10Var, Context context) {
        super(context, 1, null);
        this.l0 = e10Var;
    }

    @Override // org.telegram.ui.Cells.n7
    public final boolean d(MessageObject messageObject) {
        boolean isVoice = messageObject.isVoice();
        e10 e10Var = this.l0;
        if (isVoice || messageObject.isRoundVideo()) {
            boolean playMessage = MediaController.getInstance().playMessage(messageObject);
            MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? e10Var.v.f : null, false);
            return playMessage;
        }
        if (!messageObject.isMusic()) {
            return false;
        }
        j10 j10Var = e10Var.v;
        String str = j10Var.Q;
        long j10 = j10Var.E;
        long j11 = j10Var.H;
        MediaController.PlaylistGlobalSearchParams playlistGlobalSearchParams = new MediaController.PlaylistGlobalSearchParams(str, j10, j11, j11, j10Var.y);
        j10 j10Var2 = e10Var.v;
        playlistGlobalSearchParams.endReached = j10Var2.N;
        playlistGlobalSearchParams.nextSearchRate = j10Var2.v;
        playlistGlobalSearchParams.totalCount = j10Var2.O;
        playlistGlobalSearchParams.folderId = j10Var2.J ? 1 : 0;
        return MediaController.getInstance().setPlaylist(e10Var.v.f, messageObject, 0L, playlistGlobalSearchParams);
    }
}
