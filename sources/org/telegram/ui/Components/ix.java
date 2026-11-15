package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ix implements View.OnClickListener {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ org.telegram.messenger.ou b;
    public final /* synthetic */ androidx.mediarouter.app.w c;

    public ix(androidx.mediarouter.app.w wVar, boolean[] zArr, org.telegram.messenger.ou ouVar) {
        this.c = wVar;
        this.a = zArr;
        this.b = ouVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        lx lxVar = (lx) this.c.b;
        boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.t1[] t1VarArr = {new org.telegram.ui.ActionBar.t1(3, lxVar.G.getContext(), null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        ly lyVar = lxVar.G;
        String str = lxVar.x;
        if (str == null) {
            str = lyVar.X0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        org.telegram.messenger.g0.i3(new org.telegram.ui.f0(this, t1VarArr, ConnectionsManager.getInstance(lyVar.d1).sendRequest(tL_messages_getEmojiURL, new bi.j6(this, t1VarArr, this.b, 14)), 10), 1000L);
    }
}
