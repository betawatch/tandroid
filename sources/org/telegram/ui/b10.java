package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class b10 extends org.telegram.ui.Cells.f7 {
    public final /* synthetic */ c10 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b10(c10 c10Var, Context context) {
        super(context, 1, null);
        this.h0 = c10Var;
    }

    @Override // org.telegram.ui.Cells.f7
    public final boolean d(MessageObject messageObject) {
        boolean isVoice = messageObject.isVoice();
        c10 c10Var = this.h0;
        if (isVoice || messageObject.isRoundVideo()) {
            boolean playMessage = MediaController.getInstance().playMessage(messageObject);
            MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? c10Var.v.f : null, false);
            return playMessage;
        }
        if (!messageObject.isMusic()) {
            return false;
        }
        h10 h10Var = c10Var.v;
        String str = h10Var.M;
        long j10 = h10Var.A;
        long j11 = h10Var.D;
        MediaController.PlaylistGlobalSearchParams playlistGlobalSearchParams = new MediaController.PlaylistGlobalSearchParams(str, j10, j11, j11, h10Var.y);
        h10 h10Var2 = c10Var.v;
        playlistGlobalSearchParams.endReached = h10Var2.J;
        playlistGlobalSearchParams.nextSearchRate = h10Var2.v;
        playlistGlobalSearchParams.totalCount = h10Var2.K;
        playlistGlobalSearchParams.folderId = h10Var2.F ? 1 : 0;
        return MediaController.getInstance().setPlaylist(c10Var.v.f, messageObject, 0L, playlistGlobalSearchParams);
    }
}
