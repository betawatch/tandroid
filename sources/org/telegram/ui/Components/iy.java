package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class iy implements View.OnClickListener {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ org.telegram.ui.ActionBar.z2 b;
    public final /* synthetic */ jy c;

    public iy(jy jyVar, boolean[] zArr, org.telegram.ui.ActionBar.z2 z2Var) {
        this.c = jyVar;
        this.a = zArr;
        this.b = z2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        my myVar = this.c.a;
        boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.a2[] a2VarArr = {new org.telegram.ui.ActionBar.a2(myVar.F.getContext(), 3, null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        mz mzVar = myVar.F;
        String str = myVar.w;
        if (str == null) {
            str = mzVar.W0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        AndroidUtilities.runOnUIThread(new ym(this, a2VarArr, ConnectionsManager.getInstance(mzVar.c1).sendRequest(tL_messages_getEmojiURL, new ai.s5(this, a2VarArr, this.b, 8)), 2), 1000L);
    }
}
