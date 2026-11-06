package org.telegram.ui.Components;

import android.view.View;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class lu extends v31 {
    public final /* synthetic */ mu e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu(mu muVar, String str) {
        super(str, (ty0) null);
        this.e = muVar;
    }

    @Override // org.telegram.ui.Components.v31, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        mu muVar = this.e;
        qu quVar = muVar.y;
        Pattern pattern = qu.M1;
        org.telegram.messenger.qp.s1(quVar.a).y3(getURL(), muVar.y.j1, 1, null);
        muVar.y.L0();
        muVar.y.dismiss();
    }
}
