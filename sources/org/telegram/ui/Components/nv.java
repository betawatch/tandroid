package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class nv extends c61 {
    public final /* synthetic */ ov e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nv(ov ovVar, String str) {
        super(str, (e11) null);
        this.e = ovVar;
    }

    @Override // org.telegram.ui.Components.c61, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i10;
        ov ovVar = this.e;
        i10 = ((org.telegram.ui.ActionBar.f3) ovVar.x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        String url = getURL();
        tv tvVar = ovVar.x;
        messagesController.openByUserName(url, tvVar.c, 1);
        tvVar.Y();
        tvVar.dismiss();
    }
}
