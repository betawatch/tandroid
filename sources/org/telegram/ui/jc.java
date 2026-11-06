package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class jc extends fm0 {
    public final /* synthetic */ kc G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc(kc kcVar, Context context, int i7, long j3, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i7, j3, context, f6Var);
        this.G = kcVar;
    }

    @Override // org.telegram.ui.fm0
    public final void b(int i7, boolean z9) {
        super.b(i7, z9);
        kc kcVar = this.G;
        TextView textView = kcVar.d;
        if (textView != null) {
            textView.setTextColor(kcVar.b.h.getTextColor());
        }
    }
}
