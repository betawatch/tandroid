package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class uv extends x61 {
    public final /* synthetic */ vv e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv(vv vvVar, String str) {
        super(str, (y11) null);
        this.e = vvVar;
    }

    @Override // org.telegram.ui.Components.x61, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i10;
        vv vvVar = this.e;
        i10 = ((org.telegram.ui.ActionBar.k3) vvVar.x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        String url = getURL();
        aw awVar = vvVar.x;
        messagesController.openByUserName(url, awVar.c, 1);
        awVar.i0();
        awVar.dismiss();
    }
}
