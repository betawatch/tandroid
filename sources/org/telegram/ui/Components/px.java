package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class px implements View.OnClickListener {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ hi.w4 b;
    public final /* synthetic */ androidx.mediarouter.app.w c;

    public px(androidx.mediarouter.app.w wVar, boolean[] zArr, hi.w4 w4Var) {
        this.c = wVar;
        this.a = zArr;
        this.b = w4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        sx sxVar = (sx) this.c.b;
        boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.t1[] t1VarArr = {new org.telegram.ui.ActionBar.t1(3, sxVar.G.getContext(), null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        ty tyVar = sxVar.G;
        String str = sxVar.x;
        if (str == null) {
            str = tyVar.X0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        org.telegram.messenger.g0.h3(new org.telegram.ui.f0(this, t1VarArr, ConnectionsManager.getInstance(tyVar.d1).sendRequest(tL_messages_getEmojiURL, new bi.q1(this, t1VarArr, this.b, 16)), 10), 1000L);
    }
}
