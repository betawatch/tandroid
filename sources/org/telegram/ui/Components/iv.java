package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class iv extends l51 {
    public final /* synthetic */ jv e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv(jv jvVar, String str) {
        super(str, (s01) null);
        this.e = jvVar;
    }

    @Override // org.telegram.ui.Components.l51, android.text.style.URLSpan, android.text.style.ClickableSpan
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
