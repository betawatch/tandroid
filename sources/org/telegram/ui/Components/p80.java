package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class p80 extends h9 {
    public final /* synthetic */ bg.z3 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p80(bg.z3 z3Var, Context context) {
        super(context, false);
        this.e = z3Var;
    }

    @Override // org.telegram.ui.Components.h9, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(Math.min(3, ((r80) this.e.b).w) == 0 ? 0 : com.google.android.recaptcha.internal.a.f(r4, 1, 20, 32)), TLObject.FLAG_30), i11);
    }
}
