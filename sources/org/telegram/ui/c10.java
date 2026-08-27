package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class c10 extends org.telegram.ui.Cells.e7 {
    public final /* synthetic */ d10 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c10(d10 d10Var, Context context) {
        super(context, 1, null);
        this.h0 = d10Var;
    }

    @Override // org.telegram.ui.Cells.e7
    public final boolean d(MessageObject messageObject) {
        boolean isVoice = messageObject.isVoice();
        d10 d10Var = this.h0;
        if (isVoice || messageObject.isRoundVideo()) {
            boolean playMessage = MediaController.getInstance().playMessage(messageObject);
            MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? d10Var.v.f : null, false);
            return playMessage;
        }
        if (!messageObject.isMusic()) {
            return false;
        }
        i10 i10Var = d10Var.v;
        String str = i10Var.M;
        long j10 = i10Var.A;
        long j11 = i10Var.D;
        MediaController.PlaylistGlobalSearchParams playlistGlobalSearchParams = new MediaController.PlaylistGlobalSearchParams(str, j10, j11, j11, i10Var.y);
        i10 i10Var2 = d10Var.v;
        playlistGlobalSearchParams.endReached = i10Var2.J;
        playlistGlobalSearchParams.nextSearchRate = i10Var2.v;
        playlistGlobalSearchParams.totalCount = i10Var2.K;
        playlistGlobalSearchParams.folderId = i10Var2.F ? 1 : 0;
        return MediaController.getInstance().setPlaylist(d10Var.v.f, messageObject, 0L, playlistGlobalSearchParams);
    }
}
