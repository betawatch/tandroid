package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class rx implements View.OnClickListener {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ org.telegram.ui.ActionBar.a3 b;
    public final /* synthetic */ sx c;

    public rx(sx sxVar, boolean[] zArr, org.telegram.ui.ActionBar.a3 a3Var) {
        this.c = sxVar;
        this.a = zArr;
        this.b = a3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        vx vxVar = this.c.a;
        boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(vxVar.B.getContext(), 3, null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        wy wyVar = vxVar.B;
        String str = vxVar.w;
        if (str == null) {
            str = wyVar.S0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        AndroidUtilities.runOnUIThread(new org.telegram.ui.rl(this, c2VarArr, ConnectionsManager.getInstance(wyVar.Y0).sendRequest(tL_messages_getEmojiURL, new bg.b0(this, c2VarArr, this.b, 16)), 3), 1000L);
    }
}
