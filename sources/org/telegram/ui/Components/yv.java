package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class yv extends q61 {
    public final /* synthetic */ zv e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv(zv zvVar, String str) {
        super(str, (q11) null);
        this.e = zvVar;
    }

    @Override // org.telegram.ui.Components.q61, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i10;
        zv zvVar = this.e;
        i10 = ((org.telegram.ui.ActionBar.e3) zvVar.x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        String url = getURL();
        ew ewVar = zvVar.x;
        messagesController.openByUserName(url, ewVar.c, 1);
        ewVar.Z();
        ewVar.dismiss();
    }
}
