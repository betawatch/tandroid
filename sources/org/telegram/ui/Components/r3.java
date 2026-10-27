package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class r3 extends y61 {
    public final /* synthetic */ AlertDialog$Builder e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(String str, AlertDialog$Builder alertDialog$Builder) {
        super(str, (z11) null);
        this.e = alertDialog$Builder;
    }

    @Override // org.telegram.ui.Components.y61, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.e.a.N0.run();
        super.onClick(view);
    }
}
