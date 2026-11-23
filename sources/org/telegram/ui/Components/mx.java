package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class mx implements View.OnClickListener {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ h6.o b;
    public final /* synthetic */ androidx.mediarouter.app.w c;

    public mx(androidx.mediarouter.app.w wVar, boolean[] zArr, h6.o oVar) {
        this.c = wVar;
        this.a = zArr;
        this.b = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        px pxVar = (px) this.c.b;
        boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.t1[] t1VarArr = {new org.telegram.ui.ActionBar.t1(3, pxVar.G.getContext(), null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        qy qyVar = pxVar.G;
        String str = pxVar.x;
        if (str == null) {
            str = qyVar.X0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        org.telegram.messenger.g0.h3(new org.telegram.ui.f0(this, t1VarArr, ConnectionsManager.getInstance(qyVar.d1).sendRequest(tL_messages_getEmojiURL, new bi.q1(this, t1VarArr, this.b, 16)), 10), 1000L);
    }
}
