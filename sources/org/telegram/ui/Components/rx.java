package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class rx implements View.OnClickListener {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ l2.f b;
    public final /* synthetic */ androidx.mediarouter.app.w c;

    public rx(androidx.mediarouter.app.w wVar, boolean[] zArr, l2.f fVar) {
        this.c = wVar;
        this.a = zArr;
        this.b = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ux uxVar = (ux) this.c.b;
        boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.x1[] x1VarArr = {new org.telegram.ui.ActionBar.x1(3, uxVar.F.getContext(), null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        vy vyVar = uxVar.F;
        String str = uxVar.x;
        if (str == null) {
            str = vyVar.W0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        org.telegram.messenger.i0.h3(new ag.o0(this, x1VarArr, ConnectionsManager.getInstance(vyVar.c1).sendRequest(tL_messages_getEmojiURL, new ag.p0(this, x1VarArr, this.b, 9)), 24), 1000L);
    }
}
