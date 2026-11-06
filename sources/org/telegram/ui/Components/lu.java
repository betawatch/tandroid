package org.telegram.ui.Components;

import android.view.View;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
