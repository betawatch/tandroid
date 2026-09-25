package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class hy implements View.OnClickListener {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ org.telegram.ui.ActionBar.z2 b;
    public final /* synthetic */ iy c;

    public hy(iy iyVar, boolean[] zArr, org.telegram.ui.ActionBar.z2 z2Var) {
        this.c = iyVar;
        this.a = zArr;
        this.b = z2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ly lyVar = this.c.a;
        boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.a2[] a2VarArr = {new org.telegram.ui.ActionBar.a2(lyVar.F.getContext(), 3, null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        lz lzVar = lyVar.F;
        String str = lyVar.w;
        if (str == null) {
            str = lzVar.W0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        AndroidUtilities.runOnUIThread(new xm(this, a2VarArr, ConnectionsManager.getInstance(lzVar.c1).sendRequest(tL_messages_getEmojiURL, new ai.s5(this, a2VarArr, this.b, 8)), 2), 1000L);
    }
}
