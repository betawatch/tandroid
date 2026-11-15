package org.telegram.ui.Components;

import android.view.View;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ru extends f41 {
    public final /* synthetic */ su e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru(su suVar, String str) {
        super(str, (wy0) null);
        this.e = suVar;
    }

    @Override // org.telegram.ui.Components.f41, android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        su suVar = this.e;
        wu wuVar = suVar.y;
        Pattern pattern = wu.Q1;
        org.telegram.messenger.np.s1(wuVar.a).y3(getURL(), suVar.y.n1, 1, null);
        suVar.y.L0();
        suVar.y.dismiss();
    }
}
