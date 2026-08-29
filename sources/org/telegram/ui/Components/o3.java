package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class o3 extends a51 {
    public final /* synthetic */ AlertDialog$Builder e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(String str, AlertDialog$Builder alertDialog$Builder) {
        super(str, (h01) null);
        this.e = alertDialog$Builder;
    }

    @Override // org.telegram.ui.Components.a51, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.e.a.H0.run();
        super.onClick(view);
    }
}
