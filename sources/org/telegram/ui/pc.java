package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class pc extends zo0 {
    public final /* synthetic */ qc B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pc(qc qcVar, Context context, int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(i10, j10, context, c6Var);
        this.B = qcVar;
    }

    @Override // org.telegram.ui.zo0
    public final void b(int i10, boolean z10) {
        super.b(i10, z10);
        qc qcVar = this.B;
        TextView textView = qcVar.d;
        if (textView != null) {
            textView.setTextColor(qcVar.b.h.getTextColor());
        }
    }
}
