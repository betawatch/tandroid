package org.telegram.ui.Components;

import android.view.View;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class zu extends s41 {
    public final /* synthetic */ av e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zu(av avVar, String str) {
        super(str, (fz0) null);
        this.e = avVar;
    }

    @Override // org.telegram.ui.Components.s41, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        av avVar = this.e;
        ev evVar = avVar.y;
        Pattern pattern = ev.Q1;
        org.telegram.messenger.mp.u1(evVar.a).F3(getURL(), avVar.y.n1, 1, null);
        avVar.y.M0();
        avVar.y.dismiss();
    }
}
