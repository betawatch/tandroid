package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class n3 extends b41 {
    public final /* synthetic */ AlertDialog$Builder e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(String str, AlertDialog$Builder alertDialog$Builder) {
        super(str, (uy0) null);
        this.e = alertDialog$Builder;
    }

    @Override // org.telegram.ui.Components.b41, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.e.a.L0.run();
        super.onClick(view);
    }
}
