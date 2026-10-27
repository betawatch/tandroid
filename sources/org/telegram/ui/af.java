package org.telegram.ui;

import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class af implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ af(wn wnVar, boolean z10, int i10) {
        this.a = i10;
        this.b = wnVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wn wnVar = this.b;
                wnVar.e = wnVar.getMessagesController().getChat(Long.valueOf(wnVar.e.id));
                if (wnVar.J9()) {
                    TLRPC.Chat chat = wnVar.e;
                    if (chat.in_news || !ChatObject.isNotInChat(chat)) {
                        wnVar.lb = false;
                        if (this.c && !wnVar.e.in_news) {
                            wnVar.N6(true, false, true);
                            break;
                        } else {
                            wnVar.Mb(wnVar.e.in_news ? R.string.ChannelAddedToNewsBulletin : R.string.ChannelAddedToChatsBulletin);
                        }
                    }
                }
                wnVar.yc(false);
                break;
            case 1:
                this.b.presentFragment(new PremiumPreviewFragment(0, this.c ? "upload_speed" : "download_speed"));
                break;
            case 2:
                wn wnVar2 = this.b;
                NotificationsController notificationsController = wnVar2.getNotificationsController();
                long j10 = wnVar2.j6;
                boolean z10 = this.c;
                notificationsController.muteDialog(j10, 0L, !z10);
                wnVar2.yc(false);
                wnVar2.Mb(z10 ? R.string.ChannelNotifyBulletin : R.string.ChannelDoNotNotifyBulletin);
                break;
            case 3:
                wn wnVar3 = this.b;
                MessagesController messagesController = wnVar3.getMessagesController();
                long j11 = wnVar3.j6;
                boolean z11 = this.c;
                messagesController.addDialogToFolder(j11, !z11 ? 1 : 0, 0, 0L);
                wnVar3.Mb(z11 ? R.string.ChannelUnarchivedBulletin : R.string.ChannelArchivedBulletin);
                break;
            default:
                this.b.Pc(0, this.c);
                break;
        }
    }
}
