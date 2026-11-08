package org.telegram.ui.Components;

import android.view.View;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class mu extends b41 {
    public final /* synthetic */ nu e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mu(nu nuVar, String str) {
        super(str, (uy0) null);
        this.e = nuVar;
    }

    @Override // org.telegram.ui.Components.b41, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        nu nuVar = this.e;
        ru ruVar = nuVar.y;
        Pattern pattern = ru.M1;
        org.telegram.messenger.qp.s1(ruVar.a).y3(getURL(), nuVar.y.j1, 1, null);
        nuVar.y.L0();
        nuVar.y.dismiss();
    }
}
