package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j70;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c2 extends j70 {
    public final /* synthetic */ TLRPC.User c;
    public final /* synthetic */ TLRPC.Chat d;
    public final /* synthetic */ String e;
    public final /* synthetic */ TLRPC.InputPeer f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ Activity r;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 s;
    public final /* synthetic */ AccountInstance v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.o2 o2Var, AccountInstance accountInstance) {
        super(context, chat);
        this.c = user;
        this.d = chat2;
        this.e = str;
        this.f = inputPeer;
        this.h = z10;
        this.n = z11;
        this.r = activity;
        this.s = o2Var;
        this.v = accountInstance;
    }

    @Override // org.telegram.ui.Components.j70
    public final void m() {
        e2.b(this.c, this.d, this.e, this.f, true, this.h, this.n, false, this.r, this.s, this.v, false, false, false);
    }
}
