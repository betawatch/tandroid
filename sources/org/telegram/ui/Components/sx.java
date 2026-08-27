package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class sx implements View.OnClickListener {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ org.telegram.ui.ActionBar.z2 b;
    public final /* synthetic */ tx c;

    public sx(tx txVar, boolean[] zArr, org.telegram.ui.ActionBar.z2 z2Var) {
        this.c = txVar;
        this.a = zArr;
        this.b = z2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        wx wxVar = this.c.a;
        boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(wxVar.B.getContext(), 3, null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        yy yyVar = wxVar.B;
        String str = wxVar.w;
        if (str == null) {
            str = yyVar.S0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        AndroidUtilities.runOnUIThread(new km(this, b2VarArr, ConnectionsManager.getInstance(yyVar.Y0).sendRequest(tL_messages_getEmojiURL, new cg.y(this, b2VarArr, this.b, 16)), 2), 1000L);
    }
}
