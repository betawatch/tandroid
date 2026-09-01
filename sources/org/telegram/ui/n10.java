package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class n10 extends org.telegram.ui.Cells.h7 {
    public final /* synthetic */ o10 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n10(o10 o10Var, Context context) {
        super(context, 1, null);
        this.i0 = o10Var;
    }

    @Override // org.telegram.ui.Cells.h7
    public final boolean d(MessageObject messageObject) {
        boolean isVoice = messageObject.isVoice();
        o10 o10Var = this.i0;
        if (isVoice || messageObject.isRoundVideo()) {
            boolean playMessage = MediaController.getInstance().playMessage(messageObject);
            MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? o10Var.v.f : null, false);
            return playMessage;
        }
        if (!messageObject.isMusic()) {
            return false;
        }
        t10 t10Var = o10Var.v;
        String str = t10Var.N;
        long j10 = t10Var.B;
        long j11 = t10Var.E;
        MediaController.PlaylistGlobalSearchParams playlistGlobalSearchParams = new MediaController.PlaylistGlobalSearchParams(str, j10, j11, j11, t10Var.y);
        t10 t10Var2 = o10Var.v;
        playlistGlobalSearchParams.endReached = t10Var2.K;
        playlistGlobalSearchParams.nextSearchRate = t10Var2.v;
        playlistGlobalSearchParams.totalCount = t10Var2.L;
        playlistGlobalSearchParams.folderId = t10Var2.G ? 1 : 0;
        return MediaController.getInstance().setPlaylist(o10Var.v.f, messageObject, 0L, playlistGlobalSearchParams);
    }
}
