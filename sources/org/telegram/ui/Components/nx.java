package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class nx implements View.OnClickListener {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ hi.w4 b;
    public final /* synthetic */ androidx.mediarouter.app.w c;

    public nx(androidx.mediarouter.app.w wVar, boolean[] zArr, hi.w4 w4Var) {
        this.c = wVar;
        this.a = zArr;
        this.b = w4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        qx qxVar = (qx) this.c.b;
        boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.u1[] u1VarArr = {new org.telegram.ui.ActionBar.u1(3, qxVar.G.getContext(), null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        ry ryVar = qxVar.G;
        String str = qxVar.x;
        if (str == null) {
            str = ryVar.X0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        org.telegram.messenger.g0.h3(new org.telegram.ui.b0(this, u1VarArr, ConnectionsManager.getInstance(ryVar.d1).sendRequest(tL_messages_getEmojiURL, new bi.m1(this, u1VarArr, this.b, 16)), 11), 1000L);
    }
}
