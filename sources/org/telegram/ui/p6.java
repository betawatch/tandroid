package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class p6 extends l6 {
    public final /* synthetic */ z6 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(z6 z6Var, Context context) {
        super(context);
        this.d = z6Var;
        ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).topMargin = AndroidUtilities.dp(5.0f);
        this.a.setOnClickListener(new a(this, 6));
    }
}
