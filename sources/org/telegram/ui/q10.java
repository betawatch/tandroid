package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class q10 extends org.telegram.ui.Cells.j7 {
    public final /* synthetic */ r10 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q10(r10 r10Var, Context context) {
        super(context, 1, null);
        this.l0 = r10Var;
    }

    @Override // org.telegram.ui.Cells.j7
    public final boolean d(MessageObject messageObject) {
        boolean isVoice = messageObject.isVoice();
        r10 r10Var = this.l0;
        if (isVoice || messageObject.isRoundVideo()) {
            boolean playMessage = MediaController.getInstance().playMessage(messageObject);
            MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? r10Var.v.f : null, false);
            return playMessage;
        }
        if (!messageObject.isMusic()) {
            return false;
        }
        w10 w10Var = r10Var.v;
        String str = w10Var.Q;
        long j3 = w10Var.E;
        long j10 = w10Var.H;
        MediaController.PlaylistGlobalSearchParams playlistGlobalSearchParams = new MediaController.PlaylistGlobalSearchParams(str, j3, j10, j10, w10Var.y);
        w10 w10Var2 = r10Var.v;
        playlistGlobalSearchParams.endReached = w10Var2.N;
        playlistGlobalSearchParams.nextSearchRate = w10Var2.v;
        playlistGlobalSearchParams.totalCount = w10Var2.O;
        playlistGlobalSearchParams.folderId = w10Var2.J ? 1 : 0;
        return MediaController.getInstance().setPlaylist(r10Var.v.f, messageObject, 0L, playlistGlobalSearchParams);
    }
}
