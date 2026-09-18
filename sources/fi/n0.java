package fi;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.wy;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n0 implements MessagesStorage.LongCallback, MessagesStorage.BooleanCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n0(c2 c2Var, o2 o2Var, int i10, long j3, boolean z10) {
        this.d = c2Var;
        this.e = o2Var;
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
        c2 c2Var = (c2) this.d;
        o2 o2Var = (o2) this.e;
        c2Var.dismiss();
        if (j3 == 0) {
            return;
        }
        MessagesController.getInstance(this.a).linkCommunity(-j3, this.b, this.c, new o0(o2Var, j3, 0));
    }
}
