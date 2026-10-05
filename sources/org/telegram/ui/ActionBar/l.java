package org.telegram.ui.ActionBar;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class l extends TextView implements oe.a {
    public final /* synthetic */ m a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, Context context) {
        super(context);
        this.a = mVar;
    }

    @Override // oe.a
    public final void a() {
        AndroidUtilities.removeFromParent(this);
        this.a.b.s(this);
    }
}
