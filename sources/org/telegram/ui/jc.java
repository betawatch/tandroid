package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class jc extends hm0 {
    public final /* synthetic */ kc G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc(kc kcVar, Context context, int i7, long j3, org.telegram.ui.ActionBar.g6 g6Var) {
        super(i7, j3, context, g6Var);
        this.G = kcVar;
    }

    @Override // org.telegram.ui.hm0
    public final void b(int i7, boolean z9) {
        super.b(i7, z9);
        kc kcVar = this.G;
        TextView textView = kcVar.d;
        if (textView != null) {
            textView.setTextColor(kcVar.b.h.getTextColor());
        }
    }
}
