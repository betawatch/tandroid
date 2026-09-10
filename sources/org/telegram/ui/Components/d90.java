package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class d90 extends j9 {
    public final /* synthetic */ bi.w7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d90(bi.w7 w7Var, Context context) {
        super(context, false);
        this.e = w7Var;
    }

    @Override // org.telegram.ui.Components.j9, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(Math.min(3, ((f90) this.e.d).w) == 0 ? 0 : hc.b.B(r4, 1, 20, 32)), TLObject.FLAG_30), i11);
    }
}
