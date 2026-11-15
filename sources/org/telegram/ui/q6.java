package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class q6 extends m6 {
    public final /* synthetic */ y6 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(y6 y6Var, Context context) {
        super(context);
        this.d = y6Var;
        ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(5.0f);
        this.a.setOnClickListener(new a(this, 5));
    }
}
