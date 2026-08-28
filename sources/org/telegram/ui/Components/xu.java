package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class xu extends p41 {
    public final /* synthetic */ yu e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu(yu yuVar, String str) {
        super(str, (vz0) null);
        this.e = yuVar;
    }

    @Override // org.telegram.ui.Components.p41, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i9;
        yu yuVar = this.e;
        i9 = ((org.telegram.ui.ActionBar.f3) yuVar.x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i9);
        String url = getURL();
        dv dvVar = yuVar.x;
        messagesController.openByUserName(url, dvVar.c, 1);
        dvVar.X();
        dvVar.dismiss();
    }
}
