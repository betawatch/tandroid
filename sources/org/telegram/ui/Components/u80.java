package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class u80 extends l9 {
    public final /* synthetic */ bi.e7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u80(bi.e7 e7Var, Context context) {
        super(context, false);
        this.e = e7Var;
    }

    @Override // org.telegram.ui.Components.l9, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(Math.min(3, ((w80) this.e.d).w) == 0 ? 0 : com.google.android.gms.internal.vision.e2.w(r4, 1, 20, 32)), TLObject.FLAG_30), i11);
    }
}
