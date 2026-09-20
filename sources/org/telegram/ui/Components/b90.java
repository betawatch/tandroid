package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class b90 extends j9 {
    public final /* synthetic */ ai.v7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b90(ai.v7 v7Var, Context context) {
        super(context, false);
        this.e = v7Var;
    }

    @Override // org.telegram.ui.Components.j9, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(Math.min(3, ((d90) this.e.d).w) == 0 ? 0 : hg.k0.f(r4, 1, 20, 32)), TLObject.FLAG_30), i11);
    }
}
