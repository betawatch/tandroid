package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class qj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;
    public final /* synthetic */ TLRPC.Chat c;

    public /* synthetic */ qj(np npVar, TLRPC.Chat chat, int i7) {
        this.a = i7;
        this.b = npVar;
        this.c = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        TLRPC.Chat chat = this.c;
        np npVar = this.b;
        switch (i7) {
            case 0:
                npVar.j(chat);
                break;
            case 1:
                npVar.getNotificationCenter().k(90, chat);
                break;
            case 2:
                npVar.getClass();
                npVar.G(chat.id, true);
                break;
            case 3:
                npVar.getNotificationCenter().k(90, chat);
                break;
            case 4:
                npVar.getNotificationCenter().k(ns.r5, Long.valueOf(chat.id), Boolean.valueOf(chat.forum), Boolean.valueOf(chat.forum_tabs), Boolean.valueOf(chat.forum_sidebar));
                break;
            default:
                npVar.U4(null);
                npVar.getNotificationCenter().k(ns.T5, Long.valueOf(chat.id), Boolean.valueOf(chat.collapsed_in_dialogs));
                npVar.getNotificationCenter().k(3, new Object[0]);
                break;
        }
    }
}
