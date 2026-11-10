package org.telegram.ui.ActionBar;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class m extends TextView implements we.a {
    public final /* synthetic */ n a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, Context context) {
        super(context);
        this.a = nVar;
    }

    @Override // we.a
    public final void a() {
        org.telegram.messenger.g0.E2(this);
        this.a.b.x(this);
    }
}
