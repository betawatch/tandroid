package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class ny implements View.OnClickListener {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ org.telegram.ui.ActionBar.b3 b;
    public final /* synthetic */ oy c;

    public ny(oy oyVar, boolean[] zArr, org.telegram.ui.ActionBar.b3 b3Var) {
        this.c = oyVar;
        this.a = zArr;
        this.b = b3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ty tyVar = this.c.a;
        boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(tyVar.F.getContext(), 3, null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        tz tzVar = tyVar.F;
        String str = tyVar.w;
        if (str == null) {
            str = tzVar.W0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        AndroidUtilities.runOnUIThread(new org.telegram.ui.h4(this, c2VarArr, ConnectionsManager.getInstance(tzVar.c1).sendRequest(tL_messages_getEmojiURL, new ai.j2(this, c2VarArr, this.b, 13)), 8), 1000L);
    }
}
