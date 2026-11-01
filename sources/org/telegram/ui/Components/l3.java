package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class l3 extends f51 {
    public final /* synthetic */ AlertDialog$Builder e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(String str, AlertDialog$Builder alertDialog$Builder) {
        super(str, (zz0) null);
        this.e = alertDialog$Builder;
    }

    @Override // org.telegram.ui.Components.f51, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.e.a.N0.run();
        super.onClick(view);
    }
}
