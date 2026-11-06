package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class cx implements View.OnClickListener {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ h9.f1 b;
    public final /* synthetic */ androidx.mediarouter.app.w c;

    public cx(androidx.mediarouter.app.w wVar, boolean[] zArr, h9.f1 f1Var) {
        this.c = wVar;
        this.a = zArr;
        this.b = f1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        gx gxVar = (gx) this.c.b;
        boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.u1[] u1VarArr = {new org.telegram.ui.ActionBar.u1(3, gxVar.F.getContext(), null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        gy gyVar = gxVar.F;
        String str = gxVar.x;
        if (str == null) {
            str = gyVar.W0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        org.telegram.messenger.g0.i3(new org.telegram.ui.q8(this, u1VarArr, ConnectionsManager.getInstance(gyVar.c1).sendRequest(tL_messages_getEmojiURL, new bi.f2(this, u1VarArr, this.b, 13)), 7), 1000L);
    }
}
