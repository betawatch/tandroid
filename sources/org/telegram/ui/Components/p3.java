package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class p3 extends z51 {
    public final /* synthetic */ AlertDialog$Builder e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(String str, AlertDialog$Builder alertDialog$Builder) {
        super(str, (b11) null);
        this.e = alertDialog$Builder;
    }

    @Override // org.telegram.ui.Components.z51, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.e.a.L0.run();
        super.onClick(view);
    }
}
