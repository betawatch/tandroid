package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class fv extends m51 {
    public final /* synthetic */ gv e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv(gv gvVar, String str) {
        super(str, (s01) null);
        this.e = gvVar;
    }

    @Override // org.telegram.ui.Components.m51, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i10;
        gv gvVar = this.e;
        i10 = ((org.telegram.ui.ActionBar.g3) gvVar.x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        String url = getURL();
        lv lvVar = gvVar.x;
        messagesController.openByUserName(url, lvVar.c, 1);
        lvVar.Y();
        lvVar.dismiss();
    }
}
