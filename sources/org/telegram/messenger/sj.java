package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class sj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qp b;
    public final /* synthetic */ TLRPC.Chat c;

    public /* synthetic */ sj(qp qpVar, TLRPC.Chat chat, int i7) {
        this.a = i7;
        this.b = qpVar;
        this.c = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        TLRPC.Chat chat = this.c;
        qp qpVar = this.b;
        switch (i7) {
            case 0:
                qpVar.j(chat);
                break;
            case 1:
                qpVar.getNotificationCenter().k(90, chat);
                break;
            case 2:
                qpVar.getClass();
                qpVar.G(chat.id, true);
                break;
            case 3:
                qpVar.getNotificationCenter().k(90, chat);
                break;
            case 4:
                qpVar.getNotificationCenter().k(qs.r5, Long.valueOf(chat.id), Boolean.valueOf(chat.forum), Boolean.valueOf(chat.forum_tabs), Boolean.valueOf(chat.forum_sidebar));
                break;
            default:
                qpVar.T4(null);
                qpVar.getNotificationCenter().k(qs.T5, Long.valueOf(chat.id), Boolean.valueOf(chat.collapsed_in_dialogs));
                qpVar.getNotificationCenter().k(3, new Object[0]);
                break;
        }
    }
}
