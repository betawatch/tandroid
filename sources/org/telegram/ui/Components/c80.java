package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c80 extends c9 {
    public final /* synthetic */ gh.h1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c80(gh.h1 h1Var, Context context) {
        super(context, false);
        this.e = h1Var;
    }

    @Override // org.telegram.ui.Components.c9, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(Math.min(3, ((e80) this.e.d).w) == 0 ? 0 : e2.c.e(r4, 1, 20, 32)), TLObject.FLAG_30), i10);
    }
}
