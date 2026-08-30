package org.telegram.ui;

import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oy b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ cw(oy oyVar, long j10, boolean z4, int i10) {
        this.a = i10;
        this.b = oyVar;
        this.c = j10;
        this.d = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        TLRPC.Chat chat;
        int i10 = this.a;
        boolean z4 = this.d;
        long j10 = this.c;
        oy oyVar = this.b;
        switch (i10) {
            case 0:
                oy oyVar2 = this.b;
                nh.t6 storiesController = oyVar2.getMessagesController().getStoriesController();
                long j11 = this.c;
                boolean z10 = this.d;
                storiesController.i0(j11, z10, false);
                n7.qa qaVar = new n7.qa(11);
                qaVar.b = new cw(oyVar2, j11, z10, 1);
                qaVar.c = new cw(oyVar2, j11, z10, 2);
                if (j11 >= 0) {
                    TLRPC.User user = oyVar2.getMessagesController().getUser(Long.valueOf(j11));
                    str = ContactsController.formatName(user.first_name, null, 15);
                    chat = user;
                } else {
                    TLRPC.Chat chat2 = oyVar2.getMessagesController().getChat(Long.valueOf(-j11));
                    str = chat2.title;
                    chat = chat2;
                }
                oyVar2.P = org.telegram.ui.Components.qc.X().V(Collections.singletonList(chat), oyVar2.e4() ? AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToDialogs", R.string.StoriesMovedToDialogs, str)) : AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToContacts", R.string.StoriesMovedToContacts, ContactsController.formatName(str, null, 15))), null, qaVar).j();
                break;
            case 1:
                oyVar.getMessagesController().getStoriesController().i0(j10, !z4, false);
                break;
            default:
                oyVar.getMessagesController().getStoriesController().i0(j10, z4, true);
                break;
        }
    }
}
