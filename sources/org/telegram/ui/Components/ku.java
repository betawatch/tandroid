package org.telegram.ui.Components;

import android.view.View;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ku extends v31 {
    public final /* synthetic */ lu e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ku(lu luVar, String str) {
        super(str, (ty0) null);
        this.e = luVar;
    }

    @Override // org.telegram.ui.Components.v31, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        lu luVar = this.e;
        pu puVar = luVar.y;
        Pattern pattern = pu.N1;
        org.telegram.messenger.hp.s1(puVar.a).y3(getURL(), luVar.y.k1, 1, null);
        luVar.y.L0();
        luVar.y.dismiss();
    }
}
