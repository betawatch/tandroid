package di;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.c51;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u2 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ TLRPC.Chat b;

    public /* synthetic */ u2(f6 f6Var, TLRPC.Chat chat) {
        this.b = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f6.p2(c51.g0(this.b, true));
                break;
            default:
                TLRPC.Chat chat = this.b;
                if (chat != null) {
                    org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2();
                    e2Var.a = true;
                    LaunchActivity.Q().showAsSheet(new org.telegram.ui.t5(-chat.id), e2Var);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ u2(TLRPC.Chat chat) {
        this.b = chat;
    }
}
