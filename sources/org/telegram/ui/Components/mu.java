package org.telegram.ui.Components;

import android.view.View;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class mu extends c41 {
    public final /* synthetic */ nu e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mu(nu nuVar, String str) {
        super(str, (vy0) null);
        this.e = nuVar;
    }

    @Override // org.telegram.ui.Components.c41, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        nu nuVar = this.e;
        ru ruVar = nuVar.y;
        Pattern pattern = ru.M1;
        org.telegram.messenger.qp.s1(ruVar.a).y3(getURL(), nuVar.y.j1, 1, null);
        nuVar.y.L0();
        nuVar.y.dismiss();
    }
}
