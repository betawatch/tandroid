package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class fy implements View.OnClickListener {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ org.telegram.ui.ActionBar.b3 b;
    public final /* synthetic */ gy c;

    public fy(gy gyVar, boolean[] zArr, org.telegram.ui.ActionBar.b3 b3Var) {
        this.c = gyVar;
        this.a = zArr;
        this.b = b3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        jy jyVar = this.c.a;
        boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(jyVar.F.getContext(), 3, null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        kz kzVar = jyVar.F;
        String str = jyVar.w;
        if (str == null) {
            str = kzVar.W0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        AndroidUtilities.runOnUIThread(new wm(this, c2VarArr, ConnectionsManager.getInstance(kzVar.c1).sendRequest(tL_messages_getEmojiURL, new ai.t5(this, c2VarArr, this.b, 8)), 2), 1000L);
    }
}
