package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class uv extends j61 {
    public final /* synthetic */ vv e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv(vv vvVar, String str) {
        super(str, (l11) null);
        this.e = vvVar;
    }

    @Override // org.telegram.ui.Components.j61, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i10;
        vv vvVar = this.e;
        i10 = ((org.telegram.ui.ActionBar.f3) vvVar.x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        String url = getURL();
        aw awVar = vvVar.x;
        messagesController.openByUserName(url, awVar.c, 1);
        awVar.Z();
        awVar.dismiss();
    }
}
