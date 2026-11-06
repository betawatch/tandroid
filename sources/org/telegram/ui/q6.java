package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class q6 extends l6 {
    public final /* synthetic */ y6 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(y6 y6Var, Context context) {
        super(context);
        this.d = y6Var;
        ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(5.0f);
        this.a.setOnClickListener(new a(this, 5));
    }
}
