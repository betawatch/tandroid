package di;

import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class z8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;
    public final /* synthetic */ long c;
    public final /* synthetic */ TLRPC.Chat d;

    public /* synthetic */ z8(an anVar, long j3, TLRPC.Chat chat, int i7) {
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
                org.telegram.ui.Components.cc.a0(anVar).I(R.raw.stars_send, hd.M0(2131744994, null), org.telegram.messenger.g0.X2(hd.G((int) j3, "StarsSubscriptionCompletedText", chat.title))).k(true);
                break;
            default:
                String str = LaunchActivity.C1;
                org.telegram.ui.Components.cc.a0(anVar).I(R.raw.stars_send, hd.M0(2131744994, null), org.telegram.messenger.g0.X2(hd.G((int) j3, "StarsSubscriptionCompletedText", chat.title))).k(true);
                break;
        }
    }
}
