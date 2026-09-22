package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class nv extends FrameLayout {
    public org.telegram.ui.ActionBar.n2 a;
    public FrameLayout b;
    public org.telegram.ui.ActionBar.k c;
    public org.telegram.ui.Components.yl0 d;
    public ai.w0 e;
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
