package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class iv extends n51 {
    public final /* synthetic */ jv e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv(jv jvVar, String str) {
        super(str, (t01) null);
        this.e = jvVar;
    }

    @Override // org.telegram.ui.Components.n51, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i10;
        jv jvVar = this.e;
        i10 = ((org.telegram.ui.ActionBar.h3) jvVar.x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        String url = getURL();
        ov ovVar = jvVar.x;
        messagesController.openByUserName(url, ovVar.c, 1);
        ovVar.Y();
        ovVar.dismiss();
    }
}
