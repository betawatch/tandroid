package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m70;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l1 extends m70 {
    public final /* synthetic */ TLRPC.User j1;
    public final /* synthetic */ TLRPC.Chat k1;
    public final /* synthetic */ String l1;
    public final /* synthetic */ TLRPC.InputPeer m1;
    public final /* synthetic */ boolean n1;
    public final /* synthetic */ boolean o1;
    public final /* synthetic */ boolean p1;
    public final /* synthetic */ Activity q1;
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 r1;
    public final /* synthetic */ org.telegram.messenger.c s1;
    public final /* synthetic */ boolean t1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.k2 k2Var, org.telegram.messenger.c cVar, boolean z13) {
        super(context, chat);
        this.j1 = user;
        this.k1 = chat2;
        this.l1 = str;
        this.m1 = inputPeer;
        this.n1 = z10;
        this.o1 = z11;
        this.p1 = z12;
        this.q1 = activity;
        this.r1 = k2Var;
        this.s1 = cVar;
        this.t1 = z13;
    }

    @Override // org.telegram.ui.Components.m70
    public final void I0() {
        m1.b(this.j1, this.k1, this.l1, this.m1, false, this.n1, this.o1, this.p1, this.q1, this.r1, this.s1, false, true, this.t1);
    }
}
