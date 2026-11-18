package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
