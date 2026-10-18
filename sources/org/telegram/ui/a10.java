package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class a10 extends org.telegram.ui.Cells.h7 {
    public final /* synthetic */ b10 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a10(b10 b10Var, Context context) {
        super(context, 1, null);
        this.l0 = b10Var;
    }

    @Override // org.telegram.ui.Cells.h7
    public final boolean d(MessageObject messageObject) {
        boolean isVoice = messageObject.isVoice();
        b10 b10Var = this.l0;
        if (isVoice || messageObject.isRoundVideo()) {
            boolean playMessage = MediaController.getInstance().playMessage(messageObject);
            MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? b10Var.v.f : null, false);
            return playMessage;
        }
        if (!messageObject.isMusic()) {
            return false;
        }
        g10 g10Var = b10Var.v;
        String str = g10Var.Q;
        long j10 = g10Var.E;
        long j11 = g10Var.H;
        MediaController.PlaylistGlobalSearchParams playlistGlobalSearchParams = new MediaController.PlaylistGlobalSearchParams(str, j10, j11, j11, g10Var.y);
        g10 g10Var2 = b10Var.v;
        playlistGlobalSearchParams.endReached = g10Var2.N;
        playlistGlobalSearchParams.nextSearchRate = g10Var2.v;
        playlistGlobalSearchParams.totalCount = g10Var2.O;
        playlistGlobalSearchParams.folderId = g10Var2.J ? 1 : 0;
        return MediaController.getInstance().setPlaylist(b10Var.v.f, messageObject, 0L, playlistGlobalSearchParams);
    }
}
