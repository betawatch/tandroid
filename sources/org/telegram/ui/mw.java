package org.telegram.ui;

import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class mw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yy b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ mw(yy yyVar, long j10, boolean z10, int i10) {
        this.a = i10;
        this.b = yyVar;
        this.c = j10;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        TLRPC.Chat chat;
        int i10 = this.a;
        boolean z10 = this.d;
        long j10 = this.c;
        yy yyVar = this.b;
        switch (i10) {
            case 0:
                yy yyVar2 = this.b;
                bi.x8 storiesController = yyVar2.getMessagesController().getStoriesController();
                long j11 = this.c;
                boolean z11 = this.d;
                storiesController.i0(j11, z11, false);
                n6.o oVar = new n6.o(5, false);
                oVar.b = new mw(yyVar2, j11, z11, 1);
                oVar.c = new mw(yyVar2, j11, z11, 2);
                if (j11 >= 0) {
                    TLRPC.User user = yyVar2.getMessagesController().getUser(Long.valueOf(j11));
                    str = ContactsController.formatName(user.first_name, null, 15);
                    chat = user;
                } else {
                    TLRPC.Chat chat2 = yyVar2.getMessagesController().getChat(Long.valueOf(-j11));
                    str = chat2.title;
                    chat = chat2;
                }
                yyVar2.S = org.telegram.ui.Components.zc.X().V(Collections.singletonList(chat), yyVar2.b4() ? AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToDialogs", R.string.StoriesMovedToDialogs, str)) : AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToContacts", R.string.StoriesMovedToContacts, ContactsController.formatName(str, null, 15))), null, oVar).j();
                break;
            case 1:
                yyVar.getMessagesController().getStoriesController().i0(j10, !z10, false);
                break;
            default:
                yyVar.getMessagesController().getStoriesController().i0(j10, z10, true);
                break;
        }
    }
}
