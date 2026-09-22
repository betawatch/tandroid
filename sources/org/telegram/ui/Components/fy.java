package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class fy implements View.OnClickListener {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ org.telegram.ui.ActionBar.a3 b;
    public final /* synthetic */ gy c;

    public fy(gy gyVar, boolean[] zArr, org.telegram.ui.ActionBar.a3 a3Var) {
        this.c = gyVar;
        this.a = zArr;
        this.b = a3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        jy jyVar = this.c.a;
        boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(jyVar.F.getContext(), 3, null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        kz kzVar = jyVar.F;
        String str = jyVar.w;
        if (str == null) {
            str = kzVar.W0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        AndroidUtilities.runOnUIThread(new wm(this, b2VarArr, ConnectionsManager.getInstance(kzVar.c1).sendRequest(tL_messages_getEmojiURL, new ai.t5(this, b2VarArr, this.b, 8)), 2), 1000L);
    }
}
