package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
