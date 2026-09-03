package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mw implements MessagesStorage.BooleanCallback, MessagesStorage.LongCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate d;
    public final /* synthetic */ Object e;

    public /* synthetic */ mw(org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.ActionBar.p2 p2Var, int i10, long j10, boolean z4) {
        this.d = d2Var;
        this.e = p2Var;
        this.a = i10;
        this.b = j10;
        this.c = z4;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z4) {
        py pyVar = (py) this.d;
        TLRPC.Chat chat = (TLRPC.Chat) this.e;
        py.t0(this.a, this.b, chat, pyVar, this.c, z4);
    }

    public /* synthetic */ mw(py pyVar, int i10, TLRPC.Chat chat, long j10, boolean z4) {
        this.d = pyVar;
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
        MessagesController.getInstance(this.a).linkCommunity(-j10, this.b, this.c, new lh.l(p2Var, j10, 3));
    }
}
