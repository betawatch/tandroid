package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class nv extends z51 {
    public final /* synthetic */ ov e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nv(ov ovVar, String str) {
        super(str, (b11) null);
        this.e = ovVar;
    }

    @Override // org.telegram.ui.Components.z51, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i10;
        ov ovVar = this.e;
        i10 = ((org.telegram.ui.ActionBar.e3) ovVar.x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        String url = getURL();
        tv tvVar = ovVar.x;
        messagesController.openByUserName(url, tvVar.c, 1);
        tvVar.Y();
        tvVar.dismiss();
    }
}
