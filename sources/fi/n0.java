package fi;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.qy;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n0 implements MessagesStorage.LongCallback, MessagesStorage.BooleanCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n0(a2 a2Var, m2 m2Var, int i10, long j3, boolean z10) {
        this.d = a2Var;
        this.e = m2Var;
        this.a = i10;
        this.b = j3;
        this.c = z10;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        qy qyVar = (qy) this.d;
        TLRPC.Chat chat = (TLRPC.Chat) this.e;
        qy.u0(this.a, this.b, chat, qyVar, this.c, z10);
    }

    public /* synthetic */ n0(qy qyVar, int i10, TLRPC.Chat chat, long j3, boolean z10) {
        this.d = qyVar;
        this.a = i10;
        this.e = chat;
        this.b = j3;
        this.c = z10;
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j3) {
        a2 a2Var = (a2) this.d;
        m2 m2Var = (m2) this.e;
        a2Var.dismiss();
        if (j3 == 0) {
            return;
        }
        MessagesController.getInstance(this.a).linkCommunity(-j3, this.b, this.c, new o0(m2Var, j3, 0));
    }
}
