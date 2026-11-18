package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class t3 extends p41 {
    public final /* synthetic */ AlertDialog$Builder e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(String str, AlertDialog$Builder alertDialog$Builder) {
        super(str, (dz0) null);
        this.e = alertDialog$Builder;
    }

    @Override // org.telegram.ui.Components.p41, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.e.a.M0.run();
        super.onClick(view);
    }
}
