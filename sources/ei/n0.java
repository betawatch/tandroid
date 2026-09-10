package ei;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.wy;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class n0 implements MessagesStorage.LongCallback, MessagesStorage.BooleanCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n0(d2 d2Var, p2 p2Var, int i10, long j3, boolean z10) {
        this.d = d2Var;
        this.e = p2Var;
        this.a = i10;
        this.b = j3;
        this.c = z10;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        wy wyVar = (wy) this.d;
        TLRPC.Chat chat = (TLRPC.Chat) this.e;
        wy.u0(this.a, this.b, chat, wyVar, this.c, z10);
    }

    public /* synthetic */ n0(wy wyVar, int i10, TLRPC.Chat chat, long j3, boolean z10) {
        this.d = wyVar;
        this.a = i10;
        this.e = chat;
        this.b = j3;
        this.c = z10;
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j3) {
        d2 d2Var = (d2) this.d;
        p2 p2Var = (p2) this.e;
        d2Var.dismiss();
        if (j3 == 0) {
            return;
        }
        MessagesController.getInstance(this.a).linkCommunity(-j3, this.b, this.c, new o0(p2Var, j3, 0));
    }
}
