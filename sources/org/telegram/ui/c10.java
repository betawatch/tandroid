package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class c10 extends org.telegram.ui.Cells.j7 {
    public final /* synthetic */ d10 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c10(d10 d10Var, Context context) {
        super(context, 1, null);
        this.l0 = d10Var;
    }

    @Override // org.telegram.ui.Cells.j7
    public final boolean d(MessageObject messageObject) {
        boolean isVoice = messageObject.isVoice();
        d10 d10Var = this.l0;
        if (isVoice || messageObject.isRoundVideo()) {
            boolean playMessage = MediaController.getInstance().playMessage(messageObject);
            MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? d10Var.v.f : null, false);
            return playMessage;
        }
        if (!messageObject.isMusic()) {
            return false;
        }
        i10 i10Var = d10Var.v;
        String str = i10Var.Q;
        long j10 = i10Var.E;
        long j11 = i10Var.H;
        MediaController.PlaylistGlobalSearchParams playlistGlobalSearchParams = new MediaController.PlaylistGlobalSearchParams(str, j10, j11, j11, i10Var.y);
        i10 i10Var2 = d10Var.v;
        playlistGlobalSearchParams.endReached = i10Var2.N;
        playlistGlobalSearchParams.nextSearchRate = i10Var2.v;
        playlistGlobalSearchParams.totalCount = i10Var2.O;
        playlistGlobalSearchParams.folderId = i10Var2.J ? 1 : 0;
        return MediaController.getInstance().setPlaylist(d10Var.v.f, messageObject, 0L, playlistGlobalSearchParams);
    }
}
