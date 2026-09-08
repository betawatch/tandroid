package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class gy implements View.OnClickListener {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ org.telegram.ui.ActionBar.a3 b;
    public final /* synthetic */ hy c;

    public gy(hy hyVar, boolean[] zArr, org.telegram.ui.ActionBar.a3 a3Var) {
        this.c = hyVar;
        this.a = zArr;
        this.b = a3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ky kyVar = this.c.a;
        boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        int i10 = 3;
        org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(kyVar.F.getContext(), 3, null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        kz kzVar = kyVar.F;
        String str = kyVar.w;
        if (str == null) {
            str = kzVar.W0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        AndroidUtilities.runOnUIThread(new org.telegram.ui.dm(this, b2VarArr, ConnectionsManager.getInstance(kzVar.c1).sendRequest(tL_messages_getEmojiURL, new bi.c5(this, b2VarArr, this.b, 8)), i10), 1000L);
    }
}
