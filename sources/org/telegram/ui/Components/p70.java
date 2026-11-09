package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class p70 extends z8 {
    public final /* synthetic */ bi.s1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p70(bi.s1 s1Var, Context context) {
        super(context, false);
        this.e = s1Var;
    }

    @Override // org.telegram.ui.Components.z8, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(Math.min(3, ((r70) this.e.d).x) == 0 ? 0 : com.google.android.recaptcha.internal.a.e(r4, 1, 20, 32)), TLObject.FLAG_30), i10);
    }
}
