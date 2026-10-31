package org.telegram.ui.ActionBar;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class m extends TextView implements ie.a {
    public final /* synthetic */ n a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, Context context) {
        super(context);
        this.a = nVar;
    }

    @Override // ie.a
    public final void a() {
        org.telegram.messenger.i0.E2(this);
        this.a.b.w(this);
    }
}
