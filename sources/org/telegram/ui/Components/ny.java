package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ny implements View.OnClickListener {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ org.telegram.ui.ActionBar.c3 b;
    public final /* synthetic */ oy c;

    public ny(oy oyVar, boolean[] zArr, org.telegram.ui.ActionBar.c3 c3Var) {
        this.c = oyVar;
        this.a = zArr;
        this.b = c3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ry ryVar = this.c.a;
        boolean[] zArr = this.a;
        int i10 = 0;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.d2[] d2VarArr = {new org.telegram.ui.ActionBar.d2(ryVar.F.getContext(), 3, null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        rz rzVar = ryVar.F;
        String str = ryVar.w;
        if (str == null) {
            str = rzVar.W0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        AndroidUtilities.runOnUIThread(new my(this, d2VarArr, ConnectionsManager.getInstance(rzVar.c1).sendRequest(tL_messages_getEmojiURL, new bi.wa(this, d2VarArr, this.b, 7)), i10), 1000L);
    }
}
