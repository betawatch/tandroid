package hi;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ey;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m0 implements MessagesStorage.LongCallback, MessagesStorage.BooleanCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m0(b2 b2Var, n2 n2Var, int i10, long j10, boolean z10) {
        this.d = b2Var;
        this.e = n2Var;
        this.a = i10;
        this.b = j10;
        this.c = z10;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        ey eyVar = (ey) this.d;
        TLRPC.Chat chat = (TLRPC.Chat) this.e;
        ey.s0(this.a, this.b, chat, eyVar, this.c, z10);
    }

    public /* synthetic */ m0(ey eyVar, int i10, TLRPC.Chat chat, long j10, boolean z10) {
        this.d = eyVar;
        this.a = i10;
        this.e = chat;
        this.b = j10;
        this.c = z10;
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        b2 b2Var = (b2) this.d;
        n2 n2Var = (n2) this.e;
        b2Var.dismiss();
        if (j10 == 0) {
            return;
        }
        MessagesController.getInstance(this.a).linkCommunity(-j10, this.b, this.c, new n0(n2Var, j10, 0));
    }
}
