package bi;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cn;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ja implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn b;
    public final /* synthetic */ long c;
    public final /* synthetic */ TLRPC.Chat d;

    public /* synthetic */ ja(cn cnVar, long j3, TLRPC.Chat chat, int i7) {
        this.a = i7;
        this.b = cnVar;
        this.c = j3;
        this.d = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        TLRPC.Chat chat = this.d;
        long j3 = this.c;
        cn cnVar = this.b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.gc.a0(cnVar).I(R.raw.stars_send, org.telegram.messenger.id.M0(2131744994, null), org.telegram.messenger.g0.X2(org.telegram.messenger.id.G((int) j3, "StarsSubscriptionCompletedText", chat.title))).k(true);
                break;
            default:
                String str = LaunchActivity.B1;
                org.telegram.ui.Components.gc.a0(cnVar).I(R.raw.stars_send, org.telegram.messenger.id.M0(2131744994, null), org.telegram.messenger.g0.X2(org.telegram.messenger.id.G((int) j3, "StarsSubscriptionCompletedText", chat.title))).k(true);
                break;
        }
    }
}
