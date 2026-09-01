package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class l3 extends n51 {
    public final /* synthetic */ AlertDialog$Builder e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(String str, AlertDialog$Builder alertDialog$Builder) {
        super(str, (t01) null);
        this.e = alertDialog$Builder;
    }

    @Override // org.telegram.ui.Components.n51, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.e.a.I0.run();
        super.onClick(view);
    }
}
