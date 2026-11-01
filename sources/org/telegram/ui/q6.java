package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class q6 extends m6 {
    public final /* synthetic */ y6 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(y6 y6Var, Context context) {
        super(context);
        this.d = y6Var;
        ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(5.0f);
        this.a.setOnClickListener(new a(this, 5));
    }
}
