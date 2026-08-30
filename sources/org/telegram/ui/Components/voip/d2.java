package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b80;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class d2 extends b80 {
    public final /* synthetic */ TLRPC.User c;
    public final /* synthetic */ TLRPC.Chat d;
    public final /* synthetic */ String e;
    public final /* synthetic */ TLRPC.InputPeer f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ Activity r;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 s;
    public final /* synthetic */ AccountInstance v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z4, boolean z10, Activity activity, org.telegram.ui.ActionBar.p2 p2Var, AccountInstance accountInstance) {
        super(context, chat);
        this.c = user;
        this.d = chat2;
        this.e = str;
        this.f = inputPeer;
        this.h = z4;
        this.n = z10;
        this.r = activity;
        this.s = p2Var;
        this.v = accountInstance;
    }

    @Override // org.telegram.ui.Components.b80
    public final void m() {
        f2.b(this.c, this.d, this.e, this.f, true, this.h, this.n, false, this.r, this.s, this.v, false, false, false);
    }
}
