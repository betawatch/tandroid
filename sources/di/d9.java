package di;

import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;
    public final /* synthetic */ long c;
    public final /* synthetic */ TLRPC.Chat d;

    public /* synthetic */ d9(bn bnVar, long j3, TLRPC.Chat chat, int i7) {
        this.a = i7;
        this.b = bnVar;
        this.c = j3;
        this.d = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        TLRPC.Chat chat = this.d;
        long j3 = this.c;
        bn bnVar = this.b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.lc.b0(bnVar).I(R.raw.stars_send, hd.N0(2131744751, null), org.telegram.messenger.g0.W2(hd.G((int) j3, "StarsSubscriptionCompletedText", chat.title))).k(true);
                break;
            default:
                String str = LaunchActivity.C1;
                org.telegram.ui.Components.lc.b0(bnVar).I(R.raw.stars_send, hd.N0(2131744751, null), org.telegram.messenger.g0.W2(hd.G((int) j3, "StarsSubscriptionCompletedText", chat.title))).k(true);
                break;
        }
    }
}
