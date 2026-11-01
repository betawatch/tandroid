package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m70;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class l1 extends m70 {
    public final /* synthetic */ TLRPC.User j1;
    public final /* synthetic */ TLRPC.Chat k1;
    public final /* synthetic */ String l1;
    public final /* synthetic */ TLRPC.InputPeer m1;
    public final /* synthetic */ boolean n1;
    public final /* synthetic */ boolean o1;
    public final /* synthetic */ Activity p1;
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 q1;
    public final /* synthetic */ org.telegram.messenger.c r1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.k2 k2Var, org.telegram.messenger.c cVar) {
        super(context, chat);
        this.j1 = user;
        this.k1 = chat2;
        this.l1 = str;
        this.m1 = inputPeer;
        this.n1 = z10;
        this.o1 = z11;
        this.p1 = activity;
        this.q1 = k2Var;
        this.r1 = cVar;
    }

    @Override // org.telegram.ui.Components.m70
    public final void I0() {
        n1.b(this.j1, this.k1, this.l1, this.m1, true, this.n1, this.o1, false, this.p1, this.q1, this.r1, false, false, false);
    }
}
