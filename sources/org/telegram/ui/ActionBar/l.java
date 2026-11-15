package org.telegram.ui.ActionBar;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        this.a.b.x(this);
    }
}
