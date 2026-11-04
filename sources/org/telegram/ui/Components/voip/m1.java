package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.q60;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class m1 extends q60 {
    public final /* synthetic */ TLRPC.User k1;
    public final /* synthetic */ TLRPC.Chat l1;
    public final /* synthetic */ String m1;
    public final /* synthetic */ TLRPC.InputPeer n1;
    public final /* synthetic */ boolean o1;
    public final /* synthetic */ boolean p1;
    public final /* synthetic */ boolean q1;
    public final /* synthetic */ Activity r1;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 s1;
    public final /* synthetic */ org.telegram.messenger.c t1;
    public final /* synthetic */ boolean u1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.d2 d2Var, org.telegram.messenger.c cVar, boolean z13) {
        super(context, chat);
        this.k1 = user;
        this.l1 = chat2;
        this.m1 = str;
        this.n1 = inputPeer;
        this.o1 = z10;
        this.p1 = z11;
        this.q1 = z12;
        this.r1 = activity;
        this.s1 = d2Var;
        this.t1 = cVar;
        this.u1 = z13;
    }

    @Override // org.telegram.ui.Components.q60
    public final void I0() {
        n1.b(this.k1, this.l1, this.m1, this.n1, false, this.o1, this.p1, this.q1, this.r1, this.s1, this.t1, false, true, this.u1);
    }
}
