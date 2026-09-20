package org.telegram.ui;

import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class iw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uy b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ iw(uy uyVar, long j3, boolean z10, int i10) {
        this.a = i10;
        this.b = uyVar;
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
        uy uyVar = this.b;
        switch (i10) {
            case 0:
                uy uyVar2 = this.b;
                ai.l9 storiesController = uyVar2.getMessagesController().getStoriesController();
                long j10 = this.c;
                boolean z11 = this.d;
                storiesController.i0(j10, z11, false);
                m5.e eVar = new m5.e((char) 0, 7);
                eVar.b = new iw(uyVar2, j10, z11, 1);
                eVar.c = new iw(uyVar2, j10, z11, 2);
                if (j10 >= 0) {
                    TLRPC.User user = uyVar2.getMessagesController().getUser(Long.valueOf(j10));
                    str = ContactsController.formatName(user.first_name, null, 15);
                    chat = user;
                } else {
                    TLRPC.Chat chat2 = uyVar2.getMessagesController().getChat(Long.valueOf(-j10));
                    str = chat2.title;
                    chat = chat2;
                }
                uyVar2.S = org.telegram.ui.Components.xc.X().V(Collections.singletonList(chat), uyVar2.e4() ? AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToDialogs", R.string.StoriesMovedToDialogs, str)) : AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToContacts", R.string.StoriesMovedToContacts, ContactsController.formatName(str, null, 15))), null, eVar).j();
                break;
            case 1:
                uyVar.getMessagesController().getStoriesController().i0(j3, !z10, false);
                break;
            default:
                uyVar.getMessagesController().getStoriesController().i0(j3, z10, true);
                break;
        }
    }
}
