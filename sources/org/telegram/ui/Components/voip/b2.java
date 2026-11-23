package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i70;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class b2 extends i70 {
    public final /* synthetic */ TLRPC.User n1;
    public final /* synthetic */ TLRPC.Chat o1;
    public final /* synthetic */ String p1;
    public final /* synthetic */ TLRPC.InputPeer q1;
    public final /* synthetic */ boolean r1;
    public final /* synthetic */ boolean s1;
    public final /* synthetic */ boolean t1;
    public final /* synthetic */ Activity u1;
    public final /* synthetic */ org.telegram.ui.ActionBar.g2 v1;
    public final /* synthetic */ org.telegram.messenger.c w1;
    public final /* synthetic */ boolean x1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.g2 g2Var, org.telegram.messenger.c cVar, boolean z13) {
        super(context, chat);
        this.n1 = user;
        this.o1 = chat2;
        this.p1 = str;
        this.q1 = inputPeer;
        this.r1 = z10;
        this.s1 = z11;
        this.t1 = z12;
        this.u1 = activity;
        this.v1 = g2Var;
        this.w1 = cVar;
        this.x1 = z13;
    }

    @Override // org.telegram.ui.Components.i70
    public final void J0() {
        c2.b(this.n1, this.o1, this.p1, this.q1, false, this.r1, this.s1, this.t1, this.u1, this.v1, this.w1, false, true, this.x1);
    }
}
