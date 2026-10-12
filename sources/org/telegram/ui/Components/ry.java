package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ry implements View.OnClickListener {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ org.telegram.ui.ActionBar.z2 b;
    public final /* synthetic */ sy c;

    public ry(sy syVar, boolean[] zArr, org.telegram.ui.ActionBar.z2 z2Var) {
        this.c = syVar;
        this.a = zArr;
        this.b = z2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        vy vyVar = this.c.a;
        boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.a2[] a2VarArr = {new org.telegram.ui.ActionBar.a2(vyVar.F.getContext(), 3, null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        wz wzVar = vyVar.F;
        String str = vyVar.w;
        if (str == null) {
            str = wzVar.W0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        AndroidUtilities.runOnUIThread(new org.telegram.ui.gm(this, a2VarArr, ConnectionsManager.getInstance(wzVar.c1).sendRequest(tL_messages_getEmojiURL, new bi.e5(this, a2VarArr, this.b, 8)), 4), 1000L);
    }
}
