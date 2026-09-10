package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ov extends FrameLayout {
    public org.telegram.ui.ActionBar.p2 a;
    public FrameLayout b;
    public org.telegram.ui.ActionBar.l c;
    public org.telegram.ui.Components.vl0 d;
    public bi.y1 e;
    public int f;
    public final /* synthetic */ pv h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov(pv pvVar, Context context) {
        super(context);
        this.h = pvVar;
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        ov ovVar;
        super.setTranslationX(f7);
        pv pvVar = this.h;
        ov[] ovVarArr = pvVar.f;
        if (pvVar.n && (ovVar = ovVarArr[0]) == this) {
            pvVar.e.j(Math.abs(ovVar.getTranslationX()) / ovVarArr[0].getMeasuredWidth(), ovVarArr[1].f);
        }
    }
}
