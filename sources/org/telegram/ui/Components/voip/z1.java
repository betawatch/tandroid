package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l70;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class z1 extends l70 {
    public final /* synthetic */ TLRPC.User n1;
    public final /* synthetic */ TLRPC.Chat o1;
    public final /* synthetic */ String p1;
    public final /* synthetic */ TLRPC.InputPeer q1;
    public final /* synthetic */ boolean r1;
    public final /* synthetic */ boolean s1;
    public final /* synthetic */ Activity t1;
    public final /* synthetic */ org.telegram.ui.ActionBar.g2 u1;
    public final /* synthetic */ org.telegram.messenger.c v1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.g2 g2Var, org.telegram.messenger.c cVar) {
        super(context, chat);
        this.n1 = user;
        this.o1 = chat2;
        this.p1 = str;
        this.q1 = inputPeer;
        this.r1 = z10;
        this.s1 = z11;
        this.t1 = activity;
        this.u1 = g2Var;
        this.v1 = cVar;
    }

    @Override // org.telegram.ui.Components.l70
    public final void J0() {
        b2.b(this.n1, this.o1, this.p1, this.q1, true, this.r1, this.s1, false, this.t1, this.u1, this.v1, false, false, false);
    }
}
