package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class g90 extends k9 {
    public final /* synthetic */ ai.w7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g90(ai.w7 w7Var, Context context) {
        super(context, false);
        this.e = w7Var;
    }

    @Override // org.telegram.ui.Components.k9, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(Math.min(3, ((i90) this.e.d).w) == 0 ? 0 : hg.c.f(r4, 1, 20, 32)), TLObject.FLAG_30), i11);
    }
}
