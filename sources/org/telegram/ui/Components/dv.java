package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class dv extends a51 {
    public final /* synthetic */ ev e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv(ev evVar, String str) {
        super(str, (h01) null);
        this.e = evVar;
    }

    @Override // org.telegram.ui.Components.a51, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i10;
        ev evVar = this.e;
        i10 = ((org.telegram.ui.ActionBar.f3) evVar.x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        String url = getURL();
        jv jvVar = evVar.x;
        messagesController.openByUserName(url, jvVar.c, 1);
        jvVar.Y();
        jvVar.dismiss();
    }
}
