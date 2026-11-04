package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class bx implements View.OnClickListener {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ hi.d b;
    public final /* synthetic */ androidx.mediarouter.app.w c;

    public bx(androidx.mediarouter.app.w wVar, boolean[] zArr, hi.d dVar) {
        this.c = wVar;
        this.a = zArr;
        this.b = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ex exVar = (ex) this.c.b;
        boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.s1[] s1VarArr = {new org.telegram.ui.ActionBar.s1(3, exVar.G.getContext(), null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        ey eyVar = exVar.G;
        String str = exVar.x;
        if (str == null) {
            str = eyVar.X0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        org.telegram.messenger.g0.i3(new org.telegram.ui.f4(this, s1VarArr, ConnectionsManager.getInstance(eyVar.d1).sendRequest(tL_messages_getEmojiURL, new ai.r6(this, s1VarArr, this.b, 14)), 8), 1000L);
    }
}
