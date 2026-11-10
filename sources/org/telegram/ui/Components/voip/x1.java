package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.v60;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class x1 extends v60 {
    public final /* synthetic */ TLRPC.User m1;
    public final /* synthetic */ TLRPC.Chat n1;
    public final /* synthetic */ String o1;
    public final /* synthetic */ TLRPC.InputPeer p1;
    public final /* synthetic */ boolean q1;
    public final /* synthetic */ boolean r1;
    public final /* synthetic */ boolean s1;
    public final /* synthetic */ Activity t1;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 u1;
    public final /* synthetic */ org.telegram.messenger.c v1;
    public final /* synthetic */ boolean w1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z9, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.messenger.c cVar, boolean z12) {
        super(context, chat);
        this.m1 = user;
        this.n1 = chat2;
        this.o1 = str;
        this.p1 = inputPeer;
        this.q1 = z9;
        this.r1 = z10;
        this.s1 = z11;
        this.t1 = activity;
        this.u1 = f2Var;
        this.v1 = cVar;
        this.w1 = z12;
    }

    @Override // org.telegram.ui.Components.v60
    public final void I0() {
        y1.b(this.m1, this.n1, this.o1, this.p1, false, this.q1, this.r1, this.s1, this.t1, this.u1, this.v1, false, true, this.w1);
    }
}
