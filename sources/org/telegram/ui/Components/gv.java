package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class gv extends m51 {
    public final /* synthetic */ hv e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv(hv hvVar, String str) {
        super(str, (s01) null);
        this.e = hvVar;
    }

    @Override // org.telegram.ui.Components.m51, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i10;
        hv hvVar = this.e;
        i10 = ((org.telegram.ui.ActionBar.g3) hvVar.x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        String url = getURL();
        mv mvVar = hvVar.x;
        messagesController.openByUserName(url, mvVar.c, 1);
        mvVar.Y();
        mvVar.dismiss();
    }
}
