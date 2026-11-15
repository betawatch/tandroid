package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ic extends gm0 {
    public final /* synthetic */ jc H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic(jc jcVar, Context context, int i7, long j3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i7, j3, context, e6Var);
        this.H = jcVar;
    }

    @Override // org.telegram.ui.gm0
    public final void b(int i7, boolean z10) {
        super.b(i7, z10);
        jc jcVar = this.H;
        TextView textView = jcVar.d;
        if (textView != null) {
            textView.setTextColor(jcVar.b.h.getTextColor());
        }
    }
}
