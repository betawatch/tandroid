package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class n3 extends n51 {
    public final /* synthetic */ AlertDialog$Builder e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(String str, AlertDialog$Builder alertDialog$Builder) {
        super(str, (p01) null);
        this.e = alertDialog$Builder;
    }

    @Override // org.telegram.ui.Components.n51, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.e.a.L0.run();
        super.onClick(view);
    }
}
