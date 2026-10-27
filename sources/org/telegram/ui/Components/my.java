package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class my implements View.OnClickListener {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ org.telegram.ui.ActionBar.e3 b;
    public final /* synthetic */ ny c;

    public my(ny nyVar, boolean[] zArr, org.telegram.ui.ActionBar.e3 e3Var) {
        this.c = nyVar;
        this.a = zArr;
        this.b = e3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        sy syVar = this.c.a;
        boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.e2[] e2VarArr = {new org.telegram.ui.ActionBar.e2(syVar.F.getContext(), 3, null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        sz szVar = syVar.F;
        String str = syVar.w;
        if (str == null) {
            str = szVar.W0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        AndroidUtilities.runOnUIThread(new org.telegram.ui.g4(this, e2VarArr, ConnectionsManager.getInstance(szVar.c1).sendRequest(tL_messages_getEmojiURL, new bi.h2(this, e2VarArr, this.b, 13)), 8), 1000L);
    }
}
