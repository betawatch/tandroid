package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class uj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vp b;
    public final /* synthetic */ TLRPC.Chat c;

    public /* synthetic */ uj(vp vpVar, TLRPC.Chat chat, int i10) {
        this.a = i10;
        this.b = vpVar;
        this.c = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        TLRPC.Chat chat = this.c;
        vp vpVar = this.b;
        switch (i10) {
            case 0:
                vpVar.j(chat);
                break;
            case 1:
                vpVar.getNotificationCenter().k(90, chat);
                break;
            case 2:
                vpVar.getClass();
                vpVar.G(chat.id, true);
                break;
            case 3:
                vpVar.getNotificationCenter().k(90, chat);
                break;
            case 4:
                vpVar.getNotificationCenter().k(zs.r5, Long.valueOf(chat.id), Boolean.valueOf(chat.forum), Boolean.valueOf(chat.forum_tabs), Boolean.valueOf(chat.forum_sidebar));
                break;
            default:
                vpVar.Q4(null);
                vpVar.getNotificationCenter().k(zs.T5, Long.valueOf(chat.id), Boolean.valueOf(chat.collapsed_in_dialogs));
                vpVar.getNotificationCenter().k(3, new Object[0]);
                break;
        }
    }
}
