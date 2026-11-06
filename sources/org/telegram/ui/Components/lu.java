package org.telegram.ui.Components;

import android.view.View;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class lu extends b41 {
    public final /* synthetic */ mu e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu(mu muVar, String str) {
        super(str, (uy0) null);
        this.e = muVar;
    }

    @Override // org.telegram.ui.Components.b41, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        mu muVar = this.e;
        qu quVar = muVar.y;
        Pattern pattern = qu.M1;
        org.telegram.messenger.qp.s1(quVar.a).y3(getURL(), muVar.y.j1, 1, null);
        muVar.y.L0();
        muVar.y.dismiss();
    }
}
