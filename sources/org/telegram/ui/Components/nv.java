package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
