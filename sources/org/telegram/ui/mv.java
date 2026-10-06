package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
