package ii;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ey;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l0 implements MessagesStorage.LongCallback, MessagesStorage.BooleanCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l0(e2 e2Var, r2 r2Var, int i10, long j10, boolean z10) {
        this.d = e2Var;
        this.e = r2Var;
        this.a = i10;
        this.b = j10;
        this.c = z10;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        ey eyVar = (ey) this.d;
        TLRPC.Chat chat = (TLRPC.Chat) this.e;
        ey.t0(this.a, this.b, chat, eyVar, this.c, z10);
    }

    public /* synthetic */ l0(ey eyVar, int i10, TLRPC.Chat chat, long j10, boolean z10) {
        this.d = eyVar;
        this.a = i10;
        this.e = chat;
        this.b = j10;
        this.c = z10;
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        e2 e2Var = (e2) this.d;
        r2 r2Var = (r2) this.e;
        e2Var.dismiss();
        if (j10 == 0) {
            return;
        }
        MessagesController.getInstance(this.a).linkCommunity(-j10, this.b, this.c, new m0(r2Var, j10, 0));
    }
}
