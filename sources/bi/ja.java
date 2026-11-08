package bi;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ja implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;
    public final /* synthetic */ long c;
    public final /* synthetic */ TLRPC.Chat d;

    public /* synthetic */ ja(an anVar, long j3, TLRPC.Chat chat, int i7) {
        this.a = i7;
        this.b = anVar;
        this.c = j3;
        this.d = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        TLRPC.Chat chat = this.d;
        long j3 = this.c;
        an anVar = this.b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.hc.a0(anVar).I(R.raw.stars_send, org.telegram.messenger.id.M0(2131744997, null), org.telegram.messenger.g0.X2(org.telegram.messenger.id.G((int) j3, "StarsSubscriptionCompletedText", chat.title))).k(true);
                break;
            default:
                String str = LaunchActivity.B1;
                org.telegram.ui.Components.hc.a0(anVar).I(R.raw.stars_send, org.telegram.messenger.id.M0(2131744997, null), org.telegram.messenger.g0.X2(org.telegram.messenger.id.G((int) j3, "StarsSubscriptionCompletedText", chat.title))).k(true);
                break;
        }
    }
}
