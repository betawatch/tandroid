package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class ic extends jm0 {
    public final /* synthetic */ jc H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic(jc jcVar, Context context, int i7, long j3, org.telegram.ui.ActionBar.h6 h6Var) {
        super(i7, j3, context, h6Var);
        this.H = jcVar;
    }

    @Override // org.telegram.ui.jm0
    public final void b(int i7, boolean z10) {
        super.b(i7, z10);
        jc jcVar = this.H;
        TextView textView = jcVar.d;
        if (textView != null) {
            textView.setTextColor(jcVar.b.h.getTextColor());
        }
    }
}
