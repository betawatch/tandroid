package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class mv extends FrameLayout {
    public org.telegram.ui.ActionBar.n2 a;
    public FrameLayout b;
    public org.telegram.ui.ActionBar.k c;
    public org.telegram.ui.Components.zl0 d;
    public ai.w0 e;
    public int f;
    public final /* synthetic */ nv h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv(nv nvVar, Context context) {
        super(context);
        this.h = nvVar;
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        mv mvVar;
        super.setTranslationX(f7);
        nv nvVar = this.h;
        mv[] mvVarArr = nvVar.f;
        if (nvVar.n && (mvVar = mvVarArr[0]) == this) {
            nvVar.e.j(Math.abs(mvVar.getTranslationX()) / mvVarArr[0].getMeasuredWidth(), mvVarArr[1].f);
        }
    }
}
