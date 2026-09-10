package org.telegram.ui;

import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class jw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wy b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ jw(wy wyVar, long j3, boolean z10, int i10) {
        this.a = i10;
        this.b = wyVar;
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
        wy wyVar = this.b;
        switch (i10) {
            case 0:
                wy wyVar2 = this.b;
                zh.i5 storiesController = wyVar2.getMessagesController().getStoriesController();
                long j10 = this.c;
                boolean z11 = this.d;
                storiesController.i0(j10, z11, false);
                n7.a1 a1Var = new n7.a1(5, (byte) 0);
                a1Var.b = new jw(wyVar2, j10, z11, 1);
                a1Var.c = new jw(wyVar2, j10, z11, 2);
                if (j10 >= 0) {
                    TLRPC.User user = wyVar2.getMessagesController().getUser(Long.valueOf(j10));
                    str = ContactsController.formatName(user.first_name, null, 15);
                    chat = user;
                } else {
                    TLRPC.Chat chat2 = wyVar2.getMessagesController().getChat(Long.valueOf(-j10));
                    str = chat2.title;
                    chat = chat2;
                }
                wyVar2.S = org.telegram.ui.Components.wc.X().V(Collections.singletonList(chat), wyVar2.e4() ? AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToDialogs", R.string.StoriesMovedToDialogs, str)) : AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToContacts", R.string.StoriesMovedToContacts, ContactsController.formatName(str, null, 15))), null, a1Var).j();
                break;
            case 1:
                wyVar.getMessagesController().getStoriesController().i0(j3, !z10, false);
                break;
            default:
                wyVar.getMessagesController().getStoriesController().i0(j3, z10, true);
                break;
        }
    }
}
