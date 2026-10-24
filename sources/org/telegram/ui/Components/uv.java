package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class uv extends q61 {
    public final /* synthetic */ vv e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv(vv vvVar, String str) {
        super(str, (q11) null);
        this.e = vvVar;
    }

    @Override // org.telegram.ui.Components.q61, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i10;
        vv vvVar = this.e;
        i10 = ((org.telegram.ui.ActionBar.h3) vvVar.x).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        String url = getURL();
        aw awVar = vvVar.x;
        messagesController.openByUserName(url, awVar.c, 1);
        awVar.i0();
        awVar.dismiss();
    }
}
