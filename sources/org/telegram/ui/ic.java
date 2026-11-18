package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ic extends jm0 {
    public final /* synthetic */ jc H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic(jc jcVar, Context context, int i7, long j3, org.telegram.ui.ActionBar.i6 i6Var) {
        super(i7, j3, context, i6Var);
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
