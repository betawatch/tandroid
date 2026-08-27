package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class k3 extends r41 {
    public final /* synthetic */ AlertDialog$Builder e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(String str, AlertDialog$Builder alertDialog$Builder) {
        super(str, (xz0) null);
        this.e = alertDialog$Builder;
    }

    @Override // org.telegram.ui.Components.r41, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.e.a.H0.run();
        super.onClick(view);
    }
}
