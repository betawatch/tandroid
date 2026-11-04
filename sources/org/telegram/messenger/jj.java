package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class jj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hp b;
    public final /* synthetic */ TLRPC.Chat c;

    public /* synthetic */ jj(hp hpVar, TLRPC.Chat chat, int i3) {
        this.a = i3;
        this.b = hpVar;
        this.c = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        TLRPC.Chat chat = this.c;
        hp hpVar = this.b;
        switch (i3) {
            case 0:
                hpVar.j(chat);
                break;
            case 1:
                hpVar.getNotificationCenter().k(90, chat);
                break;
            case 2:
                hpVar.getClass();
                hpVar.G(chat.id, true);
                break;
            case 3:
                hpVar.getNotificationCenter().k(90, chat);
                break;
            case 4:
                hpVar.getNotificationCenter().k(hs.r5, Long.valueOf(chat.id), Boolean.valueOf(chat.forum), Boolean.valueOf(chat.forum_tabs), Boolean.valueOf(chat.forum_sidebar));
                break;
            default:
                hpVar.T4(null);
                hpVar.getNotificationCenter().k(hs.T5, Long.valueOf(chat.id), Boolean.valueOf(chat.collapsed_in_dialogs));
                hpVar.getNotificationCenter().k(3, new Object[0]);
                break;
        }
    }
}
