package org.telegram.ui;

import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ty b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ gw(ty tyVar, long j3, boolean z10, int i10) {
        this.a = i10;
        this.b = tyVar;
        this.c = j3;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        TLRPC.Chat chat;
        int i10 = this.a;
        boolean z10 = this.d;
        long j3 = this.c;
        ty tyVar = this.b;
        switch (i10) {
            case 0:
                ty tyVar2 = this.b;
                ai.m9 storiesController = tyVar2.getMessagesController().getStoriesController();
                long j10 = this.c;
                boolean z11 = this.d;
                storiesController.i0(j10, z11, false);
                n6.t tVar = new n6.t(4);
                tVar.b = new gw(tyVar2, j10, z11, 1);
                tVar.c = new gw(tyVar2, j10, z11, 2);
                if (j10 >= 0) {
                    TLRPC.User user = tyVar2.getMessagesController().getUser(Long.valueOf(j10));
                    str = ContactsController.formatName(user.first_name, null, 15);
                    chat = user;
                } else {
                    TLRPC.Chat chat2 = tyVar2.getMessagesController().getChat(Long.valueOf(-j10));
                    str = chat2.title;
                    chat = chat2;
                }
                tyVar2.S = org.telegram.ui.Components.ad.X().V(Collections.singletonList(chat), tyVar2.b4() ? AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToDialogs", R.string.StoriesMovedToDialogs, str)) : AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToContacts", R.string.StoriesMovedToContacts, ContactsController.formatName(str, null, 15))), null, tVar).j();
                break;
            case 1:
                tyVar.getMessagesController().getStoriesController().i0(j3, !z10, false);
                break;
            default:
                tyVar.getMessagesController().getStoriesController().i0(j3, z10, true);
                break;
        }
    }
}
