package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class oj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mp b;
    public final /* synthetic */ TLRPC.Chat c;

    public /* synthetic */ oj(mp mpVar, TLRPC.Chat chat, int i7) {
        this.a = i7;
        this.b = mpVar;
        this.c = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        TLRPC.Chat chat = this.c;
        mp mpVar = this.b;
        switch (i7) {
            case 0:
                mpVar.j(chat);
                break;
            case 1:
                mpVar.getNotificationCenter().k(90, chat);
                break;
            case 2:
                mpVar.getClass();
                mpVar.G(chat.id, true);
                break;
            case 3:
                mpVar.getNotificationCenter().k(90, chat);
                break;
            case 4:
                mpVar.getNotificationCenter().k(ks.u5, Long.valueOf(chat.id), Boolean.valueOf(chat.forum), Boolean.valueOf(chat.forum_tabs), Boolean.valueOf(chat.forum_sidebar));
                break;
            default:
                mpVar.f5(null);
                mpVar.getNotificationCenter().k(ks.W5, Long.valueOf(chat.id), Boolean.valueOf(chat.collapsed_in_dialogs));
                mpVar.getNotificationCenter().k(3, new Object[0]);
                break;
        }
    }
}
