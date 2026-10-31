package org.telegram.ui.Components;

import android.view.View;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class xu extends e51 {
    public final /* synthetic */ yu e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu(yu yuVar, String str) {
        super(str, (yz0) null);
        this.e = yuVar;
    }

    @Override // org.telegram.ui.Components.e51, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        yu yuVar = this.e;
        cv cvVar = yuVar.y;
        Pattern pattern = cv.M1;
        org.telegram.messenger.vp.r1(cvVar.a).v3(getURL(), yuVar.y.j1, 1, null);
        yuVar.y.L0();
        yuVar.y.dismiss();
    }
}
