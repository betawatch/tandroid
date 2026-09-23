package org.telegram.ui;

import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ew implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ry b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ ew(ry ryVar, long j3, boolean z10, int i10) {
        this.a = i10;
        this.b = ryVar;
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
        ry ryVar = this.b;
        switch (i10) {
            case 0:
                ry ryVar2 = this.b;
                ai.l9 storiesController = ryVar2.getMessagesController().getStoriesController();
                long j10 = this.c;
                boolean z11 = this.d;
                storiesController.i0(j10, z11, false);
                o0.a aVar = new o0.a(3, (byte) 0);
                aVar.b = new ew(ryVar2, j10, z11, 1);
                aVar.c = new ew(ryVar2, j10, z11, 2);
                if (j10 >= 0) {
                    TLRPC.User user = ryVar2.getMessagesController().getUser(Long.valueOf(j10));
                    str = ContactsController.formatName(user.first_name, null, 15);
                    chat = user;
                } else {
                    TLRPC.Chat chat2 = ryVar2.getMessagesController().getChat(Long.valueOf(-j10));
                    str = chat2.title;
                    chat = chat2;
                }
                ryVar2.S = org.telegram.ui.Components.xc.X().V(Collections.singletonList(chat), ryVar2.e4() ? AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToDialogs", R.string.StoriesMovedToDialogs, str)) : AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToContacts", R.string.StoriesMovedToContacts, ContactsController.formatName(str, null, 15))), null, aVar).j();
                break;
            case 1:
                ryVar.getMessagesController().getStoriesController().i0(j3, !z10, false);
                break;
            default:
                ryVar.getMessagesController().getStoriesController().i0(j3, z10, true);
                break;
        }
    }
}
