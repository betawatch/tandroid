package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c80;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class e2 extends c80 {
    public final /* synthetic */ TLRPC.User c;
    public final /* synthetic */ TLRPC.Chat d;
    public final /* synthetic */ String e;
    public final /* synthetic */ TLRPC.InputPeer f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ Activity s;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 v;
    public final /* synthetic */ AccountInstance w;
    public final /* synthetic */ boolean x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z4, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.p2 p2Var, AccountInstance accountInstance, boolean z12) {
        super(context, chat);
        this.c = user;
        this.d = chat2;
        this.e = str;
        this.f = inputPeer;
        this.h = z4;
        this.n = z10;
        this.r = z11;
        this.s = activity;
        this.v = p2Var;
        this.w = accountInstance;
        this.x = z12;
    }

    @Override // org.telegram.ui.Components.c80
    public final void m() {
        f2.b(this.c, this.d, this.e, this.f, false, this.h, this.n, this.r, this.s, this.v, this.w, false, true, this.x);
    }
}
