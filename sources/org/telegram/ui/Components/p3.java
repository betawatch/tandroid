package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class p3 extends b61 {
    public final /* synthetic */ AlertDialog$Builder e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(String str, AlertDialog$Builder alertDialog$Builder) {
        super(str, (d11) null);
        this.e = alertDialog$Builder;
    }

    @Override // org.telegram.ui.Components.b61, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.e.a.L0.run();
        super.onClick(view);
    }
}
