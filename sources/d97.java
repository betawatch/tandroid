// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class d97 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uc7 b;
    public final /* synthetic */ TLRPC.Chat c;

    public /* synthetic */ d97(uc7 uc7Var, TLRPC.Chat chat, byte b) {
        this.a = b;
        this.b = uc7Var;
        this.c = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.Chat chat = this.c;
        uc7 uc7Var = this.b;
        switch (b) {
            case 0:
                uc7Var.getNotificationCenter().k(91, chat);
                break;
            case 1:
                uc7Var.E(chat.id, true);
                break;
            case 2:
                uc7Var.getNotificationCenter().k(91, chat);
                break;
            case 3:
                uc7Var.getNotificationCenter().k(jn7.u5, Long.valueOf(chat.id), Boolean.valueOf(chat.forum), Boolean.valueOf(chat.forum_tabs), Boolean.valueOf(chat.forum_sidebar));
                break;
            case 4:
                uc7Var.h5(null);
                uc7Var.getNotificationCenter().k(jn7.W5, Long.valueOf(chat.id), Boolean.valueOf(chat.collapsed_in_dialogs));
                uc7Var.getNotificationCenter().k(3, new Object[0]);
                break;
            default:
                uc7Var.g(chat);
                break;
        }
    }
}
