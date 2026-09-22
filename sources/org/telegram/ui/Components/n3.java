package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class n3 extends m51 {
    public final /* synthetic */ AlertDialog$Builder e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(String str, AlertDialog$Builder alertDialog$Builder) {
        super(str, (o01) null);
        this.e = alertDialog$Builder;
    }

    @Override // org.telegram.ui.Components.m51, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.e.a.L0.run();
        super.onClick(view);
    }
}
