package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class k3 extends p41 {
    public final /* synthetic */ AlertDialog$Builder e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(String str, AlertDialog$Builder alertDialog$Builder) {
        super(str, (vz0) null);
        this.e = alertDialog$Builder;
    }

    @Override // org.telegram.ui.Components.p41, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.e.a.H0.run();
        super.onClick(view);
    }
}
