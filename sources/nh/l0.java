package nh;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.dy;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l0 implements MessagesStorage.LongCallback, MessagesStorage.BooleanCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l0(c2 c2Var, o2 o2Var, int i9, long j10, boolean z10) {
        this.d = c2Var;
        this.e = o2Var;
        this.a = i9;
        this.b = j10;
        this.c = z10;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        dy dyVar = (dy) this.d;
        TLRPC.Chat chat = (TLRPC.Chat) this.e;
        dy.s0(this.a, this.b, chat, dyVar, this.c, z10);
    }

    public /* synthetic */ l0(dy dyVar, int i9, TLRPC.Chat chat, long j10, boolean z10) {
        this.d = dyVar;
        this.a = i9;
        this.e = chat;
        this.b = j10;
        this.c = z10;
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        c2 c2Var = (c2) this.d;
        o2 o2Var = (o2) this.e;
        c2Var.dismiss();
        if (j10 == 0) {
            return;
        }
        MessagesController.getInstance(this.a).linkCommunity(-j10, this.b, this.c, new fh.m(o2Var, j10, 1));
    }
}
