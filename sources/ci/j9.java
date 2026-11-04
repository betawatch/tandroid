package ci;

import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wm b;
    public final /* synthetic */ long c;
    public final /* synthetic */ TLRPC.Chat d;

    public /* synthetic */ j9(wm wmVar, long j10, TLRPC.Chat chat, int i3) {
        this.a = i3;
        this.b = wmVar;
        this.c = j10;
        this.d = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        TLRPC.Chat chat = this.d;
        long j10 = this.c;
        wm wmVar = this.b;
        switch (i3) {
            case 0:
                org.telegram.ui.Components.fc.a0(wmVar).I(R.raw.stars_send, bd.M0(2131745004, null), org.telegram.messenger.g0.X2(bd.G((int) j10, "StarsSubscriptionCompletedText", chat.title))).k(true);
                break;
            default:
                String str = LaunchActivity.E1;
                org.telegram.ui.Components.fc.a0(wmVar).I(R.raw.stars_send, bd.M0(2131745004, null), org.telegram.messenger.g0.X2(bd.G((int) j10, "StarsSubscriptionCompletedText", chat.title))).k(true);
                break;
        }
    }
}
