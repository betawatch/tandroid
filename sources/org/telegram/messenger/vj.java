package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class vj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wp b;
    public final /* synthetic */ TLRPC.Chat c;

    public /* synthetic */ vj(wp wpVar, TLRPC.Chat chat, int i10) {
        this.a = i10;
        this.b = wpVar;
        this.c = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        TLRPC.Chat chat = this.c;
        wp wpVar = this.b;
        switch (i10) {
            case 0:
                wpVar.j(chat);
                break;
            case 1:
                wpVar.getNotificationCenter().k(90, chat);
                break;
            case 2:
                wpVar.getClass();
                wpVar.G(chat.id, true);
                break;
            case 3:
                wpVar.getNotificationCenter().k(90, chat);
                break;
            case 4:
                wpVar.getNotificationCenter().k(at.r5, Long.valueOf(chat.id), Boolean.valueOf(chat.forum), Boolean.valueOf(chat.forum_tabs), Boolean.valueOf(chat.forum_sidebar));
                break;
            default:
                wpVar.Q4(null);
                wpVar.getNotificationCenter().k(at.T5, Long.valueOf(chat.id), Boolean.valueOf(chat.collapsed_in_dialogs));
                wpVar.getNotificationCenter().k(3, new Object[0]);
                break;
        }
    }
}
