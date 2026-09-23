package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class u80 extends k9 {
    public final /* synthetic */ ai.w7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u80(ai.w7 w7Var, Context context) {
        super(context, false);
        this.e = w7Var;
    }

    @Override // org.telegram.ui.Components.k9, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(Math.min(3, ((w80) this.e.d).w) == 0 ? 0 : hg.c.g(r4, 1, 20, 32)), TLObject.FLAG_30), i11);
    }
}
