package org.telegram.ui.Components;

import android.view.View;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class xu extends f51 {
    public final /* synthetic */ yu e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu(yu yuVar, String str) {
        super(str, (zz0) null);
        this.e = yuVar;
    }

    @Override // org.telegram.ui.Components.f51, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        yu yuVar = this.e;
        cv cvVar = yuVar.y;
        Pattern pattern = cv.M1;
        org.telegram.messenger.wp.r1(cvVar.a).v3(getURL(), yuVar.y.j1, 1, null);
        yuVar.y.L0();
        yuVar.y.dismiss();
    }
}
