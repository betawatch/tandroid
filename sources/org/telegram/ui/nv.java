package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class nv extends FrameLayout {
    public org.telegram.ui.ActionBar.n2 a;
    public FrameLayout b;
    public org.telegram.ui.ActionBar.k c;
    public org.telegram.ui.Components.ll0 d;
    public bi.o0 e;
    public int f;
    public final /* synthetic */ ov h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nv(ov ovVar, Context context) {
        super(context);
        this.h = ovVar;
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        nv nvVar;
        super.setTranslationX(f7);
        ov ovVar = this.h;
        nv[] nvVarArr = ovVar.f;
        if (ovVar.n && (nvVar = nvVarArr[0]) == this) {
            ovVar.e.j(Math.abs(nvVar.getTranslationX()) / nvVarArr[0].getMeasuredWidth(), nvVarArr[1].f);
        }
    }
}
