package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class cu extends FrameLayout {
    public org.telegram.ui.ActionBar.f2 a;
    public FrameLayout b;
    public org.telegram.ui.ActionBar.l c;
    public org.telegram.ui.Components.pj0 d;
    public bi.q1 e;
    public int f;
    public final /* synthetic */ du h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cu(du duVar, Context context) {
        super(context);
        this.h = duVar;
    }

    @Override // android.view.View
    public final void setTranslationX(float f10) {
        cu cuVar;
        super.setTranslationX(f10);
        du duVar = this.h;
        cu[] cuVarArr = duVar.f;
        if (duVar.n && (cuVar = cuVarArr[0]) == this) {
            duVar.e.i(Math.abs(cuVar.getTranslationX()) / cuVarArr[0].getMeasuredWidth(), cuVarArr[1].f);
        }
    }
}
