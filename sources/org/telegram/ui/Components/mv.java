package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class mv extends m51 {
    public final /* synthetic */ nv e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv(nv nvVar, String str) {
        super(str, (o01) null);
        this.e = nvVar;
    }

    @Override // org.telegram.ui.Components.m51, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i10;
        nv nvVar = this.e;
        i10 = ((org.telegram.ui.ActionBar.f3) nvVar.x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        String url = getURL();
        sv svVar = nvVar.x;
        messagesController.openByUserName(url, svVar.c, 1);
        svVar.Y();
        svVar.dismiss();
    }
}
