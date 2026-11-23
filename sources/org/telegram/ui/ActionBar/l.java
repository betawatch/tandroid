package org.telegram.ui.ActionBar;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class l extends TextView implements we.a {
    public final /* synthetic */ m a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, Context context) {
        super(context);
        this.a = mVar;
    }

    @Override // we.a
    public final void a() {
        org.telegram.messenger.g0.E2(this);
        this.a.b.y(this);
    }
}
