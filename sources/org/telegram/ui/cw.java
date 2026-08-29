package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cw implements MessagesStorage.BooleanCallback, MessagesStorage.LongCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate d;
    public final /* synthetic */ Object e;

    public /* synthetic */ cw(org.telegram.ui.ActionBar.c2 c2Var, org.telegram.ui.ActionBar.o2 o2Var, int i10, long j10, boolean z10) {
        this.d = c2Var;
        this.e = o2Var;
        this.a = i10;
        this.b = j10;
        this.c = z10;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        fy fyVar = (fy) this.d;
        TLRPC.Chat chat = (TLRPC.Chat) this.e;
        fy.t0(this.a, this.b, chat, fyVar, this.c, z10);
    }

    public /* synthetic */ cw(fy fyVar, int i10, TLRPC.Chat chat, long j10, boolean z10) {
        this.d = fyVar;
        this.a = i10;
        this.e = chat;
        this.b = j10;
        this.c = z10;
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.d;
        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.e;
        c2Var.dismiss();
        if (j10 == 0) {
            return;
        }
        MessagesController.getInstance(this.a).linkCommunity(-j10, this.b, this.c, new ih.m(o2Var, j10, 3));
    }
}
