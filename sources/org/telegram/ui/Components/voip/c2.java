package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.z70;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class c2 extends z70 {
    public final /* synthetic */ TLRPC.User c;
    public final /* synthetic */ TLRPC.Chat d;
    public final /* synthetic */ String e;
    public final /* synthetic */ TLRPC.InputPeer f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ Activity s;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 v;
    public final /* synthetic */ AccountInstance w;
    public final /* synthetic */ boolean x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.c = user;
        this.d = chat2;
        this.e = str;
        this.f = inputPeer;
        this.h = z10;
        this.n = z11;
        this.r = z12;
        this.s = activity;
        this.v = n2Var;
        this.w = accountInstance;
        this.x = z13;
    }

    @Override // org.telegram.ui.Components.z70
    public final void m() {
        d2.b(this.c, this.d, this.e, this.f, false, this.h, this.n, this.r, this.s, this.v, this.w, false, true, this.x);
    }
}
