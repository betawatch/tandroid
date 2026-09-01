package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class hy implements View.OnClickListener {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ org.telegram.ui.ActionBar.c3 b;
    public final /* synthetic */ iy c;

    public hy(iy iyVar, boolean[] zArr, org.telegram.ui.ActionBar.c3 c3Var) {
        this.c = iyVar;
        this.a = zArr;
        this.b = c3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ly lyVar = this.c.a;
        boolean[] zArr = this.a;
        int i10 = 0;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.d2[] d2VarArr = {new org.telegram.ui.ActionBar.d2(lyVar.C.getContext(), 3, null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        mz mzVar = lyVar.C;
        String str = lyVar.w;
        if (str == null) {
            str = mzVar.T0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        AndroidUtilities.runOnUIThread(new gy(this, d2VarArr, ConnectionsManager.getInstance(mzVar.Z0).sendRequest(tL_messages_getEmojiURL, new hg.y(this, d2VarArr, this.b, 13)), i10), 1000L);
    }
}
