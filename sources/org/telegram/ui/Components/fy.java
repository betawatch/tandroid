package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        int i10 = 0;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.d2[] d2VarArr = {new org.telegram.ui.ActionBar.d2(jyVar.C.getContext(), 3, null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        kz kzVar = jyVar.C;
        String str = jyVar.w;
        if (str == null) {
            str = kzVar.T0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        AndroidUtilities.runOnUIThread(new ey(this, d2VarArr, ConnectionsManager.getInstance(kzVar.Z0).sendRequest(tL_messages_getEmojiURL, new gg.y(this, d2VarArr, this.b, 13)), i10), 1000L);
    }
}
