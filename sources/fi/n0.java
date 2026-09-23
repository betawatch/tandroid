package fi;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ry;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class n0 implements MessagesStorage.LongCallback, MessagesStorage.BooleanCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n0(b2 b2Var, n2 n2Var, int i10, long j3, boolean z10) {
        this.d = b2Var;
        this.e = n2Var;
        this.a = i10;
        this.b = j3;
        this.c = z10;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        ry ryVar = (ry) this.d;
        TLRPC.Chat chat = (TLRPC.Chat) this.e;
        ry.u0(this.a, this.b, chat, ryVar, this.c, z10);
    }

    public /* synthetic */ n0(ry ryVar, int i10, TLRPC.Chat chat, long j3, boolean z10) {
        this.d = ryVar;
        this.a = i10;
        this.e = chat;
        this.b = j3;
        this.c = z10;
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j3) {
        b2 b2Var = (b2) this.d;
        n2 n2Var = (n2) this.e;
        b2Var.dismiss();
        if (j3 == 0) {
            return;
        }
        MessagesController.getInstance(this.a).linkCommunity(-j3, this.b, this.c, new o0(n2Var, j3, 0));
    }
}
