package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class v90 extends m9 {
    public final /* synthetic */ ai.x7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v90(ai.x7 x7Var, Context context) {
        super(context, false);
        this.e = x7Var;
    }

    @Override // org.telegram.ui.Components.m9, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(Math.min(3, ((x90) this.e.d).w) == 0 ? 0 : hg.c.f(r4, 1, 20, 32)), TLObject.FLAG_30), i11);
    }
}
