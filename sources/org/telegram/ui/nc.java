package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class nc extends xo0 {
    public final /* synthetic */ oc B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc(oc ocVar, Context context, int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(i10, j10, context, c6Var);
        this.B = ocVar;
    }

    @Override // org.telegram.ui.xo0
    public final void b(int i10, boolean z10) {
        super.b(i10, z10);
        oc ocVar = this.B;
        TextView textView = ocVar.d;
        if (textView != null) {
            textView.setTextColor(ocVar.b.h.getTextColor());
        }
    }
}
