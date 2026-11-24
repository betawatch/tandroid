// default package

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class it1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wt1 b;
    public final /* synthetic */ TLRPC.Chat c;

    public /* synthetic */ it1(wt1 wt1Var, TLRPC.Chat chat, byte b) {
        this.a = b;
        this.b = wt1Var;
        this.c = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.Chat chat = this.c;
        wt1 wt1Var = this.b;
        switch (b) {
            case 0:
                wt1Var.j(chat);
                break;
            case 1:
                wt1Var.a(chat);
                break;
            case 2:
                wt1Var.a.oa(chat);
                break;
            default:
                u21.b0(wt1Var.a).Q(R.raw.contact_check, 36, k96.a0(null, null, 2131742573, chat.title)).k(true);
                break;
        }
    }
}
