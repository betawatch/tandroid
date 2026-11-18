package di;

import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class c9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;
    public final /* synthetic */ long c;
    public final /* synthetic */ TLRPC.Chat d;

    public /* synthetic */ c9(bn bnVar, long j3, TLRPC.Chat chat, int i7) {
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
                org.telegram.ui.Components.lc.b0(bnVar).I(R.raw.stars_send, gd.M0(2131744759, null), org.telegram.messenger.g0.W2(gd.G((int) j3, "StarsSubscriptionCompletedText", chat.title))).k(true);
                break;
            default:
                String str = LaunchActivity.C1;
                org.telegram.ui.Components.lc.b0(bnVar).I(R.raw.stars_send, gd.M0(2131744759, null), org.telegram.messenger.g0.W2(gd.G((int) j3, "StarsSubscriptionCompletedText", chat.title))).k(true);
                break;
        }
    }
}
