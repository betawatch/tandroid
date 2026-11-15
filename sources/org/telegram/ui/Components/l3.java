package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class l3 extends f41 {
    public final /* synthetic */ AlertDialog$Builder e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(String str, AlertDialog$Builder alertDialog$Builder) {
        super(str, (wy0) null);
        this.e = alertDialog$Builder;
    }

    @Override // org.telegram.ui.Components.f41, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.e.a.M0.run();
        super.onClick(view);
    }
}
