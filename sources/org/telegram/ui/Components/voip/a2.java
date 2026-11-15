package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.x60;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class a2 extends x60 {
    public final /* synthetic */ TLRPC.User n1;
    public final /* synthetic */ TLRPC.Chat o1;
    public final /* synthetic */ String p1;
    public final /* synthetic */ TLRPC.InputPeer q1;
    public final /* synthetic */ boolean r1;
    public final /* synthetic */ boolean s1;
    public final /* synthetic */ Activity t1;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 u1;
    public final /* synthetic */ org.telegram.messenger.c v1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.e2 e2Var, org.telegram.messenger.c cVar) {
        super(context, chat);
        this.n1 = user;
        this.o1 = chat2;
        this.p1 = str;
        this.q1 = inputPeer;
        this.r1 = z10;
        this.s1 = z11;
        this.t1 = activity;
        this.u1 = e2Var;
        this.v1 = cVar;
    }

    @Override // org.telegram.ui.Components.x60
    public final void I0() {
        c2.b(this.n1, this.o1, this.p1, this.q1, true, this.r1, this.s1, false, this.t1, this.u1, this.v1, false, false, false);
    }
}
