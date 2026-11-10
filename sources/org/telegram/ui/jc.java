package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class jc extends im0 {
    public final /* synthetic */ kc G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc(kc kcVar, Context context, int i7, long j3, org.telegram.ui.ActionBar.h6 h6Var) {
        super(i7, j3, context, h6Var);
        this.G = kcVar;
    }

    @Override // org.telegram.ui.im0
    public final void b(int i7, boolean z9) {
        super.b(i7, z9);
        kc kcVar = this.G;
        TextView textView = kcVar.d;
        if (textView != null) {
            textView.setTextColor(kcVar.b.h.getTextColor());
        }
    }
}
