package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class e90 extends j9 {
    public final /* synthetic */ ai.v7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e90(ai.v7 v7Var, Context context) {
        super(context, false);
        this.e = v7Var;
    }

    @Override // org.telegram.ui.Components.j9, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(Math.min(3, ((g90) this.e.d).w) == 0 ? 0 : hg.k0.f(r4, 1, 20, 32)), TLObject.FLAG_30), i11);
    }
}
