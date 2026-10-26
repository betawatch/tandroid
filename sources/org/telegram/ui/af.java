package org.telegram.ui;

import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class af implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ af(un unVar, boolean z10, int i10) {
        this.a = i10;
        this.b = unVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                un unVar = this.b;
                unVar.e = unVar.getMessagesController().getChat(Long.valueOf(unVar.e.id));
                if (unVar.G9()) {
                    TLRPC.Chat chat = unVar.e;
                    if (chat.in_news || !ChatObject.isNotInChat(chat)) {
                        unVar.hb = false;
                        if (this.c && !unVar.e.in_news) {
                            unVar.L6(true, false, true);
                            break;
                        } else {
                            unVar.Ib(unVar.e.in_news ? R.string.ChannelAddedToNewsBulletin : R.string.ChannelAddedToChatsBulletin);
                        }
                    }
                }
                unVar.uc(false);
                break;
            case 1:
                this.b.presentFragment(new PremiumPreviewFragment(0, this.c ? "upload_speed" : "download_speed"));
                break;
            case 2:
                un unVar2 = this.b;
                NotificationsController notificationsController = unVar2.getNotificationsController();
                long j10 = unVar2.f6;
                boolean z10 = this.c;
                notificationsController.muteDialog(j10, 0L, !z10);
                unVar2.uc(false);
                unVar2.Ib(z10 ? R.string.ChannelNotifyBulletin : R.string.ChannelDoNotNotifyBulletin);
                break;
            case 3:
                un unVar3 = this.b;
                MessagesController messagesController = unVar3.getMessagesController();
                long j11 = unVar3.f6;
                boolean z11 = this.c;
                messagesController.addDialogToFolder(j11, !z11 ? 1 : 0, 0, 0L);
                unVar3.Ib(z11 ? R.string.ChannelUnarchivedBulletin : R.string.ChannelArchivedBulletin);
                break;
            default:
                this.b.Lc(0, this.c);
                break;
        }
    }
}
