package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class p6 extends l6 {
    public final /* synthetic */ x6 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(x6 x6Var, Context context) {
        super(context);
        this.d = x6Var;
        ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(5.0f);
        this.a.setOnClickListener(new a(this, 5));
    }
}
