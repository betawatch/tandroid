package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nw implements MessagesStorage.BooleanCallback, MessagesStorage.LongCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate d;
    public final /* synthetic */ Object e;

    public /* synthetic */ nw(org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.ActionBar.p2 p2Var, int i10, long j10, boolean z4) {
        this.d = d2Var;
        this.e = p2Var;
        this.a = i10;
        this.b = j10;
        this.c = z4;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z4) {
        qy qyVar = (qy) this.d;
        TLRPC.Chat chat = (TLRPC.Chat) this.e;
        qy.t0(this.a, this.b, chat, qyVar, this.c, z4);
    }

    public /* synthetic */ nw(qy qyVar, int i10, TLRPC.Chat chat, long j10, boolean z4) {
        this.d = qyVar;
        this.a = i10;
        this.e = chat;
        this.b = j10;
        this.c = z4;
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.d;
        org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.e;
        d2Var.dismiss();
        if (j10 == 0) {
            return;
        }
        MessagesController.getInstance(this.a).linkCommunity(-j10, this.b, this.c, new kh.l(p2Var, j10, 3));
    }
}
