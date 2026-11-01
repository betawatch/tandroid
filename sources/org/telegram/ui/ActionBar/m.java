package org.telegram.ui.ActionBar;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
