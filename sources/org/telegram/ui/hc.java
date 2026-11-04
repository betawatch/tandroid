package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class hc extends am0 {
    public final /* synthetic */ ic H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc(ic icVar, Context context, int i3, long j10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i3, j10, context, e6Var);
        this.H = icVar;
    }

    @Override // org.telegram.ui.am0
    public final void b(int i3, boolean z10) {
        super.b(i3, z10);
        ic icVar = this.H;
        TextView textView = icVar.d;
        if (textView != null) {
            textView.setTextColor(icVar.b.h.getTextColor());
        }
    }
}
