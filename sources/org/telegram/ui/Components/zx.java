package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class zx implements View.OnClickListener {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ org.telegram.ui.ActionBar.a3 b;
    public final /* synthetic */ ay c;

    public zx(ay ayVar, boolean[] zArr, org.telegram.ui.ActionBar.a3 a3Var) {
        this.c = ayVar;
        this.a = zArr;
        this.b = a3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ey eyVar = this.c.a;
        boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(eyVar.B.getContext(), 3, null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        fz fzVar = eyVar.B;
        String str = eyVar.w;
        if (str == null) {
            str = fzVar.S0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        AndroidUtilities.runOnUIThread(new rm(this, c2VarArr, ConnectionsManager.getInstance(fzVar.Y0).sendRequest(tL_messages_getEmojiURL, new eg.z(this, c2VarArr, this.b, 14)), 2), 1000L);
    }
}
